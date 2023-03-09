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

import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.ComponentEventListener;
import java.util.Locale;

/**
 * FontAwesome 6.0.0 icons.
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
         * The regular address-book icon.See <a href='https://fontawesome.com/v6/icons/address-book?s=regular'>example</a>
         */
        ADDRESS_BOOK,
        /**
         * The regular address-card icon.See <a href='https://fontawesome.com/v6/icons/address-card?s=regular'>example</a>
         */
        ADDRESS_CARD,
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
         * The regular calendar-xmark icon.See <a href='https://fontawesome.com/v6/icons/calendar-xmark?s=regular'>example</a>
         */
        CALENDAR_XMARK,
        /**
         * The regular chart-bar icon.See <a href='https://fontawesome.com/v6/icons/chart-bar?s=regular'>example</a>
         */
        CHART_BAR,
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
         * The regular comment-dots icon.See <a href='https://fontawesome.com/v6/icons/comment-dots?s=regular'>example</a>
         */
        COMMENT_DOTS,
        /**
         * The regular comments icon.See <a href='https://fontawesome.com/v6/icons/comments?s=regular'>example</a>
         */
        COMMENTS,
        /**
         * The regular compass icon.See <a href='https://fontawesome.com/v6/icons/compass?s=regular'>example</a>
         */
        COMPASS,
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
         * The regular file-audio icon.See <a href='https://fontawesome.com/v6/icons/file-audio?s=regular'>example</a>
         */
        FILE_AUDIO,
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
         * The regular folder icon.See <a href='https://fontawesome.com/v6/icons/folder?s=regular'>example</a>
         */
        FOLDER,
        /**
         * The regular folder-open icon.See <a href='https://fontawesome.com/v6/icons/folder-open?s=regular'>example</a>
         */
        FOLDER_OPEN,
        /**
         * The regular font-awesome icon.See <a href='https://fontawesome.com/v6/icons/font-awesome?s=regular'>example</a>
         */
        FONT_AWESOME,
        /**
         * The regular futbol icon.See <a href='https://fontawesome.com/v6/icons/futbol?s=regular'>example</a>
         */
        FUTBOL,
        /**
         * The regular gem icon.See <a href='https://fontawesome.com/v6/icons/gem?s=regular'>example</a>
         */
        GEM,
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
         * The regular heart icon.See <a href='https://fontawesome.com/v6/icons/heart?s=regular'>example</a>
         */
        HEART,
        /**
         * The regular hospital icon.See <a href='https://fontawesome.com/v6/icons/hospital?s=regular'>example</a>
         */
        HOSPITAL,
        /**
         * The regular hourglass icon.See <a href='https://fontawesome.com/v6/icons/hourglass?s=regular'>example</a>
         */
        HOURGLASS,
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
         * The regular map icon.See <a href='https://fontawesome.com/v6/icons/map?s=regular'>example</a>
         */
        MAP,
        /**
         * The regular message icon.See <a href='https://fontawesome.com/v6/icons/message?s=regular'>example</a>
         */
        MESSAGE,
        /**
         * The regular money-bill-1 icon.See <a href='https://fontawesome.com/v6/icons/money-bill-1?s=regular'>example</a>
         */
        MONEY_BILL_1,
        /**
         * The regular moon icon.See <a href='https://fontawesome.com/v6/icons/moon?s=regular'>example</a>
         */
        MOON,
        /**
         * The regular newspaper icon.See <a href='https://fontawesome.com/v6/icons/newspaper?s=regular'>example</a>
         */
        NEWSPAPER,
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
         * The regular pen-to-square icon.See <a href='https://fontawesome.com/v6/icons/pen-to-square?s=regular'>example</a>
         */
        PEN_TO_SQUARE,
        /**
         * The regular rectangle-list icon.See <a href='https://fontawesome.com/v6/icons/rectangle-list?s=regular'>example</a>
         */
        RECTANGLE_LIST,
        /**
         * The regular rectangle-xmark icon.See <a href='https://fontawesome.com/v6/icons/rectangle-xmark?s=regular'>example</a>
         */
        RECTANGLE_XMARK,
        /**
         * The regular registered icon.See <a href='https://fontawesome.com/v6/icons/registered?s=regular'>example</a>
         */
        REGISTERED,
        /**
         * The regular share-from-square icon.See <a href='https://fontawesome.com/v6/icons/share-from-square?s=regular'>example</a>
         */
        SHARE_FROM_SQUARE,
        /**
         * The regular snowflake icon.See <a href='https://fontawesome.com/v6/icons/snowflake?s=regular'>example</a>
         */
        SNOWFLAKE,
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
         * The regular star-half-stroke icon.See <a href='https://fontawesome.com/v6/icons/star-half-stroke?s=regular'>example</a>
         */
        STAR_HALF_STROKE,
        /**
         * The regular sun icon.See <a href='https://fontawesome.com/v6/icons/sun?s=regular'>example</a>
         */
        SUN,
        /**
         * The regular thumbs-down icon.See <a href='https://fontawesome.com/v6/icons/thumbs-down?s=regular'>example</a>
         */
        THUMBS_DOWN,
        /**
         * The regular thumbs-up icon.See <a href='https://fontawesome.com/v6/icons/thumbs-up?s=regular'>example</a>
         */
        THUMBS_UP,
        /**
         * The regular trash-can icon.See <a href='https://fontawesome.com/v6/icons/trash-can?s=regular'>example</a>
         */
        TRASH_CAN,
        /**
         * The regular user icon.See <a href='https://fontawesome.com/v6/icons/user?s=regular'>example</a>
         */
        USER,
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
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "3.0.0")
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
         * The solid address-book icon.See <a href='https://fontawesome.com/v6/icons/address-book?s=solid'>example</a>
         */
        ADDRESS_BOOK,
        /**
         * The solid address-card icon.See <a href='https://fontawesome.com/v6/icons/address-card?s=solid'>example</a>
         */
        ADDRESS_CARD,
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
         * The solid anchor icon.See <a href='https://fontawesome.com/v6/icons/anchor?s=solid'>example</a>
         */
        ANCHOR,
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
         * The solid ankh icon.See <a href='https://fontawesome.com/v6/icons/ankh?s=solid'>example</a>
         */
        ANKH,
        /**
         * The solid apple-whole icon.See <a href='https://fontawesome.com/v6/icons/apple-whole?s=solid'>example</a>
         */
        APPLE_WHOLE,
        /**
         * The solid archway icon.See <a href='https://fontawesome.com/v6/icons/archway?s=solid'>example</a>
         */
        ARCHWAY,
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
         * The solid arrow-right-long icon.See <a href='https://fontawesome.com/v6/icons/arrow-right-long?s=solid'>example</a>
         */
        ARROW_RIGHT_LONG,
        /**
         * The solid arrow-right-to-bracket icon.See <a href='https://fontawesome.com/v6/icons/arrow-right-to-bracket?s=solid'>example</a>
         */
        ARROW_RIGHT_TO_BRACKET,
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
         * The solid arrow-up-long icon.See <a href='https://fontawesome.com/v6/icons/arrow-up-long?s=solid'>example</a>
         */
        ARROW_UP_LONG,
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
         * The solid arrows-left-right icon.See <a href='https://fontawesome.com/v6/icons/arrows-left-right?s=solid'>example</a>
         */
        ARROWS_LEFT_RIGHT,
        /**
         * The solid arrows-rotate icon.See <a href='https://fontawesome.com/v6/icons/arrows-rotate?s=solid'>example</a>
         */
        ARROWS_ROTATE,
        /**
         * The solid arrows-up-down icon.See <a href='https://fontawesome.com/v6/icons/arrows-up-down?s=solid'>example</a>
         */
        ARROWS_UP_DOWN,
        /**
         * The solid arrows-up-down-left-right icon.See <a href='https://fontawesome.com/v6/icons/arrows-up-down-left-right?s=solid'>example</a>
         */
        ARROWS_UP_DOWN_LEFT_RIGHT,
        /**
         * The solid asterisk icon.See <a href='https://fontawesome.com/v6/icons/asterisk?s=solid'>example</a>
         */
        ASTERISK,
        /**
         * The solid at icon.See <a href='https://fontawesome.com/v6/icons/at?s=solid'>example</a>
         */
        AT,
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
         * The solid ban icon.See <a href='https://fontawesome.com/v6/icons/ban?s=solid'>example</a>
         */
        BAN,
        /**
         * The solid ban-smoking icon.See <a href='https://fontawesome.com/v6/icons/ban-smoking?s=solid'>example</a>
         */
        BAN_SMOKING,
        /**
         * The solid bandage icon.See <a href='https://fontawesome.com/v6/icons/bandage?s=solid'>example</a>
         */
        BANDAGE,
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
         * The solid bath icon.See <a href='https://fontawesome.com/v6/icons/bath?s=solid'>example</a>
         */
        BATH,
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
         * The solid bicycle icon.See <a href='https://fontawesome.com/v6/icons/bicycle?s=solid'>example</a>
         */
        BICYCLE,
        /**
         * The solid binoculars icon.See <a href='https://fontawesome.com/v6/icons/binoculars?s=solid'>example</a>
         */
        BINOCULARS,
        /**
         * The solid biohazard icon.See <a href='https://fontawesome.com/v6/icons/biohazard?s=solid'>example</a>
         */
        BIOHAZARD,
        /**
         * The solid bitcoin-sign icon.See <a href='https://fontawesome.com/v6/icons/bitcoin-sign?s=solid'>example</a>
         */
        BITCOIN_SIGN,
        /**
         * The solid blender icon.See <a href='https://fontawesome.com/v6/icons/blender?s=solid'>example</a>
         */
        BLENDER,
        /**
         * The solid blender-phone icon.See <a href='https://fontawesome.com/v6/icons/blender-phone?s=solid'>example</a>
         */
        BLENDER_PHONE,
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
         * The solid book-skull icon.See <a href='https://fontawesome.com/v6/icons/book-skull?s=solid'>example</a>
         */
        BOOK_SKULL,
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
         * The solid border-top-left icon.See <a href='https://fontawesome.com/v6/icons/border-top-left?s=solid'>example</a>
         */
        BORDER_TOP_LEFT,
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
         * The solid briefcase icon.See <a href='https://fontawesome.com/v6/icons/briefcase?s=solid'>example</a>
         */
        BRIEFCASE,
        /**
         * The solid briefcase-medical icon.See <a href='https://fontawesome.com/v6/icons/briefcase-medical?s=solid'>example</a>
         */
        BRIEFCASE_MEDICAL,
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
         * The solid bug icon.See <a href='https://fontawesome.com/v6/icons/bug?s=solid'>example</a>
         */
        BUG,
        /**
         * The solid bug-slash icon.See <a href='https://fontawesome.com/v6/icons/bug-slash?s=solid'>example</a>
         */
        BUG_SLASH,
        /**
         * The solid building icon.See <a href='https://fontawesome.com/v6/icons/building?s=solid'>example</a>
         */
        BUILDING,
        /**
         * The solid building-columns icon.See <a href='https://fontawesome.com/v6/icons/building-columns?s=solid'>example</a>
         */
        BUILDING_COLUMNS,
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
         * The solid bus icon.See <a href='https://fontawesome.com/v6/icons/bus?s=solid'>example</a>
         */
        BUS,
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
         * The solid car-battery icon.See <a href='https://fontawesome.com/v6/icons/car-battery?s=solid'>example</a>
         */
        CAR_BATTERY,
        /**
         * The solid car-crash icon.See <a href='https://fontawesome.com/v6/icons/car-crash?s=solid'>example</a>
         */
        CAR_CRASH,
        /**
         * The solid car-rear icon.See <a href='https://fontawesome.com/v6/icons/car-rear?s=solid'>example</a>
         */
        CAR_REAR,
        /**
         * The solid car-side icon.See <a href='https://fontawesome.com/v6/icons/car-side?s=solid'>example</a>
         */
        CAR_SIDE,
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
         * The solid caret-up icon.See <a href='https://fontawesome.com/v6/icons/caret-up?s=solid'>example</a>
         */
        CARET_UP,
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
         * The solid chair icon.See <a href='https://fontawesome.com/v6/icons/chair?s=solid'>example</a>
         */
        CHAIR,
        /**
         * The solid chalkboard icon.See <a href='https://fontawesome.com/v6/icons/chalkboard?s=solid'>example</a>
         */
        CHALKBOARD,
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
         * The solid check icon.See <a href='https://fontawesome.com/v6/icons/check?s=solid'>example</a>
         */
        CHECK,
        /**
         * The solid check-double icon.See <a href='https://fontawesome.com/v6/icons/check-double?s=solid'>example</a>
         */
        CHECK_DOUBLE,
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
         * The solid clock icon.See <a href='https://fontawesome.com/v6/icons/clock?s=solid'>example</a>
         */
        CLOCK,
        /**
         * The solid clock-rotate-left icon.See <a href='https://fontawesome.com/v6/icons/clock-rotate-left?s=solid'>example</a>
         */
        CLOCK_ROTATE_LEFT,
        /**
         * The solid clone icon.See <a href='https://fontawesome.com/v6/icons/clone?s=solid'>example</a>
         */
        CLONE,
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
         * The solid cloud-sun icon.See <a href='https://fontawesome.com/v6/icons/cloud-sun?s=solid'>example</a>
         */
        CLOUD_SUN,
        /**
         * The solid cloud-sun-rain icon.See <a href='https://fontawesome.com/v6/icons/cloud-sun-rain?s=solid'>example</a>
         */
        CLOUD_SUN_RAIN,
        /**
         * The solid clover icon.See <a href='https://fontawesome.com/v6/icons/clover?s=solid'>example</a>
         */
        CLOVER,
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
         * The solid coins icon.See <a href='https://fontawesome.com/v6/icons/coins?s=solid'>example</a>
         */
        COINS,
        /**
         * The solid colon-sign icon.See <a href='https://fontawesome.com/v6/icons/colon-sign?s=solid'>example</a>
         */
        COLON_SIGN,
        /**
         * The solid comment icon.See <a href='https://fontawesome.com/v6/icons/comment?s=solid'>example</a>
         */
        COMMENT,
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
         * The solid computer-mouse icon.See <a href='https://fontawesome.com/v6/icons/computer-mouse?s=solid'>example</a>
         */
        COMPUTER_MOUSE,
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
         * The solid credit-card icon.See <a href='https://fontawesome.com/v6/icons/credit-card?s=solid'>example</a>
         */
        CREDIT_CARD,
        /**
         * The solid crop icon.See <a href='https://fontawesome.com/v6/icons/crop?s=solid'>example</a>
         */
        CROP,
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
         * The solid d icon.See <a href='https://fontawesome.com/v6/icons/d?s=solid'>example</a>
         */
        D,
        /**
         * The solid database icon.See <a href='https://fontawesome.com/v6/icons/database?s=solid'>example</a>
         */
        DATABASE,
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
         * The solid dharmachakra icon.See <a href='https://fontawesome.com/v6/icons/dharmachakra?s=solid'>example</a>
         */
        DHARMACHAKRA,
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
         * The solid disease icon.See <a href='https://fontawesome.com/v6/icons/disease?s=solid'>example</a>
         */
        DISEASE,
        /**
         * The solid divide icon.See <a href='https://fontawesome.com/v6/icons/divide?s=solid'>example</a>
         */
        DIVIDE,
        /**
         * The solid dna icon.See <a href='https://fontawesome.com/v6/icons/dna?s=solid'>example</a>
         */
        DNA,
        /**
         * The solid dog icon.See <a href='https://fontawesome.com/v6/icons/dog?s=solid'>example</a>
         */
        DOG,
        /**
         * The solid dollar-sign icon.See <a href='https://fontawesome.com/v6/icons/dollar-sign?s=solid'>example</a>
         */
        DOLLAR_SIGN,
        /**
         * The solid dolly icon.See <a href='https://fontawesome.com/v6/icons/dolly?s=solid'>example</a>
         */
        DOLLY,
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
         * The solid dragon icon.See <a href='https://fontawesome.com/v6/icons/dragon?s=solid'>example</a>
         */
        DRAGON,
        /**
         * The solid draw-polygon icon.See <a href='https://fontawesome.com/v6/icons/draw-polygon?s=solid'>example</a>
         */
        DRAW_POLYGON,
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
         * The solid earth-africa icon.See <a href='https://fontawesome.com/v6/icons/earth-africa?s=solid'>example</a>
         */
        EARTH_AFRICA,
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
         * The solid ellipsis-vertical icon.See <a href='https://fontawesome.com/v6/icons/ellipsis-vertical?s=solid'>example</a>
         */
        ELLIPSIS_VERTICAL,
        /**
         * The solid envelope icon.See <a href='https://fontawesome.com/v6/icons/envelope?s=solid'>example</a>
         */
        ENVELOPE,
        /**
         * The solid envelope-open icon.See <a href='https://fontawesome.com/v6/icons/envelope-open?s=solid'>example</a>
         */
        ENVELOPE_OPEN,
        /**
         * The solid envelope-open-text icon.See <a href='https://fontawesome.com/v6/icons/envelope-open-text?s=solid'>example</a>
         */
        ENVELOPE_OPEN_TEXT,
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
         * The solid euro-sign icon.See <a href='https://fontawesome.com/v6/icons/euro-sign?s=solid'>example</a>
         */
        EURO_SIGN,
        /**
         * The solid exclamation icon.See <a href='https://fontawesome.com/v6/icons/exclamation?s=solid'>example</a>
         */
        EXCLAMATION,
        /**
         * The solid expand icon.See <a href='https://fontawesome.com/v6/icons/expand?s=solid'>example</a>
         */
        EXPAND,
        /**
         * The solid eye icon.See <a href='https://fontawesome.com/v6/icons/eye?s=solid'>example</a>
         */
        EYE,
        /**
         * The solid eye-dropper icon.See <a href='https://fontawesome.com/v6/icons/eye-dropper?s=solid'>example</a>
         */
        EYE_DROPPER,
        /**
         * The solid eye-low-vision icon.See <a href='https://fontawesome.com/v6/icons/eye-low-vision?s=solid'>example</a>
         */
        EYE_LOW_VISION,
        /**
         * The solid eye-slash icon.See <a href='https://fontawesome.com/v6/icons/eye-slash?s=solid'>example</a>
         */
        EYE_SLASH,
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
         * The solid faucet icon.See <a href='https://fontawesome.com/v6/icons/faucet?s=solid'>example</a>
         */
        FAUCET,
        /**
         * The solid fax icon.See <a href='https://fontawesome.com/v6/icons/fax?s=solid'>example</a>
         */
        FAX,
        /**
         * The solid feather icon.See <a href='https://fontawesome.com/v6/icons/feather?s=solid'>example</a>
         */
        FEATHER,
        /**
         * The solid feather-pointed icon.See <a href='https://fontawesome.com/v6/icons/feather-pointed?s=solid'>example</a>
         */
        FEATHER_POINTED,
        /**
         * The solid file icon.See <a href='https://fontawesome.com/v6/icons/file?s=solid'>example</a>
         */
        FILE,
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
         * The solid file-pdf icon.See <a href='https://fontawesome.com/v6/icons/file-pdf?s=solid'>example</a>
         */
        FILE_PDF,
        /**
         * The solid file-powerpoint icon.See <a href='https://fontawesome.com/v6/icons/file-powerpoint?s=solid'>example</a>
         */
        FILE_POWERPOINT,
        /**
         * The solid file-prescription icon.See <a href='https://fontawesome.com/v6/icons/file-prescription?s=solid'>example</a>
         */
        FILE_PRESCRIPTION,
        /**
         * The solid file-signature icon.See <a href='https://fontawesome.com/v6/icons/file-signature?s=solid'>example</a>
         */
        FILE_SIGNATURE,
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
         * The solid fish icon.See <a href='https://fontawesome.com/v6/icons/fish?s=solid'>example</a>
         */
        FISH,
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
         * The solid floppy-disk icon.See <a href='https://fontawesome.com/v6/icons/floppy-disk?s=solid'>example</a>
         */
        FLOPPY_DISK,
        /**
         * The solid florin-sign icon.See <a href='https://fontawesome.com/v6/icons/florin-sign?s=solid'>example</a>
         */
        FLORIN_SIGN,
        /**
         * The solid folder icon.See <a href='https://fontawesome.com/v6/icons/folder?s=solid'>example</a>
         */
        FOLDER,
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
         * The solid football icon.See <a href='https://fontawesome.com/v6/icons/football?s=solid'>example</a>
         */
        FOOTBALL,
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
         * The solid futbol icon.See <a href='https://fontawesome.com/v6/icons/futbol?s=solid'>example</a>
         */
        FUTBOL,
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
         * The solid gauge-simple icon.See <a href='https://fontawesome.com/v6/icons/gauge-simple?s=solid'>example</a>
         */
        GAUGE_SIMPLE,
        /**
         * The solid gauge-simple-high icon.See <a href='https://fontawesome.com/v6/icons/gauge-simple-high?s=solid'>example</a>
         */
        GAUGE_SIMPLE_HIGH,
        /**
         * The solid gavel icon.See <a href='https://fontawesome.com/v6/icons/gavel?s=solid'>example</a>
         */
        GAVEL,
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
         * The solid glasses icon.See <a href='https://fontawesome.com/v6/icons/glasses?s=solid'>example</a>
         */
        GLASSES,
        /**
         * The solid globe icon.See <a href='https://fontawesome.com/v6/icons/globe?s=solid'>example</a>
         */
        GLOBE,
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
         * The solid grip icon.See <a href='https://fontawesome.com/v6/icons/grip?s=solid'>example</a>
         */
        GRIP,
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
         * The solid hand-holding-heart icon.See <a href='https://fontawesome.com/v6/icons/hand-holding-heart?s=solid'>example</a>
         */
        HAND_HOLDING_HEART,
        /**
         * The solid hand-holding-medical icon.See <a href='https://fontawesome.com/v6/icons/hand-holding-medical?s=solid'>example</a>
         */
        HAND_HOLDING_MEDICAL,
        /**
         * The solid hand-lizard icon.See <a href='https://fontawesome.com/v6/icons/hand-lizard?s=solid'>example</a>
         */
        HAND_LIZARD,
        /**
         * The solid hand-middle-finger icon.See <a href='https://fontawesome.com/v6/icons/hand-middle-finger?s=solid'>example</a>
         */
        HAND_MIDDLE_FINGER,
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
         * The solid hands icon.See <a href='https://fontawesome.com/v6/icons/hands?s=solid'>example</a>
         */
        HANDS,
        /**
         * The solid hands-asl-interpreting icon.See <a href='https://fontawesome.com/v6/icons/hands-asl-interpreting?s=solid'>example</a>
         */
        HANDS_ASL_INTERPRETING,
        /**
         * The solid hands-bubbles icon.See <a href='https://fontawesome.com/v6/icons/hands-bubbles?s=solid'>example</a>
         */
        HANDS_BUBBLES,
        /**
         * The solid hands-clapping icon.See <a href='https://fontawesome.com/v6/icons/hands-clapping?s=solid'>example</a>
         */
        HANDS_CLAPPING,
        /**
         * The solid hands-holding icon.See <a href='https://fontawesome.com/v6/icons/hands-holding?s=solid'>example</a>
         */
        HANDS_HOLDING,
        /**
         * The solid hands-praying icon.See <a href='https://fontawesome.com/v6/icons/hands-praying?s=solid'>example</a>
         */
        HANDS_PRAYING,
        /**
         * The solid handshake icon.See <a href='https://fontawesome.com/v6/icons/handshake?s=solid'>example</a>
         */
        HANDSHAKE,
        /**
         * The solid handshake-angle icon.See <a href='https://fontawesome.com/v6/icons/handshake-angle?s=solid'>example</a>
         */
        HANDSHAKE_ANGLE,
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
         * The solid hat-wizard icon.See <a href='https://fontawesome.com/v6/icons/hat-wizard?s=solid'>example</a>
         */
        HAT_WIZARD,
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
         * The solid heading icon.See <a href='https://fontawesome.com/v6/icons/heading?s=solid'>example</a>
         */
        HEADING,
        /**
         * The solid headphones icon.See <a href='https://fontawesome.com/v6/icons/headphones?s=solid'>example</a>
         */
        HEADPHONES,
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
         * The solid heart-crack icon.See <a href='https://fontawesome.com/v6/icons/heart-crack?s=solid'>example</a>
         */
        HEART_CRACK,
        /**
         * The solid heart-pulse icon.See <a href='https://fontawesome.com/v6/icons/heart-pulse?s=solid'>example</a>
         */
        HEART_PULSE,
        /**
         * The solid helicopter icon.See <a href='https://fontawesome.com/v6/icons/helicopter?s=solid'>example</a>
         */
        HELICOPTER,
        /**
         * The solid helmet-safety icon.See <a href='https://fontawesome.com/v6/icons/helmet-safety?s=solid'>example</a>
         */
        HELMET_SAFETY,
        /**
         * The solid highlighter icon.See <a href='https://fontawesome.com/v6/icons/highlighter?s=solid'>example</a>
         */
        HIGHLIGHTER,
        /**
         * The solid hippo icon.See <a href='https://fontawesome.com/v6/icons/hippo?s=solid'>example</a>
         */
        HIPPO,
        /**
         * The solid hockey-puck icon.See <a href='https://fontawesome.com/v6/icons/hockey-puck?s=solid'>example</a>
         */
        HOCKEY_PUCK,
        /**
         * The solid holly-berry icon.See <a href='https://fontawesome.com/v6/icons/holly-berry?s=solid'>example</a>
         */
        HOLLY_BERRY,
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
         * The solid hospital-user icon.See <a href='https://fontawesome.com/v6/icons/hospital-user?s=solid'>example</a>
         */
        HOSPITAL_USER,
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
         * The solid hourglass-empty icon.See <a href='https://fontawesome.com/v6/icons/hourglass-empty?s=solid'>example</a>
         */
        HOURGLASS_EMPTY,
        /**
         * The solid hourglass-end icon.See <a href='https://fontawesome.com/v6/icons/hourglass-end?s=solid'>example</a>
         */
        HOURGLASS_END,
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
         * The solid house-crack icon.See <a href='https://fontawesome.com/v6/icons/house-crack?s=solid'>example</a>
         */
        HOUSE_CRACK,
        /**
         * The solid house-laptop icon.See <a href='https://fontawesome.com/v6/icons/house-laptop?s=solid'>example</a>
         */
        HOUSE_LAPTOP,
        /**
         * The solid house-medical icon.See <a href='https://fontawesome.com/v6/icons/house-medical?s=solid'>example</a>
         */
        HOUSE_MEDICAL,
        /**
         * The solid house-user icon.See <a href='https://fontawesome.com/v6/icons/house-user?s=solid'>example</a>
         */
        HOUSE_USER,
        /**
         * The solid hryvnia-sign icon.See <a href='https://fontawesome.com/v6/icons/hryvnia-sign?s=solid'>example</a>
         */
        HRYVNIA_SIGN,
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
         * The solid id-card-clip icon.See <a href='https://fontawesome.com/v6/icons/id-card-clip?s=solid'>example</a>
         */
        ID_CARD_CLIP,
        /**
         * The solid igloo icon.See <a href='https://fontawesome.com/v6/icons/igloo?s=solid'>example</a>
         */
        IGLOO,
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
         * The solid italic icon.See <a href='https://fontawesome.com/v6/icons/italic?s=solid'>example</a>
         */
        ITALIC,
        /**
         * The solid j icon.See <a href='https://fontawesome.com/v6/icons/j?s=solid'>example</a>
         */
        J,
        /**
         * The solid jedi icon.See <a href='https://fontawesome.com/v6/icons/jedi?s=solid'>example</a>
         */
        JEDI,
        /**
         * The solid jet-fighter icon.See <a href='https://fontawesome.com/v6/icons/jet-fighter?s=solid'>example</a>
         */
        JET_FIGHTER,
        /**
         * The solid joint icon.See <a href='https://fontawesome.com/v6/icons/joint?s=solid'>example</a>
         */
        JOINT,
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
         * The solid kit-medical icon.See <a href='https://fontawesome.com/v6/icons/kit-medical?s=solid'>example</a>
         */
        KIT_MEDICAL,
        /**
         * The solid kiwi-bird icon.See <a href='https://fontawesome.com/v6/icons/kiwi-bird?s=solid'>example</a>
         */
        KIWI_BIRD,
        /**
         * The solid l icon.See <a href='https://fontawesome.com/v6/icons/l?s=solid'>example</a>
         */
        L,
        /**
         * The solid landmark icon.See <a href='https://fontawesome.com/v6/icons/landmark?s=solid'>example</a>
         */
        LANDMARK,
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
         * The solid laptop-medical icon.See <a href='https://fontawesome.com/v6/icons/laptop-medical?s=solid'>example</a>
         */
        LAPTOP_MEDICAL,
        /**
         * The solid lari-sign icon.See <a href='https://fontawesome.com/v6/icons/lari-sign?s=solid'>example</a>
         */
        LARI_SIGN,
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
         * The solid life-ring icon.See <a href='https://fontawesome.com/v6/icons/life-ring?s=solid'>example</a>
         */
        LIFE_RING,
        /**
         * The solid lightbulb icon.See <a href='https://fontawesome.com/v6/icons/lightbulb?s=solid'>example</a>
         */
        LIGHTBULB,
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
         * The solid list-check icon.See <a href='https://fontawesome.com/v6/icons/list-check?s=solid'>example</a>
         */
        LIST_CHECK,
        /**
         * The solid list-ol icon.See <a href='https://fontawesome.com/v6/icons/list-ol?s=solid'>example</a>
         */
        LIST_OL,
        /**
         * The solid list-ul icon.See <a href='https://fontawesome.com/v6/icons/list-ul?s=solid'>example</a>
         */
        LIST_UL,
        /**
         * The solid litecoin-sign icon.See <a href='https://fontawesome.com/v6/icons/litecoin-sign?s=solid'>example</a>
         */
        LITECOIN_SIGN,
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
         * The solid lock icon.See <a href='https://fontawesome.com/v6/icons/lock?s=solid'>example</a>
         */
        LOCK,
        /**
         * The solid lock-open icon.See <a href='https://fontawesome.com/v6/icons/lock-open?s=solid'>example</a>
         */
        LOCK_OPEN,
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
         * The solid magnet icon.See <a href='https://fontawesome.com/v6/icons/magnet?s=solid'>example</a>
         */
        MAGNET,
        /**
         * The solid magnifying-glass icon.See <a href='https://fontawesome.com/v6/icons/magnifying-glass?s=solid'>example</a>
         */
        MAGNIFYING_GLASS,
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
         * The solid map-pin icon.See <a href='https://fontawesome.com/v6/icons/map-pin?s=solid'>example</a>
         */
        MAP_PIN,
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
         * The solid mars-double icon.See <a href='https://fontawesome.com/v6/icons/mars-double?s=solid'>example</a>
         */
        MARS_DOUBLE,
        /**
         * The solid mars-stroke icon.See <a href='https://fontawesome.com/v6/icons/mars-stroke?s=solid'>example</a>
         */
        MARS_STROKE,
        /**
         * The solid mars-stroke-right icon.See <a href='https://fontawesome.com/v6/icons/mars-stroke-right?s=solid'>example</a>
         */
        MARS_STROKE_RIGHT,
        /**
         * The solid mars-stroke-up icon.See <a href='https://fontawesome.com/v6/icons/mars-stroke-up?s=solid'>example</a>
         */
        MARS_STROKE_UP,
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
         * The solid masks-theater icon.See <a href='https://fontawesome.com/v6/icons/masks-theater?s=solid'>example</a>
         */
        MASKS_THEATER,
        /**
         * The solid maximize icon.See <a href='https://fontawesome.com/v6/icons/maximize?s=solid'>example</a>
         */
        MAXIMIZE,
        /**
         * The solid medal icon.See <a href='https://fontawesome.com/v6/icons/medal?s=solid'>example</a>
         */
        MEDAL,
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
         * The solid mitten icon.See <a href='https://fontawesome.com/v6/icons/mitten?s=solid'>example</a>
         */
        MITTEN,
        /**
         * The solid mobile icon.See <a href='https://fontawesome.com/v6/icons/mobile?s=solid'>example</a>
         */
        MOBILE,
        /**
         * The solid mobile-button icon.See <a href='https://fontawesome.com/v6/icons/mobile-button?s=solid'>example</a>
         */
        MOBILE_BUTTON,
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
         * The solid money-bill-wave icon.See <a href='https://fontawesome.com/v6/icons/money-bill-wave?s=solid'>example</a>
         */
        MONEY_BILL_WAVE,
        /**
         * The solid money-check icon.See <a href='https://fontawesome.com/v6/icons/money-check?s=solid'>example</a>
         */
        MONEY_CHECK,
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
         * The solid mortar-pestle icon.See <a href='https://fontawesome.com/v6/icons/mortar-pestle?s=solid'>example</a>
         */
        MORTAR_PESTLE,
        /**
         * The solid mosque icon.See <a href='https://fontawesome.com/v6/icons/mosque?s=solid'>example</a>
         */
        MOSQUE,
        /**
         * The solid motorcycle icon.See <a href='https://fontawesome.com/v6/icons/motorcycle?s=solid'>example</a>
         */
        MOTORCYCLE,
        /**
         * The solid mountain icon.See <a href='https://fontawesome.com/v6/icons/mountain?s=solid'>example</a>
         */
        MOUNTAIN,
        /**
         * The solid mug-hot icon.See <a href='https://fontawesome.com/v6/icons/mug-hot?s=solid'>example</a>
         */
        MUG_HOT,
        /**
         * The solid mug-saucer icon.See <a href='https://fontawesome.com/v6/icons/mug-saucer?s=solid'>example</a>
         */
        MUG_SAUCER,
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
         * The solid passport icon.See <a href='https://fontawesome.com/v6/icons/passport?s=solid'>example</a>
         */
        PASSPORT,
        /**
         * The solid paste icon.See <a href='https://fontawesome.com/v6/icons/paste?s=solid'>example</a>
         */
        PASTE,
        /**
         * The solid pause icon.See <a href='https://fontawesome.com/v6/icons/pause?s=solid'>example</a>
         */
        PAUSE,
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
         * The solid pen-to-square icon.See <a href='https://fontawesome.com/v6/icons/pen-to-square?s=solid'>example</a>
         */
        PEN_TO_SQUARE,
        /**
         * The solid pencil icon.See <a href='https://fontawesome.com/v6/icons/pencil?s=solid'>example</a>
         */
        PENCIL,
        /**
         * The solid people-arrows-left-right icon.See <a href='https://fontawesome.com/v6/icons/people-arrows-left-right?s=solid'>example</a>
         */
        PEOPLE_ARROWS_LEFT_RIGHT,
        /**
         * The solid people-carry-box icon.See <a href='https://fontawesome.com/v6/icons/people-carry-box?s=solid'>example</a>
         */
        PEOPLE_CARRY_BOX,
        /**
         * The solid pepper-hot icon.See <a href='https://fontawesome.com/v6/icons/pepper-hot?s=solid'>example</a>
         */
        PEPPER_HOT,
        /**
         * The solid percent icon.See <a href='https://fontawesome.com/v6/icons/percent?s=solid'>example</a>
         */
        PERCENT,
        /**
         * The solid person icon.See <a href='https://fontawesome.com/v6/icons/person?s=solid'>example</a>
         */
        PERSON,
        /**
         * The solid person-biking icon.See <a href='https://fontawesome.com/v6/icons/person-biking?s=solid'>example</a>
         */
        PERSON_BIKING,
        /**
         * The solid person-booth icon.See <a href='https://fontawesome.com/v6/icons/person-booth?s=solid'>example</a>
         */
        PERSON_BOOTH,
        /**
         * The solid person-dots-from-line icon.See <a href='https://fontawesome.com/v6/icons/person-dots-from-line?s=solid'>example</a>
         */
        PERSON_DOTS_FROM_LINE,
        /**
         * The solid person-dress icon.See <a href='https://fontawesome.com/v6/icons/person-dress?s=solid'>example</a>
         */
        PERSON_DRESS,
        /**
         * The solid person-hiking icon.See <a href='https://fontawesome.com/v6/icons/person-hiking?s=solid'>example</a>
         */
        PERSON_HIKING,
        /**
         * The solid person-praying icon.See <a href='https://fontawesome.com/v6/icons/person-praying?s=solid'>example</a>
         */
        PERSON_PRAYING,
        /**
         * The solid person-running icon.See <a href='https://fontawesome.com/v6/icons/person-running?s=solid'>example</a>
         */
        PERSON_RUNNING,
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
         * The solid person-walking icon.See <a href='https://fontawesome.com/v6/icons/person-walking?s=solid'>example</a>
         */
        PERSON_WALKING,
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
         * The solid phone-flip icon.See <a href='https://fontawesome.com/v6/icons/phone-flip?s=solid'>example</a>
         */
        PHONE_FLIP,
        /**
         * The solid phone-slash icon.See <a href='https://fontawesome.com/v6/icons/phone-slash?s=solid'>example</a>
         */
        PHONE_SLASH,
        /**
         * The solid phone-volume icon.See <a href='https://fontawesome.com/v6/icons/phone-volume?s=solid'>example</a>
         */
        PHONE_VOLUME,
        /**
         * The solid photo-film icon.See <a href='https://fontawesome.com/v6/icons/photo-film?s=solid'>example</a>
         */
        PHOTO_FILM,
        /**
         * The solid piggy-bank icon.See <a href='https://fontawesome.com/v6/icons/piggy-bank?s=solid'>example</a>
         */
        PIGGY_BANK,
        /**
         * The solid pills icon.See <a href='https://fontawesome.com/v6/icons/pills?s=solid'>example</a>
         */
        PILLS,
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
         * The solid plane-departure icon.See <a href='https://fontawesome.com/v6/icons/plane-departure?s=solid'>example</a>
         */
        PLANE_DEPARTURE,
        /**
         * The solid plane-slash icon.See <a href='https://fontawesome.com/v6/icons/plane-slash?s=solid'>example</a>
         */
        PLANE_SLASH,
        /**
         * The solid play icon.See <a href='https://fontawesome.com/v6/icons/play?s=solid'>example</a>
         */
        PLAY,
        /**
         * The solid plug icon.See <a href='https://fontawesome.com/v6/icons/plug?s=solid'>example</a>
         */
        PLUG,
        /**
         * The solid plus icon.See <a href='https://fontawesome.com/v6/icons/plus?s=solid'>example</a>
         */
        PLUS,
        /**
         * The solid plus-minus icon.See <a href='https://fontawesome.com/v6/icons/plus-minus?s=solid'>example</a>
         */
        PLUS_MINUS,
        /**
         * The solid podcast icon.See <a href='https://fontawesome.com/v6/icons/podcast?s=solid'>example</a>
         */
        PODCAST,
        /**
         * The solid poo icon.See <a href='https://fontawesome.com/v6/icons/poo?s=solid'>example</a>
         */
        POO,
        /**
         * The solid poo-storm icon.See <a href='https://fontawesome.com/v6/icons/poo-storm?s=solid'>example</a>
         */
        POO_STORM,
        /**
         * The solid poop icon.See <a href='https://fontawesome.com/v6/icons/poop?s=solid'>example</a>
         */
        POOP,
        /**
         * The solid power-off icon.See <a href='https://fontawesome.com/v6/icons/power-off?s=solid'>example</a>
         */
        POWER_OFF,
        /**
         * The solid prescription icon.See <a href='https://fontawesome.com/v6/icons/prescription?s=solid'>example</a>
         */
        PRESCRIPTION,
        /**
         * The solid prescription-bottle icon.See <a href='https://fontawesome.com/v6/icons/prescription-bottle?s=solid'>example</a>
         */
        PRESCRIPTION_BOTTLE,
        /**
         * The solid prescription-bottle-medical icon.See <a href='https://fontawesome.com/v6/icons/prescription-bottle-medical?s=solid'>example</a>
         */
        PRESCRIPTION_BOTTLE_MEDICAL,
        /**
         * The solid print icon.See <a href='https://fontawesome.com/v6/icons/print?s=solid'>example</a>
         */
        PRINT,
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
         * The solid quote-left icon.See <a href='https://fontawesome.com/v6/icons/quote-left?s=solid'>example</a>
         */
        QUOTE_LEFT,
        /**
         * The solid quote-right icon.See <a href='https://fontawesome.com/v6/icons/quote-right?s=solid'>example</a>
         */
        QUOTE_RIGHT,
        /**
         * The solid r icon.See <a href='https://fontawesome.com/v6/icons/r?s=solid'>example</a>
         */
        R,
        /**
         * The solid radiation icon.See <a href='https://fontawesome.com/v6/icons/radiation?s=solid'>example</a>
         */
        RADIATION,
        /**
         * The solid rainbow icon.See <a href='https://fontawesome.com/v6/icons/rainbow?s=solid'>example</a>
         */
        RAINBOW,
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
         * The solid rectangle-xmark icon.See <a href='https://fontawesome.com/v6/icons/rectangle-xmark?s=solid'>example</a>
         */
        RECTANGLE_XMARK,
        /**
         * The solid recycle icon.See <a href='https://fontawesome.com/v6/icons/recycle?s=solid'>example</a>
         */
        RECYCLE,
        /**
         * The solid registered icon.See <a href='https://fontawesome.com/v6/icons/registered?s=solid'>example</a>
         */
        REGISTERED,
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
         * The solid road icon.See <a href='https://fontawesome.com/v6/icons/road?s=solid'>example</a>
         */
        ROAD,
        /**
         * The solid robot icon.See <a href='https://fontawesome.com/v6/icons/robot?s=solid'>example</a>
         */
        ROBOT,
        /**
         * The solid rocket icon.See <a href='https://fontawesome.com/v6/icons/rocket?s=solid'>example</a>
         */
        ROCKET,
        /**
         * The solid rotate icon.See <a href='https://fontawesome.com/v6/icons/rotate?s=solid'>example</a>
         */
        ROTATE,
        /**
         * The solid rotate-left icon.See <a href='https://fontawesome.com/v6/icons/rotate-left?s=solid'>example</a>
         */
        ROTATE_LEFT,
        /**
         * The solid rotate-right icon.See <a href='https://fontawesome.com/v6/icons/rotate-right?s=solid'>example</a>
         */
        ROTATE_RIGHT,
        /**
         * The solid route icon.See <a href='https://fontawesome.com/v6/icons/route?s=solid'>example</a>
         */
        ROUTE,
        /**
         * The solid rss icon.See <a href='https://fontawesome.com/v6/icons/rss?s=solid'>example</a>
         */
        RSS,
        /**
         * The solid ruble-sign icon.See <a href='https://fontawesome.com/v6/icons/ruble-sign?s=solid'>example</a>
         */
        RUBLE_SIGN,
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
         * The solid share-from-square icon.See <a href='https://fontawesome.com/v6/icons/share-from-square?s=solid'>example</a>
         */
        SHARE_FROM_SQUARE,
        /**
         * The solid share-nodes icon.See <a href='https://fontawesome.com/v6/icons/share-nodes?s=solid'>example</a>
         */
        SHARE_NODES,
        /**
         * The solid shekel-sign icon.See <a href='https://fontawesome.com/v6/icons/shekel-sign?s=solid'>example</a>
         */
        SHEKEL_SIGN,
        /**
         * The solid shield icon.See <a href='https://fontawesome.com/v6/icons/shield?s=solid'>example</a>
         */
        SHIELD,
        /**
         * The solid shield-blank icon.See <a href='https://fontawesome.com/v6/icons/shield-blank?s=solid'>example</a>
         */
        SHIELD_BLANK,
        /**
         * The solid shield-virus icon.See <a href='https://fontawesome.com/v6/icons/shield-virus?s=solid'>example</a>
         */
        SHIELD_VIRUS,
        /**
         * The solid ship icon.See <a href='https://fontawesome.com/v6/icons/ship?s=solid'>example</a>
         */
        SHIP,
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
         * The solid shop-slash icon.See <a href='https://fontawesome.com/v6/icons/shop-slash?s=solid'>example</a>
         */
        SHOP_SLASH,
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
         * The solid sign-hanging icon.See <a href='https://fontawesome.com/v6/icons/sign-hanging?s=solid'>example</a>
         */
        SIGN_HANGING,
        /**
         * The solid signal icon.See <a href='https://fontawesome.com/v6/icons/signal?s=solid'>example</a>
         */
        SIGNAL,
        /**
         * The solid signature icon.See <a href='https://fontawesome.com/v6/icons/signature?s=solid'>example</a>
         */
        SIGNATURE,
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
         * The solid smog icon.See <a href='https://fontawesome.com/v6/icons/smog?s=solid'>example</a>
         */
        SMOG,
        /**
         * The solid smoking icon.See <a href='https://fontawesome.com/v6/icons/smoking?s=solid'>example</a>
         */
        SMOKING,
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
         * The solid sort-down icon.See <a href='https://fontawesome.com/v6/icons/sort-down?s=solid'>example</a>
         */
        SORT_DOWN,
        /**
         * The solid sort-up icon.See <a href='https://fontawesome.com/v6/icons/sort-up?s=solid'>example</a>
         */
        SORT_UP,
        /**
         * The solid spa icon.See <a href='https://fontawesome.com/v6/icons/spa?s=solid'>example</a>
         */
        SPA,
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
         * The solid square-parking icon.See <a href='https://fontawesome.com/v6/icons/square-parking?s=solid'>example</a>
         */
        SQUARE_PARKING,
        /**
         * The solid square-pen icon.See <a href='https://fontawesome.com/v6/icons/square-pen?s=solid'>example</a>
         */
        SQUARE_PEN,
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
         * The solid square-xmark icon.See <a href='https://fontawesome.com/v6/icons/square-xmark?s=solid'>example</a>
         */
        SQUARE_XMARK,
        /**
         * The solid stairs icon.See <a href='https://fontawesome.com/v6/icons/stairs?s=solid'>example</a>
         */
        STAIRS,
        /**
         * The solid stamp icon.See <a href='https://fontawesome.com/v6/icons/stamp?s=solid'>example</a>
         */
        STAMP,
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
         * The solid sterling-sign icon.See <a href='https://fontawesome.com/v6/icons/sterling-sign?s=solid'>example</a>
         */
        STERLING_SIGN,
        /**
         * The solid stethoscope icon.See <a href='https://fontawesome.com/v6/icons/stethoscope?s=solid'>example</a>
         */
        STETHOSCOPE,
        /**
         * The solid stop icon.See <a href='https://fontawesome.com/v6/icons/stop?s=solid'>example</a>
         */
        STOP,
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
         * The solid store-slash icon.See <a href='https://fontawesome.com/v6/icons/store-slash?s=solid'>example</a>
         */
        STORE_SLASH,
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
         * The solid superscript icon.See <a href='https://fontawesome.com/v6/icons/superscript?s=solid'>example</a>
         */
        SUPERSCRIPT,
        /**
         * The solid swatchbook icon.See <a href='https://fontawesome.com/v6/icons/swatchbook?s=solid'>example</a>
         */
        SWATCHBOOK,
        /**
         * The solid synagogue icon.See <a href='https://fontawesome.com/v6/icons/synagogue?s=solid'>example</a>
         */
        SYNAGOGUE,
        /**
         * The solid syringe icon.See <a href='https://fontawesome.com/v6/icons/syringe?s=solid'>example</a>
         */
        SYRINGE,
        /**
         * The solid t icon.See <a href='https://fontawesome.com/v6/icons/t?s=solid'>example</a>
         */
        T,
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
         * The solid table-tennis-paddle-ball icon.See <a href='https://fontawesome.com/v6/icons/table-tennis-paddle-ball?s=solid'>example</a>
         */
        TABLE_TENNIS_PADDLE_BALL,
        /**
         * The solid tablet icon.See <a href='https://fontawesome.com/v6/icons/tablet?s=solid'>example</a>
         */
        TABLET,
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
         * The solid tag icon.See <a href='https://fontawesome.com/v6/icons/tag?s=solid'>example</a>
         */
        TAG,
        /**
         * The solid tags icon.See <a href='https://fontawesome.com/v6/icons/tags?s=solid'>example</a>
         */
        TAGS,
        /**
         * The solid tape icon.See <a href='https://fontawesome.com/v6/icons/tape?s=solid'>example</a>
         */
        TAPE,
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
         * The solid tenge-sign icon.See <a href='https://fontawesome.com/v6/icons/tenge-sign?s=solid'>example</a>
         */
        TENGE_SIGN,
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
         * The solid thermometer icon.See <a href='https://fontawesome.com/v6/icons/thermometer?s=solid'>example</a>
         */
        THERMOMETER,
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
         * The solid ticket icon.See <a href='https://fontawesome.com/v6/icons/ticket?s=solid'>example</a>
         */
        TICKET,
        /**
         * The solid ticket-simple icon.See <a href='https://fontawesome.com/v6/icons/ticket-simple?s=solid'>example</a>
         */
        TICKET_SIMPLE,
        /**
         * The solid timeline icon.See <a href='https://fontawesome.com/v6/icons/timeline?s=solid'>example</a>
         */
        TIMELINE,
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
         * The solid toolbox icon.See <a href='https://fontawesome.com/v6/icons/toolbox?s=solid'>example</a>
         */
        TOOLBOX,
        /**
         * The solid tooth icon.See <a href='https://fontawesome.com/v6/icons/tooth?s=solid'>example</a>
         */
        TOOTH,
        /**
         * The solid torii-gate icon.See <a href='https://fontawesome.com/v6/icons/torii-gate?s=solid'>example</a>
         */
        TORII_GATE,
        /**
         * The solid tower-broadcast icon.See <a href='https://fontawesome.com/v6/icons/tower-broadcast?s=solid'>example</a>
         */
        TOWER_BROADCAST,
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
         * The solid transgender icon.See <a href='https://fontawesome.com/v6/icons/transgender?s=solid'>example</a>
         */
        TRANSGENDER,
        /**
         * The solid trash icon.See <a href='https://fontawesome.com/v6/icons/trash?s=solid'>example</a>
         */
        TRASH,
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
         * The solid tree icon.See <a href='https://fontawesome.com/v6/icons/tree?s=solid'>example</a>
         */
        TREE,
        /**
         * The solid triangle-exclamation icon.See <a href='https://fontawesome.com/v6/icons/triangle-exclamation?s=solid'>example</a>
         */
        TRIANGLE_EXCLAMATION,
        /**
         * The solid trophy icon.See <a href='https://fontawesome.com/v6/icons/trophy?s=solid'>example</a>
         */
        TROPHY,
        /**
         * The solid truck icon.See <a href='https://fontawesome.com/v6/icons/truck?s=solid'>example</a>
         */
        TRUCK,
        /**
         * The solid truck-fast icon.See <a href='https://fontawesome.com/v6/icons/truck-fast?s=solid'>example</a>
         */
        TRUCK_FAST,
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
         * The solid truck-ramp-box icon.See <a href='https://fontawesome.com/v6/icons/truck-ramp-box?s=solid'>example</a>
         */
        TRUCK_RAMP_BOX,
        /**
         * The solid tty icon.See <a href='https://fontawesome.com/v6/icons/tty?s=solid'>example</a>
         */
        TTY,
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
         * The solid universal-access icon.See <a href='https://fontawesome.com/v6/icons/universal-access?s=solid'>example</a>
         */
        UNIVERSAL_ACCESS,
        /**
         * The solid unlock icon.See <a href='https://fontawesome.com/v6/icons/unlock?s=solid'>example</a>
         */
        UNLOCK,
        /**
         * The solid unlock-keyhole icon.See <a href='https://fontawesome.com/v6/icons/unlock-keyhole?s=solid'>example</a>
         */
        UNLOCK_KEYHOLE,
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
         * The solid user icon.See <a href='https://fontawesome.com/v6/icons/user?s=solid'>example</a>
         */
        USER,
        /**
         * The solid user-astronaut icon.See <a href='https://fontawesome.com/v6/icons/user-astronaut?s=solid'>example</a>
         */
        USER_ASTRONAUT,
        /**
         * The solid user-check icon.See <a href='https://fontawesome.com/v6/icons/user-check?s=solid'>example</a>
         */
        USER_CHECK,
        /**
         * The solid user-clock icon.See <a href='https://fontawesome.com/v6/icons/user-clock?s=solid'>example</a>
         */
        USER_CLOCK,
        /**
         * The solid user-doctor icon.See <a href='https://fontawesome.com/v6/icons/user-doctor?s=solid'>example</a>
         */
        USER_DOCTOR,
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
         * The solid user-xmark icon.See <a href='https://fontawesome.com/v6/icons/user-xmark?s=solid'>example</a>
         */
        USER_XMARK,
        /**
         * The solid users icon.See <a href='https://fontawesome.com/v6/icons/users?s=solid'>example</a>
         */
        USERS,
        /**
         * The solid users-gear icon.See <a href='https://fontawesome.com/v6/icons/users-gear?s=solid'>example</a>
         */
        USERS_GEAR,
        /**
         * The solid users-slash icon.See <a href='https://fontawesome.com/v6/icons/users-slash?s=solid'>example</a>
         */
        USERS_SLASH,
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
         * The solid vials icon.See <a href='https://fontawesome.com/v6/icons/vials?s=solid'>example</a>
         */
        VIALS,
        /**
         * The solid video icon.See <a href='https://fontawesome.com/v6/icons/video?s=solid'>example</a>
         */
        VIDEO,
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
         * The solid volleyball icon.See <a href='https://fontawesome.com/v6/icons/volleyball?s=solid'>example</a>
         */
        VOLLEYBALL,
        /**
         * The solid volume-high icon.See <a href='https://fontawesome.com/v6/icons/volume-high?s=solid'>example</a>
         */
        VOLUME_HIGH,
        /**
         * The solid volume-low icon.See <a href='https://fontawesome.com/v6/icons/volume-low?s=solid'>example</a>
         */
        VOLUME_LOW,
        /**
         * The solid volume-off icon.See <a href='https://fontawesome.com/v6/icons/volume-off?s=solid'>example</a>
         */
        VOLUME_OFF,
        /**
         * The solid volume-xmark icon.See <a href='https://fontawesome.com/v6/icons/volume-xmark?s=solid'>example</a>
         */
        VOLUME_XMARK,
        /**
         * The solid vr-cardboard icon.See <a href='https://fontawesome.com/v6/icons/vr-cardboard?s=solid'>example</a>
         */
        VR_CARDBOARD,
        /**
         * The solid w icon.See <a href='https://fontawesome.com/v6/icons/w?s=solid'>example</a>
         */
        W,
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
         * The solid weight-hanging icon.See <a href='https://fontawesome.com/v6/icons/weight-hanging?s=solid'>example</a>
         */
        WEIGHT_HANGING,
        /**
         * The solid weight-scale icon.See <a href='https://fontawesome.com/v6/icons/weight-scale?s=solid'>example</a>
         */
        WEIGHT_SCALE,
        /**
         * The solid wheelchair icon.See <a href='https://fontawesome.com/v6/icons/wheelchair?s=solid'>example</a>
         */
        WHEELCHAIR,
        /**
         * The solid whiskey-glass icon.See <a href='https://fontawesome.com/v6/icons/whiskey-glass?s=solid'>example</a>
         */
        WHISKEY_GLASS,
        /**
         * The solid wifi icon.See <a href='https://fontawesome.com/v6/icons/wifi?s=solid'>example</a>
         */
        WIFI,
        /**
         * The solid wind icon.See <a href='https://fontawesome.com/v6/icons/wind?s=solid'>example</a>
         */
        WIND,
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
         * The solid wine-glass-empty icon.See <a href='https://fontawesome.com/v6/icons/wine-glass-empty?s=solid'>example</a>
         */
        WINE_GLASS_EMPTY,
        /**
         * The solid won-sign icon.See <a href='https://fontawesome.com/v6/icons/won-sign?s=solid'>example</a>
         */
        WON_SIGN,
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
         * The solid y icon.See <a href='https://fontawesome.com/v6/icons/y?s=solid'>example</a>
         */
        Y,
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
        Z;

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
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "3.0.0")
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
         * The brands slideshare icon.See <a href='https://fontawesome.com/v6/icons/slideshare?s=brands'>example</a>
         */
        SLIDESHARE,
        /**
         * The brands snapchat icon.See <a href='https://fontawesome.com/v6/icons/snapchat?s=brands'>example</a>
         */
        SNAPCHAT,
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
         * The brands square-font-awesome icon.See <a href='https://fontawesome.com/v6/icons/square-font-awesome?s=brands'>example</a>
         */
        SQUARE_FONT_AWESOME,
        /**
         * The brands square-font-awesome-stroke icon.See <a href='https://fontawesome.com/v6/icons/square-font-awesome-stroke?s=brands'>example</a>
         */
        SQUARE_FONT_AWESOME_STROKE,
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
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "3.0.0")
        @SuppressWarnings("serial")
        public static final class Icon extends IronIcon implements ClickNotifier<IronIcon> {

            Icon(String icon) {
                super(ICONSET, icon);
            }
        }
    }
}
