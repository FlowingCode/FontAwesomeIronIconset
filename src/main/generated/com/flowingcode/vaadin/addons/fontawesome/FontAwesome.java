/*-
 * #%L
 * FontAwesome Iron Iconset
 * %%
 * Copyright (C) 2019 - 2020 Flowing Code
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.flowingcode.vaadin.addons.fontawesome;

import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.ComponentEventListener;
import java.util.Locale;

/**
 * FontAwesome 5.15.3 icons.
 * @author Javier Godoy / Flowing Code
 */
@SuppressWarnings({ "squid:S4784", "squid:S00115" })
public final class FontAwesome {

    /**
     * Enumeration of all icons in the FontAwesome regular iconset
     * <p>
     * These instances can be used to create {@link IronIcon} components either by using
     * their {@link #create()} method or by passing them to Icon's constructor.
     *
     * @author Javier Godoy / Flowing Code
     */
    public enum Regular {

        /**
         * The regular address-book icon.See <a href='https://fontawesome.com/icons/address-book?style=regular'>example</a>
         */
        ADDRESS_BOOK,
        /**
         * The regular address-card icon.See <a href='https://fontawesome.com/icons/address-card?style=regular'>example</a>
         */
        ADDRESS_CARD,
        /**
         * The regular angry icon.See <a href='https://fontawesome.com/icons/angry?style=regular'>example</a>
         */
        ANGRY,
        /**
         * The regular arrow-alt-circle-down icon.See <a href='https://fontawesome.com/icons/arrow-alt-circle-down?style=regular'>example</a>
         */
        ARROW_ALT_CIRCLE_DOWN,
        /**
         * The regular arrow-alt-circle-left icon.See <a href='https://fontawesome.com/icons/arrow-alt-circle-left?style=regular'>example</a>
         */
        ARROW_ALT_CIRCLE_LEFT,
        /**
         * The regular arrow-alt-circle-right icon.See <a href='https://fontawesome.com/icons/arrow-alt-circle-right?style=regular'>example</a>
         */
        ARROW_ALT_CIRCLE_RIGHT,
        /**
         * The regular arrow-alt-circle-up icon.See <a href='https://fontawesome.com/icons/arrow-alt-circle-up?style=regular'>example</a>
         */
        ARROW_ALT_CIRCLE_UP,
        /**
         * The regular bell icon.See <a href='https://fontawesome.com/icons/bell?style=regular'>example</a>
         */
        BELL,
        /**
         * The regular bell-slash icon.See <a href='https://fontawesome.com/icons/bell-slash?style=regular'>example</a>
         */
        BELL_SLASH,
        /**
         * The regular bookmark icon.See <a href='https://fontawesome.com/icons/bookmark?style=regular'>example</a>
         */
        BOOKMARK,
        /**
         * The regular building icon.See <a href='https://fontawesome.com/icons/building?style=regular'>example</a>
         */
        BUILDING,
        /**
         * The regular calendar icon.See <a href='https://fontawesome.com/icons/calendar?style=regular'>example</a>
         */
        CALENDAR,
        /**
         * The regular calendar-alt icon.See <a href='https://fontawesome.com/icons/calendar-alt?style=regular'>example</a>
         */
        CALENDAR_ALT,
        /**
         * The regular calendar-check icon.See <a href='https://fontawesome.com/icons/calendar-check?style=regular'>example</a>
         */
        CALENDAR_CHECK,
        /**
         * The regular calendar-minus icon.See <a href='https://fontawesome.com/icons/calendar-minus?style=regular'>example</a>
         */
        CALENDAR_MINUS,
        /**
         * The regular calendar-plus icon.See <a href='https://fontawesome.com/icons/calendar-plus?style=regular'>example</a>
         */
        CALENDAR_PLUS,
        /**
         * The regular calendar-times icon.See <a href='https://fontawesome.com/icons/calendar-times?style=regular'>example</a>
         */
        CALENDAR_TIMES,
        /**
         * The regular caret-square-down icon.See <a href='https://fontawesome.com/icons/caret-square-down?style=regular'>example</a>
         */
        CARET_SQUARE_DOWN,
        /**
         * The regular caret-square-left icon.See <a href='https://fontawesome.com/icons/caret-square-left?style=regular'>example</a>
         */
        CARET_SQUARE_LEFT,
        /**
         * The regular caret-square-right icon.See <a href='https://fontawesome.com/icons/caret-square-right?style=regular'>example</a>
         */
        CARET_SQUARE_RIGHT,
        /**
         * The regular caret-square-up icon.See <a href='https://fontawesome.com/icons/caret-square-up?style=regular'>example</a>
         */
        CARET_SQUARE_UP,
        /**
         * The regular chart-bar icon.See <a href='https://fontawesome.com/icons/chart-bar?style=regular'>example</a>
         */
        CHART_BAR,
        /**
         * The regular check-circle icon.See <a href='https://fontawesome.com/icons/check-circle?style=regular'>example</a>
         */
        CHECK_CIRCLE,
        /**
         * The regular check-square icon.See <a href='https://fontawesome.com/icons/check-square?style=regular'>example</a>
         */
        CHECK_SQUARE,
        /**
         * The regular circle icon.See <a href='https://fontawesome.com/icons/circle?style=regular'>example</a>
         */
        CIRCLE,
        /**
         * The regular clipboard icon.See <a href='https://fontawesome.com/icons/clipboard?style=regular'>example</a>
         */
        CLIPBOARD,
        /**
         * The regular clock icon.See <a href='https://fontawesome.com/icons/clock?style=regular'>example</a>
         */
        CLOCK,
        /**
         * The regular clone icon.See <a href='https://fontawesome.com/icons/clone?style=regular'>example</a>
         */
        CLONE,
        /**
         * The regular closed-captioning icon.See <a href='https://fontawesome.com/icons/closed-captioning?style=regular'>example</a>
         */
        CLOSED_CAPTIONING,
        /**
         * The regular comment icon.See <a href='https://fontawesome.com/icons/comment?style=regular'>example</a>
         */
        COMMENT,
        /**
         * The regular comment-alt icon.See <a href='https://fontawesome.com/icons/comment-alt?style=regular'>example</a>
         */
        COMMENT_ALT,
        /**
         * The regular comment-dots icon.See <a href='https://fontawesome.com/icons/comment-dots?style=regular'>example</a>
         */
        COMMENT_DOTS,
        /**
         * The regular comments icon.See <a href='https://fontawesome.com/icons/comments?style=regular'>example</a>
         */
        COMMENTS,
        /**
         * The regular compass icon.See <a href='https://fontawesome.com/icons/compass?style=regular'>example</a>
         */
        COMPASS,
        /**
         * The regular copy icon.See <a href='https://fontawesome.com/icons/copy?style=regular'>example</a>
         */
        COPY,
        /**
         * The regular copyright icon.See <a href='https://fontawesome.com/icons/copyright?style=regular'>example</a>
         */
        COPYRIGHT,
        /**
         * The regular credit-card icon.See <a href='https://fontawesome.com/icons/credit-card?style=regular'>example</a>
         */
        CREDIT_CARD,
        /**
         * The regular dizzy icon.See <a href='https://fontawesome.com/icons/dizzy?style=regular'>example</a>
         */
        DIZZY,
        /**
         * The regular dot-circle icon.See <a href='https://fontawesome.com/icons/dot-circle?style=regular'>example</a>
         */
        DOT_CIRCLE,
        /**
         * The regular edit icon.See <a href='https://fontawesome.com/icons/edit?style=regular'>example</a>
         */
        EDIT,
        /**
         * The regular envelope icon.See <a href='https://fontawesome.com/icons/envelope?style=regular'>example</a>
         */
        ENVELOPE,
        /**
         * The regular envelope-open icon.See <a href='https://fontawesome.com/icons/envelope-open?style=regular'>example</a>
         */
        ENVELOPE_OPEN,
        /**
         * The regular eye icon.See <a href='https://fontawesome.com/icons/eye?style=regular'>example</a>
         */
        EYE,
        /**
         * The regular eye-slash icon.See <a href='https://fontawesome.com/icons/eye-slash?style=regular'>example</a>
         */
        EYE_SLASH,
        /**
         * The regular file icon.See <a href='https://fontawesome.com/icons/file?style=regular'>example</a>
         */
        FILE,
        /**
         * The regular file-alt icon.See <a href='https://fontawesome.com/icons/file-alt?style=regular'>example</a>
         */
        FILE_ALT,
        /**
         * The regular file-archive icon.See <a href='https://fontawesome.com/icons/file-archive?style=regular'>example</a>
         */
        FILE_ARCHIVE,
        /**
         * The regular file-audio icon.See <a href='https://fontawesome.com/icons/file-audio?style=regular'>example</a>
         */
        FILE_AUDIO,
        /**
         * The regular file-code icon.See <a href='https://fontawesome.com/icons/file-code?style=regular'>example</a>
         */
        FILE_CODE,
        /**
         * The regular file-excel icon.See <a href='https://fontawesome.com/icons/file-excel?style=regular'>example</a>
         */
        FILE_EXCEL,
        /**
         * The regular file-image icon.See <a href='https://fontawesome.com/icons/file-image?style=regular'>example</a>
         */
        FILE_IMAGE,
        /**
         * The regular file-pdf icon.See <a href='https://fontawesome.com/icons/file-pdf?style=regular'>example</a>
         */
        FILE_PDF,
        /**
         * The regular file-powerpoint icon.See <a href='https://fontawesome.com/icons/file-powerpoint?style=regular'>example</a>
         */
        FILE_POWERPOINT,
        /**
         * The regular file-video icon.See <a href='https://fontawesome.com/icons/file-video?style=regular'>example</a>
         */
        FILE_VIDEO,
        /**
         * The regular file-word icon.See <a href='https://fontawesome.com/icons/file-word?style=regular'>example</a>
         */
        FILE_WORD,
        /**
         * The regular flag icon.See <a href='https://fontawesome.com/icons/flag?style=regular'>example</a>
         */
        FLAG,
        /**
         * The regular flushed icon.See <a href='https://fontawesome.com/icons/flushed?style=regular'>example</a>
         */
        FLUSHED,
        /**
         * The regular folder icon.See <a href='https://fontawesome.com/icons/folder?style=regular'>example</a>
         */
        FOLDER,
        /**
         * The regular folder-open icon.See <a href='https://fontawesome.com/icons/folder-open?style=regular'>example</a>
         */
        FOLDER_OPEN,
        /**
         * The regular font-awesome-logo-full icon.See <a href='https://fontawesome.com/icons/font-awesome-logo-full?style=regular'>example</a>
         */
        FONT_AWESOME_LOGO_FULL,
        /**
         * The regular frown icon.See <a href='https://fontawesome.com/icons/frown?style=regular'>example</a>
         */
        FROWN,
        /**
         * The regular frown-open icon.See <a href='https://fontawesome.com/icons/frown-open?style=regular'>example</a>
         */
        FROWN_OPEN,
        /**
         * The regular futbol icon.See <a href='https://fontawesome.com/icons/futbol?style=regular'>example</a>
         */
        FUTBOL,
        /**
         * The regular gem icon.See <a href='https://fontawesome.com/icons/gem?style=regular'>example</a>
         */
        GEM,
        /**
         * The regular grimace icon.See <a href='https://fontawesome.com/icons/grimace?style=regular'>example</a>
         */
        GRIMACE,
        /**
         * The regular grin icon.See <a href='https://fontawesome.com/icons/grin?style=regular'>example</a>
         */
        GRIN,
        /**
         * The regular grin-alt icon.See <a href='https://fontawesome.com/icons/grin-alt?style=regular'>example</a>
         */
        GRIN_ALT,
        /**
         * The regular grin-beam icon.See <a href='https://fontawesome.com/icons/grin-beam?style=regular'>example</a>
         */
        GRIN_BEAM,
        /**
         * The regular grin-beam-sweat icon.See <a href='https://fontawesome.com/icons/grin-beam-sweat?style=regular'>example</a>
         */
        GRIN_BEAM_SWEAT,
        /**
         * The regular grin-hearts icon.See <a href='https://fontawesome.com/icons/grin-hearts?style=regular'>example</a>
         */
        GRIN_HEARTS,
        /**
         * The regular grin-squint icon.See <a href='https://fontawesome.com/icons/grin-squint?style=regular'>example</a>
         */
        GRIN_SQUINT,
        /**
         * The regular grin-squint-tears icon.See <a href='https://fontawesome.com/icons/grin-squint-tears?style=regular'>example</a>
         */
        GRIN_SQUINT_TEARS,
        /**
         * The regular grin-stars icon.See <a href='https://fontawesome.com/icons/grin-stars?style=regular'>example</a>
         */
        GRIN_STARS,
        /**
         * The regular grin-tears icon.See <a href='https://fontawesome.com/icons/grin-tears?style=regular'>example</a>
         */
        GRIN_TEARS,
        /**
         * The regular grin-tongue icon.See <a href='https://fontawesome.com/icons/grin-tongue?style=regular'>example</a>
         */
        GRIN_TONGUE,
        /**
         * The regular grin-tongue-squint icon.See <a href='https://fontawesome.com/icons/grin-tongue-squint?style=regular'>example</a>
         */
        GRIN_TONGUE_SQUINT,
        /**
         * The regular grin-tongue-wink icon.See <a href='https://fontawesome.com/icons/grin-tongue-wink?style=regular'>example</a>
         */
        GRIN_TONGUE_WINK,
        /**
         * The regular grin-wink icon.See <a href='https://fontawesome.com/icons/grin-wink?style=regular'>example</a>
         */
        GRIN_WINK,
        /**
         * The regular hand-lizard icon.See <a href='https://fontawesome.com/icons/hand-lizard?style=regular'>example</a>
         */
        HAND_LIZARD,
        /**
         * The regular hand-paper icon.See <a href='https://fontawesome.com/icons/hand-paper?style=regular'>example</a>
         */
        HAND_PAPER,
        /**
         * The regular hand-peace icon.See <a href='https://fontawesome.com/icons/hand-peace?style=regular'>example</a>
         */
        HAND_PEACE,
        /**
         * The regular hand-point-down icon.See <a href='https://fontawesome.com/icons/hand-point-down?style=regular'>example</a>
         */
        HAND_POINT_DOWN,
        /**
         * The regular hand-point-left icon.See <a href='https://fontawesome.com/icons/hand-point-left?style=regular'>example</a>
         */
        HAND_POINT_LEFT,
        /**
         * The regular hand-point-right icon.See <a href='https://fontawesome.com/icons/hand-point-right?style=regular'>example</a>
         */
        HAND_POINT_RIGHT,
        /**
         * The regular hand-point-up icon.See <a href='https://fontawesome.com/icons/hand-point-up?style=regular'>example</a>
         */
        HAND_POINT_UP,
        /**
         * The regular hand-pointer icon.See <a href='https://fontawesome.com/icons/hand-pointer?style=regular'>example</a>
         */
        HAND_POINTER,
        /**
         * The regular hand-rock icon.See <a href='https://fontawesome.com/icons/hand-rock?style=regular'>example</a>
         */
        HAND_ROCK,
        /**
         * The regular hand-scissors icon.See <a href='https://fontawesome.com/icons/hand-scissors?style=regular'>example</a>
         */
        HAND_SCISSORS,
        /**
         * The regular hand-spock icon.See <a href='https://fontawesome.com/icons/hand-spock?style=regular'>example</a>
         */
        HAND_SPOCK,
        /**
         * The regular handshake icon.See <a href='https://fontawesome.com/icons/handshake?style=regular'>example</a>
         */
        HANDSHAKE,
        /**
         * The regular hdd icon.See <a href='https://fontawesome.com/icons/hdd?style=regular'>example</a>
         */
        HDD,
        /**
         * The regular heart icon.See <a href='https://fontawesome.com/icons/heart?style=regular'>example</a>
         */
        HEART,
        /**
         * The regular hospital icon.See <a href='https://fontawesome.com/icons/hospital?style=regular'>example</a>
         */
        HOSPITAL,
        /**
         * The regular hourglass icon.See <a href='https://fontawesome.com/icons/hourglass?style=regular'>example</a>
         */
        HOURGLASS,
        /**
         * The regular id-badge icon.See <a href='https://fontawesome.com/icons/id-badge?style=regular'>example</a>
         */
        ID_BADGE,
        /**
         * The regular id-card icon.See <a href='https://fontawesome.com/icons/id-card?style=regular'>example</a>
         */
        ID_CARD,
        /**
         * The regular image icon.See <a href='https://fontawesome.com/icons/image?style=regular'>example</a>
         */
        IMAGE,
        /**
         * The regular images icon.See <a href='https://fontawesome.com/icons/images?style=regular'>example</a>
         */
        IMAGES,
        /**
         * The regular keyboard icon.See <a href='https://fontawesome.com/icons/keyboard?style=regular'>example</a>
         */
        KEYBOARD,
        /**
         * The regular kiss icon.See <a href='https://fontawesome.com/icons/kiss?style=regular'>example</a>
         */
        KISS,
        /**
         * The regular kiss-beam icon.See <a href='https://fontawesome.com/icons/kiss-beam?style=regular'>example</a>
         */
        KISS_BEAM,
        /**
         * The regular kiss-wink-heart icon.See <a href='https://fontawesome.com/icons/kiss-wink-heart?style=regular'>example</a>
         */
        KISS_WINK_HEART,
        /**
         * The regular laugh icon.See <a href='https://fontawesome.com/icons/laugh?style=regular'>example</a>
         */
        LAUGH,
        /**
         * The regular laugh-beam icon.See <a href='https://fontawesome.com/icons/laugh-beam?style=regular'>example</a>
         */
        LAUGH_BEAM,
        /**
         * The regular laugh-squint icon.See <a href='https://fontawesome.com/icons/laugh-squint?style=regular'>example</a>
         */
        LAUGH_SQUINT,
        /**
         * The regular laugh-wink icon.See <a href='https://fontawesome.com/icons/laugh-wink?style=regular'>example</a>
         */
        LAUGH_WINK,
        /**
         * The regular lemon icon.See <a href='https://fontawesome.com/icons/lemon?style=regular'>example</a>
         */
        LEMON,
        /**
         * The regular life-ring icon.See <a href='https://fontawesome.com/icons/life-ring?style=regular'>example</a>
         */
        LIFE_RING,
        /**
         * The regular lightbulb icon.See <a href='https://fontawesome.com/icons/lightbulb?style=regular'>example</a>
         */
        LIGHTBULB,
        /**
         * The regular list-alt icon.See <a href='https://fontawesome.com/icons/list-alt?style=regular'>example</a>
         */
        LIST_ALT,
        /**
         * The regular map icon.See <a href='https://fontawesome.com/icons/map?style=regular'>example</a>
         */
        MAP,
        /**
         * The regular meh icon.See <a href='https://fontawesome.com/icons/meh?style=regular'>example</a>
         */
        MEH,
        /**
         * The regular meh-blank icon.See <a href='https://fontawesome.com/icons/meh-blank?style=regular'>example</a>
         */
        MEH_BLANK,
        /**
         * The regular meh-rolling-eyes icon.See <a href='https://fontawesome.com/icons/meh-rolling-eyes?style=regular'>example</a>
         */
        MEH_ROLLING_EYES,
        /**
         * The regular minus-square icon.See <a href='https://fontawesome.com/icons/minus-square?style=regular'>example</a>
         */
        MINUS_SQUARE,
        /**
         * The regular money-bill-alt icon.See <a href='https://fontawesome.com/icons/money-bill-alt?style=regular'>example</a>
         */
        MONEY_BILL_ALT,
        /**
         * The regular moon icon.See <a href='https://fontawesome.com/icons/moon?style=regular'>example</a>
         */
        MOON,
        /**
         * The regular newspaper icon.See <a href='https://fontawesome.com/icons/newspaper?style=regular'>example</a>
         */
        NEWSPAPER,
        /**
         * The regular object-group icon.See <a href='https://fontawesome.com/icons/object-group?style=regular'>example</a>
         */
        OBJECT_GROUP,
        /**
         * The regular object-ungroup icon.See <a href='https://fontawesome.com/icons/object-ungroup?style=regular'>example</a>
         */
        OBJECT_UNGROUP,
        /**
         * The regular paper-plane icon.See <a href='https://fontawesome.com/icons/paper-plane?style=regular'>example</a>
         */
        PAPER_PLANE,
        /**
         * The regular pause-circle icon.See <a href='https://fontawesome.com/icons/pause-circle?style=regular'>example</a>
         */
        PAUSE_CIRCLE,
        /**
         * The regular play-circle icon.See <a href='https://fontawesome.com/icons/play-circle?style=regular'>example</a>
         */
        PLAY_CIRCLE,
        /**
         * The regular plus-square icon.See <a href='https://fontawesome.com/icons/plus-square?style=regular'>example</a>
         */
        PLUS_SQUARE,
        /**
         * The regular question-circle icon.See <a href='https://fontawesome.com/icons/question-circle?style=regular'>example</a>
         */
        QUESTION_CIRCLE,
        /**
         * The regular registered icon.See <a href='https://fontawesome.com/icons/registered?style=regular'>example</a>
         */
        REGISTERED,
        /**
         * The regular sad-cry icon.See <a href='https://fontawesome.com/icons/sad-cry?style=regular'>example</a>
         */
        SAD_CRY,
        /**
         * The regular sad-tear icon.See <a href='https://fontawesome.com/icons/sad-tear?style=regular'>example</a>
         */
        SAD_TEAR,
        /**
         * The regular save icon.See <a href='https://fontawesome.com/icons/save?style=regular'>example</a>
         */
        SAVE,
        /**
         * The regular share-square icon.See <a href='https://fontawesome.com/icons/share-square?style=regular'>example</a>
         */
        SHARE_SQUARE,
        /**
         * The regular smile icon.See <a href='https://fontawesome.com/icons/smile?style=regular'>example</a>
         */
        SMILE,
        /**
         * The regular smile-beam icon.See <a href='https://fontawesome.com/icons/smile-beam?style=regular'>example</a>
         */
        SMILE_BEAM,
        /**
         * The regular smile-wink icon.See <a href='https://fontawesome.com/icons/smile-wink?style=regular'>example</a>
         */
        SMILE_WINK,
        /**
         * The regular snowflake icon.See <a href='https://fontawesome.com/icons/snowflake?style=regular'>example</a>
         */
        SNOWFLAKE,
        /**
         * The regular square icon.See <a href='https://fontawesome.com/icons/square?style=regular'>example</a>
         */
        SQUARE,
        /**
         * The regular star icon.See <a href='https://fontawesome.com/icons/star?style=regular'>example</a>
         */
        STAR,
        /**
         * The regular star-half icon.See <a href='https://fontawesome.com/icons/star-half?style=regular'>example</a>
         */
        STAR_HALF,
        /**
         * The regular sticky-note icon.See <a href='https://fontawesome.com/icons/sticky-note?style=regular'>example</a>
         */
        STICKY_NOTE,
        /**
         * The regular stop-circle icon.See <a href='https://fontawesome.com/icons/stop-circle?style=regular'>example</a>
         */
        STOP_CIRCLE,
        /**
         * The regular sun icon.See <a href='https://fontawesome.com/icons/sun?style=regular'>example</a>
         */
        SUN,
        /**
         * The regular surprise icon.See <a href='https://fontawesome.com/icons/surprise?style=regular'>example</a>
         */
        SURPRISE,
        /**
         * The regular thumbs-down icon.See <a href='https://fontawesome.com/icons/thumbs-down?style=regular'>example</a>
         */
        THUMBS_DOWN,
        /**
         * The regular thumbs-up icon.See <a href='https://fontawesome.com/icons/thumbs-up?style=regular'>example</a>
         */
        THUMBS_UP,
        /**
         * The regular times-circle icon.See <a href='https://fontawesome.com/icons/times-circle?style=regular'>example</a>
         */
        TIMES_CIRCLE,
        /**
         * The regular tired icon.See <a href='https://fontawesome.com/icons/tired?style=regular'>example</a>
         */
        TIRED,
        /**
         * The regular trash-alt icon.See <a href='https://fontawesome.com/icons/trash-alt?style=regular'>example</a>
         */
        TRASH_ALT,
        /**
         * The regular user icon.See <a href='https://fontawesome.com/icons/user?style=regular'>example</a>
         */
        USER,
        /**
         * The regular user-circle icon.See <a href='https://fontawesome.com/icons/user-circle?style=regular'>example</a>
         */
        USER_CIRCLE,
        /**
         * The regular window-close icon.See <a href='https://fontawesome.com/icons/window-close?style=regular'>example</a>
         */
        WINDOW_CLOSE,
        /**
         * The regular window-maximize icon.See <a href='https://fontawesome.com/icons/window-maximize?style=regular'>example</a>
         */
        WINDOW_MAXIMIZE,
        /**
         * The regular window-minimize icon.See <a href='https://fontawesome.com/icons/window-minimize?style=regular'>example</a>
         */
        WINDOW_MINIMIZE,
        /**
         * The regular window-restore icon.See <a href='https://fontawesome.com/icons/window-restore?style=regular'>example</a>
         */
        WINDOW_RESTORE;

        /**
         * The Iconset name, i.e. {@code "far"}."
         */
        public static final String ICONSET = "far";

        /**
         * Return the icon name.
         * @return the icon name, i.e. {@code "far:name"}..
         */
        public String getIconName() {
            return ICONSET+':'+getIconPart();
        }

        private String getIconPart() {
            return this.name().toLowerCase(Locale.ENGLISH).replace('_', '-');
        }

        /**
         * Create a new {@link IronIcon} instance with the icon determined by the name.
         * @return a new instance of {@link IronIcon} component
         */
        public Icon create() {
            return new Icon(this.getIconPart());
        }

        /**
         * Create a new {@link IronIcon} instance with the icon determined by the name and a listener for click events.
         * @param listener the event listener for click events
         * @return a new instance of {@link IronIcon} component
         */
        public Icon create(ComponentEventListener<ClickEvent<IronIcon>> listener) {
            Icon icon = create();
            icon.addClickListener(listener);
            return icon;
        }

        /**
         * Server side component for {@code Regular}
         */
        @JsModule("./font-awesome-iron-iconset/far.js")
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "2.2.0")
        @SuppressWarnings("serial")
        public static final class Icon extends IronIcon implements ClickNotifier<IronIcon> {

