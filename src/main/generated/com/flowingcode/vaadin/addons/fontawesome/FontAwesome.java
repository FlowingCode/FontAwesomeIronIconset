/*-
 * #%L
 * FontAwesome Iron Iconset
 * %%
 * Copyright (C) 2019 - 2022 Flowing Code
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

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.ComponentEventListener;
import java.util.Locale;

/**
 * FontAwesome 6.1.2 icons.
 * @author Javier Godoy / Flowing Code
 */
@SuppressWarnings({ "squid:S4784", "squid:S00115" })
public final class FontAwesome {

    /**
     * Enumeration of all icons in the FontAwesome regular iconset
     * <p>
     * These instances can be used to create {@link Icon} components either by using
     * their {@link #create()} method or by passing them to Icon's constructor.
     *
     * @author Javier Godoy / Flowing Code
     */
    public enum Regular implements IconFactory {

        /**
         * The regular address-book icon.See <a href='https://fontawesome.com/v6/icons/address-book?s=regular'>example</a>
         */
        ADDRESS_BOOK,
        /**
         * The regular address-card icon.See <a href='https://fontawesome.com/v6/icons/address-card?s=regular'>example</a>
         */
        ADDRESS_CARD,
        /**
         * The regular angry icon.See <a href='https://fontawesome.com/v6/icons/angry?s=regular'>example</a>
         */
        ANGRY,
        /**
         * The regular arrow-alt-circle-down icon.See <a href='https://fontawesome.com/v6/icons/arrow-alt-circle-down?s=regular'>example</a>
         */
        ARROW_ALT_CIRCLE_DOWN,
        /**
         * The regular arrow-alt-circle-left icon.See <a href='https://fontawesome.com/v6/icons/arrow-alt-circle-left?s=regular'>example</a>
         */
        ARROW_ALT_CIRCLE_LEFT,
        /**
         * The regular arrow-alt-circle-right icon.See <a href='https://fontawesome.com/v6/icons/arrow-alt-circle-right?s=regular'>example</a>
         */
        ARROW_ALT_CIRCLE_RIGHT,
        /**
         * The regular arrow-alt-circle-up icon.See <a href='https://fontawesome.com/v6/icons/arrow-alt-circle-up?s=regular'>example</a>
         */
        ARROW_ALT_CIRCLE_UP,
        /**
         * The regular bar-chart icon.See <a href='https://fontawesome.com/v6/icons/bar-chart?s=regular'>example</a>
         */
        BAR_CHART,
        /**
         * The regular bell icon.See <a href='https://fontawesome.com/v6/icons/bell?s=regular'>example</a>
         */
        BELL,
        /**
         * The regular bell-slash icon.See <a href='https://fontawesome.com/v6/icons/bell-slash?s=regular'>example</a>
         */
        BELL_SLASH,
        /**
         * The regular bookmark icon.See <a href='https://fontawesome.com/v6/icons/bookmark?s=regular'>example</a>
         */
        BOOKMARK,
        /**
         * The regular building icon.See <a href='https://fontawesome.com/v6/icons/building?s=regular'>example</a>
         */
        BUILDING,
        /**
         * The regular calendar icon.See <a href='https://fontawesome.com/v6/icons/calendar?s=regular'>example</a>
         */
        CALENDAR,
        /**
         * The regular calendar-alt icon.See <a href='https://fontawesome.com/v6/icons/calendar-alt?s=regular'>example</a>
         */
        CALENDAR_ALT,
        /**
         * The regular calendar-check icon.See <a href='https://fontawesome.com/v6/icons/calendar-check?s=regular'>example</a>
         */
        CALENDAR_CHECK,
        /**
         * The regular calendar-days icon.See <a href='https://fontawesome.com/v6/icons/calendar-days?s=regular'>example</a>
         */
        CALENDAR_DAYS,
        /**
         * The regular calendar-minus icon.See <a href='https://fontawesome.com/v6/icons/calendar-minus?s=regular'>example</a>
         */
        CALENDAR_MINUS,
        /**
         * The regular calendar-plus icon.See <a href='https://fontawesome.com/v6/icons/calendar-plus?s=regular'>example</a>
         */
        CALENDAR_PLUS,
        /**
         * The regular calendar-times icon.See <a href='https://fontawesome.com/v6/icons/calendar-times?s=regular'>example</a>
         */
        CALENDAR_TIMES,
        /**
         * The regular calendar-xmark icon.See <a href='https://fontawesome.com/v6/icons/calendar-xmark?s=regular'>example</a>
         */
        CALENDAR_XMARK,
        /**
         * The regular caret-square-down icon.See <a href='https://fontawesome.com/v6/icons/caret-square-down?s=regular'>example</a>
         */
        CARET_SQUARE_DOWN,
        /**
         * The regular caret-square-left icon.See <a href='https://fontawesome.com/v6/icons/caret-square-left?s=regular'>example</a>
         */
        CARET_SQUARE_LEFT,
        /**
         * The regular caret-square-right icon.See <a href='https://fontawesome.com/v6/icons/caret-square-right?s=regular'>example</a>
         */
        CARET_SQUARE_RIGHT,
        /**
         * The regular caret-square-up icon.See <a href='https://fontawesome.com/v6/icons/caret-square-up?s=regular'>example</a>
         */
        CARET_SQUARE_UP,
        /**
         * The regular chart-bar icon.See <a href='https://fontawesome.com/v6/icons/chart-bar?s=regular'>example</a>
         */
        CHART_BAR,
        /**
         * The regular check-circle icon.See <a href='https://fontawesome.com/v6/icons/check-circle?s=regular'>example</a>
         */
        CHECK_CIRCLE,
        /**
         * The regular check-square icon.See <a href='https://fontawesome.com/v6/icons/check-square?s=regular'>example</a>
         */
        CHECK_SQUARE,
        /**
         * The regular chess-bishop icon.See <a href='https://fontawesome.com/v6/icons/chess-bishop?s=regular'>example</a>
         */
        CHESS_BISHOP,
        /**
         * The regular chess-king icon.See <a href='https://fontawesome.com/v6/icons/chess-king?s=regular'>example</a>
         */
        CHESS_KING,
        /**
         * The regular chess-knight icon.See <a href='https://fontawesome.com/v6/icons/chess-knight?s=regular'>example</a>
         */
        CHESS_KNIGHT,
        /**
         * The regular chess-pawn icon.See <a href='https://fontawesome.com/v6/icons/chess-pawn?s=regular'>example</a>
         */
        CHESS_PAWN,
        /**
         * The regular chess-queen icon.See <a href='https://fontawesome.com/v6/icons/chess-queen?s=regular'>example</a>
         */
        CHESS_QUEEN,
        /**
         * The regular chess-rook icon.See <a href='https://fontawesome.com/v6/icons/chess-rook?s=regular'>example</a>
         */
        CHESS_ROOK,
        /**
         * The regular circle icon.See <a href='https://fontawesome.com/v6/icons/circle?s=regular'>example</a>
         */
        CIRCLE,
        /**
         * The regular circle-check icon.See <a href='https://fontawesome.com/v6/icons/circle-check?s=regular'>example</a>
         */
        CIRCLE_CHECK,
        /**
         * The regular circle-dot icon.See <a href='https://fontawesome.com/v6/icons/circle-dot?s=regular'>example</a>
         */
        CIRCLE_DOT,
        /**
         * The regular circle-down icon.See <a href='https://fontawesome.com/v6/icons/circle-down?s=regular'>example</a>
         */
        CIRCLE_DOWN,
        /**
         * The regular circle-left icon.See <a href='https://fontawesome.com/v6/icons/circle-left?s=regular'>example</a>
         */
        CIRCLE_LEFT,
        /**
         * The regular circle-pause icon.See <a href='https://fontawesome.com/v6/icons/circle-pause?s=regular'>example</a>
         */
        CIRCLE_PAUSE,
        /**
         * The regular circle-play icon.See <a href='https://fontawesome.com/v6/icons/circle-play?s=regular'>example</a>
         */
        CIRCLE_PLAY,
        /**
         * The regular circle-question icon.See <a href='https://fontawesome.com/v6/icons/circle-question?s=regular'>example</a>
         */
        CIRCLE_QUESTION,
        /**
         * The regular circle-right icon.See <a href='https://fontawesome.com/v6/icons/circle-right?s=regular'>example</a>
         */
        CIRCLE_RIGHT,
        /**
         * The regular circle-stop icon.See <a href='https://fontawesome.com/v6/icons/circle-stop?s=regular'>example</a>
         */
        CIRCLE_STOP,
        /**
         * The regular circle-up icon.See <a href='https://fontawesome.com/v6/icons/circle-up?s=regular'>example</a>
         */
        CIRCLE_UP,
        /**
         * The regular circle-user icon.See <a href='https://fontawesome.com/v6/icons/circle-user?s=regular'>example</a>
         */
        CIRCLE_USER,
        /**
         * The regular circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/circle-xmark?s=regular'>example</a>
         */
        CIRCLE_XMARK,
        /**
         * The regular clipboard icon.See <a href='https://fontawesome.com/v6/icons/clipboard?s=regular'>example</a>
         */
        CLIPBOARD,
        /**
         * The regular clock icon.See <a href='https://fontawesome.com/v6/icons/clock?s=regular'>example</a>
         */
        CLOCK,
        /**
         * The regular clock-four icon.See <a href='https://fontawesome.com/v6/icons/clock-four?s=regular'>example</a>
         */
        CLOCK_FOUR,
        /**
         * The regular clone icon.See <a href='https://fontawesome.com/v6/icons/clone?s=regular'>example</a>
         */
        CLONE,
        /**
         * The regular closed-captioning icon.See <a href='https://fontawesome.com/v6/icons/closed-captioning?s=regular'>example</a>
         */
        CLOSED_CAPTIONING,
        /**
         * The regular comment icon.See <a href='https://fontawesome.com/v6/icons/comment?s=regular'>example</a>
         */
        COMMENT,
        /**
         * The regular comment-alt icon.See <a href='https://fontawesome.com/v6/icons/comment-alt?s=regular'>example</a>
         */
        COMMENT_ALT,
        /**
         * The regular comment-dots icon.See <a href='https://fontawesome.com/v6/icons/comment-dots?s=regular'>example</a>
         */
        COMMENT_DOTS,
        /**
         * The regular commenting icon.See <a href='https://fontawesome.com/v6/icons/commenting?s=regular'>example</a>
         */
        COMMENTING,
        /**
         * The regular comments icon.See <a href='https://fontawesome.com/v6/icons/comments?s=regular'>example</a>
         */
        COMMENTS,
        /**
         * The regular compass icon.See <a href='https://fontawesome.com/v6/icons/compass?s=regular'>example</a>
         */
        COMPASS,
        /**
         * The regular contact-book icon.See <a href='https://fontawesome.com/v6/icons/contact-book?s=regular'>example</a>
         */
        CONTACT_BOOK,
        /**
         * The regular contact-card icon.See <a href='https://fontawesome.com/v6/icons/contact-card?s=regular'>example</a>
         */
        CONTACT_CARD,
        /**
         * The regular copy icon.See <a href='https://fontawesome.com/v6/icons/copy?s=regular'>example</a>
         */
        COPY,
        /**
         * The regular copyright icon.See <a href='https://fontawesome.com/v6/icons/copyright?s=regular'>example</a>
         */
        COPYRIGHT,
        /**
         * The regular credit-card icon.See <a href='https://fontawesome.com/v6/icons/credit-card?s=regular'>example</a>
         */
        CREDIT_CARD,
        /**
         * The regular credit-card-alt icon.See <a href='https://fontawesome.com/v6/icons/credit-card-alt?s=regular'>example</a>
         */
        CREDIT_CARD_ALT,
        /**
         * The regular dizzy icon.See <a href='https://fontawesome.com/v6/icons/dizzy?s=regular'>example</a>
         */
        DIZZY,
        /**
         * The regular dot-circle icon.See <a href='https://fontawesome.com/v6/icons/dot-circle?s=regular'>example</a>
         */
        DOT_CIRCLE,
        /**
         * The regular drivers-license icon.See <a href='https://fontawesome.com/v6/icons/drivers-license?s=regular'>example</a>
         */
        DRIVERS_LICENSE,
        /**
         * The regular edit icon.See <a href='https://fontawesome.com/v6/icons/edit?s=regular'>example</a>
         */
        EDIT,
        /**
         * The regular envelope icon.See <a href='https://fontawesome.com/v6/icons/envelope?s=regular'>example</a>
         */
        ENVELOPE,
        /**
         * The regular envelope-open icon.See <a href='https://fontawesome.com/v6/icons/envelope-open?s=regular'>example</a>
         */
        ENVELOPE_OPEN,
        /**
         * The regular eye icon.See <a href='https://fontawesome.com/v6/icons/eye?s=regular'>example</a>
         */
        EYE,
        /**
         * The regular eye-slash icon.See <a href='https://fontawesome.com/v6/icons/eye-slash?s=regular'>example</a>
         */
        EYE_SLASH,
        /**
         * The regular face-angry icon.See <a href='https://fontawesome.com/v6/icons/face-angry?s=regular'>example</a>
         */
        FACE_ANGRY,
        /**
         * The regular face-dizzy icon.See <a href='https://fontawesome.com/v6/icons/face-dizzy?s=regular'>example</a>
         */
        FACE_DIZZY,
        /**
         * The regular face-flushed icon.See <a href='https://fontawesome.com/v6/icons/face-flushed?s=regular'>example</a>
         */
        FACE_FLUSHED,
        /**
         * The regular face-frown icon.See <a href='https://fontawesome.com/v6/icons/face-frown?s=regular'>example</a>
         */
        FACE_FROWN,
        /**
         * The regular face-frown-open icon.See <a href='https://fontawesome.com/v6/icons/face-frown-open?s=regular'>example</a>
         */
        FACE_FROWN_OPEN,
        /**
         * The regular face-grimace icon.See <a href='https://fontawesome.com/v6/icons/face-grimace?s=regular'>example</a>
         */
        FACE_GRIMACE,
        /**
         * The regular face-grin icon.See <a href='https://fontawesome.com/v6/icons/face-grin?s=regular'>example</a>
         */
        FACE_GRIN,
        /**
         * The regular face-grin-beam icon.See <a href='https://fontawesome.com/v6/icons/face-grin-beam?s=regular'>example</a>
         */
        FACE_GRIN_BEAM,
        /**
         * The regular face-grin-beam-sweat icon.See <a href='https://fontawesome.com/v6/icons/face-grin-beam-sweat?s=regular'>example</a>
         */
        FACE_GRIN_BEAM_SWEAT,
        /**
         * The regular face-grin-hearts icon.See <a href='https://fontawesome.com/v6/icons/face-grin-hearts?s=regular'>example</a>
         */
        FACE_GRIN_HEARTS,
        /**
         * The regular face-grin-squint icon.See <a href='https://fontawesome.com/v6/icons/face-grin-squint?s=regular'>example</a>
         */
        FACE_GRIN_SQUINT,
        /**
         * The regular face-grin-squint-tears icon.See <a href='https://fontawesome.com/v6/icons/face-grin-squint-tears?s=regular'>example</a>
         */
        FACE_GRIN_SQUINT_TEARS,
        /**
         * The regular face-grin-stars icon.See <a href='https://fontawesome.com/v6/icons/face-grin-stars?s=regular'>example</a>
         */
        FACE_GRIN_STARS,
        /**
         * The regular face-grin-tears icon.See <a href='https://fontawesome.com/v6/icons/face-grin-tears?s=regular'>example</a>
         */
        FACE_GRIN_TEARS,
        /**
         * The regular face-grin-tongue icon.See <a href='https://fontawesome.com/v6/icons/face-grin-tongue?s=regular'>example</a>
         */
        FACE_GRIN_TONGUE,
        /**
         * The regular face-grin-tongue-squint icon.See <a href='https://fontawesome.com/v6/icons/face-grin-tongue-squint?s=regular'>example</a>
         */
        FACE_GRIN_TONGUE_SQUINT,
        /**
         * The regular face-grin-tongue-wink icon.See <a href='https://fontawesome.com/v6/icons/face-grin-tongue-wink?s=regular'>example</a>
         */
        FACE_GRIN_TONGUE_WINK,
        /**
         * The regular face-grin-wide icon.See <a href='https://fontawesome.com/v6/icons/face-grin-wide?s=regular'>example</a>
         */
        FACE_GRIN_WIDE,
        /**
         * The regular face-grin-wink icon.See <a href='https://fontawesome.com/v6/icons/face-grin-wink?s=regular'>example</a>
         */
        FACE_GRIN_WINK,
        /**
         * The regular face-kiss icon.See <a href='https://fontawesome.com/v6/icons/face-kiss?s=regular'>example</a>
         */
        FACE_KISS,
        /**
         * The regular face-kiss-beam icon.See <a href='https://fontawesome.com/v6/icons/face-kiss-beam?s=regular'>example</a>
         */
        FACE_KISS_BEAM,
        /**
         * The regular face-kiss-wink-heart icon.See <a href='https://fontawesome.com/v6/icons/face-kiss-wink-heart?s=regular'>example</a>
         */
        FACE_KISS_WINK_HEART,
        /**
         * The regular face-laugh icon.See <a href='https://fontawesome.com/v6/icons/face-laugh?s=regular'>example</a>
         */
        FACE_LAUGH,
        /**
         * The regular face-laugh-beam icon.See <a href='https://fontawesome.com/v6/icons/face-laugh-beam?s=regular'>example</a>
         */
        FACE_LAUGH_BEAM,
        /**
         * The regular face-laugh-squint icon.See <a href='https://fontawesome.com/v6/icons/face-laugh-squint?s=regular'>example</a>
         */
        FACE_LAUGH_SQUINT,
        /**
         * The regular face-laugh-wink icon.See <a href='https://fontawesome.com/v6/icons/face-laugh-wink?s=regular'>example</a>
         */
        FACE_LAUGH_WINK,
        /**
         * The regular face-meh icon.See <a href='https://fontawesome.com/v6/icons/face-meh?s=regular'>example</a>
         */
        FACE_MEH,
        /**
         * The regular face-meh-blank icon.See <a href='https://fontawesome.com/v6/icons/face-meh-blank?s=regular'>example</a>
         */
        FACE_MEH_BLANK,
        /**
         * The regular face-rolling-eyes icon.See <a href='https://fontawesome.com/v6/icons/face-rolling-eyes?s=regular'>example</a>
         */
        FACE_ROLLING_EYES,
        /**
         * The regular face-sad-cry icon.See <a href='https://fontawesome.com/v6/icons/face-sad-cry?s=regular'>example</a>
         */
        FACE_SAD_CRY,
        /**
         * The regular face-sad-tear icon.See <a href='https://fontawesome.com/v6/icons/face-sad-tear?s=regular'>example</a>
         */
        FACE_SAD_TEAR,
        /**
         * The regular face-smile icon.See <a href='https://fontawesome.com/v6/icons/face-smile?s=regular'>example</a>
         */
        FACE_SMILE,
        /**
         * The regular face-smile-beam icon.See <a href='https://fontawesome.com/v6/icons/face-smile-beam?s=regular'>example</a>
         */
        FACE_SMILE_BEAM,
        /**
         * The regular face-smile-wink icon.See <a href='https://fontawesome.com/v6/icons/face-smile-wink?s=regular'>example</a>
         */
        FACE_SMILE_WINK,
        /**
         * The regular face-surprise icon.See <a href='https://fontawesome.com/v6/icons/face-surprise?s=regular'>example</a>
         */
        FACE_SURPRISE,
        /**
         * The regular face-tired icon.See <a href='https://fontawesome.com/v6/icons/face-tired?s=regular'>example</a>
         */
        FACE_TIRED,
        /**
         * The regular file icon.See <a href='https://fontawesome.com/v6/icons/file?s=regular'>example</a>
         */
        FILE,
        /**
         * The regular file-alt icon.See <a href='https://fontawesome.com/v6/icons/file-alt?s=regular'>example</a>
         */
        FILE_ALT,
        /**
         * The regular file-archive icon.See <a href='https://fontawesome.com/v6/icons/file-archive?s=regular'>example</a>
         */
        FILE_ARCHIVE,
        /**
         * The regular file-audio icon.See <a href='https://fontawesome.com/v6/icons/file-audio?s=regular'>example</a>
         */
        FILE_AUDIO,
        /**
         * The regular file-clipboard icon.See <a href='https://fontawesome.com/v6/icons/file-clipboard?s=regular'>example</a>
         */
        FILE_CLIPBOARD,
        /**
         * The regular file-code icon.See <a href='https://fontawesome.com/v6/icons/file-code?s=regular'>example</a>
         */
        FILE_CODE,
        /**
         * The regular file-excel icon.See <a href='https://fontawesome.com/v6/icons/file-excel?s=regular'>example</a>
         */
        FILE_EXCEL,
        /**
         * The regular file-image icon.See <a href='https://fontawesome.com/v6/icons/file-image?s=regular'>example</a>
         */
        FILE_IMAGE,
        /**
         * The regular file-lines icon.See <a href='https://fontawesome.com/v6/icons/file-lines?s=regular'>example</a>
         */
        FILE_LINES,
        /**
         * The regular file-pdf icon.See <a href='https://fontawesome.com/v6/icons/file-pdf?s=regular'>example</a>
         */
        FILE_PDF,
        /**
         * The regular file-powerpoint icon.See <a href='https://fontawesome.com/v6/icons/file-powerpoint?s=regular'>example</a>
         */
        FILE_POWERPOINT,
        /**
         * The regular file-text icon.See <a href='https://fontawesome.com/v6/icons/file-text?s=regular'>example</a>
         */
        FILE_TEXT,
        /**
         * The regular file-video icon.See <a href='https://fontawesome.com/v6/icons/file-video?s=regular'>example</a>
         */
        FILE_VIDEO,
        /**
         * The regular file-word icon.See <a href='https://fontawesome.com/v6/icons/file-word?s=regular'>example</a>
         */
        FILE_WORD,
        /**
         * The regular file-zipper icon.See <a href='https://fontawesome.com/v6/icons/file-zipper?s=regular'>example</a>
         */
        FILE_ZIPPER,
        /**
         * The regular flag icon.See <a href='https://fontawesome.com/v6/icons/flag?s=regular'>example</a>
         */
        FLAG,
        /**
         * The regular floppy-disk icon.See <a href='https://fontawesome.com/v6/icons/floppy-disk?s=regular'>example</a>
         */
        FLOPPY_DISK,
        /**
         * The regular flushed icon.See <a href='https://fontawesome.com/v6/icons/flushed?s=regular'>example</a>
         */
        FLUSHED,
        /**
         * The regular folder icon.See <a href='https://fontawesome.com/v6/icons/folder?s=regular'>example</a>
         */
        FOLDER,
        /**
         * The regular folder-blank icon.See <a href='https://fontawesome.com/v6/icons/folder-blank?s=regular'>example</a>
         */
        FOLDER_BLANK,
        /**
         * The regular folder-closed icon.See <a href='https://fontawesome.com/v6/icons/folder-closed?s=regular'>example</a>
         */
        FOLDER_CLOSED,
        /**
         * The regular folder-open icon.See <a href='https://fontawesome.com/v6/icons/folder-open?s=regular'>example</a>
         */
        FOLDER_OPEN,
        /**
         * The regular font-awesome icon.See <a href='https://fontawesome.com/v6/icons/font-awesome?s=regular'>example</a>
         */
        FONT_AWESOME,
        /**
         * The regular font-awesome-flag icon.See <a href='https://fontawesome.com/v6/icons/font-awesome-flag?s=regular'>example</a>
         */
        FONT_AWESOME_FLAG,
        /**
         * The regular font-awesome-logo-full icon.See <a href='https://fontawesome.com/v6/icons/font-awesome-logo-full?s=regular'>example</a>
         */
        FONT_AWESOME_LOGO_FULL,
        /**
         * The regular frown icon.See <a href='https://fontawesome.com/v6/icons/frown?s=regular'>example</a>
         */
        FROWN,
        /**
         * The regular frown-open icon.See <a href='https://fontawesome.com/v6/icons/frown-open?s=regular'>example</a>
         */
        FROWN_OPEN,
        /**
         * The regular futbol icon.See <a href='https://fontawesome.com/v6/icons/futbol?s=regular'>example</a>
         */
        FUTBOL,
        /**
         * The regular futbol-ball icon.See <a href='https://fontawesome.com/v6/icons/futbol-ball?s=regular'>example</a>
         */
        FUTBOL_BALL,
        /**
         * The regular gem icon.See <a href='https://fontawesome.com/v6/icons/gem?s=regular'>example</a>
         */
        GEM,
        /**
         * The regular grimace icon.See <a href='https://fontawesome.com/v6/icons/grimace?s=regular'>example</a>
         */
        GRIMACE,
        /**
         * The regular grin icon.See <a href='https://fontawesome.com/v6/icons/grin?s=regular'>example</a>
         */
        GRIN,
        /**
         * The regular grin-alt icon.See <a href='https://fontawesome.com/v6/icons/grin-alt?s=regular'>example</a>
         */
        GRIN_ALT,
        /**
         * The regular grin-beam icon.See <a href='https://fontawesome.com/v6/icons/grin-beam?s=regular'>example</a>
         */
        GRIN_BEAM,
        /**
         * The regular grin-beam-sweat icon.See <a href='https://fontawesome.com/v6/icons/grin-beam-sweat?s=regular'>example</a>
         */
        GRIN_BEAM_SWEAT,
        /**
         * The regular grin-hearts icon.See <a href='https://fontawesome.com/v6/icons/grin-hearts?s=regular'>example</a>
         */
        GRIN_HEARTS,
        /**
         * The regular grin-squint icon.See <a href='https://fontawesome.com/v6/icons/grin-squint?s=regular'>example</a>
         */
        GRIN_SQUINT,
        /**
         * The regular grin-squint-tears icon.See <a href='https://fontawesome.com/v6/icons/grin-squint-tears?s=regular'>example</a>
         */
        GRIN_SQUINT_TEARS,
        /**
         * The regular grin-stars icon.See <a href='https://fontawesome.com/v6/icons/grin-stars?s=regular'>example</a>
         */
        GRIN_STARS,
        /**
         * The regular grin-tears icon.See <a href='https://fontawesome.com/v6/icons/grin-tears?s=regular'>example</a>
         */
        GRIN_TEARS,
        /**
         * The regular grin-tongue icon.See <a href='https://fontawesome.com/v6/icons/grin-tongue?s=regular'>example</a>
         */
        GRIN_TONGUE,
        /**
         * The regular grin-tongue-squint icon.See <a href='https://fontawesome.com/v6/icons/grin-tongue-squint?s=regular'>example</a>
         */
        GRIN_TONGUE_SQUINT,
        /**
         * The regular grin-tongue-wink icon.See <a href='https://fontawesome.com/v6/icons/grin-tongue-wink?s=regular'>example</a>
         */
        GRIN_TONGUE_WINK,
        /**
         * The regular grin-wink icon.See <a href='https://fontawesome.com/v6/icons/grin-wink?s=regular'>example</a>
         */
        GRIN_WINK,
        /**
         * The regular hand icon.See <a href='https://fontawesome.com/v6/icons/hand?s=regular'>example</a>
         */
        HAND,
        /**
         * The regular hand-back-fist icon.See <a href='https://fontawesome.com/v6/icons/hand-back-fist?s=regular'>example</a>
         */
        HAND_BACK_FIST,
        /**
         * The regular hand-lizard icon.See <a href='https://fontawesome.com/v6/icons/hand-lizard?s=regular'>example</a>
         */
        HAND_LIZARD,
        /**
         * The regular hand-paper icon.See <a href='https://fontawesome.com/v6/icons/hand-paper?s=regular'>example</a>
         */
        HAND_PAPER,
        /**
         * The regular hand-peace icon.See <a href='https://fontawesome.com/v6/icons/hand-peace?s=regular'>example</a>
         */
        HAND_PEACE,
        /**
         * The regular hand-point-down icon.See <a href='https://fontawesome.com/v6/icons/hand-point-down?s=regular'>example</a>
         */
        HAND_POINT_DOWN,
        /**
         * The regular hand-point-left icon.See <a href='https://fontawesome.com/v6/icons/hand-point-left?s=regular'>example</a>
         */
        HAND_POINT_LEFT,
        /**
         * The regular hand-point-right icon.See <a href='https://fontawesome.com/v6/icons/hand-point-right?s=regular'>example</a>
         */
        HAND_POINT_RIGHT,
        /**
         * The regular hand-point-up icon.See <a href='https://fontawesome.com/v6/icons/hand-point-up?s=regular'>example</a>
         */
        HAND_POINT_UP,
        /**
         * The regular hand-pointer icon.See <a href='https://fontawesome.com/v6/icons/hand-pointer?s=regular'>example</a>
         */
        HAND_POINTER,
        /**
         * The regular hand-rock icon.See <a href='https://fontawesome.com/v6/icons/hand-rock?s=regular'>example</a>
         */
        HAND_ROCK,
        /**
         * The regular hand-scissors icon.See <a href='https://fontawesome.com/v6/icons/hand-scissors?s=regular'>example</a>
         */
        HAND_SCISSORS,
        /**
         * The regular hand-spock icon.See <a href='https://fontawesome.com/v6/icons/hand-spock?s=regular'>example</a>
         */
        HAND_SPOCK,
        /**
         * The regular handshake icon.See <a href='https://fontawesome.com/v6/icons/handshake?s=regular'>example</a>
         */
        HANDSHAKE,
        /**
         * The regular hard-drive icon.See <a href='https://fontawesome.com/v6/icons/hard-drive?s=regular'>example</a>
         */
        HARD_DRIVE,
        /**
         * The regular hdd icon.See <a href='https://fontawesome.com/v6/icons/hdd?s=regular'>example</a>
         */
        HDD,
        /**
         * The regular heart icon.See <a href='https://fontawesome.com/v6/icons/heart?s=regular'>example</a>
         */
        HEART,
        /**
         * The regular hospital icon.See <a href='https://fontawesome.com/v6/icons/hospital?s=regular'>example</a>
         */
        HOSPITAL,
        /**
         * The regular hospital-alt icon.See <a href='https://fontawesome.com/v6/icons/hospital-alt?s=regular'>example</a>
         */
        HOSPITAL_ALT,
        /**
         * The regular hospital-wide icon.See <a href='https://fontawesome.com/v6/icons/hospital-wide?s=regular'>example</a>
         */
        HOSPITAL_WIDE,
        /**
         * The regular hourglass icon.See <a href='https://fontawesome.com/v6/icons/hourglass?s=regular'>example</a>
         */
        HOURGLASS,
        /**
         * The regular hourglass-2 icon.See <a href='https://fontawesome.com/v6/icons/hourglass-2?s=regular'>example</a>
         */
        HOURGLASS_2,
        /**
         * The regular hourglass-empty icon.See <a href='https://fontawesome.com/v6/icons/hourglass-empty?s=regular'>example</a>
         */
        HOURGLASS_EMPTY,
        /**
         * The regular hourglass-half icon.See <a href='https://fontawesome.com/v6/icons/hourglass-half?s=regular'>example</a>
         */
        HOURGLASS_HALF,
        /**
         * The regular id-badge icon.See <a href='https://fontawesome.com/v6/icons/id-badge?s=regular'>example</a>
         */
        ID_BADGE,
        /**
         * The regular id-card icon.See <a href='https://fontawesome.com/v6/icons/id-card?s=regular'>example</a>
         */
        ID_CARD,
        /**
         * The regular image icon.See <a href='https://fontawesome.com/v6/icons/image?s=regular'>example</a>
         */
        IMAGE,
        /**
         * The regular images icon.See <a href='https://fontawesome.com/v6/icons/images?s=regular'>example</a>
         */
        IMAGES,
        /**
         * The regular keyboard icon.See <a href='https://fontawesome.com/v6/icons/keyboard?s=regular'>example</a>
         */
        KEYBOARD,
        /**
         * The regular kiss icon.See <a href='https://fontawesome.com/v6/icons/kiss?s=regular'>example</a>
         */
        KISS,
        /**
         * The regular kiss-beam icon.See <a href='https://fontawesome.com/v6/icons/kiss-beam?s=regular'>example</a>
         */
        KISS_BEAM,
        /**
         * The regular kiss-wink-heart icon.See <a href='https://fontawesome.com/v6/icons/kiss-wink-heart?s=regular'>example</a>
         */
        KISS_WINK_HEART,
        /**
         * The regular laugh icon.See <a href='https://fontawesome.com/v6/icons/laugh?s=regular'>example</a>
         */
        LAUGH,
        /**
         * The regular laugh-beam icon.See <a href='https://fontawesome.com/v6/icons/laugh-beam?s=regular'>example</a>
         */
        LAUGH_BEAM,
        /**
         * The regular laugh-squint icon.See <a href='https://fontawesome.com/v6/icons/laugh-squint?s=regular'>example</a>
         */
        LAUGH_SQUINT,
        /**
         * The regular laugh-wink icon.See <a href='https://fontawesome.com/v6/icons/laugh-wink?s=regular'>example</a>
         */
        LAUGH_WINK,
        /**
         * The regular lemon icon.See <a href='https://fontawesome.com/v6/icons/lemon?s=regular'>example</a>
         */
        LEMON,
        /**
         * The regular life-ring icon.See <a href='https://fontawesome.com/v6/icons/life-ring?s=regular'>example</a>
         */
        LIFE_RING,
        /**
         * The regular lightbulb icon.See <a href='https://fontawesome.com/v6/icons/lightbulb?s=regular'>example</a>
         */
        LIGHTBULB,
        /**
         * The regular list-alt icon.See <a href='https://fontawesome.com/v6/icons/list-alt?s=regular'>example</a>
         */
        LIST_ALT,
        /**
         * The regular map icon.See <a href='https://fontawesome.com/v6/icons/map?s=regular'>example</a>
         */
        MAP,
        /**
         * The regular meh icon.See <a href='https://fontawesome.com/v6/icons/meh?s=regular'>example</a>
         */
        MEH,
        /**
         * The regular meh-blank icon.See <a href='https://fontawesome.com/v6/icons/meh-blank?s=regular'>example</a>
         */
        MEH_BLANK,
        /**
         * The regular meh-rolling-eyes icon.See <a href='https://fontawesome.com/v6/icons/meh-rolling-eyes?s=regular'>example</a>
         */
        MEH_ROLLING_EYES,
        /**
         * The regular message icon.See <a href='https://fontawesome.com/v6/icons/message?s=regular'>example</a>
         */
        MESSAGE,
        /**
         * The regular minus-square icon.See <a href='https://fontawesome.com/v6/icons/minus-square?s=regular'>example</a>
         */
        MINUS_SQUARE,
        /**
         * The regular money-bill-1 icon.See <a href='https://fontawesome.com/v6/icons/money-bill-1?s=regular'>example</a>
         */
        MONEY_BILL_1,
        /**
         * The regular money-bill-alt icon.See <a href='https://fontawesome.com/v6/icons/money-bill-alt?s=regular'>example</a>
         */
        MONEY_BILL_ALT,
        /**
         * The regular moon icon.See <a href='https://fontawesome.com/v6/icons/moon?s=regular'>example</a>
         */
        MOON,
        /**
         * The regular newspaper icon.See <a href='https://fontawesome.com/v6/icons/newspaper?s=regular'>example</a>
         */
        NEWSPAPER,
        /**
         * The regular notdef icon.See <a href='https://fontawesome.com/v6/icons/notdef?s=regular'>example</a>
         */
        NOTDEF,
        /**
         * The regular note-sticky icon.See <a href='https://fontawesome.com/v6/icons/note-sticky?s=regular'>example</a>
         */
        NOTE_STICKY,
        /**
         * The regular object-group icon.See <a href='https://fontawesome.com/v6/icons/object-group?s=regular'>example</a>
         */
        OBJECT_GROUP,
        /**
         * The regular object-ungroup icon.See <a href='https://fontawesome.com/v6/icons/object-ungroup?s=regular'>example</a>
         */
        OBJECT_UNGROUP,
        /**
         * The regular paper-plane icon.See <a href='https://fontawesome.com/v6/icons/paper-plane?s=regular'>example</a>
         */
        PAPER_PLANE,
        /**
         * The regular paste icon.See <a href='https://fontawesome.com/v6/icons/paste?s=regular'>example</a>
         */
        PASTE,
        /**
         * The regular pause-circle icon.See <a href='https://fontawesome.com/v6/icons/pause-circle?s=regular'>example</a>
         */
        PAUSE_CIRCLE,
        /**
         * The regular pen-to-square icon.See <a href='https://fontawesome.com/v6/icons/pen-to-square?s=regular'>example</a>
         */
        PEN_TO_SQUARE,
        /**
         * The regular play-circle icon.See <a href='https://fontawesome.com/v6/icons/play-circle?s=regular'>example</a>
         */
        PLAY_CIRCLE,
        /**
         * The regular plus-square icon.See <a href='https://fontawesome.com/v6/icons/plus-square?s=regular'>example</a>
         */
        PLUS_SQUARE,
        /**
         * The regular question-circle icon.See <a href='https://fontawesome.com/v6/icons/question-circle?s=regular'>example</a>
         */
        QUESTION_CIRCLE,
        /**
         * The regular rectangle-list icon.See <a href='https://fontawesome.com/v6/icons/rectangle-list?s=regular'>example</a>
         */
        RECTANGLE_LIST,
        /**
         * The regular rectangle-times icon.See <a href='https://fontawesome.com/v6/icons/rectangle-times?s=regular'>example</a>
         */
        RECTANGLE_TIMES,
        /**
         * The regular rectangle-xmark icon.See <a href='https://fontawesome.com/v6/icons/rectangle-xmark?s=regular'>example</a>
         */
        RECTANGLE_XMARK,
        /**
         * The regular registered icon.See <a href='https://fontawesome.com/v6/icons/registered?s=regular'>example</a>
         */
        REGISTERED,
        /**
         * The regular sad-cry icon.See <a href='https://fontawesome.com/v6/icons/sad-cry?s=regular'>example</a>
         */
        SAD_CRY,
        /**
         * The regular sad-tear icon.See <a href='https://fontawesome.com/v6/icons/sad-tear?s=regular'>example</a>
         */
        SAD_TEAR,
        /**
         * The regular save icon.See <a href='https://fontawesome.com/v6/icons/save?s=regular'>example</a>
         */
        SAVE,
        /**
         * The regular share-from-square icon.See <a href='https://fontawesome.com/v6/icons/share-from-square?s=regular'>example</a>
         */
        SHARE_FROM_SQUARE,
        /**
         * The regular share-square icon.See <a href='https://fontawesome.com/v6/icons/share-square?s=regular'>example</a>
         */
        SHARE_SQUARE,
        /**
         * The regular smile icon.See <a href='https://fontawesome.com/v6/icons/smile?s=regular'>example</a>
         */
        SMILE,
        /**
         * The regular smile-beam icon.See <a href='https://fontawesome.com/v6/icons/smile-beam?s=regular'>example</a>
         */
        SMILE_BEAM,
        /**
         * The regular smile-wink icon.See <a href='https://fontawesome.com/v6/icons/smile-wink?s=regular'>example</a>
         */
        SMILE_WINK,
        /**
         * The regular snowflake icon.See <a href='https://fontawesome.com/v6/icons/snowflake?s=regular'>example</a>
         */
        SNOWFLAKE,
        /**
         * The regular soccer-ball icon.See <a href='https://fontawesome.com/v6/icons/soccer-ball?s=regular'>example</a>
         */
        SOCCER_BALL,
        /**
         * The regular square icon.See <a href='https://fontawesome.com/v6/icons/square?s=regular'>example</a>
         */
        SQUARE,
        /**
         * The regular square-caret-down icon.See <a href='https://fontawesome.com/v6/icons/square-caret-down?s=regular'>example</a>
         */
        SQUARE_CARET_DOWN,
        /**
         * The regular square-caret-left icon.See <a href='https://fontawesome.com/v6/icons/square-caret-left?s=regular'>example</a>
         */
        SQUARE_CARET_LEFT,
        /**
         * The regular square-caret-right icon.See <a href='https://fontawesome.com/v6/icons/square-caret-right?s=regular'>example</a>
         */
        SQUARE_CARET_RIGHT,
        /**
         * The regular square-caret-up icon.See <a href='https://fontawesome.com/v6/icons/square-caret-up?s=regular'>example</a>
         */
        SQUARE_CARET_UP,
        /**
         * The regular square-check icon.See <a href='https://fontawesome.com/v6/icons/square-check?s=regular'>example</a>
         */
        SQUARE_CHECK,
        /**
         * The regular square-full icon.See <a href='https://fontawesome.com/v6/icons/square-full?s=regular'>example</a>
         */
        SQUARE_FULL,
        /**
         * The regular square-minus icon.See <a href='https://fontawesome.com/v6/icons/square-minus?s=regular'>example</a>
         */
        SQUARE_MINUS,
        /**
         * The regular square-plus icon.See <a href='https://fontawesome.com/v6/icons/square-plus?s=regular'>example</a>
         */
        SQUARE_PLUS,
        /**
         * The regular star icon.See <a href='https://fontawesome.com/v6/icons/star?s=regular'>example</a>
         */
        STAR,
        /**
         * The regular star-half icon.See <a href='https://fontawesome.com/v6/icons/star-half?s=regular'>example</a>
         */
        STAR_HALF,
        /**
         * The regular star-half-alt icon.See <a href='https://fontawesome.com/v6/icons/star-half-alt?s=regular'>example</a>
         */
        STAR_HALF_ALT,
        /**
         * The regular star-half-stroke icon.See <a href='https://fontawesome.com/v6/icons/star-half-stroke?s=regular'>example</a>
         */
        STAR_HALF_STROKE,
        /**
         * The regular sticky-note icon.See <a href='https://fontawesome.com/v6/icons/sticky-note?s=regular'>example</a>
         */
        STICKY_NOTE,
        /**
         * The regular stop-circle icon.See <a href='https://fontawesome.com/v6/icons/stop-circle?s=regular'>example</a>
         */
        STOP_CIRCLE,
        /**
         * The regular sun icon.See <a href='https://fontawesome.com/v6/icons/sun?s=regular'>example</a>
         */
        SUN,
        /**
         * The regular surprise icon.See <a href='https://fontawesome.com/v6/icons/surprise?s=regular'>example</a>
         */
        SURPRISE,
        /**
         * The regular thumbs-down icon.See <a href='https://fontawesome.com/v6/icons/thumbs-down?s=regular'>example</a>
         */
        THUMBS_DOWN,
        /**
         * The regular thumbs-up icon.See <a href='https://fontawesome.com/v6/icons/thumbs-up?s=regular'>example</a>
         */
        THUMBS_UP,
        /**
         * The regular times-circle icon.See <a href='https://fontawesome.com/v6/icons/times-circle?s=regular'>example</a>
         */
        TIMES_CIRCLE,
        /**
         * The regular times-rectangle icon.See <a href='https://fontawesome.com/v6/icons/times-rectangle?s=regular'>example</a>
         */
        TIMES_RECTANGLE,
        /**
         * The regular tired icon.See <a href='https://fontawesome.com/v6/icons/tired?s=regular'>example</a>
         */
        TIRED,
        /**
         * The regular trash-alt icon.See <a href='https://fontawesome.com/v6/icons/trash-alt?s=regular'>example</a>
         */
        TRASH_ALT,
        /**
         * The regular trash-can icon.See <a href='https://fontawesome.com/v6/icons/trash-can?s=regular'>example</a>
         */
        TRASH_CAN,
        /**
         * The regular user icon.See <a href='https://fontawesome.com/v6/icons/user?s=regular'>example</a>
         */
        USER,
        /**
         * The regular user-circle icon.See <a href='https://fontawesome.com/v6/icons/user-circle?s=regular'>example</a>
         */
        USER_CIRCLE,
        /**
         * The regular vcard icon.See <a href='https://fontawesome.com/v6/icons/vcard?s=regular'>example</a>
         */
        VCARD,
        /**
         * The regular window-close icon.See <a href='https://fontawesome.com/v6/icons/window-close?s=regular'>example</a>
         */
        WINDOW_CLOSE,
        /**
         * The regular window-maximize icon.See <a href='https://fontawesome.com/v6/icons/window-maximize?s=regular'>example</a>
         */
        WINDOW_MAXIMIZE,
        /**
         * The regular window-minimize icon.See <a href='https://fontawesome.com/v6/icons/window-minimize?s=regular'>example</a>
         */
        WINDOW_MINIMIZE,
        /**
         * The regular window-restore icon.See <a href='https://fontawesome.com/v6/icons/window-restore?s=regular'>example</a>
         */
        WINDOW_RESTORE,
        /**
         * The regular xmark-circle icon.See <a href='https://fontawesome.com/v6/icons/xmark-circle?s=regular'>example</a>
         */
        XMARK_CIRCLE;

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
         * Create a new {@link Icon} instance with the icon determined by the name.
         * @return a new instance of {@link Icon} component
         */
        public Icon create() {
            return new Icon(this.getIconPart());
        }

        /**
         * Create a new {@link Icon} instance with the icon determined by the name and a listener for click events.
         * @param listener the event listener for click events
         * @return a new instance of {@link Icon} component
         */
        public Icon create(ComponentEventListener<ClickEvent<com.vaadin.flow.component.icon.Icon>> listener) {
            Icon icon = create();
            icon.addClickListener(listener);
            return icon;
        }

        /**
         * Server side component for {@code Regular}
         */
        @JsModule("./font-awesome-iron-iconset/far.js")
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "4.2.0")
        @SuppressWarnings("serial")
        public static final class Icon extends com.vaadin.flow.component.icon.Icon implements ClickNotifier<com.vaadin.flow.component.icon.Icon> {

             Icon(String icon) {
                super(ICONSET, icon);
            }
        }
    }

    /**
     * Enumeration of all icons in the FontAwesome solid iconset
     * <p>
     * These instances can be used to create {@link Icon} components either by using
     * their {@link #create()} method or by passing them to Icon's constructor.
     *
     * @author Javier Godoy / Flowing Code
     */
    public enum Solid implements IconFactory {

        /**
         * The solid 0 icon.See <a href='https://fontawesome.com/v6/icons/0?s=solid'>example</a>
         */
        _0,
        /**
         * The solid 1 icon.See <a href='https://fontawesome.com/v6/icons/1?s=solid'>example</a>
         */
        _1,
        /**
         * The solid 2 icon.See <a href='https://fontawesome.com/v6/icons/2?s=solid'>example</a>
         */
        _2,
        /**
         * The solid 3 icon.See <a href='https://fontawesome.com/v6/icons/3?s=solid'>example</a>
         */
        _3,
        /**
         * The solid 4 icon.See <a href='https://fontawesome.com/v6/icons/4?s=solid'>example</a>
         */
        _4,
        /**
         * The solid 5 icon.See <a href='https://fontawesome.com/v6/icons/5?s=solid'>example</a>
         */
        _5,
        /**
         * The solid 6 icon.See <a href='https://fontawesome.com/v6/icons/6?s=solid'>example</a>
         */
        _6,
        /**
         * The solid 7 icon.See <a href='https://fontawesome.com/v6/icons/7?s=solid'>example</a>
         */
        _7,
        /**
         * The solid 8 icon.See <a href='https://fontawesome.com/v6/icons/8?s=solid'>example</a>
         */
        _8,
        /**
         * The solid 9 icon.See <a href='https://fontawesome.com/v6/icons/9?s=solid'>example</a>
         */
        _9,
        /**
         * The solid a icon.See <a href='https://fontawesome.com/v6/icons/a?s=solid'>example</a>
         */
        A,
        /**
         * The solid ad icon.See <a href='https://fontawesome.com/v6/icons/ad?s=solid'>example</a>
         */
        AD,
        /**
         * The solid add icon.See <a href='https://fontawesome.com/v6/icons/add?s=solid'>example</a>
         */
        ADD,
        /**
         * The solid address-book icon.See <a href='https://fontawesome.com/v6/icons/address-book?s=solid'>example</a>
         */
        ADDRESS_BOOK,
        /**
         * The solid address-card icon.See <a href='https://fontawesome.com/v6/icons/address-card?s=solid'>example</a>
         */
        ADDRESS_CARD,
        /**
         * The solid adjust icon.See <a href='https://fontawesome.com/v6/icons/adjust?s=solid'>example</a>
         */
        ADJUST,
        /**
         * The solid air-freshener icon.See <a href='https://fontawesome.com/v6/icons/air-freshener?s=solid'>example</a>
         */
        AIR_FRESHENER,
        /**
         * The solid align-center icon.See <a href='https://fontawesome.com/v6/icons/align-center?s=solid'>example</a>
         */
        ALIGN_CENTER,
        /**
         * The solid align-justify icon.See <a href='https://fontawesome.com/v6/icons/align-justify?s=solid'>example</a>
         */
        ALIGN_JUSTIFY,
        /**
         * The solid align-left icon.See <a href='https://fontawesome.com/v6/icons/align-left?s=solid'>example</a>
         */
        ALIGN_LEFT,
        /**
         * The solid align-right icon.See <a href='https://fontawesome.com/v6/icons/align-right?s=solid'>example</a>
         */
        ALIGN_RIGHT,
        /**
         * The solid allergies icon.See <a href='https://fontawesome.com/v6/icons/allergies?s=solid'>example</a>
         */
        ALLERGIES,
        /**
         * The solid ambulance icon.See <a href='https://fontawesome.com/v6/icons/ambulance?s=solid'>example</a>
         */
        AMBULANCE,
        /**
         * The solid american-sign-language-interpreting icon.See <a href='https://fontawesome.com/v6/icons/american-sign-language-interpreting?s=solid'>example</a>
         */
        AMERICAN_SIGN_LANGUAGE_INTERPRETING,
        /**
         * The solid anchor icon.See <a href='https://fontawesome.com/v6/icons/anchor?s=solid'>example</a>
         */
        ANCHOR,
        /**
         * The solid anchor-circle-check icon.See <a href='https://fontawesome.com/v6/icons/anchor-circle-check?s=solid'>example</a>
         */
        ANCHOR_CIRCLE_CHECK,
        /**
         * The solid anchor-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/anchor-circle-exclamation?s=solid'>example</a>
         */
        ANCHOR_CIRCLE_EXCLAMATION,
        /**
         * The solid anchor-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/anchor-circle-xmark?s=solid'>example</a>
         */
        ANCHOR_CIRCLE_XMARK,
        /**
         * The solid anchor-lock icon.See <a href='https://fontawesome.com/v6/icons/anchor-lock?s=solid'>example</a>
         */
        ANCHOR_LOCK,
        /**
         * The solid angle-double-down icon.See <a href='https://fontawesome.com/v6/icons/angle-double-down?s=solid'>example</a>
         */
        ANGLE_DOUBLE_DOWN,
        /**
         * The solid angle-double-left icon.See <a href='https://fontawesome.com/v6/icons/angle-double-left?s=solid'>example</a>
         */
        ANGLE_DOUBLE_LEFT,
        /**
         * The solid angle-double-right icon.See <a href='https://fontawesome.com/v6/icons/angle-double-right?s=solid'>example</a>
         */
        ANGLE_DOUBLE_RIGHT,
        /**
         * The solid angle-double-up icon.See <a href='https://fontawesome.com/v6/icons/angle-double-up?s=solid'>example</a>
         */
        ANGLE_DOUBLE_UP,
        /**
         * The solid angle-down icon.See <a href='https://fontawesome.com/v6/icons/angle-down?s=solid'>example</a>
         */
        ANGLE_DOWN,
        /**
         * The solid angle-left icon.See <a href='https://fontawesome.com/v6/icons/angle-left?s=solid'>example</a>
         */
        ANGLE_LEFT,
        /**
         * The solid angle-right icon.See <a href='https://fontawesome.com/v6/icons/angle-right?s=solid'>example</a>
         */
        ANGLE_RIGHT,
        /**
         * The solid angle-up icon.See <a href='https://fontawesome.com/v6/icons/angle-up?s=solid'>example</a>
         */
        ANGLE_UP,
        /**
         * The solid angles-down icon.See <a href='https://fontawesome.com/v6/icons/angles-down?s=solid'>example</a>
         */
        ANGLES_DOWN,
        /**
         * The solid angles-left icon.See <a href='https://fontawesome.com/v6/icons/angles-left?s=solid'>example</a>
         */
        ANGLES_LEFT,
        /**
         * The solid angles-right icon.See <a href='https://fontawesome.com/v6/icons/angles-right?s=solid'>example</a>
         */
        ANGLES_RIGHT,
        /**
         * The solid angles-up icon.See <a href='https://fontawesome.com/v6/icons/angles-up?s=solid'>example</a>
         */
        ANGLES_UP,
        /**
         * The solid angry icon.See <a href='https://fontawesome.com/v6/icons/angry?s=solid'>example</a>
         */
        ANGRY,
        /**
         * The solid ankh icon.See <a href='https://fontawesome.com/v6/icons/ankh?s=solid'>example</a>
         */
        ANKH,
        /**
         * The solid apple-alt icon.See <a href='https://fontawesome.com/v6/icons/apple-alt?s=solid'>example</a>
         */
        APPLE_ALT,
        /**
         * The solid apple-whole icon.See <a href='https://fontawesome.com/v6/icons/apple-whole?s=solid'>example</a>
         */
        APPLE_WHOLE,
        /**
         * The solid archive icon.See <a href='https://fontawesome.com/v6/icons/archive?s=solid'>example</a>
         */
        ARCHIVE,
        /**
         * The solid archway icon.See <a href='https://fontawesome.com/v6/icons/archway?s=solid'>example</a>
         */
        ARCHWAY,
        /**
         * The solid area-chart icon.See <a href='https://fontawesome.com/v6/icons/area-chart?s=solid'>example</a>
         */
        AREA_CHART,
        /**
         * The solid arrow-alt-circle-down icon.See <a href='https://fontawesome.com/v6/icons/arrow-alt-circle-down?s=solid'>example</a>
         */
        ARROW_ALT_CIRCLE_DOWN,
        /**
         * The solid arrow-alt-circle-left icon.See <a href='https://fontawesome.com/v6/icons/arrow-alt-circle-left?s=solid'>example</a>
         */
        ARROW_ALT_CIRCLE_LEFT,
        /**
         * The solid arrow-alt-circle-right icon.See <a href='https://fontawesome.com/v6/icons/arrow-alt-circle-right?s=solid'>example</a>
         */
        ARROW_ALT_CIRCLE_RIGHT,
        /**
         * The solid arrow-alt-circle-up icon.See <a href='https://fontawesome.com/v6/icons/arrow-alt-circle-up?s=solid'>example</a>
         */
        ARROW_ALT_CIRCLE_UP,
        /**
         * The solid arrow-circle-down icon.See <a href='https://fontawesome.com/v6/icons/arrow-circle-down?s=solid'>example</a>
         */
        ARROW_CIRCLE_DOWN,
        /**
         * The solid arrow-circle-left icon.See <a href='https://fontawesome.com/v6/icons/arrow-circle-left?s=solid'>example</a>
         */
        ARROW_CIRCLE_LEFT,
        /**
         * The solid arrow-circle-right icon.See <a href='https://fontawesome.com/v6/icons/arrow-circle-right?s=solid'>example</a>
         */
        ARROW_CIRCLE_RIGHT,
        /**
         * The solid arrow-circle-up icon.See <a href='https://fontawesome.com/v6/icons/arrow-circle-up?s=solid'>example</a>
         */
        ARROW_CIRCLE_UP,
        /**
         * The solid arrow-down icon.See <a href='https://fontawesome.com/v6/icons/arrow-down?s=solid'>example</a>
         */
        ARROW_DOWN,
        /**
         * The solid arrow-down-1-9 icon.See <a href='https://fontawesome.com/v6/icons/arrow-down-1-9?s=solid'>example</a>
         */
        ARROW_DOWN_1_9,
        /**
         * The solid arrow-down-9-1 icon.See <a href='https://fontawesome.com/v6/icons/arrow-down-9-1?s=solid'>example</a>
         */
        ARROW_DOWN_9_1,
        /**
         * The solid arrow-down-a-z icon.See <a href='https://fontawesome.com/v6/icons/arrow-down-a-z?s=solid'>example</a>
         */
        ARROW_DOWN_A_Z,
        /**
         * The solid arrow-down-long icon.See <a href='https://fontawesome.com/v6/icons/arrow-down-long?s=solid'>example</a>
         */
        ARROW_DOWN_LONG,
        /**
         * The solid arrow-down-short-wide icon.See <a href='https://fontawesome.com/v6/icons/arrow-down-short-wide?s=solid'>example</a>
         */
        ARROW_DOWN_SHORT_WIDE,
        /**
         * The solid arrow-down-up-across-line icon.See <a href='https://fontawesome.com/v6/icons/arrow-down-up-across-line?s=solid'>example</a>
         */
        ARROW_DOWN_UP_ACROSS_LINE,
        /**
         * The solid arrow-down-up-lock icon.See <a href='https://fontawesome.com/v6/icons/arrow-down-up-lock?s=solid'>example</a>
         */
        ARROW_DOWN_UP_LOCK,
        /**
         * The solid arrow-down-wide-short icon.See <a href='https://fontawesome.com/v6/icons/arrow-down-wide-short?s=solid'>example</a>
         */
        ARROW_DOWN_WIDE_SHORT,
        /**
         * The solid arrow-down-z-a icon.See <a href='https://fontawesome.com/v6/icons/arrow-down-z-a?s=solid'>example</a>
         */
        ARROW_DOWN_Z_A,
        /**
         * The solid arrow-left icon.See <a href='https://fontawesome.com/v6/icons/arrow-left?s=solid'>example</a>
         */
        ARROW_LEFT,
        /**
         * The solid arrow-left-long icon.See <a href='https://fontawesome.com/v6/icons/arrow-left-long?s=solid'>example</a>
         */
        ARROW_LEFT_LONG,
        /**
         * The solid arrow-left-rotate icon.See <a href='https://fontawesome.com/v6/icons/arrow-left-rotate?s=solid'>example</a>
         */
        ARROW_LEFT_ROTATE,
        /**
         * The solid arrow-pointer icon.See <a href='https://fontawesome.com/v6/icons/arrow-pointer?s=solid'>example</a>
         */
        ARROW_POINTER,
        /**
         * The solid arrow-right icon.See <a href='https://fontawesome.com/v6/icons/arrow-right?s=solid'>example</a>
         */
        ARROW_RIGHT,
        /**
         * The solid arrow-right-arrow-left icon.See <a href='https://fontawesome.com/v6/icons/arrow-right-arrow-left?s=solid'>example</a>
         */
        ARROW_RIGHT_ARROW_LEFT,
        /**
         * The solid arrow-right-from-bracket icon.See <a href='https://fontawesome.com/v6/icons/arrow-right-from-bracket?s=solid'>example</a>
         */
        ARROW_RIGHT_FROM_BRACKET,
        /**
         * The solid arrow-right-from-file icon.See <a href='https://fontawesome.com/v6/icons/arrow-right-from-file?s=solid'>example</a>
         */
        ARROW_RIGHT_FROM_FILE,
        /**
         * The solid arrow-right-long icon.See <a href='https://fontawesome.com/v6/icons/arrow-right-long?s=solid'>example</a>
         */
        ARROW_RIGHT_LONG,
        /**
         * The solid arrow-right-rotate icon.See <a href='https://fontawesome.com/v6/icons/arrow-right-rotate?s=solid'>example</a>
         */
        ARROW_RIGHT_ROTATE,
        /**
         * The solid arrow-right-to-bracket icon.See <a href='https://fontawesome.com/v6/icons/arrow-right-to-bracket?s=solid'>example</a>
         */
        ARROW_RIGHT_TO_BRACKET,
        /**
         * The solid arrow-right-to-city icon.See <a href='https://fontawesome.com/v6/icons/arrow-right-to-city?s=solid'>example</a>
         */
        ARROW_RIGHT_TO_CITY,
        /**
         * The solid arrow-right-to-file icon.See <a href='https://fontawesome.com/v6/icons/arrow-right-to-file?s=solid'>example</a>
         */
        ARROW_RIGHT_TO_FILE,
        /**
         * The solid arrow-rotate-back icon.See <a href='https://fontawesome.com/v6/icons/arrow-rotate-back?s=solid'>example</a>
         */
        ARROW_ROTATE_BACK,
        /**
         * The solid arrow-rotate-backward icon.See <a href='https://fontawesome.com/v6/icons/arrow-rotate-backward?s=solid'>example</a>
         */
        ARROW_ROTATE_BACKWARD,
        /**
         * The solid arrow-rotate-forward icon.See <a href='https://fontawesome.com/v6/icons/arrow-rotate-forward?s=solid'>example</a>
         */
        ARROW_ROTATE_FORWARD,
        /**
         * The solid arrow-rotate-left icon.See <a href='https://fontawesome.com/v6/icons/arrow-rotate-left?s=solid'>example</a>
         */
        ARROW_ROTATE_LEFT,
        /**
         * The solid arrow-rotate-right icon.See <a href='https://fontawesome.com/v6/icons/arrow-rotate-right?s=solid'>example</a>
         */
        ARROW_ROTATE_RIGHT,
        /**
         * The solid arrow-trend-down icon.See <a href='https://fontawesome.com/v6/icons/arrow-trend-down?s=solid'>example</a>
         */
        ARROW_TREND_DOWN,
        /**
         * The solid arrow-trend-up icon.See <a href='https://fontawesome.com/v6/icons/arrow-trend-up?s=solid'>example</a>
         */
        ARROW_TREND_UP,
        /**
         * The solid arrow-turn-down icon.See <a href='https://fontawesome.com/v6/icons/arrow-turn-down?s=solid'>example</a>
         */
        ARROW_TURN_DOWN,
        /**
         * The solid arrow-turn-right icon.See <a href='https://fontawesome.com/v6/icons/arrow-turn-right?s=solid'>example</a>
         */
        ARROW_TURN_RIGHT,
        /**
         * The solid arrow-turn-up icon.See <a href='https://fontawesome.com/v6/icons/arrow-turn-up?s=solid'>example</a>
         */
        ARROW_TURN_UP,
        /**
         * The solid arrow-up icon.See <a href='https://fontawesome.com/v6/icons/arrow-up?s=solid'>example</a>
         */
        ARROW_UP,
        /**
         * The solid arrow-up-1-9 icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-1-9?s=solid'>example</a>
         */
        ARROW_UP_1_9,
        /**
         * The solid arrow-up-9-1 icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-9-1?s=solid'>example</a>
         */
        ARROW_UP_9_1,
        /**
         * The solid arrow-up-a-z icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-a-z?s=solid'>example</a>
         */
        ARROW_UP_A_Z,
        /**
         * The solid arrow-up-from-bracket icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-from-bracket?s=solid'>example</a>
         */
        ARROW_UP_FROM_BRACKET,
        /**
         * The solid arrow-up-from-ground-water icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-from-ground-water?s=solid'>example</a>
         */
        ARROW_UP_FROM_GROUND_WATER,
        /**
         * The solid arrow-up-from-water-pump icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-from-water-pump?s=solid'>example</a>
         */
        ARROW_UP_FROM_WATER_PUMP,
        /**
         * The solid arrow-up-long icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-long?s=solid'>example</a>
         */
        ARROW_UP_LONG,
        /**
         * The solid arrow-up-right-dots icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-right-dots?s=solid'>example</a>
         */
        ARROW_UP_RIGHT_DOTS,
        /**
         * The solid arrow-up-right-from-square icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-right-from-square?s=solid'>example</a>
         */
        ARROW_UP_RIGHT_FROM_SQUARE,
        /**
         * The solid arrow-up-short-wide icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-short-wide?s=solid'>example</a>
         */
        ARROW_UP_SHORT_WIDE,
        /**
         * The solid arrow-up-wide-short icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-wide-short?s=solid'>example</a>
         */
        ARROW_UP_WIDE_SHORT,
        /**
         * The solid arrow-up-z-a icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-z-a?s=solid'>example</a>
         */
        ARROW_UP_Z_A,
        /**
         * The solid arrows icon.See <a href='https://fontawesome.com/v6/icons/arrows?s=solid'>example</a>
         */
        ARROWS,
        /**
         * The solid arrows-alt icon.See <a href='https://fontawesome.com/v6/icons/arrows-alt?s=solid'>example</a>
         */
        ARROWS_ALT,
        /**
         * The solid arrows-alt-h icon.See <a href='https://fontawesome.com/v6/icons/arrows-alt-h?s=solid'>example</a>
         */
        ARROWS_ALT_H,
        /**
         * The solid arrows-alt-v icon.See <a href='https://fontawesome.com/v6/icons/arrows-alt-v?s=solid'>example</a>
         */
        ARROWS_ALT_V,
        /**
         * The solid arrows-down-to-line icon.See <a href='https://fontawesome.com/v6/icons/arrows-down-to-line?s=solid'>example</a>
         */
        ARROWS_DOWN_TO_LINE,
        /**
         * The solid arrows-down-to-people icon.See <a href='https://fontawesome.com/v6/icons/arrows-down-to-people?s=solid'>example</a>
         */
        ARROWS_DOWN_TO_PEOPLE,
        /**
         * The solid arrows-h icon.See <a href='https://fontawesome.com/v6/icons/arrows-h?s=solid'>example</a>
         */
        ARROWS_H,
        /**
         * The solid arrows-left-right icon.See <a href='https://fontawesome.com/v6/icons/arrows-left-right?s=solid'>example</a>
         */
        ARROWS_LEFT_RIGHT,
        /**
         * The solid arrows-left-right-to-line icon.See <a href='https://fontawesome.com/v6/icons/arrows-left-right-to-line?s=solid'>example</a>
         */
        ARROWS_LEFT_RIGHT_TO_LINE,
        /**
         * The solid arrows-rotate icon.See <a href='https://fontawesome.com/v6/icons/arrows-rotate?s=solid'>example</a>
         */
        ARROWS_ROTATE,
        /**
         * The solid arrows-spin icon.See <a href='https://fontawesome.com/v6/icons/arrows-spin?s=solid'>example</a>
         */
        ARROWS_SPIN,
        /**
         * The solid arrows-split-up-and-left icon.See <a href='https://fontawesome.com/v6/icons/arrows-split-up-and-left?s=solid'>example</a>
         */
        ARROWS_SPLIT_UP_AND_LEFT,
        /**
         * The solid arrows-to-circle icon.See <a href='https://fontawesome.com/v6/icons/arrows-to-circle?s=solid'>example</a>
         */
        ARROWS_TO_CIRCLE,
        /**
         * The solid arrows-to-dot icon.See <a href='https://fontawesome.com/v6/icons/arrows-to-dot?s=solid'>example</a>
         */
        ARROWS_TO_DOT,
        /**
         * The solid arrows-to-eye icon.See <a href='https://fontawesome.com/v6/icons/arrows-to-eye?s=solid'>example</a>
         */
        ARROWS_TO_EYE,
        /**
         * The solid arrows-turn-right icon.See <a href='https://fontawesome.com/v6/icons/arrows-turn-right?s=solid'>example</a>
         */
        ARROWS_TURN_RIGHT,
        /**
         * The solid arrows-turn-to-dots icon.See <a href='https://fontawesome.com/v6/icons/arrows-turn-to-dots?s=solid'>example</a>
         */
        ARROWS_TURN_TO_DOTS,
        /**
         * The solid arrows-up-down icon.See <a href='https://fontawesome.com/v6/icons/arrows-up-down?s=solid'>example</a>
         */
        ARROWS_UP_DOWN,
        /**
         * The solid arrows-up-down-left-right icon.See <a href='https://fontawesome.com/v6/icons/arrows-up-down-left-right?s=solid'>example</a>
         */
        ARROWS_UP_DOWN_LEFT_RIGHT,
        /**
         * The solid arrows-up-to-line icon.See <a href='https://fontawesome.com/v6/icons/arrows-up-to-line?s=solid'>example</a>
         */
        ARROWS_UP_TO_LINE,
        /**
         * The solid arrows-v icon.See <a href='https://fontawesome.com/v6/icons/arrows-v?s=solid'>example</a>
         */
        ARROWS_V,
        /**
         * The solid asl-interpreting icon.See <a href='https://fontawesome.com/v6/icons/asl-interpreting?s=solid'>example</a>
         */
        ASL_INTERPRETING,
        /**
         * The solid assistive-listening-systems icon.See <a href='https://fontawesome.com/v6/icons/assistive-listening-systems?s=solid'>example</a>
         */
        ASSISTIVE_LISTENING_SYSTEMS,
        /**
         * The solid asterisk icon.See <a href='https://fontawesome.com/v6/icons/asterisk?s=solid'>example</a>
         */
        ASTERISK,
        /**
         * The solid at icon.See <a href='https://fontawesome.com/v6/icons/at?s=solid'>example</a>
         */
        AT,
        /**
         * The solid atlas icon.See <a href='https://fontawesome.com/v6/icons/atlas?s=solid'>example</a>
         */
        ATLAS,
        /**
         * The solid atom icon.See <a href='https://fontawesome.com/v6/icons/atom?s=solid'>example</a>
         */
        ATOM,
        /**
         * The solid audio-description icon.See <a href='https://fontawesome.com/v6/icons/audio-description?s=solid'>example</a>
         */
        AUDIO_DESCRIPTION,
        /**
         * The solid austral-sign icon.See <a href='https://fontawesome.com/v6/icons/austral-sign?s=solid'>example</a>
         */
        AUSTRAL_SIGN,
        /**
         * The solid automobile icon.See <a href='https://fontawesome.com/v6/icons/automobile?s=solid'>example</a>
         */
        AUTOMOBILE,
        /**
         * The solid award icon.See <a href='https://fontawesome.com/v6/icons/award?s=solid'>example</a>
         */
        AWARD,
        /**
         * The solid b icon.See <a href='https://fontawesome.com/v6/icons/b?s=solid'>example</a>
         */
        B,
        /**
         * The solid baby icon.See <a href='https://fontawesome.com/v6/icons/baby?s=solid'>example</a>
         */
        BABY,
        /**
         * The solid baby-carriage icon.See <a href='https://fontawesome.com/v6/icons/baby-carriage?s=solid'>example</a>
         */
        BABY_CARRIAGE,
        /**
         * The solid backspace icon.See <a href='https://fontawesome.com/v6/icons/backspace?s=solid'>example</a>
         */
        BACKSPACE,
        /**
         * The solid backward icon.See <a href='https://fontawesome.com/v6/icons/backward?s=solid'>example</a>
         */
        BACKWARD,
        /**
         * The solid backward-fast icon.See <a href='https://fontawesome.com/v6/icons/backward-fast?s=solid'>example</a>
         */
        BACKWARD_FAST,
        /**
         * The solid backward-step icon.See <a href='https://fontawesome.com/v6/icons/backward-step?s=solid'>example</a>
         */
        BACKWARD_STEP,
        /**
         * The solid bacon icon.See <a href='https://fontawesome.com/v6/icons/bacon?s=solid'>example</a>
         */
        BACON,
        /**
         * The solid bacteria icon.See <a href='https://fontawesome.com/v6/icons/bacteria?s=solid'>example</a>
         */
        BACTERIA,
        /**
         * The solid bacterium icon.See <a href='https://fontawesome.com/v6/icons/bacterium?s=solid'>example</a>
         */
        BACTERIUM,
        /**
         * The solid bag-shopping icon.See <a href='https://fontawesome.com/v6/icons/bag-shopping?s=solid'>example</a>
         */
        BAG_SHOPPING,
        /**
         * The solid bahai icon.See <a href='https://fontawesome.com/v6/icons/bahai?s=solid'>example</a>
         */
        BAHAI,
        /**
         * The solid baht-sign icon.See <a href='https://fontawesome.com/v6/icons/baht-sign?s=solid'>example</a>
         */
        BAHT_SIGN,
        /**
         * The solid balance-scale icon.See <a href='https://fontawesome.com/v6/icons/balance-scale?s=solid'>example</a>
         */
        BALANCE_SCALE,
        /**
         * The solid balance-scale-left icon.See <a href='https://fontawesome.com/v6/icons/balance-scale-left?s=solid'>example</a>
         */
        BALANCE_SCALE_LEFT,
        /**
         * The solid balance-scale-right icon.See <a href='https://fontawesome.com/v6/icons/balance-scale-right?s=solid'>example</a>
         */
        BALANCE_SCALE_RIGHT,
        /**
         * The solid ban icon.See <a href='https://fontawesome.com/v6/icons/ban?s=solid'>example</a>
         */
        BAN,
        /**
         * The solid ban-smoking icon.See <a href='https://fontawesome.com/v6/icons/ban-smoking?s=solid'>example</a>
         */
        BAN_SMOKING,
        /**
         * The solid band-aid icon.See <a href='https://fontawesome.com/v6/icons/band-aid?s=solid'>example</a>
         */
        BAND_AID,
        /**
         * The solid bandage icon.See <a href='https://fontawesome.com/v6/icons/bandage?s=solid'>example</a>
         */
        BANDAGE,
        /**
         * The solid bank icon.See <a href='https://fontawesome.com/v6/icons/bank?s=solid'>example</a>
         */
        BANK,
        /**
         * The solid bar-chart icon.See <a href='https://fontawesome.com/v6/icons/bar-chart?s=solid'>example</a>
         */
        BAR_CHART,
        /**
         * The solid barcode icon.See <a href='https://fontawesome.com/v6/icons/barcode?s=solid'>example</a>
         */
        BARCODE,
        /**
         * The solid bars icon.See <a href='https://fontawesome.com/v6/icons/bars?s=solid'>example</a>
         */
        BARS,
        /**
         * The solid bars-progress icon.See <a href='https://fontawesome.com/v6/icons/bars-progress?s=solid'>example</a>
         */
        BARS_PROGRESS,
        /**
         * The solid bars-staggered icon.See <a href='https://fontawesome.com/v6/icons/bars-staggered?s=solid'>example</a>
         */
        BARS_STAGGERED,
        /**
         * The solid baseball icon.See <a href='https://fontawesome.com/v6/icons/baseball?s=solid'>example</a>
         */
        BASEBALL,
        /**
         * The solid baseball-ball icon.See <a href='https://fontawesome.com/v6/icons/baseball-ball?s=solid'>example</a>
         */
        BASEBALL_BALL,
        /**
         * The solid baseball-bat-ball icon.See <a href='https://fontawesome.com/v6/icons/baseball-bat-ball?s=solid'>example</a>
         */
        BASEBALL_BAT_BALL,
        /**
         * The solid basket-shopping icon.See <a href='https://fontawesome.com/v6/icons/basket-shopping?s=solid'>example</a>
         */
        BASKET_SHOPPING,
        /**
         * The solid basketball icon.See <a href='https://fontawesome.com/v6/icons/basketball?s=solid'>example</a>
         */
        BASKETBALL,
        /**
         * The solid basketball-ball icon.See <a href='https://fontawesome.com/v6/icons/basketball-ball?s=solid'>example</a>
         */
        BASKETBALL_BALL,
        /**
         * The solid bath icon.See <a href='https://fontawesome.com/v6/icons/bath?s=solid'>example</a>
         */
        BATH,
        /**
         * The solid bathtub icon.See <a href='https://fontawesome.com/v6/icons/bathtub?s=solid'>example</a>
         */
        BATHTUB,
        /**
         * The solid battery icon.See <a href='https://fontawesome.com/v6/icons/battery?s=solid'>example</a>
         */
        BATTERY,
        /**
         * The solid battery-0 icon.See <a href='https://fontawesome.com/v6/icons/battery-0?s=solid'>example</a>
         */
        BATTERY_0,
        /**
         * The solid battery-2 icon.See <a href='https://fontawesome.com/v6/icons/battery-2?s=solid'>example</a>
         */
        BATTERY_2,
        /**
         * The solid battery-3 icon.See <a href='https://fontawesome.com/v6/icons/battery-3?s=solid'>example</a>
         */
        BATTERY_3,
        /**
         * The solid battery-4 icon.See <a href='https://fontawesome.com/v6/icons/battery-4?s=solid'>example</a>
         */
        BATTERY_4,
        /**
         * The solid battery-5 icon.See <a href='https://fontawesome.com/v6/icons/battery-5?s=solid'>example</a>
         */
        BATTERY_5,
        /**
         * The solid battery-car icon.See <a href='https://fontawesome.com/v6/icons/battery-car?s=solid'>example</a>
         */
        BATTERY_CAR,
        /**
         * The solid battery-empty icon.See <a href='https://fontawesome.com/v6/icons/battery-empty?s=solid'>example</a>
         */
        BATTERY_EMPTY,
        /**
         * The solid battery-full icon.See <a href='https://fontawesome.com/v6/icons/battery-full?s=solid'>example</a>
         */
        BATTERY_FULL,
        /**
         * The solid battery-half icon.See <a href='https://fontawesome.com/v6/icons/battery-half?s=solid'>example</a>
         */
        BATTERY_HALF,
        /**
         * The solid battery-quarter icon.See <a href='https://fontawesome.com/v6/icons/battery-quarter?s=solid'>example</a>
         */
        BATTERY_QUARTER,
        /**
         * The solid battery-three-quarters icon.See <a href='https://fontawesome.com/v6/icons/battery-three-quarters?s=solid'>example</a>
         */
        BATTERY_THREE_QUARTERS,
        /**
         * The solid bed icon.See <a href='https://fontawesome.com/v6/icons/bed?s=solid'>example</a>
         */
        BED,
        /**
         * The solid bed-pulse icon.See <a href='https://fontawesome.com/v6/icons/bed-pulse?s=solid'>example</a>
         */
        BED_PULSE,
        /**
         * The solid beer icon.See <a href='https://fontawesome.com/v6/icons/beer?s=solid'>example</a>
         */
        BEER,
        /**
         * The solid beer-mug-empty icon.See <a href='https://fontawesome.com/v6/icons/beer-mug-empty?s=solid'>example</a>
         */
        BEER_MUG_EMPTY,
        /**
         * The solid bell icon.See <a href='https://fontawesome.com/v6/icons/bell?s=solid'>example</a>
         */
        BELL,
        /**
         * The solid bell-concierge icon.See <a href='https://fontawesome.com/v6/icons/bell-concierge?s=solid'>example</a>
         */
        BELL_CONCIERGE,
        /**
         * The solid bell-slash icon.See <a href='https://fontawesome.com/v6/icons/bell-slash?s=solid'>example</a>
         */
        BELL_SLASH,
        /**
         * The solid bezier-curve icon.See <a href='https://fontawesome.com/v6/icons/bezier-curve?s=solid'>example</a>
         */
        BEZIER_CURVE,
        /**
         * The solid bible icon.See <a href='https://fontawesome.com/v6/icons/bible?s=solid'>example</a>
         */
        BIBLE,
        /**
         * The solid bicycle icon.See <a href='https://fontawesome.com/v6/icons/bicycle?s=solid'>example</a>
         */
        BICYCLE,
        /**
         * The solid biking icon.See <a href='https://fontawesome.com/v6/icons/biking?s=solid'>example</a>
         */
        BIKING,
        /**
         * The solid binoculars icon.See <a href='https://fontawesome.com/v6/icons/binoculars?s=solid'>example</a>
         */
        BINOCULARS,
        /**
         * The solid biohazard icon.See <a href='https://fontawesome.com/v6/icons/biohazard?s=solid'>example</a>
         */
        BIOHAZARD,
        /**
         * The solid birthday-cake icon.See <a href='https://fontawesome.com/v6/icons/birthday-cake?s=solid'>example</a>
         */
        BIRTHDAY_CAKE,
        /**
         * The solid bitcoin-sign icon.See <a href='https://fontawesome.com/v6/icons/bitcoin-sign?s=solid'>example</a>
         */
        BITCOIN_SIGN,
        /**
         * The solid blackboard icon.See <a href='https://fontawesome.com/v6/icons/blackboard?s=solid'>example</a>
         */
        BLACKBOARD,
        /**
         * The solid blender icon.See <a href='https://fontawesome.com/v6/icons/blender?s=solid'>example</a>
         */
        BLENDER,
        /**
         * The solid blender-phone icon.See <a href='https://fontawesome.com/v6/icons/blender-phone?s=solid'>example</a>
         */
        BLENDER_PHONE,
        /**
         * The solid blind icon.See <a href='https://fontawesome.com/v6/icons/blind?s=solid'>example</a>
         */
        BLIND,
        /**
         * The solid blog icon.See <a href='https://fontawesome.com/v6/icons/blog?s=solid'>example</a>
         */
        BLOG,
        /**
         * The solid bold icon.See <a href='https://fontawesome.com/v6/icons/bold?s=solid'>example</a>
         */
        BOLD,
        /**
         * The solid bolt icon.See <a href='https://fontawesome.com/v6/icons/bolt?s=solid'>example</a>
         */
        BOLT,
        /**
         * The solid bolt-lightning icon.See <a href='https://fontawesome.com/v6/icons/bolt-lightning?s=solid'>example</a>
         */
        BOLT_LIGHTNING,
        /**
         * The solid bomb icon.See <a href='https://fontawesome.com/v6/icons/bomb?s=solid'>example</a>
         */
        BOMB,
        /**
         * The solid bone icon.See <a href='https://fontawesome.com/v6/icons/bone?s=solid'>example</a>
         */
        BONE,
        /**
         * The solid bong icon.See <a href='https://fontawesome.com/v6/icons/bong?s=solid'>example</a>
         */
        BONG,
        /**
         * The solid book icon.See <a href='https://fontawesome.com/v6/icons/book?s=solid'>example</a>
         */
        BOOK,
        /**
         * The solid book-atlas icon.See <a href='https://fontawesome.com/v6/icons/book-atlas?s=solid'>example</a>
         */
        BOOK_ATLAS,
        /**
         * The solid book-bible icon.See <a href='https://fontawesome.com/v6/icons/book-bible?s=solid'>example</a>
         */
        BOOK_BIBLE,
        /**
         * The solid book-bookmark icon.See <a href='https://fontawesome.com/v6/icons/book-bookmark?s=solid'>example</a>
         */
        BOOK_BOOKMARK,
        /**
         * The solid book-dead icon.See <a href='https://fontawesome.com/v6/icons/book-dead?s=solid'>example</a>
         */
        BOOK_DEAD,
        /**
         * The solid book-journal-whills icon.See <a href='https://fontawesome.com/v6/icons/book-journal-whills?s=solid'>example</a>
         */
        BOOK_JOURNAL_WHILLS,
        /**
         * The solid book-medical icon.See <a href='https://fontawesome.com/v6/icons/book-medical?s=solid'>example</a>
         */
        BOOK_MEDICAL,
        /**
         * The solid book-open icon.See <a href='https://fontawesome.com/v6/icons/book-open?s=solid'>example</a>
         */
        BOOK_OPEN,
        /**
         * The solid book-open-reader icon.See <a href='https://fontawesome.com/v6/icons/book-open-reader?s=solid'>example</a>
         */
        BOOK_OPEN_READER,
        /**
         * The solid book-quran icon.See <a href='https://fontawesome.com/v6/icons/book-quran?s=solid'>example</a>
         */
        BOOK_QURAN,
        /**
         * The solid book-reader icon.See <a href='https://fontawesome.com/v6/icons/book-reader?s=solid'>example</a>
         */
        BOOK_READER,
        /**
         * The solid book-skull icon.See <a href='https://fontawesome.com/v6/icons/book-skull?s=solid'>example</a>
         */
        BOOK_SKULL,
        /**
         * The solid book-tanakh icon.See <a href='https://fontawesome.com/v6/icons/book-tanakh?s=solid'>example</a>
         */
        BOOK_TANAKH,
        /**
         * The solid bookmark icon.See <a href='https://fontawesome.com/v6/icons/bookmark?s=solid'>example</a>
         */
        BOOKMARK,
        /**
         * The solid border-all icon.See <a href='https://fontawesome.com/v6/icons/border-all?s=solid'>example</a>
         */
        BORDER_ALL,
        /**
         * The solid border-none icon.See <a href='https://fontawesome.com/v6/icons/border-none?s=solid'>example</a>
         */
        BORDER_NONE,
        /**
         * The solid border-style icon.See <a href='https://fontawesome.com/v6/icons/border-style?s=solid'>example</a>
         */
        BORDER_STYLE,
        /**
         * The solid border-top-left icon.See <a href='https://fontawesome.com/v6/icons/border-top-left?s=solid'>example</a>
         */
        BORDER_TOP_LEFT,
        /**
         * The solid bore-hole icon.See <a href='https://fontawesome.com/v6/icons/bore-hole?s=solid'>example</a>
         */
        BORE_HOLE,
        /**
         * The solid bottle-droplet icon.See <a href='https://fontawesome.com/v6/icons/bottle-droplet?s=solid'>example</a>
         */
        BOTTLE_DROPLET,
        /**
         * The solid bottle-water icon.See <a href='https://fontawesome.com/v6/icons/bottle-water?s=solid'>example</a>
         */
        BOTTLE_WATER,
        /**
         * The solid bowl-food icon.See <a href='https://fontawesome.com/v6/icons/bowl-food?s=solid'>example</a>
         */
        BOWL_FOOD,
        /**
         * The solid bowl-rice icon.See <a href='https://fontawesome.com/v6/icons/bowl-rice?s=solid'>example</a>
         */
        BOWL_RICE,
        /**
         * The solid bowling-ball icon.See <a href='https://fontawesome.com/v6/icons/bowling-ball?s=solid'>example</a>
         */
        BOWLING_BALL,
        /**
         * The solid box icon.See <a href='https://fontawesome.com/v6/icons/box?s=solid'>example</a>
         */
        BOX,
        /**
         * The solid box-archive icon.See <a href='https://fontawesome.com/v6/icons/box-archive?s=solid'>example</a>
         */
        BOX_ARCHIVE,
        /**
         * The solid box-open icon.See <a href='https://fontawesome.com/v6/icons/box-open?s=solid'>example</a>
         */
        BOX_OPEN,
        /**
         * The solid box-tissue icon.See <a href='https://fontawesome.com/v6/icons/box-tissue?s=solid'>example</a>
         */
        BOX_TISSUE,
        /**
         * The solid boxes icon.See <a href='https://fontawesome.com/v6/icons/boxes?s=solid'>example</a>
         */
        BOXES,
        /**
         * The solid boxes-alt icon.See <a href='https://fontawesome.com/v6/icons/boxes-alt?s=solid'>example</a>
         */
        BOXES_ALT,
        /**
         * The solid boxes-packing icon.See <a href='https://fontawesome.com/v6/icons/boxes-packing?s=solid'>example</a>
         */
        BOXES_PACKING,
        /**
         * The solid boxes-stacked icon.See <a href='https://fontawesome.com/v6/icons/boxes-stacked?s=solid'>example</a>
         */
        BOXES_STACKED,
        /**
         * The solid braille icon.See <a href='https://fontawesome.com/v6/icons/braille?s=solid'>example</a>
         */
        BRAILLE,
        /**
         * The solid brain icon.See <a href='https://fontawesome.com/v6/icons/brain?s=solid'>example</a>
         */
        BRAIN,
        /**
         * The solid brazilian-real-sign icon.See <a href='https://fontawesome.com/v6/icons/brazilian-real-sign?s=solid'>example</a>
         */
        BRAZILIAN_REAL_SIGN,
        /**
         * The solid bread-slice icon.See <a href='https://fontawesome.com/v6/icons/bread-slice?s=solid'>example</a>
         */
        BREAD_SLICE,
        /**
         * The solid bridge icon.See <a href='https://fontawesome.com/v6/icons/bridge?s=solid'>example</a>
         */
        BRIDGE,
        /**
         * The solid bridge-circle-check icon.See <a href='https://fontawesome.com/v6/icons/bridge-circle-check?s=solid'>example</a>
         */
        BRIDGE_CIRCLE_CHECK,
        /**
         * The solid bridge-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/bridge-circle-exclamation?s=solid'>example</a>
         */
        BRIDGE_CIRCLE_EXCLAMATION,
        /**
         * The solid bridge-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/bridge-circle-xmark?s=solid'>example</a>
         */
        BRIDGE_CIRCLE_XMARK,
        /**
         * The solid bridge-lock icon.See <a href='https://fontawesome.com/v6/icons/bridge-lock?s=solid'>example</a>
         */
        BRIDGE_LOCK,
        /**
         * The solid bridge-water icon.See <a href='https://fontawesome.com/v6/icons/bridge-water?s=solid'>example</a>
         */
        BRIDGE_WATER,
        /**
         * The solid briefcase icon.See <a href='https://fontawesome.com/v6/icons/briefcase?s=solid'>example</a>
         */
        BRIEFCASE,
        /**
         * The solid briefcase-clock icon.See <a href='https://fontawesome.com/v6/icons/briefcase-clock?s=solid'>example</a>
         */
        BRIEFCASE_CLOCK,
        /**
         * The solid briefcase-medical icon.See <a href='https://fontawesome.com/v6/icons/briefcase-medical?s=solid'>example</a>
         */
        BRIEFCASE_MEDICAL,
        /**
         * The solid broadcast-tower icon.See <a href='https://fontawesome.com/v6/icons/broadcast-tower?s=solid'>example</a>
         */
        BROADCAST_TOWER,
        /**
         * The solid broom icon.See <a href='https://fontawesome.com/v6/icons/broom?s=solid'>example</a>
         */
        BROOM,
        /**
         * The solid broom-ball icon.See <a href='https://fontawesome.com/v6/icons/broom-ball?s=solid'>example</a>
         */
        BROOM_BALL,
        /**
         * The solid brush icon.See <a href='https://fontawesome.com/v6/icons/brush?s=solid'>example</a>
         */
        BRUSH,
        /**
         * The solid bucket icon.See <a href='https://fontawesome.com/v6/icons/bucket?s=solid'>example</a>
         */
        BUCKET,
        /**
         * The solid bug icon.See <a href='https://fontawesome.com/v6/icons/bug?s=solid'>example</a>
         */
        BUG,
        /**
         * The solid bug-slash icon.See <a href='https://fontawesome.com/v6/icons/bug-slash?s=solid'>example</a>
         */
        BUG_SLASH,
        /**
         * The solid bugs icon.See <a href='https://fontawesome.com/v6/icons/bugs?s=solid'>example</a>
         */
        BUGS,
        /**
         * The solid building icon.See <a href='https://fontawesome.com/v6/icons/building?s=solid'>example</a>
         */
        BUILDING,
        /**
         * The solid building-circle-arrow-right icon.See <a href='https://fontawesome.com/v6/icons/building-circle-arrow-right?s=solid'>example</a>
         */
        BUILDING_CIRCLE_ARROW_RIGHT,
        /**
         * The solid building-circle-check icon.See <a href='https://fontawesome.com/v6/icons/building-circle-check?s=solid'>example</a>
         */
        BUILDING_CIRCLE_CHECK,
        /**
         * The solid building-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/building-circle-exclamation?s=solid'>example</a>
         */
        BUILDING_CIRCLE_EXCLAMATION,
        /**
         * The solid building-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/building-circle-xmark?s=solid'>example</a>
         */
        BUILDING_CIRCLE_XMARK,
        /**
         * The solid building-columns icon.See <a href='https://fontawesome.com/v6/icons/building-columns?s=solid'>example</a>
         */
        BUILDING_COLUMNS,
        /**
         * The solid building-flag icon.See <a href='https://fontawesome.com/v6/icons/building-flag?s=solid'>example</a>
         */
        BUILDING_FLAG,
        /**
         * The solid building-lock icon.See <a href='https://fontawesome.com/v6/icons/building-lock?s=solid'>example</a>
         */
        BUILDING_LOCK,
        /**
         * The solid building-ngo icon.See <a href='https://fontawesome.com/v6/icons/building-ngo?s=solid'>example</a>
         */
        BUILDING_NGO,
        /**
         * The solid building-shield icon.See <a href='https://fontawesome.com/v6/icons/building-shield?s=solid'>example</a>
         */
        BUILDING_SHIELD,
        /**
         * The solid building-un icon.See <a href='https://fontawesome.com/v6/icons/building-un?s=solid'>example</a>
         */
        BUILDING_UN,
        /**
         * The solid building-user icon.See <a href='https://fontawesome.com/v6/icons/building-user?s=solid'>example</a>
         */
        BUILDING_USER,
        /**
         * The solid building-wheat icon.See <a href='https://fontawesome.com/v6/icons/building-wheat?s=solid'>example</a>
         */
        BUILDING_WHEAT,
        /**
         * The solid bullhorn icon.See <a href='https://fontawesome.com/v6/icons/bullhorn?s=solid'>example</a>
         */
        BULLHORN,
        /**
         * The solid bullseye icon.See <a href='https://fontawesome.com/v6/icons/bullseye?s=solid'>example</a>
         */
        BULLSEYE,
        /**
         * The solid burger icon.See <a href='https://fontawesome.com/v6/icons/burger?s=solid'>example</a>
         */
        BURGER,
        /**
         * The solid burn icon.See <a href='https://fontawesome.com/v6/icons/burn?s=solid'>example</a>
         */
        BURN,
        /**
         * The solid burst icon.See <a href='https://fontawesome.com/v6/icons/burst?s=solid'>example</a>
         */
        BURST,
        /**
         * The solid bus icon.See <a href='https://fontawesome.com/v6/icons/bus?s=solid'>example</a>
         */
        BUS,
        /**
         * The solid bus-alt icon.See <a href='https://fontawesome.com/v6/icons/bus-alt?s=solid'>example</a>
         */
        BUS_ALT,
        /**
         * The solid bus-simple icon.See <a href='https://fontawesome.com/v6/icons/bus-simple?s=solid'>example</a>
         */
        BUS_SIMPLE,
        /**
         * The solid business-time icon.See <a href='https://fontawesome.com/v6/icons/business-time?s=solid'>example</a>
         */
        BUSINESS_TIME,
        /**
         * The solid c icon.See <a href='https://fontawesome.com/v6/icons/c?s=solid'>example</a>
         */
        C,
        /**
         * The solid cab icon.See <a href='https://fontawesome.com/v6/icons/cab?s=solid'>example</a>
         */
        CAB,
        /**
         * The solid cable-car icon.See <a href='https://fontawesome.com/v6/icons/cable-car?s=solid'>example</a>
         */
        CABLE_CAR,
        /**
         * The solid cake icon.See <a href='https://fontawesome.com/v6/icons/cake?s=solid'>example</a>
         */
        CAKE,
        /**
         * The solid cake-candles icon.See <a href='https://fontawesome.com/v6/icons/cake-candles?s=solid'>example</a>
         */
        CAKE_CANDLES,
        /**
         * The solid calculator icon.See <a href='https://fontawesome.com/v6/icons/calculator?s=solid'>example</a>
         */
        CALCULATOR,
        /**
         * The solid calendar icon.See <a href='https://fontawesome.com/v6/icons/calendar?s=solid'>example</a>
         */
        CALENDAR,
        /**
         * The solid calendar-alt icon.See <a href='https://fontawesome.com/v6/icons/calendar-alt?s=solid'>example</a>
         */
        CALENDAR_ALT,
        /**
         * The solid calendar-check icon.See <a href='https://fontawesome.com/v6/icons/calendar-check?s=solid'>example</a>
         */
        CALENDAR_CHECK,
        /**
         * The solid calendar-day icon.See <a href='https://fontawesome.com/v6/icons/calendar-day?s=solid'>example</a>
         */
        CALENDAR_DAY,
        /**
         * The solid calendar-days icon.See <a href='https://fontawesome.com/v6/icons/calendar-days?s=solid'>example</a>
         */
        CALENDAR_DAYS,
        /**
         * The solid calendar-minus icon.See <a href='https://fontawesome.com/v6/icons/calendar-minus?s=solid'>example</a>
         */
        CALENDAR_MINUS,
        /**
         * The solid calendar-plus icon.See <a href='https://fontawesome.com/v6/icons/calendar-plus?s=solid'>example</a>
         */
        CALENDAR_PLUS,
        /**
         * The solid calendar-times icon.See <a href='https://fontawesome.com/v6/icons/calendar-times?s=solid'>example</a>
         */
        CALENDAR_TIMES,
        /**
         * The solid calendar-week icon.See <a href='https://fontawesome.com/v6/icons/calendar-week?s=solid'>example</a>
         */
        CALENDAR_WEEK,
        /**
         * The solid calendar-xmark icon.See <a href='https://fontawesome.com/v6/icons/calendar-xmark?s=solid'>example</a>
         */
        CALENDAR_XMARK,
        /**
         * The solid camera icon.See <a href='https://fontawesome.com/v6/icons/camera?s=solid'>example</a>
         */
        CAMERA,
        /**
         * The solid camera-alt icon.See <a href='https://fontawesome.com/v6/icons/camera-alt?s=solid'>example</a>
         */
        CAMERA_ALT,
        /**
         * The solid camera-retro icon.See <a href='https://fontawesome.com/v6/icons/camera-retro?s=solid'>example</a>
         */
        CAMERA_RETRO,
        /**
         * The solid camera-rotate icon.See <a href='https://fontawesome.com/v6/icons/camera-rotate?s=solid'>example</a>
         */
        CAMERA_ROTATE,
        /**
         * The solid campground icon.See <a href='https://fontawesome.com/v6/icons/campground?s=solid'>example</a>
         */
        CAMPGROUND,
        /**
         * The solid cancel icon.See <a href='https://fontawesome.com/v6/icons/cancel?s=solid'>example</a>
         */
        CANCEL,
        /**
         * The solid candy-cane icon.See <a href='https://fontawesome.com/v6/icons/candy-cane?s=solid'>example</a>
         */
        CANDY_CANE,
        /**
         * The solid cannabis icon.See <a href='https://fontawesome.com/v6/icons/cannabis?s=solid'>example</a>
         */
        CANNABIS,
        /**
         * The solid capsules icon.See <a href='https://fontawesome.com/v6/icons/capsules?s=solid'>example</a>
         */
        CAPSULES,
        /**
         * The solid car icon.See <a href='https://fontawesome.com/v6/icons/car?s=solid'>example</a>
         */
        CAR,
        /**
         * The solid car-alt icon.See <a href='https://fontawesome.com/v6/icons/car-alt?s=solid'>example</a>
         */
        CAR_ALT,
        /**
         * The solid car-battery icon.See <a href='https://fontawesome.com/v6/icons/car-battery?s=solid'>example</a>
         */
        CAR_BATTERY,
        /**
         * The solid car-burst icon.See <a href='https://fontawesome.com/v6/icons/car-burst?s=solid'>example</a>
         */
        CAR_BURST,
        /**
         * The solid car-crash icon.See <a href='https://fontawesome.com/v6/icons/car-crash?s=solid'>example</a>
         */
        CAR_CRASH,
        /**
         * The solid car-on icon.See <a href='https://fontawesome.com/v6/icons/car-on?s=solid'>example</a>
         */
        CAR_ON,
        /**
         * The solid car-rear icon.See <a href='https://fontawesome.com/v6/icons/car-rear?s=solid'>example</a>
         */
        CAR_REAR,
        /**
         * The solid car-side icon.See <a href='https://fontawesome.com/v6/icons/car-side?s=solid'>example</a>
         */
        CAR_SIDE,
        /**
         * The solid car-tunnel icon.See <a href='https://fontawesome.com/v6/icons/car-tunnel?s=solid'>example</a>
         */
        CAR_TUNNEL,
        /**
         * The solid caravan icon.See <a href='https://fontawesome.com/v6/icons/caravan?s=solid'>example</a>
         */
        CARAVAN,
        /**
         * The solid caret-down icon.See <a href='https://fontawesome.com/v6/icons/caret-down?s=solid'>example</a>
         */
        CARET_DOWN,
        /**
         * The solid caret-left icon.See <a href='https://fontawesome.com/v6/icons/caret-left?s=solid'>example</a>
         */
        CARET_LEFT,
        /**
         * The solid caret-right icon.See <a href='https://fontawesome.com/v6/icons/caret-right?s=solid'>example</a>
         */
        CARET_RIGHT,
        /**
         * The solid caret-square-down icon.See <a href='https://fontawesome.com/v6/icons/caret-square-down?s=solid'>example</a>
         */
        CARET_SQUARE_DOWN,
        /**
         * The solid caret-square-left icon.See <a href='https://fontawesome.com/v6/icons/caret-square-left?s=solid'>example</a>
         */
        CARET_SQUARE_LEFT,
        /**
         * The solid caret-square-right icon.See <a href='https://fontawesome.com/v6/icons/caret-square-right?s=solid'>example</a>
         */
        CARET_SQUARE_RIGHT,
        /**
         * The solid caret-square-up icon.See <a href='https://fontawesome.com/v6/icons/caret-square-up?s=solid'>example</a>
         */
        CARET_SQUARE_UP,
        /**
         * The solid caret-up icon.See <a href='https://fontawesome.com/v6/icons/caret-up?s=solid'>example</a>
         */
        CARET_UP,
        /**
         * The solid carriage-baby icon.See <a href='https://fontawesome.com/v6/icons/carriage-baby?s=solid'>example</a>
         */
        CARRIAGE_BABY,
        /**
         * The solid carrot icon.See <a href='https://fontawesome.com/v6/icons/carrot?s=solid'>example</a>
         */
        CARROT,
        /**
         * The solid cart-arrow-down icon.See <a href='https://fontawesome.com/v6/icons/cart-arrow-down?s=solid'>example</a>
         */
        CART_ARROW_DOWN,
        /**
         * The solid cart-flatbed icon.See <a href='https://fontawesome.com/v6/icons/cart-flatbed?s=solid'>example</a>
         */
        CART_FLATBED,
        /**
         * The solid cart-flatbed-suitcase icon.See <a href='https://fontawesome.com/v6/icons/cart-flatbed-suitcase?s=solid'>example</a>
         */
        CART_FLATBED_SUITCASE,
        /**
         * The solid cart-plus icon.See <a href='https://fontawesome.com/v6/icons/cart-plus?s=solid'>example</a>
         */
        CART_PLUS,
        /**
         * The solid cart-shopping icon.See <a href='https://fontawesome.com/v6/icons/cart-shopping?s=solid'>example</a>
         */
        CART_SHOPPING,
        /**
         * The solid cash-register icon.See <a href='https://fontawesome.com/v6/icons/cash-register?s=solid'>example</a>
         */
        CASH_REGISTER,
        /**
         * The solid cat icon.See <a href='https://fontawesome.com/v6/icons/cat?s=solid'>example</a>
         */
        CAT,
        /**
         * The solid cedi-sign icon.See <a href='https://fontawesome.com/v6/icons/cedi-sign?s=solid'>example</a>
         */
        CEDI_SIGN,
        /**
         * The solid cent-sign icon.See <a href='https://fontawesome.com/v6/icons/cent-sign?s=solid'>example</a>
         */
        CENT_SIGN,
        /**
         * The solid certificate icon.See <a href='https://fontawesome.com/v6/icons/certificate?s=solid'>example</a>
         */
        CERTIFICATE,
        /**
         * The solid chain icon.See <a href='https://fontawesome.com/v6/icons/chain?s=solid'>example</a>
         */
        CHAIN,
        /**
         * The solid chain-broken icon.See <a href='https://fontawesome.com/v6/icons/chain-broken?s=solid'>example</a>
         */
        CHAIN_BROKEN,
        /**
         * The solid chain-slash icon.See <a href='https://fontawesome.com/v6/icons/chain-slash?s=solid'>example</a>
         */
        CHAIN_SLASH,
        /**
         * The solid chair icon.See <a href='https://fontawesome.com/v6/icons/chair?s=solid'>example</a>
         */
        CHAIR,
        /**
         * The solid chalkboard icon.See <a href='https://fontawesome.com/v6/icons/chalkboard?s=solid'>example</a>
         */
        CHALKBOARD,
        /**
         * The solid chalkboard-teacher icon.See <a href='https://fontawesome.com/v6/icons/chalkboard-teacher?s=solid'>example</a>
         */
        CHALKBOARD_TEACHER,
        /**
         * The solid chalkboard-user icon.See <a href='https://fontawesome.com/v6/icons/chalkboard-user?s=solid'>example</a>
         */
        CHALKBOARD_USER,
        /**
         * The solid champagne-glasses icon.See <a href='https://fontawesome.com/v6/icons/champagne-glasses?s=solid'>example</a>
         */
        CHAMPAGNE_GLASSES,
        /**
         * The solid charging-station icon.See <a href='https://fontawesome.com/v6/icons/charging-station?s=solid'>example</a>
         */
        CHARGING_STATION,
        /**
         * The solid chart-area icon.See <a href='https://fontawesome.com/v6/icons/chart-area?s=solid'>example</a>
         */
        CHART_AREA,
        /**
         * The solid chart-bar icon.See <a href='https://fontawesome.com/v6/icons/chart-bar?s=solid'>example</a>
         */
        CHART_BAR,
        /**
         * The solid chart-column icon.See <a href='https://fontawesome.com/v6/icons/chart-column?s=solid'>example</a>
         */
        CHART_COLUMN,
        /**
         * The solid chart-gantt icon.See <a href='https://fontawesome.com/v6/icons/chart-gantt?s=solid'>example</a>
         */
        CHART_GANTT,
        /**
         * The solid chart-line icon.See <a href='https://fontawesome.com/v6/icons/chart-line?s=solid'>example</a>
         */
        CHART_LINE,
        /**
         * The solid chart-pie icon.See <a href='https://fontawesome.com/v6/icons/chart-pie?s=solid'>example</a>
         */
        CHART_PIE,
        /**
         * The solid chart-simple icon.See <a href='https://fontawesome.com/v6/icons/chart-simple?s=solid'>example</a>
         */
        CHART_SIMPLE,
        /**
         * The solid check icon.See <a href='https://fontawesome.com/v6/icons/check?s=solid'>example</a>
         */
        CHECK,
        /**
         * The solid check-circle icon.See <a href='https://fontawesome.com/v6/icons/check-circle?s=solid'>example</a>
         */
        CHECK_CIRCLE,
        /**
         * The solid check-double icon.See <a href='https://fontawesome.com/v6/icons/check-double?s=solid'>example</a>
         */
        CHECK_DOUBLE,
        /**
         * The solid check-square icon.See <a href='https://fontawesome.com/v6/icons/check-square?s=solid'>example</a>
         */
        CHECK_SQUARE,
        /**
         * The solid check-to-slot icon.See <a href='https://fontawesome.com/v6/icons/check-to-slot?s=solid'>example</a>
         */
        CHECK_TO_SLOT,
        /**
         * The solid cheese icon.See <a href='https://fontawesome.com/v6/icons/cheese?s=solid'>example</a>
         */
        CHEESE,
        /**
         * The solid chess icon.See <a href='https://fontawesome.com/v6/icons/chess?s=solid'>example</a>
         */
        CHESS,
        /**
         * The solid chess-bishop icon.See <a href='https://fontawesome.com/v6/icons/chess-bishop?s=solid'>example</a>
         */
        CHESS_BISHOP,
        /**
         * The solid chess-board icon.See <a href='https://fontawesome.com/v6/icons/chess-board?s=solid'>example</a>
         */
        CHESS_BOARD,
        /**
         * The solid chess-king icon.See <a href='https://fontawesome.com/v6/icons/chess-king?s=solid'>example</a>
         */
        CHESS_KING,
        /**
         * The solid chess-knight icon.See <a href='https://fontawesome.com/v6/icons/chess-knight?s=solid'>example</a>
         */
        CHESS_KNIGHT,
        /**
         * The solid chess-pawn icon.See <a href='https://fontawesome.com/v6/icons/chess-pawn?s=solid'>example</a>
         */
        CHESS_PAWN,
        /**
         * The solid chess-queen icon.See <a href='https://fontawesome.com/v6/icons/chess-queen?s=solid'>example</a>
         */
        CHESS_QUEEN,
        /**
         * The solid chess-rook icon.See <a href='https://fontawesome.com/v6/icons/chess-rook?s=solid'>example</a>
         */
        CHESS_ROOK,
        /**
         * The solid chevron-circle-down icon.See <a href='https://fontawesome.com/v6/icons/chevron-circle-down?s=solid'>example</a>
         */
        CHEVRON_CIRCLE_DOWN,
        /**
         * The solid chevron-circle-left icon.See <a href='https://fontawesome.com/v6/icons/chevron-circle-left?s=solid'>example</a>
         */
        CHEVRON_CIRCLE_LEFT,
        /**
         * The solid chevron-circle-right icon.See <a href='https://fontawesome.com/v6/icons/chevron-circle-right?s=solid'>example</a>
         */
        CHEVRON_CIRCLE_RIGHT,
        /**
         * The solid chevron-circle-up icon.See <a href='https://fontawesome.com/v6/icons/chevron-circle-up?s=solid'>example</a>
         */
        CHEVRON_CIRCLE_UP,
        /**
         * The solid chevron-down icon.See <a href='https://fontawesome.com/v6/icons/chevron-down?s=solid'>example</a>
         */
        CHEVRON_DOWN,
        /**
         * The solid chevron-left icon.See <a href='https://fontawesome.com/v6/icons/chevron-left?s=solid'>example</a>
         */
        CHEVRON_LEFT,
        /**
         * The solid chevron-right icon.See <a href='https://fontawesome.com/v6/icons/chevron-right?s=solid'>example</a>
         */
        CHEVRON_RIGHT,
        /**
         * The solid chevron-up icon.See <a href='https://fontawesome.com/v6/icons/chevron-up?s=solid'>example</a>
         */
        CHEVRON_UP,
        /**
         * The solid child icon.See <a href='https://fontawesome.com/v6/icons/child?s=solid'>example</a>
         */
        CHILD,
        /**
         * The solid child-dress icon.See <a href='https://fontawesome.com/v6/icons/child-dress?s=solid'>example</a>
         */
        CHILD_DRESS,
        /**
         * The solid child-reaching icon.See <a href='https://fontawesome.com/v6/icons/child-reaching?s=solid'>example</a>
         */
        CHILD_REACHING,
        /**
         * The solid child-rifle icon.See <a href='https://fontawesome.com/v6/icons/child-rifle?s=solid'>example</a>
         */
        CHILD_RIFLE,
        /**
         * The solid children icon.See <a href='https://fontawesome.com/v6/icons/children?s=solid'>example</a>
         */
        CHILDREN,
        /**
         * The solid church icon.See <a href='https://fontawesome.com/v6/icons/church?s=solid'>example</a>
         */
        CHURCH,
        /**
         * The solid circle icon.See <a href='https://fontawesome.com/v6/icons/circle?s=solid'>example</a>
         */
        CIRCLE,
        /**
         * The solid circle-arrow-down icon.See <a href='https://fontawesome.com/v6/icons/circle-arrow-down?s=solid'>example</a>
         */
        CIRCLE_ARROW_DOWN,
        /**
         * The solid circle-arrow-left icon.See <a href='https://fontawesome.com/v6/icons/circle-arrow-left?s=solid'>example</a>
         */
        CIRCLE_ARROW_LEFT,
        /**
         * The solid circle-arrow-right icon.See <a href='https://fontawesome.com/v6/icons/circle-arrow-right?s=solid'>example</a>
         */
        CIRCLE_ARROW_RIGHT,
        /**
         * The solid circle-arrow-up icon.See <a href='https://fontawesome.com/v6/icons/circle-arrow-up?s=solid'>example</a>
         */
        CIRCLE_ARROW_UP,
        /**
         * The solid circle-check icon.See <a href='https://fontawesome.com/v6/icons/circle-check?s=solid'>example</a>
         */
        CIRCLE_CHECK,
        /**
         * The solid circle-chevron-down icon.See <a href='https://fontawesome.com/v6/icons/circle-chevron-down?s=solid'>example</a>
         */
        CIRCLE_CHEVRON_DOWN,
        /**
         * The solid circle-chevron-left icon.See <a href='https://fontawesome.com/v6/icons/circle-chevron-left?s=solid'>example</a>
         */
        CIRCLE_CHEVRON_LEFT,
        /**
         * The solid circle-chevron-right icon.See <a href='https://fontawesome.com/v6/icons/circle-chevron-right?s=solid'>example</a>
         */
        CIRCLE_CHEVRON_RIGHT,
        /**
         * The solid circle-chevron-up icon.See <a href='https://fontawesome.com/v6/icons/circle-chevron-up?s=solid'>example</a>
         */
        CIRCLE_CHEVRON_UP,
        /**
         * The solid circle-dollar-to-slot icon.See <a href='https://fontawesome.com/v6/icons/circle-dollar-to-slot?s=solid'>example</a>
         */
        CIRCLE_DOLLAR_TO_SLOT,
        /**
         * The solid circle-dot icon.See <a href='https://fontawesome.com/v6/icons/circle-dot?s=solid'>example</a>
         */
        CIRCLE_DOT,
        /**
         * The solid circle-down icon.See <a href='https://fontawesome.com/v6/icons/circle-down?s=solid'>example</a>
         */
        CIRCLE_DOWN,
        /**
         * The solid circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/circle-exclamation?s=solid'>example</a>
         */
        CIRCLE_EXCLAMATION,
        /**
         * The solid circle-h icon.See <a href='https://fontawesome.com/v6/icons/circle-h?s=solid'>example</a>
         */
        CIRCLE_H,
        /**
         * The solid circle-half-stroke icon.See <a href='https://fontawesome.com/v6/icons/circle-half-stroke?s=solid'>example</a>
         */
        CIRCLE_HALF_STROKE,
        /**
         * The solid circle-info icon.See <a href='https://fontawesome.com/v6/icons/circle-info?s=solid'>example</a>
         */
        CIRCLE_INFO,
        /**
         * The solid circle-left icon.See <a href='https://fontawesome.com/v6/icons/circle-left?s=solid'>example</a>
         */
        CIRCLE_LEFT,
        /**
         * The solid circle-minus icon.See <a href='https://fontawesome.com/v6/icons/circle-minus?s=solid'>example</a>
         */
        CIRCLE_MINUS,
        /**
         * The solid circle-nodes icon.See <a href='https://fontawesome.com/v6/icons/circle-nodes?s=solid'>example</a>
         */
        CIRCLE_NODES,
        /**
         * The solid circle-notch icon.See <a href='https://fontawesome.com/v6/icons/circle-notch?s=solid'>example</a>
         */
        CIRCLE_NOTCH,
        /**
         * The solid circle-pause icon.See <a href='https://fontawesome.com/v6/icons/circle-pause?s=solid'>example</a>
         */
        CIRCLE_PAUSE,
        /**
         * The solid circle-play icon.See <a href='https://fontawesome.com/v6/icons/circle-play?s=solid'>example</a>
         */
        CIRCLE_PLAY,
        /**
         * The solid circle-plus icon.See <a href='https://fontawesome.com/v6/icons/circle-plus?s=solid'>example</a>
         */
        CIRCLE_PLUS,
        /**
         * The solid circle-question icon.See <a href='https://fontawesome.com/v6/icons/circle-question?s=solid'>example</a>
         */
        CIRCLE_QUESTION,
        /**
         * The solid circle-radiation icon.See <a href='https://fontawesome.com/v6/icons/circle-radiation?s=solid'>example</a>
         */
        CIRCLE_RADIATION,
        /**
         * The solid circle-right icon.See <a href='https://fontawesome.com/v6/icons/circle-right?s=solid'>example</a>
         */
        CIRCLE_RIGHT,
        /**
         * The solid circle-stop icon.See <a href='https://fontawesome.com/v6/icons/circle-stop?s=solid'>example</a>
         */
        CIRCLE_STOP,
        /**
         * The solid circle-up icon.See <a href='https://fontawesome.com/v6/icons/circle-up?s=solid'>example</a>
         */
        CIRCLE_UP,
        /**
         * The solid circle-user icon.See <a href='https://fontawesome.com/v6/icons/circle-user?s=solid'>example</a>
         */
        CIRCLE_USER,
        /**
         * The solid circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/circle-xmark?s=solid'>example</a>
         */
        CIRCLE_XMARK,
        /**
         * The solid city icon.See <a href='https://fontawesome.com/v6/icons/city?s=solid'>example</a>
         */
        CITY,
        /**
         * The solid clapperboard icon.See <a href='https://fontawesome.com/v6/icons/clapperboard?s=solid'>example</a>
         */
        CLAPPERBOARD,
        /**
         * The solid clinic-medical icon.See <a href='https://fontawesome.com/v6/icons/clinic-medical?s=solid'>example</a>
         */
        CLINIC_MEDICAL,
        /**
         * The solid clipboard icon.See <a href='https://fontawesome.com/v6/icons/clipboard?s=solid'>example</a>
         */
        CLIPBOARD,
        /**
         * The solid clipboard-check icon.See <a href='https://fontawesome.com/v6/icons/clipboard-check?s=solid'>example</a>
         */
        CLIPBOARD_CHECK,
        /**
         * The solid clipboard-list icon.See <a href='https://fontawesome.com/v6/icons/clipboard-list?s=solid'>example</a>
         */
        CLIPBOARD_LIST,
        /**
         * The solid clipboard-question icon.See <a href='https://fontawesome.com/v6/icons/clipboard-question?s=solid'>example</a>
         */
        CLIPBOARD_QUESTION,
        /**
         * The solid clipboard-user icon.See <a href='https://fontawesome.com/v6/icons/clipboard-user?s=solid'>example</a>
         */
        CLIPBOARD_USER,
        /**
         * The solid clock icon.See <a href='https://fontawesome.com/v6/icons/clock?s=solid'>example</a>
         */
        CLOCK,
        /**
         * The solid clock-four icon.See <a href='https://fontawesome.com/v6/icons/clock-four?s=solid'>example</a>
         */
        CLOCK_FOUR,
        /**
         * The solid clock-rotate-left icon.See <a href='https://fontawesome.com/v6/icons/clock-rotate-left?s=solid'>example</a>
         */
        CLOCK_ROTATE_LEFT,
        /**
         * The solid clone icon.See <a href='https://fontawesome.com/v6/icons/clone?s=solid'>example</a>
         */
        CLONE,
        /**
         * The solid close icon.See <a href='https://fontawesome.com/v6/icons/close?s=solid'>example</a>
         */
        CLOSE,
        /**
         * The solid closed-captioning icon.See <a href='https://fontawesome.com/v6/icons/closed-captioning?s=solid'>example</a>
         */
        CLOSED_CAPTIONING,
        /**
         * The solid cloud icon.See <a href='https://fontawesome.com/v6/icons/cloud?s=solid'>example</a>
         */
        CLOUD,
        /**
         * The solid cloud-arrow-down icon.See <a href='https://fontawesome.com/v6/icons/cloud-arrow-down?s=solid'>example</a>
         */
        CLOUD_ARROW_DOWN,
        /**
         * The solid cloud-arrow-up icon.See <a href='https://fontawesome.com/v6/icons/cloud-arrow-up?s=solid'>example</a>
         */
        CLOUD_ARROW_UP,
        /**
         * The solid cloud-bolt icon.See <a href='https://fontawesome.com/v6/icons/cloud-bolt?s=solid'>example</a>
         */
        CLOUD_BOLT,
        /**
         * The solid cloud-download icon.See <a href='https://fontawesome.com/v6/icons/cloud-download?s=solid'>example</a>
         */
        CLOUD_DOWNLOAD,
        /**
         * The solid cloud-download-alt icon.See <a href='https://fontawesome.com/v6/icons/cloud-download-alt?s=solid'>example</a>
         */
        CLOUD_DOWNLOAD_ALT,
        /**
         * The solid cloud-meatball icon.See <a href='https://fontawesome.com/v6/icons/cloud-meatball?s=solid'>example</a>
         */
        CLOUD_MEATBALL,
        /**
         * The solid cloud-moon icon.See <a href='https://fontawesome.com/v6/icons/cloud-moon?s=solid'>example</a>
         */
        CLOUD_MOON,
        /**
         * The solid cloud-moon-rain icon.See <a href='https://fontawesome.com/v6/icons/cloud-moon-rain?s=solid'>example</a>
         */
        CLOUD_MOON_RAIN,
        /**
         * The solid cloud-rain icon.See <a href='https://fontawesome.com/v6/icons/cloud-rain?s=solid'>example</a>
         */
        CLOUD_RAIN,
        /**
         * The solid cloud-showers-heavy icon.See <a href='https://fontawesome.com/v6/icons/cloud-showers-heavy?s=solid'>example</a>
         */
        CLOUD_SHOWERS_HEAVY,
        /**
         * The solid cloud-showers-water icon.See <a href='https://fontawesome.com/v6/icons/cloud-showers-water?s=solid'>example</a>
         */
        CLOUD_SHOWERS_WATER,
        /**
         * The solid cloud-sun icon.See <a href='https://fontawesome.com/v6/icons/cloud-sun?s=solid'>example</a>
         */
        CLOUD_SUN,
        /**
         * The solid cloud-sun-rain icon.See <a href='https://fontawesome.com/v6/icons/cloud-sun-rain?s=solid'>example</a>
         */
        CLOUD_SUN_RAIN,
        /**
         * The solid cloud-upload icon.See <a href='https://fontawesome.com/v6/icons/cloud-upload?s=solid'>example</a>
         */
        CLOUD_UPLOAD,
        /**
         * The solid cloud-upload-alt icon.See <a href='https://fontawesome.com/v6/icons/cloud-upload-alt?s=solid'>example</a>
         */
        CLOUD_UPLOAD_ALT,
        /**
         * The solid clover icon.See <a href='https://fontawesome.com/v6/icons/clover?s=solid'>example</a>
         */
        CLOVER,
        /**
         * The solid cny icon.See <a href='https://fontawesome.com/v6/icons/cny?s=solid'>example</a>
         */
        CNY,
        /**
         * The solid cocktail icon.See <a href='https://fontawesome.com/v6/icons/cocktail?s=solid'>example</a>
         */
        COCKTAIL,
        /**
         * The solid code icon.See <a href='https://fontawesome.com/v6/icons/code?s=solid'>example</a>
         */
        CODE,
        /**
         * The solid code-branch icon.See <a href='https://fontawesome.com/v6/icons/code-branch?s=solid'>example</a>
         */
        CODE_BRANCH,
        /**
         * The solid code-commit icon.See <a href='https://fontawesome.com/v6/icons/code-commit?s=solid'>example</a>
         */
        CODE_COMMIT,
        /**
         * The solid code-compare icon.See <a href='https://fontawesome.com/v6/icons/code-compare?s=solid'>example</a>
         */
        CODE_COMPARE,
        /**
         * The solid code-fork icon.See <a href='https://fontawesome.com/v6/icons/code-fork?s=solid'>example</a>
         */
        CODE_FORK,
        /**
         * The solid code-merge icon.See <a href='https://fontawesome.com/v6/icons/code-merge?s=solid'>example</a>
         */
        CODE_MERGE,
        /**
         * The solid code-pull-request icon.See <a href='https://fontawesome.com/v6/icons/code-pull-request?s=solid'>example</a>
         */
        CODE_PULL_REQUEST,
        /**
         * The solid coffee icon.See <a href='https://fontawesome.com/v6/icons/coffee?s=solid'>example</a>
         */
        COFFEE,
        /**
         * The solid cog icon.See <a href='https://fontawesome.com/v6/icons/cog?s=solid'>example</a>
         */
        COG,
        /**
         * The solid cogs icon.See <a href='https://fontawesome.com/v6/icons/cogs?s=solid'>example</a>
         */
        COGS,
        /**
         * The solid coins icon.See <a href='https://fontawesome.com/v6/icons/coins?s=solid'>example</a>
         */
        COINS,
        /**
         * The solid colon-sign icon.See <a href='https://fontawesome.com/v6/icons/colon-sign?s=solid'>example</a>
         */
        COLON_SIGN,
        /**
         * The solid columns icon.See <a href='https://fontawesome.com/v6/icons/columns?s=solid'>example</a>
         */
        COLUMNS,
        /**
         * The solid comment icon.See <a href='https://fontawesome.com/v6/icons/comment?s=solid'>example</a>
         */
        COMMENT,
        /**
         * The solid comment-alt icon.See <a href='https://fontawesome.com/v6/icons/comment-alt?s=solid'>example</a>
         */
        COMMENT_ALT,
        /**
         * The solid comment-dollar icon.See <a href='https://fontawesome.com/v6/icons/comment-dollar?s=solid'>example</a>
         */
        COMMENT_DOLLAR,
        /**
         * The solid comment-dots icon.See <a href='https://fontawesome.com/v6/icons/comment-dots?s=solid'>example</a>
         */
        COMMENT_DOTS,
        /**
         * The solid comment-medical icon.See <a href='https://fontawesome.com/v6/icons/comment-medical?s=solid'>example</a>
         */
        COMMENT_MEDICAL,
        /**
         * The solid comment-slash icon.See <a href='https://fontawesome.com/v6/icons/comment-slash?s=solid'>example</a>
         */
        COMMENT_SLASH,
        /**
         * The solid comment-sms icon.See <a href='https://fontawesome.com/v6/icons/comment-sms?s=solid'>example</a>
         */
        COMMENT_SMS,
        /**
         * The solid commenting icon.See <a href='https://fontawesome.com/v6/icons/commenting?s=solid'>example</a>
         */
        COMMENTING,
        /**
         * The solid comments icon.See <a href='https://fontawesome.com/v6/icons/comments?s=solid'>example</a>
         */
        COMMENTS,
        /**
         * The solid comments-dollar icon.See <a href='https://fontawesome.com/v6/icons/comments-dollar?s=solid'>example</a>
         */
        COMMENTS_DOLLAR,
        /**
         * The solid compact-disc icon.See <a href='https://fontawesome.com/v6/icons/compact-disc?s=solid'>example</a>
         */
        COMPACT_DISC,
        /**
         * The solid compass icon.See <a href='https://fontawesome.com/v6/icons/compass?s=solid'>example</a>
         */
        COMPASS,
        /**
         * The solid compass-drafting icon.See <a href='https://fontawesome.com/v6/icons/compass-drafting?s=solid'>example</a>
         */
        COMPASS_DRAFTING,
        /**
         * The solid compress icon.See <a href='https://fontawesome.com/v6/icons/compress?s=solid'>example</a>
         */
        COMPRESS,
        /**
         * The solid compress-alt icon.See <a href='https://fontawesome.com/v6/icons/compress-alt?s=solid'>example</a>
         */
        COMPRESS_ALT,
        /**
         * The solid compress-arrows-alt icon.See <a href='https://fontawesome.com/v6/icons/compress-arrows-alt?s=solid'>example</a>
         */
        COMPRESS_ARROWS_ALT,
        /**
         * The solid computer icon.See <a href='https://fontawesome.com/v6/icons/computer?s=solid'>example</a>
         */
        COMPUTER,
        /**
         * The solid computer-mouse icon.See <a href='https://fontawesome.com/v6/icons/computer-mouse?s=solid'>example</a>
         */
        COMPUTER_MOUSE,
        /**
         * The solid concierge-bell icon.See <a href='https://fontawesome.com/v6/icons/concierge-bell?s=solid'>example</a>
         */
        CONCIERGE_BELL,
        /**
         * The solid contact-book icon.See <a href='https://fontawesome.com/v6/icons/contact-book?s=solid'>example</a>
         */
        CONTACT_BOOK,
        /**
         * The solid contact-card icon.See <a href='https://fontawesome.com/v6/icons/contact-card?s=solid'>example</a>
         */
        CONTACT_CARD,
        /**
         * The solid cookie icon.See <a href='https://fontawesome.com/v6/icons/cookie?s=solid'>example</a>
         */
        COOKIE,
        /**
         * The solid cookie-bite icon.See <a href='https://fontawesome.com/v6/icons/cookie-bite?s=solid'>example</a>
         */
        COOKIE_BITE,
        /**
         * The solid copy icon.See <a href='https://fontawesome.com/v6/icons/copy?s=solid'>example</a>
         */
        COPY,
        /**
         * The solid copyright icon.See <a href='https://fontawesome.com/v6/icons/copyright?s=solid'>example</a>
         */
        COPYRIGHT,
        /**
         * The solid couch icon.See <a href='https://fontawesome.com/v6/icons/couch?s=solid'>example</a>
         */
        COUCH,
        /**
         * The solid cow icon.See <a href='https://fontawesome.com/v6/icons/cow?s=solid'>example</a>
         */
        COW,
        /**
         * The solid credit-card icon.See <a href='https://fontawesome.com/v6/icons/credit-card?s=solid'>example</a>
         */
        CREDIT_CARD,
        /**
         * The solid credit-card-alt icon.See <a href='https://fontawesome.com/v6/icons/credit-card-alt?s=solid'>example</a>
         */
        CREDIT_CARD_ALT,
        /**
         * The solid crop icon.See <a href='https://fontawesome.com/v6/icons/crop?s=solid'>example</a>
         */
        CROP,
        /**
         * The solid crop-alt icon.See <a href='https://fontawesome.com/v6/icons/crop-alt?s=solid'>example</a>
         */
        CROP_ALT,
        /**
         * The solid crop-simple icon.See <a href='https://fontawesome.com/v6/icons/crop-simple?s=solid'>example</a>
         */
        CROP_SIMPLE,
        /**
         * The solid cross icon.See <a href='https://fontawesome.com/v6/icons/cross?s=solid'>example</a>
         */
        CROSS,
        /**
         * The solid crosshairs icon.See <a href='https://fontawesome.com/v6/icons/crosshairs?s=solid'>example</a>
         */
        CROSSHAIRS,
        /**
         * The solid crow icon.See <a href='https://fontawesome.com/v6/icons/crow?s=solid'>example</a>
         */
        CROW,
        /**
         * The solid crown icon.See <a href='https://fontawesome.com/v6/icons/crown?s=solid'>example</a>
         */
        CROWN,
        /**
         * The solid crutch icon.See <a href='https://fontawesome.com/v6/icons/crutch?s=solid'>example</a>
         */
        CRUTCH,
        /**
         * The solid cruzeiro-sign icon.See <a href='https://fontawesome.com/v6/icons/cruzeiro-sign?s=solid'>example</a>
         */
        CRUZEIRO_SIGN,
        /**
         * The solid cube icon.See <a href='https://fontawesome.com/v6/icons/cube?s=solid'>example</a>
         */
        CUBE,
        /**
         * The solid cubes icon.See <a href='https://fontawesome.com/v6/icons/cubes?s=solid'>example</a>
         */
        CUBES,
        /**
         * The solid cubes-stacked icon.See <a href='https://fontawesome.com/v6/icons/cubes-stacked?s=solid'>example</a>
         */
        CUBES_STACKED,
        /**
         * The solid cut icon.See <a href='https://fontawesome.com/v6/icons/cut?s=solid'>example</a>
         */
        CUT,
        /**
         * The solid cutlery icon.See <a href='https://fontawesome.com/v6/icons/cutlery?s=solid'>example</a>
         */
        CUTLERY,
        /**
         * The solid d icon.See <a href='https://fontawesome.com/v6/icons/d?s=solid'>example</a>
         */
        D,
        /**
         * The solid dashboard icon.See <a href='https://fontawesome.com/v6/icons/dashboard?s=solid'>example</a>
         */
        DASHBOARD,
        /**
         * The solid database icon.See <a href='https://fontawesome.com/v6/icons/database?s=solid'>example</a>
         */
        DATABASE,
        /**
         * The solid deaf icon.See <a href='https://fontawesome.com/v6/icons/deaf?s=solid'>example</a>
         */
        DEAF,
        /**
         * The solid deafness icon.See <a href='https://fontawesome.com/v6/icons/deafness?s=solid'>example</a>
         */
        DEAFNESS,
        /**
         * The solid dedent icon.See <a href='https://fontawesome.com/v6/icons/dedent?s=solid'>example</a>
         */
        DEDENT,
        /**
         * The solid delete-left icon.See <a href='https://fontawesome.com/v6/icons/delete-left?s=solid'>example</a>
         */
        DELETE_LEFT,
        /**
         * The solid democrat icon.See <a href='https://fontawesome.com/v6/icons/democrat?s=solid'>example</a>
         */
        DEMOCRAT,
        /**
         * The solid desktop icon.See <a href='https://fontawesome.com/v6/icons/desktop?s=solid'>example</a>
         */
        DESKTOP,
        /**
         * The solid desktop-alt icon.See <a href='https://fontawesome.com/v6/icons/desktop-alt?s=solid'>example</a>
         */
        DESKTOP_ALT,
        /**
         * The solid dharmachakra icon.See <a href='https://fontawesome.com/v6/icons/dharmachakra?s=solid'>example</a>
         */
        DHARMACHAKRA,
        /**
         * The solid diagnoses icon.See <a href='https://fontawesome.com/v6/icons/diagnoses?s=solid'>example</a>
         */
        DIAGNOSES,
        /**
         * The solid diagram-next icon.See <a href='https://fontawesome.com/v6/icons/diagram-next?s=solid'>example</a>
         */
        DIAGRAM_NEXT,
        /**
         * The solid diagram-predecessor icon.See <a href='https://fontawesome.com/v6/icons/diagram-predecessor?s=solid'>example</a>
         */
        DIAGRAM_PREDECESSOR,
        /**
         * The solid diagram-project icon.See <a href='https://fontawesome.com/v6/icons/diagram-project?s=solid'>example</a>
         */
        DIAGRAM_PROJECT,
        /**
         * The solid diagram-successor icon.See <a href='https://fontawesome.com/v6/icons/diagram-successor?s=solid'>example</a>
         */
        DIAGRAM_SUCCESSOR,
        /**
         * The solid diamond icon.See <a href='https://fontawesome.com/v6/icons/diamond?s=solid'>example</a>
         */
        DIAMOND,
        /**
         * The solid diamond-turn-right icon.See <a href='https://fontawesome.com/v6/icons/diamond-turn-right?s=solid'>example</a>
         */
        DIAMOND_TURN_RIGHT,
        /**
         * The solid dice icon.See <a href='https://fontawesome.com/v6/icons/dice?s=solid'>example</a>
         */
        DICE,
        /**
         * The solid dice-d20 icon.See <a href='https://fontawesome.com/v6/icons/dice-d20?s=solid'>example</a>
         */
        DICE_D20,
        /**
         * The solid dice-d6 icon.See <a href='https://fontawesome.com/v6/icons/dice-d6?s=solid'>example</a>
         */
        DICE_D6,
        /**
         * The solid dice-five icon.See <a href='https://fontawesome.com/v6/icons/dice-five?s=solid'>example</a>
         */
        DICE_FIVE,
        /**
         * The solid dice-four icon.See <a href='https://fontawesome.com/v6/icons/dice-four?s=solid'>example</a>
         */
        DICE_FOUR,
        /**
         * The solid dice-one icon.See <a href='https://fontawesome.com/v6/icons/dice-one?s=solid'>example</a>
         */
        DICE_ONE,
        /**
         * The solid dice-six icon.See <a href='https://fontawesome.com/v6/icons/dice-six?s=solid'>example</a>
         */
        DICE_SIX,
        /**
         * The solid dice-three icon.See <a href='https://fontawesome.com/v6/icons/dice-three?s=solid'>example</a>
         */
        DICE_THREE,
        /**
         * The solid dice-two icon.See <a href='https://fontawesome.com/v6/icons/dice-two?s=solid'>example</a>
         */
        DICE_TWO,
        /**
         * The solid digging icon.See <a href='https://fontawesome.com/v6/icons/digging?s=solid'>example</a>
         */
        DIGGING,
        /**
         * The solid digital-tachograph icon.See <a href='https://fontawesome.com/v6/icons/digital-tachograph?s=solid'>example</a>
         */
        DIGITAL_TACHOGRAPH,
        /**
         * The solid directions icon.See <a href='https://fontawesome.com/v6/icons/directions?s=solid'>example</a>
         */
        DIRECTIONS,
        /**
         * The solid disease icon.See <a href='https://fontawesome.com/v6/icons/disease?s=solid'>example</a>
         */
        DISEASE,
        /**
         * The solid display icon.See <a href='https://fontawesome.com/v6/icons/display?s=solid'>example</a>
         */
        DISPLAY,
        /**
         * The solid divide icon.See <a href='https://fontawesome.com/v6/icons/divide?s=solid'>example</a>
         */
        DIVIDE,
        /**
         * The solid dizzy icon.See <a href='https://fontawesome.com/v6/icons/dizzy?s=solid'>example</a>
         */
        DIZZY,
        /**
         * The solid dna icon.See <a href='https://fontawesome.com/v6/icons/dna?s=solid'>example</a>
         */
        DNA,
        /**
         * The solid dog icon.See <a href='https://fontawesome.com/v6/icons/dog?s=solid'>example</a>
         */
        DOG,
        /**
         * The solid dollar icon.See <a href='https://fontawesome.com/v6/icons/dollar?s=solid'>example</a>
         */
        DOLLAR,
        /**
         * The solid dollar-sign icon.See <a href='https://fontawesome.com/v6/icons/dollar-sign?s=solid'>example</a>
         */
        DOLLAR_SIGN,
        /**
         * The solid dolly icon.See <a href='https://fontawesome.com/v6/icons/dolly?s=solid'>example</a>
         */
        DOLLY,
        /**
         * The solid dolly-box icon.See <a href='https://fontawesome.com/v6/icons/dolly-box?s=solid'>example</a>
         */
        DOLLY_BOX,
        /**
         * The solid dolly-flatbed icon.See <a href='https://fontawesome.com/v6/icons/dolly-flatbed?s=solid'>example</a>
         */
        DOLLY_FLATBED,
        /**
         * The solid donate icon.See <a href='https://fontawesome.com/v6/icons/donate?s=solid'>example</a>
         */
        DONATE,
        /**
         * The solid dong-sign icon.See <a href='https://fontawesome.com/v6/icons/dong-sign?s=solid'>example</a>
         */
        DONG_SIGN,
        /**
         * The solid door-closed icon.See <a href='https://fontawesome.com/v6/icons/door-closed?s=solid'>example</a>
         */
        DOOR_CLOSED,
        /**
         * The solid door-open icon.See <a href='https://fontawesome.com/v6/icons/door-open?s=solid'>example</a>
         */
        DOOR_OPEN,
        /**
         * The solid dot-circle icon.See <a href='https://fontawesome.com/v6/icons/dot-circle?s=solid'>example</a>
         */
        DOT_CIRCLE,
        /**
         * The solid dove icon.See <a href='https://fontawesome.com/v6/icons/dove?s=solid'>example</a>
         */
        DOVE,
        /**
         * The solid down-left-and-up-right-to-center icon.See <a href='https://fontawesome.com/v6/icons/down-left-and-up-right-to-center?s=solid'>example</a>
         */
        DOWN_LEFT_AND_UP_RIGHT_TO_CENTER,
        /**
         * The solid down-long icon.See <a href='https://fontawesome.com/v6/icons/down-long?s=solid'>example</a>
         */
        DOWN_LONG,
        /**
         * The solid download icon.See <a href='https://fontawesome.com/v6/icons/download?s=solid'>example</a>
         */
        DOWNLOAD,
        /**
         * The solid drafting-compass icon.See <a href='https://fontawesome.com/v6/icons/drafting-compass?s=solid'>example</a>
         */
        DRAFTING_COMPASS,
        /**
         * The solid dragon icon.See <a href='https://fontawesome.com/v6/icons/dragon?s=solid'>example</a>
         */
        DRAGON,
        /**
         * The solid draw-polygon icon.See <a href='https://fontawesome.com/v6/icons/draw-polygon?s=solid'>example</a>
         */
        DRAW_POLYGON,
        /**
         * The solid drivers-license icon.See <a href='https://fontawesome.com/v6/icons/drivers-license?s=solid'>example</a>
         */
        DRIVERS_LICENSE,
        /**
         * The solid droplet icon.See <a href='https://fontawesome.com/v6/icons/droplet?s=solid'>example</a>
         */
        DROPLET,
        /**
         * The solid droplet-slash icon.See <a href='https://fontawesome.com/v6/icons/droplet-slash?s=solid'>example</a>
         */
        DROPLET_SLASH,
        /**
         * The solid drum icon.See <a href='https://fontawesome.com/v6/icons/drum?s=solid'>example</a>
         */
        DRUM,
        /**
         * The solid drum-steelpan icon.See <a href='https://fontawesome.com/v6/icons/drum-steelpan?s=solid'>example</a>
         */
        DRUM_STEELPAN,
        /**
         * The solid drumstick-bite icon.See <a href='https://fontawesome.com/v6/icons/drumstick-bite?s=solid'>example</a>
         */
        DRUMSTICK_BITE,
        /**
         * The solid dumbbell icon.See <a href='https://fontawesome.com/v6/icons/dumbbell?s=solid'>example</a>
         */
        DUMBBELL,
        /**
         * The solid dumpster icon.See <a href='https://fontawesome.com/v6/icons/dumpster?s=solid'>example</a>
         */
        DUMPSTER,
        /**
         * The solid dumpster-fire icon.See <a href='https://fontawesome.com/v6/icons/dumpster-fire?s=solid'>example</a>
         */
        DUMPSTER_FIRE,
        /**
         * The solid dungeon icon.See <a href='https://fontawesome.com/v6/icons/dungeon?s=solid'>example</a>
         */
        DUNGEON,
        /**
         * The solid e icon.See <a href='https://fontawesome.com/v6/icons/e?s=solid'>example</a>
         */
        E,
        /**
         * The solid ear-deaf icon.See <a href='https://fontawesome.com/v6/icons/ear-deaf?s=solid'>example</a>
         */
        EAR_DEAF,
        /**
         * The solid ear-listen icon.See <a href='https://fontawesome.com/v6/icons/ear-listen?s=solid'>example</a>
         */
        EAR_LISTEN,
        /**
         * The solid earth icon.See <a href='https://fontawesome.com/v6/icons/earth?s=solid'>example</a>
         */
        EARTH,
        /**
         * The solid earth-africa icon.See <a href='https://fontawesome.com/v6/icons/earth-africa?s=solid'>example</a>
         */
        EARTH_AFRICA,
        /**
         * The solid earth-america icon.See <a href='https://fontawesome.com/v6/icons/earth-america?s=solid'>example</a>
         */
        EARTH_AMERICA,
        /**
         * The solid earth-americas icon.See <a href='https://fontawesome.com/v6/icons/earth-americas?s=solid'>example</a>
         */
        EARTH_AMERICAS,
        /**
         * The solid earth-asia icon.See <a href='https://fontawesome.com/v6/icons/earth-asia?s=solid'>example</a>
         */
        EARTH_ASIA,
        /**
         * The solid earth-europe icon.See <a href='https://fontawesome.com/v6/icons/earth-europe?s=solid'>example</a>
         */
        EARTH_EUROPE,
        /**
         * The solid earth-oceania icon.See <a href='https://fontawesome.com/v6/icons/earth-oceania?s=solid'>example</a>
         */
        EARTH_OCEANIA,
        /**
         * The solid edit icon.See <a href='https://fontawesome.com/v6/icons/edit?s=solid'>example</a>
         */
        EDIT,
        /**
         * The solid egg icon.See <a href='https://fontawesome.com/v6/icons/egg?s=solid'>example</a>
         */
        EGG,
        /**
         * The solid eject icon.See <a href='https://fontawesome.com/v6/icons/eject?s=solid'>example</a>
         */
        EJECT,
        /**
         * The solid elevator icon.See <a href='https://fontawesome.com/v6/icons/elevator?s=solid'>example</a>
         */
        ELEVATOR,
        /**
         * The solid ellipsis icon.See <a href='https://fontawesome.com/v6/icons/ellipsis?s=solid'>example</a>
         */
        ELLIPSIS,
        /**
         * The solid ellipsis-h icon.See <a href='https://fontawesome.com/v6/icons/ellipsis-h?s=solid'>example</a>
         */
        ELLIPSIS_H,
        /**
         * The solid ellipsis-v icon.See <a href='https://fontawesome.com/v6/icons/ellipsis-v?s=solid'>example</a>
         */
        ELLIPSIS_V,
        /**
         * The solid ellipsis-vertical icon.See <a href='https://fontawesome.com/v6/icons/ellipsis-vertical?s=solid'>example</a>
         */
        ELLIPSIS_VERTICAL,
        /**
         * The solid envelope icon.See <a href='https://fontawesome.com/v6/icons/envelope?s=solid'>example</a>
         */
        ENVELOPE,
        /**
         * The solid envelope-circle-check icon.See <a href='https://fontawesome.com/v6/icons/envelope-circle-check?s=solid'>example</a>
         */
        ENVELOPE_CIRCLE_CHECK,
        /**
         * The solid envelope-open icon.See <a href='https://fontawesome.com/v6/icons/envelope-open?s=solid'>example</a>
         */
        ENVELOPE_OPEN,
        /**
         * The solid envelope-open-text icon.See <a href='https://fontawesome.com/v6/icons/envelope-open-text?s=solid'>example</a>
         */
        ENVELOPE_OPEN_TEXT,
        /**
         * The solid envelope-square icon.See <a href='https://fontawesome.com/v6/icons/envelope-square?s=solid'>example</a>
         */
        ENVELOPE_SQUARE,
        /**
         * The solid envelopes-bulk icon.See <a href='https://fontawesome.com/v6/icons/envelopes-bulk?s=solid'>example</a>
         */
        ENVELOPES_BULK,
        /**
         * The solid equals icon.See <a href='https://fontawesome.com/v6/icons/equals?s=solid'>example</a>
         */
        EQUALS,
        /**
         * The solid eraser icon.See <a href='https://fontawesome.com/v6/icons/eraser?s=solid'>example</a>
         */
        ERASER,
        /**
         * The solid ethernet icon.See <a href='https://fontawesome.com/v6/icons/ethernet?s=solid'>example</a>
         */
        ETHERNET,
        /**
         * The solid eur icon.See <a href='https://fontawesome.com/v6/icons/eur?s=solid'>example</a>
         */
        EUR,
        /**
         * The solid euro icon.See <a href='https://fontawesome.com/v6/icons/euro?s=solid'>example</a>
         */
        EURO,
        /**
         * The solid euro-sign icon.See <a href='https://fontawesome.com/v6/icons/euro-sign?s=solid'>example</a>
         */
        EURO_SIGN,
        /**
         * The solid exchange icon.See <a href='https://fontawesome.com/v6/icons/exchange?s=solid'>example</a>
         */
        EXCHANGE,
        /**
         * The solid exchange-alt icon.See <a href='https://fontawesome.com/v6/icons/exchange-alt?s=solid'>example</a>
         */
        EXCHANGE_ALT,
        /**
         * The solid exclamation icon.See <a href='https://fontawesome.com/v6/icons/exclamation?s=solid'>example</a>
         */
        EXCLAMATION,
        /**
         * The solid exclamation-circle icon.See <a href='https://fontawesome.com/v6/icons/exclamation-circle?s=solid'>example</a>
         */
        EXCLAMATION_CIRCLE,
        /**
         * The solid exclamation-triangle icon.See <a href='https://fontawesome.com/v6/icons/exclamation-triangle?s=solid'>example</a>
         */
        EXCLAMATION_TRIANGLE,
        /**
         * The solid expand icon.See <a href='https://fontawesome.com/v6/icons/expand?s=solid'>example</a>
         */
        EXPAND,
        /**
         * The solid expand-alt icon.See <a href='https://fontawesome.com/v6/icons/expand-alt?s=solid'>example</a>
         */
        EXPAND_ALT,
        /**
         * The solid expand-arrows-alt icon.See <a href='https://fontawesome.com/v6/icons/expand-arrows-alt?s=solid'>example</a>
         */
        EXPAND_ARROWS_ALT,
        /**
         * The solid explosion icon.See <a href='https://fontawesome.com/v6/icons/explosion?s=solid'>example</a>
         */
        EXPLOSION,
        /**
         * The solid external-link icon.See <a href='https://fontawesome.com/v6/icons/external-link?s=solid'>example</a>
         */
        EXTERNAL_LINK,
        /**
         * The solid external-link-alt icon.See <a href='https://fontawesome.com/v6/icons/external-link-alt?s=solid'>example</a>
         */
        EXTERNAL_LINK_ALT,
        /**
         * The solid external-link-square icon.See <a href='https://fontawesome.com/v6/icons/external-link-square?s=solid'>example</a>
         */
        EXTERNAL_LINK_SQUARE,
        /**
         * The solid external-link-square-alt icon.See <a href='https://fontawesome.com/v6/icons/external-link-square-alt?s=solid'>example</a>
         */
        EXTERNAL_LINK_SQUARE_ALT,
        /**
         * The solid eye icon.See <a href='https://fontawesome.com/v6/icons/eye?s=solid'>example</a>
         */
        EYE,
        /**
         * The solid eye-dropper icon.See <a href='https://fontawesome.com/v6/icons/eye-dropper?s=solid'>example</a>
         */
        EYE_DROPPER,
        /**
         * The solid eye-dropper-empty icon.See <a href='https://fontawesome.com/v6/icons/eye-dropper-empty?s=solid'>example</a>
         */
        EYE_DROPPER_EMPTY,
        /**
         * The solid eye-low-vision icon.See <a href='https://fontawesome.com/v6/icons/eye-low-vision?s=solid'>example</a>
         */
        EYE_LOW_VISION,
        /**
         * The solid eye-slash icon.See <a href='https://fontawesome.com/v6/icons/eye-slash?s=solid'>example</a>
         */
        EYE_SLASH,
        /**
         * The solid eyedropper icon.See <a href='https://fontawesome.com/v6/icons/eyedropper?s=solid'>example</a>
         */
        EYEDROPPER,
        /**
         * The solid f icon.See <a href='https://fontawesome.com/v6/icons/f?s=solid'>example</a>
         */
        F,
        /**
         * The solid face-angry icon.See <a href='https://fontawesome.com/v6/icons/face-angry?s=solid'>example</a>
         */
        FACE_ANGRY,
        /**
         * The solid face-dizzy icon.See <a href='https://fontawesome.com/v6/icons/face-dizzy?s=solid'>example</a>
         */
        FACE_DIZZY,
        /**
         * The solid face-flushed icon.See <a href='https://fontawesome.com/v6/icons/face-flushed?s=solid'>example</a>
         */
        FACE_FLUSHED,
        /**
         * The solid face-frown icon.See <a href='https://fontawesome.com/v6/icons/face-frown?s=solid'>example</a>
         */
        FACE_FROWN,
        /**
         * The solid face-frown-open icon.See <a href='https://fontawesome.com/v6/icons/face-frown-open?s=solid'>example</a>
         */
        FACE_FROWN_OPEN,
        /**
         * The solid face-grimace icon.See <a href='https://fontawesome.com/v6/icons/face-grimace?s=solid'>example</a>
         */
        FACE_GRIMACE,
        /**
         * The solid face-grin icon.See <a href='https://fontawesome.com/v6/icons/face-grin?s=solid'>example</a>
         */
        FACE_GRIN,
        /**
         * The solid face-grin-beam icon.See <a href='https://fontawesome.com/v6/icons/face-grin-beam?s=solid'>example</a>
         */
        FACE_GRIN_BEAM,
        /**
         * The solid face-grin-beam-sweat icon.See <a href='https://fontawesome.com/v6/icons/face-grin-beam-sweat?s=solid'>example</a>
         */
        FACE_GRIN_BEAM_SWEAT,
        /**
         * The solid face-grin-hearts icon.See <a href='https://fontawesome.com/v6/icons/face-grin-hearts?s=solid'>example</a>
         */
        FACE_GRIN_HEARTS,
        /**
         * The solid face-grin-squint icon.See <a href='https://fontawesome.com/v6/icons/face-grin-squint?s=solid'>example</a>
         */
        FACE_GRIN_SQUINT,
        /**
         * The solid face-grin-squint-tears icon.See <a href='https://fontawesome.com/v6/icons/face-grin-squint-tears?s=solid'>example</a>
         */
        FACE_GRIN_SQUINT_TEARS,
        /**
         * The solid face-grin-stars icon.See <a href='https://fontawesome.com/v6/icons/face-grin-stars?s=solid'>example</a>
         */
        FACE_GRIN_STARS,
        /**
         * The solid face-grin-tears icon.See <a href='https://fontawesome.com/v6/icons/face-grin-tears?s=solid'>example</a>
         */
        FACE_GRIN_TEARS,
        /**
         * The solid face-grin-tongue icon.See <a href='https://fontawesome.com/v6/icons/face-grin-tongue?s=solid'>example</a>
         */
        FACE_GRIN_TONGUE,
        /**
         * The solid face-grin-tongue-squint icon.See <a href='https://fontawesome.com/v6/icons/face-grin-tongue-squint?s=solid'>example</a>
         */
        FACE_GRIN_TONGUE_SQUINT,
        /**
         * The solid face-grin-tongue-wink icon.See <a href='https://fontawesome.com/v6/icons/face-grin-tongue-wink?s=solid'>example</a>
         */
        FACE_GRIN_TONGUE_WINK,
        /**
         * The solid face-grin-wide icon.See <a href='https://fontawesome.com/v6/icons/face-grin-wide?s=solid'>example</a>
         */
        FACE_GRIN_WIDE,
        /**
         * The solid face-grin-wink icon.See <a href='https://fontawesome.com/v6/icons/face-grin-wink?s=solid'>example</a>
         */
        FACE_GRIN_WINK,
        /**
         * The solid face-kiss icon.See <a href='https://fontawesome.com/v6/icons/face-kiss?s=solid'>example</a>
         */
        FACE_KISS,
        /**
         * The solid face-kiss-beam icon.See <a href='https://fontawesome.com/v6/icons/face-kiss-beam?s=solid'>example</a>
         */
        FACE_KISS_BEAM,
        /**
         * The solid face-kiss-wink-heart icon.See <a href='https://fontawesome.com/v6/icons/face-kiss-wink-heart?s=solid'>example</a>
         */
        FACE_KISS_WINK_HEART,
        /**
         * The solid face-laugh icon.See <a href='https://fontawesome.com/v6/icons/face-laugh?s=solid'>example</a>
         */
        FACE_LAUGH,
        /**
         * The solid face-laugh-beam icon.See <a href='https://fontawesome.com/v6/icons/face-laugh-beam?s=solid'>example</a>
         */
        FACE_LAUGH_BEAM,
        /**
         * The solid face-laugh-squint icon.See <a href='https://fontawesome.com/v6/icons/face-laugh-squint?s=solid'>example</a>
         */
        FACE_LAUGH_SQUINT,
        /**
         * The solid face-laugh-wink icon.See <a href='https://fontawesome.com/v6/icons/face-laugh-wink?s=solid'>example</a>
         */
        FACE_LAUGH_WINK,
        /**
         * The solid face-meh icon.See <a href='https://fontawesome.com/v6/icons/face-meh?s=solid'>example</a>
         */
        FACE_MEH,
        /**
         * The solid face-meh-blank icon.See <a href='https://fontawesome.com/v6/icons/face-meh-blank?s=solid'>example</a>
         */
        FACE_MEH_BLANK,
        /**
         * The solid face-rolling-eyes icon.See <a href='https://fontawesome.com/v6/icons/face-rolling-eyes?s=solid'>example</a>
         */
        FACE_ROLLING_EYES,
        /**
         * The solid face-sad-cry icon.See <a href='https://fontawesome.com/v6/icons/face-sad-cry?s=solid'>example</a>
         */
        FACE_SAD_CRY,
        /**
         * The solid face-sad-tear icon.See <a href='https://fontawesome.com/v6/icons/face-sad-tear?s=solid'>example</a>
         */
        FACE_SAD_TEAR,
        /**
         * The solid face-smile icon.See <a href='https://fontawesome.com/v6/icons/face-smile?s=solid'>example</a>
         */
        FACE_SMILE,
        /**
         * The solid face-smile-beam icon.See <a href='https://fontawesome.com/v6/icons/face-smile-beam?s=solid'>example</a>
         */
        FACE_SMILE_BEAM,
        /**
         * The solid face-smile-wink icon.See <a href='https://fontawesome.com/v6/icons/face-smile-wink?s=solid'>example</a>
         */
        FACE_SMILE_WINK,
        /**
         * The solid face-surprise icon.See <a href='https://fontawesome.com/v6/icons/face-surprise?s=solid'>example</a>
         */
        FACE_SURPRISE,
        /**
         * The solid face-tired icon.See <a href='https://fontawesome.com/v6/icons/face-tired?s=solid'>example</a>
         */
        FACE_TIRED,
        /**
         * The solid fan icon.See <a href='https://fontawesome.com/v6/icons/fan?s=solid'>example</a>
         */
        FAN,
        /**
         * The solid fast-backward icon.See <a href='https://fontawesome.com/v6/icons/fast-backward?s=solid'>example</a>
         */
        FAST_BACKWARD,
        /**
         * The solid fast-forward icon.See <a href='https://fontawesome.com/v6/icons/fast-forward?s=solid'>example</a>
         */
        FAST_FORWARD,
        /**
         * The solid faucet icon.See <a href='https://fontawesome.com/v6/icons/faucet?s=solid'>example</a>
         */
        FAUCET,
        /**
         * The solid faucet-drip icon.See <a href='https://fontawesome.com/v6/icons/faucet-drip?s=solid'>example</a>
         */
        FAUCET_DRIP,
        /**
         * The solid fax icon.See <a href='https://fontawesome.com/v6/icons/fax?s=solid'>example</a>
         */
        FAX,
        /**
         * The solid feather icon.See <a href='https://fontawesome.com/v6/icons/feather?s=solid'>example</a>
         */
        FEATHER,
        /**
         * The solid feather-alt icon.See <a href='https://fontawesome.com/v6/icons/feather-alt?s=solid'>example</a>
         */
        FEATHER_ALT,
        /**
         * The solid feather-pointed icon.See <a href='https://fontawesome.com/v6/icons/feather-pointed?s=solid'>example</a>
         */
        FEATHER_POINTED,
        /**
         * The solid feed icon.See <a href='https://fontawesome.com/v6/icons/feed?s=solid'>example</a>
         */
        FEED,
        /**
         * The solid female icon.See <a href='https://fontawesome.com/v6/icons/female?s=solid'>example</a>
         */
        FEMALE,
        /**
         * The solid ferry icon.See <a href='https://fontawesome.com/v6/icons/ferry?s=solid'>example</a>
         */
        FERRY,
        /**
         * The solid fighter-jet icon.See <a href='https://fontawesome.com/v6/icons/fighter-jet?s=solid'>example</a>
         */
        FIGHTER_JET,
        /**
         * The solid file icon.See <a href='https://fontawesome.com/v6/icons/file?s=solid'>example</a>
         */
        FILE,
        /**
         * The solid file-alt icon.See <a href='https://fontawesome.com/v6/icons/file-alt?s=solid'>example</a>
         */
        FILE_ALT,
        /**
         * The solid file-archive icon.See <a href='https://fontawesome.com/v6/icons/file-archive?s=solid'>example</a>
         */
        FILE_ARCHIVE,
        /**
         * The solid file-arrow-down icon.See <a href='https://fontawesome.com/v6/icons/file-arrow-down?s=solid'>example</a>
         */
        FILE_ARROW_DOWN,
        /**
         * The solid file-arrow-up icon.See <a href='https://fontawesome.com/v6/icons/file-arrow-up?s=solid'>example</a>
         */
        FILE_ARROW_UP,
        /**
         * The solid file-audio icon.See <a href='https://fontawesome.com/v6/icons/file-audio?s=solid'>example</a>
         */
        FILE_AUDIO,
        /**
         * The solid file-circle-check icon.See <a href='https://fontawesome.com/v6/icons/file-circle-check?s=solid'>example</a>
         */
        FILE_CIRCLE_CHECK,
        /**
         * The solid file-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/file-circle-exclamation?s=solid'>example</a>
         */
        FILE_CIRCLE_EXCLAMATION,
        /**
         * The solid file-circle-minus icon.See <a href='https://fontawesome.com/v6/icons/file-circle-minus?s=solid'>example</a>
         */
        FILE_CIRCLE_MINUS,
        /**
         * The solid file-circle-plus icon.See <a href='https://fontawesome.com/v6/icons/file-circle-plus?s=solid'>example</a>
         */
        FILE_CIRCLE_PLUS,
        /**
         * The solid file-circle-question icon.See <a href='https://fontawesome.com/v6/icons/file-circle-question?s=solid'>example</a>
         */
        FILE_CIRCLE_QUESTION,
        /**
         * The solid file-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/file-circle-xmark?s=solid'>example</a>
         */
        FILE_CIRCLE_XMARK,
        /**
         * The solid file-clipboard icon.See <a href='https://fontawesome.com/v6/icons/file-clipboard?s=solid'>example</a>
         */
        FILE_CLIPBOARD,
        /**
         * The solid file-code icon.See <a href='https://fontawesome.com/v6/icons/file-code?s=solid'>example</a>
         */
        FILE_CODE,
        /**
         * The solid file-contract icon.See <a href='https://fontawesome.com/v6/icons/file-contract?s=solid'>example</a>
         */
        FILE_CONTRACT,
        /**
         * The solid file-csv icon.See <a href='https://fontawesome.com/v6/icons/file-csv?s=solid'>example</a>
         */
        FILE_CSV,
        /**
         * The solid file-download icon.See <a href='https://fontawesome.com/v6/icons/file-download?s=solid'>example</a>
         */
        FILE_DOWNLOAD,
        /**
         * The solid file-edit icon.See <a href='https://fontawesome.com/v6/icons/file-edit?s=solid'>example</a>
         */
        FILE_EDIT,
        /**
         * The solid file-excel icon.See <a href='https://fontawesome.com/v6/icons/file-excel?s=solid'>example</a>
         */
        FILE_EXCEL,
        /**
         * The solid file-export icon.See <a href='https://fontawesome.com/v6/icons/file-export?s=solid'>example</a>
         */
        FILE_EXPORT,
        /**
         * The solid file-image icon.See <a href='https://fontawesome.com/v6/icons/file-image?s=solid'>example</a>
         */
        FILE_IMAGE,
        /**
         * The solid file-import icon.See <a href='https://fontawesome.com/v6/icons/file-import?s=solid'>example</a>
         */
        FILE_IMPORT,
        /**
         * The solid file-invoice icon.See <a href='https://fontawesome.com/v6/icons/file-invoice?s=solid'>example</a>
         */
        FILE_INVOICE,
        /**
         * The solid file-invoice-dollar icon.See <a href='https://fontawesome.com/v6/icons/file-invoice-dollar?s=solid'>example</a>
         */
        FILE_INVOICE_DOLLAR,
        /**
         * The solid file-lines icon.See <a href='https://fontawesome.com/v6/icons/file-lines?s=solid'>example</a>
         */
        FILE_LINES,
        /**
         * The solid file-medical icon.See <a href='https://fontawesome.com/v6/icons/file-medical?s=solid'>example</a>
         */
        FILE_MEDICAL,
        /**
         * The solid file-medical-alt icon.See <a href='https://fontawesome.com/v6/icons/file-medical-alt?s=solid'>example</a>
         */
        FILE_MEDICAL_ALT,
        /**
         * The solid file-pdf icon.See <a href='https://fontawesome.com/v6/icons/file-pdf?s=solid'>example</a>
         */
        FILE_PDF,
        /**
         * The solid file-pen icon.See <a href='https://fontawesome.com/v6/icons/file-pen?s=solid'>example</a>
         */
        FILE_PEN,
        /**
         * The solid file-powerpoint icon.See <a href='https://fontawesome.com/v6/icons/file-powerpoint?s=solid'>example</a>
         */
        FILE_POWERPOINT,
        /**
         * The solid file-prescription icon.See <a href='https://fontawesome.com/v6/icons/file-prescription?s=solid'>example</a>
         */
        FILE_PRESCRIPTION,
        /**
         * The solid file-shield icon.See <a href='https://fontawesome.com/v6/icons/file-shield?s=solid'>example</a>
         */
        FILE_SHIELD,
        /**
         * The solid file-signature icon.See <a href='https://fontawesome.com/v6/icons/file-signature?s=solid'>example</a>
         */
        FILE_SIGNATURE,
        /**
         * The solid file-text icon.See <a href='https://fontawesome.com/v6/icons/file-text?s=solid'>example</a>
         */
        FILE_TEXT,
        /**
         * The solid file-upload icon.See <a href='https://fontawesome.com/v6/icons/file-upload?s=solid'>example</a>
         */
        FILE_UPLOAD,
        /**
         * The solid file-video icon.See <a href='https://fontawesome.com/v6/icons/file-video?s=solid'>example</a>
         */
        FILE_VIDEO,
        /**
         * The solid file-waveform icon.See <a href='https://fontawesome.com/v6/icons/file-waveform?s=solid'>example</a>
         */
        FILE_WAVEFORM,
        /**
         * The solid file-word icon.See <a href='https://fontawesome.com/v6/icons/file-word?s=solid'>example</a>
         */
        FILE_WORD,
        /**
         * The solid file-zipper icon.See <a href='https://fontawesome.com/v6/icons/file-zipper?s=solid'>example</a>
         */
        FILE_ZIPPER,
        /**
         * The solid fill icon.See <a href='https://fontawesome.com/v6/icons/fill?s=solid'>example</a>
         */
        FILL,
        /**
         * The solid fill-drip icon.See <a href='https://fontawesome.com/v6/icons/fill-drip?s=solid'>example</a>
         */
        FILL_DRIP,
        /**
         * The solid film icon.See <a href='https://fontawesome.com/v6/icons/film?s=solid'>example</a>
         */
        FILM,
        /**
         * The solid filter icon.See <a href='https://fontawesome.com/v6/icons/filter?s=solid'>example</a>
         */
        FILTER,
        /**
         * The solid filter-circle-dollar icon.See <a href='https://fontawesome.com/v6/icons/filter-circle-dollar?s=solid'>example</a>
         */
        FILTER_CIRCLE_DOLLAR,
        /**
         * The solid filter-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/filter-circle-xmark?s=solid'>example</a>
         */
        FILTER_CIRCLE_XMARK,
        /**
         * The solid fingerprint icon.See <a href='https://fontawesome.com/v6/icons/fingerprint?s=solid'>example</a>
         */
        FINGERPRINT,
        /**
         * The solid fire icon.See <a href='https://fontawesome.com/v6/icons/fire?s=solid'>example</a>
         */
        FIRE,
        /**
         * The solid fire-alt icon.See <a href='https://fontawesome.com/v6/icons/fire-alt?s=solid'>example</a>
         */
        FIRE_ALT,
        /**
         * The solid fire-burner icon.See <a href='https://fontawesome.com/v6/icons/fire-burner?s=solid'>example</a>
         */
        FIRE_BURNER,
        /**
         * The solid fire-extinguisher icon.See <a href='https://fontawesome.com/v6/icons/fire-extinguisher?s=solid'>example</a>
         */
        FIRE_EXTINGUISHER,
        /**
         * The solid fire-flame-curved icon.See <a href='https://fontawesome.com/v6/icons/fire-flame-curved?s=solid'>example</a>
         */
        FIRE_FLAME_CURVED,
        /**
         * The solid fire-flame-simple icon.See <a href='https://fontawesome.com/v6/icons/fire-flame-simple?s=solid'>example</a>
         */
        FIRE_FLAME_SIMPLE,
        /**
         * The solid first-aid icon.See <a href='https://fontawesome.com/v6/icons/first-aid?s=solid'>example</a>
         */
        FIRST_AID,
        /**
         * The solid fish icon.See <a href='https://fontawesome.com/v6/icons/fish?s=solid'>example</a>
         */
        FISH,
        /**
         * The solid fish-fins icon.See <a href='https://fontawesome.com/v6/icons/fish-fins?s=solid'>example</a>
         */
        FISH_FINS,
        /**
         * The solid fist-raised icon.See <a href='https://fontawesome.com/v6/icons/fist-raised?s=solid'>example</a>
         */
        FIST_RAISED,
        /**
         * The solid flag icon.See <a href='https://fontawesome.com/v6/icons/flag?s=solid'>example</a>
         */
        FLAG,
        /**
         * The solid flag-checkered icon.See <a href='https://fontawesome.com/v6/icons/flag-checkered?s=solid'>example</a>
         */
        FLAG_CHECKERED,
        /**
         * The solid flag-usa icon.See <a href='https://fontawesome.com/v6/icons/flag-usa?s=solid'>example</a>
         */
        FLAG_USA,
        /**
         * The solid flask icon.See <a href='https://fontawesome.com/v6/icons/flask?s=solid'>example</a>
         */
        FLASK,
        /**
         * The solid flask-vial icon.See <a href='https://fontawesome.com/v6/icons/flask-vial?s=solid'>example</a>
         */
        FLASK_VIAL,
        /**
         * The solid floppy-disk icon.See <a href='https://fontawesome.com/v6/icons/floppy-disk?s=solid'>example</a>
         */
        FLOPPY_DISK,
        /**
         * The solid florin-sign icon.See <a href='https://fontawesome.com/v6/icons/florin-sign?s=solid'>example</a>
         */
        FLORIN_SIGN,
        /**
         * The solid flushed icon.See <a href='https://fontawesome.com/v6/icons/flushed?s=solid'>example</a>
         */
        FLUSHED,
        /**
         * The solid folder icon.See <a href='https://fontawesome.com/v6/icons/folder?s=solid'>example</a>
         */
        FOLDER,
        /**
         * The solid folder-blank icon.See <a href='https://fontawesome.com/v6/icons/folder-blank?s=solid'>example</a>
         */
        FOLDER_BLANK,
        /**
         * The solid folder-closed icon.See <a href='https://fontawesome.com/v6/icons/folder-closed?s=solid'>example</a>
         */
        FOLDER_CLOSED,
        /**
         * The solid folder-minus icon.See <a href='https://fontawesome.com/v6/icons/folder-minus?s=solid'>example</a>
         */
        FOLDER_MINUS,
        /**
         * The solid folder-open icon.See <a href='https://fontawesome.com/v6/icons/folder-open?s=solid'>example</a>
         */
        FOLDER_OPEN,
        /**
         * The solid folder-plus icon.See <a href='https://fontawesome.com/v6/icons/folder-plus?s=solid'>example</a>
         */
        FOLDER_PLUS,
        /**
         * The solid folder-tree icon.See <a href='https://fontawesome.com/v6/icons/folder-tree?s=solid'>example</a>
         */
        FOLDER_TREE,
        /**
         * The solid font icon.See <a href='https://fontawesome.com/v6/icons/font?s=solid'>example</a>
         */
        FONT,
        /**
         * The solid font-awesome icon.See <a href='https://fontawesome.com/v6/icons/font-awesome?s=solid'>example</a>
         */
        FONT_AWESOME,
        /**
         * The solid font-awesome-flag icon.See <a href='https://fontawesome.com/v6/icons/font-awesome-flag?s=solid'>example</a>
         */
        FONT_AWESOME_FLAG,
        /**
         * The solid font-awesome-logo-full icon.See <a href='https://fontawesome.com/v6/icons/font-awesome-logo-full?s=solid'>example</a>
         */
        FONT_AWESOME_LOGO_FULL,
        /**
         * The solid football icon.See <a href='https://fontawesome.com/v6/icons/football?s=solid'>example</a>
         */
        FOOTBALL,
        /**
         * The solid football-ball icon.See <a href='https://fontawesome.com/v6/icons/football-ball?s=solid'>example</a>
         */
        FOOTBALL_BALL,
        /**
         * The solid forward icon.See <a href='https://fontawesome.com/v6/icons/forward?s=solid'>example</a>
         */
        FORWARD,
        /**
         * The solid forward-fast icon.See <a href='https://fontawesome.com/v6/icons/forward-fast?s=solid'>example</a>
         */
        FORWARD_FAST,
        /**
         * The solid forward-step icon.See <a href='https://fontawesome.com/v6/icons/forward-step?s=solid'>example</a>
         */
        FORWARD_STEP,
        /**
         * The solid franc-sign icon.See <a href='https://fontawesome.com/v6/icons/franc-sign?s=solid'>example</a>
         */
        FRANC_SIGN,
        /**
         * The solid frog icon.See <a href='https://fontawesome.com/v6/icons/frog?s=solid'>example</a>
         */
        FROG,
        /**
         * The solid frown icon.See <a href='https://fontawesome.com/v6/icons/frown?s=solid'>example</a>
         */
        FROWN,
        /**
         * The solid frown-open icon.See <a href='https://fontawesome.com/v6/icons/frown-open?s=solid'>example</a>
         */
        FROWN_OPEN,
        /**
         * The solid funnel-dollar icon.See <a href='https://fontawesome.com/v6/icons/funnel-dollar?s=solid'>example</a>
         */
        FUNNEL_DOLLAR,
        /**
         * The solid futbol icon.See <a href='https://fontawesome.com/v6/icons/futbol?s=solid'>example</a>
         */
        FUTBOL,
        /**
         * The solid futbol-ball icon.See <a href='https://fontawesome.com/v6/icons/futbol-ball?s=solid'>example</a>
         */
        FUTBOL_BALL,
        /**
         * The solid g icon.See <a href='https://fontawesome.com/v6/icons/g?s=solid'>example</a>
         */
        G,
        /**
         * The solid gamepad icon.See <a href='https://fontawesome.com/v6/icons/gamepad?s=solid'>example</a>
         */
        GAMEPAD,
        /**
         * The solid gas-pump icon.See <a href='https://fontawesome.com/v6/icons/gas-pump?s=solid'>example</a>
         */
        GAS_PUMP,
        /**
         * The solid gauge icon.See <a href='https://fontawesome.com/v6/icons/gauge?s=solid'>example</a>
         */
        GAUGE,
        /**
         * The solid gauge-high icon.See <a href='https://fontawesome.com/v6/icons/gauge-high?s=solid'>example</a>
         */
        GAUGE_HIGH,
        /**
         * The solid gauge-med icon.See <a href='https://fontawesome.com/v6/icons/gauge-med?s=solid'>example</a>
         */
        GAUGE_MED,
        /**
         * The solid gauge-simple icon.See <a href='https://fontawesome.com/v6/icons/gauge-simple?s=solid'>example</a>
         */
        GAUGE_SIMPLE,
        /**
         * The solid gauge-simple-high icon.See <a href='https://fontawesome.com/v6/icons/gauge-simple-high?s=solid'>example</a>
         */
        GAUGE_SIMPLE_HIGH,
        /**
         * The solid gauge-simple-med icon.See <a href='https://fontawesome.com/v6/icons/gauge-simple-med?s=solid'>example</a>
         */
        GAUGE_SIMPLE_MED,
        /**
         * The solid gavel icon.See <a href='https://fontawesome.com/v6/icons/gavel?s=solid'>example</a>
         */
        GAVEL,
        /**
         * The solid gbp icon.See <a href='https://fontawesome.com/v6/icons/gbp?s=solid'>example</a>
         */
        GBP,
        /**
         * The solid gear icon.See <a href='https://fontawesome.com/v6/icons/gear?s=solid'>example</a>
         */
        GEAR,
        /**
         * The solid gears icon.See <a href='https://fontawesome.com/v6/icons/gears?s=solid'>example</a>
         */
        GEARS,
        /**
         * The solid gem icon.See <a href='https://fontawesome.com/v6/icons/gem?s=solid'>example</a>
         */
        GEM,
        /**
         * The solid genderless icon.See <a href='https://fontawesome.com/v6/icons/genderless?s=solid'>example</a>
         */
        GENDERLESS,
        /**
         * The solid ghost icon.See <a href='https://fontawesome.com/v6/icons/ghost?s=solid'>example</a>
         */
        GHOST,
        /**
         * The solid gift icon.See <a href='https://fontawesome.com/v6/icons/gift?s=solid'>example</a>
         */
        GIFT,
        /**
         * The solid gifts icon.See <a href='https://fontawesome.com/v6/icons/gifts?s=solid'>example</a>
         */
        GIFTS,
        /**
         * The solid glass-cheers icon.See <a href='https://fontawesome.com/v6/icons/glass-cheers?s=solid'>example</a>
         */
        GLASS_CHEERS,
        /**
         * The solid glass-martini icon.See <a href='https://fontawesome.com/v6/icons/glass-martini?s=solid'>example</a>
         */
        GLASS_MARTINI,
        /**
         * The solid glass-martini-alt icon.See <a href='https://fontawesome.com/v6/icons/glass-martini-alt?s=solid'>example</a>
         */
        GLASS_MARTINI_ALT,
        /**
         * The solid glass-water icon.See <a href='https://fontawesome.com/v6/icons/glass-water?s=solid'>example</a>
         */
        GLASS_WATER,
        /**
         * The solid glass-water-droplet icon.See <a href='https://fontawesome.com/v6/icons/glass-water-droplet?s=solid'>example</a>
         */
        GLASS_WATER_DROPLET,
        /**
         * The solid glass-whiskey icon.See <a href='https://fontawesome.com/v6/icons/glass-whiskey?s=solid'>example</a>
         */
        GLASS_WHISKEY,
        /**
         * The solid glasses icon.See <a href='https://fontawesome.com/v6/icons/glasses?s=solid'>example</a>
         */
        GLASSES,
        /**
         * The solid globe icon.See <a href='https://fontawesome.com/v6/icons/globe?s=solid'>example</a>
         */
        GLOBE,
        /**
         * The solid globe-africa icon.See <a href='https://fontawesome.com/v6/icons/globe-africa?s=solid'>example</a>
         */
        GLOBE_AFRICA,
        /**
         * The solid globe-americas icon.See <a href='https://fontawesome.com/v6/icons/globe-americas?s=solid'>example</a>
         */
        GLOBE_AMERICAS,
        /**
         * The solid globe-asia icon.See <a href='https://fontawesome.com/v6/icons/globe-asia?s=solid'>example</a>
         */
        GLOBE_ASIA,
        /**
         * The solid globe-europe icon.See <a href='https://fontawesome.com/v6/icons/globe-europe?s=solid'>example</a>
         */
        GLOBE_EUROPE,
        /**
         * The solid globe-oceania icon.See <a href='https://fontawesome.com/v6/icons/globe-oceania?s=solid'>example</a>
         */
        GLOBE_OCEANIA,
        /**
         * The solid golf-ball icon.See <a href='https://fontawesome.com/v6/icons/golf-ball?s=solid'>example</a>
         */
        GOLF_BALL,
        /**
         * The solid golf-ball-tee icon.See <a href='https://fontawesome.com/v6/icons/golf-ball-tee?s=solid'>example</a>
         */
        GOLF_BALL_TEE,
        /**
         * The solid gopuram icon.See <a href='https://fontawesome.com/v6/icons/gopuram?s=solid'>example</a>
         */
        GOPURAM,
        /**
         * The solid graduation-cap icon.See <a href='https://fontawesome.com/v6/icons/graduation-cap?s=solid'>example</a>
         */
        GRADUATION_CAP,
        /**
         * The solid greater-than icon.See <a href='https://fontawesome.com/v6/icons/greater-than?s=solid'>example</a>
         */
        GREATER_THAN,
        /**
         * The solid greater-than-equal icon.See <a href='https://fontawesome.com/v6/icons/greater-than-equal?s=solid'>example</a>
         */
        GREATER_THAN_EQUAL,
        /**
         * The solid grimace icon.See <a href='https://fontawesome.com/v6/icons/grimace?s=solid'>example</a>
         */
        GRIMACE,
        /**
         * The solid grin icon.See <a href='https://fontawesome.com/v6/icons/grin?s=solid'>example</a>
         */
        GRIN,
        /**
         * The solid grin-alt icon.See <a href='https://fontawesome.com/v6/icons/grin-alt?s=solid'>example</a>
         */
        GRIN_ALT,
        /**
         * The solid grin-beam icon.See <a href='https://fontawesome.com/v6/icons/grin-beam?s=solid'>example</a>
         */
        GRIN_BEAM,
        /**
         * The solid grin-beam-sweat icon.See <a href='https://fontawesome.com/v6/icons/grin-beam-sweat?s=solid'>example</a>
         */
        GRIN_BEAM_SWEAT,
        /**
         * The solid grin-hearts icon.See <a href='https://fontawesome.com/v6/icons/grin-hearts?s=solid'>example</a>
         */
        GRIN_HEARTS,
        /**
         * The solid grin-squint icon.See <a href='https://fontawesome.com/v6/icons/grin-squint?s=solid'>example</a>
         */
        GRIN_SQUINT,
        /**
         * The solid grin-squint-tears icon.See <a href='https://fontawesome.com/v6/icons/grin-squint-tears?s=solid'>example</a>
         */
        GRIN_SQUINT_TEARS,
        /**
         * The solid grin-stars icon.See <a href='https://fontawesome.com/v6/icons/grin-stars?s=solid'>example</a>
         */
        GRIN_STARS,
        /**
         * The solid grin-tears icon.See <a href='https://fontawesome.com/v6/icons/grin-tears?s=solid'>example</a>
         */
        GRIN_TEARS,
        /**
         * The solid grin-tongue icon.See <a href='https://fontawesome.com/v6/icons/grin-tongue?s=solid'>example</a>
         */
        GRIN_TONGUE,
        /**
         * The solid grin-tongue-squint icon.See <a href='https://fontawesome.com/v6/icons/grin-tongue-squint?s=solid'>example</a>
         */
        GRIN_TONGUE_SQUINT,
        /**
         * The solid grin-tongue-wink icon.See <a href='https://fontawesome.com/v6/icons/grin-tongue-wink?s=solid'>example</a>
         */
        GRIN_TONGUE_WINK,
        /**
         * The solid grin-wink icon.See <a href='https://fontawesome.com/v6/icons/grin-wink?s=solid'>example</a>
         */
        GRIN_WINK,
        /**
         * The solid grip icon.See <a href='https://fontawesome.com/v6/icons/grip?s=solid'>example</a>
         */
        GRIP,
        /**
         * The solid grip-horizontal icon.See <a href='https://fontawesome.com/v6/icons/grip-horizontal?s=solid'>example</a>
         */
        GRIP_HORIZONTAL,
        /**
         * The solid grip-lines icon.See <a href='https://fontawesome.com/v6/icons/grip-lines?s=solid'>example</a>
         */
        GRIP_LINES,
        /**
         * The solid grip-lines-vertical icon.See <a href='https://fontawesome.com/v6/icons/grip-lines-vertical?s=solid'>example</a>
         */
        GRIP_LINES_VERTICAL,
        /**
         * The solid grip-vertical icon.See <a href='https://fontawesome.com/v6/icons/grip-vertical?s=solid'>example</a>
         */
        GRIP_VERTICAL,
        /**
         * The solid group-arrows-rotate icon.See <a href='https://fontawesome.com/v6/icons/group-arrows-rotate?s=solid'>example</a>
         */
        GROUP_ARROWS_ROTATE,
        /**
         * The solid guarani-sign icon.See <a href='https://fontawesome.com/v6/icons/guarani-sign?s=solid'>example</a>
         */
        GUARANI_SIGN,
        /**
         * The solid guitar icon.See <a href='https://fontawesome.com/v6/icons/guitar?s=solid'>example</a>
         */
        GUITAR,
        /**
         * The solid gun icon.See <a href='https://fontawesome.com/v6/icons/gun?s=solid'>example</a>
         */
        GUN,
        /**
         * The solid h icon.See <a href='https://fontawesome.com/v6/icons/h?s=solid'>example</a>
         */
        H,
        /**
         * The solid h-square icon.See <a href='https://fontawesome.com/v6/icons/h-square?s=solid'>example</a>
         */
        H_SQUARE,
        /**
         * The solid hamburger icon.See <a href='https://fontawesome.com/v6/icons/hamburger?s=solid'>example</a>
         */
        HAMBURGER,
        /**
         * The solid hammer icon.See <a href='https://fontawesome.com/v6/icons/hammer?s=solid'>example</a>
         */
        HAMMER,
        /**
         * The solid hamsa icon.See <a href='https://fontawesome.com/v6/icons/hamsa?s=solid'>example</a>
         */
        HAMSA,
        /**
         * The solid hand icon.See <a href='https://fontawesome.com/v6/icons/hand?s=solid'>example</a>
         */
        HAND,
        /**
         * The solid hand-back-fist icon.See <a href='https://fontawesome.com/v6/icons/hand-back-fist?s=solid'>example</a>
         */
        HAND_BACK_FIST,
        /**
         * The solid hand-dots icon.See <a href='https://fontawesome.com/v6/icons/hand-dots?s=solid'>example</a>
         */
        HAND_DOTS,
        /**
         * The solid hand-fist icon.See <a href='https://fontawesome.com/v6/icons/hand-fist?s=solid'>example</a>
         */
        HAND_FIST,
        /**
         * The solid hand-holding icon.See <a href='https://fontawesome.com/v6/icons/hand-holding?s=solid'>example</a>
         */
        HAND_HOLDING,
        /**
         * The solid hand-holding-dollar icon.See <a href='https://fontawesome.com/v6/icons/hand-holding-dollar?s=solid'>example</a>
         */
        HAND_HOLDING_DOLLAR,
        /**
         * The solid hand-holding-droplet icon.See <a href='https://fontawesome.com/v6/icons/hand-holding-droplet?s=solid'>example</a>
         */
        HAND_HOLDING_DROPLET,
        /**
         * The solid hand-holding-hand icon.See <a href='https://fontawesome.com/v6/icons/hand-holding-hand?s=solid'>example</a>
         */
        HAND_HOLDING_HAND,
        /**
         * The solid hand-holding-heart icon.See <a href='https://fontawesome.com/v6/icons/hand-holding-heart?s=solid'>example</a>
         */
        HAND_HOLDING_HEART,
        /**
         * The solid hand-holding-medical icon.See <a href='https://fontawesome.com/v6/icons/hand-holding-medical?s=solid'>example</a>
         */
        HAND_HOLDING_MEDICAL,
        /**
         * The solid hand-holding-usd icon.See <a href='https://fontawesome.com/v6/icons/hand-holding-usd?s=solid'>example</a>
         */
        HAND_HOLDING_USD,
        /**
         * The solid hand-holding-water icon.See <a href='https://fontawesome.com/v6/icons/hand-holding-water?s=solid'>example</a>
         */
        HAND_HOLDING_WATER,
        /**
         * The solid hand-lizard icon.See <a href='https://fontawesome.com/v6/icons/hand-lizard?s=solid'>example</a>
         */
        HAND_LIZARD,
        /**
         * The solid hand-middle-finger icon.See <a href='https://fontawesome.com/v6/icons/hand-middle-finger?s=solid'>example</a>
         */
        HAND_MIDDLE_FINGER,
        /**
         * The solid hand-paper icon.See <a href='https://fontawesome.com/v6/icons/hand-paper?s=solid'>example</a>
         */
        HAND_PAPER,
        /**
         * The solid hand-peace icon.See <a href='https://fontawesome.com/v6/icons/hand-peace?s=solid'>example</a>
         */
        HAND_PEACE,
        /**
         * The solid hand-point-down icon.See <a href='https://fontawesome.com/v6/icons/hand-point-down?s=solid'>example</a>
         */
        HAND_POINT_DOWN,
        /**
         * The solid hand-point-left icon.See <a href='https://fontawesome.com/v6/icons/hand-point-left?s=solid'>example</a>
         */
        HAND_POINT_LEFT,
        /**
         * The solid hand-point-right icon.See <a href='https://fontawesome.com/v6/icons/hand-point-right?s=solid'>example</a>
         */
        HAND_POINT_RIGHT,
        /**
         * The solid hand-point-up icon.See <a href='https://fontawesome.com/v6/icons/hand-point-up?s=solid'>example</a>
         */
        HAND_POINT_UP,
        /**
         * The solid hand-pointer icon.See <a href='https://fontawesome.com/v6/icons/hand-pointer?s=solid'>example</a>
         */
        HAND_POINTER,
        /**
         * The solid hand-rock icon.See <a href='https://fontawesome.com/v6/icons/hand-rock?s=solid'>example</a>
         */
        HAND_ROCK,
        /**
         * The solid hand-scissors icon.See <a href='https://fontawesome.com/v6/icons/hand-scissors?s=solid'>example</a>
         */
        HAND_SCISSORS,
        /**
         * The solid hand-sparkles icon.See <a href='https://fontawesome.com/v6/icons/hand-sparkles?s=solid'>example</a>
         */
        HAND_SPARKLES,
        /**
         * The solid hand-spock icon.See <a href='https://fontawesome.com/v6/icons/hand-spock?s=solid'>example</a>
         */
        HAND_SPOCK,
        /**
         * The solid handcuffs icon.See <a href='https://fontawesome.com/v6/icons/handcuffs?s=solid'>example</a>
         */
        HANDCUFFS,
        /**
         * The solid hands icon.See <a href='https://fontawesome.com/v6/icons/hands?s=solid'>example</a>
         */
        HANDS,
        /**
         * The solid hands-american-sign-language-interpreting icon.See <a href='https://fontawesome.com/v6/icons/hands-american-sign-language-interpreting?s=solid'>example</a>
         */
        HANDS_AMERICAN_SIGN_LANGUAGE_INTERPRETING,
        /**
         * The solid hands-asl-interpreting icon.See <a href='https://fontawesome.com/v6/icons/hands-asl-interpreting?s=solid'>example</a>
         */
        HANDS_ASL_INTERPRETING,
        /**
         * The solid hands-bound icon.See <a href='https://fontawesome.com/v6/icons/hands-bound?s=solid'>example</a>
         */
        HANDS_BOUND,
        /**
         * The solid hands-bubbles icon.See <a href='https://fontawesome.com/v6/icons/hands-bubbles?s=solid'>example</a>
         */
        HANDS_BUBBLES,
        /**
         * The solid hands-clapping icon.See <a href='https://fontawesome.com/v6/icons/hands-clapping?s=solid'>example</a>
         */
        HANDS_CLAPPING,
        /**
         * The solid hands-helping icon.See <a href='https://fontawesome.com/v6/icons/hands-helping?s=solid'>example</a>
         */
        HANDS_HELPING,
        /**
         * The solid hands-holding icon.See <a href='https://fontawesome.com/v6/icons/hands-holding?s=solid'>example</a>
         */
        HANDS_HOLDING,
        /**
         * The solid hands-holding-child icon.See <a href='https://fontawesome.com/v6/icons/hands-holding-child?s=solid'>example</a>
         */
        HANDS_HOLDING_CHILD,
        /**
         * The solid hands-holding-circle icon.See <a href='https://fontawesome.com/v6/icons/hands-holding-circle?s=solid'>example</a>
         */
        HANDS_HOLDING_CIRCLE,
        /**
         * The solid hands-praying icon.See <a href='https://fontawesome.com/v6/icons/hands-praying?s=solid'>example</a>
         */
        HANDS_PRAYING,
        /**
         * The solid hands-wash icon.See <a href='https://fontawesome.com/v6/icons/hands-wash?s=solid'>example</a>
         */
        HANDS_WASH,
        /**
         * The solid handshake icon.See <a href='https://fontawesome.com/v6/icons/handshake?s=solid'>example</a>
         */
        HANDSHAKE,
        /**
         * The solid handshake-alt icon.See <a href='https://fontawesome.com/v6/icons/handshake-alt?s=solid'>example</a>
         */
        HANDSHAKE_ALT,
        /**
         * The solid handshake-alt-slash icon.See <a href='https://fontawesome.com/v6/icons/handshake-alt-slash?s=solid'>example</a>
         */
        HANDSHAKE_ALT_SLASH,
        /**
         * The solid handshake-angle icon.See <a href='https://fontawesome.com/v6/icons/handshake-angle?s=solid'>example</a>
         */
        HANDSHAKE_ANGLE,
        /**
         * The solid handshake-simple icon.See <a href='https://fontawesome.com/v6/icons/handshake-simple?s=solid'>example</a>
         */
        HANDSHAKE_SIMPLE,
        /**
         * The solid handshake-simple-slash icon.See <a href='https://fontawesome.com/v6/icons/handshake-simple-slash?s=solid'>example</a>
         */
        HANDSHAKE_SIMPLE_SLASH,
        /**
         * The solid handshake-slash icon.See <a href='https://fontawesome.com/v6/icons/handshake-slash?s=solid'>example</a>
         */
        HANDSHAKE_SLASH,
        /**
         * The solid hanukiah icon.See <a href='https://fontawesome.com/v6/icons/hanukiah?s=solid'>example</a>
         */
        HANUKIAH,
        /**
         * The solid hard-drive icon.See <a href='https://fontawesome.com/v6/icons/hard-drive?s=solid'>example</a>
         */
        HARD_DRIVE,
        /**
         * The solid hard-hat icon.See <a href='https://fontawesome.com/v6/icons/hard-hat?s=solid'>example</a>
         */
        HARD_HAT,
        /**
         * The solid hard-of-hearing icon.See <a href='https://fontawesome.com/v6/icons/hard-of-hearing?s=solid'>example</a>
         */
        HARD_OF_HEARING,
        /**
         * The solid hashtag icon.See <a href='https://fontawesome.com/v6/icons/hashtag?s=solid'>example</a>
         */
        HASHTAG,
        /**
         * The solid hat-cowboy icon.See <a href='https://fontawesome.com/v6/icons/hat-cowboy?s=solid'>example</a>
         */
        HAT_COWBOY,
        /**
         * The solid hat-cowboy-side icon.See <a href='https://fontawesome.com/v6/icons/hat-cowboy-side?s=solid'>example</a>
         */
        HAT_COWBOY_SIDE,
        /**
         * The solid hat-hard icon.See <a href='https://fontawesome.com/v6/icons/hat-hard?s=solid'>example</a>
         */
        HAT_HARD,
        /**
         * The solid hat-wizard icon.See <a href='https://fontawesome.com/v6/icons/hat-wizard?s=solid'>example</a>
         */
        HAT_WIZARD,
        /**
         * The solid haykal icon.See <a href='https://fontawesome.com/v6/icons/haykal?s=solid'>example</a>
         */
        HAYKAL,
        /**
         * The solid hdd icon.See <a href='https://fontawesome.com/v6/icons/hdd?s=solid'>example</a>
         */
        HDD,
        /**
         * The solid head-side-cough icon.See <a href='https://fontawesome.com/v6/icons/head-side-cough?s=solid'>example</a>
         */
        HEAD_SIDE_COUGH,
        /**
         * The solid head-side-cough-slash icon.See <a href='https://fontawesome.com/v6/icons/head-side-cough-slash?s=solid'>example</a>
         */
        HEAD_SIDE_COUGH_SLASH,
        /**
         * The solid head-side-mask icon.See <a href='https://fontawesome.com/v6/icons/head-side-mask?s=solid'>example</a>
         */
        HEAD_SIDE_MASK,
        /**
         * The solid head-side-virus icon.See <a href='https://fontawesome.com/v6/icons/head-side-virus?s=solid'>example</a>
         */
        HEAD_SIDE_VIRUS,
        /**
         * The solid header icon.See <a href='https://fontawesome.com/v6/icons/header?s=solid'>example</a>
         */
        HEADER,
        /**
         * The solid heading icon.See <a href='https://fontawesome.com/v6/icons/heading?s=solid'>example</a>
         */
        HEADING,
        /**
         * The solid headphones icon.See <a href='https://fontawesome.com/v6/icons/headphones?s=solid'>example</a>
         */
        HEADPHONES,
        /**
         * The solid headphones-alt icon.See <a href='https://fontawesome.com/v6/icons/headphones-alt?s=solid'>example</a>
         */
        HEADPHONES_ALT,
        /**
         * The solid headphones-simple icon.See <a href='https://fontawesome.com/v6/icons/headphones-simple?s=solid'>example</a>
         */
        HEADPHONES_SIMPLE,
        /**
         * The solid headset icon.See <a href='https://fontawesome.com/v6/icons/headset?s=solid'>example</a>
         */
        HEADSET,
        /**
         * The solid heart icon.See <a href='https://fontawesome.com/v6/icons/heart?s=solid'>example</a>
         */
        HEART,
        /**
         * The solid heart-broken icon.See <a href='https://fontawesome.com/v6/icons/heart-broken?s=solid'>example</a>
         */
        HEART_BROKEN,
        /**
         * The solid heart-circle-bolt icon.See <a href='https://fontawesome.com/v6/icons/heart-circle-bolt?s=solid'>example</a>
         */
        HEART_CIRCLE_BOLT,
        /**
         * The solid heart-circle-check icon.See <a href='https://fontawesome.com/v6/icons/heart-circle-check?s=solid'>example</a>
         */
        HEART_CIRCLE_CHECK,
        /**
         * The solid heart-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/heart-circle-exclamation?s=solid'>example</a>
         */
        HEART_CIRCLE_EXCLAMATION,
        /**
         * The solid heart-circle-minus icon.See <a href='https://fontawesome.com/v6/icons/heart-circle-minus?s=solid'>example</a>
         */
        HEART_CIRCLE_MINUS,
        /**
         * The solid heart-circle-plus icon.See <a href='https://fontawesome.com/v6/icons/heart-circle-plus?s=solid'>example</a>
         */
        HEART_CIRCLE_PLUS,
        /**
         * The solid heart-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/heart-circle-xmark?s=solid'>example</a>
         */
        HEART_CIRCLE_XMARK,
        /**
         * The solid heart-crack icon.See <a href='https://fontawesome.com/v6/icons/heart-crack?s=solid'>example</a>
         */
        HEART_CRACK,
        /**
         * The solid heart-music-camera-bolt icon.See <a href='https://fontawesome.com/v6/icons/heart-music-camera-bolt?s=solid'>example</a>
         */
        HEART_MUSIC_CAMERA_BOLT,
        /**
         * The solid heart-pulse icon.See <a href='https://fontawesome.com/v6/icons/heart-pulse?s=solid'>example</a>
         */
        HEART_PULSE,
        /**
         * The solid heartbeat icon.See <a href='https://fontawesome.com/v6/icons/heartbeat?s=solid'>example</a>
         */
        HEARTBEAT,
        /**
         * The solid helicopter icon.See <a href='https://fontawesome.com/v6/icons/helicopter?s=solid'>example</a>
         */
        HELICOPTER,
        /**
         * The solid helicopter-symbol icon.See <a href='https://fontawesome.com/v6/icons/helicopter-symbol?s=solid'>example</a>
         */
        HELICOPTER_SYMBOL,
        /**
         * The solid helmet-safety icon.See <a href='https://fontawesome.com/v6/icons/helmet-safety?s=solid'>example</a>
         */
        HELMET_SAFETY,
        /**
         * The solid helmet-un icon.See <a href='https://fontawesome.com/v6/icons/helmet-un?s=solid'>example</a>
         */
        HELMET_UN,
        /**
         * The solid highlighter icon.See <a href='https://fontawesome.com/v6/icons/highlighter?s=solid'>example</a>
         */
        HIGHLIGHTER,
        /**
         * The solid hiking icon.See <a href='https://fontawesome.com/v6/icons/hiking?s=solid'>example</a>
         */
        HIKING,
        /**
         * The solid hill-avalanche icon.See <a href='https://fontawesome.com/v6/icons/hill-avalanche?s=solid'>example</a>
         */
        HILL_AVALANCHE,
        /**
         * The solid hill-rockslide icon.See <a href='https://fontawesome.com/v6/icons/hill-rockslide?s=solid'>example</a>
         */
        HILL_ROCKSLIDE,
        /**
         * The solid hippo icon.See <a href='https://fontawesome.com/v6/icons/hippo?s=solid'>example</a>
         */
        HIPPO,
        /**
         * The solid history icon.See <a href='https://fontawesome.com/v6/icons/history?s=solid'>example</a>
         */
        HISTORY,
        /**
         * The solid hockey-puck icon.See <a href='https://fontawesome.com/v6/icons/hockey-puck?s=solid'>example</a>
         */
        HOCKEY_PUCK,
        /**
         * The solid holly-berry icon.See <a href='https://fontawesome.com/v6/icons/holly-berry?s=solid'>example</a>
         */
        HOLLY_BERRY,
        /**
         * The solid home icon.See <a href='https://fontawesome.com/v6/icons/home?s=solid'>example</a>
         */
        HOME,
        /**
         * The solid home-alt icon.See <a href='https://fontawesome.com/v6/icons/home-alt?s=solid'>example</a>
         */
        HOME_ALT,
        /**
         * The solid home-lg icon.See <a href='https://fontawesome.com/v6/icons/home-lg?s=solid'>example</a>
         */
        HOME_LG,
        /**
         * The solid home-lg-alt icon.See <a href='https://fontawesome.com/v6/icons/home-lg-alt?s=solid'>example</a>
         */
        HOME_LG_ALT,
        /**
         * The solid home-user icon.See <a href='https://fontawesome.com/v6/icons/home-user?s=solid'>example</a>
         */
        HOME_USER,
        /**
         * The solid horse icon.See <a href='https://fontawesome.com/v6/icons/horse?s=solid'>example</a>
         */
        HORSE,
        /**
         * The solid horse-head icon.See <a href='https://fontawesome.com/v6/icons/horse-head?s=solid'>example</a>
         */
        HORSE_HEAD,
        /**
         * The solid hospital icon.See <a href='https://fontawesome.com/v6/icons/hospital?s=solid'>example</a>
         */
        HOSPITAL,
        /**
         * The solid hospital-alt icon.See <a href='https://fontawesome.com/v6/icons/hospital-alt?s=solid'>example</a>
         */
        HOSPITAL_ALT,
        /**
         * The solid hospital-symbol icon.See <a href='https://fontawesome.com/v6/icons/hospital-symbol?s=solid'>example</a>
         */
        HOSPITAL_SYMBOL,
        /**
         * The solid hospital-user icon.See <a href='https://fontawesome.com/v6/icons/hospital-user?s=solid'>example</a>
         */
        HOSPITAL_USER,
        /**
         * The solid hospital-wide icon.See <a href='https://fontawesome.com/v6/icons/hospital-wide?s=solid'>example</a>
         */
        HOSPITAL_WIDE,
        /**
         * The solid hot-tub icon.See <a href='https://fontawesome.com/v6/icons/hot-tub?s=solid'>example</a>
         */
        HOT_TUB,
        /**
         * The solid hot-tub-person icon.See <a href='https://fontawesome.com/v6/icons/hot-tub-person?s=solid'>example</a>
         */
        HOT_TUB_PERSON,
        /**
         * The solid hotdog icon.See <a href='https://fontawesome.com/v6/icons/hotdog?s=solid'>example</a>
         */
        HOTDOG,
        /**
         * The solid hotel icon.See <a href='https://fontawesome.com/v6/icons/hotel?s=solid'>example</a>
         */
        HOTEL,
        /**
         * The solid hourglass icon.See <a href='https://fontawesome.com/v6/icons/hourglass?s=solid'>example</a>
         */
        HOURGLASS,
        /**
         * The solid hourglass-1 icon.See <a href='https://fontawesome.com/v6/icons/hourglass-1?s=solid'>example</a>
         */
        HOURGLASS_1,
        /**
         * The solid hourglass-2 icon.See <a href='https://fontawesome.com/v6/icons/hourglass-2?s=solid'>example</a>
         */
        HOURGLASS_2,
        /**
         * The solid hourglass-3 icon.See <a href='https://fontawesome.com/v6/icons/hourglass-3?s=solid'>example</a>
         */
        HOURGLASS_3,
        /**
         * The solid hourglass-empty icon.See <a href='https://fontawesome.com/v6/icons/hourglass-empty?s=solid'>example</a>
         */
        HOURGLASS_EMPTY,
        /**
         * The solid hourglass-end icon.See <a href='https://fontawesome.com/v6/icons/hourglass-end?s=solid'>example</a>
         */
        HOURGLASS_END,
        /**
         * The solid hourglass-half icon.See <a href='https://fontawesome.com/v6/icons/hourglass-half?s=solid'>example</a>
         */
        HOURGLASS_HALF,
        /**
         * The solid hourglass-start icon.See <a href='https://fontawesome.com/v6/icons/hourglass-start?s=solid'>example</a>
         */
        HOURGLASS_START,
        /**
         * The solid house icon.See <a href='https://fontawesome.com/v6/icons/house?s=solid'>example</a>
         */
        HOUSE,
        /**
         * The solid house-chimney icon.See <a href='https://fontawesome.com/v6/icons/house-chimney?s=solid'>example</a>
         */
        HOUSE_CHIMNEY,
        /**
         * The solid house-chimney-crack icon.See <a href='https://fontawesome.com/v6/icons/house-chimney-crack?s=solid'>example</a>
         */
        HOUSE_CHIMNEY_CRACK,
        /**
         * The solid house-chimney-medical icon.See <a href='https://fontawesome.com/v6/icons/house-chimney-medical?s=solid'>example</a>
         */
        HOUSE_CHIMNEY_MEDICAL,
        /**
         * The solid house-chimney-user icon.See <a href='https://fontawesome.com/v6/icons/house-chimney-user?s=solid'>example</a>
         */
        HOUSE_CHIMNEY_USER,
        /**
         * The solid house-chimney-window icon.See <a href='https://fontawesome.com/v6/icons/house-chimney-window?s=solid'>example</a>
         */
        HOUSE_CHIMNEY_WINDOW,
        /**
         * The solid house-circle-check icon.See <a href='https://fontawesome.com/v6/icons/house-circle-check?s=solid'>example</a>
         */
        HOUSE_CIRCLE_CHECK,
        /**
         * The solid house-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/house-circle-exclamation?s=solid'>example</a>
         */
        HOUSE_CIRCLE_EXCLAMATION,
        /**
         * The solid house-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/house-circle-xmark?s=solid'>example</a>
         */
        HOUSE_CIRCLE_XMARK,
        /**
         * The solid house-crack icon.See <a href='https://fontawesome.com/v6/icons/house-crack?s=solid'>example</a>
         */
        HOUSE_CRACK,
        /**
         * The solid house-damage icon.See <a href='https://fontawesome.com/v6/icons/house-damage?s=solid'>example</a>
         */
        HOUSE_DAMAGE,
        /**
         * The solid house-fire icon.See <a href='https://fontawesome.com/v6/icons/house-fire?s=solid'>example</a>
         */
        HOUSE_FIRE,
        /**
         * The solid house-flag icon.See <a href='https://fontawesome.com/v6/icons/house-flag?s=solid'>example</a>
         */
        HOUSE_FLAG,
        /**
         * The solid house-flood-water icon.See <a href='https://fontawesome.com/v6/icons/house-flood-water?s=solid'>example</a>
         */
        HOUSE_FLOOD_WATER,
        /**
         * The solid house-flood-water-circle-arrow-right icon.See <a href='https://fontawesome.com/v6/icons/house-flood-water-circle-arrow-right?s=solid'>example</a>
         */
        HOUSE_FLOOD_WATER_CIRCLE_ARROW_RIGHT,
        /**
         * The solid house-laptop icon.See <a href='https://fontawesome.com/v6/icons/house-laptop?s=solid'>example</a>
         */
        HOUSE_LAPTOP,
        /**
         * The solid house-lock icon.See <a href='https://fontawesome.com/v6/icons/house-lock?s=solid'>example</a>
         */
        HOUSE_LOCK,
        /**
         * The solid house-medical icon.See <a href='https://fontawesome.com/v6/icons/house-medical?s=solid'>example</a>
         */
        HOUSE_MEDICAL,
        /**
         * The solid house-medical-circle-check icon.See <a href='https://fontawesome.com/v6/icons/house-medical-circle-check?s=solid'>example</a>
         */
        HOUSE_MEDICAL_CIRCLE_CHECK,
        /**
         * The solid house-medical-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/house-medical-circle-exclamation?s=solid'>example</a>
         */
        HOUSE_MEDICAL_CIRCLE_EXCLAMATION,
        /**
         * The solid house-medical-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/house-medical-circle-xmark?s=solid'>example</a>
         */
        HOUSE_MEDICAL_CIRCLE_XMARK,
        /**
         * The solid house-medical-flag icon.See <a href='https://fontawesome.com/v6/icons/house-medical-flag?s=solid'>example</a>
         */
        HOUSE_MEDICAL_FLAG,
        /**
         * The solid house-signal icon.See <a href='https://fontawesome.com/v6/icons/house-signal?s=solid'>example</a>
         */
        HOUSE_SIGNAL,
        /**
         * The solid house-tsunami icon.See <a href='https://fontawesome.com/v6/icons/house-tsunami?s=solid'>example</a>
         */
        HOUSE_TSUNAMI,
        /**
         * The solid house-user icon.See <a href='https://fontawesome.com/v6/icons/house-user?s=solid'>example</a>
         */
        HOUSE_USER,
        /**
         * The solid hryvnia icon.See <a href='https://fontawesome.com/v6/icons/hryvnia?s=solid'>example</a>
         */
        HRYVNIA,
        /**
         * The solid hryvnia-sign icon.See <a href='https://fontawesome.com/v6/icons/hryvnia-sign?s=solid'>example</a>
         */
        HRYVNIA_SIGN,
        /**
         * The solid hurricane icon.See <a href='https://fontawesome.com/v6/icons/hurricane?s=solid'>example</a>
         */
        HURRICANE,
        /**
         * The solid i icon.See <a href='https://fontawesome.com/v6/icons/i?s=solid'>example</a>
         */
        I,
        /**
         * The solid i-cursor icon.See <a href='https://fontawesome.com/v6/icons/i-cursor?s=solid'>example</a>
         */
        I_CURSOR,
        /**
         * The solid ice-cream icon.See <a href='https://fontawesome.com/v6/icons/ice-cream?s=solid'>example</a>
         */
        ICE_CREAM,
        /**
         * The solid icicles icon.See <a href='https://fontawesome.com/v6/icons/icicles?s=solid'>example</a>
         */
        ICICLES,
        /**
         * The solid icons icon.See <a href='https://fontawesome.com/v6/icons/icons?s=solid'>example</a>
         */
        ICONS,
        /**
         * The solid id-badge icon.See <a href='https://fontawesome.com/v6/icons/id-badge?s=solid'>example</a>
         */
        ID_BADGE,
        /**
         * The solid id-card icon.See <a href='https://fontawesome.com/v6/icons/id-card?s=solid'>example</a>
         */
        ID_CARD,
        /**
         * The solid id-card-alt icon.See <a href='https://fontawesome.com/v6/icons/id-card-alt?s=solid'>example</a>
         */
        ID_CARD_ALT,
        /**
         * The solid id-card-clip icon.See <a href='https://fontawesome.com/v6/icons/id-card-clip?s=solid'>example</a>
         */
        ID_CARD_CLIP,
        /**
         * The solid igloo icon.See <a href='https://fontawesome.com/v6/icons/igloo?s=solid'>example</a>
         */
        IGLOO,
        /**
         * The solid ils icon.See <a href='https://fontawesome.com/v6/icons/ils?s=solid'>example</a>
         */
        ILS,
        /**
         * The solid image icon.See <a href='https://fontawesome.com/v6/icons/image?s=solid'>example</a>
         */
        IMAGE,
        /**
         * The solid image-portrait icon.See <a href='https://fontawesome.com/v6/icons/image-portrait?s=solid'>example</a>
         */
        IMAGE_PORTRAIT,
        /**
         * The solid images icon.See <a href='https://fontawesome.com/v6/icons/images?s=solid'>example</a>
         */
        IMAGES,
        /**
         * The solid inbox icon.See <a href='https://fontawesome.com/v6/icons/inbox?s=solid'>example</a>
         */
        INBOX,
        /**
         * The solid indent icon.See <a href='https://fontawesome.com/v6/icons/indent?s=solid'>example</a>
         */
        INDENT,
        /**
         * The solid indian-rupee icon.See <a href='https://fontawesome.com/v6/icons/indian-rupee?s=solid'>example</a>
         */
        INDIAN_RUPEE,
        /**
         * The solid indian-rupee-sign icon.See <a href='https://fontawesome.com/v6/icons/indian-rupee-sign?s=solid'>example</a>
         */
        INDIAN_RUPEE_SIGN,
        /**
         * The solid industry icon.See <a href='https://fontawesome.com/v6/icons/industry?s=solid'>example</a>
         */
        INDUSTRY,
        /**
         * The solid infinity icon.See <a href='https://fontawesome.com/v6/icons/infinity?s=solid'>example</a>
         */
        INFINITY,
        /**
         * The solid info icon.See <a href='https://fontawesome.com/v6/icons/info?s=solid'>example</a>
         */
        INFO,
        /**
         * The solid info-circle icon.See <a href='https://fontawesome.com/v6/icons/info-circle?s=solid'>example</a>
         */
        INFO_CIRCLE,
        /**
         * The solid inr icon.See <a href='https://fontawesome.com/v6/icons/inr?s=solid'>example</a>
         */
        INR,
        /**
         * The solid institution icon.See <a href='https://fontawesome.com/v6/icons/institution?s=solid'>example</a>
         */
        INSTITUTION,
        /**
         * The solid italic icon.See <a href='https://fontawesome.com/v6/icons/italic?s=solid'>example</a>
         */
        ITALIC,
        /**
         * The solid j icon.See <a href='https://fontawesome.com/v6/icons/j?s=solid'>example</a>
         */
        J,
        /**
         * The solid jar icon.See <a href='https://fontawesome.com/v6/icons/jar?s=solid'>example</a>
         */
        JAR,
        /**
         * The solid jar-wheat icon.See <a href='https://fontawesome.com/v6/icons/jar-wheat?s=solid'>example</a>
         */
        JAR_WHEAT,
        /**
         * The solid jedi icon.See <a href='https://fontawesome.com/v6/icons/jedi?s=solid'>example</a>
         */
        JEDI,
        /**
         * The solid jet-fighter icon.See <a href='https://fontawesome.com/v6/icons/jet-fighter?s=solid'>example</a>
         */
        JET_FIGHTER,
        /**
         * The solid jet-fighter-up icon.See <a href='https://fontawesome.com/v6/icons/jet-fighter-up?s=solid'>example</a>
         */
        JET_FIGHTER_UP,
        /**
         * The solid joint icon.See <a href='https://fontawesome.com/v6/icons/joint?s=solid'>example</a>
         */
        JOINT,
        /**
         * The solid journal-whills icon.See <a href='https://fontawesome.com/v6/icons/journal-whills?s=solid'>example</a>
         */
        JOURNAL_WHILLS,
        /**
         * The solid jpy icon.See <a href='https://fontawesome.com/v6/icons/jpy?s=solid'>example</a>
         */
        JPY,
        /**
         * The solid jug-detergent icon.See <a href='https://fontawesome.com/v6/icons/jug-detergent?s=solid'>example</a>
         */
        JUG_DETERGENT,
        /**
         * The solid k icon.See <a href='https://fontawesome.com/v6/icons/k?s=solid'>example</a>
         */
        K,
        /**
         * The solid kaaba icon.See <a href='https://fontawesome.com/v6/icons/kaaba?s=solid'>example</a>
         */
        KAABA,
        /**
         * The solid key icon.See <a href='https://fontawesome.com/v6/icons/key?s=solid'>example</a>
         */
        KEY,
        /**
         * The solid keyboard icon.See <a href='https://fontawesome.com/v6/icons/keyboard?s=solid'>example</a>
         */
        KEYBOARD,
        /**
         * The solid khanda icon.See <a href='https://fontawesome.com/v6/icons/khanda?s=solid'>example</a>
         */
        KHANDA,
        /**
         * The solid kip-sign icon.See <a href='https://fontawesome.com/v6/icons/kip-sign?s=solid'>example</a>
         */
        KIP_SIGN,
        /**
         * The solid kiss icon.See <a href='https://fontawesome.com/v6/icons/kiss?s=solid'>example</a>
         */
        KISS,
        /**
         * The solid kiss-beam icon.See <a href='https://fontawesome.com/v6/icons/kiss-beam?s=solid'>example</a>
         */
        KISS_BEAM,
        /**
         * The solid kiss-wink-heart icon.See <a href='https://fontawesome.com/v6/icons/kiss-wink-heart?s=solid'>example</a>
         */
        KISS_WINK_HEART,
        /**
         * The solid kit-medical icon.See <a href='https://fontawesome.com/v6/icons/kit-medical?s=solid'>example</a>
         */
        KIT_MEDICAL,
        /**
         * The solid kitchen-set icon.See <a href='https://fontawesome.com/v6/icons/kitchen-set?s=solid'>example</a>
         */
        KITCHEN_SET,
        /**
         * The solid kiwi-bird icon.See <a href='https://fontawesome.com/v6/icons/kiwi-bird?s=solid'>example</a>
         */
        KIWI_BIRD,
        /**
         * The solid krw icon.See <a href='https://fontawesome.com/v6/icons/krw?s=solid'>example</a>
         */
        KRW,
        /**
         * The solid l icon.See <a href='https://fontawesome.com/v6/icons/l?s=solid'>example</a>
         */
        L,
        /**
         * The solid ladder-water icon.See <a href='https://fontawesome.com/v6/icons/ladder-water?s=solid'>example</a>
         */
        LADDER_WATER,
        /**
         * The solid land-mine-on icon.See <a href='https://fontawesome.com/v6/icons/land-mine-on?s=solid'>example</a>
         */
        LAND_MINE_ON,
        /**
         * The solid landmark icon.See <a href='https://fontawesome.com/v6/icons/landmark?s=solid'>example</a>
         */
        LANDMARK,
        /**
         * The solid landmark-alt icon.See <a href='https://fontawesome.com/v6/icons/landmark-alt?s=solid'>example</a>
         */
        LANDMARK_ALT,
        /**
         * The solid landmark-dome icon.See <a href='https://fontawesome.com/v6/icons/landmark-dome?s=solid'>example</a>
         */
        LANDMARK_DOME,
        /**
         * The solid landmark-flag icon.See <a href='https://fontawesome.com/v6/icons/landmark-flag?s=solid'>example</a>
         */
        LANDMARK_FLAG,
        /**
         * The solid language icon.See <a href='https://fontawesome.com/v6/icons/language?s=solid'>example</a>
         */
        LANGUAGE,
        /**
         * The solid laptop icon.See <a href='https://fontawesome.com/v6/icons/laptop?s=solid'>example</a>
         */
        LAPTOP,
        /**
         * The solid laptop-code icon.See <a href='https://fontawesome.com/v6/icons/laptop-code?s=solid'>example</a>
         */
        LAPTOP_CODE,
        /**
         * The solid laptop-file icon.See <a href='https://fontawesome.com/v6/icons/laptop-file?s=solid'>example</a>
         */
        LAPTOP_FILE,
        /**
         * The solid laptop-house icon.See <a href='https://fontawesome.com/v6/icons/laptop-house?s=solid'>example</a>
         */
        LAPTOP_HOUSE,
        /**
         * The solid laptop-medical icon.See <a href='https://fontawesome.com/v6/icons/laptop-medical?s=solid'>example</a>
         */
        LAPTOP_MEDICAL,
        /**
         * The solid lari-sign icon.See <a href='https://fontawesome.com/v6/icons/lari-sign?s=solid'>example</a>
         */
        LARI_SIGN,
        /**
         * The solid laugh icon.See <a href='https://fontawesome.com/v6/icons/laugh?s=solid'>example</a>
         */
        LAUGH,
        /**
         * The solid laugh-beam icon.See <a href='https://fontawesome.com/v6/icons/laugh-beam?s=solid'>example</a>
         */
        LAUGH_BEAM,
        /**
         * The solid laugh-squint icon.See <a href='https://fontawesome.com/v6/icons/laugh-squint?s=solid'>example</a>
         */
        LAUGH_SQUINT,
        /**
         * The solid laugh-wink icon.See <a href='https://fontawesome.com/v6/icons/laugh-wink?s=solid'>example</a>
         */
        LAUGH_WINK,
        /**
         * The solid layer-group icon.See <a href='https://fontawesome.com/v6/icons/layer-group?s=solid'>example</a>
         */
        LAYER_GROUP,
        /**
         * The solid leaf icon.See <a href='https://fontawesome.com/v6/icons/leaf?s=solid'>example</a>
         */
        LEAF,
        /**
         * The solid left-long icon.See <a href='https://fontawesome.com/v6/icons/left-long?s=solid'>example</a>
         */
        LEFT_LONG,
        /**
         * The solid left-right icon.See <a href='https://fontawesome.com/v6/icons/left-right?s=solid'>example</a>
         */
        LEFT_RIGHT,
        /**
         * The solid legal icon.See <a href='https://fontawesome.com/v6/icons/legal?s=solid'>example</a>
         */
        LEGAL,
        /**
         * The solid lemon icon.See <a href='https://fontawesome.com/v6/icons/lemon?s=solid'>example</a>
         */
        LEMON,
        /**
         * The solid less-than icon.See <a href='https://fontawesome.com/v6/icons/less-than?s=solid'>example</a>
         */
        LESS_THAN,
        /**
         * The solid less-than-equal icon.See <a href='https://fontawesome.com/v6/icons/less-than-equal?s=solid'>example</a>
         */
        LESS_THAN_EQUAL,
        /**
         * The solid level-down icon.See <a href='https://fontawesome.com/v6/icons/level-down?s=solid'>example</a>
         */
        LEVEL_DOWN,
        /**
         * The solid level-down-alt icon.See <a href='https://fontawesome.com/v6/icons/level-down-alt?s=solid'>example</a>
         */
        LEVEL_DOWN_ALT,
        /**
         * The solid level-up icon.See <a href='https://fontawesome.com/v6/icons/level-up?s=solid'>example</a>
         */
        LEVEL_UP,
        /**
         * The solid level-up-alt icon.See <a href='https://fontawesome.com/v6/icons/level-up-alt?s=solid'>example</a>
         */
        LEVEL_UP_ALT,
        /**
         * The solid life-ring icon.See <a href='https://fontawesome.com/v6/icons/life-ring?s=solid'>example</a>
         */
        LIFE_RING,
        /**
         * The solid lightbulb icon.See <a href='https://fontawesome.com/v6/icons/lightbulb?s=solid'>example</a>
         */
        LIGHTBULB,
        /**
         * The solid line-chart icon.See <a href='https://fontawesome.com/v6/icons/line-chart?s=solid'>example</a>
         */
        LINE_CHART,
        /**
         * The solid lines-leaning icon.See <a href='https://fontawesome.com/v6/icons/lines-leaning?s=solid'>example</a>
         */
        LINES_LEANING,
        /**
         * The solid link icon.See <a href='https://fontawesome.com/v6/icons/link?s=solid'>example</a>
         */
        LINK,
        /**
         * The solid link-slash icon.See <a href='https://fontawesome.com/v6/icons/link-slash?s=solid'>example</a>
         */
        LINK_SLASH,
        /**
         * The solid lira-sign icon.See <a href='https://fontawesome.com/v6/icons/lira-sign?s=solid'>example</a>
         */
        LIRA_SIGN,
        /**
         * The solid list icon.See <a href='https://fontawesome.com/v6/icons/list?s=solid'>example</a>
         */
        LIST,
        /**
         * The solid list-1-2 icon.See <a href='https://fontawesome.com/v6/icons/list-1-2?s=solid'>example</a>
         */
        LIST_1_2,
        /**
         * The solid list-alt icon.See <a href='https://fontawesome.com/v6/icons/list-alt?s=solid'>example</a>
         */
        LIST_ALT,
        /**
         * The solid list-check icon.See <a href='https://fontawesome.com/v6/icons/list-check?s=solid'>example</a>
         */
        LIST_CHECK,
        /**
         * The solid list-dots icon.See <a href='https://fontawesome.com/v6/icons/list-dots?s=solid'>example</a>
         */
        LIST_DOTS,
        /**
         * The solid list-numeric icon.See <a href='https://fontawesome.com/v6/icons/list-numeric?s=solid'>example</a>
         */
        LIST_NUMERIC,
        /**
         * The solid list-ol icon.See <a href='https://fontawesome.com/v6/icons/list-ol?s=solid'>example</a>
         */
        LIST_OL,
        /**
         * The solid list-squares icon.See <a href='https://fontawesome.com/v6/icons/list-squares?s=solid'>example</a>
         */
        LIST_SQUARES,
        /**
         * The solid list-ul icon.See <a href='https://fontawesome.com/v6/icons/list-ul?s=solid'>example</a>
         */
        LIST_UL,
        /**
         * The solid litecoin-sign icon.See <a href='https://fontawesome.com/v6/icons/litecoin-sign?s=solid'>example</a>
         */
        LITECOIN_SIGN,
        /**
         * The solid location icon.See <a href='https://fontawesome.com/v6/icons/location?s=solid'>example</a>
         */
        LOCATION,
        /**
         * The solid location-arrow icon.See <a href='https://fontawesome.com/v6/icons/location-arrow?s=solid'>example</a>
         */
        LOCATION_ARROW,
        /**
         * The solid location-crosshairs icon.See <a href='https://fontawesome.com/v6/icons/location-crosshairs?s=solid'>example</a>
         */
        LOCATION_CROSSHAIRS,
        /**
         * The solid location-dot icon.See <a href='https://fontawesome.com/v6/icons/location-dot?s=solid'>example</a>
         */
        LOCATION_DOT,
        /**
         * The solid location-pin icon.See <a href='https://fontawesome.com/v6/icons/location-pin?s=solid'>example</a>
         */
        LOCATION_PIN,
        /**
         * The solid location-pin-lock icon.See <a href='https://fontawesome.com/v6/icons/location-pin-lock?s=solid'>example</a>
         */
        LOCATION_PIN_LOCK,
        /**
         * The solid lock icon.See <a href='https://fontawesome.com/v6/icons/lock?s=solid'>example</a>
         */
        LOCK,
        /**
         * The solid lock-open icon.See <a href='https://fontawesome.com/v6/icons/lock-open?s=solid'>example</a>
         */
        LOCK_OPEN,
        /**
         * The solid locust icon.See <a href='https://fontawesome.com/v6/icons/locust?s=solid'>example</a>
         */
        LOCUST,
        /**
         * The solid long-arrow-alt-down icon.See <a href='https://fontawesome.com/v6/icons/long-arrow-alt-down?s=solid'>example</a>
         */
        LONG_ARROW_ALT_DOWN,
        /**
         * The solid long-arrow-alt-left icon.See <a href='https://fontawesome.com/v6/icons/long-arrow-alt-left?s=solid'>example</a>
         */
        LONG_ARROW_ALT_LEFT,
        /**
         * The solid long-arrow-alt-right icon.See <a href='https://fontawesome.com/v6/icons/long-arrow-alt-right?s=solid'>example</a>
         */
        LONG_ARROW_ALT_RIGHT,
        /**
         * The solid long-arrow-alt-up icon.See <a href='https://fontawesome.com/v6/icons/long-arrow-alt-up?s=solid'>example</a>
         */
        LONG_ARROW_ALT_UP,
        /**
         * The solid long-arrow-down icon.See <a href='https://fontawesome.com/v6/icons/long-arrow-down?s=solid'>example</a>
         */
        LONG_ARROW_DOWN,
        /**
         * The solid long-arrow-left icon.See <a href='https://fontawesome.com/v6/icons/long-arrow-left?s=solid'>example</a>
         */
        LONG_ARROW_LEFT,
        /**
         * The solid long-arrow-right icon.See <a href='https://fontawesome.com/v6/icons/long-arrow-right?s=solid'>example</a>
         */
        LONG_ARROW_RIGHT,
        /**
         * The solid long-arrow-up icon.See <a href='https://fontawesome.com/v6/icons/long-arrow-up?s=solid'>example</a>
         */
        LONG_ARROW_UP,
        /**
         * The solid low-vision icon.See <a href='https://fontawesome.com/v6/icons/low-vision?s=solid'>example</a>
         */
        LOW_VISION,
        /**
         * The solid luggage-cart icon.See <a href='https://fontawesome.com/v6/icons/luggage-cart?s=solid'>example</a>
         */
        LUGGAGE_CART,
        /**
         * The solid lungs icon.See <a href='https://fontawesome.com/v6/icons/lungs?s=solid'>example</a>
         */
        LUNGS,
        /**
         * The solid lungs-virus icon.See <a href='https://fontawesome.com/v6/icons/lungs-virus?s=solid'>example</a>
         */
        LUNGS_VIRUS,
        /**
         * The solid m icon.See <a href='https://fontawesome.com/v6/icons/m?s=solid'>example</a>
         */
        M,
        /**
         * The solid magic icon.See <a href='https://fontawesome.com/v6/icons/magic?s=solid'>example</a>
         */
        MAGIC,
        /**
         * The solid magic-wand-sparkles icon.See <a href='https://fontawesome.com/v6/icons/magic-wand-sparkles?s=solid'>example</a>
         */
        MAGIC_WAND_SPARKLES,
        /**
         * The solid magnet icon.See <a href='https://fontawesome.com/v6/icons/magnet?s=solid'>example</a>
         */
        MAGNET,
        /**
         * The solid magnifying-glass icon.See <a href='https://fontawesome.com/v6/icons/magnifying-glass?s=solid'>example</a>
         */
        MAGNIFYING_GLASS,
        /**
         * The solid magnifying-glass-arrow-right icon.See <a href='https://fontawesome.com/v6/icons/magnifying-glass-arrow-right?s=solid'>example</a>
         */
        MAGNIFYING_GLASS_ARROW_RIGHT,
        /**
         * The solid magnifying-glass-chart icon.See <a href='https://fontawesome.com/v6/icons/magnifying-glass-chart?s=solid'>example</a>
         */
        MAGNIFYING_GLASS_CHART,
        /**
         * The solid magnifying-glass-dollar icon.See <a href='https://fontawesome.com/v6/icons/magnifying-glass-dollar?s=solid'>example</a>
         */
        MAGNIFYING_GLASS_DOLLAR,
        /**
         * The solid magnifying-glass-location icon.See <a href='https://fontawesome.com/v6/icons/magnifying-glass-location?s=solid'>example</a>
         */
        MAGNIFYING_GLASS_LOCATION,
        /**
         * The solid magnifying-glass-minus icon.See <a href='https://fontawesome.com/v6/icons/magnifying-glass-minus?s=solid'>example</a>
         */
        MAGNIFYING_GLASS_MINUS,
        /**
         * The solid magnifying-glass-plus icon.See <a href='https://fontawesome.com/v6/icons/magnifying-glass-plus?s=solid'>example</a>
         */
        MAGNIFYING_GLASS_PLUS,
        /**
         * The solid mail-bulk icon.See <a href='https://fontawesome.com/v6/icons/mail-bulk?s=solid'>example</a>
         */
        MAIL_BULK,
        /**
         * The solid mail-forward icon.See <a href='https://fontawesome.com/v6/icons/mail-forward?s=solid'>example</a>
         */
        MAIL_FORWARD,
        /**
         * The solid mail-reply icon.See <a href='https://fontawesome.com/v6/icons/mail-reply?s=solid'>example</a>
         */
        MAIL_REPLY,
        /**
         * The solid mail-reply-all icon.See <a href='https://fontawesome.com/v6/icons/mail-reply-all?s=solid'>example</a>
         */
        MAIL_REPLY_ALL,
        /**
         * The solid male icon.See <a href='https://fontawesome.com/v6/icons/male?s=solid'>example</a>
         */
        MALE,
        /**
         * The solid manat-sign icon.See <a href='https://fontawesome.com/v6/icons/manat-sign?s=solid'>example</a>
         */
        MANAT_SIGN,
        /**
         * The solid map icon.See <a href='https://fontawesome.com/v6/icons/map?s=solid'>example</a>
         */
        MAP,
        /**
         * The solid map-location icon.See <a href='https://fontawesome.com/v6/icons/map-location?s=solid'>example</a>
         */
        MAP_LOCATION,
        /**
         * The solid map-location-dot icon.See <a href='https://fontawesome.com/v6/icons/map-location-dot?s=solid'>example</a>
         */
        MAP_LOCATION_DOT,
        /**
         * The solid map-marked icon.See <a href='https://fontawesome.com/v6/icons/map-marked?s=solid'>example</a>
         */
        MAP_MARKED,
        /**
         * The solid map-marked-alt icon.See <a href='https://fontawesome.com/v6/icons/map-marked-alt?s=solid'>example</a>
         */
        MAP_MARKED_ALT,
        /**
         * The solid map-marker icon.See <a href='https://fontawesome.com/v6/icons/map-marker?s=solid'>example</a>
         */
        MAP_MARKER,
        /**
         * The solid map-marker-alt icon.See <a href='https://fontawesome.com/v6/icons/map-marker-alt?s=solid'>example</a>
         */
        MAP_MARKER_ALT,
        /**
         * The solid map-pin icon.See <a href='https://fontawesome.com/v6/icons/map-pin?s=solid'>example</a>
         */
        MAP_PIN,
        /**
         * The solid map-signs icon.See <a href='https://fontawesome.com/v6/icons/map-signs?s=solid'>example</a>
         */
        MAP_SIGNS,
        /**
         * The solid marker icon.See <a href='https://fontawesome.com/v6/icons/marker?s=solid'>example</a>
         */
        MARKER,
        /**
         * The solid mars icon.See <a href='https://fontawesome.com/v6/icons/mars?s=solid'>example</a>
         */
        MARS,
        /**
         * The solid mars-and-venus icon.See <a href='https://fontawesome.com/v6/icons/mars-and-venus?s=solid'>example</a>
         */
        MARS_AND_VENUS,
        /**
         * The solid mars-and-venus-burst icon.See <a href='https://fontawesome.com/v6/icons/mars-and-venus-burst?s=solid'>example</a>
         */
        MARS_AND_VENUS_BURST,
        /**
         * The solid mars-double icon.See <a href='https://fontawesome.com/v6/icons/mars-double?s=solid'>example</a>
         */
        MARS_DOUBLE,
        /**
         * The solid mars-stroke icon.See <a href='https://fontawesome.com/v6/icons/mars-stroke?s=solid'>example</a>
         */
        MARS_STROKE,
        /**
         * The solid mars-stroke-h icon.See <a href='https://fontawesome.com/v6/icons/mars-stroke-h?s=solid'>example</a>
         */
        MARS_STROKE_H,
        /**
         * The solid mars-stroke-right icon.See <a href='https://fontawesome.com/v6/icons/mars-stroke-right?s=solid'>example</a>
         */
        MARS_STROKE_RIGHT,
        /**
         * The solid mars-stroke-up icon.See <a href='https://fontawesome.com/v6/icons/mars-stroke-up?s=solid'>example</a>
         */
        MARS_STROKE_UP,
        /**
         * The solid mars-stroke-v icon.See <a href='https://fontawesome.com/v6/icons/mars-stroke-v?s=solid'>example</a>
         */
        MARS_STROKE_V,
        /**
         * The solid martini-glass icon.See <a href='https://fontawesome.com/v6/icons/martini-glass?s=solid'>example</a>
         */
        MARTINI_GLASS,
        /**
         * The solid martini-glass-citrus icon.See <a href='https://fontawesome.com/v6/icons/martini-glass-citrus?s=solid'>example</a>
         */
        MARTINI_GLASS_CITRUS,
        /**
         * The solid martini-glass-empty icon.See <a href='https://fontawesome.com/v6/icons/martini-glass-empty?s=solid'>example</a>
         */
        MARTINI_GLASS_EMPTY,
        /**
         * The solid mask icon.See <a href='https://fontawesome.com/v6/icons/mask?s=solid'>example</a>
         */
        MASK,
        /**
         * The solid mask-face icon.See <a href='https://fontawesome.com/v6/icons/mask-face?s=solid'>example</a>
         */
        MASK_FACE,
        /**
         * The solid mask-ventilator icon.See <a href='https://fontawesome.com/v6/icons/mask-ventilator?s=solid'>example</a>
         */
        MASK_VENTILATOR,
        /**
         * The solid masks-theater icon.See <a href='https://fontawesome.com/v6/icons/masks-theater?s=solid'>example</a>
         */
        MASKS_THEATER,
        /**
         * The solid mattress-pillow icon.See <a href='https://fontawesome.com/v6/icons/mattress-pillow?s=solid'>example</a>
         */
        MATTRESS_PILLOW,
        /**
         * The solid maximize icon.See <a href='https://fontawesome.com/v6/icons/maximize?s=solid'>example</a>
         */
        MAXIMIZE,
        /**
         * The solid medal icon.See <a href='https://fontawesome.com/v6/icons/medal?s=solid'>example</a>
         */
        MEDAL,
        /**
         * The solid medkit icon.See <a href='https://fontawesome.com/v6/icons/medkit?s=solid'>example</a>
         */
        MEDKIT,
        /**
         * The solid meh icon.See <a href='https://fontawesome.com/v6/icons/meh?s=solid'>example</a>
         */
        MEH,
        /**
         * The solid meh-blank icon.See <a href='https://fontawesome.com/v6/icons/meh-blank?s=solid'>example</a>
         */
        MEH_BLANK,
        /**
         * The solid meh-rolling-eyes icon.See <a href='https://fontawesome.com/v6/icons/meh-rolling-eyes?s=solid'>example</a>
         */
        MEH_ROLLING_EYES,
        /**
         * The solid memory icon.See <a href='https://fontawesome.com/v6/icons/memory?s=solid'>example</a>
         */
        MEMORY,
        /**
         * The solid menorah icon.See <a href='https://fontawesome.com/v6/icons/menorah?s=solid'>example</a>
         */
        MENORAH,
        /**
         * The solid mercury icon.See <a href='https://fontawesome.com/v6/icons/mercury?s=solid'>example</a>
         */
        MERCURY,
        /**
         * The solid message icon.See <a href='https://fontawesome.com/v6/icons/message?s=solid'>example</a>
         */
        MESSAGE,
        /**
         * The solid meteor icon.See <a href='https://fontawesome.com/v6/icons/meteor?s=solid'>example</a>
         */
        METEOR,
        /**
         * The solid microchip icon.See <a href='https://fontawesome.com/v6/icons/microchip?s=solid'>example</a>
         */
        MICROCHIP,
        /**
         * The solid microphone icon.See <a href='https://fontawesome.com/v6/icons/microphone?s=solid'>example</a>
         */
        MICROPHONE,
        /**
         * The solid microphone-alt icon.See <a href='https://fontawesome.com/v6/icons/microphone-alt?s=solid'>example</a>
         */
        MICROPHONE_ALT,
        /**
         * The solid microphone-alt-slash icon.See <a href='https://fontawesome.com/v6/icons/microphone-alt-slash?s=solid'>example</a>
         */
        MICROPHONE_ALT_SLASH,
        /**
         * The solid microphone-lines icon.See <a href='https://fontawesome.com/v6/icons/microphone-lines?s=solid'>example</a>
         */
        MICROPHONE_LINES,
        /**
         * The solid microphone-lines-slash icon.See <a href='https://fontawesome.com/v6/icons/microphone-lines-slash?s=solid'>example</a>
         */
        MICROPHONE_LINES_SLASH,
        /**
         * The solid microphone-slash icon.See <a href='https://fontawesome.com/v6/icons/microphone-slash?s=solid'>example</a>
         */
        MICROPHONE_SLASH,
        /**
         * The solid microscope icon.See <a href='https://fontawesome.com/v6/icons/microscope?s=solid'>example</a>
         */
        MICROSCOPE,
        /**
         * The solid mill-sign icon.See <a href='https://fontawesome.com/v6/icons/mill-sign?s=solid'>example</a>
         */
        MILL_SIGN,
        /**
         * The solid minimize icon.See <a href='https://fontawesome.com/v6/icons/minimize?s=solid'>example</a>
         */
        MINIMIZE,
        /**
         * The solid minus icon.See <a href='https://fontawesome.com/v6/icons/minus?s=solid'>example</a>
         */
        MINUS,
        /**
         * The solid minus-circle icon.See <a href='https://fontawesome.com/v6/icons/minus-circle?s=solid'>example</a>
         */
        MINUS_CIRCLE,
        /**
         * The solid minus-square icon.See <a href='https://fontawesome.com/v6/icons/minus-square?s=solid'>example</a>
         */
        MINUS_SQUARE,
        /**
         * The solid mitten icon.See <a href='https://fontawesome.com/v6/icons/mitten?s=solid'>example</a>
         */
        MITTEN,
        /**
         * The solid mobile icon.See <a href='https://fontawesome.com/v6/icons/mobile?s=solid'>example</a>
         */
        MOBILE,
        /**
         * The solid mobile-alt icon.See <a href='https://fontawesome.com/v6/icons/mobile-alt?s=solid'>example</a>
         */
        MOBILE_ALT,
        /**
         * The solid mobile-android icon.See <a href='https://fontawesome.com/v6/icons/mobile-android?s=solid'>example</a>
         */
        MOBILE_ANDROID,
        /**
         * The solid mobile-android-alt icon.See <a href='https://fontawesome.com/v6/icons/mobile-android-alt?s=solid'>example</a>
         */
        MOBILE_ANDROID_ALT,
        /**
         * The solid mobile-button icon.See <a href='https://fontawesome.com/v6/icons/mobile-button?s=solid'>example</a>
         */
        MOBILE_BUTTON,
        /**
         * The solid mobile-phone icon.See <a href='https://fontawesome.com/v6/icons/mobile-phone?s=solid'>example</a>
         */
        MOBILE_PHONE,
        /**
         * The solid mobile-retro icon.See <a href='https://fontawesome.com/v6/icons/mobile-retro?s=solid'>example</a>
         */
        MOBILE_RETRO,
        /**
         * The solid mobile-screen icon.See <a href='https://fontawesome.com/v6/icons/mobile-screen?s=solid'>example</a>
         */
        MOBILE_SCREEN,
        /**
         * The solid mobile-screen-button icon.See <a href='https://fontawesome.com/v6/icons/mobile-screen-button?s=solid'>example</a>
         */
        MOBILE_SCREEN_BUTTON,
        /**
         * The solid money-bill icon.See <a href='https://fontawesome.com/v6/icons/money-bill?s=solid'>example</a>
         */
        MONEY_BILL,
        /**
         * The solid money-bill-1 icon.See <a href='https://fontawesome.com/v6/icons/money-bill-1?s=solid'>example</a>
         */
        MONEY_BILL_1,
        /**
         * The solid money-bill-1-wave icon.See <a href='https://fontawesome.com/v6/icons/money-bill-1-wave?s=solid'>example</a>
         */
        MONEY_BILL_1_WAVE,
        /**
         * The solid money-bill-alt icon.See <a href='https://fontawesome.com/v6/icons/money-bill-alt?s=solid'>example</a>
         */
        MONEY_BILL_ALT,
        /**
         * The solid money-bill-transfer icon.See <a href='https://fontawesome.com/v6/icons/money-bill-transfer?s=solid'>example</a>
         */
        MONEY_BILL_TRANSFER,
        /**
         * The solid money-bill-trend-up icon.See <a href='https://fontawesome.com/v6/icons/money-bill-trend-up?s=solid'>example</a>
         */
        MONEY_BILL_TREND_UP,
        /**
         * The solid money-bill-wave icon.See <a href='https://fontawesome.com/v6/icons/money-bill-wave?s=solid'>example</a>
         */
        MONEY_BILL_WAVE,
        /**
         * The solid money-bill-wave-alt icon.See <a href='https://fontawesome.com/v6/icons/money-bill-wave-alt?s=solid'>example</a>
         */
        MONEY_BILL_WAVE_ALT,
        /**
         * The solid money-bill-wheat icon.See <a href='https://fontawesome.com/v6/icons/money-bill-wheat?s=solid'>example</a>
         */
        MONEY_BILL_WHEAT,
        /**
         * The solid money-bills icon.See <a href='https://fontawesome.com/v6/icons/money-bills?s=solid'>example</a>
         */
        MONEY_BILLS,
        /**
         * The solid money-check icon.See <a href='https://fontawesome.com/v6/icons/money-check?s=solid'>example</a>
         */
        MONEY_CHECK,
        /**
         * The solid money-check-alt icon.See <a href='https://fontawesome.com/v6/icons/money-check-alt?s=solid'>example</a>
         */
        MONEY_CHECK_ALT,
        /**
         * The solid money-check-dollar icon.See <a href='https://fontawesome.com/v6/icons/money-check-dollar?s=solid'>example</a>
         */
        MONEY_CHECK_DOLLAR,
        /**
         * The solid monument icon.See <a href='https://fontawesome.com/v6/icons/monument?s=solid'>example</a>
         */
        MONUMENT,
        /**
         * The solid moon icon.See <a href='https://fontawesome.com/v6/icons/moon?s=solid'>example</a>
         */
        MOON,
        /**
         * The solid mortar-board icon.See <a href='https://fontawesome.com/v6/icons/mortar-board?s=solid'>example</a>
         */
        MORTAR_BOARD,
        /**
         * The solid mortar-pestle icon.See <a href='https://fontawesome.com/v6/icons/mortar-pestle?s=solid'>example</a>
         */
        MORTAR_PESTLE,
        /**
         * The solid mosque icon.See <a href='https://fontawesome.com/v6/icons/mosque?s=solid'>example</a>
         */
        MOSQUE,
        /**
         * The solid mosquito icon.See <a href='https://fontawesome.com/v6/icons/mosquito?s=solid'>example</a>
         */
        MOSQUITO,
        /**
         * The solid mosquito-net icon.See <a href='https://fontawesome.com/v6/icons/mosquito-net?s=solid'>example</a>
         */
        MOSQUITO_NET,
        /**
         * The solid motorcycle icon.See <a href='https://fontawesome.com/v6/icons/motorcycle?s=solid'>example</a>
         */
        MOTORCYCLE,
        /**
         * The solid mound icon.See <a href='https://fontawesome.com/v6/icons/mound?s=solid'>example</a>
         */
        MOUND,
        /**
         * The solid mountain icon.See <a href='https://fontawesome.com/v6/icons/mountain?s=solid'>example</a>
         */
        MOUNTAIN,
        /**
         * The solid mountain-city icon.See <a href='https://fontawesome.com/v6/icons/mountain-city?s=solid'>example</a>
         */
        MOUNTAIN_CITY,
        /**
         * The solid mountain-sun icon.See <a href='https://fontawesome.com/v6/icons/mountain-sun?s=solid'>example</a>
         */
        MOUNTAIN_SUN,
        /**
         * The solid mouse icon.See <a href='https://fontawesome.com/v6/icons/mouse?s=solid'>example</a>
         */
        MOUSE,
        /**
         * The solid mouse-pointer icon.See <a href='https://fontawesome.com/v6/icons/mouse-pointer?s=solid'>example</a>
         */
        MOUSE_POINTER,
        /**
         * The solid mug-hot icon.See <a href='https://fontawesome.com/v6/icons/mug-hot?s=solid'>example</a>
         */
        MUG_HOT,
        /**
         * The solid mug-saucer icon.See <a href='https://fontawesome.com/v6/icons/mug-saucer?s=solid'>example</a>
         */
        MUG_SAUCER,
        /**
         * The solid multiply icon.See <a href='https://fontawesome.com/v6/icons/multiply?s=solid'>example</a>
         */
        MULTIPLY,
        /**
         * The solid museum icon.See <a href='https://fontawesome.com/v6/icons/museum?s=solid'>example</a>
         */
        MUSEUM,
        /**
         * The solid music icon.See <a href='https://fontawesome.com/v6/icons/music?s=solid'>example</a>
         */
        MUSIC,
        /**
         * The solid n icon.See <a href='https://fontawesome.com/v6/icons/n?s=solid'>example</a>
         */
        N,
        /**
         * The solid naira-sign icon.See <a href='https://fontawesome.com/v6/icons/naira-sign?s=solid'>example</a>
         */
        NAIRA_SIGN,
        /**
         * The solid navicon icon.See <a href='https://fontawesome.com/v6/icons/navicon?s=solid'>example</a>
         */
        NAVICON,
        /**
         * The solid network-wired icon.See <a href='https://fontawesome.com/v6/icons/network-wired?s=solid'>example</a>
         */
        NETWORK_WIRED,
        /**
         * The solid neuter icon.See <a href='https://fontawesome.com/v6/icons/neuter?s=solid'>example</a>
         */
        NEUTER,
        /**
         * The solid newspaper icon.See <a href='https://fontawesome.com/v6/icons/newspaper?s=solid'>example</a>
         */
        NEWSPAPER,
        /**
         * The solid not-equal icon.See <a href='https://fontawesome.com/v6/icons/not-equal?s=solid'>example</a>
         */
        NOT_EQUAL,
        /**
         * The solid notdef icon.See <a href='https://fontawesome.com/v6/icons/notdef?s=solid'>example</a>
         */
        NOTDEF,
        /**
         * The solid note-sticky icon.See <a href='https://fontawesome.com/v6/icons/note-sticky?s=solid'>example</a>
         */
        NOTE_STICKY,
        /**
         * The solid notes-medical icon.See <a href='https://fontawesome.com/v6/icons/notes-medical?s=solid'>example</a>
         */
        NOTES_MEDICAL,
        /**
         * The solid o icon.See <a href='https://fontawesome.com/v6/icons/o?s=solid'>example</a>
         */
        O,
        /**
         * The solid object-group icon.See <a href='https://fontawesome.com/v6/icons/object-group?s=solid'>example</a>
         */
        OBJECT_GROUP,
        /**
         * The solid object-ungroup icon.See <a href='https://fontawesome.com/v6/icons/object-ungroup?s=solid'>example</a>
         */
        OBJECT_UNGROUP,
        /**
         * The solid oil-can icon.See <a href='https://fontawesome.com/v6/icons/oil-can?s=solid'>example</a>
         */
        OIL_CAN,
        /**
         * The solid oil-well icon.See <a href='https://fontawesome.com/v6/icons/oil-well?s=solid'>example</a>
         */
        OIL_WELL,
        /**
         * The solid om icon.See <a href='https://fontawesome.com/v6/icons/om?s=solid'>example</a>
         */
        OM,
        /**
         * The solid otter icon.See <a href='https://fontawesome.com/v6/icons/otter?s=solid'>example</a>
         */
        OTTER,
        /**
         * The solid outdent icon.See <a href='https://fontawesome.com/v6/icons/outdent?s=solid'>example</a>
         */
        OUTDENT,
        /**
         * The solid p icon.See <a href='https://fontawesome.com/v6/icons/p?s=solid'>example</a>
         */
        P,
        /**
         * The solid pager icon.See <a href='https://fontawesome.com/v6/icons/pager?s=solid'>example</a>
         */
        PAGER,
        /**
         * The solid paint-brush icon.See <a href='https://fontawesome.com/v6/icons/paint-brush?s=solid'>example</a>
         */
        PAINT_BRUSH,
        /**
         * The solid paint-roller icon.See <a href='https://fontawesome.com/v6/icons/paint-roller?s=solid'>example</a>
         */
        PAINT_ROLLER,
        /**
         * The solid paintbrush icon.See <a href='https://fontawesome.com/v6/icons/paintbrush?s=solid'>example</a>
         */
        PAINTBRUSH,
        /**
         * The solid palette icon.See <a href='https://fontawesome.com/v6/icons/palette?s=solid'>example</a>
         */
        PALETTE,
        /**
         * The solid pallet icon.See <a href='https://fontawesome.com/v6/icons/pallet?s=solid'>example</a>
         */
        PALLET,
        /**
         * The solid panorama icon.See <a href='https://fontawesome.com/v6/icons/panorama?s=solid'>example</a>
         */
        PANORAMA,
        /**
         * The solid paper-plane icon.See <a href='https://fontawesome.com/v6/icons/paper-plane?s=solid'>example</a>
         */
        PAPER_PLANE,
        /**
         * The solid paperclip icon.See <a href='https://fontawesome.com/v6/icons/paperclip?s=solid'>example</a>
         */
        PAPERCLIP,
        /**
         * The solid parachute-box icon.See <a href='https://fontawesome.com/v6/icons/parachute-box?s=solid'>example</a>
         */
        PARACHUTE_BOX,
        /**
         * The solid paragraph icon.See <a href='https://fontawesome.com/v6/icons/paragraph?s=solid'>example</a>
         */
        PARAGRAPH,
        /**
         * The solid parking icon.See <a href='https://fontawesome.com/v6/icons/parking?s=solid'>example</a>
         */
        PARKING,
        /**
         * The solid passport icon.See <a href='https://fontawesome.com/v6/icons/passport?s=solid'>example</a>
         */
        PASSPORT,
        /**
         * The solid pastafarianism icon.See <a href='https://fontawesome.com/v6/icons/pastafarianism?s=solid'>example</a>
         */
        PASTAFARIANISM,
        /**
         * The solid paste icon.See <a href='https://fontawesome.com/v6/icons/paste?s=solid'>example</a>
         */
        PASTE,
        /**
         * The solid pause icon.See <a href='https://fontawesome.com/v6/icons/pause?s=solid'>example</a>
         */
        PAUSE,
        /**
         * The solid pause-circle icon.See <a href='https://fontawesome.com/v6/icons/pause-circle?s=solid'>example</a>
         */
        PAUSE_CIRCLE,
        /**
         * The solid paw icon.See <a href='https://fontawesome.com/v6/icons/paw?s=solid'>example</a>
         */
        PAW,
        /**
         * The solid peace icon.See <a href='https://fontawesome.com/v6/icons/peace?s=solid'>example</a>
         */
        PEACE,
        /**
         * The solid pen icon.See <a href='https://fontawesome.com/v6/icons/pen?s=solid'>example</a>
         */
        PEN,
        /**
         * The solid pen-alt icon.See <a href='https://fontawesome.com/v6/icons/pen-alt?s=solid'>example</a>
         */
        PEN_ALT,
        /**
         * The solid pen-clip icon.See <a href='https://fontawesome.com/v6/icons/pen-clip?s=solid'>example</a>
         */
        PEN_CLIP,
        /**
         * The solid pen-fancy icon.See <a href='https://fontawesome.com/v6/icons/pen-fancy?s=solid'>example</a>
         */
        PEN_FANCY,
        /**
         * The solid pen-nib icon.See <a href='https://fontawesome.com/v6/icons/pen-nib?s=solid'>example</a>
         */
        PEN_NIB,
        /**
         * The solid pen-ruler icon.See <a href='https://fontawesome.com/v6/icons/pen-ruler?s=solid'>example</a>
         */
        PEN_RULER,
        /**
         * The solid pen-square icon.See <a href='https://fontawesome.com/v6/icons/pen-square?s=solid'>example</a>
         */
        PEN_SQUARE,
        /**
         * The solid pen-to-square icon.See <a href='https://fontawesome.com/v6/icons/pen-to-square?s=solid'>example</a>
         */
        PEN_TO_SQUARE,
        /**
         * The solid pencil icon.See <a href='https://fontawesome.com/v6/icons/pencil?s=solid'>example</a>
         */
        PENCIL,
        /**
         * The solid pencil-alt icon.See <a href='https://fontawesome.com/v6/icons/pencil-alt?s=solid'>example</a>
         */
        PENCIL_ALT,
        /**
         * The solid pencil-ruler icon.See <a href='https://fontawesome.com/v6/icons/pencil-ruler?s=solid'>example</a>
         */
        PENCIL_RULER,
        /**
         * The solid pencil-square icon.See <a href='https://fontawesome.com/v6/icons/pencil-square?s=solid'>example</a>
         */
        PENCIL_SQUARE,
        /**
         * The solid people-arrows icon.See <a href='https://fontawesome.com/v6/icons/people-arrows?s=solid'>example</a>
         */
        PEOPLE_ARROWS,
        /**
         * The solid people-arrows-left-right icon.See <a href='https://fontawesome.com/v6/icons/people-arrows-left-right?s=solid'>example</a>
         */
        PEOPLE_ARROWS_LEFT_RIGHT,
        /**
         * The solid people-carry icon.See <a href='https://fontawesome.com/v6/icons/people-carry?s=solid'>example</a>
         */
        PEOPLE_CARRY,
        /**
         * The solid people-carry-box icon.See <a href='https://fontawesome.com/v6/icons/people-carry-box?s=solid'>example</a>
         */
        PEOPLE_CARRY_BOX,
        /**
         * The solid people-group icon.See <a href='https://fontawesome.com/v6/icons/people-group?s=solid'>example</a>
         */
        PEOPLE_GROUP,
        /**
         * The solid people-line icon.See <a href='https://fontawesome.com/v6/icons/people-line?s=solid'>example</a>
         */
        PEOPLE_LINE,
        /**
         * The solid people-pulling icon.See <a href='https://fontawesome.com/v6/icons/people-pulling?s=solid'>example</a>
         */
        PEOPLE_PULLING,
        /**
         * The solid people-robbery icon.See <a href='https://fontawesome.com/v6/icons/people-robbery?s=solid'>example</a>
         */
        PEOPLE_ROBBERY,
        /**
         * The solid people-roof icon.See <a href='https://fontawesome.com/v6/icons/people-roof?s=solid'>example</a>
         */
        PEOPLE_ROOF,
        /**
         * The solid pepper-hot icon.See <a href='https://fontawesome.com/v6/icons/pepper-hot?s=solid'>example</a>
         */
        PEPPER_HOT,
        /**
         * The solid percent icon.See <a href='https://fontawesome.com/v6/icons/percent?s=solid'>example</a>
         */
        PERCENT,
        /**
         * The solid percentage icon.See <a href='https://fontawesome.com/v6/icons/percentage?s=solid'>example</a>
         */
        PERCENTAGE,
        /**
         * The solid person icon.See <a href='https://fontawesome.com/v6/icons/person?s=solid'>example</a>
         */
        PERSON,
        /**
         * The solid person-arrow-down-to-line icon.See <a href='https://fontawesome.com/v6/icons/person-arrow-down-to-line?s=solid'>example</a>
         */
        PERSON_ARROW_DOWN_TO_LINE,
        /**
         * The solid person-arrow-up-from-line icon.See <a href='https://fontawesome.com/v6/icons/person-arrow-up-from-line?s=solid'>example</a>
         */
        PERSON_ARROW_UP_FROM_LINE,
        /**
         * The solid person-biking icon.See <a href='https://fontawesome.com/v6/icons/person-biking?s=solid'>example</a>
         */
        PERSON_BIKING,
        /**
         * The solid person-booth icon.See <a href='https://fontawesome.com/v6/icons/person-booth?s=solid'>example</a>
         */
        PERSON_BOOTH,
        /**
         * The solid person-breastfeeding icon.See <a href='https://fontawesome.com/v6/icons/person-breastfeeding?s=solid'>example</a>
         */
        PERSON_BREASTFEEDING,
        /**
         * The solid person-burst icon.See <a href='https://fontawesome.com/v6/icons/person-burst?s=solid'>example</a>
         */
        PERSON_BURST,
        /**
         * The solid person-cane icon.See <a href='https://fontawesome.com/v6/icons/person-cane?s=solid'>example</a>
         */
        PERSON_CANE,
        /**
         * The solid person-chalkboard icon.See <a href='https://fontawesome.com/v6/icons/person-chalkboard?s=solid'>example</a>
         */
        PERSON_CHALKBOARD,
        /**
         * The solid person-circle-check icon.See <a href='https://fontawesome.com/v6/icons/person-circle-check?s=solid'>example</a>
         */
        PERSON_CIRCLE_CHECK,
        /**
         * The solid person-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/person-circle-exclamation?s=solid'>example</a>
         */
        PERSON_CIRCLE_EXCLAMATION,
        /**
         * The solid person-circle-minus icon.See <a href='https://fontawesome.com/v6/icons/person-circle-minus?s=solid'>example</a>
         */
        PERSON_CIRCLE_MINUS,
        /**
         * The solid person-circle-plus icon.See <a href='https://fontawesome.com/v6/icons/person-circle-plus?s=solid'>example</a>
         */
        PERSON_CIRCLE_PLUS,
        /**
         * The solid person-circle-question icon.See <a href='https://fontawesome.com/v6/icons/person-circle-question?s=solid'>example</a>
         */
        PERSON_CIRCLE_QUESTION,
        /**
         * The solid person-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/person-circle-xmark?s=solid'>example</a>
         */
        PERSON_CIRCLE_XMARK,
        /**
         * The solid person-digging icon.See <a href='https://fontawesome.com/v6/icons/person-digging?s=solid'>example</a>
         */
        PERSON_DIGGING,
        /**
         * The solid person-dots-from-line icon.See <a href='https://fontawesome.com/v6/icons/person-dots-from-line?s=solid'>example</a>
         */
        PERSON_DOTS_FROM_LINE,
        /**
         * The solid person-dress icon.See <a href='https://fontawesome.com/v6/icons/person-dress?s=solid'>example</a>
         */
        PERSON_DRESS,
        /**
         * The solid person-dress-burst icon.See <a href='https://fontawesome.com/v6/icons/person-dress-burst?s=solid'>example</a>
         */
        PERSON_DRESS_BURST,
        /**
         * The solid person-drowning icon.See <a href='https://fontawesome.com/v6/icons/person-drowning?s=solid'>example</a>
         */
        PERSON_DROWNING,
        /**
         * The solid person-falling icon.See <a href='https://fontawesome.com/v6/icons/person-falling?s=solid'>example</a>
         */
        PERSON_FALLING,
        /**
         * The solid person-falling-burst icon.See <a href='https://fontawesome.com/v6/icons/person-falling-burst?s=solid'>example</a>
         */
        PERSON_FALLING_BURST,
        /**
         * The solid person-half-dress icon.See <a href='https://fontawesome.com/v6/icons/person-half-dress?s=solid'>example</a>
         */
        PERSON_HALF_DRESS,
        /**
         * The solid person-harassing icon.See <a href='https://fontawesome.com/v6/icons/person-harassing?s=solid'>example</a>
         */
        PERSON_HARASSING,
        /**
         * The solid person-hiking icon.See <a href='https://fontawesome.com/v6/icons/person-hiking?s=solid'>example</a>
         */
        PERSON_HIKING,
        /**
         * The solid person-military-pointing icon.See <a href='https://fontawesome.com/v6/icons/person-military-pointing?s=solid'>example</a>
         */
        PERSON_MILITARY_POINTING,
        /**
         * The solid person-military-rifle icon.See <a href='https://fontawesome.com/v6/icons/person-military-rifle?s=solid'>example</a>
         */
        PERSON_MILITARY_RIFLE,
        /**
         * The solid person-military-to-person icon.See <a href='https://fontawesome.com/v6/icons/person-military-to-person?s=solid'>example</a>
         */
        PERSON_MILITARY_TO_PERSON,
        /**
         * The solid person-praying icon.See <a href='https://fontawesome.com/v6/icons/person-praying?s=solid'>example</a>
         */
        PERSON_PRAYING,
        /**
         * The solid person-pregnant icon.See <a href='https://fontawesome.com/v6/icons/person-pregnant?s=solid'>example</a>
         */
        PERSON_PREGNANT,
        /**
         * The solid person-rays icon.See <a href='https://fontawesome.com/v6/icons/person-rays?s=solid'>example</a>
         */
        PERSON_RAYS,
        /**
         * The solid person-rifle icon.See <a href='https://fontawesome.com/v6/icons/person-rifle?s=solid'>example</a>
         */
        PERSON_RIFLE,
        /**
         * The solid person-running icon.See <a href='https://fontawesome.com/v6/icons/person-running?s=solid'>example</a>
         */
        PERSON_RUNNING,
        /**
         * The solid person-shelter icon.See <a href='https://fontawesome.com/v6/icons/person-shelter?s=solid'>example</a>
         */
        PERSON_SHELTER,
        /**
         * The solid person-skating icon.See <a href='https://fontawesome.com/v6/icons/person-skating?s=solid'>example</a>
         */
        PERSON_SKATING,
        /**
         * The solid person-skiing icon.See <a href='https://fontawesome.com/v6/icons/person-skiing?s=solid'>example</a>
         */
        PERSON_SKIING,
        /**
         * The solid person-skiing-nordic icon.See <a href='https://fontawesome.com/v6/icons/person-skiing-nordic?s=solid'>example</a>
         */
        PERSON_SKIING_NORDIC,
        /**
         * The solid person-snowboarding icon.See <a href='https://fontawesome.com/v6/icons/person-snowboarding?s=solid'>example</a>
         */
        PERSON_SNOWBOARDING,
        /**
         * The solid person-swimming icon.See <a href='https://fontawesome.com/v6/icons/person-swimming?s=solid'>example</a>
         */
        PERSON_SWIMMING,
        /**
         * The solid person-through-window icon.See <a href='https://fontawesome.com/v6/icons/person-through-window?s=solid'>example</a>
         */
        PERSON_THROUGH_WINDOW,
        /**
         * The solid person-walking icon.See <a href='https://fontawesome.com/v6/icons/person-walking?s=solid'>example</a>
         */
        PERSON_WALKING,
        /**
         * The solid person-walking-arrow-loop-left icon.See <a href='https://fontawesome.com/v6/icons/person-walking-arrow-loop-left?s=solid'>example</a>
         */
        PERSON_WALKING_ARROW_LOOP_LEFT,
        /**
         * The solid person-walking-arrow-right icon.See <a href='https://fontawesome.com/v6/icons/person-walking-arrow-right?s=solid'>example</a>
         */
        PERSON_WALKING_ARROW_RIGHT,
        /**
         * The solid person-walking-dashed-line-arrow-right icon.See <a href='https://fontawesome.com/v6/icons/person-walking-dashed-line-arrow-right?s=solid'>example</a>
         */
        PERSON_WALKING_DASHED_LINE_ARROW_RIGHT,
        /**
         * The solid person-walking-luggage icon.See <a href='https://fontawesome.com/v6/icons/person-walking-luggage?s=solid'>example</a>
         */
        PERSON_WALKING_LUGGAGE,
        /**
         * The solid person-walking-with-cane icon.See <a href='https://fontawesome.com/v6/icons/person-walking-with-cane?s=solid'>example</a>
         */
        PERSON_WALKING_WITH_CANE,
        /**
         * The solid peseta-sign icon.See <a href='https://fontawesome.com/v6/icons/peseta-sign?s=solid'>example</a>
         */
        PESETA_SIGN,
        /**
         * The solid peso-sign icon.See <a href='https://fontawesome.com/v6/icons/peso-sign?s=solid'>example</a>
         */
        PESO_SIGN,
        /**
         * The solid phone icon.See <a href='https://fontawesome.com/v6/icons/phone?s=solid'>example</a>
         */
        PHONE,
        /**
         * The solid phone-alt icon.See <a href='https://fontawesome.com/v6/icons/phone-alt?s=solid'>example</a>
         */
        PHONE_ALT,
        /**
         * The solid phone-flip icon.See <a href='https://fontawesome.com/v6/icons/phone-flip?s=solid'>example</a>
         */
        PHONE_FLIP,
        /**
         * The solid phone-slash icon.See <a href='https://fontawesome.com/v6/icons/phone-slash?s=solid'>example</a>
         */
        PHONE_SLASH,
        /**
         * The solid phone-square icon.See <a href='https://fontawesome.com/v6/icons/phone-square?s=solid'>example</a>
         */
        PHONE_SQUARE,
        /**
         * The solid phone-square-alt icon.See <a href='https://fontawesome.com/v6/icons/phone-square-alt?s=solid'>example</a>
         */
        PHONE_SQUARE_ALT,
        /**
         * The solid phone-volume icon.See <a href='https://fontawesome.com/v6/icons/phone-volume?s=solid'>example</a>
         */
        PHONE_VOLUME,
        /**
         * The solid photo-film icon.See <a href='https://fontawesome.com/v6/icons/photo-film?s=solid'>example</a>
         */
        PHOTO_FILM,
        /**
         * The solid photo-video icon.See <a href='https://fontawesome.com/v6/icons/photo-video?s=solid'>example</a>
         */
        PHOTO_VIDEO,
        /**
         * The solid pie-chart icon.See <a href='https://fontawesome.com/v6/icons/pie-chart?s=solid'>example</a>
         */
        PIE_CHART,
        /**
         * The solid piggy-bank icon.See <a href='https://fontawesome.com/v6/icons/piggy-bank?s=solid'>example</a>
         */
        PIGGY_BANK,
        /**
         * The solid pills icon.See <a href='https://fontawesome.com/v6/icons/pills?s=solid'>example</a>
         */
        PILLS,
        /**
         * The solid ping-pong-paddle-ball icon.See <a href='https://fontawesome.com/v6/icons/ping-pong-paddle-ball?s=solid'>example</a>
         */
        PING_PONG_PADDLE_BALL,
        /**
         * The solid pizza-slice icon.See <a href='https://fontawesome.com/v6/icons/pizza-slice?s=solid'>example</a>
         */
        PIZZA_SLICE,
        /**
         * The solid place-of-worship icon.See <a href='https://fontawesome.com/v6/icons/place-of-worship?s=solid'>example</a>
         */
        PLACE_OF_WORSHIP,
        /**
         * The solid plane icon.See <a href='https://fontawesome.com/v6/icons/plane?s=solid'>example</a>
         */
        PLANE,
        /**
         * The solid plane-arrival icon.See <a href='https://fontawesome.com/v6/icons/plane-arrival?s=solid'>example</a>
         */
        PLANE_ARRIVAL,
        /**
         * The solid plane-circle-check icon.See <a href='https://fontawesome.com/v6/icons/plane-circle-check?s=solid'>example</a>
         */
        PLANE_CIRCLE_CHECK,
        /**
         * The solid plane-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/plane-circle-exclamation?s=solid'>example</a>
         */
        PLANE_CIRCLE_EXCLAMATION,
        /**
         * The solid plane-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/plane-circle-xmark?s=solid'>example</a>
         */
        PLANE_CIRCLE_XMARK,
        /**
         * The solid plane-departure icon.See <a href='https://fontawesome.com/v6/icons/plane-departure?s=solid'>example</a>
         */
        PLANE_DEPARTURE,
        /**
         * The solid plane-lock icon.See <a href='https://fontawesome.com/v6/icons/plane-lock?s=solid'>example</a>
         */
        PLANE_LOCK,
        /**
         * The solid plane-slash icon.See <a href='https://fontawesome.com/v6/icons/plane-slash?s=solid'>example</a>
         */
        PLANE_SLASH,
        /**
         * The solid plane-up icon.See <a href='https://fontawesome.com/v6/icons/plane-up?s=solid'>example</a>
         */
        PLANE_UP,
        /**
         * The solid plant-wilt icon.See <a href='https://fontawesome.com/v6/icons/plant-wilt?s=solid'>example</a>
         */
        PLANT_WILT,
        /**
         * The solid plate-wheat icon.See <a href='https://fontawesome.com/v6/icons/plate-wheat?s=solid'>example</a>
         */
        PLATE_WHEAT,
        /**
         * The solid play icon.See <a href='https://fontawesome.com/v6/icons/play?s=solid'>example</a>
         */
        PLAY,
        /**
         * The solid play-circle icon.See <a href='https://fontawesome.com/v6/icons/play-circle?s=solid'>example</a>
         */
        PLAY_CIRCLE,
        /**
         * The solid plug icon.See <a href='https://fontawesome.com/v6/icons/plug?s=solid'>example</a>
         */
        PLUG,
        /**
         * The solid plug-circle-bolt icon.See <a href='https://fontawesome.com/v6/icons/plug-circle-bolt?s=solid'>example</a>
         */
        PLUG_CIRCLE_BOLT,
        /**
         * The solid plug-circle-check icon.See <a href='https://fontawesome.com/v6/icons/plug-circle-check?s=solid'>example</a>
         */
        PLUG_CIRCLE_CHECK,
        /**
         * The solid plug-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/plug-circle-exclamation?s=solid'>example</a>
         */
        PLUG_CIRCLE_EXCLAMATION,
        /**
         * The solid plug-circle-minus icon.See <a href='https://fontawesome.com/v6/icons/plug-circle-minus?s=solid'>example</a>
         */
        PLUG_CIRCLE_MINUS,
        /**
         * The solid plug-circle-plus icon.See <a href='https://fontawesome.com/v6/icons/plug-circle-plus?s=solid'>example</a>
         */
        PLUG_CIRCLE_PLUS,
        /**
         * The solid plug-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/plug-circle-xmark?s=solid'>example</a>
         */
        PLUG_CIRCLE_XMARK,
        /**
         * The solid plus icon.See <a href='https://fontawesome.com/v6/icons/plus?s=solid'>example</a>
         */
        PLUS,
        /**
         * The solid plus-circle icon.See <a href='https://fontawesome.com/v6/icons/plus-circle?s=solid'>example</a>
         */
        PLUS_CIRCLE,
        /**
         * The solid plus-minus icon.See <a href='https://fontawesome.com/v6/icons/plus-minus?s=solid'>example</a>
         */
        PLUS_MINUS,
        /**
         * The solid plus-square icon.See <a href='https://fontawesome.com/v6/icons/plus-square?s=solid'>example</a>
         */
        PLUS_SQUARE,
        /**
         * The solid podcast icon.See <a href='https://fontawesome.com/v6/icons/podcast?s=solid'>example</a>
         */
        PODCAST,
        /**
         * The solid poll icon.See <a href='https://fontawesome.com/v6/icons/poll?s=solid'>example</a>
         */
        POLL,
        /**
         * The solid poll-h icon.See <a href='https://fontawesome.com/v6/icons/poll-h?s=solid'>example</a>
         */
        POLL_H,
        /**
         * The solid poo icon.See <a href='https://fontawesome.com/v6/icons/poo?s=solid'>example</a>
         */
        POO,
        /**
         * The solid poo-bolt icon.See <a href='https://fontawesome.com/v6/icons/poo-bolt?s=solid'>example</a>
         */
        POO_BOLT,
        /**
         * The solid poo-storm icon.See <a href='https://fontawesome.com/v6/icons/poo-storm?s=solid'>example</a>
         */
        POO_STORM,
        /**
         * The solid poop icon.See <a href='https://fontawesome.com/v6/icons/poop?s=solid'>example</a>
         */
        POOP,
        /**
         * The solid portrait icon.See <a href='https://fontawesome.com/v6/icons/portrait?s=solid'>example</a>
         */
        PORTRAIT,
        /**
         * The solid pound-sign icon.See <a href='https://fontawesome.com/v6/icons/pound-sign?s=solid'>example</a>
         */
        POUND_SIGN,
        /**
         * The solid power-off icon.See <a href='https://fontawesome.com/v6/icons/power-off?s=solid'>example</a>
         */
        POWER_OFF,
        /**
         * The solid pray icon.See <a href='https://fontawesome.com/v6/icons/pray?s=solid'>example</a>
         */
        PRAY,
        /**
         * The solid praying-hands icon.See <a href='https://fontawesome.com/v6/icons/praying-hands?s=solid'>example</a>
         */
        PRAYING_HANDS,
        /**
         * The solid prescription icon.See <a href='https://fontawesome.com/v6/icons/prescription?s=solid'>example</a>
         */
        PRESCRIPTION,
        /**
         * The solid prescription-bottle icon.See <a href='https://fontawesome.com/v6/icons/prescription-bottle?s=solid'>example</a>
         */
        PRESCRIPTION_BOTTLE,
        /**
         * The solid prescription-bottle-alt icon.See <a href='https://fontawesome.com/v6/icons/prescription-bottle-alt?s=solid'>example</a>
         */
        PRESCRIPTION_BOTTLE_ALT,
        /**
         * The solid prescription-bottle-medical icon.See <a href='https://fontawesome.com/v6/icons/prescription-bottle-medical?s=solid'>example</a>
         */
        PRESCRIPTION_BOTTLE_MEDICAL,
        /**
         * The solid print icon.See <a href='https://fontawesome.com/v6/icons/print?s=solid'>example</a>
         */
        PRINT,
        /**
         * The solid procedures icon.See <a href='https://fontawesome.com/v6/icons/procedures?s=solid'>example</a>
         */
        PROCEDURES,
        /**
         * The solid project-diagram icon.See <a href='https://fontawesome.com/v6/icons/project-diagram?s=solid'>example</a>
         */
        PROJECT_DIAGRAM,
        /**
         * The solid pump-medical icon.See <a href='https://fontawesome.com/v6/icons/pump-medical?s=solid'>example</a>
         */
        PUMP_MEDICAL,
        /**
         * The solid pump-soap icon.See <a href='https://fontawesome.com/v6/icons/pump-soap?s=solid'>example</a>
         */
        PUMP_SOAP,
        /**
         * The solid puzzle-piece icon.See <a href='https://fontawesome.com/v6/icons/puzzle-piece?s=solid'>example</a>
         */
        PUZZLE_PIECE,
        /**
         * The solid q icon.See <a href='https://fontawesome.com/v6/icons/q?s=solid'>example</a>
         */
        Q,
        /**
         * The solid qrcode icon.See <a href='https://fontawesome.com/v6/icons/qrcode?s=solid'>example</a>
         */
        QRCODE,
        /**
         * The solid question icon.See <a href='https://fontawesome.com/v6/icons/question?s=solid'>example</a>
         */
        QUESTION,
        /**
         * The solid question-circle icon.See <a href='https://fontawesome.com/v6/icons/question-circle?s=solid'>example</a>
         */
        QUESTION_CIRCLE,
        /**
         * The solid quidditch icon.See <a href='https://fontawesome.com/v6/icons/quidditch?s=solid'>example</a>
         */
        QUIDDITCH,
        /**
         * The solid quidditch-broom-ball icon.See <a href='https://fontawesome.com/v6/icons/quidditch-broom-ball?s=solid'>example</a>
         */
        QUIDDITCH_BROOM_BALL,
        /**
         * The solid quote-left icon.See <a href='https://fontawesome.com/v6/icons/quote-left?s=solid'>example</a>
         */
        QUOTE_LEFT,
        /**
         * The solid quote-left-alt icon.See <a href='https://fontawesome.com/v6/icons/quote-left-alt?s=solid'>example</a>
         */
        QUOTE_LEFT_ALT,
        /**
         * The solid quote-right icon.See <a href='https://fontawesome.com/v6/icons/quote-right?s=solid'>example</a>
         */
        QUOTE_RIGHT,
        /**
         * The solid quote-right-alt icon.See <a href='https://fontawesome.com/v6/icons/quote-right-alt?s=solid'>example</a>
         */
        QUOTE_RIGHT_ALT,
        /**
         * The solid quran icon.See <a href='https://fontawesome.com/v6/icons/quran?s=solid'>example</a>
         */
        QURAN,
        /**
         * The solid r icon.See <a href='https://fontawesome.com/v6/icons/r?s=solid'>example</a>
         */
        R,
        /**
         * The solid radiation icon.See <a href='https://fontawesome.com/v6/icons/radiation?s=solid'>example</a>
         */
        RADIATION,
        /**
         * The solid radiation-alt icon.See <a href='https://fontawesome.com/v6/icons/radiation-alt?s=solid'>example</a>
         */
        RADIATION_ALT,
        /**
         * The solid radio icon.See <a href='https://fontawesome.com/v6/icons/radio?s=solid'>example</a>
         */
        RADIO,
        /**
         * The solid rainbow icon.See <a href='https://fontawesome.com/v6/icons/rainbow?s=solid'>example</a>
         */
        RAINBOW,
        /**
         * The solid random icon.See <a href='https://fontawesome.com/v6/icons/random?s=solid'>example</a>
         */
        RANDOM,
        /**
         * The solid ranking-star icon.See <a href='https://fontawesome.com/v6/icons/ranking-star?s=solid'>example</a>
         */
        RANKING_STAR,
        /**
         * The solid receipt icon.See <a href='https://fontawesome.com/v6/icons/receipt?s=solid'>example</a>
         */
        RECEIPT,
        /**
         * The solid record-vinyl icon.See <a href='https://fontawesome.com/v6/icons/record-vinyl?s=solid'>example</a>
         */
        RECORD_VINYL,
        /**
         * The solid rectangle-ad icon.See <a href='https://fontawesome.com/v6/icons/rectangle-ad?s=solid'>example</a>
         */
        RECTANGLE_AD,
        /**
         * The solid rectangle-list icon.See <a href='https://fontawesome.com/v6/icons/rectangle-list?s=solid'>example</a>
         */
        RECTANGLE_LIST,
        /**
         * The solid rectangle-times icon.See <a href='https://fontawesome.com/v6/icons/rectangle-times?s=solid'>example</a>
         */
        RECTANGLE_TIMES,
        /**
         * The solid rectangle-xmark icon.See <a href='https://fontawesome.com/v6/icons/rectangle-xmark?s=solid'>example</a>
         */
        RECTANGLE_XMARK,
        /**
         * The solid recycle icon.See <a href='https://fontawesome.com/v6/icons/recycle?s=solid'>example</a>
         */
        RECYCLE,
        /**
         * The solid redo icon.See <a href='https://fontawesome.com/v6/icons/redo?s=solid'>example</a>
         */
        REDO,
        /**
         * The solid redo-alt icon.See <a href='https://fontawesome.com/v6/icons/redo-alt?s=solid'>example</a>
         */
        REDO_ALT,
        /**
         * The solid refresh icon.See <a href='https://fontawesome.com/v6/icons/refresh?s=solid'>example</a>
         */
        REFRESH,
        /**
         * The solid registered icon.See <a href='https://fontawesome.com/v6/icons/registered?s=solid'>example</a>
         */
        REGISTERED,
        /**
         * The solid remove icon.See <a href='https://fontawesome.com/v6/icons/remove?s=solid'>example</a>
         */
        REMOVE,
        /**
         * The solid remove-format icon.See <a href='https://fontawesome.com/v6/icons/remove-format?s=solid'>example</a>
         */
        REMOVE_FORMAT,
        /**
         * The solid reorder icon.See <a href='https://fontawesome.com/v6/icons/reorder?s=solid'>example</a>
         */
        REORDER,
        /**
         * The solid repeat icon.See <a href='https://fontawesome.com/v6/icons/repeat?s=solid'>example</a>
         */
        REPEAT,
        /**
         * The solid reply icon.See <a href='https://fontawesome.com/v6/icons/reply?s=solid'>example</a>
         */
        REPLY,
        /**
         * The solid reply-all icon.See <a href='https://fontawesome.com/v6/icons/reply-all?s=solid'>example</a>
         */
        REPLY_ALL,
        /**
         * The solid republican icon.See <a href='https://fontawesome.com/v6/icons/republican?s=solid'>example</a>
         */
        REPUBLICAN,
        /**
         * The solid restroom icon.See <a href='https://fontawesome.com/v6/icons/restroom?s=solid'>example</a>
         */
        RESTROOM,
        /**
         * The solid retweet icon.See <a href='https://fontawesome.com/v6/icons/retweet?s=solid'>example</a>
         */
        RETWEET,
        /**
         * The solid ribbon icon.See <a href='https://fontawesome.com/v6/icons/ribbon?s=solid'>example</a>
         */
        RIBBON,
        /**
         * The solid right-from-bracket icon.See <a href='https://fontawesome.com/v6/icons/right-from-bracket?s=solid'>example</a>
         */
        RIGHT_FROM_BRACKET,
        /**
         * The solid right-left icon.See <a href='https://fontawesome.com/v6/icons/right-left?s=solid'>example</a>
         */
        RIGHT_LEFT,
        /**
         * The solid right-long icon.See <a href='https://fontawesome.com/v6/icons/right-long?s=solid'>example</a>
         */
        RIGHT_LONG,
        /**
         * The solid right-to-bracket icon.See <a href='https://fontawesome.com/v6/icons/right-to-bracket?s=solid'>example</a>
         */
        RIGHT_TO_BRACKET,
        /**
         * The solid ring icon.See <a href='https://fontawesome.com/v6/icons/ring?s=solid'>example</a>
         */
        RING,
        /**
         * The solid rmb icon.See <a href='https://fontawesome.com/v6/icons/rmb?s=solid'>example</a>
         */
        RMB,
        /**
         * The solid road icon.See <a href='https://fontawesome.com/v6/icons/road?s=solid'>example</a>
         */
        ROAD,
        /**
         * The solid road-barrier icon.See <a href='https://fontawesome.com/v6/icons/road-barrier?s=solid'>example</a>
         */
        ROAD_BARRIER,
        /**
         * The solid road-bridge icon.See <a href='https://fontawesome.com/v6/icons/road-bridge?s=solid'>example</a>
         */
        ROAD_BRIDGE,
        /**
         * The solid road-circle-check icon.See <a href='https://fontawesome.com/v6/icons/road-circle-check?s=solid'>example</a>
         */
        ROAD_CIRCLE_CHECK,
        /**
         * The solid road-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/road-circle-exclamation?s=solid'>example</a>
         */
        ROAD_CIRCLE_EXCLAMATION,
        /**
         * The solid road-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/road-circle-xmark?s=solid'>example</a>
         */
        ROAD_CIRCLE_XMARK,
        /**
         * The solid road-lock icon.See <a href='https://fontawesome.com/v6/icons/road-lock?s=solid'>example</a>
         */
        ROAD_LOCK,
        /**
         * The solid road-spikes icon.See <a href='https://fontawesome.com/v6/icons/road-spikes?s=solid'>example</a>
         */
        ROAD_SPIKES,
        /**
         * The solid robot icon.See <a href='https://fontawesome.com/v6/icons/robot?s=solid'>example</a>
         */
        ROBOT,
        /**
         * The solid rocket icon.See <a href='https://fontawesome.com/v6/icons/rocket?s=solid'>example</a>
         */
        ROCKET,
        /**
         * The solid rod-asclepius icon.See <a href='https://fontawesome.com/v6/icons/rod-asclepius?s=solid'>example</a>
         */
        ROD_ASCLEPIUS,
        /**
         * The solid rod-snake icon.See <a href='https://fontawesome.com/v6/icons/rod-snake?s=solid'>example</a>
         */
        ROD_SNAKE,
        /**
         * The solid rotate icon.See <a href='https://fontawesome.com/v6/icons/rotate?s=solid'>example</a>
         */
        ROTATE,
        /**
         * The solid rotate-back icon.See <a href='https://fontawesome.com/v6/icons/rotate-back?s=solid'>example</a>
         */
        ROTATE_BACK,
        /**
         * The solid rotate-backward icon.See <a href='https://fontawesome.com/v6/icons/rotate-backward?s=solid'>example</a>
         */
        ROTATE_BACKWARD,
        /**
         * The solid rotate-forward icon.See <a href='https://fontawesome.com/v6/icons/rotate-forward?s=solid'>example</a>
         */
        ROTATE_FORWARD,
        /**
         * The solid rotate-left icon.See <a href='https://fontawesome.com/v6/icons/rotate-left?s=solid'>example</a>
         */
        ROTATE_LEFT,
        /**
         * The solid rotate-right icon.See <a href='https://fontawesome.com/v6/icons/rotate-right?s=solid'>example</a>
         */
        ROTATE_RIGHT,
        /**
         * The solid rouble icon.See <a href='https://fontawesome.com/v6/icons/rouble?s=solid'>example</a>
         */
        ROUBLE,
        /**
         * The solid route icon.See <a href='https://fontawesome.com/v6/icons/route?s=solid'>example</a>
         */
        ROUTE,
        /**
         * The solid rss icon.See <a href='https://fontawesome.com/v6/icons/rss?s=solid'>example</a>
         */
        RSS,
        /**
         * The solid rss-square icon.See <a href='https://fontawesome.com/v6/icons/rss-square?s=solid'>example</a>
         */
        RSS_SQUARE,
        /**
         * The solid rub icon.See <a href='https://fontawesome.com/v6/icons/rub?s=solid'>example</a>
         */
        RUB,
        /**
         * The solid ruble icon.See <a href='https://fontawesome.com/v6/icons/ruble?s=solid'>example</a>
         */
        RUBLE,
        /**
         * The solid ruble-sign icon.See <a href='https://fontawesome.com/v6/icons/ruble-sign?s=solid'>example</a>
         */
        RUBLE_SIGN,
        /**
         * The solid rug icon.See <a href='https://fontawesome.com/v6/icons/rug?s=solid'>example</a>
         */
        RUG,
        /**
         * The solid ruler icon.See <a href='https://fontawesome.com/v6/icons/ruler?s=solid'>example</a>
         */
        RULER,
        /**
         * The solid ruler-combined icon.See <a href='https://fontawesome.com/v6/icons/ruler-combined?s=solid'>example</a>
         */
        RULER_COMBINED,
        /**
         * The solid ruler-horizontal icon.See <a href='https://fontawesome.com/v6/icons/ruler-horizontal?s=solid'>example</a>
         */
        RULER_HORIZONTAL,
        /**
         * The solid ruler-vertical icon.See <a href='https://fontawesome.com/v6/icons/ruler-vertical?s=solid'>example</a>
         */
        RULER_VERTICAL,
        /**
         * The solid running icon.See <a href='https://fontawesome.com/v6/icons/running?s=solid'>example</a>
         */
        RUNNING,
        /**
         * The solid rupee icon.See <a href='https://fontawesome.com/v6/icons/rupee?s=solid'>example</a>
         */
        RUPEE,
        /**
         * The solid rupee-sign icon.See <a href='https://fontawesome.com/v6/icons/rupee-sign?s=solid'>example</a>
         */
        RUPEE_SIGN,
        /**
         * The solid rupiah-sign icon.See <a href='https://fontawesome.com/v6/icons/rupiah-sign?s=solid'>example</a>
         */
        RUPIAH_SIGN,
        /**
         * The solid s icon.See <a href='https://fontawesome.com/v6/icons/s?s=solid'>example</a>
         */
        S,
        /**
         * The solid sack-dollar icon.See <a href='https://fontawesome.com/v6/icons/sack-dollar?s=solid'>example</a>
         */
        SACK_DOLLAR,
        /**
         * The solid sack-xmark icon.See <a href='https://fontawesome.com/v6/icons/sack-xmark?s=solid'>example</a>
         */
        SACK_XMARK,
        /**
         * The solid sad-cry icon.See <a href='https://fontawesome.com/v6/icons/sad-cry?s=solid'>example</a>
         */
        SAD_CRY,
        /**
         * The solid sad-tear icon.See <a href='https://fontawesome.com/v6/icons/sad-tear?s=solid'>example</a>
         */
        SAD_TEAR,
        /**
         * The solid sailboat icon.See <a href='https://fontawesome.com/v6/icons/sailboat?s=solid'>example</a>
         */
        SAILBOAT,
        /**
         * The solid satellite icon.See <a href='https://fontawesome.com/v6/icons/satellite?s=solid'>example</a>
         */
        SATELLITE,
        /**
         * The solid satellite-dish icon.See <a href='https://fontawesome.com/v6/icons/satellite-dish?s=solid'>example</a>
         */
        SATELLITE_DISH,
        /**
         * The solid save icon.See <a href='https://fontawesome.com/v6/icons/save?s=solid'>example</a>
         */
        SAVE,
        /**
         * The solid scale-balanced icon.See <a href='https://fontawesome.com/v6/icons/scale-balanced?s=solid'>example</a>
         */
        SCALE_BALANCED,
        /**
         * The solid scale-unbalanced icon.See <a href='https://fontawesome.com/v6/icons/scale-unbalanced?s=solid'>example</a>
         */
        SCALE_UNBALANCED,
        /**
         * The solid scale-unbalanced-flip icon.See <a href='https://fontawesome.com/v6/icons/scale-unbalanced-flip?s=solid'>example</a>
         */
        SCALE_UNBALANCED_FLIP,
        /**
         * The solid school icon.See <a href='https://fontawesome.com/v6/icons/school?s=solid'>example</a>
         */
        SCHOOL,
        /**
         * The solid school-circle-check icon.See <a href='https://fontawesome.com/v6/icons/school-circle-check?s=solid'>example</a>
         */
        SCHOOL_CIRCLE_CHECK,
        /**
         * The solid school-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/school-circle-exclamation?s=solid'>example</a>
         */
        SCHOOL_CIRCLE_EXCLAMATION,
        /**
         * The solid school-circle-xmark icon.See <a href='https://fontawesome.com/v6/icons/school-circle-xmark?s=solid'>example</a>
         */
        SCHOOL_CIRCLE_XMARK,
        /**
         * The solid school-flag icon.See <a href='https://fontawesome.com/v6/icons/school-flag?s=solid'>example</a>
         */
        SCHOOL_FLAG,
        /**
         * The solid school-lock icon.See <a href='https://fontawesome.com/v6/icons/school-lock?s=solid'>example</a>
         */
        SCHOOL_LOCK,
        /**
         * The solid scissors icon.See <a href='https://fontawesome.com/v6/icons/scissors?s=solid'>example</a>
         */
        SCISSORS,
        /**
         * The solid screwdriver icon.See <a href='https://fontawesome.com/v6/icons/screwdriver?s=solid'>example</a>
         */
        SCREWDRIVER,
        /**
         * The solid screwdriver-wrench icon.See <a href='https://fontawesome.com/v6/icons/screwdriver-wrench?s=solid'>example</a>
         */
        SCREWDRIVER_WRENCH,
        /**
         * The solid scroll icon.See <a href='https://fontawesome.com/v6/icons/scroll?s=solid'>example</a>
         */
        SCROLL,
        /**
         * The solid scroll-torah icon.See <a href='https://fontawesome.com/v6/icons/scroll-torah?s=solid'>example</a>
         */
        SCROLL_TORAH,
        /**
         * The solid sd-card icon.See <a href='https://fontawesome.com/v6/icons/sd-card?s=solid'>example</a>
         */
        SD_CARD,
        /**
         * The solid search icon.See <a href='https://fontawesome.com/v6/icons/search?s=solid'>example</a>
         */
        SEARCH,
        /**
         * The solid search-dollar icon.See <a href='https://fontawesome.com/v6/icons/search-dollar?s=solid'>example</a>
         */
        SEARCH_DOLLAR,
        /**
         * The solid search-location icon.See <a href='https://fontawesome.com/v6/icons/search-location?s=solid'>example</a>
         */
        SEARCH_LOCATION,
        /**
         * The solid search-minus icon.See <a href='https://fontawesome.com/v6/icons/search-minus?s=solid'>example</a>
         */
        SEARCH_MINUS,
        /**
         * The solid search-plus icon.See <a href='https://fontawesome.com/v6/icons/search-plus?s=solid'>example</a>
         */
        SEARCH_PLUS,
        /**
         * The solid section icon.See <a href='https://fontawesome.com/v6/icons/section?s=solid'>example</a>
         */
        SECTION,
        /**
         * The solid seedling icon.See <a href='https://fontawesome.com/v6/icons/seedling?s=solid'>example</a>
         */
        SEEDLING,
        /**
         * The solid server icon.See <a href='https://fontawesome.com/v6/icons/server?s=solid'>example</a>
         */
        SERVER,
        /**
         * The solid shapes icon.See <a href='https://fontawesome.com/v6/icons/shapes?s=solid'>example</a>
         */
        SHAPES,
        /**
         * The solid share icon.See <a href='https://fontawesome.com/v6/icons/share?s=solid'>example</a>
         */
        SHARE,
        /**
         * The solid share-alt icon.See <a href='https://fontawesome.com/v6/icons/share-alt?s=solid'>example</a>
         */
        SHARE_ALT,
        /**
         * The solid share-alt-square icon.See <a href='https://fontawesome.com/v6/icons/share-alt-square?s=solid'>example</a>
         */
        SHARE_ALT_SQUARE,
        /**
         * The solid share-from-square icon.See <a href='https://fontawesome.com/v6/icons/share-from-square?s=solid'>example</a>
         */
        SHARE_FROM_SQUARE,
        /**
         * The solid share-nodes icon.See <a href='https://fontawesome.com/v6/icons/share-nodes?s=solid'>example</a>
         */
        SHARE_NODES,
        /**
         * The solid share-square icon.See <a href='https://fontawesome.com/v6/icons/share-square?s=solid'>example</a>
         */
        SHARE_SQUARE,
        /**
         * The solid sheet-plastic icon.See <a href='https://fontawesome.com/v6/icons/sheet-plastic?s=solid'>example</a>
         */
        SHEET_PLASTIC,
        /**
         * The solid shekel icon.See <a href='https://fontawesome.com/v6/icons/shekel?s=solid'>example</a>
         */
        SHEKEL,
        /**
         * The solid shekel-sign icon.See <a href='https://fontawesome.com/v6/icons/shekel-sign?s=solid'>example</a>
         */
        SHEKEL_SIGN,
        /**
         * The solid sheqel icon.See <a href='https://fontawesome.com/v6/icons/sheqel?s=solid'>example</a>
         */
        SHEQEL,
        /**
         * The solid sheqel-sign icon.See <a href='https://fontawesome.com/v6/icons/sheqel-sign?s=solid'>example</a>
         */
        SHEQEL_SIGN,
        /**
         * The solid shield icon.See <a href='https://fontawesome.com/v6/icons/shield?s=solid'>example</a>
         */
        SHIELD,
        /**
         * The solid shield-alt icon.See <a href='https://fontawesome.com/v6/icons/shield-alt?s=solid'>example</a>
         */
        SHIELD_ALT,
        /**
         * The solid shield-blank icon.See <a href='https://fontawesome.com/v6/icons/shield-blank?s=solid'>example</a>
         */
        SHIELD_BLANK,
        /**
         * The solid shield-cat icon.See <a href='https://fontawesome.com/v6/icons/shield-cat?s=solid'>example</a>
         */
        SHIELD_CAT,
        /**
         * The solid shield-dog icon.See <a href='https://fontawesome.com/v6/icons/shield-dog?s=solid'>example</a>
         */
        SHIELD_DOG,
        /**
         * The solid shield-halved icon.See <a href='https://fontawesome.com/v6/icons/shield-halved?s=solid'>example</a>
         */
        SHIELD_HALVED,
        /**
         * The solid shield-heart icon.See <a href='https://fontawesome.com/v6/icons/shield-heart?s=solid'>example</a>
         */
        SHIELD_HEART,
        /**
         * The solid shield-virus icon.See <a href='https://fontawesome.com/v6/icons/shield-virus?s=solid'>example</a>
         */
        SHIELD_VIRUS,
        /**
         * The solid ship icon.See <a href='https://fontawesome.com/v6/icons/ship?s=solid'>example</a>
         */
        SHIP,
        /**
         * The solid shipping-fast icon.See <a href='https://fontawesome.com/v6/icons/shipping-fast?s=solid'>example</a>
         */
        SHIPPING_FAST,
        /**
         * The solid shirt icon.See <a href='https://fontawesome.com/v6/icons/shirt?s=solid'>example</a>
         */
        SHIRT,
        /**
         * The solid shoe-prints icon.See <a href='https://fontawesome.com/v6/icons/shoe-prints?s=solid'>example</a>
         */
        SHOE_PRINTS,
        /**
         * The solid shop icon.See <a href='https://fontawesome.com/v6/icons/shop?s=solid'>example</a>
         */
        SHOP,
        /**
         * The solid shop-lock icon.See <a href='https://fontawesome.com/v6/icons/shop-lock?s=solid'>example</a>
         */
        SHOP_LOCK,
        /**
         * The solid shop-slash icon.See <a href='https://fontawesome.com/v6/icons/shop-slash?s=solid'>example</a>
         */
        SHOP_SLASH,
        /**
         * The solid shopping-bag icon.See <a href='https://fontawesome.com/v6/icons/shopping-bag?s=solid'>example</a>
         */
        SHOPPING_BAG,
        /**
         * The solid shopping-basket icon.See <a href='https://fontawesome.com/v6/icons/shopping-basket?s=solid'>example</a>
         */
        SHOPPING_BASKET,
        /**
         * The solid shopping-cart icon.See <a href='https://fontawesome.com/v6/icons/shopping-cart?s=solid'>example</a>
         */
        SHOPPING_CART,
        /**
         * The solid shower icon.See <a href='https://fontawesome.com/v6/icons/shower?s=solid'>example</a>
         */
        SHOWER,
        /**
         * The solid shrimp icon.See <a href='https://fontawesome.com/v6/icons/shrimp?s=solid'>example</a>
         */
        SHRIMP,
        /**
         * The solid shuffle icon.See <a href='https://fontawesome.com/v6/icons/shuffle?s=solid'>example</a>
         */
        SHUFFLE,
        /**
         * The solid shuttle-space icon.See <a href='https://fontawesome.com/v6/icons/shuttle-space?s=solid'>example</a>
         */
        SHUTTLE_SPACE,
        /**
         * The solid shuttle-van icon.See <a href='https://fontawesome.com/v6/icons/shuttle-van?s=solid'>example</a>
         */
        SHUTTLE_VAN,
        /**
         * The solid sign icon.See <a href='https://fontawesome.com/v6/icons/sign?s=solid'>example</a>
         */
        SIGN,
        /**
         * The solid sign-hanging icon.See <a href='https://fontawesome.com/v6/icons/sign-hanging?s=solid'>example</a>
         */
        SIGN_HANGING,
        /**
         * The solid sign-in icon.See <a href='https://fontawesome.com/v6/icons/sign-in?s=solid'>example</a>
         */
        SIGN_IN,
        /**
         * The solid sign-in-alt icon.See <a href='https://fontawesome.com/v6/icons/sign-in-alt?s=solid'>example</a>
         */
        SIGN_IN_ALT,
        /**
         * The solid sign-language icon.See <a href='https://fontawesome.com/v6/icons/sign-language?s=solid'>example</a>
         */
        SIGN_LANGUAGE,
        /**
         * The solid sign-out icon.See <a href='https://fontawesome.com/v6/icons/sign-out?s=solid'>example</a>
         */
        SIGN_OUT,
        /**
         * The solid sign-out-alt icon.See <a href='https://fontawesome.com/v6/icons/sign-out-alt?s=solid'>example</a>
         */
        SIGN_OUT_ALT,
        /**
         * The solid signal icon.See <a href='https://fontawesome.com/v6/icons/signal?s=solid'>example</a>
         */
        SIGNAL,
        /**
         * The solid signal-5 icon.See <a href='https://fontawesome.com/v6/icons/signal-5?s=solid'>example</a>
         */
        SIGNAL_5,
        /**
         * The solid signal-perfect icon.See <a href='https://fontawesome.com/v6/icons/signal-perfect?s=solid'>example</a>
         */
        SIGNAL_PERFECT,
        /**
         * The solid signature icon.See <a href='https://fontawesome.com/v6/icons/signature?s=solid'>example</a>
         */
        SIGNATURE,
        /**
         * The solid signing icon.See <a href='https://fontawesome.com/v6/icons/signing?s=solid'>example</a>
         */
        SIGNING,
        /**
         * The solid signs-post icon.See <a href='https://fontawesome.com/v6/icons/signs-post?s=solid'>example</a>
         */
        SIGNS_POST,
        /**
         * The solid sim-card icon.See <a href='https://fontawesome.com/v6/icons/sim-card?s=solid'>example</a>
         */
        SIM_CARD,
        /**
         * The solid sink icon.See <a href='https://fontawesome.com/v6/icons/sink?s=solid'>example</a>
         */
        SINK,
        /**
         * The solid sitemap icon.See <a href='https://fontawesome.com/v6/icons/sitemap?s=solid'>example</a>
         */
        SITEMAP,
        /**
         * The solid skating icon.See <a href='https://fontawesome.com/v6/icons/skating?s=solid'>example</a>
         */
        SKATING,
        /**
         * The solid skiing icon.See <a href='https://fontawesome.com/v6/icons/skiing?s=solid'>example</a>
         */
        SKIING,
        /**
         * The solid skiing-nordic icon.See <a href='https://fontawesome.com/v6/icons/skiing-nordic?s=solid'>example</a>
         */
        SKIING_NORDIC,
        /**
         * The solid skull icon.See <a href='https://fontawesome.com/v6/icons/skull?s=solid'>example</a>
         */
        SKULL,
        /**
         * The solid skull-crossbones icon.See <a href='https://fontawesome.com/v6/icons/skull-crossbones?s=solid'>example</a>
         */
        SKULL_CROSSBONES,
        /**
         * The solid slash icon.See <a href='https://fontawesome.com/v6/icons/slash?s=solid'>example</a>
         */
        SLASH,
        /**
         * The solid sleigh icon.See <a href='https://fontawesome.com/v6/icons/sleigh?s=solid'>example</a>
         */
        SLEIGH,
        /**
         * The solid sliders icon.See <a href='https://fontawesome.com/v6/icons/sliders?s=solid'>example</a>
         */
        SLIDERS,
        /**
         * The solid sliders-h icon.See <a href='https://fontawesome.com/v6/icons/sliders-h?s=solid'>example</a>
         */
        SLIDERS_H,
        /**
         * The solid smile icon.See <a href='https://fontawesome.com/v6/icons/smile?s=solid'>example</a>
         */
        SMILE,
        /**
         * The solid smile-beam icon.See <a href='https://fontawesome.com/v6/icons/smile-beam?s=solid'>example</a>
         */
        SMILE_BEAM,
        /**
         * The solid smile-wink icon.See <a href='https://fontawesome.com/v6/icons/smile-wink?s=solid'>example</a>
         */
        SMILE_WINK,
        /**
         * The solid smog icon.See <a href='https://fontawesome.com/v6/icons/smog?s=solid'>example</a>
         */
        SMOG,
        /**
         * The solid smoking icon.See <a href='https://fontawesome.com/v6/icons/smoking?s=solid'>example</a>
         */
        SMOKING,
        /**
         * The solid smoking-ban icon.See <a href='https://fontawesome.com/v6/icons/smoking-ban?s=solid'>example</a>
         */
        SMOKING_BAN,
        /**
         * The solid sms icon.See <a href='https://fontawesome.com/v6/icons/sms?s=solid'>example</a>
         */
        SMS,
        /**
         * The solid snowboarding icon.See <a href='https://fontawesome.com/v6/icons/snowboarding?s=solid'>example</a>
         */
        SNOWBOARDING,
        /**
         * The solid snowflake icon.See <a href='https://fontawesome.com/v6/icons/snowflake?s=solid'>example</a>
         */
        SNOWFLAKE,
        /**
         * The solid snowman icon.See <a href='https://fontawesome.com/v6/icons/snowman?s=solid'>example</a>
         */
        SNOWMAN,
        /**
         * The solid snowplow icon.See <a href='https://fontawesome.com/v6/icons/snowplow?s=solid'>example</a>
         */
        SNOWPLOW,
        /**
         * The solid soap icon.See <a href='https://fontawesome.com/v6/icons/soap?s=solid'>example</a>
         */
        SOAP,
        /**
         * The solid soccer-ball icon.See <a href='https://fontawesome.com/v6/icons/soccer-ball?s=solid'>example</a>
         */
        SOCCER_BALL,
        /**
         * The solid socks icon.See <a href='https://fontawesome.com/v6/icons/socks?s=solid'>example</a>
         */
        SOCKS,
        /**
         * The solid solar-panel icon.See <a href='https://fontawesome.com/v6/icons/solar-panel?s=solid'>example</a>
         */
        SOLAR_PANEL,
        /**
         * The solid sort icon.See <a href='https://fontawesome.com/v6/icons/sort?s=solid'>example</a>
         */
        SORT,
        /**
         * The solid sort-alpha-asc icon.See <a href='https://fontawesome.com/v6/icons/sort-alpha-asc?s=solid'>example</a>
         */
        SORT_ALPHA_ASC,
        /**
         * The solid sort-alpha-desc icon.See <a href='https://fontawesome.com/v6/icons/sort-alpha-desc?s=solid'>example</a>
         */
        SORT_ALPHA_DESC,
        /**
         * The solid sort-alpha-down icon.See <a href='https://fontawesome.com/v6/icons/sort-alpha-down?s=solid'>example</a>
         */
        SORT_ALPHA_DOWN,
        /**
         * The solid sort-alpha-down-alt icon.See <a href='https://fontawesome.com/v6/icons/sort-alpha-down-alt?s=solid'>example</a>
         */
        SORT_ALPHA_DOWN_ALT,
        /**
         * The solid sort-alpha-up icon.See <a href='https://fontawesome.com/v6/icons/sort-alpha-up?s=solid'>example</a>
         */
        SORT_ALPHA_UP,
        /**
         * The solid sort-alpha-up-alt icon.See <a href='https://fontawesome.com/v6/icons/sort-alpha-up-alt?s=solid'>example</a>
         */
        SORT_ALPHA_UP_ALT,
        /**
         * The solid sort-amount-asc icon.See <a href='https://fontawesome.com/v6/icons/sort-amount-asc?s=solid'>example</a>
         */
        SORT_AMOUNT_ASC,
        /**
         * The solid sort-amount-desc icon.See <a href='https://fontawesome.com/v6/icons/sort-amount-desc?s=solid'>example</a>
         */
        SORT_AMOUNT_DESC,
        /**
         * The solid sort-amount-down icon.See <a href='https://fontawesome.com/v6/icons/sort-amount-down?s=solid'>example</a>
         */
        SORT_AMOUNT_DOWN,
        /**
         * The solid sort-amount-down-alt icon.See <a href='https://fontawesome.com/v6/icons/sort-amount-down-alt?s=solid'>example</a>
         */
        SORT_AMOUNT_DOWN_ALT,
        /**
         * The solid sort-amount-up icon.See <a href='https://fontawesome.com/v6/icons/sort-amount-up?s=solid'>example</a>
         */
        SORT_AMOUNT_UP,
        /**
         * The solid sort-amount-up-alt icon.See <a href='https://fontawesome.com/v6/icons/sort-amount-up-alt?s=solid'>example</a>
         */
        SORT_AMOUNT_UP_ALT,
        /**
         * The solid sort-asc icon.See <a href='https://fontawesome.com/v6/icons/sort-asc?s=solid'>example</a>
         */
        SORT_ASC,
        /**
         * The solid sort-desc icon.See <a href='https://fontawesome.com/v6/icons/sort-desc?s=solid'>example</a>
         */
        SORT_DESC,
        /**
         * The solid sort-down icon.See <a href='https://fontawesome.com/v6/icons/sort-down?s=solid'>example</a>
         */
        SORT_DOWN,
        /**
         * The solid sort-numeric-asc icon.See <a href='https://fontawesome.com/v6/icons/sort-numeric-asc?s=solid'>example</a>
         */
        SORT_NUMERIC_ASC,
        /**
         * The solid sort-numeric-desc icon.See <a href='https://fontawesome.com/v6/icons/sort-numeric-desc?s=solid'>example</a>
         */
        SORT_NUMERIC_DESC,
        /**
         * The solid sort-numeric-down icon.See <a href='https://fontawesome.com/v6/icons/sort-numeric-down?s=solid'>example</a>
         */
        SORT_NUMERIC_DOWN,
        /**
         * The solid sort-numeric-down-alt icon.See <a href='https://fontawesome.com/v6/icons/sort-numeric-down-alt?s=solid'>example</a>
         */
        SORT_NUMERIC_DOWN_ALT,
        /**
         * The solid sort-numeric-up icon.See <a href='https://fontawesome.com/v6/icons/sort-numeric-up?s=solid'>example</a>
         */
        SORT_NUMERIC_UP,
        /**
         * The solid sort-numeric-up-alt icon.See <a href='https://fontawesome.com/v6/icons/sort-numeric-up-alt?s=solid'>example</a>
         */
        SORT_NUMERIC_UP_ALT,
        /**
         * The solid sort-up icon.See <a href='https://fontawesome.com/v6/icons/sort-up?s=solid'>example</a>
         */
        SORT_UP,
        /**
         * The solid spa icon.See <a href='https://fontawesome.com/v6/icons/spa?s=solid'>example</a>
         */
        SPA,
        /**
         * The solid space-shuttle icon.See <a href='https://fontawesome.com/v6/icons/space-shuttle?s=solid'>example</a>
         */
        SPACE_SHUTTLE,
        /**
         * The solid spaghetti-monster-flying icon.See <a href='https://fontawesome.com/v6/icons/spaghetti-monster-flying?s=solid'>example</a>
         */
        SPAGHETTI_MONSTER_FLYING,
        /**
         * The solid spell-check icon.See <a href='https://fontawesome.com/v6/icons/spell-check?s=solid'>example</a>
         */
        SPELL_CHECK,
        /**
         * The solid spider icon.See <a href='https://fontawesome.com/v6/icons/spider?s=solid'>example</a>
         */
        SPIDER,
        /**
         * The solid spinner icon.See <a href='https://fontawesome.com/v6/icons/spinner?s=solid'>example</a>
         */
        SPINNER,
        /**
         * The solid splotch icon.See <a href='https://fontawesome.com/v6/icons/splotch?s=solid'>example</a>
         */
        SPLOTCH,
        /**
         * The solid spoon icon.See <a href='https://fontawesome.com/v6/icons/spoon?s=solid'>example</a>
         */
        SPOON,
        /**
         * The solid spray-can icon.See <a href='https://fontawesome.com/v6/icons/spray-can?s=solid'>example</a>
         */
        SPRAY_CAN,
        /**
         * The solid spray-can-sparkles icon.See <a href='https://fontawesome.com/v6/icons/spray-can-sparkles?s=solid'>example</a>
         */
        SPRAY_CAN_SPARKLES,
        /**
         * The solid sprout icon.See <a href='https://fontawesome.com/v6/icons/sprout?s=solid'>example</a>
         */
        SPROUT,
        /**
         * The solid square icon.See <a href='https://fontawesome.com/v6/icons/square?s=solid'>example</a>
         */
        SQUARE,
        /**
         * The solid square-arrow-up-right icon.See <a href='https://fontawesome.com/v6/icons/square-arrow-up-right?s=solid'>example</a>
         */
        SQUARE_ARROW_UP_RIGHT,
        /**
         * The solid square-caret-down icon.See <a href='https://fontawesome.com/v6/icons/square-caret-down?s=solid'>example</a>
         */
        SQUARE_CARET_DOWN,
        /**
         * The solid square-caret-left icon.See <a href='https://fontawesome.com/v6/icons/square-caret-left?s=solid'>example</a>
         */
        SQUARE_CARET_LEFT,
        /**
         * The solid square-caret-right icon.See <a href='https://fontawesome.com/v6/icons/square-caret-right?s=solid'>example</a>
         */
        SQUARE_CARET_RIGHT,
        /**
         * The solid square-caret-up icon.See <a href='https://fontawesome.com/v6/icons/square-caret-up?s=solid'>example</a>
         */
        SQUARE_CARET_UP,
        /**
         * The solid square-check icon.See <a href='https://fontawesome.com/v6/icons/square-check?s=solid'>example</a>
         */
        SQUARE_CHECK,
        /**
         * The solid square-envelope icon.See <a href='https://fontawesome.com/v6/icons/square-envelope?s=solid'>example</a>
         */
        SQUARE_ENVELOPE,
        /**
         * The solid square-full icon.See <a href='https://fontawesome.com/v6/icons/square-full?s=solid'>example</a>
         */
        SQUARE_FULL,
        /**
         * The solid square-h icon.See <a href='https://fontawesome.com/v6/icons/square-h?s=solid'>example</a>
         */
        SQUARE_H,
        /**
         * The solid square-minus icon.See <a href='https://fontawesome.com/v6/icons/square-minus?s=solid'>example</a>
         */
        SQUARE_MINUS,
        /**
         * The solid square-nfi icon.See <a href='https://fontawesome.com/v6/icons/square-nfi?s=solid'>example</a>
         */
        SQUARE_NFI,
        /**
         * The solid square-parking icon.See <a href='https://fontawesome.com/v6/icons/square-parking?s=solid'>example</a>
         */
        SQUARE_PARKING,
        /**
         * The solid square-pen icon.See <a href='https://fontawesome.com/v6/icons/square-pen?s=solid'>example</a>
         */
        SQUARE_PEN,
        /**
         * The solid square-person-confined icon.See <a href='https://fontawesome.com/v6/icons/square-person-confined?s=solid'>example</a>
         */
        SQUARE_PERSON_CONFINED,
        /**
         * The solid square-phone icon.See <a href='https://fontawesome.com/v6/icons/square-phone?s=solid'>example</a>
         */
        SQUARE_PHONE,
        /**
         * The solid square-phone-flip icon.See <a href='https://fontawesome.com/v6/icons/square-phone-flip?s=solid'>example</a>
         */
        SQUARE_PHONE_FLIP,
        /**
         * The solid square-plus icon.See <a href='https://fontawesome.com/v6/icons/square-plus?s=solid'>example</a>
         */
        SQUARE_PLUS,
        /**
         * The solid square-poll-horizontal icon.See <a href='https://fontawesome.com/v6/icons/square-poll-horizontal?s=solid'>example</a>
         */
        SQUARE_POLL_HORIZONTAL,
        /**
         * The solid square-poll-vertical icon.See <a href='https://fontawesome.com/v6/icons/square-poll-vertical?s=solid'>example</a>
         */
        SQUARE_POLL_VERTICAL,
        /**
         * The solid square-root-alt icon.See <a href='https://fontawesome.com/v6/icons/square-root-alt?s=solid'>example</a>
         */
        SQUARE_ROOT_ALT,
        /**
         * The solid square-root-variable icon.See <a href='https://fontawesome.com/v6/icons/square-root-variable?s=solid'>example</a>
         */
        SQUARE_ROOT_VARIABLE,
        /**
         * The solid square-rss icon.See <a href='https://fontawesome.com/v6/icons/square-rss?s=solid'>example</a>
         */
        SQUARE_RSS,
        /**
         * The solid square-share-nodes icon.See <a href='https://fontawesome.com/v6/icons/square-share-nodes?s=solid'>example</a>
         */
        SQUARE_SHARE_NODES,
        /**
         * The solid square-up-right icon.See <a href='https://fontawesome.com/v6/icons/square-up-right?s=solid'>example</a>
         */
        SQUARE_UP_RIGHT,
        /**
         * The solid square-virus icon.See <a href='https://fontawesome.com/v6/icons/square-virus?s=solid'>example</a>
         */
        SQUARE_VIRUS,
        /**
         * The solid square-xmark icon.See <a href='https://fontawesome.com/v6/icons/square-xmark?s=solid'>example</a>
         */
        SQUARE_XMARK,
        /**
         * The solid staff-aesculapius icon.See <a href='https://fontawesome.com/v6/icons/staff-aesculapius?s=solid'>example</a>
         */
        STAFF_AESCULAPIUS,
        /**
         * The solid staff-snake icon.See <a href='https://fontawesome.com/v6/icons/staff-snake?s=solid'>example</a>
         */
        STAFF_SNAKE,
        /**
         * The solid stairs icon.See <a href='https://fontawesome.com/v6/icons/stairs?s=solid'>example</a>
         */
        STAIRS,
        /**
         * The solid stamp icon.See <a href='https://fontawesome.com/v6/icons/stamp?s=solid'>example</a>
         */
        STAMP,
        /**
         * The solid stapler icon.See <a href='https://fontawesome.com/v6/icons/stapler?s=solid'>example</a>
         */
        STAPLER,
        /**
         * The solid star icon.See <a href='https://fontawesome.com/v6/icons/star?s=solid'>example</a>
         */
        STAR,
        /**
         * The solid star-and-crescent icon.See <a href='https://fontawesome.com/v6/icons/star-and-crescent?s=solid'>example</a>
         */
        STAR_AND_CRESCENT,
        /**
         * The solid star-half icon.See <a href='https://fontawesome.com/v6/icons/star-half?s=solid'>example</a>
         */
        STAR_HALF,
        /**
         * The solid star-half-alt icon.See <a href='https://fontawesome.com/v6/icons/star-half-alt?s=solid'>example</a>
         */
        STAR_HALF_ALT,
        /**
         * The solid star-half-stroke icon.See <a href='https://fontawesome.com/v6/icons/star-half-stroke?s=solid'>example</a>
         */
        STAR_HALF_STROKE,
        /**
         * The solid star-of-david icon.See <a href='https://fontawesome.com/v6/icons/star-of-david?s=solid'>example</a>
         */
        STAR_OF_DAVID,
        /**
         * The solid star-of-life icon.See <a href='https://fontawesome.com/v6/icons/star-of-life?s=solid'>example</a>
         */
        STAR_OF_LIFE,
        /**
         * The solid step-backward icon.See <a href='https://fontawesome.com/v6/icons/step-backward?s=solid'>example</a>
         */
        STEP_BACKWARD,
        /**
         * The solid step-forward icon.See <a href='https://fontawesome.com/v6/icons/step-forward?s=solid'>example</a>
         */
        STEP_FORWARD,
        /**
         * The solid sterling-sign icon.See <a href='https://fontawesome.com/v6/icons/sterling-sign?s=solid'>example</a>
         */
        STERLING_SIGN,
        /**
         * The solid stethoscope icon.See <a href='https://fontawesome.com/v6/icons/stethoscope?s=solid'>example</a>
         */
        STETHOSCOPE,
        /**
         * The solid sticky-note icon.See <a href='https://fontawesome.com/v6/icons/sticky-note?s=solid'>example</a>
         */
        STICKY_NOTE,
        /**
         * The solid stop icon.See <a href='https://fontawesome.com/v6/icons/stop?s=solid'>example</a>
         */
        STOP,
        /**
         * The solid stop-circle icon.See <a href='https://fontawesome.com/v6/icons/stop-circle?s=solid'>example</a>
         */
        STOP_CIRCLE,
        /**
         * The solid stopwatch icon.See <a href='https://fontawesome.com/v6/icons/stopwatch?s=solid'>example</a>
         */
        STOPWATCH,
        /**
         * The solid stopwatch-20 icon.See <a href='https://fontawesome.com/v6/icons/stopwatch-20?s=solid'>example</a>
         */
        STOPWATCH_20,
        /**
         * The solid store icon.See <a href='https://fontawesome.com/v6/icons/store?s=solid'>example</a>
         */
        STORE,
        /**
         * The solid store-alt icon.See <a href='https://fontawesome.com/v6/icons/store-alt?s=solid'>example</a>
         */
        STORE_ALT,
        /**
         * The solid store-alt-slash icon.See <a href='https://fontawesome.com/v6/icons/store-alt-slash?s=solid'>example</a>
         */
        STORE_ALT_SLASH,
        /**
         * The solid store-slash icon.See <a href='https://fontawesome.com/v6/icons/store-slash?s=solid'>example</a>
         */
        STORE_SLASH,
        /**
         * The solid stream icon.See <a href='https://fontawesome.com/v6/icons/stream?s=solid'>example</a>
         */
        STREAM,
        /**
         * The solid street-view icon.See <a href='https://fontawesome.com/v6/icons/street-view?s=solid'>example</a>
         */
        STREET_VIEW,
        /**
         * The solid strikethrough icon.See <a href='https://fontawesome.com/v6/icons/strikethrough?s=solid'>example</a>
         */
        STRIKETHROUGH,
        /**
         * The solid stroopwafel icon.See <a href='https://fontawesome.com/v6/icons/stroopwafel?s=solid'>example</a>
         */
        STROOPWAFEL,
        /**
         * The solid subscript icon.See <a href='https://fontawesome.com/v6/icons/subscript?s=solid'>example</a>
         */
        SUBSCRIPT,
        /**
         * The solid subtract icon.See <a href='https://fontawesome.com/v6/icons/subtract?s=solid'>example</a>
         */
        SUBTRACT,
        /**
         * The solid subway icon.See <a href='https://fontawesome.com/v6/icons/subway?s=solid'>example</a>
         */
        SUBWAY,
        /**
         * The solid suitcase icon.See <a href='https://fontawesome.com/v6/icons/suitcase?s=solid'>example</a>
         */
        SUITCASE,
        /**
         * The solid suitcase-medical icon.See <a href='https://fontawesome.com/v6/icons/suitcase-medical?s=solid'>example</a>
         */
        SUITCASE_MEDICAL,
        /**
         * The solid suitcase-rolling icon.See <a href='https://fontawesome.com/v6/icons/suitcase-rolling?s=solid'>example</a>
         */
        SUITCASE_ROLLING,
        /**
         * The solid sun icon.See <a href='https://fontawesome.com/v6/icons/sun?s=solid'>example</a>
         */
        SUN,
        /**
         * The solid sun-plant-wilt icon.See <a href='https://fontawesome.com/v6/icons/sun-plant-wilt?s=solid'>example</a>
         */
        SUN_PLANT_WILT,
        /**
         * The solid superscript icon.See <a href='https://fontawesome.com/v6/icons/superscript?s=solid'>example</a>
         */
        SUPERSCRIPT,
        /**
         * The solid surprise icon.See <a href='https://fontawesome.com/v6/icons/surprise?s=solid'>example</a>
         */
        SURPRISE,
        /**
         * The solid swatchbook icon.See <a href='https://fontawesome.com/v6/icons/swatchbook?s=solid'>example</a>
         */
        SWATCHBOOK,
        /**
         * The solid swimmer icon.See <a href='https://fontawesome.com/v6/icons/swimmer?s=solid'>example</a>
         */
        SWIMMER,
        /**
         * The solid swimming-pool icon.See <a href='https://fontawesome.com/v6/icons/swimming-pool?s=solid'>example</a>
         */
        SWIMMING_POOL,
        /**
         * The solid synagogue icon.See <a href='https://fontawesome.com/v6/icons/synagogue?s=solid'>example</a>
         */
        SYNAGOGUE,
        /**
         * The solid sync icon.See <a href='https://fontawesome.com/v6/icons/sync?s=solid'>example</a>
         */
        SYNC,
        /**
         * The solid sync-alt icon.See <a href='https://fontawesome.com/v6/icons/sync-alt?s=solid'>example</a>
         */
        SYNC_ALT,
        /**
         * The solid syringe icon.See <a href='https://fontawesome.com/v6/icons/syringe?s=solid'>example</a>
         */
        SYRINGE,
        /**
         * The solid t icon.See <a href='https://fontawesome.com/v6/icons/t?s=solid'>example</a>
         */
        T,
        /**
         * The solid t-shirt icon.See <a href='https://fontawesome.com/v6/icons/t-shirt?s=solid'>example</a>
         */
        T_SHIRT,
        /**
         * The solid table icon.See <a href='https://fontawesome.com/v6/icons/table?s=solid'>example</a>
         */
        TABLE,
        /**
         * The solid table-cells icon.See <a href='https://fontawesome.com/v6/icons/table-cells?s=solid'>example</a>
         */
        TABLE_CELLS,
        /**
         * The solid table-cells-large icon.See <a href='https://fontawesome.com/v6/icons/table-cells-large?s=solid'>example</a>
         */
        TABLE_CELLS_LARGE,
        /**
         * The solid table-columns icon.See <a href='https://fontawesome.com/v6/icons/table-columns?s=solid'>example</a>
         */
        TABLE_COLUMNS,
        /**
         * The solid table-list icon.See <a href='https://fontawesome.com/v6/icons/table-list?s=solid'>example</a>
         */
        TABLE_LIST,
        /**
         * The solid table-tennis icon.See <a href='https://fontawesome.com/v6/icons/table-tennis?s=solid'>example</a>
         */
        TABLE_TENNIS,
        /**
         * The solid table-tennis-paddle-ball icon.See <a href='https://fontawesome.com/v6/icons/table-tennis-paddle-ball?s=solid'>example</a>
         */
        TABLE_TENNIS_PADDLE_BALL,
        /**
         * The solid tablet icon.See <a href='https://fontawesome.com/v6/icons/tablet?s=solid'>example</a>
         */
        TABLET,
        /**
         * The solid tablet-alt icon.See <a href='https://fontawesome.com/v6/icons/tablet-alt?s=solid'>example</a>
         */
        TABLET_ALT,
        /**
         * The solid tablet-android icon.See <a href='https://fontawesome.com/v6/icons/tablet-android?s=solid'>example</a>
         */
        TABLET_ANDROID,
        /**
         * The solid tablet-button icon.See <a href='https://fontawesome.com/v6/icons/tablet-button?s=solid'>example</a>
         */
        TABLET_BUTTON,
        /**
         * The solid tablet-screen-button icon.See <a href='https://fontawesome.com/v6/icons/tablet-screen-button?s=solid'>example</a>
         */
        TABLET_SCREEN_BUTTON,
        /**
         * The solid tablets icon.See <a href='https://fontawesome.com/v6/icons/tablets?s=solid'>example</a>
         */
        TABLETS,
        /**
         * The solid tachograph-digital icon.See <a href='https://fontawesome.com/v6/icons/tachograph-digital?s=solid'>example</a>
         */
        TACHOGRAPH_DIGITAL,
        /**
         * The solid tachometer icon.See <a href='https://fontawesome.com/v6/icons/tachometer?s=solid'>example</a>
         */
        TACHOMETER,
        /**
         * The solid tachometer-alt icon.See <a href='https://fontawesome.com/v6/icons/tachometer-alt?s=solid'>example</a>
         */
        TACHOMETER_ALT,
        /**
         * The solid tachometer-alt-average icon.See <a href='https://fontawesome.com/v6/icons/tachometer-alt-average?s=solid'>example</a>
         */
        TACHOMETER_ALT_AVERAGE,
        /**
         * The solid tachometer-alt-fast icon.See <a href='https://fontawesome.com/v6/icons/tachometer-alt-fast?s=solid'>example</a>
         */
        TACHOMETER_ALT_FAST,
        /**
         * The solid tachometer-average icon.See <a href='https://fontawesome.com/v6/icons/tachometer-average?s=solid'>example</a>
         */
        TACHOMETER_AVERAGE,
        /**
         * The solid tachometer-fast icon.See <a href='https://fontawesome.com/v6/icons/tachometer-fast?s=solid'>example</a>
         */
        TACHOMETER_FAST,
        /**
         * The solid tag icon.See <a href='https://fontawesome.com/v6/icons/tag?s=solid'>example</a>
         */
        TAG,
        /**
         * The solid tags icon.See <a href='https://fontawesome.com/v6/icons/tags?s=solid'>example</a>
         */
        TAGS,
        /**
         * The solid tanakh icon.See <a href='https://fontawesome.com/v6/icons/tanakh?s=solid'>example</a>
         */
        TANAKH,
        /**
         * The solid tape icon.See <a href='https://fontawesome.com/v6/icons/tape?s=solid'>example</a>
         */
        TAPE,
        /**
         * The solid tarp icon.See <a href='https://fontawesome.com/v6/icons/tarp?s=solid'>example</a>
         */
        TARP,
        /**
         * The solid tarp-droplet icon.See <a href='https://fontawesome.com/v6/icons/tarp-droplet?s=solid'>example</a>
         */
        TARP_DROPLET,
        /**
         * The solid tasks icon.See <a href='https://fontawesome.com/v6/icons/tasks?s=solid'>example</a>
         */
        TASKS,
        /**
         * The solid tasks-alt icon.See <a href='https://fontawesome.com/v6/icons/tasks-alt?s=solid'>example</a>
         */
        TASKS_ALT,
        /**
         * The solid taxi icon.See <a href='https://fontawesome.com/v6/icons/taxi?s=solid'>example</a>
         */
        TAXI,
        /**
         * The solid teeth icon.See <a href='https://fontawesome.com/v6/icons/teeth?s=solid'>example</a>
         */
        TEETH,
        /**
         * The solid teeth-open icon.See <a href='https://fontawesome.com/v6/icons/teeth-open?s=solid'>example</a>
         */
        TEETH_OPEN,
        /**
         * The solid teletype icon.See <a href='https://fontawesome.com/v6/icons/teletype?s=solid'>example</a>
         */
        TELETYPE,
        /**
         * The solid television icon.See <a href='https://fontawesome.com/v6/icons/television?s=solid'>example</a>
         */
        TELEVISION,
        /**
         * The solid temperature-0 icon.See <a href='https://fontawesome.com/v6/icons/temperature-0?s=solid'>example</a>
         */
        TEMPERATURE_0,
        /**
         * The solid temperature-1 icon.See <a href='https://fontawesome.com/v6/icons/temperature-1?s=solid'>example</a>
         */
        TEMPERATURE_1,
        /**
         * The solid temperature-2 icon.See <a href='https://fontawesome.com/v6/icons/temperature-2?s=solid'>example</a>
         */
        TEMPERATURE_2,
        /**
         * The solid temperature-3 icon.See <a href='https://fontawesome.com/v6/icons/temperature-3?s=solid'>example</a>
         */
        TEMPERATURE_3,
        /**
         * The solid temperature-4 icon.See <a href='https://fontawesome.com/v6/icons/temperature-4?s=solid'>example</a>
         */
        TEMPERATURE_4,
        /**
         * The solid temperature-arrow-down icon.See <a href='https://fontawesome.com/v6/icons/temperature-arrow-down?s=solid'>example</a>
         */
        TEMPERATURE_ARROW_DOWN,
        /**
         * The solid temperature-arrow-up icon.See <a href='https://fontawesome.com/v6/icons/temperature-arrow-up?s=solid'>example</a>
         */
        TEMPERATURE_ARROW_UP,
        /**
         * The solid temperature-down icon.See <a href='https://fontawesome.com/v6/icons/temperature-down?s=solid'>example</a>
         */
        TEMPERATURE_DOWN,
        /**
         * The solid temperature-empty icon.See <a href='https://fontawesome.com/v6/icons/temperature-empty?s=solid'>example</a>
         */
        TEMPERATURE_EMPTY,
        /**
         * The solid temperature-full icon.See <a href='https://fontawesome.com/v6/icons/temperature-full?s=solid'>example</a>
         */
        TEMPERATURE_FULL,
        /**
         * The solid temperature-half icon.See <a href='https://fontawesome.com/v6/icons/temperature-half?s=solid'>example</a>
         */
        TEMPERATURE_HALF,
        /**
         * The solid temperature-high icon.See <a href='https://fontawesome.com/v6/icons/temperature-high?s=solid'>example</a>
         */
        TEMPERATURE_HIGH,
        /**
         * The solid temperature-low icon.See <a href='https://fontawesome.com/v6/icons/temperature-low?s=solid'>example</a>
         */
        TEMPERATURE_LOW,
        /**
         * The solid temperature-quarter icon.See <a href='https://fontawesome.com/v6/icons/temperature-quarter?s=solid'>example</a>
         */
        TEMPERATURE_QUARTER,
        /**
         * The solid temperature-three-quarters icon.See <a href='https://fontawesome.com/v6/icons/temperature-three-quarters?s=solid'>example</a>
         */
        TEMPERATURE_THREE_QUARTERS,
        /**
         * The solid temperature-up icon.See <a href='https://fontawesome.com/v6/icons/temperature-up?s=solid'>example</a>
         */
        TEMPERATURE_UP,
        /**
         * The solid tenge icon.See <a href='https://fontawesome.com/v6/icons/tenge?s=solid'>example</a>
         */
        TENGE,
        /**
         * The solid tenge-sign icon.See <a href='https://fontawesome.com/v6/icons/tenge-sign?s=solid'>example</a>
         */
        TENGE_SIGN,
        /**
         * The solid tent icon.See <a href='https://fontawesome.com/v6/icons/tent?s=solid'>example</a>
         */
        TENT,
        /**
         * The solid tent-arrow-down-to-line icon.See <a href='https://fontawesome.com/v6/icons/tent-arrow-down-to-line?s=solid'>example</a>
         */
        TENT_ARROW_DOWN_TO_LINE,
        /**
         * The solid tent-arrow-left-right icon.See <a href='https://fontawesome.com/v6/icons/tent-arrow-left-right?s=solid'>example</a>
         */
        TENT_ARROW_LEFT_RIGHT,
        /**
         * The solid tent-arrow-turn-left icon.See <a href='https://fontawesome.com/v6/icons/tent-arrow-turn-left?s=solid'>example</a>
         */
        TENT_ARROW_TURN_LEFT,
        /**
         * The solid tent-arrows-down icon.See <a href='https://fontawesome.com/v6/icons/tent-arrows-down?s=solid'>example</a>
         */
        TENT_ARROWS_DOWN,
        /**
         * The solid tents icon.See <a href='https://fontawesome.com/v6/icons/tents?s=solid'>example</a>
         */
        TENTS,
        /**
         * The solid terminal icon.See <a href='https://fontawesome.com/v6/icons/terminal?s=solid'>example</a>
         */
        TERMINAL,
        /**
         * The solid text-height icon.See <a href='https://fontawesome.com/v6/icons/text-height?s=solid'>example</a>
         */
        TEXT_HEIGHT,
        /**
         * The solid text-slash icon.See <a href='https://fontawesome.com/v6/icons/text-slash?s=solid'>example</a>
         */
        TEXT_SLASH,
        /**
         * The solid text-width icon.See <a href='https://fontawesome.com/v6/icons/text-width?s=solid'>example</a>
         */
        TEXT_WIDTH,
        /**
         * The solid th icon.See <a href='https://fontawesome.com/v6/icons/th?s=solid'>example</a>
         */
        TH,
        /**
         * The solid th-large icon.See <a href='https://fontawesome.com/v6/icons/th-large?s=solid'>example</a>
         */
        TH_LARGE,
        /**
         * The solid th-list icon.See <a href='https://fontawesome.com/v6/icons/th-list?s=solid'>example</a>
         */
        TH_LIST,
        /**
         * The solid theater-masks icon.See <a href='https://fontawesome.com/v6/icons/theater-masks?s=solid'>example</a>
         */
        THEATER_MASKS,
        /**
         * The solid thermometer icon.See <a href='https://fontawesome.com/v6/icons/thermometer?s=solid'>example</a>
         */
        THERMOMETER,
        /**
         * The solid thermometer-0 icon.See <a href='https://fontawesome.com/v6/icons/thermometer-0?s=solid'>example</a>
         */
        THERMOMETER_0,
        /**
         * The solid thermometer-1 icon.See <a href='https://fontawesome.com/v6/icons/thermometer-1?s=solid'>example</a>
         */
        THERMOMETER_1,
        /**
         * The solid thermometer-2 icon.See <a href='https://fontawesome.com/v6/icons/thermometer-2?s=solid'>example</a>
         */
        THERMOMETER_2,
        /**
         * The solid thermometer-3 icon.See <a href='https://fontawesome.com/v6/icons/thermometer-3?s=solid'>example</a>
         */
        THERMOMETER_3,
        /**
         * The solid thermometer-4 icon.See <a href='https://fontawesome.com/v6/icons/thermometer-4?s=solid'>example</a>
         */
        THERMOMETER_4,
        /**
         * The solid thermometer-empty icon.See <a href='https://fontawesome.com/v6/icons/thermometer-empty?s=solid'>example</a>
         */
        THERMOMETER_EMPTY,
        /**
         * The solid thermometer-full icon.See <a href='https://fontawesome.com/v6/icons/thermometer-full?s=solid'>example</a>
         */
        THERMOMETER_FULL,
        /**
         * The solid thermometer-half icon.See <a href='https://fontawesome.com/v6/icons/thermometer-half?s=solid'>example</a>
         */
        THERMOMETER_HALF,
        /**
         * The solid thermometer-quarter icon.See <a href='https://fontawesome.com/v6/icons/thermometer-quarter?s=solid'>example</a>
         */
        THERMOMETER_QUARTER,
        /**
         * The solid thermometer-three-quarters icon.See <a href='https://fontawesome.com/v6/icons/thermometer-three-quarters?s=solid'>example</a>
         */
        THERMOMETER_THREE_QUARTERS,
        /**
         * The solid thumb-tack icon.See <a href='https://fontawesome.com/v6/icons/thumb-tack?s=solid'>example</a>
         */
        THUMB_TACK,
        /**
         * The solid thumbs-down icon.See <a href='https://fontawesome.com/v6/icons/thumbs-down?s=solid'>example</a>
         */
        THUMBS_DOWN,
        /**
         * The solid thumbs-up icon.See <a href='https://fontawesome.com/v6/icons/thumbs-up?s=solid'>example</a>
         */
        THUMBS_UP,
        /**
         * The solid thumbtack icon.See <a href='https://fontawesome.com/v6/icons/thumbtack?s=solid'>example</a>
         */
        THUMBTACK,
        /**
         * The solid thunderstorm icon.See <a href='https://fontawesome.com/v6/icons/thunderstorm?s=solid'>example</a>
         */
        THUNDERSTORM,
        /**
         * The solid ticket icon.See <a href='https://fontawesome.com/v6/icons/ticket?s=solid'>example</a>
         */
        TICKET,
        /**
         * The solid ticket-alt icon.See <a href='https://fontawesome.com/v6/icons/ticket-alt?s=solid'>example</a>
         */
        TICKET_ALT,
        /**
         * The solid ticket-simple icon.See <a href='https://fontawesome.com/v6/icons/ticket-simple?s=solid'>example</a>
         */
        TICKET_SIMPLE,
        /**
         * The solid timeline icon.See <a href='https://fontawesome.com/v6/icons/timeline?s=solid'>example</a>
         */
        TIMELINE,
        /**
         * The solid times icon.See <a href='https://fontawesome.com/v6/icons/times?s=solid'>example</a>
         */
        TIMES,
        /**
         * The solid times-circle icon.See <a href='https://fontawesome.com/v6/icons/times-circle?s=solid'>example</a>
         */
        TIMES_CIRCLE,
        /**
         * The solid times-rectangle icon.See <a href='https://fontawesome.com/v6/icons/times-rectangle?s=solid'>example</a>
         */
        TIMES_RECTANGLE,
        /**
         * The solid times-square icon.See <a href='https://fontawesome.com/v6/icons/times-square?s=solid'>example</a>
         */
        TIMES_SQUARE,
        /**
         * The solid tint icon.See <a href='https://fontawesome.com/v6/icons/tint?s=solid'>example</a>
         */
        TINT,
        /**
         * The solid tint-slash icon.See <a href='https://fontawesome.com/v6/icons/tint-slash?s=solid'>example</a>
         */
        TINT_SLASH,
        /**
         * The solid tired icon.See <a href='https://fontawesome.com/v6/icons/tired?s=solid'>example</a>
         */
        TIRED,
        /**
         * The solid toggle-off icon.See <a href='https://fontawesome.com/v6/icons/toggle-off?s=solid'>example</a>
         */
        TOGGLE_OFF,
        /**
         * The solid toggle-on icon.See <a href='https://fontawesome.com/v6/icons/toggle-on?s=solid'>example</a>
         */
        TOGGLE_ON,
        /**
         * The solid toilet icon.See <a href='https://fontawesome.com/v6/icons/toilet?s=solid'>example</a>
         */
        TOILET,
        /**
         * The solid toilet-paper icon.See <a href='https://fontawesome.com/v6/icons/toilet-paper?s=solid'>example</a>
         */
        TOILET_PAPER,
        /**
         * The solid toilet-paper-slash icon.See <a href='https://fontawesome.com/v6/icons/toilet-paper-slash?s=solid'>example</a>
         */
        TOILET_PAPER_SLASH,
        /**
         * The solid toilet-portable icon.See <a href='https://fontawesome.com/v6/icons/toilet-portable?s=solid'>example</a>
         */
        TOILET_PORTABLE,
        /**
         * The solid toilets-portable icon.See <a href='https://fontawesome.com/v6/icons/toilets-portable?s=solid'>example</a>
         */
        TOILETS_PORTABLE,
        /**
         * The solid toolbox icon.See <a href='https://fontawesome.com/v6/icons/toolbox?s=solid'>example</a>
         */
        TOOLBOX,
        /**
         * The solid tools icon.See <a href='https://fontawesome.com/v6/icons/tools?s=solid'>example</a>
         */
        TOOLS,
        /**
         * The solid tooth icon.See <a href='https://fontawesome.com/v6/icons/tooth?s=solid'>example</a>
         */
        TOOTH,
        /**
         * The solid torah icon.See <a href='https://fontawesome.com/v6/icons/torah?s=solid'>example</a>
         */
        TORAH,
        /**
         * The solid torii-gate icon.See <a href='https://fontawesome.com/v6/icons/torii-gate?s=solid'>example</a>
         */
        TORII_GATE,
        /**
         * The solid tornado icon.See <a href='https://fontawesome.com/v6/icons/tornado?s=solid'>example</a>
         */
        TORNADO,
        /**
         * The solid tower-broadcast icon.See <a href='https://fontawesome.com/v6/icons/tower-broadcast?s=solid'>example</a>
         */
        TOWER_BROADCAST,
        /**
         * The solid tower-cell icon.See <a href='https://fontawesome.com/v6/icons/tower-cell?s=solid'>example</a>
         */
        TOWER_CELL,
        /**
         * The solid tower-observation icon.See <a href='https://fontawesome.com/v6/icons/tower-observation?s=solid'>example</a>
         */
        TOWER_OBSERVATION,
        /**
         * The solid tractor icon.See <a href='https://fontawesome.com/v6/icons/tractor?s=solid'>example</a>
         */
        TRACTOR,
        /**
         * The solid trademark icon.See <a href='https://fontawesome.com/v6/icons/trademark?s=solid'>example</a>
         */
        TRADEMARK,
        /**
         * The solid traffic-light icon.See <a href='https://fontawesome.com/v6/icons/traffic-light?s=solid'>example</a>
         */
        TRAFFIC_LIGHT,
        /**
         * The solid trailer icon.See <a href='https://fontawesome.com/v6/icons/trailer?s=solid'>example</a>
         */
        TRAILER,
        /**
         * The solid train icon.See <a href='https://fontawesome.com/v6/icons/train?s=solid'>example</a>
         */
        TRAIN,
        /**
         * The solid train-subway icon.See <a href='https://fontawesome.com/v6/icons/train-subway?s=solid'>example</a>
         */
        TRAIN_SUBWAY,
        /**
         * The solid train-tram icon.See <a href='https://fontawesome.com/v6/icons/train-tram?s=solid'>example</a>
         */
        TRAIN_TRAM,
        /**
         * The solid tram icon.See <a href='https://fontawesome.com/v6/icons/tram?s=solid'>example</a>
         */
        TRAM,
        /**
         * The solid transgender icon.See <a href='https://fontawesome.com/v6/icons/transgender?s=solid'>example</a>
         */
        TRANSGENDER,
        /**
         * The solid transgender-alt icon.See <a href='https://fontawesome.com/v6/icons/transgender-alt?s=solid'>example</a>
         */
        TRANSGENDER_ALT,
        /**
         * The solid trash icon.See <a href='https://fontawesome.com/v6/icons/trash?s=solid'>example</a>
         */
        TRASH,
        /**
         * The solid trash-alt icon.See <a href='https://fontawesome.com/v6/icons/trash-alt?s=solid'>example</a>
         */
        TRASH_ALT,
        /**
         * The solid trash-arrow-up icon.See <a href='https://fontawesome.com/v6/icons/trash-arrow-up?s=solid'>example</a>
         */
        TRASH_ARROW_UP,
        /**
         * The solid trash-can icon.See <a href='https://fontawesome.com/v6/icons/trash-can?s=solid'>example</a>
         */
        TRASH_CAN,
        /**
         * The solid trash-can-arrow-up icon.See <a href='https://fontawesome.com/v6/icons/trash-can-arrow-up?s=solid'>example</a>
         */
        TRASH_CAN_ARROW_UP,
        /**
         * The solid trash-restore icon.See <a href='https://fontawesome.com/v6/icons/trash-restore?s=solid'>example</a>
         */
        TRASH_RESTORE,
        /**
         * The solid trash-restore-alt icon.See <a href='https://fontawesome.com/v6/icons/trash-restore-alt?s=solid'>example</a>
         */
        TRASH_RESTORE_ALT,
        /**
         * The solid tree icon.See <a href='https://fontawesome.com/v6/icons/tree?s=solid'>example</a>
         */
        TREE,
        /**
         * The solid tree-city icon.See <a href='https://fontawesome.com/v6/icons/tree-city?s=solid'>example</a>
         */
        TREE_CITY,
        /**
         * The solid triangle-circle-square icon.See <a href='https://fontawesome.com/v6/icons/triangle-circle-square?s=solid'>example</a>
         */
        TRIANGLE_CIRCLE_SQUARE,
        /**
         * The solid triangle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/triangle-exclamation?s=solid'>example</a>
         */
        TRIANGLE_EXCLAMATION,
        /**
         * The solid trophy icon.See <a href='https://fontawesome.com/v6/icons/trophy?s=solid'>example</a>
         */
        TROPHY,
        /**
         * The solid trowel icon.See <a href='https://fontawesome.com/v6/icons/trowel?s=solid'>example</a>
         */
        TROWEL,
        /**
         * The solid trowel-bricks icon.See <a href='https://fontawesome.com/v6/icons/trowel-bricks?s=solid'>example</a>
         */
        TROWEL_BRICKS,
        /**
         * The solid truck icon.See <a href='https://fontawesome.com/v6/icons/truck?s=solid'>example</a>
         */
        TRUCK,
        /**
         * The solid truck-arrow-right icon.See <a href='https://fontawesome.com/v6/icons/truck-arrow-right?s=solid'>example</a>
         */
        TRUCK_ARROW_RIGHT,
        /**
         * The solid truck-droplet icon.See <a href='https://fontawesome.com/v6/icons/truck-droplet?s=solid'>example</a>
         */
        TRUCK_DROPLET,
        /**
         * The solid truck-fast icon.See <a href='https://fontawesome.com/v6/icons/truck-fast?s=solid'>example</a>
         */
        TRUCK_FAST,
        /**
         * The solid truck-field icon.See <a href='https://fontawesome.com/v6/icons/truck-field?s=solid'>example</a>
         */
        TRUCK_FIELD,
        /**
         * The solid truck-field-un icon.See <a href='https://fontawesome.com/v6/icons/truck-field-un?s=solid'>example</a>
         */
        TRUCK_FIELD_UN,
        /**
         * The solid truck-front icon.See <a href='https://fontawesome.com/v6/icons/truck-front?s=solid'>example</a>
         */
        TRUCK_FRONT,
        /**
         * The solid truck-loading icon.See <a href='https://fontawesome.com/v6/icons/truck-loading?s=solid'>example</a>
         */
        TRUCK_LOADING,
        /**
         * The solid truck-medical icon.See <a href='https://fontawesome.com/v6/icons/truck-medical?s=solid'>example</a>
         */
        TRUCK_MEDICAL,
        /**
         * The solid truck-monster icon.See <a href='https://fontawesome.com/v6/icons/truck-monster?s=solid'>example</a>
         */
        TRUCK_MONSTER,
        /**
         * The solid truck-moving icon.See <a href='https://fontawesome.com/v6/icons/truck-moving?s=solid'>example</a>
         */
        TRUCK_MOVING,
        /**
         * The solid truck-pickup icon.See <a href='https://fontawesome.com/v6/icons/truck-pickup?s=solid'>example</a>
         */
        TRUCK_PICKUP,
        /**
         * The solid truck-plane icon.See <a href='https://fontawesome.com/v6/icons/truck-plane?s=solid'>example</a>
         */
        TRUCK_PLANE,
        /**
         * The solid truck-ramp-box icon.See <a href='https://fontawesome.com/v6/icons/truck-ramp-box?s=solid'>example</a>
         */
        TRUCK_RAMP_BOX,
        /**
         * The solid try icon.See <a href='https://fontawesome.com/v6/icons/try?s=solid'>example</a>
         */
        TRY,
        /**
         * The solid tshirt icon.See <a href='https://fontawesome.com/v6/icons/tshirt?s=solid'>example</a>
         */
        TSHIRT,
        /**
         * The solid tty icon.See <a href='https://fontawesome.com/v6/icons/tty?s=solid'>example</a>
         */
        TTY,
        /**
         * The solid turkish-lira icon.See <a href='https://fontawesome.com/v6/icons/turkish-lira?s=solid'>example</a>
         */
        TURKISH_LIRA,
        /**
         * The solid turkish-lira-sign icon.See <a href='https://fontawesome.com/v6/icons/turkish-lira-sign?s=solid'>example</a>
         */
        TURKISH_LIRA_SIGN,
        /**
         * The solid turn-down icon.See <a href='https://fontawesome.com/v6/icons/turn-down?s=solid'>example</a>
         */
        TURN_DOWN,
        /**
         * The solid turn-up icon.See <a href='https://fontawesome.com/v6/icons/turn-up?s=solid'>example</a>
         */
        TURN_UP,
        /**
         * The solid tv icon.See <a href='https://fontawesome.com/v6/icons/tv?s=solid'>example</a>
         */
        TV,
        /**
         * The solid tv-alt icon.See <a href='https://fontawesome.com/v6/icons/tv-alt?s=solid'>example</a>
         */
        TV_ALT,
        /**
         * The solid u icon.See <a href='https://fontawesome.com/v6/icons/u?s=solid'>example</a>
         */
        U,
        /**
         * The solid umbrella icon.See <a href='https://fontawesome.com/v6/icons/umbrella?s=solid'>example</a>
         */
        UMBRELLA,
        /**
         * The solid umbrella-beach icon.See <a href='https://fontawesome.com/v6/icons/umbrella-beach?s=solid'>example</a>
         */
        UMBRELLA_BEACH,
        /**
         * The solid underline icon.See <a href='https://fontawesome.com/v6/icons/underline?s=solid'>example</a>
         */
        UNDERLINE,
        /**
         * The solid undo icon.See <a href='https://fontawesome.com/v6/icons/undo?s=solid'>example</a>
         */
        UNDO,
        /**
         * The solid undo-alt icon.See <a href='https://fontawesome.com/v6/icons/undo-alt?s=solid'>example</a>
         */
        UNDO_ALT,
        /**
         * The solid universal-access icon.See <a href='https://fontawesome.com/v6/icons/universal-access?s=solid'>example</a>
         */
        UNIVERSAL_ACCESS,
        /**
         * The solid university icon.See <a href='https://fontawesome.com/v6/icons/university?s=solid'>example</a>
         */
        UNIVERSITY,
        /**
         * The solid unlink icon.See <a href='https://fontawesome.com/v6/icons/unlink?s=solid'>example</a>
         */
        UNLINK,
        /**
         * The solid unlock icon.See <a href='https://fontawesome.com/v6/icons/unlock?s=solid'>example</a>
         */
        UNLOCK,
        /**
         * The solid unlock-alt icon.See <a href='https://fontawesome.com/v6/icons/unlock-alt?s=solid'>example</a>
         */
        UNLOCK_ALT,
        /**
         * The solid unlock-keyhole icon.See <a href='https://fontawesome.com/v6/icons/unlock-keyhole?s=solid'>example</a>
         */
        UNLOCK_KEYHOLE,
        /**
         * The solid unsorted icon.See <a href='https://fontawesome.com/v6/icons/unsorted?s=solid'>example</a>
         */
        UNSORTED,
        /**
         * The solid up-down icon.See <a href='https://fontawesome.com/v6/icons/up-down?s=solid'>example</a>
         */
        UP_DOWN,
        /**
         * The solid up-down-left-right icon.See <a href='https://fontawesome.com/v6/icons/up-down-left-right?s=solid'>example</a>
         */
        UP_DOWN_LEFT_RIGHT,
        /**
         * The solid up-long icon.See <a href='https://fontawesome.com/v6/icons/up-long?s=solid'>example</a>
         */
        UP_LONG,
        /**
         * The solid up-right-and-down-left-from-center icon.See <a href='https://fontawesome.com/v6/icons/up-right-and-down-left-from-center?s=solid'>example</a>
         */
        UP_RIGHT_AND_DOWN_LEFT_FROM_CENTER,
        /**
         * The solid up-right-from-square icon.See <a href='https://fontawesome.com/v6/icons/up-right-from-square?s=solid'>example</a>
         */
        UP_RIGHT_FROM_SQUARE,
        /**
         * The solid upload icon.See <a href='https://fontawesome.com/v6/icons/upload?s=solid'>example</a>
         */
        UPLOAD,
        /**
         * The solid usd icon.See <a href='https://fontawesome.com/v6/icons/usd?s=solid'>example</a>
         */
        USD,
        /**
         * The solid user icon.See <a href='https://fontawesome.com/v6/icons/user?s=solid'>example</a>
         */
        USER,
        /**
         * The solid user-alt icon.See <a href='https://fontawesome.com/v6/icons/user-alt?s=solid'>example</a>
         */
        USER_ALT,
        /**
         * The solid user-alt-slash icon.See <a href='https://fontawesome.com/v6/icons/user-alt-slash?s=solid'>example</a>
         */
        USER_ALT_SLASH,
        /**
         * The solid user-astronaut icon.See <a href='https://fontawesome.com/v6/icons/user-astronaut?s=solid'>example</a>
         */
        USER_ASTRONAUT,
        /**
         * The solid user-check icon.See <a href='https://fontawesome.com/v6/icons/user-check?s=solid'>example</a>
         */
        USER_CHECK,
        /**
         * The solid user-circle icon.See <a href='https://fontawesome.com/v6/icons/user-circle?s=solid'>example</a>
         */
        USER_CIRCLE,
        /**
         * The solid user-clock icon.See <a href='https://fontawesome.com/v6/icons/user-clock?s=solid'>example</a>
         */
        USER_CLOCK,
        /**
         * The solid user-cog icon.See <a href='https://fontawesome.com/v6/icons/user-cog?s=solid'>example</a>
         */
        USER_COG,
        /**
         * The solid user-doctor icon.See <a href='https://fontawesome.com/v6/icons/user-doctor?s=solid'>example</a>
         */
        USER_DOCTOR,
        /**
         * The solid user-edit icon.See <a href='https://fontawesome.com/v6/icons/user-edit?s=solid'>example</a>
         */
        USER_EDIT,
        /**
         * The solid user-friends icon.See <a href='https://fontawesome.com/v6/icons/user-friends?s=solid'>example</a>
         */
        USER_FRIENDS,
        /**
         * The solid user-gear icon.See <a href='https://fontawesome.com/v6/icons/user-gear?s=solid'>example</a>
         */
        USER_GEAR,
        /**
         * The solid user-graduate icon.See <a href='https://fontawesome.com/v6/icons/user-graduate?s=solid'>example</a>
         */
        USER_GRADUATE,
        /**
         * The solid user-group icon.See <a href='https://fontawesome.com/v6/icons/user-group?s=solid'>example</a>
         */
        USER_GROUP,
        /**
         * The solid user-injured icon.See <a href='https://fontawesome.com/v6/icons/user-injured?s=solid'>example</a>
         */
        USER_INJURED,
        /**
         * The solid user-large icon.See <a href='https://fontawesome.com/v6/icons/user-large?s=solid'>example</a>
         */
        USER_LARGE,
        /**
         * The solid user-large-slash icon.See <a href='https://fontawesome.com/v6/icons/user-large-slash?s=solid'>example</a>
         */
        USER_LARGE_SLASH,
        /**
         * The solid user-lock icon.See <a href='https://fontawesome.com/v6/icons/user-lock?s=solid'>example</a>
         */
        USER_LOCK,
        /**
         * The solid user-md icon.See <a href='https://fontawesome.com/v6/icons/user-md?s=solid'>example</a>
         */
        USER_MD,
        /**
         * The solid user-minus icon.See <a href='https://fontawesome.com/v6/icons/user-minus?s=solid'>example</a>
         */
        USER_MINUS,
        /**
         * The solid user-ninja icon.See <a href='https://fontawesome.com/v6/icons/user-ninja?s=solid'>example</a>
         */
        USER_NINJA,
        /**
         * The solid user-nurse icon.See <a href='https://fontawesome.com/v6/icons/user-nurse?s=solid'>example</a>
         */
        USER_NURSE,
        /**
         * The solid user-pen icon.See <a href='https://fontawesome.com/v6/icons/user-pen?s=solid'>example</a>
         */
        USER_PEN,
        /**
         * The solid user-plus icon.See <a href='https://fontawesome.com/v6/icons/user-plus?s=solid'>example</a>
         */
        USER_PLUS,
        /**
         * The solid user-secret icon.See <a href='https://fontawesome.com/v6/icons/user-secret?s=solid'>example</a>
         */
        USER_SECRET,
        /**
         * The solid user-shield icon.See <a href='https://fontawesome.com/v6/icons/user-shield?s=solid'>example</a>
         */
        USER_SHIELD,
        /**
         * The solid user-slash icon.See <a href='https://fontawesome.com/v6/icons/user-slash?s=solid'>example</a>
         */
        USER_SLASH,
        /**
         * The solid user-tag icon.See <a href='https://fontawesome.com/v6/icons/user-tag?s=solid'>example</a>
         */
        USER_TAG,
        /**
         * The solid user-tie icon.See <a href='https://fontawesome.com/v6/icons/user-tie?s=solid'>example</a>
         */
        USER_TIE,
        /**
         * The solid user-times icon.See <a href='https://fontawesome.com/v6/icons/user-times?s=solid'>example</a>
         */
        USER_TIMES,
        /**
         * The solid user-xmark icon.See <a href='https://fontawesome.com/v6/icons/user-xmark?s=solid'>example</a>
         */
        USER_XMARK,
        /**
         * The solid users icon.See <a href='https://fontawesome.com/v6/icons/users?s=solid'>example</a>
         */
        USERS,
        /**
         * The solid users-between-lines icon.See <a href='https://fontawesome.com/v6/icons/users-between-lines?s=solid'>example</a>
         */
        USERS_BETWEEN_LINES,
        /**
         * The solid users-cog icon.See <a href='https://fontawesome.com/v6/icons/users-cog?s=solid'>example</a>
         */
        USERS_COG,
        /**
         * The solid users-gear icon.See <a href='https://fontawesome.com/v6/icons/users-gear?s=solid'>example</a>
         */
        USERS_GEAR,
        /**
         * The solid users-line icon.See <a href='https://fontawesome.com/v6/icons/users-line?s=solid'>example</a>
         */
        USERS_LINE,
        /**
         * The solid users-rays icon.See <a href='https://fontawesome.com/v6/icons/users-rays?s=solid'>example</a>
         */
        USERS_RAYS,
        /**
         * The solid users-rectangle icon.See <a href='https://fontawesome.com/v6/icons/users-rectangle?s=solid'>example</a>
         */
        USERS_RECTANGLE,
        /**
         * The solid users-slash icon.See <a href='https://fontawesome.com/v6/icons/users-slash?s=solid'>example</a>
         */
        USERS_SLASH,
        /**
         * The solid users-viewfinder icon.See <a href='https://fontawesome.com/v6/icons/users-viewfinder?s=solid'>example</a>
         */
        USERS_VIEWFINDER,
        /**
         * The solid utensil-spoon icon.See <a href='https://fontawesome.com/v6/icons/utensil-spoon?s=solid'>example</a>
         */
        UTENSIL_SPOON,
        /**
         * The solid utensils icon.See <a href='https://fontawesome.com/v6/icons/utensils?s=solid'>example</a>
         */
        UTENSILS,
        /**
         * The solid v icon.See <a href='https://fontawesome.com/v6/icons/v?s=solid'>example</a>
         */
        V,
        /**
         * The solid van-shuttle icon.See <a href='https://fontawesome.com/v6/icons/van-shuttle?s=solid'>example</a>
         */
        VAN_SHUTTLE,
        /**
         * The solid vault icon.See <a href='https://fontawesome.com/v6/icons/vault?s=solid'>example</a>
         */
        VAULT,
        /**
         * The solid vcard icon.See <a href='https://fontawesome.com/v6/icons/vcard?s=solid'>example</a>
         */
        VCARD,
        /**
         * The solid vector-square icon.See <a href='https://fontawesome.com/v6/icons/vector-square?s=solid'>example</a>
         */
        VECTOR_SQUARE,
        /**
         * The solid venus icon.See <a href='https://fontawesome.com/v6/icons/venus?s=solid'>example</a>
         */
        VENUS,
        /**
         * The solid venus-double icon.See <a href='https://fontawesome.com/v6/icons/venus-double?s=solid'>example</a>
         */
        VENUS_DOUBLE,
        /**
         * The solid venus-mars icon.See <a href='https://fontawesome.com/v6/icons/venus-mars?s=solid'>example</a>
         */
        VENUS_MARS,
        /**
         * The solid vest icon.See <a href='https://fontawesome.com/v6/icons/vest?s=solid'>example</a>
         */
        VEST,
        /**
         * The solid vest-patches icon.See <a href='https://fontawesome.com/v6/icons/vest-patches?s=solid'>example</a>
         */
        VEST_PATCHES,
        /**
         * The solid vial icon.See <a href='https://fontawesome.com/v6/icons/vial?s=solid'>example</a>
         */
        VIAL,
        /**
         * The solid vial-circle-check icon.See <a href='https://fontawesome.com/v6/icons/vial-circle-check?s=solid'>example</a>
         */
        VIAL_CIRCLE_CHECK,
        /**
         * The solid vial-virus icon.See <a href='https://fontawesome.com/v6/icons/vial-virus?s=solid'>example</a>
         */
        VIAL_VIRUS,
        /**
         * The solid vials icon.See <a href='https://fontawesome.com/v6/icons/vials?s=solid'>example</a>
         */
        VIALS,
        /**
         * The solid video icon.See <a href='https://fontawesome.com/v6/icons/video?s=solid'>example</a>
         */
        VIDEO,
        /**
         * The solid video-camera icon.See <a href='https://fontawesome.com/v6/icons/video-camera?s=solid'>example</a>
         */
        VIDEO_CAMERA,
        /**
         * The solid video-slash icon.See <a href='https://fontawesome.com/v6/icons/video-slash?s=solid'>example</a>
         */
        VIDEO_SLASH,
        /**
         * The solid vihara icon.See <a href='https://fontawesome.com/v6/icons/vihara?s=solid'>example</a>
         */
        VIHARA,
        /**
         * The solid virus icon.See <a href='https://fontawesome.com/v6/icons/virus?s=solid'>example</a>
         */
        VIRUS,
        /**
         * The solid virus-covid icon.See <a href='https://fontawesome.com/v6/icons/virus-covid?s=solid'>example</a>
         */
        VIRUS_COVID,
        /**
         * The solid virus-covid-slash icon.See <a href='https://fontawesome.com/v6/icons/virus-covid-slash?s=solid'>example</a>
         */
        VIRUS_COVID_SLASH,
        /**
         * The solid virus-slash icon.See <a href='https://fontawesome.com/v6/icons/virus-slash?s=solid'>example</a>
         */
        VIRUS_SLASH,
        /**
         * The solid viruses icon.See <a href='https://fontawesome.com/v6/icons/viruses?s=solid'>example</a>
         */
        VIRUSES,
        /**
         * The solid voicemail icon.See <a href='https://fontawesome.com/v6/icons/voicemail?s=solid'>example</a>
         */
        VOICEMAIL,
        /**
         * The solid volcano icon.See <a href='https://fontawesome.com/v6/icons/volcano?s=solid'>example</a>
         */
        VOLCANO,
        /**
         * The solid volleyball icon.See <a href='https://fontawesome.com/v6/icons/volleyball?s=solid'>example</a>
         */
        VOLLEYBALL,
        /**
         * The solid volleyball-ball icon.See <a href='https://fontawesome.com/v6/icons/volleyball-ball?s=solid'>example</a>
         */
        VOLLEYBALL_BALL,
        /**
         * The solid volume-control-phone icon.See <a href='https://fontawesome.com/v6/icons/volume-control-phone?s=solid'>example</a>
         */
        VOLUME_CONTROL_PHONE,
        /**
         * The solid volume-down icon.See <a href='https://fontawesome.com/v6/icons/volume-down?s=solid'>example</a>
         */
        VOLUME_DOWN,
        /**
         * The solid volume-high icon.See <a href='https://fontawesome.com/v6/icons/volume-high?s=solid'>example</a>
         */
        VOLUME_HIGH,
        /**
         * The solid volume-low icon.See <a href='https://fontawesome.com/v6/icons/volume-low?s=solid'>example</a>
         */
        VOLUME_LOW,
        /**
         * The solid volume-mute icon.See <a href='https://fontawesome.com/v6/icons/volume-mute?s=solid'>example</a>
         */
        VOLUME_MUTE,
        /**
         * The solid volume-off icon.See <a href='https://fontawesome.com/v6/icons/volume-off?s=solid'>example</a>
         */
        VOLUME_OFF,
        /**
         * The solid volume-times icon.See <a href='https://fontawesome.com/v6/icons/volume-times?s=solid'>example</a>
         */
        VOLUME_TIMES,
        /**
         * The solid volume-up icon.See <a href='https://fontawesome.com/v6/icons/volume-up?s=solid'>example</a>
         */
        VOLUME_UP,
        /**
         * The solid volume-xmark icon.See <a href='https://fontawesome.com/v6/icons/volume-xmark?s=solid'>example</a>
         */
        VOLUME_XMARK,
        /**
         * The solid vote-yea icon.See <a href='https://fontawesome.com/v6/icons/vote-yea?s=solid'>example</a>
         */
        VOTE_YEA,
        /**
         * The solid vr-cardboard icon.See <a href='https://fontawesome.com/v6/icons/vr-cardboard?s=solid'>example</a>
         */
        VR_CARDBOARD,
        /**
         * The solid w icon.See <a href='https://fontawesome.com/v6/icons/w?s=solid'>example</a>
         */
        W,
        /**
         * The solid walkie-talkie icon.See <a href='https://fontawesome.com/v6/icons/walkie-talkie?s=solid'>example</a>
         */
        WALKIE_TALKIE,
        /**
         * The solid walking icon.See <a href='https://fontawesome.com/v6/icons/walking?s=solid'>example</a>
         */
        WALKING,
        /**
         * The solid wallet icon.See <a href='https://fontawesome.com/v6/icons/wallet?s=solid'>example</a>
         */
        WALLET,
        /**
         * The solid wand-magic icon.See <a href='https://fontawesome.com/v6/icons/wand-magic?s=solid'>example</a>
         */
        WAND_MAGIC,
        /**
         * The solid wand-magic-sparkles icon.See <a href='https://fontawesome.com/v6/icons/wand-magic-sparkles?s=solid'>example</a>
         */
        WAND_MAGIC_SPARKLES,
        /**
         * The solid wand-sparkles icon.See <a href='https://fontawesome.com/v6/icons/wand-sparkles?s=solid'>example</a>
         */
        WAND_SPARKLES,
        /**
         * The solid warehouse icon.See <a href='https://fontawesome.com/v6/icons/warehouse?s=solid'>example</a>
         */
        WAREHOUSE,
        /**
         * The solid warning icon.See <a href='https://fontawesome.com/v6/icons/warning?s=solid'>example</a>
         */
        WARNING,
        /**
         * The solid water icon.See <a href='https://fontawesome.com/v6/icons/water?s=solid'>example</a>
         */
        WATER,
        /**
         * The solid water-ladder icon.See <a href='https://fontawesome.com/v6/icons/water-ladder?s=solid'>example</a>
         */
        WATER_LADDER,
        /**
         * The solid wave-square icon.See <a href='https://fontawesome.com/v6/icons/wave-square?s=solid'>example</a>
         */
        WAVE_SQUARE,
        /**
         * The solid weight icon.See <a href='https://fontawesome.com/v6/icons/weight?s=solid'>example</a>
         */
        WEIGHT,
        /**
         * The solid weight-hanging icon.See <a href='https://fontawesome.com/v6/icons/weight-hanging?s=solid'>example</a>
         */
        WEIGHT_HANGING,
        /**
         * The solid weight-scale icon.See <a href='https://fontawesome.com/v6/icons/weight-scale?s=solid'>example</a>
         */
        WEIGHT_SCALE,
        /**
         * The solid wheat-alt icon.See <a href='https://fontawesome.com/v6/icons/wheat-alt?s=solid'>example</a>
         */
        WHEAT_ALT,
        /**
         * The solid wheat-awn icon.See <a href='https://fontawesome.com/v6/icons/wheat-awn?s=solid'>example</a>
         */
        WHEAT_AWN,
        /**
         * The solid wheat-awn-circle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/wheat-awn-circle-exclamation?s=solid'>example</a>
         */
        WHEAT_AWN_CIRCLE_EXCLAMATION,
        /**
         * The solid wheelchair icon.See <a href='https://fontawesome.com/v6/icons/wheelchair?s=solid'>example</a>
         */
        WHEELCHAIR,
        /**
         * The solid wheelchair-alt icon.See <a href='https://fontawesome.com/v6/icons/wheelchair-alt?s=solid'>example</a>
         */
        WHEELCHAIR_ALT,
        /**
         * The solid wheelchair-move icon.See <a href='https://fontawesome.com/v6/icons/wheelchair-move?s=solid'>example</a>
         */
        WHEELCHAIR_MOVE,
        /**
         * The solid whiskey-glass icon.See <a href='https://fontawesome.com/v6/icons/whiskey-glass?s=solid'>example</a>
         */
        WHISKEY_GLASS,
        /**
         * The solid wifi icon.See <a href='https://fontawesome.com/v6/icons/wifi?s=solid'>example</a>
         */
        WIFI,
        /**
         * The solid wifi-3 icon.See <a href='https://fontawesome.com/v6/icons/wifi-3?s=solid'>example</a>
         */
        WIFI_3,
        /**
         * The solid wifi-strong icon.See <a href='https://fontawesome.com/v6/icons/wifi-strong?s=solid'>example</a>
         */
        WIFI_STRONG,
        /**
         * The solid wind icon.See <a href='https://fontawesome.com/v6/icons/wind?s=solid'>example</a>
         */
        WIND,
        /**
         * The solid window-close icon.See <a href='https://fontawesome.com/v6/icons/window-close?s=solid'>example</a>
         */
        WINDOW_CLOSE,
        /**
         * The solid window-maximize icon.See <a href='https://fontawesome.com/v6/icons/window-maximize?s=solid'>example</a>
         */
        WINDOW_MAXIMIZE,
        /**
         * The solid window-minimize icon.See <a href='https://fontawesome.com/v6/icons/window-minimize?s=solid'>example</a>
         */
        WINDOW_MINIMIZE,
        /**
         * The solid window-restore icon.See <a href='https://fontawesome.com/v6/icons/window-restore?s=solid'>example</a>
         */
        WINDOW_RESTORE,
        /**
         * The solid wine-bottle icon.See <a href='https://fontawesome.com/v6/icons/wine-bottle?s=solid'>example</a>
         */
        WINE_BOTTLE,
        /**
         * The solid wine-glass icon.See <a href='https://fontawesome.com/v6/icons/wine-glass?s=solid'>example</a>
         */
        WINE_GLASS,
        /**
         * The solid wine-glass-alt icon.See <a href='https://fontawesome.com/v6/icons/wine-glass-alt?s=solid'>example</a>
         */
        WINE_GLASS_ALT,
        /**
         * The solid wine-glass-empty icon.See <a href='https://fontawesome.com/v6/icons/wine-glass-empty?s=solid'>example</a>
         */
        WINE_GLASS_EMPTY,
        /**
         * The solid won icon.See <a href='https://fontawesome.com/v6/icons/won?s=solid'>example</a>
         */
        WON,
        /**
         * The solid won-sign icon.See <a href='https://fontawesome.com/v6/icons/won-sign?s=solid'>example</a>
         */
        WON_SIGN,
        /**
         * The solid worm icon.See <a href='https://fontawesome.com/v6/icons/worm?s=solid'>example</a>
         */
        WORM,
        /**
         * The solid wrench icon.See <a href='https://fontawesome.com/v6/icons/wrench?s=solid'>example</a>
         */
        WRENCH,
        /**
         * The solid x icon.See <a href='https://fontawesome.com/v6/icons/x?s=solid'>example</a>
         */
        X,
        /**
         * The solid x-ray icon.See <a href='https://fontawesome.com/v6/icons/x-ray?s=solid'>example</a>
         */
        X_RAY,
        /**
         * The solid xmark icon.See <a href='https://fontawesome.com/v6/icons/xmark?s=solid'>example</a>
         */
        XMARK,
        /**
         * The solid xmark-circle icon.See <a href='https://fontawesome.com/v6/icons/xmark-circle?s=solid'>example</a>
         */
        XMARK_CIRCLE,
        /**
         * The solid xmark-square icon.See <a href='https://fontawesome.com/v6/icons/xmark-square?s=solid'>example</a>
         */
        XMARK_SQUARE,
        /**
         * The solid xmarks-lines icon.See <a href='https://fontawesome.com/v6/icons/xmarks-lines?s=solid'>example</a>
         */
        XMARKS_LINES,
        /**
         * The solid y icon.See <a href='https://fontawesome.com/v6/icons/y?s=solid'>example</a>
         */
        Y,
        /**
         * The solid yen icon.See <a href='https://fontawesome.com/v6/icons/yen?s=solid'>example</a>
         */
        YEN,
        /**
         * The solid yen-sign icon.See <a href='https://fontawesome.com/v6/icons/yen-sign?s=solid'>example</a>
         */
        YEN_SIGN,
        /**
         * The solid yin-yang icon.See <a href='https://fontawesome.com/v6/icons/yin-yang?s=solid'>example</a>
         */
        YIN_YANG,
        /**
         * The solid z icon.See <a href='https://fontawesome.com/v6/icons/z?s=solid'>example</a>
         */
        Z,
        /**
         * The solid zap icon.See <a href='https://fontawesome.com/v6/icons/zap?s=solid'>example</a>
         */
        ZAP;

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
            return this.name().toLowerCase(Locale.ENGLISH).replace('_', '-').replaceFirst("^-", "");
        }

        /**
         * Create a new {@link Icon} instance with the icon determined by the name.
         * @return a new instance of {@link Icon} component
         */
        public Icon create() {
            return new Icon(this.getIconPart());
        }

        /**
         * Create a new {@link Icon} instance with the icon determined by the name and a listener for click events.
         * @param listener the event listener for click events
         * @return a new instance of {@link Icon} component
         */
        public Icon create(ComponentEventListener<ClickEvent<com.vaadin.flow.component.icon.Icon>> listener) {
            Icon icon = create();
            icon.addClickListener(listener);
            return icon;
        }

        /**
         * Server side component for {@code Solid}
         */
        @JsModule("./font-awesome-iron-iconset/fas.js")
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "4.2.0")
        @SuppressWarnings("serial")
        public static final class Icon extends com.vaadin.flow.component.icon.Icon implements ClickNotifier<com.vaadin.flow.component.icon.Icon> {

             Icon(String icon) {
                super(ICONSET, icon);
            }
        }
    }

    /**
     * Enumeration of all icons in the FontAwesome brands iconset
     * <p>
     * These instances can be used to create {@link Icon} components either by using
     * their {@link #create()} method or by passing them to Icon's constructor.
     *
     * @author Javier Godoy / Flowing Code
     */
    public enum Brands implements IconFactory {

        /**
         * The brands 42-group icon.See <a href='https://fontawesome.com/v6/icons/42-group?s=brands'>example</a>
         */
        _42_GROUP,
        /**
         * The brands 500px icon.See <a href='https://fontawesome.com/v6/icons/500px?s=brands'>example</a>
         */
        _500PX,
        /**
         * The brands accessible-icon icon.See <a href='https://fontawesome.com/v6/icons/accessible-icon?s=brands'>example</a>
         */
        ACCESSIBLE_ICON,
        /**
         * The brands accusoft icon.See <a href='https://fontawesome.com/v6/icons/accusoft?s=brands'>example</a>
         */
        ACCUSOFT,
        /**
         * The brands adn icon.See <a href='https://fontawesome.com/v6/icons/adn?s=brands'>example</a>
         */
        ADN,
        /**
         * The brands adversal icon.See <a href='https://fontawesome.com/v6/icons/adversal?s=brands'>example</a>
         */
        ADVERSAL,
        /**
         * The brands affiliatetheme icon.See <a href='https://fontawesome.com/v6/icons/affiliatetheme?s=brands'>example</a>
         */
        AFFILIATETHEME,
        /**
         * The brands airbnb icon.See <a href='https://fontawesome.com/v6/icons/airbnb?s=brands'>example</a>
         */
        AIRBNB,
        /**
         * The brands algolia icon.See <a href='https://fontawesome.com/v6/icons/algolia?s=brands'>example</a>
         */
        ALGOLIA,
        /**
         * The brands alipay icon.See <a href='https://fontawesome.com/v6/icons/alipay?s=brands'>example</a>
         */
        ALIPAY,
        /**
         * The brands amazon icon.See <a href='https://fontawesome.com/v6/icons/amazon?s=brands'>example</a>
         */
        AMAZON,
        /**
         * The brands amazon-pay icon.See <a href='https://fontawesome.com/v6/icons/amazon-pay?s=brands'>example</a>
         */
        AMAZON_PAY,
        /**
         * The brands amilia icon.See <a href='https://fontawesome.com/v6/icons/amilia?s=brands'>example</a>
         */
        AMILIA,
        /**
         * The brands android icon.See <a href='https://fontawesome.com/v6/icons/android?s=brands'>example</a>
         */
        ANDROID,
        /**
         * The brands angellist icon.See <a href='https://fontawesome.com/v6/icons/angellist?s=brands'>example</a>
         */
        ANGELLIST,
        /**
         * The brands angrycreative icon.See <a href='https://fontawesome.com/v6/icons/angrycreative?s=brands'>example</a>
         */
        ANGRYCREATIVE,
        /**
         * The brands angular icon.See <a href='https://fontawesome.com/v6/icons/angular?s=brands'>example</a>
         */
        ANGULAR,
        /**
         * The brands app-store icon.See <a href='https://fontawesome.com/v6/icons/app-store?s=brands'>example</a>
         */
        APP_STORE,
        /**
         * The brands app-store-ios icon.See <a href='https://fontawesome.com/v6/icons/app-store-ios?s=brands'>example</a>
         */
        APP_STORE_IOS,
        /**
         * The brands apper icon.See <a href='https://fontawesome.com/v6/icons/apper?s=brands'>example</a>
         */
        APPER,
        /**
         * The brands apple icon.See <a href='https://fontawesome.com/v6/icons/apple?s=brands'>example</a>
         */
        APPLE,
        /**
         * The brands apple-pay icon.See <a href='https://fontawesome.com/v6/icons/apple-pay?s=brands'>example</a>
         */
        APPLE_PAY,
        /**
         * The brands artstation icon.See <a href='https://fontawesome.com/v6/icons/artstation?s=brands'>example</a>
         */
        ARTSTATION,
        /**
         * The brands asymmetrik icon.See <a href='https://fontawesome.com/v6/icons/asymmetrik?s=brands'>example</a>
         */
        ASYMMETRIK,
        /**
         * The brands atlassian icon.See <a href='https://fontawesome.com/v6/icons/atlassian?s=brands'>example</a>
         */
        ATLASSIAN,
        /**
         * The brands audible icon.See <a href='https://fontawesome.com/v6/icons/audible?s=brands'>example</a>
         */
        AUDIBLE,
        /**
         * The brands autoprefixer icon.See <a href='https://fontawesome.com/v6/icons/autoprefixer?s=brands'>example</a>
         */
        AUTOPREFIXER,
        /**
         * The brands avianex icon.See <a href='https://fontawesome.com/v6/icons/avianex?s=brands'>example</a>
         */
        AVIANEX,
        /**
         * The brands aviato icon.See <a href='https://fontawesome.com/v6/icons/aviato?s=brands'>example</a>
         */
        AVIATO,
        /**
         * The brands aws icon.See <a href='https://fontawesome.com/v6/icons/aws?s=brands'>example</a>
         */
        AWS,
        /**
         * The brands bandcamp icon.See <a href='https://fontawesome.com/v6/icons/bandcamp?s=brands'>example</a>
         */
        BANDCAMP,
        /**
         * The brands battle-net icon.See <a href='https://fontawesome.com/v6/icons/battle-net?s=brands'>example</a>
         */
        BATTLE_NET,
        /**
         * The brands behance icon.See <a href='https://fontawesome.com/v6/icons/behance?s=brands'>example</a>
         */
        BEHANCE,
        /**
         * The brands behance-square icon.See <a href='https://fontawesome.com/v6/icons/behance-square?s=brands'>example</a>
         */
        BEHANCE_SQUARE,
        /**
         * The brands bilibili icon.See <a href='https://fontawesome.com/v6/icons/bilibili?s=brands'>example</a>
         */
        BILIBILI,
        /**
         * The brands bimobject icon.See <a href='https://fontawesome.com/v6/icons/bimobject?s=brands'>example</a>
         */
        BIMOBJECT,
        /**
         * The brands bitbucket icon.See <a href='https://fontawesome.com/v6/icons/bitbucket?s=brands'>example</a>
         */
        BITBUCKET,
        /**
         * The brands bitcoin icon.See <a href='https://fontawesome.com/v6/icons/bitcoin?s=brands'>example</a>
         */
        BITCOIN,
        /**
         * The brands bity icon.See <a href='https://fontawesome.com/v6/icons/bity?s=brands'>example</a>
         */
        BITY,
        /**
         * The brands black-tie icon.See <a href='https://fontawesome.com/v6/icons/black-tie?s=brands'>example</a>
         */
        BLACK_TIE,
        /**
         * The brands blackberry icon.See <a href='https://fontawesome.com/v6/icons/blackberry?s=brands'>example</a>
         */
        BLACKBERRY,
        /**
         * The brands blogger icon.See <a href='https://fontawesome.com/v6/icons/blogger?s=brands'>example</a>
         */
        BLOGGER,
        /**
         * The brands blogger-b icon.See <a href='https://fontawesome.com/v6/icons/blogger-b?s=brands'>example</a>
         */
        BLOGGER_B,
        /**
         * The brands bluetooth icon.See <a href='https://fontawesome.com/v6/icons/bluetooth?s=brands'>example</a>
         */
        BLUETOOTH,
        /**
         * The brands bluetooth-b icon.See <a href='https://fontawesome.com/v6/icons/bluetooth-b?s=brands'>example</a>
         */
        BLUETOOTH_B,
        /**
         * The brands bootstrap icon.See <a href='https://fontawesome.com/v6/icons/bootstrap?s=brands'>example</a>
         */
        BOOTSTRAP,
        /**
         * The brands bots icon.See <a href='https://fontawesome.com/v6/icons/bots?s=brands'>example</a>
         */
        BOTS,
        /**
         * The brands btc icon.See <a href='https://fontawesome.com/v6/icons/btc?s=brands'>example</a>
         */
        BTC,
        /**
         * The brands buffer icon.See <a href='https://fontawesome.com/v6/icons/buffer?s=brands'>example</a>
         */
        BUFFER,
        /**
         * The brands buromobelexperte icon.See <a href='https://fontawesome.com/v6/icons/buromobelexperte?s=brands'>example</a>
         */
        BUROMOBELEXPERTE,
        /**
         * The brands buy-n-large icon.See <a href='https://fontawesome.com/v6/icons/buy-n-large?s=brands'>example</a>
         */
        BUY_N_LARGE,
        /**
         * The brands buysellads icon.See <a href='https://fontawesome.com/v6/icons/buysellads?s=brands'>example</a>
         */
        BUYSELLADS,
        /**
         * The brands canadian-maple-leaf icon.See <a href='https://fontawesome.com/v6/icons/canadian-maple-leaf?s=brands'>example</a>
         */
        CANADIAN_MAPLE_LEAF,
        /**
         * The brands cc-amazon-pay icon.See <a href='https://fontawesome.com/v6/icons/cc-amazon-pay?s=brands'>example</a>
         */
        CC_AMAZON_PAY,
        /**
         * The brands cc-amex icon.See <a href='https://fontawesome.com/v6/icons/cc-amex?s=brands'>example</a>
         */
        CC_AMEX,
        /**
         * The brands cc-apple-pay icon.See <a href='https://fontawesome.com/v6/icons/cc-apple-pay?s=brands'>example</a>
         */
        CC_APPLE_PAY,
        /**
         * The brands cc-diners-club icon.See <a href='https://fontawesome.com/v6/icons/cc-diners-club?s=brands'>example</a>
         */
        CC_DINERS_CLUB,
        /**
         * The brands cc-discover icon.See <a href='https://fontawesome.com/v6/icons/cc-discover?s=brands'>example</a>
         */
        CC_DISCOVER,
        /**
         * The brands cc-jcb icon.See <a href='https://fontawesome.com/v6/icons/cc-jcb?s=brands'>example</a>
         */
        CC_JCB,
        /**
         * The brands cc-mastercard icon.See <a href='https://fontawesome.com/v6/icons/cc-mastercard?s=brands'>example</a>
         */
        CC_MASTERCARD,
        /**
         * The brands cc-paypal icon.See <a href='https://fontawesome.com/v6/icons/cc-paypal?s=brands'>example</a>
         */
        CC_PAYPAL,
        /**
         * The brands cc-stripe icon.See <a href='https://fontawesome.com/v6/icons/cc-stripe?s=brands'>example</a>
         */
        CC_STRIPE,
        /**
         * The brands cc-visa icon.See <a href='https://fontawesome.com/v6/icons/cc-visa?s=brands'>example</a>
         */
        CC_VISA,
        /**
         * The brands centercode icon.See <a href='https://fontawesome.com/v6/icons/centercode?s=brands'>example</a>
         */
        CENTERCODE,
        /**
         * The brands centos icon.See <a href='https://fontawesome.com/v6/icons/centos?s=brands'>example</a>
         */
        CENTOS,
        /**
         * The brands chrome icon.See <a href='https://fontawesome.com/v6/icons/chrome?s=brands'>example</a>
         */
        CHROME,
        /**
         * The brands chromecast icon.See <a href='https://fontawesome.com/v6/icons/chromecast?s=brands'>example</a>
         */
        CHROMECAST,
        /**
         * The brands cloudflare icon.See <a href='https://fontawesome.com/v6/icons/cloudflare?s=brands'>example</a>
         */
        CLOUDFLARE,
        /**
         * The brands cloudscale icon.See <a href='https://fontawesome.com/v6/icons/cloudscale?s=brands'>example</a>
         */
        CLOUDSCALE,
        /**
         * The brands cloudsmith icon.See <a href='https://fontawesome.com/v6/icons/cloudsmith?s=brands'>example</a>
         */
        CLOUDSMITH,
        /**
         * The brands cloudversify icon.See <a href='https://fontawesome.com/v6/icons/cloudversify?s=brands'>example</a>
         */
        CLOUDVERSIFY,
        /**
         * The brands cmplid icon.See <a href='https://fontawesome.com/v6/icons/cmplid?s=brands'>example</a>
         */
        CMPLID,
        /**
         * The brands codepen icon.See <a href='https://fontawesome.com/v6/icons/codepen?s=brands'>example</a>
         */
        CODEPEN,
        /**
         * The brands codiepie icon.See <a href='https://fontawesome.com/v6/icons/codiepie?s=brands'>example</a>
         */
        CODIEPIE,
        /**
         * The brands confluence icon.See <a href='https://fontawesome.com/v6/icons/confluence?s=brands'>example</a>
         */
        CONFLUENCE,
        /**
         * The brands connectdevelop icon.See <a href='https://fontawesome.com/v6/icons/connectdevelop?s=brands'>example</a>
         */
        CONNECTDEVELOP,
        /**
         * The brands contao icon.See <a href='https://fontawesome.com/v6/icons/contao?s=brands'>example</a>
         */
        CONTAO,
        /**
         * The brands cotton-bureau icon.See <a href='https://fontawesome.com/v6/icons/cotton-bureau?s=brands'>example</a>
         */
        COTTON_BUREAU,
        /**
         * The brands cpanel icon.See <a href='https://fontawesome.com/v6/icons/cpanel?s=brands'>example</a>
         */
        CPANEL,
        /**
         * The brands creative-commons icon.See <a href='https://fontawesome.com/v6/icons/creative-commons?s=brands'>example</a>
         */
        CREATIVE_COMMONS,
        /**
         * The brands creative-commons-by icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-by?s=brands'>example</a>
         */
        CREATIVE_COMMONS_BY,
        /**
         * The brands creative-commons-nc icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-nc?s=brands'>example</a>
         */
        CREATIVE_COMMONS_NC,
        /**
         * The brands creative-commons-nc-eu icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-nc-eu?s=brands'>example</a>
         */
        CREATIVE_COMMONS_NC_EU,
        /**
         * The brands creative-commons-nc-jp icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-nc-jp?s=brands'>example</a>
         */
        CREATIVE_COMMONS_NC_JP,
        /**
         * The brands creative-commons-nd icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-nd?s=brands'>example</a>
         */
        CREATIVE_COMMONS_ND,
        /**
         * The brands creative-commons-pd icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-pd?s=brands'>example</a>
         */
        CREATIVE_COMMONS_PD,
        /**
         * The brands creative-commons-pd-alt icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-pd-alt?s=brands'>example</a>
         */
        CREATIVE_COMMONS_PD_ALT,
        /**
         * The brands creative-commons-remix icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-remix?s=brands'>example</a>
         */
        CREATIVE_COMMONS_REMIX,
        /**
         * The brands creative-commons-sa icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-sa?s=brands'>example</a>
         */
        CREATIVE_COMMONS_SA,
        /**
         * The brands creative-commons-sampling icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-sampling?s=brands'>example</a>
         */
        CREATIVE_COMMONS_SAMPLING,
        /**
         * The brands creative-commons-sampling-plus icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-sampling-plus?s=brands'>example</a>
         */
        CREATIVE_COMMONS_SAMPLING_PLUS,
        /**
         * The brands creative-commons-share icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-share?s=brands'>example</a>
         */
        CREATIVE_COMMONS_SHARE,
        /**
         * The brands creative-commons-zero icon.See <a href='https://fontawesome.com/v6/icons/creative-commons-zero?s=brands'>example</a>
         */
        CREATIVE_COMMONS_ZERO,
        /**
         * The brands critical-role icon.See <a href='https://fontawesome.com/v6/icons/critical-role?s=brands'>example</a>
         */
        CRITICAL_ROLE,
        /**
         * The brands css3 icon.See <a href='https://fontawesome.com/v6/icons/css3?s=brands'>example</a>
         */
        CSS3,
        /**
         * The brands css3-alt icon.See <a href='https://fontawesome.com/v6/icons/css3-alt?s=brands'>example</a>
         */
        CSS3_ALT,
        /**
         * The brands cuttlefish icon.See <a href='https://fontawesome.com/v6/icons/cuttlefish?s=brands'>example</a>
         */
        CUTTLEFISH,
        /**
         * The brands d-and-d icon.See <a href='https://fontawesome.com/v6/icons/d-and-d?s=brands'>example</a>
         */
        D_AND_D,
        /**
         * The brands d-and-d-beyond icon.See <a href='https://fontawesome.com/v6/icons/d-and-d-beyond?s=brands'>example</a>
         */
        D_AND_D_BEYOND,
        /**
         * The brands dailymotion icon.See <a href='https://fontawesome.com/v6/icons/dailymotion?s=brands'>example</a>
         */
        DAILYMOTION,
        /**
         * The brands dashcube icon.See <a href='https://fontawesome.com/v6/icons/dashcube?s=brands'>example</a>
         */
        DASHCUBE,
        /**
         * The brands deezer icon.See <a href='https://fontawesome.com/v6/icons/deezer?s=brands'>example</a>
         */
        DEEZER,
        /**
         * The brands delicious icon.See <a href='https://fontawesome.com/v6/icons/delicious?s=brands'>example</a>
         */
        DELICIOUS,
        /**
         * The brands deploydog icon.See <a href='https://fontawesome.com/v6/icons/deploydog?s=brands'>example</a>
         */
        DEPLOYDOG,
        /**
         * The brands deskpro icon.See <a href='https://fontawesome.com/v6/icons/deskpro?s=brands'>example</a>
         */
        DESKPRO,
        /**
         * The brands dev icon.See <a href='https://fontawesome.com/v6/icons/dev?s=brands'>example</a>
         */
        DEV,
        /**
         * The brands deviantart icon.See <a href='https://fontawesome.com/v6/icons/deviantart?s=brands'>example</a>
         */
        DEVIANTART,
        /**
         * The brands dhl icon.See <a href='https://fontawesome.com/v6/icons/dhl?s=brands'>example</a>
         */
        DHL,
        /**
         * The brands diaspora icon.See <a href='https://fontawesome.com/v6/icons/diaspora?s=brands'>example</a>
         */
        DIASPORA,
        /**
         * The brands digg icon.See <a href='https://fontawesome.com/v6/icons/digg?s=brands'>example</a>
         */
        DIGG,
        /**
         * The brands digital-ocean icon.See <a href='https://fontawesome.com/v6/icons/digital-ocean?s=brands'>example</a>
         */
        DIGITAL_OCEAN,
        /**
         * The brands discord icon.See <a href='https://fontawesome.com/v6/icons/discord?s=brands'>example</a>
         */
        DISCORD,
        /**
         * The brands discourse icon.See <a href='https://fontawesome.com/v6/icons/discourse?s=brands'>example</a>
         */
        DISCOURSE,
        /**
         * The brands dochub icon.See <a href='https://fontawesome.com/v6/icons/dochub?s=brands'>example</a>
         */
        DOCHUB,
        /**
         * The brands docker icon.See <a href='https://fontawesome.com/v6/icons/docker?s=brands'>example</a>
         */
        DOCKER,
        /**
         * The brands draft2digital icon.See <a href='https://fontawesome.com/v6/icons/draft2digital?s=brands'>example</a>
         */
        DRAFT2DIGITAL,
        /**
         * The brands dribbble icon.See <a href='https://fontawesome.com/v6/icons/dribbble?s=brands'>example</a>
         */
        DRIBBBLE,
        /**
         * The brands dribbble-square icon.See <a href='https://fontawesome.com/v6/icons/dribbble-square?s=brands'>example</a>
         */
        DRIBBBLE_SQUARE,
        /**
         * The brands dropbox icon.See <a href='https://fontawesome.com/v6/icons/dropbox?s=brands'>example</a>
         */
        DROPBOX,
        /**
         * The brands drupal icon.See <a href='https://fontawesome.com/v6/icons/drupal?s=brands'>example</a>
         */
        DRUPAL,
        /**
         * The brands dyalog icon.See <a href='https://fontawesome.com/v6/icons/dyalog?s=brands'>example</a>
         */
        DYALOG,
        /**
         * The brands earlybirds icon.See <a href='https://fontawesome.com/v6/icons/earlybirds?s=brands'>example</a>
         */
        EARLYBIRDS,
        /**
         * The brands ebay icon.See <a href='https://fontawesome.com/v6/icons/ebay?s=brands'>example</a>
         */
        EBAY,
        /**
         * The brands edge icon.See <a href='https://fontawesome.com/v6/icons/edge?s=brands'>example</a>
         */
        EDGE,
        /**
         * The brands edge-legacy icon.See <a href='https://fontawesome.com/v6/icons/edge-legacy?s=brands'>example</a>
         */
        EDGE_LEGACY,
        /**
         * The brands elementor icon.See <a href='https://fontawesome.com/v6/icons/elementor?s=brands'>example</a>
         */
        ELEMENTOR,
        /**
         * The brands ello icon.See <a href='https://fontawesome.com/v6/icons/ello?s=brands'>example</a>
         */
        ELLO,
        /**
         * The brands ember icon.See <a href='https://fontawesome.com/v6/icons/ember?s=brands'>example</a>
         */
        EMBER,
        /**
         * The brands empire icon.See <a href='https://fontawesome.com/v6/icons/empire?s=brands'>example</a>
         */
        EMPIRE,
        /**
         * The brands envira icon.See <a href='https://fontawesome.com/v6/icons/envira?s=brands'>example</a>
         */
        ENVIRA,
        /**
         * The brands erlang icon.See <a href='https://fontawesome.com/v6/icons/erlang?s=brands'>example</a>
         */
        ERLANG,
        /**
         * The brands ethereum icon.See <a href='https://fontawesome.com/v6/icons/ethereum?s=brands'>example</a>
         */
        ETHEREUM,
        /**
         * The brands etsy icon.See <a href='https://fontawesome.com/v6/icons/etsy?s=brands'>example</a>
         */
        ETSY,
        /**
         * The brands evernote icon.See <a href='https://fontawesome.com/v6/icons/evernote?s=brands'>example</a>
         */
        EVERNOTE,
        /**
         * The brands expeditedssl icon.See <a href='https://fontawesome.com/v6/icons/expeditedssl?s=brands'>example</a>
         */
        EXPEDITEDSSL,
        /**
         * The brands facebook icon.See <a href='https://fontawesome.com/v6/icons/facebook?s=brands'>example</a>
         */
        FACEBOOK,
        /**
         * The brands facebook-f icon.See <a href='https://fontawesome.com/v6/icons/facebook-f?s=brands'>example</a>
         */
        FACEBOOK_F,
        /**
         * The brands facebook-messenger icon.See <a href='https://fontawesome.com/v6/icons/facebook-messenger?s=brands'>example</a>
         */
        FACEBOOK_MESSENGER,
        /**
         * The brands facebook-square icon.See <a href='https://fontawesome.com/v6/icons/facebook-square?s=brands'>example</a>
         */
        FACEBOOK_SQUARE,
        /**
         * The brands fantasy-flight-games icon.See <a href='https://fontawesome.com/v6/icons/fantasy-flight-games?s=brands'>example</a>
         */
        FANTASY_FLIGHT_GAMES,
        /**
         * The brands fedex icon.See <a href='https://fontawesome.com/v6/icons/fedex?s=brands'>example</a>
         */
        FEDEX,
        /**
         * The brands fedora icon.See <a href='https://fontawesome.com/v6/icons/fedora?s=brands'>example</a>
         */
        FEDORA,
        /**
         * The brands figma icon.See <a href='https://fontawesome.com/v6/icons/figma?s=brands'>example</a>
         */
        FIGMA,
        /**
         * The brands firefox icon.See <a href='https://fontawesome.com/v6/icons/firefox?s=brands'>example</a>
         */
        FIREFOX,
        /**
         * The brands firefox-browser icon.See <a href='https://fontawesome.com/v6/icons/firefox-browser?s=brands'>example</a>
         */
        FIREFOX_BROWSER,
        /**
         * The brands first-order icon.See <a href='https://fontawesome.com/v6/icons/first-order?s=brands'>example</a>
         */
        FIRST_ORDER,
        /**
         * The brands first-order-alt icon.See <a href='https://fontawesome.com/v6/icons/first-order-alt?s=brands'>example</a>
         */
        FIRST_ORDER_ALT,
        /**
         * The brands firstdraft icon.See <a href='https://fontawesome.com/v6/icons/firstdraft?s=brands'>example</a>
         */
        FIRSTDRAFT,
        /**
         * The brands flickr icon.See <a href='https://fontawesome.com/v6/icons/flickr?s=brands'>example</a>
         */
        FLICKR,
        /**
         * The brands flipboard icon.See <a href='https://fontawesome.com/v6/icons/flipboard?s=brands'>example</a>
         */
        FLIPBOARD,
        /**
         * The brands fly icon.See <a href='https://fontawesome.com/v6/icons/fly?s=brands'>example</a>
         */
        FLY,
        /**
         * The brands font-awesome icon.See <a href='https://fontawesome.com/v6/icons/font-awesome?s=brands'>example</a>
         */
        FONT_AWESOME,
        /**
         * The brands font-awesome-alt icon.See <a href='https://fontawesome.com/v6/icons/font-awesome-alt?s=brands'>example</a>
         */
        FONT_AWESOME_ALT,
        /**
         * The brands font-awesome-flag icon.See <a href='https://fontawesome.com/v6/icons/font-awesome-flag?s=brands'>example</a>
         */
        FONT_AWESOME_FLAG,
        /**
         * The brands font-awesome-logo-full icon.See <a href='https://fontawesome.com/v6/icons/font-awesome-logo-full?s=brands'>example</a>
         */
        FONT_AWESOME_LOGO_FULL,
        /**
         * The brands fonticons icon.See <a href='https://fontawesome.com/v6/icons/fonticons?s=brands'>example</a>
         */
        FONTICONS,
        /**
         * The brands fonticons-fi icon.See <a href='https://fontawesome.com/v6/icons/fonticons-fi?s=brands'>example</a>
         */
        FONTICONS_FI,
        /**
         * The brands fort-awesome icon.See <a href='https://fontawesome.com/v6/icons/fort-awesome?s=brands'>example</a>
         */
        FORT_AWESOME,
        /**
         * The brands fort-awesome-alt icon.See <a href='https://fontawesome.com/v6/icons/fort-awesome-alt?s=brands'>example</a>
         */
        FORT_AWESOME_ALT,
        /**
         * The brands forumbee icon.See <a href='https://fontawesome.com/v6/icons/forumbee?s=brands'>example</a>
         */
        FORUMBEE,
        /**
         * The brands foursquare icon.See <a href='https://fontawesome.com/v6/icons/foursquare?s=brands'>example</a>
         */
        FOURSQUARE,
        /**
         * The brands free-code-camp icon.See <a href='https://fontawesome.com/v6/icons/free-code-camp?s=brands'>example</a>
         */
        FREE_CODE_CAMP,
        /**
         * The brands freebsd icon.See <a href='https://fontawesome.com/v6/icons/freebsd?s=brands'>example</a>
         */
        FREEBSD,
        /**
         * The brands fulcrum icon.See <a href='https://fontawesome.com/v6/icons/fulcrum?s=brands'>example</a>
         */
        FULCRUM,
        /**
         * The brands galactic-republic icon.See <a href='https://fontawesome.com/v6/icons/galactic-republic?s=brands'>example</a>
         */
        GALACTIC_REPUBLIC,
        /**
         * The brands galactic-senate icon.See <a href='https://fontawesome.com/v6/icons/galactic-senate?s=brands'>example</a>
         */
        GALACTIC_SENATE,
        /**
         * The brands get-pocket icon.See <a href='https://fontawesome.com/v6/icons/get-pocket?s=brands'>example</a>
         */
        GET_POCKET,
        /**
         * The brands gg icon.See <a href='https://fontawesome.com/v6/icons/gg?s=brands'>example</a>
         */
        GG,
        /**
         * The brands gg-circle icon.See <a href='https://fontawesome.com/v6/icons/gg-circle?s=brands'>example</a>
         */
        GG_CIRCLE,
        /**
         * The brands git icon.See <a href='https://fontawesome.com/v6/icons/git?s=brands'>example</a>
         */
        GIT,
        /**
         * The brands git-alt icon.See <a href='https://fontawesome.com/v6/icons/git-alt?s=brands'>example</a>
         */
        GIT_ALT,
        /**
         * The brands git-square icon.See <a href='https://fontawesome.com/v6/icons/git-square?s=brands'>example</a>
         */
        GIT_SQUARE,
        /**
         * The brands github icon.See <a href='https://fontawesome.com/v6/icons/github?s=brands'>example</a>
         */
        GITHUB,
        /**
         * The brands github-alt icon.See <a href='https://fontawesome.com/v6/icons/github-alt?s=brands'>example</a>
         */
        GITHUB_ALT,
        /**
         * The brands github-square icon.See <a href='https://fontawesome.com/v6/icons/github-square?s=brands'>example</a>
         */
        GITHUB_SQUARE,
        /**
         * The brands gitkraken icon.See <a href='https://fontawesome.com/v6/icons/gitkraken?s=brands'>example</a>
         */
        GITKRAKEN,
        /**
         * The brands gitlab icon.See <a href='https://fontawesome.com/v6/icons/gitlab?s=brands'>example</a>
         */
        GITLAB,
        /**
         * The brands gitlab-square icon.See <a href='https://fontawesome.com/v6/icons/gitlab-square?s=brands'>example</a>
         */
        GITLAB_SQUARE,
        /**
         * The brands gitter icon.See <a href='https://fontawesome.com/v6/icons/gitter?s=brands'>example</a>
         */
        GITTER,
        /**
         * The brands glide icon.See <a href='https://fontawesome.com/v6/icons/glide?s=brands'>example</a>
         */
        GLIDE,
        /**
         * The brands glide-g icon.See <a href='https://fontawesome.com/v6/icons/glide-g?s=brands'>example</a>
         */
        GLIDE_G,
        /**
         * The brands gofore icon.See <a href='https://fontawesome.com/v6/icons/gofore?s=brands'>example</a>
         */
        GOFORE,
        /**
         * The brands golang icon.See <a href='https://fontawesome.com/v6/icons/golang?s=brands'>example</a>
         */
        GOLANG,
        /**
         * The brands goodreads icon.See <a href='https://fontawesome.com/v6/icons/goodreads?s=brands'>example</a>
         */
        GOODREADS,
        /**
         * The brands goodreads-g icon.See <a href='https://fontawesome.com/v6/icons/goodreads-g?s=brands'>example</a>
         */
        GOODREADS_G,
        /**
         * The brands google icon.See <a href='https://fontawesome.com/v6/icons/google?s=brands'>example</a>
         */
        GOOGLE,
        /**
         * The brands google-drive icon.See <a href='https://fontawesome.com/v6/icons/google-drive?s=brands'>example</a>
         */
        GOOGLE_DRIVE,
        /**
         * The brands google-pay icon.See <a href='https://fontawesome.com/v6/icons/google-pay?s=brands'>example</a>
         */
        GOOGLE_PAY,
        /**
         * The brands google-play icon.See <a href='https://fontawesome.com/v6/icons/google-play?s=brands'>example</a>
         */
        GOOGLE_PLAY,
        /**
         * The brands google-plus icon.See <a href='https://fontawesome.com/v6/icons/google-plus?s=brands'>example</a>
         */
        GOOGLE_PLUS,
        /**
         * The brands google-plus-g icon.See <a href='https://fontawesome.com/v6/icons/google-plus-g?s=brands'>example</a>
         */
        GOOGLE_PLUS_G,
        /**
         * The brands google-plus-square icon.See <a href='https://fontawesome.com/v6/icons/google-plus-square?s=brands'>example</a>
         */
        GOOGLE_PLUS_SQUARE,
        /**
         * The brands google-wallet icon.See <a href='https://fontawesome.com/v6/icons/google-wallet?s=brands'>example</a>
         */
        GOOGLE_WALLET,
        /**
         * The brands gratipay icon.See <a href='https://fontawesome.com/v6/icons/gratipay?s=brands'>example</a>
         */
        GRATIPAY,
        /**
         * The brands grav icon.See <a href='https://fontawesome.com/v6/icons/grav?s=brands'>example</a>
         */
        GRAV,
        /**
         * The brands gripfire icon.See <a href='https://fontawesome.com/v6/icons/gripfire?s=brands'>example</a>
         */
        GRIPFIRE,
        /**
         * The brands grunt icon.See <a href='https://fontawesome.com/v6/icons/grunt?s=brands'>example</a>
         */
        GRUNT,
        /**
         * The brands guilded icon.See <a href='https://fontawesome.com/v6/icons/guilded?s=brands'>example</a>
         */
        GUILDED,
        /**
         * The brands gulp icon.See <a href='https://fontawesome.com/v6/icons/gulp?s=brands'>example</a>
         */
        GULP,
        /**
         * The brands hacker-news icon.See <a href='https://fontawesome.com/v6/icons/hacker-news?s=brands'>example</a>
         */
        HACKER_NEWS,
        /**
         * The brands hacker-news-square icon.See <a href='https://fontawesome.com/v6/icons/hacker-news-square?s=brands'>example</a>
         */
        HACKER_NEWS_SQUARE,
        /**
         * The brands hackerrank icon.See <a href='https://fontawesome.com/v6/icons/hackerrank?s=brands'>example</a>
         */
        HACKERRANK,
        /**
         * The brands hashnode icon.See <a href='https://fontawesome.com/v6/icons/hashnode?s=brands'>example</a>
         */
        HASHNODE,
        /**
         * The brands hips icon.See <a href='https://fontawesome.com/v6/icons/hips?s=brands'>example</a>
         */
        HIPS,
        /**
         * The brands hire-a-helper icon.See <a href='https://fontawesome.com/v6/icons/hire-a-helper?s=brands'>example</a>
         */
        HIRE_A_HELPER,
        /**
         * The brands hive icon.See <a href='https://fontawesome.com/v6/icons/hive?s=brands'>example</a>
         */
        HIVE,
        /**
         * The brands hooli icon.See <a href='https://fontawesome.com/v6/icons/hooli?s=brands'>example</a>
         */
        HOOLI,
        /**
         * The brands hornbill icon.See <a href='https://fontawesome.com/v6/icons/hornbill?s=brands'>example</a>
         */
        HORNBILL,
        /**
         * The brands hotjar icon.See <a href='https://fontawesome.com/v6/icons/hotjar?s=brands'>example</a>
         */
        HOTJAR,
        /**
         * The brands houzz icon.See <a href='https://fontawesome.com/v6/icons/houzz?s=brands'>example</a>
         */
        HOUZZ,
        /**
         * The brands html5 icon.See <a href='https://fontawesome.com/v6/icons/html5?s=brands'>example</a>
         */
        HTML5,
        /**
         * The brands hubspot icon.See <a href='https://fontawesome.com/v6/icons/hubspot?s=brands'>example</a>
         */
        HUBSPOT,
        /**
         * The brands ideal icon.See <a href='https://fontawesome.com/v6/icons/ideal?s=brands'>example</a>
         */
        IDEAL,
        /**
         * The brands imdb icon.See <a href='https://fontawesome.com/v6/icons/imdb?s=brands'>example</a>
         */
        IMDB,
        /**
         * The brands innosoft icon.See <a href='https://fontawesome.com/v6/icons/innosoft?s=brands'>example</a>
         */
        INNOSOFT,
        /**
         * The brands instagram icon.See <a href='https://fontawesome.com/v6/icons/instagram?s=brands'>example</a>
         */
        INSTAGRAM,
        /**
         * The brands instagram-square icon.See <a href='https://fontawesome.com/v6/icons/instagram-square?s=brands'>example</a>
         */
        INSTAGRAM_SQUARE,
        /**
         * The brands instalod icon.See <a href='https://fontawesome.com/v6/icons/instalod?s=brands'>example</a>
         */
        INSTALOD,
        /**
         * The brands intercom icon.See <a href='https://fontawesome.com/v6/icons/intercom?s=brands'>example</a>
         */
        INTERCOM,
        /**
         * The brands internet-explorer icon.See <a href='https://fontawesome.com/v6/icons/internet-explorer?s=brands'>example</a>
         */
        INTERNET_EXPLORER,
        /**
         * The brands invision icon.See <a href='https://fontawesome.com/v6/icons/invision?s=brands'>example</a>
         */
        INVISION,
        /**
         * The brands ioxhost icon.See <a href='https://fontawesome.com/v6/icons/ioxhost?s=brands'>example</a>
         */
        IOXHOST,
        /**
         * The brands itch-io icon.See <a href='https://fontawesome.com/v6/icons/itch-io?s=brands'>example</a>
         */
        ITCH_IO,
        /**
         * The brands itunes icon.See <a href='https://fontawesome.com/v6/icons/itunes?s=brands'>example</a>
         */
        ITUNES,
        /**
         * The brands itunes-note icon.See <a href='https://fontawesome.com/v6/icons/itunes-note?s=brands'>example</a>
         */
        ITUNES_NOTE,
        /**
         * The brands java icon.See <a href='https://fontawesome.com/v6/icons/java?s=brands'>example</a>
         */
        JAVA,
        /**
         * The brands jedi-order icon.See <a href='https://fontawesome.com/v6/icons/jedi-order?s=brands'>example</a>
         */
        JEDI_ORDER,
        /**
         * The brands jenkins icon.See <a href='https://fontawesome.com/v6/icons/jenkins?s=brands'>example</a>
         */
        JENKINS,
        /**
         * The brands jira icon.See <a href='https://fontawesome.com/v6/icons/jira?s=brands'>example</a>
         */
        JIRA,
        /**
         * The brands joget icon.See <a href='https://fontawesome.com/v6/icons/joget?s=brands'>example</a>
         */
        JOGET,
        /**
         * The brands joomla icon.See <a href='https://fontawesome.com/v6/icons/joomla?s=brands'>example</a>
         */
        JOOMLA,
        /**
         * The brands js icon.See <a href='https://fontawesome.com/v6/icons/js?s=brands'>example</a>
         */
        JS,
        /**
         * The brands js-square icon.See <a href='https://fontawesome.com/v6/icons/js-square?s=brands'>example</a>
         */
        JS_SQUARE,
        /**
         * The brands jsfiddle icon.See <a href='https://fontawesome.com/v6/icons/jsfiddle?s=brands'>example</a>
         */
        JSFIDDLE,
        /**
         * The brands kaggle icon.See <a href='https://fontawesome.com/v6/icons/kaggle?s=brands'>example</a>
         */
        KAGGLE,
        /**
         * The brands keybase icon.See <a href='https://fontawesome.com/v6/icons/keybase?s=brands'>example</a>
         */
        KEYBASE,
        /**
         * The brands keycdn icon.See <a href='https://fontawesome.com/v6/icons/keycdn?s=brands'>example</a>
         */
        KEYCDN,
        /**
         * The brands kickstarter icon.See <a href='https://fontawesome.com/v6/icons/kickstarter?s=brands'>example</a>
         */
        KICKSTARTER,
        /**
         * The brands kickstarter-k icon.See <a href='https://fontawesome.com/v6/icons/kickstarter-k?s=brands'>example</a>
         */
        KICKSTARTER_K,
        /**
         * The brands korvue icon.See <a href='https://fontawesome.com/v6/icons/korvue?s=brands'>example</a>
         */
        KORVUE,
        /**
         * The brands laravel icon.See <a href='https://fontawesome.com/v6/icons/laravel?s=brands'>example</a>
         */
        LARAVEL,
        /**
         * The brands lastfm icon.See <a href='https://fontawesome.com/v6/icons/lastfm?s=brands'>example</a>
         */
        LASTFM,
        /**
         * The brands lastfm-square icon.See <a href='https://fontawesome.com/v6/icons/lastfm-square?s=brands'>example</a>
         */
        LASTFM_SQUARE,
        /**
         * The brands leanpub icon.See <a href='https://fontawesome.com/v6/icons/leanpub?s=brands'>example</a>
         */
        LEANPUB,
        /**
         * The brands less icon.See <a href='https://fontawesome.com/v6/icons/less?s=brands'>example</a>
         */
        LESS,
        /**
         * The brands line icon.See <a href='https://fontawesome.com/v6/icons/line?s=brands'>example</a>
         */
        LINE,
        /**
         * The brands linkedin icon.See <a href='https://fontawesome.com/v6/icons/linkedin?s=brands'>example</a>
         */
        LINKEDIN,
        /**
         * The brands linkedin-in icon.See <a href='https://fontawesome.com/v6/icons/linkedin-in?s=brands'>example</a>
         */
        LINKEDIN_IN,
        /**
         * The brands linode icon.See <a href='https://fontawesome.com/v6/icons/linode?s=brands'>example</a>
         */
        LINODE,
        /**
         * The brands linux icon.See <a href='https://fontawesome.com/v6/icons/linux?s=brands'>example</a>
         */
        LINUX,
        /**
         * The brands lyft icon.See <a href='https://fontawesome.com/v6/icons/lyft?s=brands'>example</a>
         */
        LYFT,
        /**
         * The brands magento icon.See <a href='https://fontawesome.com/v6/icons/magento?s=brands'>example</a>
         */
        MAGENTO,
        /**
         * The brands mailchimp icon.See <a href='https://fontawesome.com/v6/icons/mailchimp?s=brands'>example</a>
         */
        MAILCHIMP,
        /**
         * The brands mandalorian icon.See <a href='https://fontawesome.com/v6/icons/mandalorian?s=brands'>example</a>
         */
        MANDALORIAN,
        /**
         * The brands markdown icon.See <a href='https://fontawesome.com/v6/icons/markdown?s=brands'>example</a>
         */
        MARKDOWN,
        /**
         * The brands mastodon icon.See <a href='https://fontawesome.com/v6/icons/mastodon?s=brands'>example</a>
         */
        MASTODON,
        /**
         * The brands maxcdn icon.See <a href='https://fontawesome.com/v6/icons/maxcdn?s=brands'>example</a>
         */
        MAXCDN,
        /**
         * The brands mdb icon.See <a href='https://fontawesome.com/v6/icons/mdb?s=brands'>example</a>
         */
        MDB,
        /**
         * The brands medapps icon.See <a href='https://fontawesome.com/v6/icons/medapps?s=brands'>example</a>
         */
        MEDAPPS,
        /**
         * The brands medium icon.See <a href='https://fontawesome.com/v6/icons/medium?s=brands'>example</a>
         */
        MEDIUM,
        /**
         * The brands medium-m icon.See <a href='https://fontawesome.com/v6/icons/medium-m?s=brands'>example</a>
         */
        MEDIUM_M,
        /**
         * The brands medrt icon.See <a href='https://fontawesome.com/v6/icons/medrt?s=brands'>example</a>
         */
        MEDRT,
        /**
         * The brands meetup icon.See <a href='https://fontawesome.com/v6/icons/meetup?s=brands'>example</a>
         */
        MEETUP,
        /**
         * The brands megaport icon.See <a href='https://fontawesome.com/v6/icons/megaport?s=brands'>example</a>
         */
        MEGAPORT,
        /**
         * The brands mendeley icon.See <a href='https://fontawesome.com/v6/icons/mendeley?s=brands'>example</a>
         */
        MENDELEY,
        /**
         * The brands meta icon.See <a href='https://fontawesome.com/v6/icons/meta?s=brands'>example</a>
         */
        META,
        /**
         * The brands microblog icon.See <a href='https://fontawesome.com/v6/icons/microblog?s=brands'>example</a>
         */
        MICROBLOG,
        /**
         * The brands microsoft icon.See <a href='https://fontawesome.com/v6/icons/microsoft?s=brands'>example</a>
         */
        MICROSOFT,
        /**
         * The brands mix icon.See <a href='https://fontawesome.com/v6/icons/mix?s=brands'>example</a>
         */
        MIX,
        /**
         * The brands mixcloud icon.See <a href='https://fontawesome.com/v6/icons/mixcloud?s=brands'>example</a>
         */
        MIXCLOUD,
        /**
         * The brands mixer icon.See <a href='https://fontawesome.com/v6/icons/mixer?s=brands'>example</a>
         */
        MIXER,
        /**
         * The brands mizuni icon.See <a href='https://fontawesome.com/v6/icons/mizuni?s=brands'>example</a>
         */
        MIZUNI,
        /**
         * The brands modx icon.See <a href='https://fontawesome.com/v6/icons/modx?s=brands'>example</a>
         */
        MODX,
        /**
         * The brands monero icon.See <a href='https://fontawesome.com/v6/icons/monero?s=brands'>example</a>
         */
        MONERO,
        /**
         * The brands napster icon.See <a href='https://fontawesome.com/v6/icons/napster?s=brands'>example</a>
         */
        NAPSTER,
        /**
         * The brands neos icon.See <a href='https://fontawesome.com/v6/icons/neos?s=brands'>example</a>
         */
        NEOS,
        /**
         * The brands nfc-directional icon.See <a href='https://fontawesome.com/v6/icons/nfc-directional?s=brands'>example</a>
         */
        NFC_DIRECTIONAL,
        /**
         * The brands nfc-symbol icon.See <a href='https://fontawesome.com/v6/icons/nfc-symbol?s=brands'>example</a>
         */
        NFC_SYMBOL,
        /**
         * The brands nimblr icon.See <a href='https://fontawesome.com/v6/icons/nimblr?s=brands'>example</a>
         */
        NIMBLR,
        /**
         * The brands node icon.See <a href='https://fontawesome.com/v6/icons/node?s=brands'>example</a>
         */
        NODE,
        /**
         * The brands node-js icon.See <a href='https://fontawesome.com/v6/icons/node-js?s=brands'>example</a>
         */
        NODE_JS,
        /**
         * The brands npm icon.See <a href='https://fontawesome.com/v6/icons/npm?s=brands'>example</a>
         */
        NPM,
        /**
         * The brands ns8 icon.See <a href='https://fontawesome.com/v6/icons/ns8?s=brands'>example</a>
         */
        NS8,
        /**
         * The brands nutritionix icon.See <a href='https://fontawesome.com/v6/icons/nutritionix?s=brands'>example</a>
         */
        NUTRITIONIX,
        /**
         * The brands octopus-deploy icon.See <a href='https://fontawesome.com/v6/icons/octopus-deploy?s=brands'>example</a>
         */
        OCTOPUS_DEPLOY,
        /**
         * The brands odnoklassniki icon.See <a href='https://fontawesome.com/v6/icons/odnoklassniki?s=brands'>example</a>
         */
        ODNOKLASSNIKI,
        /**
         * The brands odnoklassniki-square icon.See <a href='https://fontawesome.com/v6/icons/odnoklassniki-square?s=brands'>example</a>
         */
        ODNOKLASSNIKI_SQUARE,
        /**
         * The brands old-republic icon.See <a href='https://fontawesome.com/v6/icons/old-republic?s=brands'>example</a>
         */
        OLD_REPUBLIC,
        /**
         * The brands opencart icon.See <a href='https://fontawesome.com/v6/icons/opencart?s=brands'>example</a>
         */
        OPENCART,
        /**
         * The brands openid icon.See <a href='https://fontawesome.com/v6/icons/openid?s=brands'>example</a>
         */
        OPENID,
        /**
         * The brands opera icon.See <a href='https://fontawesome.com/v6/icons/opera?s=brands'>example</a>
         */
        OPERA,
        /**
         * The brands optin-monster icon.See <a href='https://fontawesome.com/v6/icons/optin-monster?s=brands'>example</a>
         */
        OPTIN_MONSTER,
        /**
         * The brands orcid icon.See <a href='https://fontawesome.com/v6/icons/orcid?s=brands'>example</a>
         */
        ORCID,
        /**
         * The brands osi icon.See <a href='https://fontawesome.com/v6/icons/osi?s=brands'>example</a>
         */
        OSI,
        /**
         * The brands padlet icon.See <a href='https://fontawesome.com/v6/icons/padlet?s=brands'>example</a>
         */
        PADLET,
        /**
         * The brands page4 icon.See <a href='https://fontawesome.com/v6/icons/page4?s=brands'>example</a>
         */
        PAGE4,
        /**
         * The brands pagelines icon.See <a href='https://fontawesome.com/v6/icons/pagelines?s=brands'>example</a>
         */
        PAGELINES,
        /**
         * The brands palfed icon.See <a href='https://fontawesome.com/v6/icons/palfed?s=brands'>example</a>
         */
        PALFED,
        /**
         * The brands patreon icon.See <a href='https://fontawesome.com/v6/icons/patreon?s=brands'>example</a>
         */
        PATREON,
        /**
         * The brands paypal icon.See <a href='https://fontawesome.com/v6/icons/paypal?s=brands'>example</a>
         */
        PAYPAL,
        /**
         * The brands perbyte icon.See <a href='https://fontawesome.com/v6/icons/perbyte?s=brands'>example</a>
         */
        PERBYTE,
        /**
         * The brands periscope icon.See <a href='https://fontawesome.com/v6/icons/periscope?s=brands'>example</a>
         */
        PERISCOPE,
        /**
         * The brands phabricator icon.See <a href='https://fontawesome.com/v6/icons/phabricator?s=brands'>example</a>
         */
        PHABRICATOR,
        /**
         * The brands phoenix-framework icon.See <a href='https://fontawesome.com/v6/icons/phoenix-framework?s=brands'>example</a>
         */
        PHOENIX_FRAMEWORK,
        /**
         * The brands phoenix-squadron icon.See <a href='https://fontawesome.com/v6/icons/phoenix-squadron?s=brands'>example</a>
         */
        PHOENIX_SQUADRON,
        /**
         * The brands php icon.See <a href='https://fontawesome.com/v6/icons/php?s=brands'>example</a>
         */
        PHP,
        /**
         * The brands pied-piper icon.See <a href='https://fontawesome.com/v6/icons/pied-piper?s=brands'>example</a>
         */
        PIED_PIPER,
        /**
         * The brands pied-piper-alt icon.See <a href='https://fontawesome.com/v6/icons/pied-piper-alt?s=brands'>example</a>
         */
        PIED_PIPER_ALT,
        /**
         * The brands pied-piper-hat icon.See <a href='https://fontawesome.com/v6/icons/pied-piper-hat?s=brands'>example</a>
         */
        PIED_PIPER_HAT,
        /**
         * The brands pied-piper-pp icon.See <a href='https://fontawesome.com/v6/icons/pied-piper-pp?s=brands'>example</a>
         */
        PIED_PIPER_PP,
        /**
         * The brands pied-piper-square icon.See <a href='https://fontawesome.com/v6/icons/pied-piper-square?s=brands'>example</a>
         */
        PIED_PIPER_SQUARE,
        /**
         * The brands pinterest icon.See <a href='https://fontawesome.com/v6/icons/pinterest?s=brands'>example</a>
         */
        PINTEREST,
        /**
         * The brands pinterest-p icon.See <a href='https://fontawesome.com/v6/icons/pinterest-p?s=brands'>example</a>
         */
        PINTEREST_P,
        /**
         * The brands pinterest-square icon.See <a href='https://fontawesome.com/v6/icons/pinterest-square?s=brands'>example</a>
         */
        PINTEREST_SQUARE,
        /**
         * The brands pix icon.See <a href='https://fontawesome.com/v6/icons/pix?s=brands'>example</a>
         */
        PIX,
        /**
         * The brands playstation icon.See <a href='https://fontawesome.com/v6/icons/playstation?s=brands'>example</a>
         */
        PLAYSTATION,
        /**
         * The brands product-hunt icon.See <a href='https://fontawesome.com/v6/icons/product-hunt?s=brands'>example</a>
         */
        PRODUCT_HUNT,
        /**
         * The brands pushed icon.See <a href='https://fontawesome.com/v6/icons/pushed?s=brands'>example</a>
         */
        PUSHED,
        /**
         * The brands python icon.See <a href='https://fontawesome.com/v6/icons/python?s=brands'>example</a>
         */
        PYTHON,
        /**
         * The brands qq icon.See <a href='https://fontawesome.com/v6/icons/qq?s=brands'>example</a>
         */
        QQ,
        /**
         * The brands quinscape icon.See <a href='https://fontawesome.com/v6/icons/quinscape?s=brands'>example</a>
         */
        QUINSCAPE,
        /**
         * The brands quora icon.See <a href='https://fontawesome.com/v6/icons/quora?s=brands'>example</a>
         */
        QUORA,
        /**
         * The brands r-project icon.See <a href='https://fontawesome.com/v6/icons/r-project?s=brands'>example</a>
         */
        R_PROJECT,
        /**
         * The brands raspberry-pi icon.See <a href='https://fontawesome.com/v6/icons/raspberry-pi?s=brands'>example</a>
         */
        RASPBERRY_PI,
        /**
         * The brands ravelry icon.See <a href='https://fontawesome.com/v6/icons/ravelry?s=brands'>example</a>
         */
        RAVELRY,
        /**
         * The brands react icon.See <a href='https://fontawesome.com/v6/icons/react?s=brands'>example</a>
         */
        REACT,
        /**
         * The brands reacteurope icon.See <a href='https://fontawesome.com/v6/icons/reacteurope?s=brands'>example</a>
         */
        REACTEUROPE,
        /**
         * The brands readme icon.See <a href='https://fontawesome.com/v6/icons/readme?s=brands'>example</a>
         */
        README,
        /**
         * The brands rebel icon.See <a href='https://fontawesome.com/v6/icons/rebel?s=brands'>example</a>
         */
        REBEL,
        /**
         * The brands red-river icon.See <a href='https://fontawesome.com/v6/icons/red-river?s=brands'>example</a>
         */
        RED_RIVER,
        /**
         * The brands reddit icon.See <a href='https://fontawesome.com/v6/icons/reddit?s=brands'>example</a>
         */
        REDDIT,
        /**
         * The brands reddit-alien icon.See <a href='https://fontawesome.com/v6/icons/reddit-alien?s=brands'>example</a>
         */
        REDDIT_ALIEN,
        /**
         * The brands reddit-square icon.See <a href='https://fontawesome.com/v6/icons/reddit-square?s=brands'>example</a>
         */
        REDDIT_SQUARE,
        /**
         * The brands redhat icon.See <a href='https://fontawesome.com/v6/icons/redhat?s=brands'>example</a>
         */
        REDHAT,
        /**
         * The brands rendact icon.See <a href='https://fontawesome.com/v6/icons/rendact?s=brands'>example</a>
         */
        RENDACT,
        /**
         * The brands renren icon.See <a href='https://fontawesome.com/v6/icons/renren?s=brands'>example</a>
         */
        RENREN,
        /**
         * The brands replyd icon.See <a href='https://fontawesome.com/v6/icons/replyd?s=brands'>example</a>
         */
        REPLYD,
        /**
         * The brands researchgate icon.See <a href='https://fontawesome.com/v6/icons/researchgate?s=brands'>example</a>
         */
        RESEARCHGATE,
        /**
         * The brands resolving icon.See <a href='https://fontawesome.com/v6/icons/resolving?s=brands'>example</a>
         */
        RESOLVING,
        /**
         * The brands rev icon.See <a href='https://fontawesome.com/v6/icons/rev?s=brands'>example</a>
         */
        REV,
        /**
         * The brands rocketchat icon.See <a href='https://fontawesome.com/v6/icons/rocketchat?s=brands'>example</a>
         */
        ROCKETCHAT,
        /**
         * The brands rockrms icon.See <a href='https://fontawesome.com/v6/icons/rockrms?s=brands'>example</a>
         */
        ROCKRMS,
        /**
         * The brands rust icon.See <a href='https://fontawesome.com/v6/icons/rust?s=brands'>example</a>
         */
        RUST,
        /**
         * The brands safari icon.See <a href='https://fontawesome.com/v6/icons/safari?s=brands'>example</a>
         */
        SAFARI,
        /**
         * The brands salesforce icon.See <a href='https://fontawesome.com/v6/icons/salesforce?s=brands'>example</a>
         */
        SALESFORCE,
        /**
         * The brands sass icon.See <a href='https://fontawesome.com/v6/icons/sass?s=brands'>example</a>
         */
        SASS,
        /**
         * The brands schlix icon.See <a href='https://fontawesome.com/v6/icons/schlix?s=brands'>example</a>
         */
        SCHLIX,
        /**
         * The brands screenpal icon.See <a href='https://fontawesome.com/v6/icons/screenpal?s=brands'>example</a>
         */
        SCREENPAL,
        /**
         * The brands scribd icon.See <a href='https://fontawesome.com/v6/icons/scribd?s=brands'>example</a>
         */
        SCRIBD,
        /**
         * The brands searchengin icon.See <a href='https://fontawesome.com/v6/icons/searchengin?s=brands'>example</a>
         */
        SEARCHENGIN,
        /**
         * The brands sellcast icon.See <a href='https://fontawesome.com/v6/icons/sellcast?s=brands'>example</a>
         */
        SELLCAST,
        /**
         * The brands sellsy icon.See <a href='https://fontawesome.com/v6/icons/sellsy?s=brands'>example</a>
         */
        SELLSY,
        /**
         * The brands servicestack icon.See <a href='https://fontawesome.com/v6/icons/servicestack?s=brands'>example</a>
         */
        SERVICESTACK,
        /**
         * The brands shirtsinbulk icon.See <a href='https://fontawesome.com/v6/icons/shirtsinbulk?s=brands'>example</a>
         */
        SHIRTSINBULK,
        /**
         * The brands shopify icon.See <a href='https://fontawesome.com/v6/icons/shopify?s=brands'>example</a>
         */
        SHOPIFY,
        /**
         * The brands shopware icon.See <a href='https://fontawesome.com/v6/icons/shopware?s=brands'>example</a>
         */
        SHOPWARE,
        /**
         * The brands simplybuilt icon.See <a href='https://fontawesome.com/v6/icons/simplybuilt?s=brands'>example</a>
         */
        SIMPLYBUILT,
        /**
         * The brands sistrix icon.See <a href='https://fontawesome.com/v6/icons/sistrix?s=brands'>example</a>
         */
        SISTRIX,
        /**
         * The brands sith icon.See <a href='https://fontawesome.com/v6/icons/sith?s=brands'>example</a>
         */
        SITH,
        /**
         * The brands sitrox icon.See <a href='https://fontawesome.com/v6/icons/sitrox?s=brands'>example</a>
         */
        SITROX,
        /**
         * The brands sketch icon.See <a href='https://fontawesome.com/v6/icons/sketch?s=brands'>example</a>
         */
        SKETCH,
        /**
         * The brands skyatlas icon.See <a href='https://fontawesome.com/v6/icons/skyatlas?s=brands'>example</a>
         */
        SKYATLAS,
        /**
         * The brands skype icon.See <a href='https://fontawesome.com/v6/icons/skype?s=brands'>example</a>
         */
        SKYPE,
        /**
         * The brands slack icon.See <a href='https://fontawesome.com/v6/icons/slack?s=brands'>example</a>
         */
        SLACK,
        /**
         * The brands slack-hash icon.See <a href='https://fontawesome.com/v6/icons/slack-hash?s=brands'>example</a>
         */
        SLACK_HASH,
        /**
         * The brands slideshare icon.See <a href='https://fontawesome.com/v6/icons/slideshare?s=brands'>example</a>
         */
        SLIDESHARE,
        /**
         * The brands snapchat icon.See <a href='https://fontawesome.com/v6/icons/snapchat?s=brands'>example</a>
         */
        SNAPCHAT,
        /**
         * The brands snapchat-ghost icon.See <a href='https://fontawesome.com/v6/icons/snapchat-ghost?s=brands'>example</a>
         */
        SNAPCHAT_GHOST,
        /**
         * The brands snapchat-square icon.See <a href='https://fontawesome.com/v6/icons/snapchat-square?s=brands'>example</a>
         */
        SNAPCHAT_SQUARE,
        /**
         * The brands soundcloud icon.See <a href='https://fontawesome.com/v6/icons/soundcloud?s=brands'>example</a>
         */
        SOUNDCLOUD,
        /**
         * The brands sourcetree icon.See <a href='https://fontawesome.com/v6/icons/sourcetree?s=brands'>example</a>
         */
        SOURCETREE,
        /**
         * The brands space-awesome icon.See <a href='https://fontawesome.com/v6/icons/space-awesome?s=brands'>example</a>
         */
        SPACE_AWESOME,
        /**
         * The brands speakap icon.See <a href='https://fontawesome.com/v6/icons/speakap?s=brands'>example</a>
         */
        SPEAKAP,
        /**
         * The brands speaker-deck icon.See <a href='https://fontawesome.com/v6/icons/speaker-deck?s=brands'>example</a>
         */
        SPEAKER_DECK,
        /**
         * The brands spotify icon.See <a href='https://fontawesome.com/v6/icons/spotify?s=brands'>example</a>
         */
        SPOTIFY,
        /**
         * The brands square-behance icon.See <a href='https://fontawesome.com/v6/icons/square-behance?s=brands'>example</a>
         */
        SQUARE_BEHANCE,
        /**
         * The brands square-dribbble icon.See <a href='https://fontawesome.com/v6/icons/square-dribbble?s=brands'>example</a>
         */
        SQUARE_DRIBBBLE,
        /**
         * The brands square-facebook icon.See <a href='https://fontawesome.com/v6/icons/square-facebook?s=brands'>example</a>
         */
        SQUARE_FACEBOOK,
        /**
         * The brands square-font-awesome icon.See <a href='https://fontawesome.com/v6/icons/square-font-awesome?s=brands'>example</a>
         */
        SQUARE_FONT_AWESOME,
        /**
         * The brands square-font-awesome-stroke icon.See <a href='https://fontawesome.com/v6/icons/square-font-awesome-stroke?s=brands'>example</a>
         */
        SQUARE_FONT_AWESOME_STROKE,
        /**
         * The brands square-git icon.See <a href='https://fontawesome.com/v6/icons/square-git?s=brands'>example</a>
         */
        SQUARE_GIT,
        /**
         * The brands square-github icon.See <a href='https://fontawesome.com/v6/icons/square-github?s=brands'>example</a>
         */
        SQUARE_GITHUB,
        /**
         * The brands square-gitlab icon.See <a href='https://fontawesome.com/v6/icons/square-gitlab?s=brands'>example</a>
         */
        SQUARE_GITLAB,
        /**
         * The brands square-google-plus icon.See <a href='https://fontawesome.com/v6/icons/square-google-plus?s=brands'>example</a>
         */
        SQUARE_GOOGLE_PLUS,
        /**
         * The brands square-hacker-news icon.See <a href='https://fontawesome.com/v6/icons/square-hacker-news?s=brands'>example</a>
         */
        SQUARE_HACKER_NEWS,
        /**
         * The brands square-instagram icon.See <a href='https://fontawesome.com/v6/icons/square-instagram?s=brands'>example</a>
         */
        SQUARE_INSTAGRAM,
        /**
         * The brands square-js icon.See <a href='https://fontawesome.com/v6/icons/square-js?s=brands'>example</a>
         */
        SQUARE_JS,
        /**
         * The brands square-lastfm icon.See <a href='https://fontawesome.com/v6/icons/square-lastfm?s=brands'>example</a>
         */
        SQUARE_LASTFM,
        /**
         * The brands square-odnoklassniki icon.See <a href='https://fontawesome.com/v6/icons/square-odnoklassniki?s=brands'>example</a>
         */
        SQUARE_ODNOKLASSNIKI,
        /**
         * The brands square-pied-piper icon.See <a href='https://fontawesome.com/v6/icons/square-pied-piper?s=brands'>example</a>
         */
        SQUARE_PIED_PIPER,
        /**
         * The brands square-pinterest icon.See <a href='https://fontawesome.com/v6/icons/square-pinterest?s=brands'>example</a>
         */
        SQUARE_PINTEREST,
        /**
         * The brands square-reddit icon.See <a href='https://fontawesome.com/v6/icons/square-reddit?s=brands'>example</a>
         */
        SQUARE_REDDIT,
        /**
         * The brands square-snapchat icon.See <a href='https://fontawesome.com/v6/icons/square-snapchat?s=brands'>example</a>
         */
        SQUARE_SNAPCHAT,
        /**
         * The brands square-steam icon.See <a href='https://fontawesome.com/v6/icons/square-steam?s=brands'>example</a>
         */
        SQUARE_STEAM,
        /**
         * The brands square-tumblr icon.See <a href='https://fontawesome.com/v6/icons/square-tumblr?s=brands'>example</a>
         */
        SQUARE_TUMBLR,
        /**
         * The brands square-twitter icon.See <a href='https://fontawesome.com/v6/icons/square-twitter?s=brands'>example</a>
         */
        SQUARE_TWITTER,
        /**
         * The brands square-viadeo icon.See <a href='https://fontawesome.com/v6/icons/square-viadeo?s=brands'>example</a>
         */
        SQUARE_VIADEO,
        /**
         * The brands square-vimeo icon.See <a href='https://fontawesome.com/v6/icons/square-vimeo?s=brands'>example</a>
         */
        SQUARE_VIMEO,
        /**
         * The brands square-whatsapp icon.See <a href='https://fontawesome.com/v6/icons/square-whatsapp?s=brands'>example</a>
         */
        SQUARE_WHATSAPP,
        /**
         * The brands square-xing icon.See <a href='https://fontawesome.com/v6/icons/square-xing?s=brands'>example</a>
         */
        SQUARE_XING,
        /**
         * The brands square-youtube icon.See <a href='https://fontawesome.com/v6/icons/square-youtube?s=brands'>example</a>
         */
        SQUARE_YOUTUBE,
        /**
         * The brands squarespace icon.See <a href='https://fontawesome.com/v6/icons/squarespace?s=brands'>example</a>
         */
        SQUARESPACE,
        /**
         * The brands stack-exchange icon.See <a href='https://fontawesome.com/v6/icons/stack-exchange?s=brands'>example</a>
         */
        STACK_EXCHANGE,
        /**
         * The brands stack-overflow icon.See <a href='https://fontawesome.com/v6/icons/stack-overflow?s=brands'>example</a>
         */
        STACK_OVERFLOW,
        /**
         * The brands stackpath icon.See <a href='https://fontawesome.com/v6/icons/stackpath?s=brands'>example</a>
         */
        STACKPATH,
        /**
         * The brands staylinked icon.See <a href='https://fontawesome.com/v6/icons/staylinked?s=brands'>example</a>
         */
        STAYLINKED,
        /**
         * The brands steam icon.See <a href='https://fontawesome.com/v6/icons/steam?s=brands'>example</a>
         */
        STEAM,
        /**
         * The brands steam-square icon.See <a href='https://fontawesome.com/v6/icons/steam-square?s=brands'>example</a>
         */
        STEAM_SQUARE,
        /**
         * The brands steam-symbol icon.See <a href='https://fontawesome.com/v6/icons/steam-symbol?s=brands'>example</a>
         */
        STEAM_SYMBOL,
        /**
         * The brands sticker-mule icon.See <a href='https://fontawesome.com/v6/icons/sticker-mule?s=brands'>example</a>
         */
        STICKER_MULE,
        /**
         * The brands strava icon.See <a href='https://fontawesome.com/v6/icons/strava?s=brands'>example</a>
         */
        STRAVA,
        /**
         * The brands stripe icon.See <a href='https://fontawesome.com/v6/icons/stripe?s=brands'>example</a>
         */
        STRIPE,
        /**
         * The brands stripe-s icon.See <a href='https://fontawesome.com/v6/icons/stripe-s?s=brands'>example</a>
         */
        STRIPE_S,
        /**
         * The brands studiovinari icon.See <a href='https://fontawesome.com/v6/icons/studiovinari?s=brands'>example</a>
         */
        STUDIOVINARI,
        /**
         * The brands stumbleupon icon.See <a href='https://fontawesome.com/v6/icons/stumbleupon?s=brands'>example</a>
         */
        STUMBLEUPON,
        /**
         * The brands stumbleupon-circle icon.See <a href='https://fontawesome.com/v6/icons/stumbleupon-circle?s=brands'>example</a>
         */
        STUMBLEUPON_CIRCLE,
        /**
         * The brands superpowers icon.See <a href='https://fontawesome.com/v6/icons/superpowers?s=brands'>example</a>
         */
        SUPERPOWERS,
        /**
         * The brands supple icon.See <a href='https://fontawesome.com/v6/icons/supple?s=brands'>example</a>
         */
        SUPPLE,
        /**
         * The brands suse icon.See <a href='https://fontawesome.com/v6/icons/suse?s=brands'>example</a>
         */
        SUSE,
        /**
         * The brands swift icon.See <a href='https://fontawesome.com/v6/icons/swift?s=brands'>example</a>
         */
        SWIFT,
        /**
         * The brands symfony icon.See <a href='https://fontawesome.com/v6/icons/symfony?s=brands'>example</a>
         */
        SYMFONY,
        /**
         * The brands teamspeak icon.See <a href='https://fontawesome.com/v6/icons/teamspeak?s=brands'>example</a>
         */
        TEAMSPEAK,
        /**
         * The brands telegram icon.See <a href='https://fontawesome.com/v6/icons/telegram?s=brands'>example</a>
         */
        TELEGRAM,
        /**
         * The brands telegram-plane icon.See <a href='https://fontawesome.com/v6/icons/telegram-plane?s=brands'>example</a>
         */
        TELEGRAM_PLANE,
        /**
         * The brands tencent-weibo icon.See <a href='https://fontawesome.com/v6/icons/tencent-weibo?s=brands'>example</a>
         */
        TENCENT_WEIBO,
        /**
         * The brands the-red-yeti icon.See <a href='https://fontawesome.com/v6/icons/the-red-yeti?s=brands'>example</a>
         */
        THE_RED_YETI,
        /**
         * The brands themeco icon.See <a href='https://fontawesome.com/v6/icons/themeco?s=brands'>example</a>
         */
        THEMECO,
        /**
         * The brands themeisle icon.See <a href='https://fontawesome.com/v6/icons/themeisle?s=brands'>example</a>
         */
        THEMEISLE,
        /**
         * The brands think-peaks icon.See <a href='https://fontawesome.com/v6/icons/think-peaks?s=brands'>example</a>
         */
        THINK_PEAKS,
        /**
         * The brands tiktok icon.See <a href='https://fontawesome.com/v6/icons/tiktok?s=brands'>example</a>
         */
        TIKTOK,
        /**
         * The brands trade-federation icon.See <a href='https://fontawesome.com/v6/icons/trade-federation?s=brands'>example</a>
         */
        TRADE_FEDERATION,
        /**
         * The brands trello icon.See <a href='https://fontawesome.com/v6/icons/trello?s=brands'>example</a>
         */
        TRELLO,
        /**
         * The brands tumblr icon.See <a href='https://fontawesome.com/v6/icons/tumblr?s=brands'>example</a>
         */
        TUMBLR,
        /**
         * The brands tumblr-square icon.See <a href='https://fontawesome.com/v6/icons/tumblr-square?s=brands'>example</a>
         */
        TUMBLR_SQUARE,
        /**
         * The brands twitch icon.See <a href='https://fontawesome.com/v6/icons/twitch?s=brands'>example</a>
         */
        TWITCH,
        /**
         * The brands twitter icon.See <a href='https://fontawesome.com/v6/icons/twitter?s=brands'>example</a>
         */
        TWITTER,
        /**
         * The brands twitter-square icon.See <a href='https://fontawesome.com/v6/icons/twitter-square?s=brands'>example</a>
         */
        TWITTER_SQUARE,
        /**
         * The brands typo3 icon.See <a href='https://fontawesome.com/v6/icons/typo3?s=brands'>example</a>
         */
        TYPO3,
        /**
         * The brands uber icon.See <a href='https://fontawesome.com/v6/icons/uber?s=brands'>example</a>
         */
        UBER,
        /**
         * The brands ubuntu icon.See <a href='https://fontawesome.com/v6/icons/ubuntu?s=brands'>example</a>
         */
        UBUNTU,
        /**
         * The brands uikit icon.See <a href='https://fontawesome.com/v6/icons/uikit?s=brands'>example</a>
         */
        UIKIT,
        /**
         * The brands umbraco icon.See <a href='https://fontawesome.com/v6/icons/umbraco?s=brands'>example</a>
         */
        UMBRACO,
        /**
         * The brands uncharted icon.See <a href='https://fontawesome.com/v6/icons/uncharted?s=brands'>example</a>
         */
        UNCHARTED,
        /**
         * The brands uniregistry icon.See <a href='https://fontawesome.com/v6/icons/uniregistry?s=brands'>example</a>
         */
        UNIREGISTRY,
        /**
         * The brands unity icon.See <a href='https://fontawesome.com/v6/icons/unity?s=brands'>example</a>
         */
        UNITY,
        /**
         * The brands unsplash icon.See <a href='https://fontawesome.com/v6/icons/unsplash?s=brands'>example</a>
         */
        UNSPLASH,
        /**
         * The brands untappd icon.See <a href='https://fontawesome.com/v6/icons/untappd?s=brands'>example</a>
         */
        UNTAPPD,
        /**
         * The brands ups icon.See <a href='https://fontawesome.com/v6/icons/ups?s=brands'>example</a>
         */
        UPS,
        /**
         * The brands usb icon.See <a href='https://fontawesome.com/v6/icons/usb?s=brands'>example</a>
         */
        USB,
        /**
         * The brands usps icon.See <a href='https://fontawesome.com/v6/icons/usps?s=brands'>example</a>
         */
        USPS,
        /**
         * The brands ussunnah icon.See <a href='https://fontawesome.com/v6/icons/ussunnah?s=brands'>example</a>
         */
        USSUNNAH,
        /**
         * The brands vaadin icon.See <a href='https://fontawesome.com/v6/icons/vaadin?s=brands'>example</a>
         */
        VAADIN,
        /**
         * The brands viacoin icon.See <a href='https://fontawesome.com/v6/icons/viacoin?s=brands'>example</a>
         */
        VIACOIN,
        /**
         * The brands viadeo icon.See <a href='https://fontawesome.com/v6/icons/viadeo?s=brands'>example</a>
         */
        VIADEO,
        /**
         * The brands viadeo-square icon.See <a href='https://fontawesome.com/v6/icons/viadeo-square?s=brands'>example</a>
         */
        VIADEO_SQUARE,
        /**
         * The brands viber icon.See <a href='https://fontawesome.com/v6/icons/viber?s=brands'>example</a>
         */
        VIBER,
        /**
         * The brands vimeo icon.See <a href='https://fontawesome.com/v6/icons/vimeo?s=brands'>example</a>
         */
        VIMEO,
        /**
         * The brands vimeo-square icon.See <a href='https://fontawesome.com/v6/icons/vimeo-square?s=brands'>example</a>
         */
        VIMEO_SQUARE,
        /**
         * The brands vimeo-v icon.See <a href='https://fontawesome.com/v6/icons/vimeo-v?s=brands'>example</a>
         */
        VIMEO_V,
        /**
         * The brands vine icon.See <a href='https://fontawesome.com/v6/icons/vine?s=brands'>example</a>
         */
        VINE,
        /**
         * The brands vk icon.See <a href='https://fontawesome.com/v6/icons/vk?s=brands'>example</a>
         */
        VK,
        /**
         * The brands vnv icon.See <a href='https://fontawesome.com/v6/icons/vnv?s=brands'>example</a>
         */
        VNV,
        /**
         * The brands vuejs icon.See <a href='https://fontawesome.com/v6/icons/vuejs?s=brands'>example</a>
         */
        VUEJS,
        /**
         * The brands watchman-monitoring icon.See <a href='https://fontawesome.com/v6/icons/watchman-monitoring?s=brands'>example</a>
         */
        WATCHMAN_MONITORING,
        /**
         * The brands waze icon.See <a href='https://fontawesome.com/v6/icons/waze?s=brands'>example</a>
         */
        WAZE,
        /**
         * The brands weebly icon.See <a href='https://fontawesome.com/v6/icons/weebly?s=brands'>example</a>
         */
        WEEBLY,
        /**
         * The brands weibo icon.See <a href='https://fontawesome.com/v6/icons/weibo?s=brands'>example</a>
         */
        WEIBO,
        /**
         * The brands weixin icon.See <a href='https://fontawesome.com/v6/icons/weixin?s=brands'>example</a>
         */
        WEIXIN,
        /**
         * The brands whatsapp icon.See <a href='https://fontawesome.com/v6/icons/whatsapp?s=brands'>example</a>
         */
        WHATSAPP,
        /**
         * The brands whatsapp-square icon.See <a href='https://fontawesome.com/v6/icons/whatsapp-square?s=brands'>example</a>
         */
        WHATSAPP_SQUARE,
        /**
         * The brands whmcs icon.See <a href='https://fontawesome.com/v6/icons/whmcs?s=brands'>example</a>
         */
        WHMCS,
        /**
         * The brands wikipedia-w icon.See <a href='https://fontawesome.com/v6/icons/wikipedia-w?s=brands'>example</a>
         */
        WIKIPEDIA_W,
        /**
         * The brands windows icon.See <a href='https://fontawesome.com/v6/icons/windows?s=brands'>example</a>
         */
        WINDOWS,
        /**
         * The brands wirsindhandwerk icon.See <a href='https://fontawesome.com/v6/icons/wirsindhandwerk?s=brands'>example</a>
         */
        WIRSINDHANDWERK,
        /**
         * The brands wix icon.See <a href='https://fontawesome.com/v6/icons/wix?s=brands'>example</a>
         */
        WIX,
        /**
         * The brands wizards-of-the-coast icon.See <a href='https://fontawesome.com/v6/icons/wizards-of-the-coast?s=brands'>example</a>
         */
        WIZARDS_OF_THE_COAST,
        /**
         * The brands wodu icon.See <a href='https://fontawesome.com/v6/icons/wodu?s=brands'>example</a>
         */
        WODU,
        /**
         * The brands wolf-pack-battalion icon.See <a href='https://fontawesome.com/v6/icons/wolf-pack-battalion?s=brands'>example</a>
         */
        WOLF_PACK_BATTALION,
        /**
         * The brands wordpress icon.See <a href='https://fontawesome.com/v6/icons/wordpress?s=brands'>example</a>
         */
        WORDPRESS,
        /**
         * The brands wordpress-simple icon.See <a href='https://fontawesome.com/v6/icons/wordpress-simple?s=brands'>example</a>
         */
        WORDPRESS_SIMPLE,
        /**
         * The brands wpbeginner icon.See <a href='https://fontawesome.com/v6/icons/wpbeginner?s=brands'>example</a>
         */
        WPBEGINNER,
        /**
         * The brands wpexplorer icon.See <a href='https://fontawesome.com/v6/icons/wpexplorer?s=brands'>example</a>
         */
        WPEXPLORER,
        /**
         * The brands wpforms icon.See <a href='https://fontawesome.com/v6/icons/wpforms?s=brands'>example</a>
         */
        WPFORMS,
        /**
         * The brands wpressr icon.See <a href='https://fontawesome.com/v6/icons/wpressr?s=brands'>example</a>
         */
        WPRESSR,
        /**
         * The brands wsh icon.See <a href='https://fontawesome.com/v6/icons/wsh?s=brands'>example</a>
         */
        WSH,
        /**
         * The brands xbox icon.See <a href='https://fontawesome.com/v6/icons/xbox?s=brands'>example</a>
         */
        XBOX,
        /**
         * The brands xing icon.See <a href='https://fontawesome.com/v6/icons/xing?s=brands'>example</a>
         */
        XING,
        /**
         * The brands xing-square icon.See <a href='https://fontawesome.com/v6/icons/xing-square?s=brands'>example</a>
         */
        XING_SQUARE,
        /**
         * The brands y-combinator icon.See <a href='https://fontawesome.com/v6/icons/y-combinator?s=brands'>example</a>
         */
        Y_COMBINATOR,
        /**
         * The brands yahoo icon.See <a href='https://fontawesome.com/v6/icons/yahoo?s=brands'>example</a>
         */
        YAHOO,
        /**
         * The brands yammer icon.See <a href='https://fontawesome.com/v6/icons/yammer?s=brands'>example</a>
         */
        YAMMER,
        /**
         * The brands yandex icon.See <a href='https://fontawesome.com/v6/icons/yandex?s=brands'>example</a>
         */
        YANDEX,
        /**
         * The brands yandex-international icon.See <a href='https://fontawesome.com/v6/icons/yandex-international?s=brands'>example</a>
         */
        YANDEX_INTERNATIONAL,
        /**
         * The brands yarn icon.See <a href='https://fontawesome.com/v6/icons/yarn?s=brands'>example</a>
         */
        YARN,
        /**
         * The brands yelp icon.See <a href='https://fontawesome.com/v6/icons/yelp?s=brands'>example</a>
         */
        YELP,
        /**
         * The brands yoast icon.See <a href='https://fontawesome.com/v6/icons/yoast?s=brands'>example</a>
         */
        YOAST,
        /**
         * The brands youtube icon.See <a href='https://fontawesome.com/v6/icons/youtube?s=brands'>example</a>
         */
        YOUTUBE,
        /**
         * The brands youtube-square icon.See <a href='https://fontawesome.com/v6/icons/youtube-square?s=brands'>example</a>
         */
        YOUTUBE_SQUARE,
        /**
         * The brands zhihu icon.See <a href='https://fontawesome.com/v6/icons/zhihu?s=brands'>example</a>
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
         * Create a new {@link Icon} instance with the icon determined by the name.
         * @return a new instance of {@link Icon} component
         */
        public Icon create() {
            return new Icon(this.getIconPart());
        }

        /**
         * Create a new {@link Icon} instance with the icon determined by the name and a listener for click events.
         * @param listener the event listener for click events
         * @return a new instance of {@link Icon} component
         */
        public Icon create(ComponentEventListener<ClickEvent<com.vaadin.flow.component.icon.Icon>> listener) {
            Icon icon = create();
            icon.addClickListener(listener);
            return icon;
        }

        /**
         * Server side component for {@code Brands}
         */
        @JsModule("./font-awesome-iron-iconset/fab.js")
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "4.2.0")
        @SuppressWarnings("serial")
        public static final class Icon extends com.vaadin.flow.component.icon.Icon implements ClickNotifier<com.vaadin.flow.component.icon.Icon> {

             Icon(String icon) {
                super(ICONSET, icon);
            }
        }
    }
}
