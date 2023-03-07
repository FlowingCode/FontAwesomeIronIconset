package com.flowingcode.vaadin.addons.fontawesome.test;

import static org.junit.Assert.fail;
import com.flowingcode.vaadin.addons.fontawesome.FontAwesomeReflect;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

public class EnumTest {

  @Test
  public void testEnumConstants() {
    for (Class<?> clazz : FontAwesomeReflect.getIconTypes()) {

      Object[] values = clazz.getEnumConstants();

      // getEnumConstants return null "when users concoct enum-like classes that don't comply with
      // the enum spec"
      if (values == null) {
        fail(clazz.getSimpleName() + " does not represent an enum class");
      }

      // Check that we have constants (the bigenum compiler removes them in an intermediate step)
      if (values.length == 0) {
        fail(clazz.getSimpleName() + " has no constants");
      }

      // check that we have the same number of constants and constant fields of the enum type
      int size = 0;
      for (Field field : clazz.getDeclaredFields()) {
        boolean isStatic = (field.getModifiers() & Modifier.STATIC) != 0;
        boolean isPublic = (field.getModifiers() & Modifier.PUBLIC) != 0;
        boolean isFinal = (field.getModifiers() & Modifier.PUBLIC) != 0;
        if (field.getType() == clazz && isStatic && isPublic && isFinal) {
          size++;
        }
      }

      if (size != values.length) {
        fail(String.format("%s values returned %s enums, but there are %s fields",
            clazz.getSimpleName(), values.length, size));
      }

      List<Enum<?>> constants = new ArrayList<>();

      // check that every constant in values correspond to a static final field of the enum type
      for (Object e : values) {
        String name = ((Enum<?>) e).name();
        Field field;
        try {
          field = clazz.getField(name);
        } catch (NoSuchFieldException e1) {
          fail(clazz.getSimpleName() + " NoSuchFieldException: " + name);
          return;
        }

        Enum<?> constant;
        try {
          constant = (Enum<?>) field.get(null);
        } catch (IllegalAccessException e1) {
          fail(clazz.getSimpleName() + " IllegalAccessException: " + name);
          return;
        }

        if (e != constant) {
          fail(clazz.getSimpleName()
              + " enum constant from values() is different from static field: " + name);
        }

        constants.add(constant);
      }

      // check that all the constants were returned in values
      constants.sort(Comparator.comparingInt(Enum::ordinal));
      if (!constants.equals(Arrays.asList(values))) {
        fail(clazz.getSimpleName() + " constants and values don't match");
      }

      // check that there are no gaps in the ordinal values
      int ordinal = 0;
      for (Enum<?> e : constants) {
        if (e.ordinal() != ordinal++) {
          fail(clazz.getSimpleName() + " ordinal out of order: " + e.name());
        }
      }
    }
  }
}