             Icon(String icon) {
                super(ICONSET, icon);
            }
        }
    }

    /**
     * Enumeration of all icons in the FontAwesome solid iconset
     * <p>
     * These instances can be used to create {@link IronIcon} components either by using
     * their {@link #create()} method or by passing them to Icon's constructor.
     *
     * @author Javier Godoy / Flowing Code
     */
    public enum Solid {

        /**
         * The solid ad icon.See <a href='https://fontawesome.com/icons/ad?style=solid'>example</a>
         */
        AD,
        /**
         * The solid address-book icon.See <a href='https://fontawesome.com/icons/address-book?style=solid'>example</a>
         */
        ADDRESS_BOOK,
        /**
         * The solid address-card icon.See <a href='https://fontawesome.com/icons/address-card?style=solid'>example</a>
         */
        ADDRESS_CARD,
        /**
         * The solid adjust icon.See <a href='https://fontawesome.com/icons/adjust?style=solid'>example</a>
         */
        ADJUST,
        /**
         * The solid air-freshener icon.See <a href='https://fontawesome.com/icons/air-freshener?style=solid'>example</a>
         */
        AIR_FRESHENER,
        /**
         * The solid align-center icon.See <a href='https://fontawesome.com/icons/align-center?style=solid'>example</a>
         */
        ALIGN_CENTER,
        /**
         * The solid align-justify icon.See <a href='https://fontawesome.com/icons/align-justify?style=solid'>example</a>
         */
        ALIGN_JUSTIFY,
        /**
         * The solid align-left icon.See <a href='https://fontawesome.com/icons/align-left?style=solid'>example</a>
         */
        ALIGN_LEFT,
        /**
         * The solid align-right icon.See <a href='https://fontawesome.com/icons/align-right?style=solid'>example</a>
         */
        ALIGN_RIGHT,
        /**
         * The solid allergies icon.See <a href='https://fontawesome.com/icons/allergies?style=solid'>example</a>
         */
        ALLERGIES,
        /**
         * The solid ambulance icon.See <a href='https://fontawesome.com/icons/ambulance?style=solid'>example</a>
         */
        AMBULANCE,
        /**
         * The solid american-sign-language-interpreting icon.See <a href='https://fontawesome.com/icons/american-sign-language-interpreting?style=solid'>example</a>
         */
        AMERICAN_SIGN_LANGUAGE_INTERPRETING,
        /**
         * The solid anchor icon.See <a href='https://fontawesome.com/icons/anchor?style=solid'>example</a>
         */
        ANCHOR,
        /**
         * The solid angle-double-down icon.See <a href='https://fontawesome.com/icons/angle-double-down?style=solid'>example</a>
         */
        ANGLE_DOUBLE_DOWN,
        /**
         * The solid angle-double-left icon.See <a href='https://fontawesome.com/icons/angle-double-left?style=solid'>example</a>
         */
        ANGLE_DOUBLE_LEFT,
        /**
         * The solid angle-double-right icon.See <a href='https://fontawesome.com/icons/angle-double-right?style=solid'>example</a>
         */
        ANGLE_DOUBLE_RIGHT,
        /**
         * The solid angle-double-up icon.See <a href='https://fontawesome.com/icons/angle-double-up?style=solid'>example</a>
         */
        ANGLE_DOUBLE_UP,
        /**
         * The solid angle-down icon.See <a href='https://fontawesome.com/icons/angle-down?style=solid'>example</a>
         */
        ANGLE_DOWN,
        /**
         * The solid angle-left icon.See <a href='https://fontawesome.com/icons/angle-left?style=solid'>example</a>
         */
        ANGLE_LEFT,
        /**
         * The solid angle-right icon.See <a href='https://fontawesome.com/icons/angle-right?style=solid'>example</a>
         */
        ANGLE_RIGHT,
        /**
         * The solid angle-up icon.See <a href='https://fontawesome.com/icons/angle-up?style=solid'>example</a>
         */
        ANGLE_UP,
        /**
         * The solid angry icon.See <a href='https://fontawesome.com/icons/angry?style=solid'>example</a>
         */
        ANGRY,
        /**
         * The solid ankh icon.See <a href='https://fontawesome.com/icons/ankh?style=solid'>example</a>
         */
        ANKH,
        /**
         * The solid apple-alt icon.See <a href='https://fontawesome.com/icons/apple-alt?style=solid'>example</a>
         */
        APPLE_ALT,
        /**
         * The solid archive icon.See <a href='https://fontawesome.com/icons/archive?style=solid'>example</a>
         */
        ARCHIVE,
        /**
         * The solid archway icon.See <a href='https://fontawesome.com/icons/archway?style=solid'>example</a>
         */
        ARCHWAY,
        /**
         * The solid arrow-alt-circle-down icon.See <a href='https://fontawesome.com/icons/arrow-alt-circle-down?style=solid'>example</a>
         */
        ARROW_ALT_CIRCLE_DOWN,
        /**
         * The solid arrow-alt-circle-left icon.See <a href='https://fontawesome.com/icons/arrow-alt-circle-left?style=solid'>example</a>
         */
        ARROW_ALT_CIRCLE_LEFT,
        /**
         * The solid arrow-alt-circle-right icon.See <a href='https://fontawesome.com/icons/arrow-alt-circle-right?style=solid'>example</a>
         */
        ARROW_ALT_CIRCLE_RIGHT,
        /**
         * The solid arrow-alt-circle-up icon.See <a href='https://fontawesome.com/icons/arrow-alt-circle-up?style=solid'>example</a>
         */
        ARROW_ALT_CIRCLE_UP,
        /**
         * The solid arrow-circle-down icon.See <a href='https://fontawesome.com/icons/arrow-circle-down?style=solid'>example</a>
         */
        ARROW_CIRCLE_DOWN,
        /**
         * The solid arrow-circle-left icon.See <a href='https://fontawesome.com/icons/arrow-circle-left?style=solid'>example</a>
         */
        ARROW_CIRCLE_LEFT,
        /**
         * The solid arrow-circle-right icon.See <a href='https://fontawesome.com/icons/arrow-circle-right?style=solid'>example</a>
         */
        ARROW_CIRCLE_RIGHT,
        /**
         * The solid arrow-circle-up icon.See <a href='https://fontawesome.com/icons/arrow-circle-up?style=solid'>example</a>
         */
        ARROW_CIRCLE_UP,
        /**
         * The solid arrow-down icon.See <a href='https://fontawesome.com/icons/arrow-down?style=solid'>example</a>
         */
        ARROW_DOWN,
        /**
         * The solid arrow-left icon.See <a href='https://fontawesome.com/icons/arrow-left?style=solid'>example</a>
         */
        ARROW_LEFT,
        /**
         * The solid arrow-right icon.See <a href='https://fontawesome.com/icons/arrow-right?style=solid'>example</a>
         */
        ARROW_RIGHT,
        /**
         * The solid arrow-up icon.See <a href='https://fontawesome.com/icons/arrow-up?style=solid'>example</a>
         */
        ARROW_UP,
        /**
         * The solid arrows-alt icon.See <a href='https://fontawesome.com/icons/arrows-alt?style=solid'>example</a>
         */
        ARROWS_ALT,
        /**
         * The solid arrows-alt-h icon.See <a href='https://fontawesome.com/icons/arrows-alt-h?style=solid'>example</a>
         */
        ARROWS_ALT_H,
        /**
         * The solid arrows-alt-v icon.See <a href='https://fontawesome.com/icons/arrows-alt-v?style=solid'>example</a>
         */
        ARROWS_ALT_V,
        /**
         * The solid assistive-listening-systems icon.See <a href='https://fontawesome.com/icons/assistive-listening-systems?style=solid'>example</a>
         */
        ASSISTIVE_LISTENING_SYSTEMS,
        /**
         * The solid asterisk icon.See <a href='https://fontawesome.com/icons/asterisk?style=solid'>example</a>
         */
        ASTERISK,
        /**
         * The solid at icon.See <a href='https://fontawesome.com/icons/at?style=solid'>example</a>
         */
        AT,
        /**
         * The solid atlas icon.See <a href='https://fontawesome.com/icons/atlas?style=solid'>example</a>
         */
        ATLAS,
        /**
         * The solid atom icon.See <a href='https://fontawesome.com/icons/atom?style=solid'>example</a>
         */
        ATOM,
        /**
         * The solid audio-description icon.See <a href='https://fontawesome.com/icons/audio-description?style=solid'>example</a>
         */
        AUDIO_DESCRIPTION,
        /**
         * The solid award icon.See <a href='https://fontawesome.com/icons/award?style=solid'>example</a>
         */
        AWARD,
        /**
         * The solid baby icon.See <a href='https://fontawesome.com/icons/baby?style=solid'>example</a>
         */
        BABY,
        /**
         * The solid baby-carriage icon.See <a href='https://fontawesome.com/icons/baby-carriage?style=solid'>example</a>
         */
        BABY_CARRIAGE,
        /**
         * The solid backspace icon.See <a href='https://fontawesome.com/icons/backspace?style=solid'>example</a>
         */
        BACKSPACE,
        /**
         * The solid backward icon.See <a href='https://fontawesome.com/icons/backward?style=solid'>example</a>
         */
        BACKWARD,
        /**
         * The solid bacon icon.See <a href='https://fontawesome.com/icons/bacon?style=solid'>example</a>
         */
        BACON,
        /**
         * The solid bacteria icon.See <a href='https://fontawesome.com/icons/bacteria?style=solid'>example</a>
         */
        BACTERIA,
        /**
         * The solid bacterium icon.See <a href='https://fontawesome.com/icons/bacterium?style=solid'>example</a>
         */
        BACTERIUM,
        /**
         * The solid bahai icon.See <a href='https://fontawesome.com/icons/bahai?style=solid'>example</a>
         */
        BAHAI,
        /**
         * The solid balance-scale icon.See <a href='https://fontawesome.com/icons/balance-scale?style=solid'>example</a>
         */
        BALANCE_SCALE,
        /**
         * The solid balance-scale-left icon.See <a href='https://fontawesome.com/icons/balance-scale-left?style=solid'>example</a>
         */
        BALANCE_SCALE_LEFT,
        /**
         * The solid balance-scale-right icon.See <a href='https://fontawesome.com/icons/balance-scale-right?style=solid'>example</a>
         */
        BALANCE_SCALE_RIGHT,
        /**
         * The solid ban icon.See <a href='https://fontawesome.com/icons/ban?style=solid'>example</a>
         */
        BAN,
        /**
         * The solid band-aid icon.See <a href='https://fontawesome.com/icons/band-aid?style=solid'>example</a>
         */
        BAND_AID,
        /**
         * The solid barcode icon.See <a href='https://fontawesome.com/icons/barcode?style=solid'>example</a>
         */
        BARCODE,
        /**
         * The solid bars icon.See <a href='https://fontawesome.com/icons/bars?style=solid'>example</a>
         */
        BARS,
        /**
         * The solid baseball-ball icon.See <a href='https://fontawesome.com/icons/baseball-ball?style=solid'>example</a>
         */
        BASEBALL_BALL,
        /**
         * The solid basketball-ball icon.See <a href='https://fontawesome.com/icons/basketball-ball?style=solid'>example</a>
         */
        BASKETBALL_BALL,
        /**
         * The solid bath icon.See <a href='https://fontawesome.com/icons/bath?style=solid'>example</a>
         */
        BATH,
        /**
         * The solid battery-empty icon.See <a href='https://fontawesome.com/icons/battery-empty?style=solid'>example</a>
         */
        BATTERY_EMPTY,
        /**
         * The solid battery-full icon.See <a href='https://fontawesome.com/icons/battery-full?style=solid'>example</a>
         */
        BATTERY_FULL,
        /**
         * The solid battery-half icon.See <a href='https://fontawesome.com/icons/battery-half?style=solid'>example</a>
         */
        BATTERY_HALF,
        /**
         * The solid battery-quarter icon.See <a href='https://fontawesome.com/icons/battery-quarter?style=solid'>example</a>
         */
        BATTERY_QUARTER,
        /**
         * The solid battery-three-quarters icon.See <a href='https://fontawesome.com/icons/battery-three-quarters?style=solid'>example</a>
         */
        BATTERY_THREE_QUARTERS,
        /**
         * The solid bed icon.See <a href='https://fontawesome.com/icons/bed?style=solid'>example</a>
         */
        BED,
        /**
         * The solid beer icon.See <a href='https://fontawesome.com/icons/beer?style=solid'>example</a>
         */
        BEER,
        /**
         * The solid bell icon.See <a href='https://fontawesome.com/icons/bell?style=solid'>example</a>
         */
        BELL,
        /**
         * The solid bell-slash icon.See <a href='https://fontawesome.com/icons/bell-slash?style=solid'>example</a>
         */
        BELL_SLASH,
        /**
         * The solid bezier-curve icon.See <a href='https://fontawesome.com/icons/bezier-curve?style=solid'>example</a>
         */
        BEZIER_CURVE,
        /**
         * The solid bible icon.See <a href='https://fontawesome.com/icons/bible?style=solid'>example</a>
         */
        BIBLE,
        /**
         * The solid bicycle icon.See <a href='https://fontawesome.com/icons/bicycle?style=solid'>example</a>
         */
        BICYCLE,
        /**
         * The solid biking icon.See <a href='https://fontawesome.com/icons/biking?style=solid'>example</a>
         */
        BIKING,
        /**
         * The solid binoculars icon.See <a href='https://fontawesome.com/icons/binoculars?style=solid'>example</a>
         */
        BINOCULARS,
        /**
         * The solid biohazard icon.See <a href='https://fontawesome.com/icons/biohazard?style=solid'>example</a>
         */
        BIOHAZARD,
        /**
         * The solid birthday-cake icon.See <a href='https://fontawesome.com/icons/birthday-cake?style=solid'>example</a>
         */
        BIRTHDAY_CAKE,
        /**
         * The solid blender icon.See <a href='https://fontawesome.com/icons/blender?style=solid'>example</a>
         */
        BLENDER,
        /**
         * The solid blender-phone icon.See <a href='https://fontawesome.com/icons/blender-phone?style=solid'>example</a>
         */
        BLENDER_PHONE,
        /**
         * The solid blind icon.See <a href='https://fontawesome.com/icons/blind?style=solid'>example</a>
         */
        BLIND,
        /**
         * The solid blog icon.See <a href='https://fontawesome.com/icons/blog?style=solid'>example</a>
         */
        BLOG,
        /**
         * The solid bold icon.See <a href='https://fontawesome.com/icons/bold?style=solid'>example</a>
         */
        BOLD,
        /**
         * The solid bolt icon.See <a href='https://fontawesome.com/icons/bolt?style=solid'>example</a>
         */
        BOLT,
        /**
         * The solid bomb icon.See <a href='https://fontawesome.com/icons/bomb?style=solid'>example</a>
         */
        BOMB,
        /**
         * The solid bone icon.See <a href='https://fontawesome.com/icons/bone?style=solid'>example</a>
         */
        BONE,
        /**
         * The solid bong icon.See <a href='https://fontawesome.com/icons/bong?style=solid'>example</a>
         */
        BONG,
        /**
         * The solid book icon.See <a href='https://fontawesome.com/icons/book?style=solid'>example</a>
         */
        BOOK,
        /**
         * The solid book-dead icon.See <a href='https://fontawesome.com/icons/book-dead?style=solid'>example</a>
         */
        BOOK_DEAD,
        /**
         * The solid book-medical icon.See <a href='https://fontawesome.com/icons/book-medical?style=solid'>example</a>
         */
        BOOK_MEDICAL,
        /**
         * The solid book-open icon.See <a href='https://fontawesome.com/icons/book-open?style=solid'>example</a>
         */
        BOOK_OPEN,
        /**
         * The solid book-reader icon.See <a href='https://fontawesome.com/icons/book-reader?style=solid'>example</a>
         */
        BOOK_READER,
        /**
         * The solid bookmark icon.See <a href='https://fontawesome.com/icons/bookmark?style=solid'>example</a>
         */
        BOOKMARK,
        /**
         * The solid border-all icon.See <a href='https://fontawesome.com/icons/border-all?style=solid'>example</a>
         */
        BORDER_ALL,
        /**
         * The solid border-none icon.See <a href='https://fontawesome.com/icons/border-none?style=solid'>example</a>
         */
        BORDER_NONE,
        /**
         * The solid border-style icon.See <a href='https://fontawesome.com/icons/border-style?style=solid'>example</a>
         */
        BORDER_STYLE,
        /**
         * The solid bowling-ball icon.See <a href='https://fontawesome.com/icons/bowling-ball?style=solid'>example</a>
         */
        BOWLING_BALL,
        /**
         * The solid box icon.See <a href='https://fontawesome.com/icons/box?style=solid'>example</a>
         */
        BOX,
        /**
         * The solid box-open icon.See <a href='https://fontawesome.com/icons/box-open?style=solid'>example</a>
         */
        BOX_OPEN,
        /**
         * The solid box-tissue icon.See <a href='https://fontawesome.com/icons/box-tissue?style=solid'>example</a>
         */
        BOX_TISSUE,
        /**
         * The solid boxes icon.See <a href='https://fontawesome.com/icons/boxes?style=solid'>example</a>
         */
        BOXES,
        /**
         * The solid braille icon.See <a href='https://fontawesome.com/icons/braille?style=solid'>example</a>
         */
        BRAILLE,
        /**
         * The solid brain icon.See <a href='https://fontawesome.com/icons/brain?style=solid'>example</a>
         */
        BRAIN,
        /**
         * The solid bread-slice icon.See <a href='https://fontawesome.com/icons/bread-slice?style=solid'>example</a>
         */
        BREAD_SLICE,
        /**
         * The solid briefcase icon.See <a href='https://fontawesome.com/icons/briefcase?style=solid'>example</a>
         */
        BRIEFCASE,
        /**
         * The solid briefcase-medical icon.See <a href='https://fontawesome.com/icons/briefcase-medical?style=solid'>example</a>
         */
        BRIEFCASE_MEDICAL,
        /**
         * The solid broadcast-tower icon.See <a href='https://fontawesome.com/icons/broadcast-tower?style=solid'>example</a>
         */
        BROADCAST_TOWER,
        /**
         * The solid broom icon.See <a href='https://fontawesome.com/icons/broom?style=solid'>example</a>
         */
        BROOM,
        /**
         * The solid brush icon.See <a href='https://fontawesome.com/icons/brush?style=solid'>example</a>
         */
        BRUSH,
        /**
         * The solid bug icon.See <a href='https://fontawesome.com/icons/bug?style=solid'>example</a>
         */
        BUG,
        /**
         * The solid building icon.See <a href='https://fontawesome.com/icons/building?style=solid'>example</a>
         */
        BUILDING,
        /**
         * The solid bullhorn icon.See <a href='https://fontawesome.com/icons/bullhorn?style=solid'>example</a>
         */
        BULLHORN,
        /**
         * The solid bullseye icon.See <a href='https://fontawesome.com/icons/bullseye?style=solid'>example</a>
         */
        BULLSEYE,
        /**
         * The solid burn icon.See <a href='https://fontawesome.com/icons/burn?style=solid'>example</a>
         */
        BURN,
        /**
         * The solid bus icon.See <a href='https://fontawesome.com/icons/bus?style=solid'>example</a>
         */
        BUS,
        /**
         * The solid bus-alt icon.See <a href='https://fontawesome.com/icons/bus-alt?style=solid'>example</a>
         */
        BUS_ALT,
        /**
         * The solid business-time icon.See <a href='https://fontawesome.com/icons/business-time?style=solid'>example</a>
         */
        BUSINESS_TIME,
        /**
         * The solid calculator icon.See <a href='https://fontawesome.com/icons/calculator?style=solid'>example</a>
         */
        CALCULATOR,
        /**
         * The solid calendar icon.See <a href='https://fontawesome.com/icons/calendar?style=solid'>example</a>
         */
        CALENDAR,
        /**
         * The solid calendar-alt icon.See <a href='https://fontawesome.com/icons/calendar-alt?style=solid'>example</a>
         */
        CALENDAR_ALT,
        /**
         * The solid calendar-check icon.See <a href='https://fontawesome.com/icons/calendar-check?style=solid'>example</a>
         */
        CALENDAR_CHECK,
        /**
         * The solid calendar-day icon.See <a href='https://fontawesome.com/icons/calendar-day?style=solid'>example</a>
         */
        CALENDAR_DAY,
        /**
         * The solid calendar-minus icon.See <a href='https://fontawesome.com/icons/calendar-minus?style=solid'>example</a>
         */
        CALENDAR_MINUS,
        /**
         * The solid calendar-plus icon.See <a href='https://fontawesome.com/icons/calendar-plus?style=solid'>example</a>
         */
        CALENDAR_PLUS,
        /**
         * The solid calendar-times icon.See <a href='https://fontawesome.com/icons/calendar-times?style=solid'>example</a>
         */
        CALENDAR_TIMES,
        /**
         * The solid calendar-week icon.See <a href='https://fontawesome.com/icons/calendar-week?style=solid'>example</a>
         */
        CALENDAR_WEEK,
        /**
         * The solid camera icon.See <a href='https://fontawesome.com/icons/camera?style=solid'>example</a>
         */
        CAMERA,
        /**
         * The solid camera-retro icon.See <a href='https://fontawesome.com/icons/camera-retro?style=solid'>example</a>
         */
        CAMERA_RETRO,
        /**
         * The solid campground icon.See <a href='https://fontawesome.com/icons/campground?style=solid'>example</a>
         */
        CAMPGROUND,
        /**
         * The solid candy-cane icon.See <a href='https://fontawesome.com/icons/candy-cane?style=solid'>example</a>
         */
        CANDY_CANE,
        /**
         * The solid cannabis icon.See <a href='https://fontawesome.com/icons/cannabis?style=solid'>example</a>
         */
        CANNABIS,
        /**
         * The solid capsules icon.See <a href='https://fontawesome.com/icons/capsules?style=solid'>example</a>
         */
        CAPSULES,
        /**
         * The solid car icon.See <a href='https://fontawesome.com/icons/car?style=solid'>example</a>
         */
        CAR,
        /**
         * The solid car-alt icon.See <a href='https://fontawesome.com/icons/car-alt?style=solid'>example</a>
         */
        CAR_ALT,
        /**
         * The solid car-battery icon.See <a href='https://fontawesome.com/icons/car-battery?style=solid'>example</a>
         */
        CAR_BATTERY,
        /**
         * The solid car-crash icon.See <a href='https://fontawesome.com/icons/car-crash?style=solid'>example</a>
         */
        CAR_CRASH,
        /**
         * The solid car-side icon.See <a href='https://fontawesome.com/icons/car-side?style=solid'>example</a>
         */
        CAR_SIDE,
        /**
         * The solid caravan icon.See <a href='https://fontawesome.com/icons/caravan?style=solid'>example</a>
         */
        CARAVAN,
        /**
         * The solid caret-down icon.See <a href='https://fontawesome.com/icons/caret-down?style=solid'>example</a>
         */
        CARET_DOWN,
        /**
         * The solid caret-left icon.See <a href='https://fontawesome.com/icons/caret-left?style=solid'>example</a>
         */
        CARET_LEFT,
        /**
         * The solid caret-right icon.See <a href='https://fontawesome.com/icons/caret-right?style=solid'>example</a>
         */
        CARET_RIGHT,
        /**
         * The solid caret-square-down icon.See <a href='https://fontawesome.com/icons/caret-square-down?style=solid'>example</a>
         */
        CARET_SQUARE_DOWN,
        /**
         * The solid caret-square-left icon.See <a href='https://fontawesome.com/icons/caret-square-left?style=solid'>example</a>
         */
        CARET_SQUARE_LEFT,
        /**
         * The solid caret-square-right icon.See <a href='https://fontawesome.com/icons/caret-square-right?style=solid'>example</a>
         */
        CARET_SQUARE_RIGHT,
        /**
         * The solid caret-square-up icon.See <a href='https://fontawesome.com/icons/caret-square-up?style=solid'>example</a>
         */
        CARET_SQUARE_UP,
        /**
         * The solid caret-up icon.See <a href='https://fontawesome.com/icons/caret-up?style=solid'>example</a>
         */
        CARET_UP,
        /**
         * The solid carrot icon.See <a href='https://fontawesome.com/icons/carrot?style=solid'>example</a>
         */
        CARROT,
        /**
         * The solid cart-arrow-down icon.See <a href='https://fontawesome.com/icons/cart-arrow-down?style=solid'>example</a>
         */
        CART_ARROW_DOWN,
        /**
         * The solid cart-plus icon.See <a href='https://fontawesome.com/icons/cart-plus?style=solid'>example</a>
         */
        CART_PLUS,
        /**
         * The solid cash-register icon.See <a href='https://fontawesome.com/icons/cash-register?style=solid'>example</a>
         */
        CASH_REGISTER,
        /**
         * The solid cat icon.See <a href='https://fontawesome.com/icons/cat?style=solid'>example</a>
         */
        CAT,
        /**
         * The solid certificate icon.See <a href='https://fontawesome.com/icons/certificate?style=solid'>example</a>
         */
        CERTIFICATE,
        /**
         * The solid chair icon.See <a href='https://fontawesome.com/icons/chair?style=solid'>example</a>
         */
        CHAIR,
        /**
         * The solid chalkboard icon.See <a href='https://fontawesome.com/icons/chalkboard?style=solid'>example</a>
         */
        CHALKBOARD,
        /**
         * The solid chalkboard-teacher icon.See <a href='https://fontawesome.com/icons/chalkboard-teacher?style=solid'>example</a>
         */
        CHALKBOARD_TEACHER,
        /**
         * The solid charging-station icon.See <a href='https://fontawesome.com/icons/charging-station?style=solid'>example</a>
         */
        CHARGING_STATION,
        /**
         * The solid chart-area icon.See <a href='https://fontawesome.com/icons/chart-area?style=solid'>example</a>
         */
        CHART_AREA,
        /**
         * The solid chart-bar icon.See <a href='https://fontawesome.com/icons/chart-bar?style=solid'>example</a>
         */
        CHART_BAR,
        /**
         * The solid chart-line icon.See <a href='https://fontawesome.com/icons/chart-line?style=solid'>example</a>
         */
        CHART_LINE,
        /**
         * The solid chart-pie icon.See <a href='https://fontawesome.com/icons/chart-pie?style=solid'>example</a>
         */
        CHART_PIE,
        /**
         * The solid check icon.See <a href='https://fontawesome.com/icons/check?style=solid'>example</a>
         */
        CHECK,
        /**
         * The solid check-circle icon.See <a href='https://fontawesome.com/icons/check-circle?style=solid'>example</a>
         */
        CHECK_CIRCLE,
        /**
         * The solid check-double icon.See <a href='https://fontawesome.com/icons/check-double?style=solid'>example</a>
         */
        CHECK_DOUBLE,
        /**
         * The solid check-square icon.See <a href='https://fontawesome.com/icons/check-square?style=solid'>example</a>
         */
        CHECK_SQUARE,
        /**
         * The solid cheese icon.See <a href='https://fontawesome.com/icons/cheese?style=solid'>example</a>
         */
        CHEESE,
        /**
         * The solid chess icon.See <a href='https://fontawesome.com/icons/chess?style=solid'>example</a>
         */
        CHESS,
        /**
         * The solid chess-bishop icon.See <a href='https://fontawesome.com/icons/chess-bishop?style=solid'>example</a>
         */
        CHESS_BISHOP,
        /**
         * The solid chess-board icon.See <a href='https://fontawesome.com/icons/chess-board?style=solid'>example</a>
         */
        CHESS_BOARD,
        /**
         * The solid chess-king icon.See <a href='https://fontawesome.com/icons/chess-king?style=solid'>example</a>
         */
        CHESS_KING,
        /**
         * The solid chess-knight icon.See <a href='https://fontawesome.com/icons/chess-knight?style=solid'>example</a>
         */
        CHESS_KNIGHT,
        /**
         * The solid chess-pawn icon.See <a href='https://fontawesome.com/icons/chess-pawn?style=solid'>example</a>
         */
        CHESS_PAWN,
        /**
         * The solid chess-queen icon.See <a href='https://fontawesome.com/icons/chess-queen?style=solid'>example</a>
         */
        CHESS_QUEEN,
        /**
         * The solid chess-rook icon.See <a href='https://fontawesome.com/icons/chess-rook?style=solid'>example</a>
         */
        CHESS_ROOK,
        /**
         * The solid chevron-circle-down icon.See <a href='https://fontawesome.com/icons/chevron-circle-down?style=solid'>example</a>
         */
        CHEVRON_CIRCLE_DOWN,
        /**
         * The solid chevron-circle-left icon.See <a href='https://fontawesome.com/icons/chevron-circle-left?style=solid'>example</a>
         */
        CHEVRON_CIRCLE_LEFT,
        /**
         * The solid chevron-circle-right icon.See <a href='https://fontawesome.com/icons/chevron-circle-right?style=solid'>example</a>
         */
        CHEVRON_CIRCLE_RIGHT,
        /**
         * The solid chevron-circle-up icon.See <a href='https://fontawesome.com/icons/chevron-circle-up?style=solid'>example</a>
         */
        CHEVRON_CIRCLE_UP,
        /**
         * The solid chevron-down icon.See <a href='https://fontawesome.com/icons/chevron-down?style=solid'>example</a>
         */
        CHEVRON_DOWN,
        /**
         * The solid chevron-left icon.See <a href='https://fontawesome.com/icons/chevron-left?style=solid'>example</a>
         */
        CHEVRON_LEFT,
        /**
         * The solid chevron-right icon.See <a href='https://fontawesome.com/icons/chevron-right?style=solid'>example</a>
         */
        CHEVRON_RIGHT,
        /**
         * The solid chevron-up icon.See <a href='https://fontawesome.com/icons/chevron-up?style=solid'>example</a>
         */
        CHEVRON_UP,
        /**
         * The solid child icon.See <a href='https://fontawesome.com/icons/child?style=solid'>example</a>
         */
        CHILD,
        /**
         * The solid church icon.See <a href='https://fontawesome.com/icons/church?style=solid'>example</a>
         */
        CHURCH,
        /**
         * The solid circle icon.See <a href='https://fontawesome.com/icons/circle?style=solid'>example</a>
         */
        CIRCLE,
        /**
         * The solid circle-notch icon.See <a href='https://fontawesome.com/icons/circle-notch?style=solid'>example</a>
         */
        CIRCLE_NOTCH,
        /**
         * The solid city icon.See <a href='https://fontawesome.com/icons/city?style=solid'>example</a>
         */
        CITY,
        /**
         * The solid clinic-medical icon.See <a href='https://fontawesome.com/icons/clinic-medical?style=solid'>example</a>
         */
        CLINIC_MEDICAL,
        /**
         * The solid clipboard icon.See <a href='https://fontawesome.com/icons/clipboard?style=solid'>example</a>
         */
        CLIPBOARD,
        /**
         * The solid clipboard-check icon.See <a href='https://fontawesome.com/icons/clipboard-check?style=solid'>example</a>
         */
        CLIPBOARD_CHECK,
        /**
         * The solid clipboard-list icon.See <a href='https://fontawesome.com/icons/clipboard-list?style=solid'>example</a>
         */
        CLIPBOARD_LIST,
        /**
         * The solid clock icon.See <a href='https://fontawesome.com/icons/clock?style=solid'>example</a>
         */
        CLOCK,
        /**
         * The solid clone icon.See <a href='https://fontawesome.com/icons/clone?style=solid'>example</a>
         */
        CLONE,
        /**
         * The solid closed-captioning icon.See <a href='https://fontawesome.com/icons/closed-captioning?style=solid'>example</a>
         */
        CLOSED_CAPTIONING,
        /**
         * The solid cloud icon.See <a href='https://fontawesome.com/icons/cloud?style=solid'>example</a>
         */
        CLOUD,
        /**
         * The solid cloud-download-alt icon.See <a href='https://fontawesome.com/icons/cloud-download-alt?style=solid'>example</a>
         */
        CLOUD_DOWNLOAD_ALT,
        /**
         * The solid cloud-meatball icon.See <a href='https://fontawesome.com/icons/cloud-meatball?style=solid'>example</a>
         */
        CLOUD_MEATBALL,
        /**
         * The solid cloud-moon icon.See <a href='https://fontawesome.com/icons/cloud-moon?style=solid'>example</a>
         */
        CLOUD_MOON,
        /**
         * The solid cloud-moon-rain icon.See <a href='https://fontawesome.com/icons/cloud-moon-rain?style=solid'>example</a>
         */
        CLOUD_MOON_RAIN,
        /**
         * The solid cloud-rain icon.See <a href='https://fontawesome.com/icons/cloud-rain?style=solid'>example</a>
         */
        CLOUD_RAIN,
        /**
         * The solid cloud-showers-heavy icon.See <a href='https://fontawesome.com/icons/cloud-showers-heavy?style=solid'>example</a>
         */
        CLOUD_SHOWERS_HEAVY,
        /**
         * The solid cloud-sun icon.See <a href='https://fontawesome.com/icons/cloud-sun?style=solid'>example</a>
         */
        CLOUD_SUN,
        /**
         * The solid cloud-sun-rain icon.See <a href='https://fontawesome.com/icons/cloud-sun-rain?style=solid'>example</a>
         */
        CLOUD_SUN_RAIN,
        /**
         * The solid cloud-upload-alt icon.See <a href='https://fontawesome.com/icons/cloud-upload-alt?style=solid'>example</a>
         */
        CLOUD_UPLOAD_ALT,
        /**
         * The solid cocktail icon.See <a href='https://fontawesome.com/icons/cocktail?style=solid'>example</a>
         */
        COCKTAIL,
        /**
         * The solid code icon.See <a href='https://fontawesome.com/icons/code?style=solid'>example</a>
         */
        CODE,
        /**
         * The solid code-branch icon.See <a href='https://fontawesome.com/icons/code-branch?style=solid'>example</a>
         */
        CODE_BRANCH,
        /**
         * The solid coffee icon.See <a href='https://fontawesome.com/icons/coffee?style=solid'>example</a>
         */
        COFFEE,
        /**
         * The solid cog icon.See <a href='https://fontawesome.com/icons/cog?style=solid'>example</a>
         */
        COG,
        /**
         * The solid cogs icon.See <a href='https://fontawesome.com/icons/cogs?style=solid'>example</a>
         */
        COGS,
        /**
         * The solid coins icon.See <a href='https://fontawesome.com/icons/coins?style=solid'>example</a>
         */
        COINS,
        /**
         * The solid columns icon.See <a href='https://fontawesome.com/icons/columns?style=solid'>example</a>
         */
        COLUMNS,
        /**
         * The solid comment icon.See <a href='https://fontawesome.com/icons/comment?style=solid'>example</a>
         */
        COMMENT,
        /**
         * The solid comment-alt icon.See <a href='https://fontawesome.com/icons/comment-alt?style=solid'>example</a>
         */
        COMMENT_ALT,
        /**
         * The solid comment-dollar icon.See <a href='https://fontawesome.com/icons/comment-dollar?style=solid'>example</a>
         */
        COMMENT_DOLLAR,
        /**
         * The solid comment-dots icon.See <a href='https://fontawesome.com/icons/comment-dots?style=solid'>example</a>
         */
        COMMENT_DOTS,
        /**
         * The solid comment-medical icon.See <a href='https://fontawesome.com/icons/comment-medical?style=solid'>example</a>
         */
        COMMENT_MEDICAL,
        /**
         * The solid comment-slash icon.See <a href='https://fontawesome.com/icons/comment-slash?style=solid'>example</a>
         */
        COMMENT_SLASH,
        /**
         * The solid comments icon.See <a href='https://fontawesome.com/icons/comments?style=solid'>example</a>
         */
        COMMENTS,
        /**
         * The solid comments-dollar icon.See <a href='https://fontawesome.com/icons/comments-dollar?style=solid'>example</a>
         */
        COMMENTS_DOLLAR,
        /**
         * The solid compact-disc icon.See <a href='https://fontawesome.com/icons/compact-disc?style=solid'>example</a>
         */
        COMPACT_DISC,
        /**
         * The solid compass icon.See <a href='https://fontawesome.com/icons/compass?style=solid'>example</a>
         */
        COMPASS,
        /**
         * The solid compress icon.See <a href='https://fontawesome.com/icons/compress?style=solid'>example</a>
         */
        COMPRESS,
        /**
         * The solid compress-alt icon.See <a href='https://fontawesome.com/icons/compress-alt?style=solid'>example</a>
         */
        COMPRESS_ALT,
        /**
         * The solid compress-arrows-alt icon.See <a href='https://fontawesome.com/icons/compress-arrows-alt?style=solid'>example</a>
         */
        COMPRESS_ARROWS_ALT,
        /**
         * The solid concierge-bell icon.See <a href='https://fontawesome.com/icons/concierge-bell?style=solid'>example</a>
         */
        CONCIERGE_BELL,
        /**
         * The solid cookie icon.See <a href='https://fontawesome.com/icons/cookie?style=solid'>example</a>
         */
        COOKIE,
        /**
         * The solid cookie-bite icon.See <a href='https://fontawesome.com/icons/cookie-bite?style=solid'>example</a>
         */
        COOKIE_BITE,
        /**
         * The solid copy icon.See <a href='https://fontawesome.com/icons/copy?style=solid'>example</a>
         */
        COPY,
        /**
         * The solid copyright icon.See <a href='https://fontawesome.com/icons/copyright?style=solid'>example</a>
         */
        COPYRIGHT,
        /**
         * The solid couch icon.See <a href='https://fontawesome.com/icons/couch?style=solid'>example</a>
         */
        COUCH,
        /**
         * The solid credit-card icon.See <a href='https://fontawesome.com/icons/credit-card?style=solid'>example</a>
         */
        CREDIT_CARD,
        /**
         * The solid crop icon.See <a href='https://fontawesome.com/icons/crop?style=solid'>example</a>
         */
        CROP,
        /**
         * The solid crop-alt icon.See <a href='https://fontawesome.com/icons/crop-alt?style=solid'>example</a>
         */
        CROP_ALT,
        /**
         * The solid cross icon.See <a href='https://fontawesome.com/icons/cross?style=solid'>example</a>
         */
        CROSS,
        /**
         * The solid crosshairs icon.See <a href='https://fontawesome.com/icons/crosshairs?style=solid'>example</a>
         */
        CROSSHAIRS,
        /**
         * The solid crow icon.See <a href='https://fontawesome.com/icons/crow?style=solid'>example</a>
         */
        CROW,
        /**
         * The solid crown icon.See <a href='https://fontawesome.com/icons/crown?style=solid'>example</a>
         */
        CROWN,
        /**
         * The solid crutch icon.See <a href='https://fontawesome.com/icons/crutch?style=solid'>example</a>
         */
        CRUTCH,
        /**
         * The solid cube icon.See <a href='https://fontawesome.com/icons/cube?style=solid'>example</a>
         */
        CUBE,
        /**
         * The solid cubes icon.See <a href='https://fontawesome.com/icons/cubes?style=solid'>example</a>
         */
        CUBES,
        /**
         * The solid cut icon.See <a href='https://fontawesome.com/icons/cut?style=solid'>example</a>
         */
        CUT,
        /**
         * The solid database icon.See <a href='https://fontawesome.com/icons/database?style=solid'>example</a>
         */
        DATABASE,
        /**
         * The solid deaf icon.See <a href='https://fontawesome.com/icons/deaf?style=solid'>example</a>
         */
        DEAF,
        /**
         * The solid democrat icon.See <a href='https://fontawesome.com/icons/democrat?style=solid'>example</a>
         */
        DEMOCRAT,
        /**
         * The solid desktop icon.See <a href='https://fontawesome.com/icons/desktop?style=solid'>example</a>
         */
        DESKTOP,
        /**
         * The solid dharmachakra icon.See <a href='https://fontawesome.com/icons/dharmachakra?style=solid'>example</a>
         */
        DHARMACHAKRA,
        /**
         * The solid diagnoses icon.See <a href='https://fontawesome.com/icons/diagnoses?style=solid'>example</a>
         */
        DIAGNOSES,
        /**
         * The solid dice icon.See <a href='https://fontawesome.com/icons/dice?style=solid'>example</a>
         */
        DICE,
        /**
         * The solid dice-d20 icon.See <a href='https://fontawesome.com/icons/dice-d20?style=solid'>example</a>
         */
        DICE_D20,
        /**
         * The solid dice-d6 icon.See <a href='https://fontawesome.com/icons/dice-d6?style=solid'>example</a>
         */
        DICE_D6,
        /**
         * The solid dice-five icon.See <a href='https://fontawesome.com/icons/dice-five?style=solid'>example</a>
         */
        DICE_FIVE,
        /**
         * The solid dice-four icon.See <a href='https://fontawesome.com/icons/dice-four?style=solid'>example</a>
         */
        DICE_FOUR,
        /**
         * The solid dice-one icon.See <a href='https://fontawesome.com/icons/dice-one?style=solid'>example</a>
         */
        DICE_ONE,
        /**
         * The solid dice-six icon.See <a href='https://fontawesome.com/icons/dice-six?style=solid'>example</a>
         */
        DICE_SIX,
        /**
         * The solid dice-three icon.See <a href='https://fontawesome.com/icons/dice-three?style=solid'>example</a>
         */
        DICE_THREE,
        /**
         * The solid dice-two icon.See <a href='https://fontawesome.com/icons/dice-two?style=solid'>example</a>
         */
        DICE_TWO,
        /**
         * The solid digital-tachograph icon.See <a href='https://fontawesome.com/icons/digital-tachograph?style=solid'>example</a>
         */
        DIGITAL_TACHOGRAPH,
        /**
         * The solid directions icon.See <a href='https://fontawesome.com/icons/directions?style=solid'>example</a>
         */
        DIRECTIONS,
        /**
         * The solid disease icon.See <a href='https://fontawesome.com/icons/disease?style=solid'>example</a>
         */
        DISEASE,
        /**
         * The solid divide icon.See <a href='https://fontawesome.com/icons/divide?style=solid'>example</a>
         */
        DIVIDE,
        /**
         * The solid dizzy icon.See <a href='https://fontawesome.com/icons/dizzy?style=solid'>example</a>
         */
        DIZZY,
        /**
         * The solid dna icon.See <a href='https://fontawesome.com/icons/dna?style=solid'>example</a>
         */
        DNA,
        /**
         * The solid dog icon.See <a href='https://fontawesome.com/icons/dog?style=solid'>example</a>
         */
        DOG,
        /**
         * The solid dollar-sign icon.See <a href='https://fontawesome.com/icons/dollar-sign?style=solid'>example</a>
         */
        DOLLAR_SIGN,
        /**
         * The solid dolly icon.See <a href='https://fontawesome.com/icons/dolly?style=solid'>example</a>
         */
        DOLLY,
        /**
         * The solid dolly-flatbed icon.See <a href='https://fontawesome.com/icons/dolly-flatbed?style=solid'>example</a>
         */
        DOLLY_FLATBED,
        /**
         * The solid donate icon.See <a href='https://fontawesome.com/icons/donate?style=solid'>example</a>
         */
        DONATE,
        /**
         * The solid door-closed icon.See <a href='https://fontawesome.com/icons/door-closed?style=solid'>example</a>
         */
        DOOR_CLOSED,
        /**
         * The solid door-open icon.See <a href='https://fontawesome.com/icons/door-open?style=solid'>example</a>
         */
        DOOR_OPEN,
        /**
         * The solid dot-circle icon.See <a href='https://fontawesome.com/icons/dot-circle?style=solid'>example</a>
         */
        DOT_CIRCLE,
        /**
         * The solid dove icon.See <a href='https://fontawesome.com/icons/dove?style=solid'>example</a>
         */
        DOVE,
        /**
         * The solid download icon.See <a href='https://fontawesome.com/icons/download?style=solid'>example</a>
         */
        DOWNLOAD,
        /**
         * The solid drafting-compass icon.See <a href='https://fontawesome.com/icons/drafting-compass?style=solid'>example</a>
         */
        DRAFTING_COMPASS,
        /**
         * The solid dragon icon.See <a href='https://fontawesome.com/icons/dragon?style=solid'>example</a>
         */
        DRAGON,
        /**
         * The solid draw-polygon icon.See <a href='https://fontawesome.com/icons/draw-polygon?style=solid'>example</a>
         */
        DRAW_POLYGON,
        /**
         * The solid drum icon.See <a href='https://fontawesome.com/icons/drum?style=solid'>example</a>
         */
        DRUM,
        /**
         * The solid drum-steelpan icon.See <a href='https://fontawesome.com/icons/drum-steelpan?style=solid'>example</a>
         */
        DRUM_STEELPAN,
        /**
         * The solid drumstick-bite icon.See <a href='https://fontawesome.com/icons/drumstick-bite?style=solid'>example</a>
         */
        DRUMSTICK_BITE,
        /**
         * The solid dumbbell icon.See <a href='https://fontawesome.com/icons/dumbbell?style=solid'>example</a>
         */
        DUMBBELL,
        /**
         * The solid dumpster icon.See <a href='https://fontawesome.com/icons/dumpster?style=solid'>example</a>
         */
        DUMPSTER,
        /**
         * The solid dumpster-fire icon.See <a href='https://fontawesome.com/icons/dumpster-fire?style=solid'>example</a>
         */
        DUMPSTER_FIRE,
        /**
         * The solid dungeon icon.See <a href='https://fontawesome.com/icons/dungeon?style=solid'>example</a>
         */
        DUNGEON,
        /**
         * The solid edit icon.See <a href='https://fontawesome.com/icons/edit?style=solid'>example</a>
         */
        EDIT,
        /**
         * The solid egg icon.See <a href='https://fontawesome.com/icons/egg?style=solid'>example</a>
         */
        EGG,
        /**
         * The solid eject icon.See <a href='https://fontawesome.com/icons/eject?style=solid'>example</a>
         */
        EJECT,
        /**
         * The solid ellipsis-h icon.See <a href='https://fontawesome.com/icons/ellipsis-h?style=solid'>example</a>
         */
        ELLIPSIS_H,
        /**
         * The solid ellipsis-v icon.See <a href='https://fontawesome.com/icons/ellipsis-v?style=solid'>example</a>
         */
        ELLIPSIS_V,
        /**
         * The solid envelope icon.See <a href='https://fontawesome.com/icons/envelope?style=solid'>example</a>
         */
        ENVELOPE,
        /**
         * The solid envelope-open icon.See <a href='https://fontawesome.com/icons/envelope-open?style=solid'>example</a>
         */
        ENVELOPE_OPEN,
        /**
         * The solid envelope-open-text icon.See <a href='https://fontawesome.com/icons/envelope-open-text?style=solid'>example</a>
         */
        ENVELOPE_OPEN_TEXT,
        /**
         * The solid envelope-square icon.See <a href='https://fontawesome.com/icons/envelope-square?style=solid'>example</a>
         */
        ENVELOPE_SQUARE,
        /**
         * The solid equals icon.See <a href='https://fontawesome.com/icons/equals?style=solid'>example</a>
         */
        EQUALS,
        /**
         * The solid eraser icon.See <a href='https://fontawesome.com/icons/eraser?style=solid'>example</a>
         */
        ERASER,
        /**
         * The solid ethernet icon.See <a href='https://fontawesome.com/icons/ethernet?style=solid'>example</a>
         */
        ETHERNET,
        /**
         * The solid euro-sign icon.See <a href='https://fontawesome.com/icons/euro-sign?style=solid'>example</a>
         */
        EURO_SIGN,
        /**
         * The solid exchange-alt icon.See <a href='https://fontawesome.com/icons/exchange-alt?style=solid'>example</a>
         */
        EXCHANGE_ALT,
        /**
         * The solid exclamation icon.See <a href='https://fontawesome.com/icons/exclamation?style=solid'>example</a>
         */
        EXCLAMATION,
        /**
         * The solid exclamation-circle icon.See <a href='https://fontawesome.com/icons/exclamation-circle?style=solid'>example</a>
         */
        EXCLAMATION_CIRCLE,
        /**
         * The solid exclamation-triangle icon.See <a href='https://fontawesome.com/icons/exclamation-triangle?style=solid'>example</a>
         */
        EXCLAMATION_TRIANGLE,
        /**
         * The solid expand icon.See <a href='https://fontawesome.com/icons/expand?style=solid'>example</a>
         */
        EXPAND,
        /**
         * The solid expand-alt icon.See <a href='https://fontawesome.com/icons/expand-alt?style=solid'>example</a>
         */
        EXPAND_ALT,
        /**
         * The solid expand-arrows-alt icon.See <a href='https://fontawesome.com/icons/expand-arrows-alt?style=solid'>example</a>
         */
        EXPAND_ARROWS_ALT,
        /**
         * The solid external-link-alt icon.See <a href='https://fontawesome.com/icons/external-link-alt?style=solid'>example</a>
         */
        EXTERNAL_LINK_ALT,
        /**
         * The solid external-link-square-alt icon.See <a href='https://fontawesome.com/icons/external-link-square-alt?style=solid'>example</a>
         */
        EXTERNAL_LINK_SQUARE_ALT,
        /**
         * The solid eye icon.See <a href='https://fontawesome.com/icons/eye?style=solid'>example</a>
         */
        EYE,
        /**
         * The solid eye-dropper icon.See <a href='https://fontawesome.com/icons/eye-dropper?style=solid'>example</a>
         */
        EYE_DROPPER,
        /**
         * The solid eye-slash icon.See <a href='https://fontawesome.com/icons/eye-slash?style=solid'>example</a>
         */
        EYE_SLASH,
        /**
         * The solid fan icon.See <a href='https://fontawesome.com/icons/fan?style=solid'>example</a>
         */
        FAN,
        /**
         * The solid fast-backward icon.See <a href='https://fontawesome.com/icons/fast-backward?style=solid'>example</a>
         */
        FAST_BACKWARD,
        /**
         * The solid fast-forward icon.See <a href='https://fontawesome.com/icons/fast-forward?style=solid'>example</a>
         */
        FAST_FORWARD,
        /**
         * The solid faucet icon.See <a href='https://fontawesome.com/icons/faucet?style=solid'>example</a>
         */
        FAUCET,
        /**
         * The solid fax icon.See <a href='https://fontawesome.com/icons/fax?style=solid'>example</a>
         */
        FAX,
        /**
         * The solid feather icon.See <a href='https://fontawesome.com/icons/feather?style=solid'>example</a>
         */
        FEATHER,
        /**
         * The solid feather-alt icon.See <a href='https://fontawesome.com/icons/feather-alt?style=solid'>example</a>
         */
        FEATHER_ALT,
        /**
         * The solid female icon.See <a href='https://fontawesome.com/icons/female?style=solid'>example</a>
         */
        FEMALE,
        /**
         * The solid fighter-jet icon.See <a href='https://fontawesome.com/icons/fighter-jet?style=solid'>example</a>
         */
        FIGHTER_JET,
        /**
         * The solid file icon.See <a href='https://fontawesome.com/icons/file?style=solid'>example</a>
         */
        FILE,
        /**
         * The solid file-alt icon.See <a href='https://fontawesome.com/icons/file-alt?style=solid'>example</a>
         */
        FILE_ALT,
        /**
         * The solid file-archive icon.See <a href='https://fontawesome.com/icons/file-archive?style=solid'>example</a>
         */
        FILE_ARCHIVE,
        /**
         * The solid file-audio icon.See <a href='https://fontawesome.com/icons/file-audio?style=solid'>example</a>
         */
        FILE_AUDIO,
        /**
         * The solid file-code icon.See <a href='https://fontawesome.com/icons/file-code?style=solid'>example</a>
         */
        FILE_CODE,
        /**
         * The solid file-contract icon.See <a href='https://fontawesome.com/icons/file-contract?style=solid'>example</a>
         */
        FILE_CONTRACT,
        /**
         * The solid file-csv icon.See <a href='https://fontawesome.com/icons/file-csv?style=solid'>example</a>
         */
        FILE_CSV,
        /**
         * The solid file-download icon.See <a href='https://fontawesome.com/icons/file-download?style=solid'>example</a>
         */
        FILE_DOWNLOAD,
        /**
         * The solid file-excel icon.See <a href='https://fontawesome.com/icons/file-excel?style=solid'>example</a>
         */
        FILE_EXCEL,
        /**
         * The solid file-export icon.See <a href='https://fontawesome.com/icons/file-export?style=solid'>example</a>
         */
        FILE_EXPORT,
        /**
         * The solid file-image icon.See <a href='https://fontawesome.com/icons/file-image?style=solid'>example</a>
         */
        FILE_IMAGE,
        /**
         * The solid file-import icon.See <a href='https://fontawesome.com/icons/file-import?style=solid'>example</a>
         */
        FILE_IMPORT,
        /**
         * The solid file-invoice icon.See <a href='https://fontawesome.com/icons/file-invoice?style=solid'>example</a>
         */
        FILE_INVOICE,
        /**
         * The solid file-invoice-dollar icon.See <a href='https://fontawesome.com/icons/file-invoice-dollar?style=solid'>example</a>
         */
        FILE_INVOICE_DOLLAR,
        /**
         * The solid file-medical icon.See <a href='https://fontawesome.com/icons/file-medical?style=solid'>example</a>
         */
        FILE_MEDICAL,
        /**
         * The solid file-medical-alt icon.See <a href='https://fontawesome.com/icons/file-medical-alt?style=solid'>example</a>
         */
        FILE_MEDICAL_ALT,
        /**
         * The solid file-pdf icon.See <a href='https://fontawesome.com/icons/file-pdf?style=solid'>example</a>
         */
        FILE_PDF,
        /**
         * The solid file-powerpoint icon.See <a href='https://fontawesome.com/icons/file-powerpoint?style=solid'>example</a>
         */
        FILE_POWERPOINT,
        /**
         * The solid file-prescription icon.See <a href='https://fontawesome.com/icons/file-prescription?style=solid'>example</a>
         */
        FILE_PRESCRIPTION,
        /**
         * The solid file-signature icon.See <a href='https://fontawesome.com/icons/file-signature?style=solid'>example</a>
         */
        FILE_SIGNATURE,
        /**
         * The solid file-upload icon.See <a href='https://fontawesome.com/icons/file-upload?style=solid'>example</a>
         */
        FILE_UPLOAD,
        /**
         * The solid file-video icon.See <a href='https://fontawesome.com/icons/file-video?style=solid'>example</a>
         */
        FILE_VIDEO,
        /**
         * The solid file-word icon.See <a href='https://fontawesome.com/icons/file-word?style=solid'>example</a>
         */
        FILE_WORD,
        /**
         * The solid fill icon.See <a href='https://fontawesome.com/icons/fill?style=solid'>example</a>
         */
        FILL,
        /**
         * The solid fill-drip icon.See <a href='https://fontawesome.com/icons/fill-drip?style=solid'>example</a>
         */
        FILL_DRIP,
        /**
         * The solid film icon.See <a href='https://fontawesome.com/icons/film?style=solid'>example</a>
         */
        FILM,
        /**
         * The solid filter icon.See <a href='https://fontawesome.com/icons/filter?style=solid'>example</a>
         */
        FILTER,
        /**
         * The solid fingerprint icon.See <a href='https://fontawesome.com/icons/fingerprint?style=solid'>example</a>
         */
        FINGERPRINT,
        /**
         * The solid fire icon.See <a href='https://fontawesome.com/icons/fire?style=solid'>example</a>
         */
        FIRE,
        /**
         * The solid fire-alt icon.See <a href='https://fontawesome.com/icons/fire-alt?style=solid'>example</a>
         */
        FIRE_ALT,
        /**
         * The solid fire-extinguisher icon.See <a href='https://fontawesome.com/icons/fire-extinguisher?style=solid'>example</a>
         */
        FIRE_EXTINGUISHER,
        /**
         * The solid first-aid icon.See <a href='https://fontawesome.com/icons/first-aid?style=solid'>example</a>
         */
        FIRST_AID,
        /**
         * The solid fish icon.See <a href='https://fontawesome.com/icons/fish?style=solid'>example</a>
         */
        FISH,
        /**
         * The solid fist-raised icon.See <a href='https://fontawesome.com/icons/fist-raised?style=solid'>example</a>
         */
        FIST_RAISED,
        /**
         * The solid flag icon.See <a href='https://fontawesome.com/icons/flag?style=solid'>example</a>
         */
        FLAG,
        /**
         * The solid flag-checkered icon.See <a href='https://fontawesome.com/icons/flag-checkered?style=solid'>example</a>
         */
        FLAG_CHECKERED,
        /**
         * The solid flag-usa icon.See <a href='https://fontawesome.com/icons/flag-usa?style=solid'>example</a>
         */
        FLAG_USA,
        /**
         * The solid flask icon.See <a href='https://fontawesome.com/icons/flask?style=solid'>example</a>
         */
        FLASK,
        /**
         * The solid flushed icon.See <a href='https://fontawesome.com/icons/flushed?style=solid'>example</a>
         */
        FLUSHED,
        /**
         * The solid folder icon.See <a href='https://fontawesome.com/icons/folder?style=solid'>example</a>
         */
        FOLDER,
        /**
         * The solid folder-minus icon.See <a href='https://fontawesome.com/icons/folder-minus?style=solid'>example</a>
         */
        FOLDER_MINUS,
        /**
         * The solid folder-open icon.See <a href='https://fontawesome.com/icons/folder-open?style=solid'>example</a>
         */
        FOLDER_OPEN,
        /**
         * The solid folder-plus icon.See <a href='https://fontawesome.com/icons/folder-plus?style=solid'>example</a>
         */
        FOLDER_PLUS,
        /**
         * The solid font icon.See <a href='https://fontawesome.com/icons/font?style=solid'>example</a>
         */
        FONT,
        /**
         * The solid font-awesome-logo-full icon.See <a href='https://fontawesome.com/icons/font-awesome-logo-full?style=solid'>example</a>
         */
        FONT_AWESOME_LOGO_FULL,
        /**
         * The solid football-ball icon.See <a href='https://fontawesome.com/icons/football-ball?style=solid'>example</a>
         */
        FOOTBALL_BALL,
        /**
         * The solid forward icon.See <a href='https://fontawesome.com/icons/forward?style=solid'>example</a>
         */
        FORWARD,
        /**
         * The solid frog icon.See <a href='https://fontawesome.com/icons/frog?style=solid'>example</a>
         */
        FROG,
        /**
         * The solid frown icon.See <a href='https://fontawesome.com/icons/frown?style=solid'>example</a>
         */
        FROWN,
        /**
         * The solid frown-open icon.See <a href='https://fontawesome.com/icons/frown-open?style=solid'>example</a>
         */
        FROWN_OPEN,
        /**
         * The solid funnel-dollar icon.See <a href='https://fontawesome.com/icons/funnel-dollar?style=solid'>example</a>
         */
        FUNNEL_DOLLAR,
        /**
         * The solid futbol icon.See <a href='https://fontawesome.com/icons/futbol?style=solid'>example</a>
         */
        FUTBOL,
        /**
         * The solid gamepad icon.See <a href='https://fontawesome.com/icons/gamepad?style=solid'>example</a>
         */
        GAMEPAD,
        /**
         * The solid gas-pump icon.See <a href='https://fontawesome.com/icons/gas-pump?style=solid'>example</a>
         */
        GAS_PUMP,
        /**
         * The solid gavel icon.See <a href='https://fontawesome.com/icons/gavel?style=solid'>example</a>
         */
        GAVEL,
        /**
         * The solid gem icon.See <a href='https://fontawesome.com/icons/gem?style=solid'>example</a>
         */
        GEM,
        /**
         * The solid genderless icon.See <a href='https://fontawesome.com/icons/genderless?style=solid'>example</a>
         */
        GENDERLESS,
        /**
         * The solid ghost icon.See <a href='https://fontawesome.com/icons/ghost?style=solid'>example</a>
         */
        GHOST,
        /**
         * The solid gift icon.See <a href='https://fontawesome.com/icons/gift?style=solid'>example</a>
         */
        GIFT,
        /**
         * The solid gifts icon.See <a href='https://fontawesome.com/icons/gifts?style=solid'>example</a>
         */
        GIFTS,
        /**
         * The solid glass-cheers icon.See <a href='https://fontawesome.com/icons/glass-cheers?style=solid'>example</a>
         */
        GLASS_CHEERS,
        /**
         * The solid glass-martini icon.See <a href='https://fontawesome.com/icons/glass-martini?style=solid'>example</a>
         */
        GLASS_MARTINI,
        /**
         * The solid glass-martini-alt icon.See <a href='https://fontawesome.com/icons/glass-martini-alt?style=solid'>example</a>
         */
        GLASS_MARTINI_ALT,
        /**
         * The solid glass-whiskey icon.See <a href='https://fontawesome.com/icons/glass-whiskey?style=solid'>example</a>
         */
        GLASS_WHISKEY,
        /**
         * The solid glasses icon.See <a href='https://fontawesome.com/icons/glasses?style=solid'>example</a>
         */
        GLASSES,
        /**
         * The solid globe icon.See <a href='https://fontawesome.com/icons/globe?style=solid'>example</a>
         */
        GLOBE,
        /**
         * The solid globe-africa icon.See <a href='https://fontawesome.com/icons/globe-africa?style=solid'>example</a>
         */
        GLOBE_AFRICA,
        /**
         * The solid globe-americas icon.See <a href='https://fontawesome.com/icons/globe-americas?style=solid'>example</a>
         */
        GLOBE_AMERICAS,
        /**
         * The solid globe-asia icon.See <a href='https://fontawesome.com/icons/globe-asia?style=solid'>example</a>
         */
        GLOBE_ASIA,
        /**
         * The solid globe-europe icon.See <a href='https://fontawesome.com/icons/globe-europe?style=solid'>example</a>
         */
        GLOBE_EUROPE,
        /**
         * The solid golf-ball icon.See <a href='https://fontawesome.com/icons/golf-ball?style=solid'>example</a>
         */
        GOLF_BALL,
        /**
         * The solid gopuram icon.See <a href='https://fontawesome.com/icons/gopuram?style=solid'>example</a>
         */
        GOPURAM,
        /**
         * The solid graduation-cap icon.See <a href='https://fontawesome.com/icons/graduation-cap?style=solid'>example</a>
         */
        GRADUATION_CAP,
        /**
         * The solid greater-than icon.See <a href='https://fontawesome.com/icons/greater-than?style=solid'>example</a>
         */
        GREATER_THAN,
        /**
         * The solid greater-than-equal icon.See <a href='https://fontawesome.com/icons/greater-than-equal?style=solid'>example</a>
         */
        GREATER_THAN_EQUAL,
        /**
         * The solid grimace icon.See <a href='https://fontawesome.com/icons/grimace?style=solid'>example</a>
         */
        GRIMACE,
        /**
         * The solid grin icon.See <a href='https://fontawesome.com/icons/grin?style=solid'>example</a>
         */
        GRIN,
        /**
         * The solid grin-alt icon.See <a href='https://fontawesome.com/icons/grin-alt?style=solid'>example</a>
         */
        GRIN_ALT,
        /**
         * The solid grin-beam icon.See <a href='https://fontawesome.com/icons/grin-beam?style=solid'>example</a>
         */
        GRIN_BEAM,
        /**
         * The solid grin-beam-sweat icon.See <a href='https://fontawesome.com/icons/grin-beam-sweat?style=solid'>example</a>
         */
        GRIN_BEAM_SWEAT,
        /**
         * The solid grin-hearts icon.See <a href='https://fontawesome.com/icons/grin-hearts?style=solid'>example</a>
         */
        GRIN_HEARTS,
        /**
         * The solid grin-squint icon.See <a href='https://fontawesome.com/icons/grin-squint?style=solid'>example</a>
         */
        GRIN_SQUINT,
        /**
         * The solid grin-squint-tears icon.See <a href='https://fontawesome.com/icons/grin-squint-tears?style=solid'>example</a>
         */
        GRIN_SQUINT_TEARS,
        /**
         * The solid grin-stars icon.See <a href='https://fontawesome.com/icons/grin-stars?style=solid'>example</a>
         */
        GRIN_STARS,
        /**
         * The solid grin-tears icon.See <a href='https://fontawesome.com/icons/grin-tears?style=solid'>example</a>
         */
        GRIN_TEARS,
        /**
         * The solid grin-tongue icon.See <a href='https://fontawesome.com/icons/grin-tongue?style=solid'>example</a>
         */
        GRIN_TONGUE,
        /**
         * The solid grin-tongue-squint icon.See <a href='https://fontawesome.com/icons/grin-tongue-squint?style=solid'>example</a>
         */
        GRIN_TONGUE_SQUINT,
        /**
         * The solid grin-tongue-wink icon.See <a href='https://fontawesome.com/icons/grin-tongue-wink?style=solid'>example</a>
         */
        GRIN_TONGUE_WINK,
        /**
         * The solid grin-wink icon.See <a href='https://fontawesome.com/icons/grin-wink?style=solid'>example</a>
         */
        GRIN_WINK,
        /**
         * The solid grip-horizontal icon.See <a href='https://fontawesome.com/icons/grip-horizontal?style=solid'>example</a>
         */
        GRIP_HORIZONTAL,
        /**
         * The solid grip-lines icon.See <a href='https://fontawesome.com/icons/grip-lines?style=solid'>example</a>
         */
        GRIP_LINES,
        /**
         * The solid grip-lines-vertical icon.See <a href='https://fontawesome.com/icons/grip-lines-vertical?style=solid'>example</a>
         */
        GRIP_LINES_VERTICAL,
        /**
         * The solid grip-vertical icon.See <a href='https://fontawesome.com/icons/grip-vertical?style=solid'>example</a>
         */
        GRIP_VERTICAL,
        /**
         * The solid guitar icon.See <a href='https://fontawesome.com/icons/guitar?style=solid'>example</a>
         */
        GUITAR,
        /**
         * The solid h-square icon.See <a href='https://fontawesome.com/icons/h-square?style=solid'>example</a>
         */
        H_SQUARE,
        /**
         * The solid hamburger icon.See <a href='https://fontawesome.com/icons/hamburger?style=solid'>example</a>
         */
        HAMBURGER,
        /**
         * The solid hammer icon.See <a href='https://fontawesome.com/icons/hammer?style=solid'>example</a>
         */
        HAMMER,
        /**
         * The solid hamsa icon.See <a href='https://fontawesome.com/icons/hamsa?style=solid'>example</a>
         */
        HAMSA,
        /**
         * The solid hand-holding icon.See <a href='https://fontawesome.com/icons/hand-holding?style=solid'>example</a>
         */
        HAND_HOLDING,
        /**
         * The solid hand-holding-heart icon.See <a href='https://fontawesome.com/icons/hand-holding-heart?style=solid'>example</a>
         */
        HAND_HOLDING_HEART,
        /**
         * The solid hand-holding-medical icon.See <a href='https://fontawesome.com/icons/hand-holding-medical?style=solid'>example</a>
         */
        HAND_HOLDING_MEDICAL,
        /**
         * The solid hand-holding-usd icon.See <a href='https://fontawesome.com/icons/hand-holding-usd?style=solid'>example</a>
         */
        HAND_HOLDING_USD,
        /**
         * The solid hand-holding-water icon.See <a href='https://fontawesome.com/icons/hand-holding-water?style=solid'>example</a>
         */
        HAND_HOLDING_WATER,
        /**
         * The solid hand-lizard icon.See <a href='https://fontawesome.com/icons/hand-lizard?style=solid'>example</a>
         */
        HAND_LIZARD,
        /**
         * The solid hand-middle-finger icon.See <a href='https://fontawesome.com/icons/hand-middle-finger?style=solid'>example</a>
         */
        HAND_MIDDLE_FINGER,
        /**
         * The solid hand-paper icon.See <a href='https://fontawesome.com/icons/hand-paper?style=solid'>example</a>
         */
        HAND_PAPER,
        /**
         * The solid hand-peace icon.See <a href='https://fontawesome.com/icons/hand-peace?style=solid'>example</a>
         */
        HAND_PEACE,
        /**
         * The solid hand-point-down icon.See <a href='https://fontawesome.com/icons/hand-point-down?style=solid'>example</a>
         */
        HAND_POINT_DOWN,
        /**
         * The solid hand-point-left icon.See <a href='https://fontawesome.com/icons/hand-point-left?style=solid'>example</a>
         */
        HAND_POINT_LEFT,
        /**
         * The solid hand-point-right icon.See <a href='https://fontawesome.com/icons/hand-point-right?style=solid'>example</a>
         */
        HAND_POINT_RIGHT,
        /**
         * The solid hand-point-up icon.See <a href='https://fontawesome.com/icons/hand-point-up?style=solid'>example</a>
         */
        HAND_POINT_UP,
        /**
         * The solid hand-pointer icon.See <a href='https://fontawesome.com/icons/hand-pointer?style=solid'>example</a>
         */
        HAND_POINTER,
        /**
         * The solid hand-rock icon.See <a href='https://fontawesome.com/icons/hand-rock?style=solid'>example</a>
         */
        HAND_ROCK,
        /**
         * The solid hand-scissors icon.See <a href='https://fontawesome.com/icons/hand-scissors?style=solid'>example</a>
         */
        HAND_SCISSORS,
        /**
         * The solid hand-sparkles icon.See <a href='https://fontawesome.com/icons/hand-sparkles?style=solid'>example</a>
         */
        HAND_SPARKLES,
        /**
         * The solid hand-spock icon.See <a href='https://fontawesome.com/icons/hand-spock?style=solid'>example</a>
         */
        HAND_SPOCK,
        /**
         * The solid hands icon.See <a href='https://fontawesome.com/icons/hands?style=solid'>example</a>
         */
        HANDS,
        /**
         * The solid hands-helping icon.See <a href='https://fontawesome.com/icons/hands-helping?style=solid'>example</a>
         */
        HANDS_HELPING,
        /**
         * The solid hands-wash icon.See <a href='https://fontawesome.com/icons/hands-wash?style=solid'>example</a>
         */
        HANDS_WASH,
        /**
         * The solid handshake icon.See <a href='https://fontawesome.com/icons/handshake?style=solid'>example</a>
         */
        HANDSHAKE,
        /**
         * The solid handshake-alt-slash icon.See <a href='https://fontawesome.com/icons/handshake-alt-slash?style=solid'>example</a>
         */
        HANDSHAKE_ALT_SLASH,
        /**
         * The solid handshake-slash icon.See <a href='https://fontawesome.com/icons/handshake-slash?style=solid'>example</a>
         */
        HANDSHAKE_SLASH,
        /**
         * The solid hanukiah icon.See <a href='https://fontawesome.com/icons/hanukiah?style=solid'>example</a>
         */
        HANUKIAH,
        /**
         * The solid hard-hat icon.See <a href='https://fontawesome.com/icons/hard-hat?style=solid'>example</a>
         */
        HARD_HAT,
        /**
         * The solid hashtag icon.See <a href='https://fontawesome.com/icons/hashtag?style=solid'>example</a>
         */
        HASHTAG,
        /**
         * The solid hat-cowboy icon.See <a href='https://fontawesome.com/icons/hat-cowboy?style=solid'>example</a>
         */
        HAT_COWBOY,
        /**
         * The solid hat-cowboy-side icon.See <a href='https://fontawesome.com/icons/hat-cowboy-side?style=solid'>example</a>
         */
        HAT_COWBOY_SIDE,
        /**
         * The solid hat-wizard icon.See <a href='https://fontawesome.com/icons/hat-wizard?style=solid'>example</a>
         */
        HAT_WIZARD,
        /**
         * The solid hdd icon.See <a href='https://fontawesome.com/icons/hdd?style=solid'>example</a>
         */
        HDD,
        /**
         * The solid head-side-cough icon.See <a href='https://fontawesome.com/icons/head-side-cough?style=solid'>example</a>
         */
        HEAD_SIDE_COUGH,
        /**
         * The solid head-side-cough-slash icon.See <a href='https://fontawesome.com/icons/head-side-cough-slash?style=solid'>example</a>
         */
        HEAD_SIDE_COUGH_SLASH,
        /**
         * The solid head-side-mask icon.See <a href='https://fontawesome.com/icons/head-side-mask?style=solid'>example</a>
         */
        HEAD_SIDE_MASK,
        /**
         * The solid head-side-virus icon.See <a href='https://fontawesome.com/icons/head-side-virus?style=solid'>example</a>
         */
        HEAD_SIDE_VIRUS,
        /**
         * The solid heading icon.See <a href='https://fontawesome.com/icons/heading?style=solid'>example</a>
         */
        HEADING,
        /**
         * The solid headphones icon.See <a href='https://fontawesome.com/icons/headphones?style=solid'>example</a>
         */
        HEADPHONES,
        /**
         * The solid headphones-alt icon.See <a href='https://fontawesome.com/icons/headphones-alt?style=solid'>example</a>
         */
        HEADPHONES_ALT,
        /**
         * The solid headset icon.See <a href='https://fontawesome.com/icons/headset?style=solid'>example</a>
         */
        HEADSET,
        /**
         * The solid heart icon.See <a href='https://fontawesome.com/icons/heart?style=solid'>example</a>
         */
        HEART,
        /**
         * The solid heart-broken icon.See <a href='https://fontawesome.com/icons/heart-broken?style=solid'>example</a>
         */
        HEART_BROKEN,
        /**
         * The solid heartbeat icon.See <a href='https://fontawesome.com/icons/heartbeat?style=solid'>example</a>
         */
        HEARTBEAT,
        /**
         * The solid helicopter icon.See <a href='https://fontawesome.com/icons/helicopter?style=solid'>example</a>
         */
        HELICOPTER,
        /**
         * The solid highlighter icon.See <a href='https://fontawesome.com/icons/highlighter?style=solid'>example</a>
         */
        HIGHLIGHTER,
        /**
         * The solid hiking icon.See <a href='https://fontawesome.com/icons/hiking?style=solid'>example</a>
         */
        HIKING,
        /**
         * The solid hippo icon.See <a href='https://fontawesome.com/icons/hippo?style=solid'>example</a>
         */
        HIPPO,
        /**
         * The solid history icon.See <a href='https://fontawesome.com/icons/history?style=solid'>example</a>
         */
        HISTORY,
        /**
         * The solid hockey-puck icon.See <a href='https://fontawesome.com/icons/hockey-puck?style=solid'>example</a>
         */
        HOCKEY_PUCK,
        /**
         * The solid holly-berry icon.See <a href='https://fontawesome.com/icons/holly-berry?style=solid'>example</a>
         */
        HOLLY_BERRY,
        /**
         * The solid home icon.See <a href='https://fontawesome.com/icons/home?style=solid'>example</a>
         */
        HOME,
        /**
         * The solid horse icon.See <a href='https://fontawesome.com/icons/horse?style=solid'>example</a>
         */
        HORSE,
        /**
         * The solid horse-head icon.See <a href='https://fontawesome.com/icons/horse-head?style=solid'>example</a>
         */
        HORSE_HEAD,
        /**
         * The solid hospital icon.See <a href='https://fontawesome.com/icons/hospital?style=solid'>example</a>
         */
        HOSPITAL,
        /**
         * The solid hospital-alt icon.See <a href='https://fontawesome.com/icons/hospital-alt?style=solid'>example</a>
         */
        HOSPITAL_ALT,
        /**
         * The solid hospital-symbol icon.See <a href='https://fontawesome.com/icons/hospital-symbol?style=solid'>example</a>
         */
        HOSPITAL_SYMBOL,
        /**
         * The solid hospital-user icon.See <a href='https://fontawesome.com/icons/hospital-user?style=solid'>example</a>
         */
        HOSPITAL_USER,
        /**
         * The solid hot-tub icon.See <a href='https://fontawesome.com/icons/hot-tub?style=solid'>example</a>
         */
        HOT_TUB,
        /**
         * The solid hotdog icon.See <a href='https://fontawesome.com/icons/hotdog?style=solid'>example</a>
         */
        HOTDOG,
        /**
         * The solid hotel icon.See <a href='https://fontawesome.com/icons/hotel?style=solid'>example</a>
         */
        HOTEL,
        /**
         * The solid hourglass icon.See <a href='https://fontawesome.com/icons/hourglass?style=solid'>example</a>
         */
        HOURGLASS,
        /**
         * The solid hourglass-end icon.See <a href='https://fontawesome.com/icons/hourglass-end?style=solid'>example</a>
         */
        HOURGLASS_END,
        /**
         * The solid hourglass-half icon.See <a href='https://fontawesome.com/icons/hourglass-half?style=solid'>example</a>
         */
        HOURGLASS_HALF,
        /**
         * The solid hourglass-start icon.See <a href='https://fontawesome.com/icons/hourglass-start?style=solid'>example</a>
         */
        HOURGLASS_START,
        /**
         * The solid house-damage icon.See <a href='https://fontawesome.com/icons/house-damage?style=solid'>example</a>
         */
        HOUSE_DAMAGE,
        /**
         * The solid house-user icon.See <a href='https://fontawesome.com/icons/house-user?style=solid'>example</a>
         */
        HOUSE_USER,
        /**
         * The solid hryvnia icon.See <a href='https://fontawesome.com/icons/hryvnia?style=solid'>example</a>
         */
        HRYVNIA,
        /**
         * The solid i-cursor icon.See <a href='https://fontawesome.com/icons/i-cursor?style=solid'>example</a>
         */
        I_CURSOR,
        /**
         * The solid ice-cream icon.See <a href='https://fontawesome.com/icons/ice-cream?style=solid'>example</a>
         */
        ICE_CREAM,
        /**
         * The solid icicles icon.See <a href='https://fontawesome.com/icons/icicles?style=solid'>example</a>
         */
        ICICLES,
        /**
         * The solid icons icon.See <a href='https://fontawesome.com/icons/icons?style=solid'>example</a>
         */
        ICONS,
        /**
         * The solid id-badge icon.See <a href='https://fontawesome.com/icons/id-badge?style=solid'>example</a>
         */
        ID_BADGE,
        /**
         * The solid id-card icon.See <a href='https://fontawesome.com/icons/id-card?style=solid'>example</a>
         */
        ID_CARD,
        /**
         * The solid id-card-alt icon.See <a href='https://fontawesome.com/icons/id-card-alt?style=solid'>example</a>
         */
        ID_CARD_ALT,
        /**
         * The solid igloo icon.See <a href='https://fontawesome.com/icons/igloo?style=solid'>example</a>
         */
        IGLOO,
        /**
         * The solid image icon.See <a href='https://fontawesome.com/icons/image?style=solid'>example</a>
         */
        IMAGE,
        /**
         * The solid images icon.See <a href='https://fontawesome.com/icons/images?style=solid'>example</a>
         */
        IMAGES,
        /**
         * The solid inbox icon.See <a href='https://fontawesome.com/icons/inbox?style=solid'>example</a>
         */
        INBOX,
        /**
         * The solid indent icon.See <a href='https://fontawesome.com/icons/indent?style=solid'>example</a>
         */
        INDENT,
        /**
         * The solid industry icon.See <a href='https://fontawesome.com/icons/industry?style=solid'>example</a>
         */
        INDUSTRY,
        /**
         * The solid infinity icon.See <a href='https://fontawesome.com/icons/infinity?style=solid'>example</a>
         */
        INFINITY,
        /**
         * The solid info icon.See <a href='https://fontawesome.com/icons/info?style=solid'>example</a>
         */
        INFO,
        /**
         * The solid info-circle icon.See <a href='https://fontawesome.com/icons/info-circle?style=solid'>example</a>
         */
        INFO_CIRCLE,
        /**
         * The solid italic icon.See <a href='https://fontawesome.com/icons/italic?style=solid'>example</a>
         */
        ITALIC,
        /**
         * The solid jedi icon.See <a href='https://fontawesome.com/icons/jedi?style=solid'>example</a>
         */
        JEDI,
        /**
         * The solid joint icon.See <a href='https://fontawesome.com/icons/joint?style=solid'>example</a>
         */
        JOINT,
        /**
         * The solid journal-whills icon.See <a href='https://fontawesome.com/icons/journal-whills?style=solid'>example</a>
         */
        JOURNAL_WHILLS,
        /**
         * The solid kaaba icon.See <a href='https://fontawesome.com/icons/kaaba?style=solid'>example</a>
         */
        KAABA,
        /**
         * The solid key icon.See <a href='https://fontawesome.com/icons/key?style=solid'>example</a>
         */
        KEY,
        /**
         * The solid keyboard icon.See <a href='https://fontawesome.com/icons/keyboard?style=solid'>example</a>
         */
        KEYBOARD,
        /**
         * The solid khanda icon.See <a href='https://fontawesome.com/icons/khanda?style=solid'>example</a>
         */
        KHANDA,
        /**
         * The solid kiss icon.See <a href='https://fontawesome.com/icons/kiss?style=solid'>example</a>
         */
        KISS,
        /**
         * The solid kiss-beam icon.See <a href='https://fontawesome.com/icons/kiss-beam?style=solid'>example</a>
         */
        KISS_BEAM,
        /**
         * The solid kiss-wink-heart icon.See <a href='https://fontawesome.com/icons/kiss-wink-heart?style=solid'>example</a>
         */
        KISS_WINK_HEART,
        /**
         * The solid kiwi-bird icon.See <a href='https://fontawesome.com/icons/kiwi-bird?style=solid'>example</a>
         */
        KIWI_BIRD,
        /**
         * The solid landmark icon.See <a href='https://fontawesome.com/icons/landmark?style=solid'>example</a>
         */
        LANDMARK,
        /**
         * The solid language icon.See <a href='https://fontawesome.com/icons/language?style=solid'>example</a>
         */
        LANGUAGE,
        /**
         * The solid laptop icon.See <a href='https://fontawesome.com/icons/laptop?style=solid'>example</a>
         */
        LAPTOP,
        /**
         * The solid laptop-code icon.See <a href='https://fontawesome.com/icons/laptop-code?style=solid'>example</a>
         */
        LAPTOP_CODE,
        /**
         * The solid laptop-house icon.See <a href='https://fontawesome.com/icons/laptop-house?style=solid'>example</a>
         */
        LAPTOP_HOUSE,
        /**
         * The solid laptop-medical icon.See <a href='https://fontawesome.com/icons/laptop-medical?style=solid'>example</a>
         */
        LAPTOP_MEDICAL,
        /**
         * The solid laugh icon.See <a href='https://fontawesome.com/icons/laugh?style=solid'>example</a>
         */
        LAUGH,
        /**
         * The solid laugh-beam icon.See <a href='https://fontawesome.com/icons/laugh-beam?style=solid'>example</a>
         */
        LAUGH_BEAM,
        /**
         * The solid laugh-squint icon.See <a href='https://fontawesome.com/icons/laugh-squint?style=solid'>example</a>
         */
        LAUGH_SQUINT,
        /**
         * The solid laugh-wink icon.See <a href='https://fontawesome.com/icons/laugh-wink?style=solid'>example</a>
         */
        LAUGH_WINK,
        /**
         * The solid layer-group icon.See <a href='https://fontawesome.com/icons/layer-group?style=solid'>example</a>
         */
        LAYER_GROUP,
        /**
         * The solid leaf icon.See <a href='https://fontawesome.com/icons/leaf?style=solid'>example</a>
         */
        LEAF,
        /**
         * The solid lemon icon.See <a href='https://fontawesome.com/icons/lemon?style=solid'>example</a>
         */
        LEMON,
        /**
         * The solid less-than icon.See <a href='https://fontawesome.com/icons/less-than?style=solid'>example</a>
         */
        LESS_THAN,
        /**
         * The solid less-than-equal icon.See <a href='https://fontawesome.com/icons/less-than-equal?style=solid'>example</a>
         */
        LESS_THAN_EQUAL,
        /**
         * The solid level-down-alt icon.See <a href='https://fontawesome.com/icons/level-down-alt?style=solid'>example</a>
         */
        LEVEL_DOWN_ALT,
        /**
         * The solid level-up-alt icon.See <a href='https://fontawesome.com/icons/level-up-alt?style=solid'>example</a>
         */
        LEVEL_UP_ALT,
        /**
         * The solid life-ring icon.See <a href='https://fontawesome.com/icons/life-ring?style=solid'>example</a>
         */
        LIFE_RING,
        /**
         * The solid lightbulb icon.See <a href='https://fontawesome.com/icons/lightbulb?style=solid'>example</a>
         */
        LIGHTBULB,
        /**
         * The solid link icon.See <a href='https://fontawesome.com/icons/link?style=solid'>example</a>
         */
        LINK,
        /**
         * The solid lira-sign icon.See <a href='https://fontawesome.com/icons/lira-sign?style=solid'>example</a>
         */
        LIRA_SIGN,
        /**
         * The solid list icon.See <a href='https://fontawesome.com/icons/list?style=solid'>example</a>
         */
        LIST,
        /**
         * The solid list-alt icon.See <a href='https://fontawesome.com/icons/list-alt?style=solid'>example</a>
         */
        LIST_ALT,
        /**
         * The solid list-ol icon.See <a href='https://fontawesome.com/icons/list-ol?style=solid'>example</a>
         */
        LIST_OL,
        /**
         * The solid list-ul icon.See <a href='https://fontawesome.com/icons/list-ul?style=solid'>example</a>
         */
        LIST_UL,
        /**
         * The solid location-arrow icon.See <a href='https://fontawesome.com/icons/location-arrow?style=solid'>example</a>
         */
        LOCATION_ARROW,
        /**
         * The solid lock icon.See <a href='https://fontawesome.com/icons/lock?style=solid'>example</a>
         */
        LOCK,
        /**
         * The solid lock-open icon.See <a href='https://fontawesome.com/icons/lock-open?style=solid'>example</a>
         */
        LOCK_OPEN,
        /**
         * The solid long-arrow-alt-down icon.See <a href='https://fontawesome.com/icons/long-arrow-alt-down?style=solid'>example</a>
         */
        LONG_ARROW_ALT_DOWN,
        /**
         * The solid long-arrow-alt-left icon.See <a href='https://fontawesome.com/icons/long-arrow-alt-left?style=solid'>example</a>
         */
        LONG_ARROW_ALT_LEFT,
        /**
         * The solid long-arrow-alt-right icon.See <a href='https://fontawesome.com/icons/long-arrow-alt-right?style=solid'>example</a>
         */
        LONG_ARROW_ALT_RIGHT,
        /**
         * The solid long-arrow-alt-up icon.See <a href='https://fontawesome.com/icons/long-arrow-alt-up?style=solid'>example</a>
         */
        LONG_ARROW_ALT_UP,
        /**
         * The solid low-vision icon.See <a href='https://fontawesome.com/icons/low-vision?style=solid'>example</a>
         */
        LOW_VISION,
        /**
         * The solid luggage-cart icon.See <a href='https://fontawesome.com/icons/luggage-cart?style=solid'>example</a>
         */
        LUGGAGE_CART,
        /**
         * The solid lungs icon.See <a href='https://fontawesome.com/icons/lungs?style=solid'>example</a>
         */
        LUNGS,
        /**
         * The solid lungs-virus icon.See <a href='https://fontawesome.com/icons/lungs-virus?style=solid'>example</a>
         */
        LUNGS_VIRUS,
        /**
         * The solid magic icon.See <a href='https://fontawesome.com/icons/magic?style=solid'>example</a>
         */
        MAGIC,
        /**
         * The solid magnet icon.See <a href='https://fontawesome.com/icons/magnet?style=solid'>example</a>
         */
        MAGNET,
        /**
         * The solid mail-bulk icon.See <a href='https://fontawesome.com/icons/mail-bulk?style=solid'>example</a>
         */
        MAIL_BULK,
        /**
         * The solid male icon.See <a href='https://fontawesome.com/icons/male?style=solid'>example</a>
         */
        MALE,
        /**
         * The solid map icon.See <a href='https://fontawesome.com/icons/map?style=solid'>example</a>
         */
        MAP,
        /**
         * The solid map-marked icon.See <a href='https://fontawesome.com/icons/map-marked?style=solid'>example</a>
         */
        MAP_MARKED,
        /**
         * The solid map-marked-alt icon.See <a href='https://fontawesome.com/icons/map-marked-alt?style=solid'>example</a>
         */
        MAP_MARKED_ALT,
        /**
         * The solid map-marker icon.See <a href='https://fontawesome.com/icons/map-marker?style=solid'>example</a>
         */
        MAP_MARKER,
        /**
         * The solid map-marker-alt icon.See <a href='https://fontawesome.com/icons/map-marker-alt?style=solid'>example</a>
         */
        MAP_MARKER_ALT,
        /**
         * The solid map-pin icon.See <a href='https://fontawesome.com/icons/map-pin?style=solid'>example</a>
         */
        MAP_PIN,
        /**
         * The solid map-signs icon.See <a href='https://fontawesome.com/icons/map-signs?style=solid'>example</a>
         */
        MAP_SIGNS,
        /**
         * The solid marker icon.See <a href='https://fontawesome.com/icons/marker?style=solid'>example</a>
         */
        MARKER,
        /**
         * The solid mars icon.See <a href='https://fontawesome.com/icons/mars?style=solid'>example</a>
         */
        MARS,
        /**
         * The solid mars-double icon.See <a href='https://fontawesome.com/icons/mars-double?style=solid'>example</a>
         */
        MARS_DOUBLE,
        /**
         * The solid mars-stroke icon.See <a href='https://fontawesome.com/icons/mars-stroke?style=solid'>example</a>
         */
        MARS_STROKE,
        /**
         * The solid mars-stroke-h icon.See <a href='https://fontawesome.com/icons/mars-stroke-h?style=solid'>example</a>
         */
        MARS_STROKE_H,
        /**
         * The solid mars-stroke-v icon.See <a href='https://fontawesome.com/icons/mars-stroke-v?style=solid'>example</a>
         */
        MARS_STROKE_V,
        /**
         * The solid mask icon.See <a href='https://fontawesome.com/icons/mask?style=solid'>example</a>
         */
        MASK,
        /**
         * The solid medal icon.See <a href='https://fontawesome.com/icons/medal?style=solid'>example</a>
         */
        MEDAL,
        /**
         * The solid medkit icon.See <a href='https://fontawesome.com/icons/medkit?style=solid'>example</a>
         */
        MEDKIT,
        /**
         * The solid meh icon.See <a href='https://fontawesome.com/icons/meh?style=solid'>example</a>
         */
        MEH,
        /**
         * The solid meh-blank icon.See <a href='https://fontawesome.com/icons/meh-blank?style=solid'>example</a>
         */
        MEH_BLANK,
        /**
         * The solid meh-rolling-eyes icon.See <a href='https://fontawesome.com/icons/meh-rolling-eyes?style=solid'>example</a>
         */
        MEH_ROLLING_EYES,
        /**
         * The solid memory icon.See <a href='https://fontawesome.com/icons/memory?style=solid'>example</a>
         */
        MEMORY,
        /**
         * The solid menorah icon.See <a href='https://fontawesome.com/icons/menorah?style=solid'>example</a>
         */
        MENORAH,
        /**
         * The solid mercury icon.See <a href='https://fontawesome.com/icons/mercury?style=solid'>example</a>
         */
        MERCURY,
        /**
         * The solid meteor icon.See <a href='https://fontawesome.com/icons/meteor?style=solid'>example</a>
         */
        METEOR,
        /**
         * The solid microchip icon.See <a href='https://fontawesome.com/icons/microchip?style=solid'>example</a>
         */
        MICROCHIP,
        /**
         * The solid microphone icon.See <a href='https://fontawesome.com/icons/microphone?style=solid'>example</a>
         */
        MICROPHONE,
        /**
         * The solid microphone-alt icon.See <a href='https://fontawesome.com/icons/microphone-alt?style=solid'>example</a>
         */
        MICROPHONE_ALT,
        /**
         * The solid microphone-alt-slash icon.See <a href='https://fontawesome.com/icons/microphone-alt-slash?style=solid'>example</a>
         */
        MICROPHONE_ALT_SLASH,
        /**
         * The solid microphone-slash icon.See <a href='https://fontawesome.com/icons/microphone-slash?style=solid'>example</a>
         */
        MICROPHONE_SLASH,
        /**
         * The solid microscope icon.See <a href='https://fontawesome.com/icons/microscope?style=solid'>example</a>
         */
        MICROSCOPE,
        /**
         * The solid minus icon.See <a href='https://fontawesome.com/icons/minus?style=solid'>example</a>
         */
        MINUS,
        /**
         * The solid minus-circle icon.See <a href='https://fontawesome.com/icons/minus-circle?style=solid'>example</a>
         */
        MINUS_CIRCLE,
        /**
         * The solid minus-square icon.See <a href='https://fontawesome.com/icons/minus-square?style=solid'>example</a>
         */
        MINUS_SQUARE,
        /**
         * The solid mitten icon.See <a href='https://fontawesome.com/icons/mitten?style=solid'>example</a>
         */
        MITTEN,
        /**
         * The solid mobile icon.See <a href='https://fontawesome.com/icons/mobile?style=solid'>example</a>
         */
        MOBILE,
        /**
         * The solid mobile-alt icon.See <a href='https://fontawesome.com/icons/mobile-alt?style=solid'>example</a>
         */
        MOBILE_ALT,
        /**
         * The solid money-bill icon.See <a href='https://fontawesome.com/icons/money-bill?style=solid'>example</a>
         */
        MONEY_BILL,
        /**
         * The solid money-bill-alt icon.See <a href='https://fontawesome.com/icons/money-bill-alt?style=solid'>example</a>
         */
        MONEY_BILL_ALT,
        /**
         * The solid money-bill-wave icon.See <a href='https://fontawesome.com/icons/money-bill-wave?style=solid'>example</a>
         */
        MONEY_BILL_WAVE,
        /**
         * The solid money-bill-wave-alt icon.See <a href='https://fontawesome.com/icons/money-bill-wave-alt?style=solid'>example</a>
         */
        MONEY_BILL_WAVE_ALT,
        /**
         * The solid money-check icon.See <a href='https://fontawesome.com/icons/money-check?style=solid'>example</a>
         */
        MONEY_CHECK,
        /**
         * The solid money-check-alt icon.See <a href='https://fontawesome.com/icons/money-check-alt?style=solid'>example</a>
         */
        MONEY_CHECK_ALT,
        /**
         * The solid monument icon.See <a href='https://fontawesome.com/icons/monument?style=solid'>example</a>
         */
        MONUMENT,
        /**
         * The solid moon icon.See <a href='https://fontawesome.com/icons/moon?style=solid'>example</a>
         */
        MOON,
        /**
         * The solid mortar-pestle icon.See <a href='https://fontawesome.com/icons/mortar-pestle?style=solid'>example</a>
         */
        MORTAR_PESTLE,
        /**
         * The solid mosque icon.See <a href='https://fontawesome.com/icons/mosque?style=solid'>example</a>
         */
        MOSQUE,
        /**
         * The solid motorcycle icon.See <a href='https://fontawesome.com/icons/motorcycle?style=solid'>example</a>
         */
        MOTORCYCLE,
        /**
         * The solid mountain icon.See <a href='https://fontawesome.com/icons/mountain?style=solid'>example</a>
         */
        MOUNTAIN,
        /**
         * The solid mouse icon.See <a href='https://fontawesome.com/icons/mouse?style=solid'>example</a>
         */
        MOUSE,
        /**
         * The solid mouse-pointer icon.See <a href='https://fontawesome.com/icons/mouse-pointer?style=solid'>example</a>
         */
        MOUSE_POINTER,
        /**
         * The solid mug-hot icon.See <a href='https://fontawesome.com/icons/mug-hot?style=solid'>example</a>
         */
        MUG_HOT,
        /**
         * The solid music icon.See <a href='https://fontawesome.com/icons/music?style=solid'>example</a>
         */
        MUSIC,
        /**
         * The solid network-wired icon.See <a href='https://fontawesome.com/icons/network-wired?style=solid'>example</a>
         */
        NETWORK_WIRED,
        /**
         * The solid neuter icon.See <a href='https://fontawesome.com/icons/neuter?style=solid'>example</a>
         */
        NEUTER,
        /**
         * The solid newspaper icon.See <a href='https://fontawesome.com/icons/newspaper?style=solid'>example</a>
         */
        NEWSPAPER,
        /**
         * The solid not-equal icon.See <a href='https://fontawesome.com/icons/not-equal?style=solid'>example</a>
         */
        NOT_EQUAL,
        /**
         * The solid notes-medical icon.See <a href='https://fontawesome.com/icons/notes-medical?style=solid'>example</a>
         */
        NOTES_MEDICAL,
        /**
         * The solid object-group icon.See <a href='https://fontawesome.com/icons/object-group?style=solid'>example</a>
         */
        OBJECT_GROUP,
        /**
         * The solid object-ungroup icon.See <a href='https://fontawesome.com/icons/object-ungroup?style=solid'>example</a>
         */
        OBJECT_UNGROUP,
        /**
         * The solid oil-can icon.See <a href='https://fontawesome.com/icons/oil-can?style=solid'>example</a>
         */
        OIL_CAN,
        /**
         * The solid om icon.See <a href='https://fontawesome.com/icons/om?style=solid'>example</a>
         */
        OM,
        /**
         * The solid otter icon.See <a href='https://fontawesome.com/icons/otter?style=solid'>example</a>
         */
        OTTER,
        /**
         * The solid outdent icon.See <a href='https://fontawesome.com/icons/outdent?style=solid'>example</a>
         */
        OUTDENT,
        /**
         * The solid pager icon.See <a href='https://fontawesome.com/icons/pager?style=solid'>example</a>
         */
        PAGER,
        /**
         * The solid paint-brush icon.See <a href='https://fontawesome.com/icons/paint-brush?style=solid'>example</a>
         */
        PAINT_BRUSH,
        /**
         * The solid paint-roller icon.See <a href='https://fontawesome.com/icons/paint-roller?style=solid'>example</a>
         */
        PAINT_ROLLER,
        /**
         * The solid palette icon.See <a href='https://fontawesome.com/icons/palette?style=solid'>example</a>
         */
        PALETTE,
        /**
         * The solid pallet icon.See <a href='https://fontawesome.com/icons/pallet?style=solid'>example</a>
         */
        PALLET,
        /**
         * The solid paper-plane icon.See <a href='https://fontawesome.com/icons/paper-plane?style=solid'>example</a>
         */
        PAPER_PLANE,
        /**
         * The solid paperclip icon.See <a href='https://fontawesome.com/icons/paperclip?style=solid'>example</a>
         */
        PAPERCLIP,
        /**
         * The solid parachute-box icon.See <a href='https://fontawesome.com/icons/parachute-box?style=solid'>example</a>
         */
        PARACHUTE_BOX,
        /**
         * The solid paragraph icon.See <a href='https://fontawesome.com/icons/paragraph?style=solid'>example</a>
         */
        PARAGRAPH,
        /**
         * The solid parking icon.See <a href='https://fontawesome.com/icons/parking?style=solid'>example</a>
         */
        PARKING,
        /**
         * The solid passport icon.See <a href='https://fontawesome.com/icons/passport?style=solid'>example</a>
         */
        PASSPORT,
        /**
         * The solid pastafarianism icon.See <a href='https://fontawesome.com/icons/pastafarianism?style=solid'>example</a>
         */
        PASTAFARIANISM,
        /**
         * The solid paste icon.See <a href='https://fontawesome.com/icons/paste?style=solid'>example</a>
         */
        PASTE,
        /**
         * The solid pause icon.See <a href='https://fontawesome.com/icons/pause?style=solid'>example</a>
         */
        PAUSE,
        /**
         * The solid pause-circle icon.See <a href='https://fontawesome.com/icons/pause-circle?style=solid'>example</a>
         */
        PAUSE_CIRCLE,
        /**
         * The solid paw icon.See <a href='https://fontawesome.com/icons/paw?style=solid'>example</a>
         */
        PAW,
        /**
         * The solid peace icon.See <a href='https://fontawesome.com/icons/peace?style=solid'>example</a>
         */
        PEACE,
        /**
         * The solid pen icon.See <a href='https://fontawesome.com/icons/pen?style=solid'>example</a>
         */
        PEN,
        /**
         * The solid pen-alt icon.See <a href='https://fontawesome.com/icons/pen-alt?style=solid'>example</a>
         */
        PEN_ALT,
        /**
         * The solid pen-fancy icon.See <a href='https://fontawesome.com/icons/pen-fancy?style=solid'>example</a>
         */
        PEN_FANCY,
        /**
         * The solid pen-nib icon.See <a href='https://fontawesome.com/icons/pen-nib?style=solid'>example</a>
         */
        PEN_NIB,
        /**
         * The solid pen-square icon.See <a href='https://fontawesome.com/icons/pen-square?style=solid'>example</a>
         */
        PEN_SQUARE,
        /**
         * The solid pencil-alt icon.See <a href='https://fontawesome.com/icons/pencil-alt?style=solid'>example</a>
         */
        PENCIL_ALT,
        /**
         * The solid pencil-ruler icon.See <a href='https://fontawesome.com/icons/pencil-ruler?style=solid'>example</a>
         */
        PENCIL_RULER,
        /**
         * The solid people-arrows icon.See <a href='https://fontawesome.com/icons/people-arrows?style=solid'>example</a>
         */
        PEOPLE_ARROWS,
        /**
         * The solid people-carry icon.See <a href='https://fontawesome.com/icons/people-carry?style=solid'>example</a>
         */
        PEOPLE_CARRY,
        /**
         * The solid pepper-hot icon.See <a href='https://fontawesome.com/icons/pepper-hot?style=solid'>example</a>
         */
        PEPPER_HOT,
        /**
         * The solid percent icon.See <a href='https://fontawesome.com/icons/percent?style=solid'>example</a>
         */
        PERCENT,
        /**
         * The solid percentage icon.See <a href='https://fontawesome.com/icons/percentage?style=solid'>example</a>
         */
        PERCENTAGE,
        /**
         * The solid person-booth icon.See <a href='https://fontawesome.com/icons/person-booth?style=solid'>example</a>
         */
        PERSON_BOOTH,
        /**
         * The solid phone icon.See <a href='https://fontawesome.com/icons/phone?style=solid'>example</a>
         */
        PHONE,
        /**
         * The solid phone-alt icon.See <a href='https://fontawesome.com/icons/phone-alt?style=solid'>example</a>
         */
        PHONE_ALT,
        /**
         * The solid phone-slash icon.See <a href='https://fontawesome.com/icons/phone-slash?style=solid'>example</a>
         */
        PHONE_SLASH,
        /**
         * The solid phone-square icon.See <a href='https://fontawesome.com/icons/phone-square?style=solid'>example</a>
         */
        PHONE_SQUARE,
        /**
         * The solid phone-square-alt icon.See <a href='https://fontawesome.com/icons/phone-square-alt?style=solid'>example</a>
         */
        PHONE_SQUARE_ALT,
        /**
         * The solid phone-volume icon.See <a href='https://fontawesome.com/icons/phone-volume?style=solid'>example</a>
         */
        PHONE_VOLUME,
        /**
         * The solid photo-video icon.See <a href='https://fontawesome.com/icons/photo-video?style=solid'>example</a>
         */
        PHOTO_VIDEO,
        /**
         * The solid piggy-bank icon.See <a href='https://fontawesome.com/icons/piggy-bank?style=solid'>example</a>
         */
        PIGGY_BANK,
        /**
         * The solid pills icon.See <a href='https://fontawesome.com/icons/pills?style=solid'>example</a>
         */
        PILLS,
        /**
         * The solid pizza-slice icon.See <a href='https://fontawesome.com/icons/pizza-slice?style=solid'>example</a>
         */
        PIZZA_SLICE,
        /**
         * The solid place-of-worship icon.See <a href='https://fontawesome.com/icons/place-of-worship?style=solid'>example</a>
         */
        PLACE_OF_WORSHIP,
        /**
         * The solid plane icon.See <a href='https://fontawesome.com/icons/plane?style=solid'>example</a>
         */
        PLANE,
        /**
         * The solid plane-arrival icon.See <a href='https://fontawesome.com/icons/plane-arrival?style=solid'>example</a>
         */
        PLANE_ARRIVAL,
        /**
         * The solid plane-departure icon.See <a href='https://fontawesome.com/icons/plane-departure?style=solid'>example</a>
         */
        PLANE_DEPARTURE,
        /**
         * The solid plane-slash icon.See <a href='https://fontawesome.com/icons/plane-slash?style=solid'>example</a>
         */
        PLANE_SLASH,
        /**
         * The solid play icon.See <a href='https://fontawesome.com/icons/play?style=solid'>example</a>
         */
        PLAY,
        /**
         * The solid play-circle icon.See <a href='https://fontawesome.com/icons/play-circle?style=solid'>example</a>
         */
        PLAY_CIRCLE,
        /**
         * The solid plug icon.See <a href='https://fontawesome.com/icons/plug?style=solid'>example</a>
         */
        PLUG,
        /**
         * The solid plus icon.See <a href='https://fontawesome.com/icons/plus?style=solid'>example</a>
         */
        PLUS,
        /**
         * The solid plus-circle icon.See <a href='https://fontawesome.com/icons/plus-circle?style=solid'>example</a>
         */
        PLUS_CIRCLE,
        /**
         * The solid plus-square icon.See <a href='https://fontawesome.com/icons/plus-square?style=solid'>example</a>
         */
        PLUS_SQUARE,
        /**
         * The solid podcast icon.See <a href='https://fontawesome.com/icons/podcast?style=solid'>example</a>
         */
        PODCAST,
        /**
         * The solid poll icon.See <a href='https://fontawesome.com/icons/poll?style=solid'>example</a>
         */
        POLL,
        /**
         * The solid poll-h icon.See <a href='https://fontawesome.com/icons/poll-h?style=solid'>example</a>
         */
        POLL_H,
        /**
         * The solid poo icon.See <a href='https://fontawesome.com/icons/poo?style=solid'>example</a>
         */
        POO,
        /**
         * The solid poo-storm icon.See <a href='https://fontawesome.com/icons/poo-storm?style=solid'>example</a>
         */
        POO_STORM,
        /**
         * The solid poop icon.See <a href='https://fontawesome.com/icons/poop?style=solid'>example</a>
         */
        POOP,
        /**
         * The solid portrait icon.See <a href='https://fontawesome.com/icons/portrait?style=solid'>example</a>
         */
        PORTRAIT,
        /**
         * The solid pound-sign icon.See <a href='https://fontawesome.com/icons/pound-sign?style=solid'>example</a>
         */
        POUND_SIGN,
        /**
         * The solid power-off icon.See <a href='https://fontawesome.com/icons/power-off?style=solid'>example</a>
         */
        POWER_OFF,
        /**
         * The solid pray icon.See <a href='https://fontawesome.com/icons/pray?style=solid'>example</a>
         */
        PRAY,
        /**
         * The solid praying-hands icon.See <a href='https://fontawesome.com/icons/praying-hands?style=solid'>example</a>
         */
        PRAYING_HANDS,
        /**
         * The solid prescription icon.See <a href='https://fontawesome.com/icons/prescription?style=solid'>example</a>
         */
        PRESCRIPTION,
        /**
         * The solid prescription-bottle icon.See <a href='https://fontawesome.com/icons/prescription-bottle?style=solid'>example</a>
         */
        PRESCRIPTION_BOTTLE,
        /**
         * The solid prescription-bottle-alt icon.See <a href='https://fontawesome.com/icons/prescription-bottle-alt?style=solid'>example</a>
         */
        PRESCRIPTION_BOTTLE_ALT,
        /**
         * The solid print icon.See <a href='https://fontawesome.com/icons/print?style=solid'>example</a>
         */
        PRINT,
        /**
         * The solid procedures icon.See <a href='https://fontawesome.com/icons/procedures?style=solid'>example</a>
         */
        PROCEDURES,
        /**
         * The solid project-diagram icon.See <a href='https://fontawesome.com/icons/project-diagram?style=solid'>example</a>
         */
        PROJECT_DIAGRAM,
        /**
         * The solid pump-medical icon.See <a href='https://fontawesome.com/icons/pump-medical?style=solid'>example</a>
         */
        PUMP_MEDICAL,
        /**
         * The solid pump-soap icon.See <a href='https://fontawesome.com/icons/pump-soap?style=solid'>example</a>
         */
        PUMP_SOAP,
        /**
         * The solid puzzle-piece icon.See <a href='https://fontawesome.com/icons/puzzle-piece?style=solid'>example</a>
         */
        PUZZLE_PIECE,
        /**
         * The solid qrcode icon.See <a href='https://fontawesome.com/icons/qrcode?style=solid'>example</a>
         */
        QRCODE,
        /**
         * The solid question icon.See <a href='https://fontawesome.com/icons/question?style=solid'>example</a>
         */
        QUESTION,
        /**
         * The solid question-circle icon.See <a href='https://fontawesome.com/icons/question-circle?style=solid'>example</a>
         */
        QUESTION_CIRCLE,
        /**
         * The solid quidditch icon.See <a href='https://fontawesome.com/icons/quidditch?style=solid'>example</a>
         */
        QUIDDITCH,
        /**
         * The solid quote-left icon.See <a href='https://fontawesome.com/icons/quote-left?style=solid'>example</a>
         */
        QUOTE_LEFT,
        /**
         * The solid quote-right icon.See <a href='https://fontawesome.com/icons/quote-right?style=solid'>example</a>
         */
        QUOTE_RIGHT,
        /**
         * The solid quran icon.See <a href='https://fontawesome.com/icons/quran?style=solid'>example</a>
         */
        QURAN,
        /**
         * The solid radiation icon.See <a href='https://fontawesome.com/icons/radiation?style=solid'>example</a>
         */
        RADIATION,
        /**
         * The solid radiation-alt icon.See <a href='https://fontawesome.com/icons/radiation-alt?style=solid'>example</a>
         */
        RADIATION_ALT,
        /**
         * The solid rainbow icon.See <a href='https://fontawesome.com/icons/rainbow?style=solid'>example</a>
         */
        RAINBOW,
        /**
         * The solid random icon.See <a href='https://fontawesome.com/icons/random?style=solid'>example</a>
         */
        RANDOM,
        /**
         * The solid receipt icon.See <a href='https://fontawesome.com/icons/receipt?style=solid'>example</a>
         */
        RECEIPT,
        /**
         * The solid record-vinyl icon.See <a href='https://fontawesome.com/icons/record-vinyl?style=solid'>example</a>
         */
        RECORD_VINYL,
        /**
         * The solid recycle icon.See <a href='https://fontawesome.com/icons/recycle?style=solid'>example</a>
         */
        RECYCLE,
        /**
         * The solid redo icon.See <a href='https://fontawesome.com/icons/redo?style=solid'>example</a>
         */
        REDO,
        /**
         * The solid redo-alt icon.See <a href='https://fontawesome.com/icons/redo-alt?style=solid'>example</a>
         */
        REDO_ALT,
        /**
         * The solid registered icon.See <a href='https://fontawesome.com/icons/registered?style=solid'>example</a>
         */
        REGISTERED,
        /**
         * The solid remove-format icon.See <a href='https://fontawesome.com/icons/remove-format?style=solid'>example</a>
         */
        REMOVE_FORMAT,
        /**
         * The solid reply icon.See <a href='https://fontawesome.com/icons/reply?style=solid'>example</a>
         */
        REPLY,
        /**
         * The solid reply-all icon.See <a href='https://fontawesome.com/icons/reply-all?style=solid'>example</a>
         */
        REPLY_ALL,
        /**
         * The solid republican icon.See <a href='https://fontawesome.com/icons/republican?style=solid'>example</a>
         */
        REPUBLICAN,
        /**
         * The solid restroom icon.See <a href='https://fontawesome.com/icons/restroom?style=solid'>example</a>
         */
        RESTROOM,
        /**
         * The solid retweet icon.See <a href='https://fontawesome.com/icons/retweet?style=solid'>example</a>
         */
        RETWEET,
        /**
         * The solid ribbon icon.See <a href='https://fontawesome.com/icons/ribbon?style=solid'>example</a>
         */
        RIBBON,
        /**
         * The solid ring icon.See <a href='https://fontawesome.com/icons/ring?style=solid'>example</a>
         */
        RING,
        /**
         * The solid road icon.See <a href='https://fontawesome.com/icons/road?style=solid'>example</a>
         */
        ROAD,
        /**
         * The solid robot icon.See <a href='https://fontawesome.com/icons/robot?style=solid'>example</a>
         */
        ROBOT,
        /**
         * The solid rocket icon.See <a href='https://fontawesome.com/icons/rocket?style=solid'>example</a>
         */
        ROCKET,
        /**
         * The solid route icon.See <a href='https://fontawesome.com/icons/route?style=solid'>example</a>
         */
        ROUTE,
        /**
         * The solid rss icon.See <a href='https://fontawesome.com/icons/rss?style=solid'>example</a>
         */
        RSS,
        /**
         * The solid rss-square icon.See <a href='https://fontawesome.com/icons/rss-square?style=solid'>example</a>
         */
        RSS_SQUARE,
        /**
         * The solid ruble-sign icon.See <a href='https://fontawesome.com/icons/ruble-sign?style=solid'>example</a>
         */
        RUBLE_SIGN,
        /**
         * The solid ruler icon.See <a href='https://fontawesome.com/icons/ruler?style=solid'>example</a>
         */
        RULER,
        /**
         * The solid ruler-combined icon.See <a href='https://fontawesome.com/icons/ruler-combined?style=solid'>example</a>
         */
        RULER_COMBINED,
        /**
         * The solid ruler-horizontal icon.See <a href='https://fontawesome.com/icons/ruler-horizontal?style=solid'>example</a>
         */
        RULER_HORIZONTAL,
        /**
         * The solid ruler-vertical icon.See <a href='https://fontawesome.com/icons/ruler-vertical?style=solid'>example</a>
         */
        RULER_VERTICAL,
        /**
         * The solid running icon.See <a href='https://fontawesome.com/icons/running?style=solid'>example</a>
         */
        RUNNING,
        /**
         * The solid rupee-sign icon.See <a href='https://fontawesome.com/icons/rupee-sign?style=solid'>example</a>
         */
        RUPEE_SIGN,
        /**
         * The solid sad-cry icon.See <a href='https://fontawesome.com/icons/sad-cry?style=solid'>example</a>
         */
        SAD_CRY,
        /**
         * The solid sad-tear icon.See <a href='https://fontawesome.com/icons/sad-tear?style=solid'>example</a>
         */
        SAD_TEAR,
        /**
         * The solid satellite icon.See <a href='https://fontawesome.com/icons/satellite?style=solid'>example</a>
         */
        SATELLITE,
        /**
         * The solid satellite-dish icon.See <a href='https://fontawesome.com/icons/satellite-dish?style=solid'>example</a>
         */
        SATELLITE_DISH,
        /**
         * The solid save icon.See <a href='https://fontawesome.com/icons/save?style=solid'>example</a>
         */
        SAVE,
        /**
         * The solid school icon.See <a href='https://fontawesome.com/icons/school?style=solid'>example</a>
         */
        SCHOOL,
        /**
         * The solid screwdriver icon.See <a href='https://fontawesome.com/icons/screwdriver?style=solid'>example</a>
         */
        SCREWDRIVER,
        /**
         * The solid scroll icon.See <a href='https://fontawesome.com/icons/scroll?style=solid'>example</a>
         */
        SCROLL,
        /**
         * The solid sd-card icon.See <a href='https://fontawesome.com/icons/sd-card?style=solid'>example</a>
         */
        SD_CARD,
        /**
         * The solid search icon.See <a href='https://fontawesome.com/icons/search?style=solid'>example</a>
         */
        SEARCH,
        /**
         * The solid search-dollar icon.See <a href='https://fontawesome.com/icons/search-dollar?style=solid'>example</a>
         */
        SEARCH_DOLLAR,
        /**
         * The solid search-location icon.See <a href='https://fontawesome.com/icons/search-location?style=solid'>example</a>
         */
        SEARCH_LOCATION,
        /**
         * The solid search-minus icon.See <a href='https://fontawesome.com/icons/search-minus?style=solid'>example</a>
         */
        SEARCH_MINUS,
        /**
         * The solid search-plus icon.See <a href='https://fontawesome.com/icons/search-plus?style=solid'>example</a>
         */
        SEARCH_PLUS,
        /**
         * The solid seedling icon.See <a href='https://fontawesome.com/icons/seedling?style=solid'>example</a>
         */
        SEEDLING,
        /**
         * The solid server icon.See <a href='https://fontawesome.com/icons/server?style=solid'>example</a>
         */
        SERVER,
        /**
         * The solid shapes icon.See <a href='https://fontawesome.com/icons/shapes?style=solid'>example</a>
         */
        SHAPES,
        /**
         * The solid share icon.See <a href='https://fontawesome.com/icons/share?style=solid'>example</a>
         */
        SHARE,
        /**
         * The solid share-alt icon.See <a href='https://fontawesome.com/icons/share-alt?style=solid'>example</a>
         */
        SHARE_ALT,
        /**
         * The solid share-alt-square icon.See <a href='https://fontawesome.com/icons/share-alt-square?style=solid'>example</a>
         */
        SHARE_ALT_SQUARE,
        /**
         * The solid share-square icon.See <a href='https://fontawesome.com/icons/share-square?style=solid'>example</a>
         */
        SHARE_SQUARE,
        /**
         * The solid shekel-sign icon.See <a href='https://fontawesome.com/icons/shekel-sign?style=solid'>example</a>
         */
        SHEKEL_SIGN,
        /**
         * The solid shield-alt icon.See <a href='https://fontawesome.com/icons/shield-alt?style=solid'>example</a>
         */
        SHIELD_ALT,
        /**
         * The solid shield-virus icon.See <a href='https://fontawesome.com/icons/shield-virus?style=solid'>example</a>
         */
        SHIELD_VIRUS,
        /**
         * The solid ship icon.See <a href='https://fontawesome.com/icons/ship?style=solid'>example</a>
         */
        SHIP,
        /**
         * The solid shipping-fast icon.See <a href='https://fontawesome.com/icons/shipping-fast?style=solid'>example</a>
         */
        SHIPPING_FAST,
        /**
         * The solid shoe-prints icon.See <a href='https://fontawesome.com/icons/shoe-prints?style=solid'>example</a>
         */
        SHOE_PRINTS,
        /**
         * The solid shopping-bag icon.See <a href='https://fontawesome.com/icons/shopping-bag?style=solid'>example</a>
         */
        SHOPPING_BAG,
        /**
         * The solid shopping-basket icon.See <a href='https://fontawesome.com/icons/shopping-basket?style=solid'>example</a>
         */
        SHOPPING_BASKET,
        /**
         * The solid shopping-cart icon.See <a href='https://fontawesome.com/icons/shopping-cart?style=solid'>example</a>
         */
        SHOPPING_CART,
        /**
         * The solid shower icon.See <a href='https://fontawesome.com/icons/shower?style=solid'>example</a>
         */
        SHOWER,
        /**
         * The solid shuttle-van icon.See <a href='https://fontawesome.com/icons/shuttle-van?style=solid'>example</a>
         */
        SHUTTLE_VAN,
        /**
         * The solid sign icon.See <a href='https://fontawesome.com/icons/sign?style=solid'>example</a>
         */
        SIGN,
        /**
         * The solid sign-in-alt icon.See <a href='https://fontawesome.com/icons/sign-in-alt?style=solid'>example</a>
         */
        SIGN_IN_ALT,
        /**
         * The solid sign-language icon.See <a href='https://fontawesome.com/icons/sign-language?style=solid'>example</a>
         */
        SIGN_LANGUAGE,
        /**
         * The solid sign-out-alt icon.See <a href='https://fontawesome.com/icons/sign-out-alt?style=solid'>example</a>
         */
        SIGN_OUT_ALT,
        /**
         * The solid signal icon.See <a href='https://fontawesome.com/icons/signal?style=solid'>example</a>
         */
        SIGNAL,
        /**
         * The solid signature icon.See <a href='https://fontawesome.com/icons/signature?style=solid'>example</a>
         */
        SIGNATURE,
        /**
         * The solid sim-card icon.See <a href='https://fontawesome.com/icons/sim-card?style=solid'>example</a>
         */
        SIM_CARD,
        /**
         * The solid sink icon.See <a href='https://fontawesome.com/icons/sink?style=solid'>example</a>
         */
        SINK,
        /**
         * The solid sitemap icon.See <a href='https://fontawesome.com/icons/sitemap?style=solid'>example</a>
         */
        SITEMAP,
        /**
         * The solid skating icon.See <a href='https://fontawesome.com/icons/skating?style=solid'>example</a>
         */
        SKATING,
        /**
         * The solid skiing icon.See <a href='https://fontawesome.com/icons/skiing?style=solid'>example</a>
         */
        SKIING,
        /**
         * The solid skiing-nordic icon.See <a href='https://fontawesome.com/icons/skiing-nordic?style=solid'>example</a>
         */
        SKIING_NORDIC,
        /**
         * The solid skull icon.See <a href='https://fontawesome.com/icons/skull?style=solid'>example</a>
         */
        SKULL,
        /**
         * The solid skull-crossbones icon.See <a href='https://fontawesome.com/icons/skull-crossbones?style=solid'>example</a>
         */
        SKULL_CROSSBONES,
        /**
         * The solid slash icon.See <a href='https://fontawesome.com/icons/slash?style=solid'>example</a>
         */
        SLASH,
        /**
         * The solid sleigh icon.See <a href='https://fontawesome.com/icons/sleigh?style=solid'>example</a>
         */
        SLEIGH,
        /**
         * The solid sliders-h icon.See <a href='https://fontawesome.com/icons/sliders-h?style=solid'>example</a>
         */
        SLIDERS_H,
        /**
         * The solid smile icon.See <a href='https://fontawesome.com/icons/smile?style=solid'>example</a>
         */
        SMILE,
        /**
         * The solid smile-beam icon.See <a href='https://fontawesome.com/icons/smile-beam?style=solid'>example</a>
         */
        SMILE_BEAM,
        /**
         * The solid smile-wink icon.See <a href='https://fontawesome.com/icons/smile-wink?style=solid'>example</a>
         */
        SMILE_WINK,
        /**
         * The solid smog icon.See <a href='https://fontawesome.com/icons/smog?style=solid'>example</a>
         */
        SMOG,
        /**
         * The solid smoking icon.See <a href='https://fontawesome.com/icons/smoking?style=solid'>example</a>
         */
        SMOKING,
        /**
         * The solid smoking-ban icon.See <a href='https://fontawesome.com/icons/smoking-ban?style=solid'>example</a>
         */
        SMOKING_BAN,
        /**
         * The solid sms icon.See <a href='https://fontawesome.com/icons/sms?style=solid'>example</a>
         */
        SMS,
        /**
         * The solid snowboarding icon.See <a href='https://fontawesome.com/icons/snowboarding?style=solid'>example</a>
         */
        SNOWBOARDING,
        /**
         * The solid snowflake icon.See <a href='https://fontawesome.com/icons/snowflake?style=solid'>example</a>
         */
        SNOWFLAKE,
        /**
         * The solid snowman icon.See <a href='https://fontawesome.com/icons/snowman?style=solid'>example</a>
         */
        SNOWMAN,
        /**
         * The solid snowplow icon.See <a href='https://fontawesome.com/icons/snowplow?style=solid'>example</a>
         */
        SNOWPLOW,
        /**
         * The solid soap icon.See <a href='https://fontawesome.com/icons/soap?style=solid'>example</a>
         */
        SOAP,
        /**
         * The solid socks icon.See <a href='https://fontawesome.com/icons/socks?style=solid'>example</a>
         */
        SOCKS,
        /**
         * The solid solar-panel icon.See <a href='https://fontawesome.com/icons/solar-panel?style=solid'>example</a>
         */
        SOLAR_PANEL,
        /**
         * The solid sort icon.See <a href='https://fontawesome.com/icons/sort?style=solid'>example</a>
         */
        SORT,
        /**
         * The solid sort-alpha-down icon.See <a href='https://fontawesome.com/icons/sort-alpha-down?style=solid'>example</a>
         */
        SORT_ALPHA_DOWN,
        /**
         * The solid sort-alpha-down-alt icon.See <a href='https://fontawesome.com/icons/sort-alpha-down-alt?style=solid'>example</a>
         */
        SORT_ALPHA_DOWN_ALT,
        /**
         * The solid sort-alpha-up icon.See <a href='https://fontawesome.com/icons/sort-alpha-up?style=solid'>example</a>
         */
        SORT_ALPHA_UP,
        /**
         * The solid sort-alpha-up-alt icon.See <a href='https://fontawesome.com/icons/sort-alpha-up-alt?style=solid'>example</a>
         */
        SORT_ALPHA_UP_ALT,
        /**
         * The solid sort-amount-down icon.See <a href='https://fontawesome.com/icons/sort-amount-down?style=solid'>example</a>
         */
        SORT_AMOUNT_DOWN,
        /**
         * The solid sort-amount-down-alt icon.See <a href='https://fontawesome.com/icons/sort-amount-down-alt?style=solid'>example</a>
         */
        SORT_AMOUNT_DOWN_ALT,
        /**
         * The solid sort-amount-up icon.See <a href='https://fontawesome.com/icons/sort-amount-up?style=solid'>example</a>
         */
        SORT_AMOUNT_UP,
        /**
         * The solid sort-amount-up-alt icon.See <a href='https://fontawesome.com/icons/sort-amount-up-alt?style=solid'>example</a>
         */
        SORT_AMOUNT_UP_ALT,
        /**
         * The solid sort-down icon.See <a href='https://fontawesome.com/icons/sort-down?style=solid'>example</a>
         */
        SORT_DOWN,
        /**
         * The solid sort-numeric-down icon.See <a href='https://fontawesome.com/icons/sort-numeric-down?style=solid'>example</a>
         */
        SORT_NUMERIC_DOWN,
        /**
         * The solid sort-numeric-down-alt icon.See <a href='https://fontawesome.com/icons/sort-numeric-down-alt?style=solid'>example</a>
         */
        SORT_NUMERIC_DOWN_ALT,
        /**
         * The solid sort-numeric-up icon.See <a href='https://fontawesome.com/icons/sort-numeric-up?style=solid'>example</a>
         */
        SORT_NUMERIC_UP,
        /**
         * The solid sort-numeric-up-alt icon.See <a href='https://fontawesome.com/icons/sort-numeric-up-alt?style=solid'>example</a>
         */
        SORT_NUMERIC_UP_ALT,
        /**
         * The solid sort-up icon.See <a href='https://fontawesome.com/icons/sort-up?style=solid'>example</a>
         */
        SORT_UP,
        /**
         * The solid spa icon.See <a href='https://fontawesome.com/icons/spa?style=solid'>example</a>
         */
        SPA,
        /**
         * The solid space-shuttle icon.See <a href='https://fontawesome.com/icons/space-shuttle?style=solid'>example</a>
         */
        SPACE_SHUTTLE,
        /**
         * The solid spell-check icon.See <a href='https://fontawesome.com/icons/spell-check?style=solid'>example</a>
         */
        SPELL_CHECK,
        /**
         * The solid spider icon.See <a href='https://fontawesome.com/icons/spider?style=solid'>example</a>
         */
        SPIDER,
        /**
         * The solid spinner icon.See <a href='https://fontawesome.com/icons/spinner?style=solid'>example</a>
         */
        SPINNER,
        /**
         * The solid splotch icon.See <a href='https://fontawesome.com/icons/splotch?style=solid'>example</a>
         */
        SPLOTCH,
        /**
         * The solid spray-can icon.See <a href='https://fontawesome.com/icons/spray-can?style=solid'>example</a>
         */
        SPRAY_CAN,
        /**
         * The solid square icon.See <a href='https://fontawesome.com/icons/square?style=solid'>example</a>
         */
        SQUARE,
        /**
         * The solid square-full icon.See <a href='https://fontawesome.com/icons/square-full?style=solid'>example</a>
         */
        SQUARE_FULL,
        /**
         * The solid square-root-alt icon.See <a href='https://fontawesome.com/icons/square-root-alt?style=solid'>example</a>
         */
        SQUARE_ROOT_ALT,
        /**
         * The solid stamp icon.See <a href='https://fontawesome.com/icons/stamp?style=solid'>example</a>
         */
        STAMP,
        /**
         * The solid star icon.See <a href='https://fontawesome.com/icons/star?style=solid'>example</a>
         */
        STAR,
        /**
         * The solid star-and-crescent icon.See <a href='https://fontawesome.com/icons/star-and-crescent?style=solid'>example</a>
         */
        STAR_AND_CRESCENT,
        /**
         * The solid star-half icon.See <a href='https://fontawesome.com/icons/star-half?style=solid'>example</a>
         */
        STAR_HALF,
        /**
         * The solid star-half-alt icon.See <a href='https://fontawesome.com/icons/star-half-alt?style=solid'>example</a>
         */
        STAR_HALF_ALT,
        /**
         * The solid star-of-david icon.See <a href='https://fontawesome.com/icons/star-of-david?style=solid'>example</a>
         */
        STAR_OF_DAVID,
        /**
         * The solid star-of-life icon.See <a href='https://fontawesome.com/icons/star-of-life?style=solid'>example</a>
         */
        STAR_OF_LIFE,
        /**
         * The solid step-backward icon.See <a href='https://fontawesome.com/icons/step-backward?style=solid'>example</a>
         */
        STEP_BACKWARD,
        /**
         * The solid step-forward icon.See <a href='https://fontawesome.com/icons/step-forward?style=solid'>example</a>
         */
        STEP_FORWARD,
        /**
         * The solid stethoscope icon.See <a href='https://fontawesome.com/icons/stethoscope?style=solid'>example</a>
         */
        STETHOSCOPE,
        /**
         * The solid sticky-note icon.See <a href='https://fontawesome.com/icons/sticky-note?style=solid'>example</a>
         */
        STICKY_NOTE,
        /**
         * The solid stop icon.See <a href='https://fontawesome.com/icons/stop?style=solid'>example</a>
         */
        STOP,
        /**
         * The solid stop-circle icon.See <a href='https://fontawesome.com/icons/stop-circle?style=solid'>example</a>
         */
        STOP_CIRCLE,
        /**
         * The solid stopwatch icon.See <a href='https://fontawesome.com/icons/stopwatch?style=solid'>example</a>
         */
        STOPWATCH,
        /**
         * The solid stopwatch-20 icon.See <a href='https://fontawesome.com/icons/stopwatch-20?style=solid'>example</a>
         */
        STOPWATCH_20,
        /**
         * The solid store icon.See <a href='https://fontawesome.com/icons/store?style=solid'>example</a>
         */
        STORE,
        /**
         * The solid store-alt icon.See <a href='https://fontawesome.com/icons/store-alt?style=solid'>example</a>
         */
        STORE_ALT,
        /**
         * The solid store-alt-slash icon.See <a href='https://fontawesome.com/icons/store-alt-slash?style=solid'>example</a>
         */
        STORE_ALT_SLASH,
        /**
         * The solid store-slash icon.See <a href='https://fontawesome.com/icons/store-slash?style=solid'>example</a>
         */
        STORE_SLASH,
        /**
         * The solid stream icon.See <a href='https://fontawesome.com/icons/stream?style=solid'>example</a>
         */
        STREAM,
        /**
         * The solid street-view icon.See <a href='https://fontawesome.com/icons/street-view?style=solid'>example</a>
         */
        STREET_VIEW,
        /**
         * The solid strikethrough icon.See <a href='https://fontawesome.com/icons/strikethrough?style=solid'>example</a>
         */
        STRIKETHROUGH,
        /**
         * The solid stroopwafel icon.See <a href='https://fontawesome.com/icons/stroopwafel?style=solid'>example</a>
         */
        STROOPWAFEL,
        /**
         * The solid subscript icon.See <a href='https://fontawesome.com/icons/subscript?style=solid'>example</a>
         */
        SUBSCRIPT,
        /**
         * The solid subway icon.See <a href='https://fontawesome.com/icons/subway?style=solid'>example</a>
         */
        SUBWAY,
        /**
         * The solid suitcase icon.See <a href='https://fontawesome.com/icons/suitcase?style=solid'>example</a>
         */
        SUITCASE,
        /**
         * The solid suitcase-rolling icon.See <a href='https://fontawesome.com/icons/suitcase-rolling?style=solid'>example</a>
         */
        SUITCASE_ROLLING,
        /**
         * The solid sun icon.See <a href='https://fontawesome.com/icons/sun?style=solid'>example</a>
         */
        SUN,
        /**
         * The solid superscript icon.See <a href='https://fontawesome.com/icons/superscript?style=solid'>example</a>
         */
        SUPERSCRIPT,
        /**
         * The solid surprise icon.See <a href='https://fontawesome.com/icons/surprise?style=solid'>example</a>
         */
        SURPRISE,
        /**
         * The solid swatchbook icon.See <a href='https://fontawesome.com/icons/swatchbook?style=solid'>example</a>
         */
        SWATCHBOOK,
        /**
         * The solid swimmer icon.See <a href='https://fontawesome.com/icons/swimmer?style=solid'>example</a>
         */
        SWIMMER,
        /**
         * The solid swimming-pool icon.See <a href='https://fontawesome.com/icons/swimming-pool?style=solid'>example</a>
         */
        SWIMMING_POOL,
        /**
         * The solid synagogue icon.See <a href='https://fontawesome.com/icons/synagogue?style=solid'>example</a>
         */
        SYNAGOGUE,
        /**
         * The solid sync icon.See <a href='https://fontawesome.com/icons/sync?style=solid'>example</a>
         */
        SYNC,
        /**
         * The solid sync-alt icon.See <a href='https://fontawesome.com/icons/sync-alt?style=solid'>example</a>
         */
        SYNC_ALT,
        /**
         * The solid syringe icon.See <a href='https://fontawesome.com/icons/syringe?style=solid'>example</a>
         */
        SYRINGE,
        /**
         * The solid table icon.See <a href='https://fontawesome.com/icons/table?style=solid'>example</a>
         */
        TABLE,
        /**
         * The solid table-tennis icon.See <a href='https://fontawesome.com/icons/table-tennis?style=solid'>example</a>
         */
        TABLE_TENNIS,
        /**
         * The solid tablet icon.See <a href='https://fontawesome.com/icons/tablet?style=solid'>example</a>
         */
        TABLET,
        /**
         * The solid tablet-alt icon.See <a href='https://fontawesome.com/icons/tablet-alt?style=solid'>example</a>
         */
        TABLET_ALT,
        /**
         * The solid tablets icon.See <a href='https://fontawesome.com/icons/tablets?style=solid'>example</a>
         */
        TABLETS,
        /**
         * The solid tachometer-alt icon.See <a href='https://fontawesome.com/icons/tachometer-alt?style=solid'>example</a>
         */
        TACHOMETER_ALT,
        /**
         * The solid tag icon.See <a href='https://fontawesome.com/icons/tag?style=solid'>example</a>
         */
        TAG,
        /**
         * The solid tags icon.See <a href='https://fontawesome.com/icons/tags?style=solid'>example</a>
         */
        TAGS,
        /**
         * The solid tape icon.See <a href='https://fontawesome.com/icons/tape?style=solid'>example</a>
         */
        TAPE,
        /**
         * The solid tasks icon.See <a href='https://fontawesome.com/icons/tasks?style=solid'>example</a>
         */
        TASKS,
        /**
         * The solid taxi icon.See <a href='https://fontawesome.com/icons/taxi?style=solid'>example</a>
         */
        TAXI,
        /**
         * The solid teeth icon.See <a href='https://fontawesome.com/icons/teeth?style=solid'>example</a>
         */
        TEETH,
        /**
         * The solid teeth-open icon.See <a href='https://fontawesome.com/icons/teeth-open?style=solid'>example</a>
         */
        TEETH_OPEN,
        /**
         * The solid temperature-high icon.See <a href='https://fontawesome.com/icons/temperature-high?style=solid'>example</a>
         */
        TEMPERATURE_HIGH,
        /**
         * The solid temperature-low icon.See <a href='https://fontawesome.com/icons/temperature-low?style=solid'>example</a>
         */
        TEMPERATURE_LOW,
        /**
         * The solid tenge icon.See <a href='https://fontawesome.com/icons/tenge?style=solid'>example</a>
         */
        TENGE,
        /**
         * The solid terminal icon.See <a href='https://fontawesome.com/icons/terminal?style=solid'>example</a>
         */
        TERMINAL,
        /**
         * The solid text-height icon.See <a href='https://fontawesome.com/icons/text-height?style=solid'>example</a>
         */
        TEXT_HEIGHT,
        /**
         * The solid text-width icon.See <a href='https://fontawesome.com/icons/text-width?style=solid'>example</a>
         */
        TEXT_WIDTH,
        /**
         * The solid th icon.See <a href='https://fontawesome.com/icons/th?style=solid'>example</a>
         */
        TH,
        /**
         * The solid th-large icon.See <a href='https://fontawesome.com/icons/th-large?style=solid'>example</a>
         */
        TH_LARGE,
        /**
         * The solid th-list icon.See <a href='https://fontawesome.com/icons/th-list?style=solid'>example</a>
         */
        TH_LIST,
        /**
         * The solid theater-masks icon.See <a href='https://fontawesome.com/icons/theater-masks?style=solid'>example</a>
         */
        THEATER_MASKS,
        /**
         * The solid thermometer icon.See <a href='https://fontawesome.com/icons/thermometer?style=solid'>example</a>
         */
        THERMOMETER,
        /**
         * The solid thermometer-empty icon.See <a href='https://fontawesome.com/icons/thermometer-empty?style=solid'>example</a>
         */
        THERMOMETER_EMPTY,
        /**
         * The solid thermometer-full icon.See <a href='https://fontawesome.com/icons/thermometer-full?style=solid'>example</a>
         */
        THERMOMETER_FULL,
        /**
         * The solid thermometer-half icon.See <a href='https://fontawesome.com/icons/thermometer-half?style=solid'>example</a>
         */
        THERMOMETER_HALF,
        /**
         * The solid thermometer-quarter icon.See <a href='https://fontawesome.com/icons/thermometer-quarter?style=solid'>example</a>
         */
        THERMOMETER_QUARTER,
        /**
         * The solid thermometer-three-quarters icon.See <a href='https://fontawesome.com/icons/thermometer-three-quarters?style=solid'>example</a>
         */
        THERMOMETER_THREE_QUARTERS,
        /**
         * The solid thumbs-down icon.See <a href='https://fontawesome.com/icons/thumbs-down?style=solid'>example</a>
         */
        THUMBS_DOWN,
        /**
         * The solid thumbs-up icon.See <a href='https://fontawesome.com/icons/thumbs-up?style=solid'>example</a>
         */
        THUMBS_UP,
        /**
         * The solid thumbtack icon.See <a href='https://fontawesome.com/icons/thumbtack?style=solid'>example</a>
         */
        THUMBTACK,
        /**
         * The solid ticket-alt icon.See <a href='https://fontawesome.com/icons/ticket-alt?style=solid'>example</a>
         */
        TICKET_ALT,
        /**
         * The solid times icon.See <a href='https://fontawesome.com/icons/times?style=solid'>example</a>
         */
        TIMES,
        /**
         * The solid times-circle icon.See <a href='https://fontawesome.com/icons/times-circle?style=solid'>example</a>
         */
        TIMES_CIRCLE,
        /**
         * The solid tint icon.See <a href='https://fontawesome.com/icons/tint?style=solid'>example</a>
         */
        TINT,
        /**
         * The solid tint-slash icon.See <a href='https://fontawesome.com/icons/tint-slash?style=solid'>example</a>
         */
        TINT_SLASH,
        /**
         * The solid tired icon.See <a href='https://fontawesome.com/icons/tired?style=solid'>example</a>
         */
        TIRED,
        /**
         * The solid toggle-off icon.See <a href='https://fontawesome.com/icons/toggle-off?style=solid'>example</a>
         */
        TOGGLE_OFF,
        /**
         * The solid toggle-on icon.See <a href='https://fontawesome.com/icons/toggle-on?style=solid'>example</a>
         */
        TOGGLE_ON,
        /**
         * The solid toilet icon.See <a href='https://fontawesome.com/icons/toilet?style=solid'>example</a>
         */
        TOILET,
        /**
         * The solid toilet-paper icon.See <a href='https://fontawesome.com/icons/toilet-paper?style=solid'>example</a>
         */
        TOILET_PAPER,
        /**
         * The solid toilet-paper-slash icon.See <a href='https://fontawesome.com/icons/toilet-paper-slash?style=solid'>example</a>
         */
        TOILET_PAPER_SLASH,
        /**
         * The solid toolbox icon.See <a href='https://fontawesome.com/icons/toolbox?style=solid'>example</a>
         */
        TOOLBOX,
        /**
         * The solid tools icon.See <a href='https://fontawesome.com/icons/tools?style=solid'>example</a>
         */
        TOOLS,
        /**
         * The solid tooth icon.See <a href='https://fontawesome.com/icons/tooth?style=solid'>example</a>
         */
        TOOTH,
        /**
         * The solid torah icon.See <a href='https://fontawesome.com/icons/torah?style=solid'>example</a>
         */
        TORAH,
        /**
         * The solid torii-gate icon.See <a href='https://fontawesome.com/icons/torii-gate?style=solid'>example</a>
         */
        TORII_GATE,
        /**
         * The solid tractor icon.See <a href='https://fontawesome.com/icons/tractor?style=solid'>example</a>
         */
        TRACTOR,
        /**
         * The solid trademark icon.See <a href='https://fontawesome.com/icons/trademark?style=solid'>example</a>
         */
        TRADEMARK,
        /**
         * The solid traffic-light icon.See <a href='https://fontawesome.com/icons/traffic-light?style=solid'>example</a>
         */
        TRAFFIC_LIGHT,
        /**
         * The solid trailer icon.See <a href='https://fontawesome.com/icons/trailer?style=solid'>example</a>
         */
        TRAILER,
        /**
         * The solid train icon.See <a href='https://fontawesome.com/icons/train?style=solid'>example</a>
         */
        TRAIN,
        /**
         * The solid tram icon.See <a href='https://fontawesome.com/icons/tram?style=solid'>example</a>
         */
        TRAM,
        /**
         * The solid transgender icon.See <a href='https://fontawesome.com/icons/transgender?style=solid'>example</a>
         */
        TRANSGENDER,
        /**
         * The solid transgender-alt icon.See <a href='https://fontawesome.com/icons/transgender-alt?style=solid'>example</a>
         */
        TRANSGENDER_ALT,
        /**
         * The solid trash icon.See <a href='https://fontawesome.com/icons/trash?style=solid'>example</a>
         */
        TRASH,
        /**
         * The solid trash-alt icon.See <a href='https://fontawesome.com/icons/trash-alt?style=solid'>example</a>
         */
        TRASH_ALT,
        /**
         * The solid trash-restore icon.See <a href='https://fontawesome.com/icons/trash-restore?style=solid'>example</a>
         */
        TRASH_RESTORE,
        /**
         * The solid trash-restore-alt icon.See <a href='https://fontawesome.com/icons/trash-restore-alt?style=solid'>example</a>
         */
        TRASH_RESTORE_ALT,
        /**
         * The solid tree icon.See <a href='https://fontawesome.com/icons/tree?style=solid'>example</a>
         */
        TREE,
        /**
         * The solid trophy icon.See <a href='https://fontawesome.com/icons/trophy?style=solid'>example</a>
         */
        TROPHY,
        /**
         * The solid truck icon.See <a href='https://fontawesome.com/icons/truck?style=solid'>example</a>
         */
        TRUCK,
        /**
         * The solid truck-loading icon.See <a href='https://fontawesome.com/icons/truck-loading?style=solid'>example</a>
         */
        TRUCK_LOADING,
        /**
         * The solid truck-monster icon.See <a href='https://fontawesome.com/icons/truck-monster?style=solid'>example</a>
         */
        TRUCK_MONSTER,
        /**
         * The solid truck-moving icon.See <a href='https://fontawesome.com/icons/truck-moving?style=solid'>example</a>
         */
        TRUCK_MOVING,
        /**
         * The solid truck-pickup icon.See <a href='https://fontawesome.com/icons/truck-pickup?style=solid'>example</a>
         */
        TRUCK_PICKUP,
        /**
         * The solid tshirt icon.See <a href='https://fontawesome.com/icons/tshirt?style=solid'>example</a>
         */
        TSHIRT,
        /**
         * The solid tty icon.See <a href='https://fontawesome.com/icons/tty?style=solid'>example</a>
         */
        TTY,
        /**
         * The solid tv icon.See <a href='https://fontawesome.com/icons/tv?style=solid'>example</a>
         */
        TV,
        /**
         * The solid umbrella icon.See <a href='https://fontawesome.com/icons/umbrella?style=solid'>example</a>
         */
        UMBRELLA,
        /**
         * The solid umbrella-beach icon.See <a href='https://fontawesome.com/icons/umbrella-beach?style=solid'>example</a>
         */
        UMBRELLA_BEACH,
        /**
         * The solid underline icon.See <a href='https://fontawesome.com/icons/underline?style=solid'>example</a>
         */
        UNDERLINE,
        /**
         * The solid undo icon.See <a href='https://fontawesome.com/icons/undo?style=solid'>example</a>
         */
        UNDO,
        /**
         * The solid undo-alt icon.See <a href='https://fontawesome.com/icons/undo-alt?style=solid'>example</a>
         */
        UNDO_ALT,
        /**
         * The solid universal-access icon.See <a href='https://fontawesome.com/icons/universal-access?style=solid'>example</a>
         */
        UNIVERSAL_ACCESS,
        /**
         * The solid university icon.See <a href='https://fontawesome.com/icons/university?style=solid'>example</a>
         */
        UNIVERSITY,
        /**
         * The solid unlink icon.See <a href='https://fontawesome.com/icons/unlink?style=solid'>example</a>
         */
        UNLINK,
        /**
         * The solid unlock icon.See <a href='https://fontawesome.com/icons/unlock?style=solid'>example</a>
         */
        UNLOCK,
        /**
         * The solid unlock-alt icon.See <a href='https://fontawesome.com/icons/unlock-alt?style=solid'>example</a>
         */
        UNLOCK_ALT,
        /**
         * The solid upload icon.See <a href='https://fontawesome.com/icons/upload?style=solid'>example</a>
         */
        UPLOAD,
        /**
         * The solid user icon.See <a href='https://fontawesome.com/icons/user?style=solid'>example</a>
         */
        USER,
        /**
         * The solid user-alt icon.See <a href='https://fontawesome.com/icons/user-alt?style=solid'>example</a>
         */
        USER_ALT,
        /**
         * The solid user-alt-slash icon.See <a href='https://fontawesome.com/icons/user-alt-slash?style=solid'>example</a>
         */
        USER_ALT_SLASH,
        /**
         * The solid user-astronaut icon.See <a href='https://fontawesome.com/icons/user-astronaut?style=solid'>example</a>
         */
        USER_ASTRONAUT,
        /**
         * The solid user-check icon.See <a href='https://fontawesome.com/icons/user-check?style=solid'>example</a>
         */
        USER_CHECK,
        /**
         * The solid user-circle icon.See <a href='https://fontawesome.com/icons/user-circle?style=solid'>example</a>
         */
        USER_CIRCLE,
        /**
         * The solid user-clock icon.See <a href='https://fontawesome.com/icons/user-clock?style=solid'>example</a>
         */
        USER_CLOCK,
        /**
         * The solid user-cog icon.See <a href='https://fontawesome.com/icons/user-cog?style=solid'>example</a>
         */
        USER_COG,
        /**
         * The solid user-edit icon.See <a href='https://fontawesome.com/icons/user-edit?style=solid'>example</a>
         */
        USER_EDIT,
        /**
         * The solid user-friends icon.See <a href='https://fontawesome.com/icons/user-friends?style=solid'>example</a>
         */
        USER_FRIENDS,
        /**
         * The solid user-graduate icon.See <a href='https://fontawesome.com/icons/user-graduate?style=solid'>example</a>
         */
        USER_GRADUATE,
        /**
         * The solid user-injured icon.See <a href='https://fontawesome.com/icons/user-injured?style=solid'>example</a>
         */
        USER_INJURED,
        /**
         * The solid user-lock icon.See <a href='https://fontawesome.com/icons/user-lock?style=solid'>example</a>
         */
        USER_LOCK,
        /**
         * The solid user-md icon.See <a href='https://fontawesome.com/icons/user-md?style=solid'>example</a>
         */
        USER_MD,
        /**
         * The solid user-minus icon.See <a href='https://fontawesome.com/icons/user-minus?style=solid'>example</a>
         */
        USER_MINUS,
        /**
         * The solid user-ninja icon.See <a href='https://fontawesome.com/icons/user-ninja?style=solid'>example</a>
         */
        USER_NINJA,
        /**
         * The solid user-nurse icon.See <a href='https://fontawesome.com/icons/user-nurse?style=solid'>example</a>
         */
        USER_NURSE,
        /**
         * The solid user-plus icon.See <a href='https://fontawesome.com/icons/user-plus?style=solid'>example</a>
         */
        USER_PLUS,
        /**
         * The solid user-secret icon.See <a href='https://fontawesome.com/icons/user-secret?style=solid'>example</a>
         */
        USER_SECRET,
        /**
         * The solid user-shield icon.See <a href='https://fontawesome.com/icons/user-shield?style=solid'>example</a>
         */
        USER_SHIELD,
        /**
         * The solid user-slash icon.See <a href='https://fontawesome.com/icons/user-slash?style=solid'>example</a>
         */
        USER_SLASH,
        /**
         * The solid user-tag icon.See <a href='https://fontawesome.com/icons/user-tag?style=solid'>example</a>
         */
        USER_TAG,
        /**
         * The solid user-tie icon.See <a href='https://fontawesome.com/icons/user-tie?style=solid'>example</a>
         */
        USER_TIE,
        /**
         * The solid user-times icon.See <a href='https://fontawesome.com/icons/user-times?style=solid'>example</a>
         */
        USER_TIMES,
        /**
         * The solid users icon.See <a href='https://fontawesome.com/icons/users?style=solid'>example</a>
         */
        USERS,
        /**
         * The solid users-cog icon.See <a href='https://fontawesome.com/icons/users-cog?style=solid'>example</a>
         */
        USERS_COG,
        /**
         * The solid users-slash icon.See <a href='https://fontawesome.com/icons/users-slash?style=solid'>example</a>
         */
        USERS_SLASH,
        /**
         * The solid utensil-spoon icon.See <a href='https://fontawesome.com/icons/utensil-spoon?style=solid'>example</a>
         */
        UTENSIL_SPOON,
        /**
         * The solid utensils icon.See <a href='https://fontawesome.com/icons/utensils?style=solid'>example</a>
         */
        UTENSILS,
        /**
         * The solid vector-square icon.See <a href='https://fontawesome.com/icons/vector-square?style=solid'>example</a>
         */
        VECTOR_SQUARE,
        /**
         * The solid venus icon.See <a href='https://fontawesome.com/icons/venus?style=solid'>example</a>
         */
        VENUS,
        /**
         * The solid venus-double icon.See <a href='https://fontawesome.com/icons/venus-double?style=solid'>example</a>
         */
        VENUS_DOUBLE,
        /**
         * The solid venus-mars icon.See <a href='https://fontawesome.com/icons/venus-mars?style=solid'>example</a>
         */
        VENUS_MARS,
        /**
         * The solid vest icon.See <a href='https://fontawesome.com/icons/vest?style=solid'>example</a>
         */
        VEST,
        /**
         * The solid vest-patches icon.See <a href='https://fontawesome.com/icons/vest-patches?style=solid'>example</a>
         */
        VEST_PATCHES,
        /**
         * The solid vial icon.See <a href='https://fontawesome.com/icons/vial?style=solid'>example</a>
         */
        VIAL,
        /**
         * The solid vials icon.See <a href='https://fontawesome.com/icons/vials?style=solid'>example</a>
         */
        VIALS,
        /**
         * The solid video icon.See <a href='https://fontawesome.com/icons/video?style=solid'>example</a>
         */
        VIDEO,
        /**
         * The solid video-slash icon.See <a href='https://fontawesome.com/icons/video-slash?style=solid'>example</a>
         */
        VIDEO_SLASH,
        /**
         * The solid vihara icon.See <a href='https://fontawesome.com/icons/vihara?style=solid'>example</a>
         */
        VIHARA,
        /**
         * The solid virus icon.See <a href='https://fontawesome.com/icons/virus?style=solid'>example</a>
         */
        VIRUS,
        /**
         * The solid virus-slash icon.See <a href='https://fontawesome.com/icons/virus-slash?style=solid'>example</a>
         */
        VIRUS_SLASH,
        /**
         * The solid viruses icon.See <a href='https://fontawesome.com/icons/viruses?style=solid'>example</a>
         */
        VIRUSES,
        /**
         * The solid voicemail icon.See <a href='https://fontawesome.com/icons/voicemail?style=solid'>example</a>
         */
        VOICEMAIL,
        /**
         * The solid volleyball-ball icon.See <a href='https://fontawesome.com/icons/volleyball-ball?style=solid'>example</a>
         */
        VOLLEYBALL_BALL,
        /**
         * The solid volume-down icon.See <a href='https://fontawesome.com/icons/volume-down?style=solid'>example</a>
         */
        VOLUME_DOWN,
        /**
         * The solid volume-mute icon.See <a href='https://fontawesome.com/icons/volume-mute?style=solid'>example</a>
         */
        VOLUME_MUTE,
        /**
         * The solid volume-off icon.See <a href='https://fontawesome.com/icons/volume-off?style=solid'>example</a>
         */
        VOLUME_OFF,
        /**
         * The solid volume-up icon.See <a href='https://fontawesome.com/icons/volume-up?style=solid'>example</a>
         */
        VOLUME_UP,
        /**
         * The solid vote-yea icon.See <a href='https://fontawesome.com/icons/vote-yea?style=solid'>example</a>
         */
        VOTE_YEA,
        /**
         * The solid vr-cardboard icon.See <a href='https://fontawesome.com/icons/vr-cardboard?style=solid'>example</a>
         */
        VR_CARDBOARD,
        /**
         * The solid walking icon.See <a href='https://fontawesome.com/icons/walking?style=solid'>example</a>
         */
        WALKING,
        /**
         * The solid wallet icon.See <a href='https://fontawesome.com/icons/wallet?style=solid'>example</a>
         */
        WALLET,
        /**
         * The solid warehouse icon.See <a href='https://fontawesome.com/icons/warehouse?style=solid'>example</a>
         */
        WAREHOUSE,
        /**
         * The solid water icon.See <a href='https://fontawesome.com/icons/water?style=solid'>example</a>
         */
        WATER,
        /**
         * The solid wave-square icon.See <a href='https://fontawesome.com/icons/wave-square?style=solid'>example</a>
         */
        WAVE_SQUARE,
        /**
         * The solid weight icon.See <a href='https://fontawesome.com/icons/weight?style=solid'>example</a>
         */
        WEIGHT,
        /**
         * The solid weight-hanging icon.See <a href='https://fontawesome.com/icons/weight-hanging?style=solid'>example</a>
         */
        WEIGHT_HANGING,
        /**
         * The solid wheelchair icon.See <a href='https://fontawesome.com/icons/wheelchair?style=solid'>example</a>
         */
        WHEELCHAIR,
        /**
         * The solid wifi icon.See <a href='https://fontawesome.com/icons/wifi?style=solid'>example</a>
         */
        WIFI,
        /**
         * The solid wind icon.See <a href='https://fontawesome.com/icons/wind?style=solid'>example</a>
         */
        WIND,
        /**
         * The solid window-close icon.See <a href='https://fontawesome.com/icons/window-close?style=solid'>example</a>
         */
        WINDOW_CLOSE,
        /**
         * The solid window-maximize icon.See <a href='https://fontawesome.com/icons/window-maximize?style=solid'>example</a>
         */
        WINDOW_MAXIMIZE,
        /**
         * The solid window-minimize icon.See <a href='https://fontawesome.com/icons/window-minimize?style=solid'>example</a>
         */
        WINDOW_MINIMIZE,
        /**
         * The solid window-restore icon.See <a href='https://fontawesome.com/icons/window-restore?style=solid'>example</a>
         */
        WINDOW_RESTORE,
        /**
         * The solid wine-bottle icon.See <a href='https://fontawesome.com/icons/wine-bottle?style=solid'>example</a>
         */
        WINE_BOTTLE,
        /**
         * The solid wine-glass icon.See <a href='https://fontawesome.com/icons/wine-glass?style=solid'>example</a>
         */
        WINE_GLASS,
        /**
         * The solid wine-glass-alt icon.See <a href='https://fontawesome.com/icons/wine-glass-alt?style=solid'>example</a>
         */
        WINE_GLASS_ALT,
        /**
         * The solid won-sign icon.See <a href='https://fontawesome.com/icons/won-sign?style=solid'>example</a>
         */
        WON_SIGN,
        /**
         * The solid wrench icon.See <a href='https://fontawesome.com/icons/wrench?style=solid'>example</a>
         */
        WRENCH,
        /**
         * The solid x-ray icon.See <a href='https://fontawesome.com/icons/x-ray?style=solid'>example</a>
         */
        X_RAY,
        /**
         * The solid yen-sign icon.See <a href='https://fontawesome.com/icons/yen-sign?style=solid'>example</a>
         */
        YEN_SIGN,
        /**
         * The solid yin-yang icon.See <a href='https://fontawesome.com/icons/yin-yang?style=solid'>example</a>
         */
        YIN_YANG;

        /**
         * The Iconset name, i.e. {@code "fas"}."
         */
        public static final String ICONSET = "fas";

        /**
         * Return the icon name.
         * @return the icon name, i.e. {@code "fas:name"}..
         */
        public String getIconName() {
            return ICONSET+':'+getIconPart();
        }

        private String getIconPart() {
            return this.name().toLowerCase(Locale.ENGLISH).replace('_', '-');
        }

        /**
         * Create a new {@link IronIcon} instance with the icon determined by the name.
         * @return a new instance of {@link IronIcon} component
         */
        public Icon create() {
            return new Icon(this.getIconPart());
        }

        /**
         * Create a new {@link IronIcon} instance with the icon determined by the name and a listener for click events.
         * @param listener the event listener for click events
         * @return a new instance of {@link IronIcon} component
         */
        public Icon create(ComponentEventListener<ClickEvent<IronIcon>> listener) {
            Icon icon = create();
            icon.addClickListener(listener);
            return icon;
        }

        /**
         * Server side component for {@code Solid}
         */
        @JsModule("./font-awesome-iron-iconset/fas.js")
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "2.2.0")
        @SuppressWarnings("serial")
        public static final class Icon extends IronIcon implements ClickNotifier<IronIcon> {

             Icon(String icon) {
                super(ICONSET, icon);
            }
        }
    }

    /**
     * Enumeration of all icons in the FontAwesome brands iconset
     * <p>
     * These instances can be used to create {@link IronIcon} components either by using
     * their {@link #create()} method or by passing them to Icon's constructor.
     *
     * @author Javier Godoy / Flowing Code
     */
    public enum Brands {

        /**
         * The brands 500px icon.See <a href='https://fontawesome.com/icons/500px?style=brands'>example</a>
         */
        _500PX,
        /**
         * The brands accessible-icon icon.See <a href='https://fontawesome.com/icons/accessible-icon?style=brands'>example</a>
         */
        ACCESSIBLE_ICON,
        /**
         * The brands accusoft icon.See <a href='https://fontawesome.com/icons/accusoft?style=brands'>example</a>
         */
        ACCUSOFT,
        /**
         * The brands acquisitions-incorporated icon.See <a href='https://fontawesome.com/icons/acquisitions-incorporated?style=brands'>example</a>
         */
        ACQUISITIONS_INCORPORATED,
        /**
         * The brands adn icon.See <a href='https://fontawesome.com/icons/adn?style=brands'>example</a>
         */
        ADN,
        /**
         * The brands adversal icon.See <a href='https://fontawesome.com/icons/adversal?style=brands'>example</a>
         */
        ADVERSAL,
        /**
         * The brands affiliatetheme icon.See <a href='https://fontawesome.com/icons/affiliatetheme?style=brands'>example</a>
         */
        AFFILIATETHEME,
        /**
         * The brands airbnb icon.See <a href='https://fontawesome.com/icons/airbnb?style=brands'>example</a>
         */
        AIRBNB,
        /**
         * The brands algolia icon.See <a href='https://fontawesome.com/icons/algolia?style=brands'>example</a>
         */
        ALGOLIA,
        /**
         * The brands alipay icon.See <a href='https://fontawesome.com/icons/alipay?style=brands'>example</a>
         */
        ALIPAY,
        /**
         * The brands amazon icon.See <a href='https://fontawesome.com/icons/amazon?style=brands'>example</a>
         */
        AMAZON,
        /**
         * The brands amazon-pay icon.See <a href='https://fontawesome.com/icons/amazon-pay?style=brands'>example</a>
         */
        AMAZON_PAY,
        /**
         * The brands amilia icon.See <a href='https://fontawesome.com/icons/amilia?style=brands'>example</a>
         */
        AMILIA,
        /**
         * The brands android icon.See <a href='https://fontawesome.com/icons/android?style=brands'>example</a>
         */
        ANDROID,
        /**
         * The brands angellist icon.See <a href='https://fontawesome.com/icons/angellist?style=brands'>example</a>
         */
        ANGELLIST,
        /**
         * The brands angrycreative icon.See <a href='https://fontawesome.com/icons/angrycreative?style=brands'>example</a>
         */
        ANGRYCREATIVE,
        /**
         * The brands angular icon.See <a href='https://fontawesome.com/icons/angular?style=brands'>example</a>
         */
        ANGULAR,
        /**
         * The brands app-store icon.See <a href='https://fontawesome.com/icons/app-store?style=brands'>example</a>
         */
        APP_STORE,
        /**
         * The brands app-store-ios icon.See <a href='https://fontawesome.com/icons/app-store-ios?style=brands'>example</a>
         */
        APP_STORE_IOS,
        /**
         * The brands apper icon.See <a href='https://fontawesome.com/icons/apper?style=brands'>example</a>
         */
        APPER,
        /**
         * The brands apple icon.See <a href='https://fontawesome.com/icons/apple?style=brands'>example</a>
         */
        APPLE,
        /**
         * The brands apple-pay icon.See <a href='https://fontawesome.com/icons/apple-pay?style=brands'>example</a>
         */
        APPLE_PAY,
        /**
         * The brands artstation icon.See <a href='https://fontawesome.com/icons/artstation?style=brands'>example</a>
         */
        ARTSTATION,
        /**
         * The brands asymmetrik icon.See <a href='https://fontawesome.com/icons/asymmetrik?style=brands'>example</a>
         */
        ASYMMETRIK,
        /**
         * The brands atlassian icon.See <a href='https://fontawesome.com/icons/atlassian?style=brands'>example</a>
         */
        ATLASSIAN,
        /**
         * The brands audible icon.See <a href='https://fontawesome.com/icons/audible?style=brands'>example</a>
         */
        AUDIBLE,
        /**
         * The brands autoprefixer icon.See <a href='https://fontawesome.com/icons/autoprefixer?style=brands'>example</a>
         */
        AUTOPREFIXER,
        /**
         * The brands avianex icon.See <a href='https://fontawesome.com/icons/avianex?style=brands'>example</a>
         */
        AVIANEX,
        /**
         * The brands aviato icon.See <a href='https://fontawesome.com/icons/aviato?style=brands'>example</a>
         */
        AVIATO,
        /**
         * The brands aws icon.See <a href='https://fontawesome.com/icons/aws?style=brands'>example</a>
         */
        AWS,
        /**
         * The brands bandcamp icon.See <a href='https://fontawesome.com/icons/bandcamp?style=brands'>example</a>
         */
        BANDCAMP,
        /**
         * The brands battle-net icon.See <a href='https://fontawesome.com/icons/battle-net?style=brands'>example</a>
         */
        BATTLE_NET,
        /**
         * The brands behance icon.See <a href='https://fontawesome.com/icons/behance?style=brands'>example</a>
         */
        BEHANCE,
        /**
         * The brands behance-square icon.See <a href='https://fontawesome.com/icons/behance-square?style=brands'>example</a>
         */
        BEHANCE_SQUARE,
        /**
         * The brands bimobject icon.See <a href='https://fontawesome.com/icons/bimobject?style=brands'>example</a>
         */
        BIMOBJECT,
        /**
         * The brands bitbucket icon.See <a href='https://fontawesome.com/icons/bitbucket?style=brands'>example</a>
         */
        BITBUCKET,
        /**
         * The brands bitcoin icon.See <a href='https://fontawesome.com/icons/bitcoin?style=brands'>example</a>
         */
        BITCOIN,
        /**
         * The brands bity icon.See <a href='https://fontawesome.com/icons/bity?style=brands'>example</a>
         */
        BITY,
        /**
         * The brands black-tie icon.See <a href='https://fontawesome.com/icons/black-tie?style=brands'>example</a>
         */
        BLACK_TIE,
        /**
         * The brands blackberry icon.See <a href='https://fontawesome.com/icons/blackberry?style=brands'>example</a>
         */
        BLACKBERRY,
        /**
         * The brands blogger icon.See <a href='https://fontawesome.com/icons/blogger?style=brands'>example</a>
         */
        BLOGGER,
        /**
         * The brands blogger-b icon.See <a href='https://fontawesome.com/icons/blogger-b?style=brands'>example</a>
         */
        BLOGGER_B,
        /**
         * The brands bluetooth icon.See <a href='https://fontawesome.com/icons/bluetooth?style=brands'>example</a>
         */
        BLUETOOTH,
        /**
         * The brands bluetooth-b icon.See <a href='https://fontawesome.com/icons/bluetooth-b?style=brands'>example</a>
         */
        BLUETOOTH_B,
        /**
         * The brands bootstrap icon.See <a href='https://fontawesome.com/icons/bootstrap?style=brands'>example</a>
         */
        BOOTSTRAP,
        /**
         * The brands btc icon.See <a href='https://fontawesome.com/icons/btc?style=brands'>example</a>
         */
        BTC,
        /**
         * The brands buffer icon.See <a href='https://fontawesome.com/icons/buffer?style=brands'>example</a>
         */
        BUFFER,
        /**
         * The brands buromobelexperte icon.See <a href='https://fontawesome.com/icons/buromobelexperte?style=brands'>example</a>
         */
        BUROMOBELEXPERTE,
        /**
         * The brands buy-n-large icon.See <a href='https://fontawesome.com/icons/buy-n-large?style=brands'>example</a>
         */
        BUY_N_LARGE,
        /**
         * The brands buysellads icon.See <a href='https://fontawesome.com/icons/buysellads?style=brands'>example</a>
         */
        BUYSELLADS,
        /**
         * The brands canadian-maple-leaf icon.See <a href='https://fontawesome.com/icons/canadian-maple-leaf?style=brands'>example</a>
         */
        CANADIAN_MAPLE_LEAF,
        /**
         * The brands cc-amazon-pay icon.See <a href='https://fontawesome.com/icons/cc-amazon-pay?style=brands'>example</a>
         */
        CC_AMAZON_PAY,
        /**
         * The brands cc-amex icon.See <a href='https://fontawesome.com/icons/cc-amex?style=brands'>example</a>
         */
        CC_AMEX,
        /**
         * The brands cc-apple-pay icon.See <a href='https://fontawesome.com/icons/cc-apple-pay?style=brands'>example</a>
         */
        CC_APPLE_PAY,
        /**
         * The brands cc-diners-club icon.See <a href='https://fontawesome.com/icons/cc-diners-club?style=brands'>example</a>
         */
        CC_DINERS_CLUB,
        /**
         * The brands cc-discover icon.See <a href='https://fontawesome.com/icons/cc-discover?style=brands'>example</a>
         */
        CC_DISCOVER,
        /**
         * The brands cc-jcb icon.See <a href='https://fontawesome.com/icons/cc-jcb?style=brands'>example</a>
         */
        CC_JCB,
        /**
         * The brands cc-mastercard icon.See <a href='https://fontawesome.com/icons/cc-mastercard?style=brands'>example</a>
         */
        CC_MASTERCARD,
        /**
         * The brands cc-paypal icon.See <a href='https://fontawesome.com/icons/cc-paypal?style=brands'>example</a>
         */
        CC_PAYPAL,
        /**
         * The brands cc-stripe icon.See <a href='https://fontawesome.com/icons/cc-stripe?style=brands'>example</a>
         */
        CC_STRIPE,
        /**
         * The brands cc-visa icon.See <a href='https://fontawesome.com/icons/cc-visa?style=brands'>example</a>
         */
        CC_VISA,
        /**
         * The brands centercode icon.See <a href='https://fontawesome.com/icons/centercode?style=brands'>example</a>
         */
        CENTERCODE,
        /**
         * The brands centos icon.See <a href='https://fontawesome.com/icons/centos?style=brands'>example</a>
         */
        CENTOS,
        /**
         * The brands chrome icon.See <a href='https://fontawesome.com/icons/chrome?style=brands'>example</a>
         */
        CHROME,
        /**
         * The brands chromecast icon.See <a href='https://fontawesome.com/icons/chromecast?style=brands'>example</a>
         */
        CHROMECAST,
        /**
         * The brands cloudflare icon.See <a href='https://fontawesome.com/icons/cloudflare?style=brands'>example</a>
         */
        CLOUDFLARE,
        /**
         * The brands cloudscale icon.See <a href='https://fontawesome.com/icons/cloudscale?style=brands'>example</a>
         */
        CLOUDSCALE,
        /**
         * The brands cloudsmith icon.See <a href='https://fontawesome.com/icons/cloudsmith?style=brands'>example</a>
         */
        CLOUDSMITH,
        /**
         * The brands cloudversify icon.See <a href='https://fontawesome.com/icons/cloudversify?style=brands'>example</a>
         */
        CLOUDVERSIFY,
        /**
         * The brands codepen icon.See <a href='https://fontawesome.com/icons/codepen?style=brands'>example</a>
         */
        CODEPEN,
        /**
         * The brands codiepie icon.See <a href='https://fontawesome.com/icons/codiepie?style=brands'>example</a>
         */
        CODIEPIE,
        /**
         * The brands confluence icon.See <a href='https://fontawesome.com/icons/confluence?style=brands'>example</a>
         */
        CONFLUENCE,
        /**
         * The brands connectdevelop icon.See <a href='https://fontawesome.com/icons/connectdevelop?style=brands'>example</a>
         */
        CONNECTDEVELOP,
        /**
         * The brands contao icon.See <a href='https://fontawesome.com/icons/contao?style=brands'>example</a>
         */
        CONTAO,
        /**
         * The brands cotton-bureau icon.See <a href='https://fontawesome.com/icons/cotton-bureau?style=brands'>example</a>
         */
        COTTON_BUREAU,
        /**
         * The brands cpanel icon.See <a href='https://fontawesome.com/icons/cpanel?style=brands'>example</a>
         */
        CPANEL,
        /**
         * The brands creative-commons icon.See <a href='https://fontawesome.com/icons/creative-commons?style=brands'>example</a>
         */
        CREATIVE_COMMONS,
        /**
         * The brands creative-commons-by icon.See <a href='https://fontawesome.com/icons/creative-commons-by?style=brands'>example</a>
         */
        CREATIVE_COMMONS_BY,
        /**
         * The brands creative-commons-nc icon.See <a href='https://fontawesome.com/icons/creative-commons-nc?style=brands'>example</a>
         */
        CREATIVE_COMMONS_NC,
        /**
         * The brands creative-commons-nc-eu icon.See <a href='https://fontawesome.com/icons/creative-commons-nc-eu?style=brands'>example</a>
         */
        CREATIVE_COMMONS_NC_EU,
        /**
         * The brands creative-commons-nc-jp icon.See <a href='https://fontawesome.com/icons/creative-commons-nc-jp?style=brands'>example</a>
         */
        CREATIVE_COMMONS_NC_JP,
        /**
         * The brands creative-commons-nd icon.See <a href='https://fontawesome.com/icons/creative-commons-nd?style=brands'>example</a>
         */
        CREATIVE_COMMONS_ND,
        /**
         * The brands creative-commons-pd icon.See <a href='https://fontawesome.com/icons/creative-commons-pd?style=brands'>example</a>
         */
        CREATIVE_COMMONS_PD,
        /**
         * The brands creative-commons-pd-alt icon.See <a href='https://fontawesome.com/icons/creative-commons-pd-alt?style=brands'>example</a>
         */
        CREATIVE_COMMONS_PD_ALT,
        /**
         * The brands creative-commons-remix icon.See <a href='https://fontawesome.com/icons/creative-commons-remix?style=brands'>example</a>
         */
        CREATIVE_COMMONS_REMIX,
        /**
         * The brands creative-commons-sa icon.See <a href='https://fontawesome.com/icons/creative-commons-sa?style=brands'>example</a>
         */
        CREATIVE_COMMONS_SA,
        /**
         * The brands creative-commons-sampling icon.See <a href='https://fontawesome.com/icons/creative-commons-sampling?style=brands'>example</a>
         */
        CREATIVE_COMMONS_SAMPLING,
        /**
         * The brands creative-commons-sampling-plus icon.See <a href='https://fontawesome.com/icons/creative-commons-sampling-plus?style=brands'>example</a>
         */
        CREATIVE_COMMONS_SAMPLING_PLUS,
        /**
         * The brands creative-commons-share icon.See <a href='https://fontawesome.com/icons/creative-commons-share?style=brands'>example</a>
         */
        CREATIVE_COMMONS_SHARE,
        /**
         * The brands creative-commons-zero icon.See <a href='https://fontawesome.com/icons/creative-commons-zero?style=brands'>example</a>
         */
        CREATIVE_COMMONS_ZERO,
        /**
         * The brands critical-role icon.See <a href='https://fontawesome.com/icons/critical-role?style=brands'>example</a>
         */
        CRITICAL_ROLE,
        /**
         * The brands css3 icon.See <a href='https://fontawesome.com/icons/css3?style=brands'>example</a>
         */
        CSS3,
        /**
         * The brands css3-alt icon.See <a href='https://fontawesome.com/icons/css3-alt?style=brands'>example</a>
         */
        CSS3_ALT,
        /**
         * The brands cuttlefish icon.See <a href='https://fontawesome.com/icons/cuttlefish?style=brands'>example</a>
         */
        CUTTLEFISH,
        /**
         * The brands d-and-d icon.See <a href='https://fontawesome.com/icons/d-and-d?style=brands'>example</a>
         */
        D_AND_D,
        /**
         * The brands d-and-d-beyond icon.See <a href='https://fontawesome.com/icons/d-and-d-beyond?style=brands'>example</a>
         */
        D_AND_D_BEYOND,
        /**
         * The brands dailymotion icon.See <a href='https://fontawesome.com/icons/dailymotion?style=brands'>example</a>
         */
        DAILYMOTION,
        /**
         * The brands dashcube icon.See <a href='https://fontawesome.com/icons/dashcube?style=brands'>example</a>
         */
        DASHCUBE,
        /**
         * The brands deezer icon.See <a href='https://fontawesome.com/icons/deezer?style=brands'>example</a>
         */
        DEEZER,
        /**
         * The brands delicious icon.See <a href='https://fontawesome.com/icons/delicious?style=brands'>example</a>
         */
        DELICIOUS,
        /**
         * The brands deploydog icon.See <a href='https://fontawesome.com/icons/deploydog?style=brands'>example</a>
         */
        DEPLOYDOG,
        /**
         * The brands deskpro icon.See <a href='https://fontawesome.com/icons/deskpro?style=brands'>example</a>
         */
        DESKPRO,
        /**
         * The brands dev icon.See <a href='https://fontawesome.com/icons/dev?style=brands'>example</a>
         */
        DEV,
        /**
         * The brands deviantart icon.See <a href='https://fontawesome.com/icons/deviantart?style=brands'>example</a>
         */
        DEVIANTART,
        /**
         * The brands dhl icon.See <a href='https://fontawesome.com/icons/dhl?style=brands'>example</a>
         */
        DHL,
        /**
         * The brands diaspora icon.See <a href='https://fontawesome.com/icons/diaspora?style=brands'>example</a>
         */
        DIASPORA,
        /**
         * The brands digg icon.See <a href='https://fontawesome.com/icons/digg?style=brands'>example</a>
         */
        DIGG,
        /**
         * The brands digital-ocean icon.See <a href='https://fontawesome.com/icons/digital-ocean?style=brands'>example</a>
         */
        DIGITAL_OCEAN,
        /**
         * The brands discord icon.See <a href='https://fontawesome.com/icons/discord?style=brands'>example</a>
         */
        DISCORD,
        /**
         * The brands discourse icon.See <a href='https://fontawesome.com/icons/discourse?style=brands'>example</a>
         */
        DISCOURSE,
        /**
         * The brands dochub icon.See <a href='https://fontawesome.com/icons/dochub?style=brands'>example</a>
         */
        DOCHUB,
        /**
         * The brands docker icon.See <a href='https://fontawesome.com/icons/docker?style=brands'>example</a>
         */
        DOCKER,
        /**
         * The brands draft2digital icon.See <a href='https://fontawesome.com/icons/draft2digital?style=brands'>example</a>
         */
        DRAFT2DIGITAL,
        /**
         * The brands dribbble icon.See <a href='https://fontawesome.com/icons/dribbble?style=brands'>example</a>
         */
        DRIBBBLE,
        /**
         * The brands dribbble-square icon.See <a href='https://fontawesome.com/icons/dribbble-square?style=brands'>example</a>
         */
        DRIBBBLE_SQUARE,
        /**
         * The brands dropbox icon.See <a href='https://fontawesome.com/icons/dropbox?style=brands'>example</a>
         */
        DROPBOX,
        /**
         * The brands drupal icon.See <a href='https://fontawesome.com/icons/drupal?style=brands'>example</a>
         */
        DRUPAL,
        /**
         * The brands dyalog icon.See <a href='https://fontawesome.com/icons/dyalog?style=brands'>example</a>
         */
        DYALOG,
        /**
         * The brands earlybirds icon.See <a href='https://fontawesome.com/icons/earlybirds?style=brands'>example</a>
         */
        EARLYBIRDS,
        /**
         * The brands ebay icon.See <a href='https://fontawesome.com/icons/ebay?style=brands'>example</a>
         */
        EBAY,
        /**
         * The brands edge icon.See <a href='https://fontawesome.com/icons/edge?style=brands'>example</a>
         */
        EDGE,
        /**
         * The brands edge-legacy icon.See <a href='https://fontawesome.com/icons/edge-legacy?style=brands'>example</a>
         */
        EDGE_LEGACY,
        /**
         * The brands elementor icon.See <a href='https://fontawesome.com/icons/elementor?style=brands'>example</a>
         */
        ELEMENTOR,
        /**
         * The brands ello icon.See <a href='https://fontawesome.com/icons/ello?style=brands'>example</a>
         */
        ELLO,
        /**
         * The brands ember icon.See <a href='https://fontawesome.com/icons/ember?style=brands'>example</a>
         */
        EMBER,
        /**
         * The brands empire icon.See <a href='https://fontawesome.com/icons/empire?style=brands'>example</a>
         */
        EMPIRE,
        /**
         * The brands envira icon.See <a href='https://fontawesome.com/icons/envira?style=brands'>example</a>
         */
        ENVIRA,
        /**
         * The brands erlang icon.See <a href='https://fontawesome.com/icons/erlang?style=brands'>example</a>
         */
        ERLANG,
        /**
         * The brands ethereum icon.See <a href='https://fontawesome.com/icons/ethereum?style=brands'>example</a>
         */
        ETHEREUM,
        /**
         * The brands etsy icon.See <a href='https://fontawesome.com/icons/etsy?style=brands'>example</a>
         */
        ETSY,
        /**
         * The brands evernote icon.See <a href='https://fontawesome.com/icons/evernote?style=brands'>example</a>
         */
        EVERNOTE,
        /**
         * The brands expeditedssl icon.See <a href='https://fontawesome.com/icons/expeditedssl?style=brands'>example</a>
         */
        EXPEDITEDSSL,
        /**
         * The brands facebook icon.See <a href='https://fontawesome.com/icons/facebook?style=brands'>example</a>
         */
        FACEBOOK,
        /**
         * The brands facebook-f icon.See <a href='https://fontawesome.com/icons/facebook-f?style=brands'>example</a>
         */
        FACEBOOK_F,
        /**
         * The brands facebook-messenger icon.See <a href='https://fontawesome.com/icons/facebook-messenger?style=brands'>example</a>
         */
        FACEBOOK_MESSENGER,
        /**
         * The brands facebook-square icon.See <a href='https://fontawesome.com/icons/facebook-square?style=brands'>example</a>
         */
        FACEBOOK_SQUARE,
        /**
         * The brands fantasy-flight-games icon.See <a href='https://fontawesome.com/icons/fantasy-flight-games?style=brands'>example</a>
         */
        FANTASY_FLIGHT_GAMES,
        /**
         * The brands fedex icon.See <a href='https://fontawesome.com/icons/fedex?style=brands'>example</a>
         */
        FEDEX,
        /**
         * The brands fedora icon.See <a href='https://fontawesome.com/icons/fedora?style=brands'>example</a>
         */
        FEDORA,
        /**
         * The brands figma icon.See <a href='https://fontawesome.com/icons/figma?style=brands'>example</a>
         */
        FIGMA,
        /**
         * The brands firefox icon.See <a href='https://fontawesome.com/icons/firefox?style=brands'>example</a>
         */
        FIREFOX,
        /**
         * The brands firefox-browser icon.See <a href='https://fontawesome.com/icons/firefox-browser?style=brands'>example</a>
         */
        FIREFOX_BROWSER,
        /**
         * The brands first-order icon.See <a href='https://fontawesome.com/icons/first-order?style=brands'>example</a>
         */
        FIRST_ORDER,
        /**
         * The brands first-order-alt icon.See <a href='https://fontawesome.com/icons/first-order-alt?style=brands'>example</a>
         */
        FIRST_ORDER_ALT,
        /**
         * The brands firstdraft icon.See <a href='https://fontawesome.com/icons/firstdraft?style=brands'>example</a>
         */
        FIRSTDRAFT,
        /**
         * The brands flickr icon.See <a href='https://fontawesome.com/icons/flickr?style=brands'>example</a>
         */
        FLICKR,
        /**
         * The brands flipboard icon.See <a href='https://fontawesome.com/icons/flipboard?style=brands'>example</a>
         */
        FLIPBOARD,
        /**
         * The brands fly icon.See <a href='https://fontawesome.com/icons/fly?style=brands'>example</a>
         */
        FLY,
        /**
         * The brands font-awesome icon.See <a href='https://fontawesome.com/icons/font-awesome?style=brands'>example</a>
         */
        FONT_AWESOME,
        /**
         * The brands font-awesome-alt icon.See <a href='https://fontawesome.com/icons/font-awesome-alt?style=brands'>example</a>
         */
        FONT_AWESOME_ALT,
        /**
         * The brands font-awesome-flag icon.See <a href='https://fontawesome.com/icons/font-awesome-flag?style=brands'>example</a>
         */
        FONT_AWESOME_FLAG,
        /**
         * The brands font-awesome-logo-full icon.See <a href='https://fontawesome.com/icons/font-awesome-logo-full?style=brands'>example</a>
         */
        FONT_AWESOME_LOGO_FULL,
        /**
         * The brands fonticons icon.See <a href='https://fontawesome.com/icons/fonticons?style=brands'>example</a>
         */
        FONTICONS,
        /**
         * The brands fonticons-fi icon.See <a href='https://fontawesome.com/icons/fonticons-fi?style=brands'>example</a>
         */
        FONTICONS_FI,
        /**
         * The brands fort-awesome icon.See <a href='https://fontawesome.com/icons/fort-awesome?style=brands'>example</a>
         */
        FORT_AWESOME,
        /**
         * The brands fort-awesome-alt icon.See <a href='https://fontawesome.com/icons/fort-awesome-alt?style=brands'>example</a>
         */
        FORT_AWESOME_ALT,
        /**
         * The brands forumbee icon.See <a href='https://fontawesome.com/icons/forumbee?style=brands'>example</a>
         */
        FORUMBEE,
        /**
         * The brands foursquare icon.See <a href='https://fontawesome.com/icons/foursquare?style=brands'>example</a>
         */
        FOURSQUARE,
        /**
         * The brands free-code-camp icon.See <a href='https://fontawesome.com/icons/free-code-camp?style=brands'>example</a>
         */
        FREE_CODE_CAMP,
        /**
         * The brands freebsd icon.See <a href='https://fontawesome.com/icons/freebsd?style=brands'>example</a>
         */
        FREEBSD,
        /**
         * The brands fulcrum icon.See <a href='https://fontawesome.com/icons/fulcrum?style=brands'>example</a>
         */
        FULCRUM,
        /**
         * The brands galactic-republic icon.See <a href='https://fontawesome.com/icons/galactic-republic?style=brands'>example</a>
         */
        GALACTIC_REPUBLIC,
        /**
         * The brands galactic-senate icon.See <a href='https://fontawesome.com/icons/galactic-senate?style=brands'>example</a>
         */
        GALACTIC_SENATE,
        /**
         * The brands get-pocket icon.See <a href='https://fontawesome.com/icons/get-pocket?style=brands'>example</a>
         */
        GET_POCKET,
        /**
         * The brands gg icon.See <a href='https://fontawesome.com/icons/gg?style=brands'>example</a>
         */
        GG,
        /**
         * The brands gg-circle icon.See <a href='https://fontawesome.com/icons/gg-circle?style=brands'>example</a>
         */
        GG_CIRCLE,
        /**
         * The brands git icon.See <a href='https://fontawesome.com/icons/git?style=brands'>example</a>
         */
        GIT,
        /**
         * The brands git-alt icon.See <a href='https://fontawesome.com/icons/git-alt?style=brands'>example</a>
         */
        GIT_ALT,
        /**
         * The brands git-square icon.See <a href='https://fontawesome.com/icons/git-square?style=brands'>example</a>
         */
        GIT_SQUARE,
        /**
         * The brands github icon.See <a href='https://fontawesome.com/icons/github?style=brands'>example</a>
         */
        GITHUB,
        /**
         * The brands github-alt icon.See <a href='https://fontawesome.com/icons/github-alt?style=brands'>example</a>
         */
        GITHUB_ALT,
        /**
         * The brands github-square icon.See <a href='https://fontawesome.com/icons/github-square?style=brands'>example</a>
         */
        GITHUB_SQUARE,
        /**
         * The brands gitkraken icon.See <a href='https://fontawesome.com/icons/gitkraken?style=brands'>example</a>
         */
        GITKRAKEN,
        /**
         * The brands gitlab icon.See <a href='https://fontawesome.com/icons/gitlab?style=brands'>example</a>
         */
        GITLAB,
        /**
         * The brands gitter icon.See <a href='https://fontawesome.com/icons/gitter?style=brands'>example</a>
         */
        GITTER,
        /**
         * The brands glide icon.See <a href='https://fontawesome.com/icons/glide?style=brands'>example</a>
         */
        GLIDE,
        /**
         * The brands glide-g icon.See <a href='https://fontawesome.com/icons/glide-g?style=brands'>example</a>
         */
        GLIDE_G,
        /**
         * The brands gofore icon.See <a href='https://fontawesome.com/icons/gofore?style=brands'>example</a>
         */
        GOFORE,
        /**
         * The brands goodreads icon.See <a href='https://fontawesome.com/icons/goodreads?style=brands'>example</a>
         */
        GOODREADS,
        /**
         * The brands goodreads-g icon.See <a href='https://fontawesome.com/icons/goodreads-g?style=brands'>example</a>
         */
        GOODREADS_G,
        /**
         * The brands google icon.See <a href='https://fontawesome.com/icons/google?style=brands'>example</a>
         */
        GOOGLE,
        /**
         * The brands google-drive icon.See <a href='https://fontawesome.com/icons/google-drive?style=brands'>example</a>
         */
        GOOGLE_DRIVE,
        /**
         * The brands google-pay icon.See <a href='https://fontawesome.com/icons/google-pay?style=brands'>example</a>
         */
        GOOGLE_PAY,
        /**
         * The brands google-play icon.See <a href='https://fontawesome.com/icons/google-play?style=brands'>example</a>
         */
        GOOGLE_PLAY,
        /**
         * The brands google-plus icon.See <a href='https://fontawesome.com/icons/google-plus?style=brands'>example</a>
         */
        GOOGLE_PLUS,
        /**
         * The brands google-plus-g icon.See <a href='https://fontawesome.com/icons/google-plus-g?style=brands'>example</a>
         */
        GOOGLE_PLUS_G,
        /**
         * The brands google-plus-square icon.See <a href='https://fontawesome.com/icons/google-plus-square?style=brands'>example</a>
         */
        GOOGLE_PLUS_SQUARE,
        /**
         * The brands google-wallet icon.See <a href='https://fontawesome.com/icons/google-wallet?style=brands'>example</a>
         */
        GOOGLE_WALLET,
        /**
         * The brands gratipay icon.See <a href='https://fontawesome.com/icons/gratipay?style=brands'>example</a>
         */
        GRATIPAY,
        /**
         * The brands grav icon.See <a href='https://fontawesome.com/icons/grav?style=brands'>example</a>
         */
        GRAV,
        /**
         * The brands gripfire icon.See <a href='https://fontawesome.com/icons/gripfire?style=brands'>example</a>
         */
        GRIPFIRE,
        /**
         * The brands grunt icon.See <a href='https://fontawesome.com/icons/grunt?style=brands'>example</a>
         */
        GRUNT,
        /**
         * The brands guilded icon.See <a href='https://fontawesome.com/icons/guilded?style=brands'>example</a>
         */
        GUILDED,
        /**
         * The brands gulp icon.See <a href='https://fontawesome.com/icons/gulp?style=brands'>example</a>
         */
        GULP,
        /**
         * The brands hacker-news icon.See <a href='https://fontawesome.com/icons/hacker-news?style=brands'>example</a>
         */
        HACKER_NEWS,
        /**
         * The brands hacker-news-square icon.See <a href='https://fontawesome.com/icons/hacker-news-square?style=brands'>example</a>
         */
        HACKER_NEWS_SQUARE,
        /**
         * The brands hackerrank icon.See <a href='https://fontawesome.com/icons/hackerrank?style=brands'>example</a>
         */
        HACKERRANK,
        /**
         * The brands hips icon.See <a href='https://fontawesome.com/icons/hips?style=brands'>example</a>
         */
        HIPS,
        /**
         * The brands hire-a-helper icon.See <a href='https://fontawesome.com/icons/hire-a-helper?style=brands'>example</a>
         */
        HIRE_A_HELPER,
        /**
         * The brands hive icon.See <a href='https://fontawesome.com/icons/hive?style=brands'>example</a>
         */
        HIVE,
        /**
         * The brands hooli icon.See <a href='https://fontawesome.com/icons/hooli?style=brands'>example</a>
         */
        HOOLI,
        /**
         * The brands hornbill icon.See <a href='https://fontawesome.com/icons/hornbill?style=brands'>example</a>
         */
        HORNBILL,
        /**
         * The brands hotjar icon.See <a href='https://fontawesome.com/icons/hotjar?style=brands'>example</a>
         */
        HOTJAR,
        /**
         * The brands houzz icon.See <a href='https://fontawesome.com/icons/houzz?style=brands'>example</a>
         */
        HOUZZ,
        /**
         * The brands html5 icon.See <a href='https://fontawesome.com/icons/html5?style=brands'>example</a>
         */
        HTML5,
        /**
         * The brands hubspot icon.See <a href='https://fontawesome.com/icons/hubspot?style=brands'>example</a>
         */
        HUBSPOT,
        /**
         * The brands ideal icon.See <a href='https://fontawesome.com/icons/ideal?style=brands'>example</a>
         */
        IDEAL,
        /**
         * The brands imdb icon.See <a href='https://fontawesome.com/icons/imdb?style=brands'>example</a>
         */
        IMDB,
        /**
         * The brands innosoft icon.See <a href='https://fontawesome.com/icons/innosoft?style=brands'>example</a>
         */
        INNOSOFT,
        /**
         * The brands instagram icon.See <a href='https://fontawesome.com/icons/instagram?style=brands'>example</a>
         */
        INSTAGRAM,
        /**
         * The brands instagram-square icon.See <a href='https://fontawesome.com/icons/instagram-square?style=brands'>example</a>
         */
        INSTAGRAM_SQUARE,
        /**
         * The brands instalod icon.See <a href='https://fontawesome.com/icons/instalod?style=brands'>example</a>
         */
        INSTALOD,
        /**
         * The brands intercom icon.See <a href='https://fontawesome.com/icons/intercom?style=brands'>example</a>
         */
        INTERCOM,
        /**
         * The brands internet-explorer icon.See <a href='https://fontawesome.com/icons/internet-explorer?style=brands'>example</a>
         */
        INTERNET_EXPLORER,
        /**
         * The brands invision icon.See <a href='https://fontawesome.com/icons/invision?style=brands'>example</a>
         */
        INVISION,
        /**
         * The brands ioxhost icon.See <a href='https://fontawesome.com/icons/ioxhost?style=brands'>example</a>
         */
        IOXHOST,
        /**
         * The brands itch-io icon.See <a href='https://fontawesome.com/icons/itch-io?style=brands'>example</a>
         */
        ITCH_IO,
        /**
         * The brands itunes icon.See <a href='https://fontawesome.com/icons/itunes?style=brands'>example</a>
         */
        ITUNES,
        /**
         * The brands itunes-note icon.See <a href='https://fontawesome.com/icons/itunes-note?style=brands'>example</a>
         */
        ITUNES_NOTE,
        /**
         * The brands java icon.See <a href='https://fontawesome.com/icons/java?style=brands'>example</a>
         */
        JAVA,
        /**
         * The brands jedi-order icon.See <a href='https://fontawesome.com/icons/jedi-order?style=brands'>example</a>
         */
        JEDI_ORDER,
        /**
         * The brands jenkins icon.See <a href='https://fontawesome.com/icons/jenkins?style=brands'>example</a>
         */
        JENKINS,
        /**
         * The brands jira icon.See <a href='https://fontawesome.com/icons/jira?style=brands'>example</a>
         */
        JIRA,
        /**
         * The brands joget icon.See <a href='https://fontawesome.com/icons/joget?style=brands'>example</a>
         */
        JOGET,
        /**
         * The brands joomla icon.See <a href='https://fontawesome.com/icons/joomla?style=brands'>example</a>
         */
        JOOMLA,
        /**
         * The brands js icon.See <a href='https://fontawesome.com/icons/js?style=brands'>example</a>
         */
        JS,
        /**
         * The brands js-square icon.See <a href='https://fontawesome.com/icons/js-square?style=brands'>example</a>
         */
        JS_SQUARE,
        /**
         * The brands jsfiddle icon.See <a href='https://fontawesome.com/icons/jsfiddle?style=brands'>example</a>
         */
        JSFIDDLE,
        /**
         * The brands kaggle icon.See <a href='https://fontawesome.com/icons/kaggle?style=brands'>example</a>
         */
        KAGGLE,
        /**
         * The brands keybase icon.See <a href='https://fontawesome.com/icons/keybase?style=brands'>example</a>
         */
        KEYBASE,
        /**
         * The brands keycdn icon.See <a href='https://fontawesome.com/icons/keycdn?style=brands'>example</a>
         */
        KEYCDN,
        /**
         * The brands kickstarter icon.See <a href='https://fontawesome.com/icons/kickstarter?style=brands'>example</a>
         */
        KICKSTARTER,
        /**
         * The brands kickstarter-k icon.See <a href='https://fontawesome.com/icons/kickstarter-k?style=brands'>example</a>
         */
        KICKSTARTER_K,
        /**
         * The brands korvue icon.See <a href='https://fontawesome.com/icons/korvue?style=brands'>example</a>
         */
        KORVUE,
        /**
         * The brands laravel icon.See <a href='https://fontawesome.com/icons/laravel?style=brands'>example</a>
         */
        LARAVEL,
        /**
         * The brands lastfm icon.See <a href='https://fontawesome.com/icons/lastfm?style=brands'>example</a>
         */
        LASTFM,
        /**
         * The brands lastfm-square icon.See <a href='https://fontawesome.com/icons/lastfm-square?style=brands'>example</a>
         */
        LASTFM_SQUARE,
        /**
         * The brands leanpub icon.See <a href='https://fontawesome.com/icons/leanpub?style=brands'>example</a>
         */
        LEANPUB,
        /**
         * The brands less icon.See <a href='https://fontawesome.com/icons/less?style=brands'>example</a>
         */
        LESS,
        /**
         * The brands line icon.See <a href='https://fontawesome.com/icons/line?style=brands'>example</a>
         */
        LINE,
        /**
         * The brands linkedin icon.See <a href='https://fontawesome.com/icons/linkedin?style=brands'>example</a>
         */
        LINKEDIN,
        /**
         * The brands linkedin-in icon.See <a href='https://fontawesome.com/icons/linkedin-in?style=brands'>example</a>
         */
        LINKEDIN_IN,
        /**
         * The brands linode icon.See <a href='https://fontawesome.com/icons/linode?style=brands'>example</a>
         */
        LINODE,
        /**
         * The brands linux icon.See <a href='https://fontawesome.com/icons/linux?style=brands'>example</a>
         */
        LINUX,
        /**
         * The brands lyft icon.See <a href='https://fontawesome.com/icons/lyft?style=brands'>example</a>
         */
        LYFT,
        /**
         * The brands magento icon.See <a href='https://fontawesome.com/icons/magento?style=brands'>example</a>
         */
        MAGENTO,
        /**
         * The brands mailchimp icon.See <a href='https://fontawesome.com/icons/mailchimp?style=brands'>example</a>
         */
        MAILCHIMP,
        /**
         * The brands mandalorian icon.See <a href='https://fontawesome.com/icons/mandalorian?style=brands'>example</a>
         */
        MANDALORIAN,
        /**
         * The brands markdown icon.See <a href='https://fontawesome.com/icons/markdown?style=brands'>example</a>
         */
        MARKDOWN,
        /**
         * The brands mastodon icon.See <a href='https://fontawesome.com/icons/mastodon?style=brands'>example</a>
         */
        MASTODON,
        /**
         * The brands maxcdn icon.See <a href='https://fontawesome.com/icons/maxcdn?style=brands'>example</a>
         */
        MAXCDN,
        /**
         * The brands mdb icon.See <a href='https://fontawesome.com/icons/mdb?style=brands'>example</a>
         */
        MDB,
        /**
         * The brands medapps icon.See <a href='https://fontawesome.com/icons/medapps?style=brands'>example</a>
         */
        MEDAPPS,
        /**
         * The brands medium icon.See <a href='https://fontawesome.com/icons/medium?style=brands'>example</a>
         */
        MEDIUM,
        /**
         * The brands medium-m icon.See <a href='https://fontawesome.com/icons/medium-m?style=brands'>example</a>
         */
        MEDIUM_M,
        /**
         * The brands medrt icon.See <a href='https://fontawesome.com/icons/medrt?style=brands'>example</a>
         */
        MEDRT,
        /**
         * The brands meetup icon.See <a href='https://fontawesome.com/icons/meetup?style=brands'>example</a>
         */
        MEETUP,
        /**
         * The brands megaport icon.See <a href='https://fontawesome.com/icons/megaport?style=brands'>example</a>
         */
        MEGAPORT,
        /**
         * The brands mendeley icon.See <a href='https://fontawesome.com/icons/mendeley?style=brands'>example</a>
         */
        MENDELEY,
        /**
         * The brands microblog icon.See <a href='https://fontawesome.com/icons/microblog?style=brands'>example</a>
         */
        MICROBLOG,
        /**
         * The brands microsoft icon.See <a href='https://fontawesome.com/icons/microsoft?style=brands'>example</a>
         */
        MICROSOFT,
        /**
         * The brands mix icon.See <a href='https://fontawesome.com/icons/mix?style=brands'>example</a>
         */
        MIX,
        /**
         * The brands mixcloud icon.See <a href='https://fontawesome.com/icons/mixcloud?style=brands'>example</a>
         */
        MIXCLOUD,
        /**
         * The brands mixer icon.See <a href='https://fontawesome.com/icons/mixer?style=brands'>example</a>
         */
        MIXER,
        /**
         * The brands mizuni icon.See <a href='https://fontawesome.com/icons/mizuni?style=brands'>example</a>
         */
        MIZUNI,
        /**
         * The brands modx icon.See <a href='https://fontawesome.com/icons/modx?style=brands'>example</a>
         */
        MODX,
        /**
         * The brands monero icon.See <a href='https://fontawesome.com/icons/monero?style=brands'>example</a>
         */
        MONERO,
        /**
         * The brands napster icon.See <a href='https://fontawesome.com/icons/napster?style=brands'>example</a>
         */
        NAPSTER,
        /**
         * The brands neos icon.See <a href='https://fontawesome.com/icons/neos?style=brands'>example</a>
         */
        NEOS,
        /**
         * The brands nimblr icon.See <a href='https://fontawesome.com/icons/nimblr?style=brands'>example</a>
         */
        NIMBLR,
        /**
         * The brands node icon.See <a href='https://fontawesome.com/icons/node?style=brands'>example</a>
         */
        NODE,
        /**
         * The brands node-js icon.See <a href='https://fontawesome.com/icons/node-js?style=brands'>example</a>
         */
        NODE_JS,
        /**
         * The brands npm icon.See <a href='https://fontawesome.com/icons/npm?style=brands'>example</a>
         */
        NPM,
        /**
         * The brands ns8 icon.See <a href='https://fontawesome.com/icons/ns8?style=brands'>example</a>
         */
        NS8,
        /**
         * The brands nutritionix icon.See <a href='https://fontawesome.com/icons/nutritionix?style=brands'>example</a>
         */
        NUTRITIONIX,
        /**
         * The brands octopus-deploy icon.See <a href='https://fontawesome.com/icons/octopus-deploy?style=brands'>example</a>
         */
        OCTOPUS_DEPLOY,
        /**
         * The brands odnoklassniki icon.See <a href='https://fontawesome.com/icons/odnoklassniki?style=brands'>example</a>
         */
        ODNOKLASSNIKI,
        /**
         * The brands odnoklassniki-square icon.See <a href='https://fontawesome.com/icons/odnoklassniki-square?style=brands'>example</a>
         */
        ODNOKLASSNIKI_SQUARE,
        /**
         * The brands old-republic icon.See <a href='https://fontawesome.com/icons/old-republic?style=brands'>example</a>
         */
        OLD_REPUBLIC,
        /**
         * The brands opencart icon.See <a href='https://fontawesome.com/icons/opencart?style=brands'>example</a>
         */
        OPENCART,
        /**
         * The brands openid icon.See <a href='https://fontawesome.com/icons/openid?style=brands'>example</a>
         */
        OPENID,
        /**
         * The brands opera icon.See <a href='https://fontawesome.com/icons/opera?style=brands'>example</a>
         */
        OPERA,
        /**
         * The brands optin-monster icon.See <a href='https://fontawesome.com/icons/optin-monster?style=brands'>example</a>
         */
        OPTIN_MONSTER,
        /**
         * The brands orcid icon.See <a href='https://fontawesome.com/icons/orcid?style=brands'>example</a>
         */
        ORCID,
        /**
         * The brands osi icon.See <a href='https://fontawesome.com/icons/osi?style=brands'>example</a>
         */
        OSI,
        /**
         * The brands page4 icon.See <a href='https://fontawesome.com/icons/page4?style=brands'>example</a>
         */
        PAGE4,
        /**
         * The brands pagelines icon.See <a href='https://fontawesome.com/icons/pagelines?style=brands'>example</a>
         */
        PAGELINES,
        /**
         * The brands palfed icon.See <a href='https://fontawesome.com/icons/palfed?style=brands'>example</a>
         */
        PALFED,
        /**
         * The brands patreon icon.See <a href='https://fontawesome.com/icons/patreon?style=brands'>example</a>
         */
        PATREON,
        /**
         * The brands paypal icon.See <a href='https://fontawesome.com/icons/paypal?style=brands'>example</a>
         */
        PAYPAL,
        /**
         * The brands penny-arcade icon.See <a href='https://fontawesome.com/icons/penny-arcade?style=brands'>example</a>
         */
        PENNY_ARCADE,
        /**
         * The brands perbyte icon.See <a href='https://fontawesome.com/icons/perbyte?style=brands'>example</a>
         */
        PERBYTE,
        /**
         * The brands periscope icon.See <a href='https://fontawesome.com/icons/periscope?style=brands'>example</a>
         */
        PERISCOPE,
        /**
         * The brands phabricator icon.See <a href='https://fontawesome.com/icons/phabricator?style=brands'>example</a>
         */
        PHABRICATOR,
        /**
         * The brands phoenix-framework icon.See <a href='https://fontawesome.com/icons/phoenix-framework?style=brands'>example</a>
         */
        PHOENIX_FRAMEWORK,
        /**
         * The brands phoenix-squadron icon.See <a href='https://fontawesome.com/icons/phoenix-squadron?style=brands'>example</a>
         */
        PHOENIX_SQUADRON,
        /**
         * The brands php icon.See <a href='https://fontawesome.com/icons/php?style=brands'>example</a>
         */
        PHP,
        /**
         * The brands pied-piper icon.See <a href='https://fontawesome.com/icons/pied-piper?style=brands'>example</a>
         */
        PIED_PIPER,
        /**
         * The brands pied-piper-alt icon.See <a href='https://fontawesome.com/icons/pied-piper-alt?style=brands'>example</a>
         */
        PIED_PIPER_ALT,
        /**
         * The brands pied-piper-hat icon.See <a href='https://fontawesome.com/icons/pied-piper-hat?style=brands'>example</a>
         */
        PIED_PIPER_HAT,
        /**
         * The brands pied-piper-pp icon.See <a href='https://fontawesome.com/icons/pied-piper-pp?style=brands'>example</a>
         */
        PIED_PIPER_PP,
        /**
         * The brands pied-piper-square icon.See <a href='https://fontawesome.com/icons/pied-piper-square?style=brands'>example</a>
         */
        PIED_PIPER_SQUARE,
        /**
         * The brands pinterest icon.See <a href='https://fontawesome.com/icons/pinterest?style=brands'>example</a>
         */
        PINTEREST,
        /**
         * The brands pinterest-p icon.See <a href='https://fontawesome.com/icons/pinterest-p?style=brands'>example</a>
         */
        PINTEREST_P,
        /**
         * The brands pinterest-square icon.See <a href='https://fontawesome.com/icons/pinterest-square?style=brands'>example</a>
         */
        PINTEREST_SQUARE,
        /**
         * The brands playstation icon.See <a href='https://fontawesome.com/icons/playstation?style=brands'>example</a>
         */
        PLAYSTATION,
        /**
         * The brands product-hunt icon.See <a href='https://fontawesome.com/icons/product-hunt?style=brands'>example</a>
         */
        PRODUCT_HUNT,
        /**
         * The brands pushed icon.See <a href='https://fontawesome.com/icons/pushed?style=brands'>example</a>
         */
        PUSHED,
        /**
         * The brands python icon.See <a href='https://fontawesome.com/icons/python?style=brands'>example</a>
         */
        PYTHON,
        /**
         * The brands qq icon.See <a href='https://fontawesome.com/icons/qq?style=brands'>example</a>
         */
        QQ,
        /**
         * The brands quinscape icon.See <a href='https://fontawesome.com/icons/quinscape?style=brands'>example</a>
         */
        QUINSCAPE,
        /**
         * The brands quora icon.See <a href='https://fontawesome.com/icons/quora?style=brands'>example</a>
         */
        QUORA,
        /**
         * The brands r-project icon.See <a href='https://fontawesome.com/icons/r-project?style=brands'>example</a>
         */
        R_PROJECT,
        /**
         * The brands raspberry-pi icon.See <a href='https://fontawesome.com/icons/raspberry-pi?style=brands'>example</a>
         */
        RASPBERRY_PI,
        /**
         * The brands ravelry icon.See <a href='https://fontawesome.com/icons/ravelry?style=brands'>example</a>
         */
        RAVELRY,
        /**
         * The brands react icon.See <a href='https://fontawesome.com/icons/react?style=brands'>example</a>
         */
        REACT,
        /**
         * The brands reacteurope icon.See <a href='https://fontawesome.com/icons/reacteurope?style=brands'>example</a>
         */
        REACTEUROPE,
        /**
         * The brands readme icon.See <a href='https://fontawesome.com/icons/readme?style=brands'>example</a>
         */
        README,
        /**
         * The brands rebel icon.See <a href='https://fontawesome.com/icons/rebel?style=brands'>example</a>
         */
        REBEL,
        /**
         * The brands red-river icon.See <a href='https://fontawesome.com/icons/red-river?style=brands'>example</a>
         */
        RED_RIVER,
        /**
         * The brands reddit icon.See <a href='https://fontawesome.com/icons/reddit?style=brands'>example</a>
         */
        REDDIT,
        /**
         * The brands reddit-alien icon.See <a href='https://fontawesome.com/icons/reddit-alien?style=brands'>example</a>
         */
        REDDIT_ALIEN,
        /**
         * The brands reddit-square icon.See <a href='https://fontawesome.com/icons/reddit-square?style=brands'>example</a>
         */
        REDDIT_SQUARE,
        /**
         * The brands redhat icon.See <a href='https://fontawesome.com/icons/redhat?style=brands'>example</a>
         */
        REDHAT,
        /**
         * The brands renren icon.See <a href='https://fontawesome.com/icons/renren?style=brands'>example</a>
         */
        RENREN,
        /**
         * The brands replyd icon.See <a href='https://fontawesome.com/icons/replyd?style=brands'>example</a>
         */
        REPLYD,
        /**
         * The brands researchgate icon.See <a href='https://fontawesome.com/icons/researchgate?style=brands'>example</a>
         */
        RESEARCHGATE,
        /**
         * The brands resolving icon.See <a href='https://fontawesome.com/icons/resolving?style=brands'>example</a>
         */
        RESOLVING,
        /**
         * The brands rev icon.See <a href='https://fontawesome.com/icons/rev?style=brands'>example</a>
         */
        REV,
        /**
         * The brands rocketchat icon.See <a href='https://fontawesome.com/icons/rocketchat?style=brands'>example</a>
         */
        ROCKETCHAT,
        /**
         * The brands rockrms icon.See <a href='https://fontawesome.com/icons/rockrms?style=brands'>example</a>
         */
        ROCKRMS,
        /**
         * The brands rust icon.See <a href='https://fontawesome.com/icons/rust?style=brands'>example</a>
         */
        RUST,
        /**
         * The brands safari icon.See <a href='https://fontawesome.com/icons/safari?style=brands'>example</a>
         */
        SAFARI,
        /**
         * The brands salesforce icon.See <a href='https://fontawesome.com/icons/salesforce?style=brands'>example</a>
         */
        SALESFORCE,
        /**
         * The brands sass icon.See <a href='https://fontawesome.com/icons/sass?style=brands'>example</a>
         */
        SASS,
        /**
         * The brands schlix icon.See <a href='https://fontawesome.com/icons/schlix?style=brands'>example</a>
         */
        SCHLIX,
        /**
         * The brands scribd icon.See <a href='https://fontawesome.com/icons/scribd?style=brands'>example</a>
         */
        SCRIBD,
        /**
         * The brands searchengin icon.See <a href='https://fontawesome.com/icons/searchengin?style=brands'>example</a>
         */
        SEARCHENGIN,
        /**
         * The brands sellcast icon.See <a href='https://fontawesome.com/icons/sellcast?style=brands'>example</a>
         */
        SELLCAST,
        /**
         * The brands sellsy icon.See <a href='https://fontawesome.com/icons/sellsy?style=brands'>example</a>
         */
        SELLSY,
        /**
         * The brands servicestack icon.See <a href='https://fontawesome.com/icons/servicestack?style=brands'>example</a>
         */
        SERVICESTACK,
        /**
         * The brands shirtsinbulk icon.See <a href='https://fontawesome.com/icons/shirtsinbulk?style=brands'>example</a>
         */
        SHIRTSINBULK,
        /**
         * The brands shopify icon.See <a href='https://fontawesome.com/icons/shopify?style=brands'>example</a>
         */
        SHOPIFY,
        /**
         * The brands shopware icon.See <a href='https://fontawesome.com/icons/shopware?style=brands'>example</a>
         */
        SHOPWARE,
        /**
         * The brands simplybuilt icon.See <a href='https://fontawesome.com/icons/simplybuilt?style=brands'>example</a>
         */
        SIMPLYBUILT,
        /**
         * The brands sistrix icon.See <a href='https://fontawesome.com/icons/sistrix?style=brands'>example</a>
         */
        SISTRIX,
        /**
         * The brands sith icon.See <a href='https://fontawesome.com/icons/sith?style=brands'>example</a>
         */
        SITH,
        /**
         * The brands sketch icon.See <a href='https://fontawesome.com/icons/sketch?style=brands'>example</a>
         */
        SKETCH,
        /**
         * The brands skyatlas icon.See <a href='https://fontawesome.com/icons/skyatlas?style=brands'>example</a>
         */
        SKYATLAS,
        /**
         * The brands skype icon.See <a href='https://fontawesome.com/icons/skype?style=brands'>example</a>
         */
        SKYPE,
        /**
         * The brands slack icon.See <a href='https://fontawesome.com/icons/slack?style=brands'>example</a>
         */
        SLACK,
        /**
         * The brands slack-hash icon.See <a href='https://fontawesome.com/icons/slack-hash?style=brands'>example</a>
         */
        SLACK_HASH,
        /**
         * The brands slideshare icon.See <a href='https://fontawesome.com/icons/slideshare?style=brands'>example</a>
         */
        SLIDESHARE,
        /**
         * The brands snapchat icon.See <a href='https://fontawesome.com/icons/snapchat?style=brands'>example</a>
         */
        SNAPCHAT,
        /**
         * The brands snapchat-ghost icon.See <a href='https://fontawesome.com/icons/snapchat-ghost?style=brands'>example</a>
         */
        SNAPCHAT_GHOST,
        /**
         * The brands snapchat-square icon.See <a href='https://fontawesome.com/icons/snapchat-square?style=brands'>example</a>
         */
        SNAPCHAT_SQUARE,
        /**
         * The brands soundcloud icon.See <a href='https://fontawesome.com/icons/soundcloud?style=brands'>example</a>
         */
        SOUNDCLOUD,
        /**
         * The brands sourcetree icon.See <a href='https://fontawesome.com/icons/sourcetree?style=brands'>example</a>
         */
        SOURCETREE,
        /**
         * The brands speakap icon.See <a href='https://fontawesome.com/icons/speakap?style=brands'>example</a>
         */
        SPEAKAP,
        /**
         * The brands speaker-deck icon.See <a href='https://fontawesome.com/icons/speaker-deck?style=brands'>example</a>
         */
        SPEAKER_DECK,
        /**
         * The brands spotify icon.See <a href='https://fontawesome.com/icons/spotify?style=brands'>example</a>
         */
        SPOTIFY,
        /**
         * The brands squarespace icon.See <a href='https://fontawesome.com/icons/squarespace?style=brands'>example</a>
         */
        SQUARESPACE,
        /**
         * The brands stack-exchange icon.See <a href='https://fontawesome.com/icons/stack-exchange?style=brands'>example</a>
         */
        STACK_EXCHANGE,
        /**
         * The brands stack-overflow icon.See <a href='https://fontawesome.com/icons/stack-overflow?style=brands'>example</a>
         */
        STACK_OVERFLOW,
        /**
         * The brands stackpath icon.See <a href='https://fontawesome.com/icons/stackpath?style=brands'>example</a>
         */
        STACKPATH,
        /**
         * The brands staylinked icon.See <a href='https://fontawesome.com/icons/staylinked?style=brands'>example</a>
         */
        STAYLINKED,
        /**
         * The brands steam icon.See <a href='https://fontawesome.com/icons/steam?style=brands'>example</a>
         */
        STEAM,
        /**
         * The brands steam-square icon.See <a href='https://fontawesome.com/icons/steam-square?style=brands'>example</a>
         */
        STEAM_SQUARE,
        /**
         * The brands steam-symbol icon.See <a href='https://fontawesome.com/icons/steam-symbol?style=brands'>example</a>
         */
        STEAM_SYMBOL,
        /**
         * The brands sticker-mule icon.See <a href='https://fontawesome.com/icons/sticker-mule?style=brands'>example</a>
         */
        STICKER_MULE,
        /**
         * The brands strava icon.See <a href='https://fontawesome.com/icons/strava?style=brands'>example</a>
         */
        STRAVA,
        /**
         * The brands stripe icon.See <a href='https://fontawesome.com/icons/stripe?style=brands'>example</a>
         */
        STRIPE,
        /**
         * The brands stripe-s icon.See <a href='https://fontawesome.com/icons/stripe-s?style=brands'>example</a>
         */
        STRIPE_S,
        /**
         * The brands studiovinari icon.See <a href='https://fontawesome.com/icons/studiovinari?style=brands'>example</a>
         */
        STUDIOVINARI,
        /**
         * The brands stumbleupon icon.See <a href='https://fontawesome.com/icons/stumbleupon?style=brands'>example</a>
         */
        STUMBLEUPON,
        /**
         * The brands stumbleupon-circle icon.See <a href='https://fontawesome.com/icons/stumbleupon-circle?style=brands'>example</a>
         */
        STUMBLEUPON_CIRCLE,
        /**
         * The brands superpowers icon.See <a href='https://fontawesome.com/icons/superpowers?style=brands'>example</a>
         */
        SUPERPOWERS,
        /**
         * The brands supple icon.See <a href='https://fontawesome.com/icons/supple?style=brands'>example</a>
         */
        SUPPLE,
        /**
         * The brands suse icon.See <a href='https://fontawesome.com/icons/suse?style=brands'>example</a>
         */
        SUSE,
        /**
         * The brands swift icon.See <a href='https://fontawesome.com/icons/swift?style=brands'>example</a>
         */
        SWIFT,
        /**
         * The brands symfony icon.See <a href='https://fontawesome.com/icons/symfony?style=brands'>example</a>
         */
        SYMFONY,
        /**
         * The brands teamspeak icon.See <a href='https://fontawesome.com/icons/teamspeak?style=brands'>example</a>
         */
        TEAMSPEAK,
        /**
         * The brands telegram icon.See <a href='https://fontawesome.com/icons/telegram?style=brands'>example</a>
         */
        TELEGRAM,
        /**
         * The brands telegram-plane icon.See <a href='https://fontawesome.com/icons/telegram-plane?style=brands'>example</a>
         */
        TELEGRAM_PLANE,
        /**
         * The brands tencent-weibo icon.See <a href='https://fontawesome.com/icons/tencent-weibo?style=brands'>example</a>
         */
        TENCENT_WEIBO,
        /**
         * The brands the-red-yeti icon.See <a href='https://fontawesome.com/icons/the-red-yeti?style=brands'>example</a>
         */
        THE_RED_YETI,
        /**
         * The brands themeco icon.See <a href='https://fontawesome.com/icons/themeco?style=brands'>example</a>
         */
        THEMECO,
        /**
         * The brands themeisle icon.See <a href='https://fontawesome.com/icons/themeisle?style=brands'>example</a>
         */
        THEMEISLE,
        /**
         * The brands think-peaks icon.See <a href='https://fontawesome.com/icons/think-peaks?style=brands'>example</a>
         */
        THINK_PEAKS,
        /**
         * The brands tiktok icon.See <a href='https://fontawesome.com/icons/tiktok?style=brands'>example</a>
         */
        TIKTOK,
        /**
         * The brands trade-federation icon.See <a href='https://fontawesome.com/icons/trade-federation?style=brands'>example</a>
         */
        TRADE_FEDERATION,
        /**
         * The brands trello icon.See <a href='https://fontawesome.com/icons/trello?style=brands'>example</a>
         */
        TRELLO,
        /**
         * The brands tripadvisor icon.See <a href='https://fontawesome.com/icons/tripadvisor?style=brands'>example</a>
         */
        TRIPADVISOR,
        /**
         * The brands tumblr icon.See <a href='https://fontawesome.com/icons/tumblr?style=brands'>example</a>
         */
        TUMBLR,
        /**
         * The brands tumblr-square icon.See <a href='https://fontawesome.com/icons/tumblr-square?style=brands'>example</a>
         */
        TUMBLR_SQUARE,
        /**
         * The brands twitch icon.See <a href='https://fontawesome.com/icons/twitch?style=brands'>example</a>
         */
        TWITCH,
        /**
         * The brands twitter icon.See <a href='https://fontawesome.com/icons/twitter?style=brands'>example</a>
         */
        TWITTER,
        /**
         * The brands twitter-square icon.See <a href='https://fontawesome.com/icons/twitter-square?style=brands'>example</a>
         */
        TWITTER_SQUARE,
        /**
         * The brands typo3 icon.See <a href='https://fontawesome.com/icons/typo3?style=brands'>example</a>
         */
        TYPO3,
        /**
         * The brands uber icon.See <a href='https://fontawesome.com/icons/uber?style=brands'>example</a>
         */
        UBER,
        /**
         * The brands ubuntu icon.See <a href='https://fontawesome.com/icons/ubuntu?style=brands'>example</a>
         */
        UBUNTU,
        /**
         * The brands uikit icon.See <a href='https://fontawesome.com/icons/uikit?style=brands'>example</a>
         */
        UIKIT,
        /**
         * The brands umbraco icon.See <a href='https://fontawesome.com/icons/umbraco?style=brands'>example</a>
         */
        UMBRACO,
        /**
         * The brands uncharted icon.See <a href='https://fontawesome.com/icons/uncharted?style=brands'>example</a>
         */
        UNCHARTED,
        /**
         * The brands uniregistry icon.See <a href='https://fontawesome.com/icons/uniregistry?style=brands'>example</a>
         */
        UNIREGISTRY,
        /**
         * The brands unity icon.See <a href='https://fontawesome.com/icons/unity?style=brands'>example</a>
         */
        UNITY,
        /**
         * The brands unsplash icon.See <a href='https://fontawesome.com/icons/unsplash?style=brands'>example</a>
         */
        UNSPLASH,
        /**
         * The brands untappd icon.See <a href='https://fontawesome.com/icons/untappd?style=brands'>example</a>
         */
        UNTAPPD,
        /**
         * The brands ups icon.See <a href='https://fontawesome.com/icons/ups?style=brands'>example</a>
         */
        UPS,
        /**
         * The brands usb icon.See <a href='https://fontawesome.com/icons/usb?style=brands'>example</a>
         */
        USB,
        /**
         * The brands usps icon.See <a href='https://fontawesome.com/icons/usps?style=brands'>example</a>
         */
        USPS,
        /**
         * The brands ussunnah icon.See <a href='https://fontawesome.com/icons/ussunnah?style=brands'>example</a>
         */
        USSUNNAH,
        /**
         * The brands vaadin icon.See <a href='https://fontawesome.com/icons/vaadin?style=brands'>example</a>
         */
        VAADIN,
        /**
         * The brands viacoin icon.See <a href='https://fontawesome.com/icons/viacoin?style=brands'>example</a>
         */
        VIACOIN,
        /**
         * The brands viadeo icon.See <a href='https://fontawesome.com/icons/viadeo?style=brands'>example</a>
         */
        VIADEO,
        /**
         * The brands viadeo-square icon.See <a href='https://fontawesome.com/icons/viadeo-square?style=brands'>example</a>
         */
        VIADEO_SQUARE,
        /**
         * The brands viber icon.See <a href='https://fontawesome.com/icons/viber?style=brands'>example</a>
         */
        VIBER,
        /**
         * The brands vimeo icon.See <a href='https://fontawesome.com/icons/vimeo?style=brands'>example</a>
         */
        VIMEO,
        /**
         * The brands vimeo-square icon.See <a href='https://fontawesome.com/icons/vimeo-square?style=brands'>example</a>
         */
        VIMEO_SQUARE,
        /**
         * The brands vimeo-v icon.See <a href='https://fontawesome.com/icons/vimeo-v?style=brands'>example</a>
         */
        VIMEO_V,
        /**
         * The brands vine icon.See <a href='https://fontawesome.com/icons/vine?style=brands'>example</a>
         */
        VINE,
        /**
         * The brands vk icon.See <a href='https://fontawesome.com/icons/vk?style=brands'>example</a>
         */
        VK,
        /**
         * The brands vnv icon.See <a href='https://fontawesome.com/icons/vnv?style=brands'>example</a>
         */
        VNV,
        /**
         * The brands vuejs icon.See <a href='https://fontawesome.com/icons/vuejs?style=brands'>example</a>
         */
        VUEJS,
        /**
         * The brands watchman-monitoring icon.See <a href='https://fontawesome.com/icons/watchman-monitoring?style=brands'>example</a>
         */
        WATCHMAN_MONITORING,
        /**
         * The brands waze icon.See <a href='https://fontawesome.com/icons/waze?style=brands'>example</a>
         */
        WAZE,
        /**
         * The brands weebly icon.See <a href='https://fontawesome.com/icons/weebly?style=brands'>example</a>
         */
        WEEBLY,
        /**
         * The brands weibo icon.See <a href='https://fontawesome.com/icons/weibo?style=brands'>example</a>
         */
        WEIBO,
        /**
         * The brands weixin icon.See <a href='https://fontawesome.com/icons/weixin?style=brands'>example</a>
         */
        WEIXIN,
        /**
         * The brands whatsapp icon.See <a href='https://fontawesome.com/icons/whatsapp?style=brands'>example</a>
         */
        WHATSAPP,
        /**
         * The brands whatsapp-square icon.See <a href='https://fontawesome.com/icons/whatsapp-square?style=brands'>example</a>
         */
        WHATSAPP_SQUARE,
        /**
         * The brands whmcs icon.See <a href='https://fontawesome.com/icons/whmcs?style=brands'>example</a>
         */
        WHMCS,
        /**
         * The brands wikipedia-w icon.See <a href='https://fontawesome.com/icons/wikipedia-w?style=brands'>example</a>
         */
        WIKIPEDIA_W,
        /**
         * The brands windows icon.See <a href='https://fontawesome.com/icons/windows?style=brands'>example</a>
         */
        WINDOWS,
        /**
         * The brands wix icon.See <a href='https://fontawesome.com/icons/wix?style=brands'>example</a>
         */
        WIX,
        /**
         * The brands wizards-of-the-coast icon.See <a href='https://fontawesome.com/icons/wizards-of-the-coast?style=brands'>example</a>
         */
        WIZARDS_OF_THE_COAST,
        /**
         * The brands wodu icon.See <a href='https://fontawesome.com/icons/wodu?style=brands'>example</a>
         */
        WODU,
        /**
         * The brands wolf-pack-battalion icon.See <a href='https://fontawesome.com/icons/wolf-pack-battalion?style=brands'>example</a>
         */
        WOLF_PACK_BATTALION,
        /**
         * The brands wordpress icon.See <a href='https://fontawesome.com/icons/wordpress?style=brands'>example</a>
         */
        WORDPRESS,
        /**
         * The brands wordpress-simple icon.See <a href='https://fontawesome.com/icons/wordpress-simple?style=brands'>example</a>
         */
        WORDPRESS_SIMPLE,
        /**
         * The brands wpbeginner icon.See <a href='https://fontawesome.com/icons/wpbeginner?style=brands'>example</a>
         */
        WPBEGINNER,
        /**
         * The brands wpexplorer icon.See <a href='https://fontawesome.com/icons/wpexplorer?style=brands'>example</a>
         */
        WPEXPLORER,
        /**
         * The brands wpforms icon.See <a href='https://fontawesome.com/icons/wpforms?style=brands'>example</a>
         */
        WPFORMS,
        /**
         * The brands wpressr icon.See <a href='https://fontawesome.com/icons/wpressr?style=brands'>example</a>
         */
        WPRESSR,
        /**
         * The brands xbox icon.See <a href='https://fontawesome.com/icons/xbox?style=brands'>example</a>
         */
        XBOX,
        /**
         * The brands xing icon.See <a href='https://fontawesome.com/icons/xing?style=brands'>example</a>
         */
        XING,
        /**
         * The brands xing-square icon.See <a href='https://fontawesome.com/icons/xing-square?style=brands'>example</a>
         */
        XING_SQUARE,
        /**
         * The brands y-combinator icon.See <a href='https://fontawesome.com/icons/y-combinator?style=brands'>example</a>
         */
        Y_COMBINATOR,
        /**
         * The brands yahoo icon.See <a href='https://fontawesome.com/icons/yahoo?style=brands'>example</a>
         */
        YAHOO,
        /**
         * The brands yammer icon.See <a href='https://fontawesome.com/icons/yammer?style=brands'>example</a>
         */
        YAMMER,
        /**
         * The brands yandex icon.See <a href='https://fontawesome.com/icons/yandex?style=brands'>example</a>
         */
        YANDEX,
        /**
         * The brands yandex-international icon.See <a href='https://fontawesome.com/icons/yandex-international?style=brands'>example</a>
         */
        YANDEX_INTERNATIONAL,
        /**
         * The brands yarn icon.See <a href='https://fontawesome.com/icons/yarn?style=brands'>example</a>
         */
        YARN,
        /**
         * The brands yelp icon.See <a href='https://fontawesome.com/icons/yelp?style=brands'>example</a>
         */
        YELP,
        /**
         * The brands yoast icon.See <a href='https://fontawesome.com/icons/yoast?style=brands'>example</a>
         */
        YOAST,
        /**
         * The brands youtube icon.See <a href='https://fontawesome.com/icons/youtube?style=brands'>example</a>
         */
        YOUTUBE,
        /**
         * The brands youtube-square icon.See <a href='https://fontawesome.com/icons/youtube-square?style=brands'>example</a>
         */
        YOUTUBE_SQUARE,
        /**
         * The brands zhihu icon.See <a href='https://fontawesome.com/icons/zhihu?style=brands'>example</a>
         */
        ZHIHU;

        /**
         * The Iconset name, i.e. {@code "fab"}."
         */
        public static final String ICONSET = "fab";

        /**
         * Return the icon name.
         * @return the icon name, i.e. {@code "fab:name"}..
         */
        public String getIconName() {
            return ICONSET+':'+getIconPart();
        }

        private String getIconPart() {
            return this.name().toLowerCase(Locale.ENGLISH).replace('_', '-').replaceFirst("^-", "");
        }

        /**
         * Create a new {@link IronIcon} instance with the icon determined by the name.
         * @return a new instance of {@link IronIcon} component
         */
        public Icon create() {
            return new Icon(this.getIconPart());
        }

        /**
         * Create a new {@link IronIcon} instance with the icon determined by the name and a listener for click events.
         * @param listener the event listener for click events
         * @return a new instance of {@link IronIcon} component
         */
        public Icon create(ComponentEventListener<ClickEvent<IronIcon>> listener) {
            Icon icon = create();
            icon.addClickListener(listener);
            return icon;
        }

        /**
         * Server side component for {@code Brands}
         */
        @JsModule("./font-awesome-iron-iconset/fab.js")
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "2.2.0")
        @SuppressWarnings("serial")
        public static final class Icon extends IronIcon implements ClickNotifier<IronIcon> {

             Icon(String icon) {
                super(ICONSET, icon);
            }
        }
    }
}
