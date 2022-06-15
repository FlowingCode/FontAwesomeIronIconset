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
     * These instances can be used to create {@link Icon} components either by using
     * their {@link #create()} method or by passing them to Icon's constructor.
     *
     * @author Javier Godoy / Flowing Code
     */
    public enum Regular {

        /**
         * The regular address-book icon.See <a href='https://fontawesome.com/v6.0/icons/address-book'>example</a>
         */
        ADDRESS_BOOK,
        /**
         * The regular address-card icon.See <a href='https://fontawesome.com/v6.0/icons/address-card'>example</a>
         */
        ADDRESS_CARD,
        /**
         * The regular bell icon.See <a href='https://fontawesome.com/v6.0/icons/bell'>example</a>
         */
        BELL,
        /**
         * The regular bell-slash icon.See <a href='https://fontawesome.com/v6.0/icons/bell-slash'>example</a>
         */
        BELL_SLASH,
        /**
         * The regular bookmark icon.See <a href='https://fontawesome.com/v6.0/icons/bookmark'>example</a>
         */
        BOOKMARK,
        /**
         * The regular building icon.See <a href='https://fontawesome.com/v6.0/icons/building'>example</a>
         */
        BUILDING,
        /**
         * The regular calendar icon.See <a href='https://fontawesome.com/v6.0/icons/calendar'>example</a>
         */
        CALENDAR,
        /**
         * The regular calendar-check icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-check'>example</a>
         */
        CALENDAR_CHECK,
        /**
         * The regular calendar-days icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-days'>example</a>
         */
        CALENDAR_DAYS,
        /**
         * The regular calendar-minus icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-minus'>example</a>
         */
        CALENDAR_MINUS,
        /**
         * The regular calendar-plus icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-plus'>example</a>
         */
        CALENDAR_PLUS,
        /**
         * The regular calendar-xmark icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-xmark'>example</a>
         */
        CALENDAR_XMARK,
        /**
         * The regular chart-bar icon.See <a href='https://fontawesome.com/v6.0/icons/chart-bar'>example</a>
         */
        CHART_BAR,
        /**
         * The regular chess-bishop icon.See <a href='https://fontawesome.com/v6.0/icons/chess-bishop'>example</a>
         */
        CHESS_BISHOP,
        /**
         * The regular chess-king icon.See <a href='https://fontawesome.com/v6.0/icons/chess-king'>example</a>
         */
        CHESS_KING,
        /**
         * The regular chess-knight icon.See <a href='https://fontawesome.com/v6.0/icons/chess-knight'>example</a>
         */
        CHESS_KNIGHT,
        /**
         * The regular chess-pawn icon.See <a href='https://fontawesome.com/v6.0/icons/chess-pawn'>example</a>
         */
        CHESS_PAWN,
        /**
         * The regular chess-queen icon.See <a href='https://fontawesome.com/v6.0/icons/chess-queen'>example</a>
         */
        CHESS_QUEEN,
        /**
         * The regular chess-rook icon.See <a href='https://fontawesome.com/v6.0/icons/chess-rook'>example</a>
         */
        CHESS_ROOK,
        /**
         * The regular circle icon.See <a href='https://fontawesome.com/v6.0/icons/circle'>example</a>
         */
        CIRCLE,
        /**
         * The regular circle-check icon.See <a href='https://fontawesome.com/v6.0/icons/circle-check'>example</a>
         */
        CIRCLE_CHECK,
        /**
         * The regular circle-dot icon.See <a href='https://fontawesome.com/v6.0/icons/circle-dot'>example</a>
         */
        CIRCLE_DOT,
        /**
         * The regular circle-down icon.See <a href='https://fontawesome.com/v6.0/icons/circle-down'>example</a>
         */
        CIRCLE_DOWN,
        /**
         * The regular circle-left icon.See <a href='https://fontawesome.com/v6.0/icons/circle-left'>example</a>
         */
        CIRCLE_LEFT,
        /**
         * The regular circle-pause icon.See <a href='https://fontawesome.com/v6.0/icons/circle-pause'>example</a>
         */
        CIRCLE_PAUSE,
        /**
         * The regular circle-play icon.See <a href='https://fontawesome.com/v6.0/icons/circle-play'>example</a>
         */
        CIRCLE_PLAY,
        /**
         * The regular circle-question icon.See <a href='https://fontawesome.com/v6.0/icons/circle-question'>example</a>
         */
        CIRCLE_QUESTION,
        /**
         * The regular circle-right icon.See <a href='https://fontawesome.com/v6.0/icons/circle-right'>example</a>
         */
        CIRCLE_RIGHT,
        /**
         * The regular circle-stop icon.See <a href='https://fontawesome.com/v6.0/icons/circle-stop'>example</a>
         */
        CIRCLE_STOP,
        /**
         * The regular circle-up icon.See <a href='https://fontawesome.com/v6.0/icons/circle-up'>example</a>
         */
        CIRCLE_UP,
        /**
         * The regular circle-user icon.See <a href='https://fontawesome.com/v6.0/icons/circle-user'>example</a>
         */
        CIRCLE_USER,
        /**
         * The regular circle-xmark icon.See <a href='https://fontawesome.com/v6.0/icons/circle-xmark'>example</a>
         */
        CIRCLE_XMARK,
        /**
         * The regular clipboard icon.See <a href='https://fontawesome.com/v6.0/icons/clipboard'>example</a>
         */
        CLIPBOARD,
        /**
         * The regular clock icon.See <a href='https://fontawesome.com/v6.0/icons/clock'>example</a>
         */
        CLOCK,
        /**
         * The regular clone icon.See <a href='https://fontawesome.com/v6.0/icons/clone'>example</a>
         */
        CLONE,
        /**
         * The regular closed-captioning icon.See <a href='https://fontawesome.com/v6.0/icons/closed-captioning'>example</a>
         */
        CLOSED_CAPTIONING,
        /**
         * The regular comment icon.See <a href='https://fontawesome.com/v6.0/icons/comment'>example</a>
         */
        COMMENT,
        /**
         * The regular comment-dots icon.See <a href='https://fontawesome.com/v6.0/icons/comment-dots'>example</a>
         */
        COMMENT_DOTS,
        /**
         * The regular comments icon.See <a href='https://fontawesome.com/v6.0/icons/comments'>example</a>
         */
        COMMENTS,
        /**
         * The regular compass icon.See <a href='https://fontawesome.com/v6.0/icons/compass'>example</a>
         */
        COMPASS,
        /**
         * The regular copy icon.See <a href='https://fontawesome.com/v6.0/icons/copy'>example</a>
         */
        COPY,
        /**
         * The regular copyright icon.See <a href='https://fontawesome.com/v6.0/icons/copyright'>example</a>
         */
        COPYRIGHT,
        /**
         * The regular credit-card icon.See <a href='https://fontawesome.com/v6.0/icons/credit-card'>example</a>
         */
        CREDIT_CARD,
        /**
         * The regular envelope icon.See <a href='https://fontawesome.com/v6.0/icons/envelope'>example</a>
         */
        ENVELOPE,
        /**
         * The regular envelope-open icon.See <a href='https://fontawesome.com/v6.0/icons/envelope-open'>example</a>
         */
        ENVELOPE_OPEN,
        /**
         * The regular eye icon.See <a href='https://fontawesome.com/v6.0/icons/eye'>example</a>
         */
        EYE,
        /**
         * The regular eye-slash icon.See <a href='https://fontawesome.com/v6.0/icons/eye-slash'>example</a>
         */
        EYE_SLASH,
        /**
         * The regular face-angry icon.See <a href='https://fontawesome.com/v6.0/icons/face-angry'>example</a>
         */
        FACE_ANGRY,
        /**
         * The regular face-dizzy icon.See <a href='https://fontawesome.com/v6.0/icons/face-dizzy'>example</a>
         */
        FACE_DIZZY,
        /**
         * The regular face-flushed icon.See <a href='https://fontawesome.com/v6.0/icons/face-flushed'>example</a>
         */
        FACE_FLUSHED,
        /**
         * The regular face-frown icon.See <a href='https://fontawesome.com/v6.0/icons/face-frown'>example</a>
         */
        FACE_FROWN,
        /**
         * The regular face-frown-open icon.See <a href='https://fontawesome.com/v6.0/icons/face-frown-open'>example</a>
         */
        FACE_FROWN_OPEN,
        /**
         * The regular face-grimace icon.See <a href='https://fontawesome.com/v6.0/icons/face-grimace'>example</a>
         */
        FACE_GRIMACE,
        /**
         * The regular face-grin icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin'>example</a>
         */
        FACE_GRIN,
        /**
         * The regular face-grin-beam icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-beam'>example</a>
         */
        FACE_GRIN_BEAM,
        /**
         * The regular face-grin-beam-sweat icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-beam-sweat'>example</a>
         */
        FACE_GRIN_BEAM_SWEAT,
        /**
         * The regular face-grin-hearts icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-hearts'>example</a>
         */
        FACE_GRIN_HEARTS,
        /**
         * The regular face-grin-squint icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-squint'>example</a>
         */
        FACE_GRIN_SQUINT,
        /**
         * The regular face-grin-squint-tears icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-squint-tears'>example</a>
         */
        FACE_GRIN_SQUINT_TEARS,
        /**
         * The regular face-grin-stars icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-stars'>example</a>
         */
        FACE_GRIN_STARS,
        /**
         * The regular face-grin-tears icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-tears'>example</a>
         */
        FACE_GRIN_TEARS,
        /**
         * The regular face-grin-tongue icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-tongue'>example</a>
         */
        FACE_GRIN_TONGUE,
        /**
         * The regular face-grin-tongue-squint icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-tongue-squint'>example</a>
         */
        FACE_GRIN_TONGUE_SQUINT,
        /**
         * The regular face-grin-tongue-wink icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-tongue-wink'>example</a>
         */
        FACE_GRIN_TONGUE_WINK,
        /**
         * The regular face-grin-wide icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-wide'>example</a>
         */
        FACE_GRIN_WIDE,
        /**
         * The regular face-grin-wink icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-wink'>example</a>
         */
        FACE_GRIN_WINK,
        /**
         * The regular face-kiss icon.See <a href='https://fontawesome.com/v6.0/icons/face-kiss'>example</a>
         */
        FACE_KISS,
        /**
         * The regular face-kiss-beam icon.See <a href='https://fontawesome.com/v6.0/icons/face-kiss-beam'>example</a>
         */
        FACE_KISS_BEAM,
        /**
         * The regular face-kiss-wink-heart icon.See <a href='https://fontawesome.com/v6.0/icons/face-kiss-wink-heart'>example</a>
         */
        FACE_KISS_WINK_HEART,
        /**
         * The regular face-laugh icon.See <a href='https://fontawesome.com/v6.0/icons/face-laugh'>example</a>
         */
        FACE_LAUGH,
        /**
         * The regular face-laugh-beam icon.See <a href='https://fontawesome.com/v6.0/icons/face-laugh-beam'>example</a>
         */
        FACE_LAUGH_BEAM,
        /**
         * The regular face-laugh-squint icon.See <a href='https://fontawesome.com/v6.0/icons/face-laugh-squint'>example</a>
         */
        FACE_LAUGH_SQUINT,
        /**
         * The regular face-laugh-wink icon.See <a href='https://fontawesome.com/v6.0/icons/face-laugh-wink'>example</a>
         */
        FACE_LAUGH_WINK,
        /**
         * The regular face-meh icon.See <a href='https://fontawesome.com/v6.0/icons/face-meh'>example</a>
         */
        FACE_MEH,
        /**
         * The regular face-meh-blank icon.See <a href='https://fontawesome.com/v6.0/icons/face-meh-blank'>example</a>
         */
        FACE_MEH_BLANK,
        /**
         * The regular face-rolling-eyes icon.See <a href='https://fontawesome.com/v6.0/icons/face-rolling-eyes'>example</a>
         */
        FACE_ROLLING_EYES,
        /**
         * The regular face-sad-cry icon.See <a href='https://fontawesome.com/v6.0/icons/face-sad-cry'>example</a>
         */
        FACE_SAD_CRY,
        /**
         * The regular face-sad-tear icon.See <a href='https://fontawesome.com/v6.0/icons/face-sad-tear'>example</a>
         */
        FACE_SAD_TEAR,
        /**
         * The regular face-smile icon.See <a href='https://fontawesome.com/v6.0/icons/face-smile'>example</a>
         */
        FACE_SMILE,
        /**
         * The regular face-smile-beam icon.See <a href='https://fontawesome.com/v6.0/icons/face-smile-beam'>example</a>
         */
        FACE_SMILE_BEAM,
        /**
         * The regular face-smile-wink icon.See <a href='https://fontawesome.com/v6.0/icons/face-smile-wink'>example</a>
         */
        FACE_SMILE_WINK,
        /**
         * The regular face-surprise icon.See <a href='https://fontawesome.com/v6.0/icons/face-surprise'>example</a>
         */
        FACE_SURPRISE,
        /**
         * The regular face-tired icon.See <a href='https://fontawesome.com/v6.0/icons/face-tired'>example</a>
         */
        FACE_TIRED,
        /**
         * The regular file icon.See <a href='https://fontawesome.com/v6.0/icons/file'>example</a>
         */
        FILE,
        /**
         * The regular file-audio icon.See <a href='https://fontawesome.com/v6.0/icons/file-audio'>example</a>
         */
        FILE_AUDIO,
        /**
         * The regular file-code icon.See <a href='https://fontawesome.com/v6.0/icons/file-code'>example</a>
         */
        FILE_CODE,
        /**
         * The regular file-excel icon.See <a href='https://fontawesome.com/v6.0/icons/file-excel'>example</a>
         */
        FILE_EXCEL,
        /**
         * The regular file-image icon.See <a href='https://fontawesome.com/v6.0/icons/file-image'>example</a>
         */
        FILE_IMAGE,
        /**
         * The regular file-lines icon.See <a href='https://fontawesome.com/v6.0/icons/file-lines'>example</a>
         */
        FILE_LINES,
        /**
         * The regular file-pdf icon.See <a href='https://fontawesome.com/v6.0/icons/file-pdf'>example</a>
         */
        FILE_PDF,
        /**
         * The regular file-powerpoint icon.See <a href='https://fontawesome.com/v6.0/icons/file-powerpoint'>example</a>
         */
        FILE_POWERPOINT,
        /**
         * The regular file-video icon.See <a href='https://fontawesome.com/v6.0/icons/file-video'>example</a>
         */
        FILE_VIDEO,
        /**
         * The regular file-word icon.See <a href='https://fontawesome.com/v6.0/icons/file-word'>example</a>
         */
        FILE_WORD,
        /**
         * The regular file-zipper icon.See <a href='https://fontawesome.com/v6.0/icons/file-zipper'>example</a>
         */
        FILE_ZIPPER,
        /**
         * The regular flag icon.See <a href='https://fontawesome.com/v6.0/icons/flag'>example</a>
         */
        FLAG,
        /**
         * The regular floppy-disk icon.See <a href='https://fontawesome.com/v6.0/icons/floppy-disk'>example</a>
         */
        FLOPPY_DISK,
        /**
         * The regular folder icon.See <a href='https://fontawesome.com/v6.0/icons/folder'>example</a>
         */
        FOLDER,
        /**
         * The regular folder-open icon.See <a href='https://fontawesome.com/v6.0/icons/folder-open'>example</a>
         */
        FOLDER_OPEN,
        /**
         * The regular font-awesome icon.See <a href='https://fontawesome.com/v6.0/icons/font-awesome'>example</a>
         */
        FONT_AWESOME,
        /**
         * The regular futbol icon.See <a href='https://fontawesome.com/v6.0/icons/futbol'>example</a>
         */
        FUTBOL,
        /**
         * The regular gem icon.See <a href='https://fontawesome.com/v6.0/icons/gem'>example</a>
         */
        GEM,
        /**
         * The regular hand icon.See <a href='https://fontawesome.com/v6.0/icons/hand'>example</a>
         */
        HAND,
        /**
         * The regular hand-back-fist icon.See <a href='https://fontawesome.com/v6.0/icons/hand-back-fist'>example</a>
         */
        HAND_BACK_FIST,
        /**
         * The regular hand-lizard icon.See <a href='https://fontawesome.com/v6.0/icons/hand-lizard'>example</a>
         */
        HAND_LIZARD,
        /**
         * The regular hand-peace icon.See <a href='https://fontawesome.com/v6.0/icons/hand-peace'>example</a>
         */
        HAND_PEACE,
        /**
         * The regular hand-point-down icon.See <a href='https://fontawesome.com/v6.0/icons/hand-point-down'>example</a>
         */
        HAND_POINT_DOWN,
        /**
         * The regular hand-point-left icon.See <a href='https://fontawesome.com/v6.0/icons/hand-point-left'>example</a>
         */
        HAND_POINT_LEFT,
        /**
         * The regular hand-point-right icon.See <a href='https://fontawesome.com/v6.0/icons/hand-point-right'>example</a>
         */
        HAND_POINT_RIGHT,
        /**
         * The regular hand-point-up icon.See <a href='https://fontawesome.com/v6.0/icons/hand-point-up'>example</a>
         */
        HAND_POINT_UP,
        /**
         * The regular hand-pointer icon.See <a href='https://fontawesome.com/v6.0/icons/hand-pointer'>example</a>
         */
        HAND_POINTER,
        /**
         * The regular hand-scissors icon.See <a href='https://fontawesome.com/v6.0/icons/hand-scissors'>example</a>
         */
        HAND_SCISSORS,
        /**
         * The regular hand-spock icon.See <a href='https://fontawesome.com/v6.0/icons/hand-spock'>example</a>
         */
        HAND_SPOCK,
        /**
         * The regular handshake icon.See <a href='https://fontawesome.com/v6.0/icons/handshake'>example</a>
         */
        HANDSHAKE,
        /**
         * The regular hard-drive icon.See <a href='https://fontawesome.com/v6.0/icons/hard-drive'>example</a>
         */
        HARD_DRIVE,
        /**
         * The regular heart icon.See <a href='https://fontawesome.com/v6.0/icons/heart'>example</a>
         */
        HEART,
        /**
         * The regular hospital icon.See <a href='https://fontawesome.com/v6.0/icons/hospital'>example</a>
         */
        HOSPITAL,
        /**
         * The regular hourglass icon.See <a href='https://fontawesome.com/v6.0/icons/hourglass'>example</a>
         */
        HOURGLASS,
        /**
         * The regular id-badge icon.See <a href='https://fontawesome.com/v6.0/icons/id-badge'>example</a>
         */
        ID_BADGE,
        /**
         * The regular id-card icon.See <a href='https://fontawesome.com/v6.0/icons/id-card'>example</a>
         */
        ID_CARD,
        /**
         * The regular image icon.See <a href='https://fontawesome.com/v6.0/icons/image'>example</a>
         */
        IMAGE,
        /**
         * The regular images icon.See <a href='https://fontawesome.com/v6.0/icons/images'>example</a>
         */
        IMAGES,
        /**
         * The regular keyboard icon.See <a href='https://fontawesome.com/v6.0/icons/keyboard'>example</a>
         */
        KEYBOARD,
        /**
         * The regular lemon icon.See <a href='https://fontawesome.com/v6.0/icons/lemon'>example</a>
         */
        LEMON,
        /**
         * The regular life-ring icon.See <a href='https://fontawesome.com/v6.0/icons/life-ring'>example</a>
         */
        LIFE_RING,
        /**
         * The regular lightbulb icon.See <a href='https://fontawesome.com/v6.0/icons/lightbulb'>example</a>
         */
        LIGHTBULB,
        /**
         * The regular map icon.See <a href='https://fontawesome.com/v6.0/icons/map'>example</a>
         */
        MAP,
        /**
         * The regular message icon.See <a href='https://fontawesome.com/v6.0/icons/message'>example</a>
         */
        MESSAGE,
        /**
         * The regular money-bill-1 icon.See <a href='https://fontawesome.com/v6.0/icons/money-bill-1'>example</a>
         */
        MONEY_BILL_1,
        /**
         * The regular moon icon.See <a href='https://fontawesome.com/v6.0/icons/moon'>example</a>
         */
        MOON,
        /**
         * The regular newspaper icon.See <a href='https://fontawesome.com/v6.0/icons/newspaper'>example</a>
         */
        NEWSPAPER,
        /**
         * The regular note-sticky icon.See <a href='https://fontawesome.com/v6.0/icons/note-sticky'>example</a>
         */
        NOTE_STICKY,
        /**
         * The regular object-group icon.See <a href='https://fontawesome.com/v6.0/icons/object-group'>example</a>
         */
        OBJECT_GROUP,
        /**
         * The regular object-ungroup icon.See <a href='https://fontawesome.com/v6.0/icons/object-ungroup'>example</a>
         */
        OBJECT_UNGROUP,
        /**
         * The regular paper-plane icon.See <a href='https://fontawesome.com/v6.0/icons/paper-plane'>example</a>
         */
        PAPER_PLANE,
        /**
         * The regular paste icon.See <a href='https://fontawesome.com/v6.0/icons/paste'>example</a>
         */
        PASTE,
        /**
         * The regular pen-to-square icon.See <a href='https://fontawesome.com/v6.0/icons/pen-to-square'>example</a>
         */
        PEN_TO_SQUARE,
        /**
         * The regular rectangle-list icon.See <a href='https://fontawesome.com/v6.0/icons/rectangle-list'>example</a>
         */
        RECTANGLE_LIST,
        /**
         * The regular rectangle-xmark icon.See <a href='https://fontawesome.com/v6.0/icons/rectangle-xmark'>example</a>
         */
        RECTANGLE_XMARK,
        /**
         * The regular registered icon.See <a href='https://fontawesome.com/v6.0/icons/registered'>example</a>
         */
        REGISTERED,
        /**
         * The regular share-from-square icon.See <a href='https://fontawesome.com/v6.0/icons/share-from-square'>example</a>
         */
        SHARE_FROM_SQUARE,
        /**
         * The regular snowflake icon.See <a href='https://fontawesome.com/v6.0/icons/snowflake'>example</a>
         */
        SNOWFLAKE,
        /**
         * The regular square icon.See <a href='https://fontawesome.com/v6.0/icons/square'>example</a>
         */
        SQUARE,
        /**
         * The regular square-caret-down icon.See <a href='https://fontawesome.com/v6.0/icons/square-caret-down'>example</a>
         */
        SQUARE_CARET_DOWN,
        /**
         * The regular square-caret-left icon.See <a href='https://fontawesome.com/v6.0/icons/square-caret-left'>example</a>
         */
        SQUARE_CARET_LEFT,
        /**
         * The regular square-caret-right icon.See <a href='https://fontawesome.com/v6.0/icons/square-caret-right'>example</a>
         */
        SQUARE_CARET_RIGHT,
        /**
         * The regular square-caret-up icon.See <a href='https://fontawesome.com/v6.0/icons/square-caret-up'>example</a>
         */
        SQUARE_CARET_UP,
        /**
         * The regular square-check icon.See <a href='https://fontawesome.com/v6.0/icons/square-check'>example</a>
         */
        SQUARE_CHECK,
        /**
         * The regular square-full icon.See <a href='https://fontawesome.com/v6.0/icons/square-full'>example</a>
         */
        SQUARE_FULL,
        /**
         * The regular square-minus icon.See <a href='https://fontawesome.com/v6.0/icons/square-minus'>example</a>
         */
        SQUARE_MINUS,
        /**
         * The regular square-plus icon.See <a href='https://fontawesome.com/v6.0/icons/square-plus'>example</a>
         */
        SQUARE_PLUS,
        /**
         * The regular star icon.See <a href='https://fontawesome.com/v6.0/icons/star'>example</a>
         */
        STAR,
        /**
         * The regular star-half icon.See <a href='https://fontawesome.com/v6.0/icons/star-half'>example</a>
         */
        STAR_HALF,
        /**
         * The regular star-half-stroke icon.See <a href='https://fontawesome.com/v6.0/icons/star-half-stroke'>example</a>
         */
        STAR_HALF_STROKE,
        /**
         * The regular sun icon.See <a href='https://fontawesome.com/v6.0/icons/sun'>example</a>
         */
        SUN,
        /**
         * The regular thumbs-down icon.See <a href='https://fontawesome.com/v6.0/icons/thumbs-down'>example</a>
         */
        THUMBS_DOWN,
        /**
         * The regular thumbs-up icon.See <a href='https://fontawesome.com/v6.0/icons/thumbs-up'>example</a>
         */
        THUMBS_UP,
        /**
         * The regular trash-can icon.See <a href='https://fontawesome.com/v6.0/icons/trash-can'>example</a>
         */
        TRASH_CAN,
        /**
         * The regular user icon.See <a href='https://fontawesome.com/v6.0/icons/user'>example</a>
         */
        USER,
        /**
         * The regular window-maximize icon.See <a href='https://fontawesome.com/v6.0/icons/window-maximize'>example</a>
         */
        WINDOW_MAXIMIZE,
        /**
         * The regular window-minimize icon.See <a href='https://fontawesome.com/v6.0/icons/window-minimize'>example</a>
         */
        WINDOW_MINIMIZE,
        /**
         * The regular window-restore icon.See <a href='https://fontawesome.com/v6.0/icons/window-restore'>example</a>
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
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "4.0.0")
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
    public enum Solid {

        /**
         * The solid 0 icon.See <a href='https://fontawesome.com/v6.0/icons/0'>example</a>
         */
        _0,
        /**
         * The solid 1 icon.See <a href='https://fontawesome.com/v6.0/icons/1'>example</a>
         */
        _1,
        /**
         * The solid 2 icon.See <a href='https://fontawesome.com/v6.0/icons/2'>example</a>
         */
        _2,
        /**
         * The solid 3 icon.See <a href='https://fontawesome.com/v6.0/icons/3'>example</a>
         */
        _3,
        /**
         * The solid 4 icon.See <a href='https://fontawesome.com/v6.0/icons/4'>example</a>
         */
        _4,
        /**
         * The solid 5 icon.See <a href='https://fontawesome.com/v6.0/icons/5'>example</a>
         */
        _5,
        /**
         * The solid 6 icon.See <a href='https://fontawesome.com/v6.0/icons/6'>example</a>
         */
        _6,
        /**
         * The solid 7 icon.See <a href='https://fontawesome.com/v6.0/icons/7'>example</a>
         */
        _7,
        /**
         * The solid 8 icon.See <a href='https://fontawesome.com/v6.0/icons/8'>example</a>
         */
        _8,
        /**
         * The solid 9 icon.See <a href='https://fontawesome.com/v6.0/icons/9'>example</a>
         */
        _9,
        /**
         * The solid a icon.See <a href='https://fontawesome.com/v6.0/icons/a'>example</a>
         */
        A,
        /**
         * The solid address-book icon.See <a href='https://fontawesome.com/v6.0/icons/address-book'>example</a>
         */
        ADDRESS_BOOK,
        /**
         * The solid address-card icon.See <a href='https://fontawesome.com/v6.0/icons/address-card'>example</a>
         */
        ADDRESS_CARD,
        /**
         * The solid align-center icon.See <a href='https://fontawesome.com/v6.0/icons/align-center'>example</a>
         */
        ALIGN_CENTER,
        /**
         * The solid align-justify icon.See <a href='https://fontawesome.com/v6.0/icons/align-justify'>example</a>
         */
        ALIGN_JUSTIFY,
        /**
         * The solid align-left icon.See <a href='https://fontawesome.com/v6.0/icons/align-left'>example</a>
         */
        ALIGN_LEFT,
        /**
         * The solid align-right icon.See <a href='https://fontawesome.com/v6.0/icons/align-right'>example</a>
         */
        ALIGN_RIGHT,
        /**
         * The solid anchor icon.See <a href='https://fontawesome.com/v6.0/icons/anchor'>example</a>
         */
        ANCHOR,
        /**
         * The solid angle-down icon.See <a href='https://fontawesome.com/v6.0/icons/angle-down'>example</a>
         */
        ANGLE_DOWN,
        /**
         * The solid angle-left icon.See <a href='https://fontawesome.com/v6.0/icons/angle-left'>example</a>
         */
        ANGLE_LEFT,
        /**
         * The solid angle-right icon.See <a href='https://fontawesome.com/v6.0/icons/angle-right'>example</a>
         */
        ANGLE_RIGHT,
        /**
         * The solid angle-up icon.See <a href='https://fontawesome.com/v6.0/icons/angle-up'>example</a>
         */
        ANGLE_UP,
        /**
         * The solid angles-down icon.See <a href='https://fontawesome.com/v6.0/icons/angles-down'>example</a>
         */
        ANGLES_DOWN,
        /**
         * The solid angles-left icon.See <a href='https://fontawesome.com/v6.0/icons/angles-left'>example</a>
         */
        ANGLES_LEFT,
        /**
         * The solid angles-right icon.See <a href='https://fontawesome.com/v6.0/icons/angles-right'>example</a>
         */
        ANGLES_RIGHT,
        /**
         * The solid angles-up icon.See <a href='https://fontawesome.com/v6.0/icons/angles-up'>example</a>
         */
        ANGLES_UP,
        /**
         * The solid ankh icon.See <a href='https://fontawesome.com/v6.0/icons/ankh'>example</a>
         */
        ANKH,
        /**
         * The solid apple-whole icon.See <a href='https://fontawesome.com/v6.0/icons/apple-whole'>example</a>
         */
        APPLE_WHOLE,
        /**
         * The solid archway icon.See <a href='https://fontawesome.com/v6.0/icons/archway'>example</a>
         */
        ARCHWAY,
        /**
         * The solid arrow-down icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-down'>example</a>
         */
        ARROW_DOWN,
        /**
         * The solid arrow-down-1-9 icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-down-1-9'>example</a>
         */
        ARROW_DOWN_1_9,
        /**
         * The solid arrow-down-9-1 icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-down-9-1'>example</a>
         */
        ARROW_DOWN_9_1,
        /**
         * The solid arrow-down-a-z icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-down-a-z'>example</a>
         */
        ARROW_DOWN_A_Z,
        /**
         * The solid arrow-down-long icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-down-long'>example</a>
         */
        ARROW_DOWN_LONG,
        /**
         * The solid arrow-down-short-wide icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-down-short-wide'>example</a>
         */
        ARROW_DOWN_SHORT_WIDE,
        /**
         * The solid arrow-down-wide-short icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-down-wide-short'>example</a>
         */
        ARROW_DOWN_WIDE_SHORT,
        /**
         * The solid arrow-down-z-a icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-down-z-a'>example</a>
         */
        ARROW_DOWN_Z_A,
        /**
         * The solid arrow-left icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-left'>example</a>
         */
        ARROW_LEFT,
        /**
         * The solid arrow-left-long icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-left-long'>example</a>
         */
        ARROW_LEFT_LONG,
        /**
         * The solid arrow-pointer icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-pointer'>example</a>
         */
        ARROW_POINTER,
        /**
         * The solid arrow-right icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-right'>example</a>
         */
        ARROW_RIGHT,
        /**
         * The solid arrow-right-arrow-left icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-right-arrow-left'>example</a>
         */
        ARROW_RIGHT_ARROW_LEFT,
        /**
         * The solid arrow-right-from-bracket icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-right-from-bracket'>example</a>
         */
        ARROW_RIGHT_FROM_BRACKET,
        /**
         * The solid arrow-right-long icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-right-long'>example</a>
         */
        ARROW_RIGHT_LONG,
        /**
         * The solid arrow-right-to-bracket icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-right-to-bracket'>example</a>
         */
        ARROW_RIGHT_TO_BRACKET,
        /**
         * The solid arrow-rotate-left icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-rotate-left'>example</a>
         */
        ARROW_ROTATE_LEFT,
        /**
         * The solid arrow-rotate-right icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-rotate-right'>example</a>
         */
        ARROW_ROTATE_RIGHT,
        /**
         * The solid arrow-trend-down icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-trend-down'>example</a>
         */
        ARROW_TREND_DOWN,
        /**
         * The solid arrow-trend-up icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-trend-up'>example</a>
         */
        ARROW_TREND_UP,
        /**
         * The solid arrow-turn-down icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-turn-down'>example</a>
         */
        ARROW_TURN_DOWN,
        /**
         * The solid arrow-turn-up icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-turn-up'>example</a>
         */
        ARROW_TURN_UP,
        /**
         * The solid arrow-up icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-up'>example</a>
         */
        ARROW_UP,
        /**
         * The solid arrow-up-1-9 icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-up-1-9'>example</a>
         */
        ARROW_UP_1_9,
        /**
         * The solid arrow-up-9-1 icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-up-9-1'>example</a>
         */
        ARROW_UP_9_1,
        /**
         * The solid arrow-up-a-z icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-up-a-z'>example</a>
         */
        ARROW_UP_A_Z,
        /**
         * The solid arrow-up-from-bracket icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-up-from-bracket'>example</a>
         */
        ARROW_UP_FROM_BRACKET,
        /**
         * The solid arrow-up-long icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-up-long'>example</a>
         */
        ARROW_UP_LONG,
        /**
         * The solid arrow-up-right-from-square icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-up-right-from-square'>example</a>
         */
        ARROW_UP_RIGHT_FROM_SQUARE,
        /**
         * The solid arrow-up-short-wide icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-up-short-wide'>example</a>
         */
        ARROW_UP_SHORT_WIDE,
        /**
         * The solid arrow-up-wide-short icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-up-wide-short'>example</a>
         */
        ARROW_UP_WIDE_SHORT,
        /**
         * The solid arrow-up-z-a icon.See <a href='https://fontawesome.com/v6.0/icons/arrow-up-z-a'>example</a>
         */
        ARROW_UP_Z_A,
        /**
         * The solid arrows-left-right icon.See <a href='https://fontawesome.com/v6.0/icons/arrows-left-right'>example</a>
         */
        ARROWS_LEFT_RIGHT,
        /**
         * The solid arrows-rotate icon.See <a href='https://fontawesome.com/v6.0/icons/arrows-rotate'>example</a>
         */
        ARROWS_ROTATE,
        /**
         * The solid arrows-up-down icon.See <a href='https://fontawesome.com/v6.0/icons/arrows-up-down'>example</a>
         */
        ARROWS_UP_DOWN,
        /**
         * The solid arrows-up-down-left-right icon.See <a href='https://fontawesome.com/v6.0/icons/arrows-up-down-left-right'>example</a>
         */
        ARROWS_UP_DOWN_LEFT_RIGHT,
        /**
         * The solid asterisk icon.See <a href='https://fontawesome.com/v6.0/icons/asterisk'>example</a>
         */
        ASTERISK,
        /**
         * The solid at icon.See <a href='https://fontawesome.com/v6.0/icons/at'>example</a>
         */
        AT,
        /**
         * The solid atom icon.See <a href='https://fontawesome.com/v6.0/icons/atom'>example</a>
         */
        ATOM,
        /**
         * The solid audio-description icon.See <a href='https://fontawesome.com/v6.0/icons/audio-description'>example</a>
         */
        AUDIO_DESCRIPTION,
        /**
         * The solid austral-sign icon.See <a href='https://fontawesome.com/v6.0/icons/austral-sign'>example</a>
         */
        AUSTRAL_SIGN,
        /**
         * The solid award icon.See <a href='https://fontawesome.com/v6.0/icons/award'>example</a>
         */
        AWARD,
        /**
         * The solid b icon.See <a href='https://fontawesome.com/v6.0/icons/b'>example</a>
         */
        B,
        /**
         * The solid baby icon.See <a href='https://fontawesome.com/v6.0/icons/baby'>example</a>
         */
        BABY,
        /**
         * The solid baby-carriage icon.See <a href='https://fontawesome.com/v6.0/icons/baby-carriage'>example</a>
         */
        BABY_CARRIAGE,
        /**
         * The solid backward icon.See <a href='https://fontawesome.com/v6.0/icons/backward'>example</a>
         */
        BACKWARD,
        /**
         * The solid backward-fast icon.See <a href='https://fontawesome.com/v6.0/icons/backward-fast'>example</a>
         */
        BACKWARD_FAST,
        /**
         * The solid backward-step icon.See <a href='https://fontawesome.com/v6.0/icons/backward-step'>example</a>
         */
        BACKWARD_STEP,
        /**
         * The solid bacon icon.See <a href='https://fontawesome.com/v6.0/icons/bacon'>example</a>
         */
        BACON,
        /**
         * The solid bacteria icon.See <a href='https://fontawesome.com/v6.0/icons/bacteria'>example</a>
         */
        BACTERIA,
        /**
         * The solid bacterium icon.See <a href='https://fontawesome.com/v6.0/icons/bacterium'>example</a>
         */
        BACTERIUM,
        /**
         * The solid bag-shopping icon.See <a href='https://fontawesome.com/v6.0/icons/bag-shopping'>example</a>
         */
        BAG_SHOPPING,
        /**
         * The solid bahai icon.See <a href='https://fontawesome.com/v6.0/icons/bahai'>example</a>
         */
        BAHAI,
        /**
         * The solid baht-sign icon.See <a href='https://fontawesome.com/v6.0/icons/baht-sign'>example</a>
         */
        BAHT_SIGN,
        /**
         * The solid ban icon.See <a href='https://fontawesome.com/v6.0/icons/ban'>example</a>
         */
        BAN,
        /**
         * The solid ban-smoking icon.See <a href='https://fontawesome.com/v6.0/icons/ban-smoking'>example</a>
         */
        BAN_SMOKING,
        /**
         * The solid bandage icon.See <a href='https://fontawesome.com/v6.0/icons/bandage'>example</a>
         */
        BANDAGE,
        /**
         * The solid barcode icon.See <a href='https://fontawesome.com/v6.0/icons/barcode'>example</a>
         */
        BARCODE,
        /**
         * The solid bars icon.See <a href='https://fontawesome.com/v6.0/icons/bars'>example</a>
         */
        BARS,
        /**
         * The solid bars-progress icon.See <a href='https://fontawesome.com/v6.0/icons/bars-progress'>example</a>
         */
        BARS_PROGRESS,
        /**
         * The solid bars-staggered icon.See <a href='https://fontawesome.com/v6.0/icons/bars-staggered'>example</a>
         */
        BARS_STAGGERED,
        /**
         * The solid baseball icon.See <a href='https://fontawesome.com/v6.0/icons/baseball'>example</a>
         */
        BASEBALL,
        /**
         * The solid baseball-bat-ball icon.See <a href='https://fontawesome.com/v6.0/icons/baseball-bat-ball'>example</a>
         */
        BASEBALL_BAT_BALL,
        /**
         * The solid basket-shopping icon.See <a href='https://fontawesome.com/v6.0/icons/basket-shopping'>example</a>
         */
        BASKET_SHOPPING,
        /**
         * The solid basketball icon.See <a href='https://fontawesome.com/v6.0/icons/basketball'>example</a>
         */
        BASKETBALL,
        /**
         * The solid bath icon.See <a href='https://fontawesome.com/v6.0/icons/bath'>example</a>
         */
        BATH,
        /**
         * The solid battery-empty icon.See <a href='https://fontawesome.com/v6.0/icons/battery-empty'>example</a>
         */
        BATTERY_EMPTY,
        /**
         * The solid battery-full icon.See <a href='https://fontawesome.com/v6.0/icons/battery-full'>example</a>
         */
        BATTERY_FULL,
        /**
         * The solid battery-half icon.See <a href='https://fontawesome.com/v6.0/icons/battery-half'>example</a>
         */
        BATTERY_HALF,
        /**
         * The solid battery-quarter icon.See <a href='https://fontawesome.com/v6.0/icons/battery-quarter'>example</a>
         */
        BATTERY_QUARTER,
        /**
         * The solid battery-three-quarters icon.See <a href='https://fontawesome.com/v6.0/icons/battery-three-quarters'>example</a>
         */
        BATTERY_THREE_QUARTERS,
        /**
         * The solid bed icon.See <a href='https://fontawesome.com/v6.0/icons/bed'>example</a>
         */
        BED,
        /**
         * The solid bed-pulse icon.See <a href='https://fontawesome.com/v6.0/icons/bed-pulse'>example</a>
         */
        BED_PULSE,
        /**
         * The solid beer-mug-empty icon.See <a href='https://fontawesome.com/v6.0/icons/beer-mug-empty'>example</a>
         */
        BEER_MUG_EMPTY,
        /**
         * The solid bell icon.See <a href='https://fontawesome.com/v6.0/icons/bell'>example</a>
         */
        BELL,
        /**
         * The solid bell-concierge icon.See <a href='https://fontawesome.com/v6.0/icons/bell-concierge'>example</a>
         */
        BELL_CONCIERGE,
        /**
         * The solid bell-slash icon.See <a href='https://fontawesome.com/v6.0/icons/bell-slash'>example</a>
         */
        BELL_SLASH,
        /**
         * The solid bezier-curve icon.See <a href='https://fontawesome.com/v6.0/icons/bezier-curve'>example</a>
         */
        BEZIER_CURVE,
        /**
         * The solid bicycle icon.See <a href='https://fontawesome.com/v6.0/icons/bicycle'>example</a>
         */
        BICYCLE,
        /**
         * The solid binoculars icon.See <a href='https://fontawesome.com/v6.0/icons/binoculars'>example</a>
         */
        BINOCULARS,
        /**
         * The solid biohazard icon.See <a href='https://fontawesome.com/v6.0/icons/biohazard'>example</a>
         */
        BIOHAZARD,
        /**
         * The solid bitcoin-sign icon.See <a href='https://fontawesome.com/v6.0/icons/bitcoin-sign'>example</a>
         */
        BITCOIN_SIGN,
        /**
         * The solid blender icon.See <a href='https://fontawesome.com/v6.0/icons/blender'>example</a>
         */
        BLENDER,
        /**
         * The solid blender-phone icon.See <a href='https://fontawesome.com/v6.0/icons/blender-phone'>example</a>
         */
        BLENDER_PHONE,
        /**
         * The solid blog icon.See <a href='https://fontawesome.com/v6.0/icons/blog'>example</a>
         */
        BLOG,
        /**
         * The solid bold icon.See <a href='https://fontawesome.com/v6.0/icons/bold'>example</a>
         */
        BOLD,
        /**
         * The solid bolt icon.See <a href='https://fontawesome.com/v6.0/icons/bolt'>example</a>
         */
        BOLT,
        /**
         * The solid bolt-lightning icon.See <a href='https://fontawesome.com/v6.0/icons/bolt-lightning'>example</a>
         */
        BOLT_LIGHTNING,
        /**
         * The solid bomb icon.See <a href='https://fontawesome.com/v6.0/icons/bomb'>example</a>
         */
        BOMB,
        /**
         * The solid bone icon.See <a href='https://fontawesome.com/v6.0/icons/bone'>example</a>
         */
        BONE,
        /**
         * The solid bong icon.See <a href='https://fontawesome.com/v6.0/icons/bong'>example</a>
         */
        BONG,
        /**
         * The solid book icon.See <a href='https://fontawesome.com/v6.0/icons/book'>example</a>
         */
        BOOK,
        /**
         * The solid book-atlas icon.See <a href='https://fontawesome.com/v6.0/icons/book-atlas'>example</a>
         */
        BOOK_ATLAS,
        /**
         * The solid book-bible icon.See <a href='https://fontawesome.com/v6.0/icons/book-bible'>example</a>
         */
        BOOK_BIBLE,
        /**
         * The solid book-journal-whills icon.See <a href='https://fontawesome.com/v6.0/icons/book-journal-whills'>example</a>
         */
        BOOK_JOURNAL_WHILLS,
        /**
         * The solid book-medical icon.See <a href='https://fontawesome.com/v6.0/icons/book-medical'>example</a>
         */
        BOOK_MEDICAL,
        /**
         * The solid book-open icon.See <a href='https://fontawesome.com/v6.0/icons/book-open'>example</a>
         */
        BOOK_OPEN,
        /**
         * The solid book-open-reader icon.See <a href='https://fontawesome.com/v6.0/icons/book-open-reader'>example</a>
         */
        BOOK_OPEN_READER,
        /**
         * The solid book-quran icon.See <a href='https://fontawesome.com/v6.0/icons/book-quran'>example</a>
         */
        BOOK_QURAN,
        /**
         * The solid book-skull icon.See <a href='https://fontawesome.com/v6.0/icons/book-skull'>example</a>
         */
        BOOK_SKULL,
        /**
         * The solid bookmark icon.See <a href='https://fontawesome.com/v6.0/icons/bookmark'>example</a>
         */
        BOOKMARK,
        /**
         * The solid border-all icon.See <a href='https://fontawesome.com/v6.0/icons/border-all'>example</a>
         */
        BORDER_ALL,
        /**
         * The solid border-none icon.See <a href='https://fontawesome.com/v6.0/icons/border-none'>example</a>
         */
        BORDER_NONE,
        /**
         * The solid border-top-left icon.See <a href='https://fontawesome.com/v6.0/icons/border-top-left'>example</a>
         */
        BORDER_TOP_LEFT,
        /**
         * The solid bowling-ball icon.See <a href='https://fontawesome.com/v6.0/icons/bowling-ball'>example</a>
         */
        BOWLING_BALL,
        /**
         * The solid box icon.See <a href='https://fontawesome.com/v6.0/icons/box'>example</a>
         */
        BOX,
        /**
         * The solid box-archive icon.See <a href='https://fontawesome.com/v6.0/icons/box-archive'>example</a>
         */
        BOX_ARCHIVE,
        /**
         * The solid box-open icon.See <a href='https://fontawesome.com/v6.0/icons/box-open'>example</a>
         */
        BOX_OPEN,
        /**
         * The solid box-tissue icon.See <a href='https://fontawesome.com/v6.0/icons/box-tissue'>example</a>
         */
        BOX_TISSUE,
        /**
         * The solid boxes-stacked icon.See <a href='https://fontawesome.com/v6.0/icons/boxes-stacked'>example</a>
         */
        BOXES_STACKED,
        /**
         * The solid braille icon.See <a href='https://fontawesome.com/v6.0/icons/braille'>example</a>
         */
        BRAILLE,
        /**
         * The solid brain icon.See <a href='https://fontawesome.com/v6.0/icons/brain'>example</a>
         */
        BRAIN,
        /**
         * The solid brazilian-real-sign icon.See <a href='https://fontawesome.com/v6.0/icons/brazilian-real-sign'>example</a>
         */
        BRAZILIAN_REAL_SIGN,
        /**
         * The solid bread-slice icon.See <a href='https://fontawesome.com/v6.0/icons/bread-slice'>example</a>
         */
        BREAD_SLICE,
        /**
         * The solid briefcase icon.See <a href='https://fontawesome.com/v6.0/icons/briefcase'>example</a>
         */
        BRIEFCASE,
        /**
         * The solid briefcase-medical icon.See <a href='https://fontawesome.com/v6.0/icons/briefcase-medical'>example</a>
         */
        BRIEFCASE_MEDICAL,
        /**
         * The solid broom icon.See <a href='https://fontawesome.com/v6.0/icons/broom'>example</a>
         */
        BROOM,
        /**
         * The solid broom-ball icon.See <a href='https://fontawesome.com/v6.0/icons/broom-ball'>example</a>
         */
        BROOM_BALL,
        /**
         * The solid brush icon.See <a href='https://fontawesome.com/v6.0/icons/brush'>example</a>
         */
        BRUSH,
        /**
         * The solid bug icon.See <a href='https://fontawesome.com/v6.0/icons/bug'>example</a>
         */
        BUG,
        /**
         * The solid bug-slash icon.See <a href='https://fontawesome.com/v6.0/icons/bug-slash'>example</a>
         */
        BUG_SLASH,
        /**
         * The solid building icon.See <a href='https://fontawesome.com/v6.0/icons/building'>example</a>
         */
        BUILDING,
        /**
         * The solid building-columns icon.See <a href='https://fontawesome.com/v6.0/icons/building-columns'>example</a>
         */
        BUILDING_COLUMNS,
        /**
         * The solid bullhorn icon.See <a href='https://fontawesome.com/v6.0/icons/bullhorn'>example</a>
         */
        BULLHORN,
        /**
         * The solid bullseye icon.See <a href='https://fontawesome.com/v6.0/icons/bullseye'>example</a>
         */
        BULLSEYE,
        /**
         * The solid burger icon.See <a href='https://fontawesome.com/v6.0/icons/burger'>example</a>
         */
        BURGER,
        /**
         * The solid bus icon.See <a href='https://fontawesome.com/v6.0/icons/bus'>example</a>
         */
        BUS,
        /**
         * The solid bus-simple icon.See <a href='https://fontawesome.com/v6.0/icons/bus-simple'>example</a>
         */
        BUS_SIMPLE,
        /**
         * The solid business-time icon.See <a href='https://fontawesome.com/v6.0/icons/business-time'>example</a>
         */
        BUSINESS_TIME,
        /**
         * The solid c icon.See <a href='https://fontawesome.com/v6.0/icons/c'>example</a>
         */
        C,
        /**
         * The solid cake-candles icon.See <a href='https://fontawesome.com/v6.0/icons/cake-candles'>example</a>
         */
        CAKE_CANDLES,
        /**
         * The solid calculator icon.See <a href='https://fontawesome.com/v6.0/icons/calculator'>example</a>
         */
        CALCULATOR,
        /**
         * The solid calendar icon.See <a href='https://fontawesome.com/v6.0/icons/calendar'>example</a>
         */
        CALENDAR,
        /**
         * The solid calendar-check icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-check'>example</a>
         */
        CALENDAR_CHECK,
        /**
         * The solid calendar-day icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-day'>example</a>
         */
        CALENDAR_DAY,
        /**
         * The solid calendar-days icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-days'>example</a>
         */
        CALENDAR_DAYS,
        /**
         * The solid calendar-minus icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-minus'>example</a>
         */
        CALENDAR_MINUS,
        /**
         * The solid calendar-plus icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-plus'>example</a>
         */
        CALENDAR_PLUS,
        /**
         * The solid calendar-week icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-week'>example</a>
         */
        CALENDAR_WEEK,
        /**
         * The solid calendar-xmark icon.See <a href='https://fontawesome.com/v6.0/icons/calendar-xmark'>example</a>
         */
        CALENDAR_XMARK,
        /**
         * The solid camera icon.See <a href='https://fontawesome.com/v6.0/icons/camera'>example</a>
         */
        CAMERA,
        /**
         * The solid camera-retro icon.See <a href='https://fontawesome.com/v6.0/icons/camera-retro'>example</a>
         */
        CAMERA_RETRO,
        /**
         * The solid camera-rotate icon.See <a href='https://fontawesome.com/v6.0/icons/camera-rotate'>example</a>
         */
        CAMERA_ROTATE,
        /**
         * The solid campground icon.See <a href='https://fontawesome.com/v6.0/icons/campground'>example</a>
         */
        CAMPGROUND,
        /**
         * The solid candy-cane icon.See <a href='https://fontawesome.com/v6.0/icons/candy-cane'>example</a>
         */
        CANDY_CANE,
        /**
         * The solid cannabis icon.See <a href='https://fontawesome.com/v6.0/icons/cannabis'>example</a>
         */
        CANNABIS,
        /**
         * The solid capsules icon.See <a href='https://fontawesome.com/v6.0/icons/capsules'>example</a>
         */
        CAPSULES,
        /**
         * The solid car icon.See <a href='https://fontawesome.com/v6.0/icons/car'>example</a>
         */
        CAR,
        /**
         * The solid car-battery icon.See <a href='https://fontawesome.com/v6.0/icons/car-battery'>example</a>
         */
        CAR_BATTERY,
        /**
         * The solid car-crash icon.See <a href='https://fontawesome.com/v6.0/icons/car-crash'>example</a>
         */
        CAR_CRASH,
        /**
         * The solid car-rear icon.See <a href='https://fontawesome.com/v6.0/icons/car-rear'>example</a>
         */
        CAR_REAR,
        /**
         * The solid car-side icon.See <a href='https://fontawesome.com/v6.0/icons/car-side'>example</a>
         */
        CAR_SIDE,
        /**
         * The solid caravan icon.See <a href='https://fontawesome.com/v6.0/icons/caravan'>example</a>
         */
        CARAVAN,
        /**
         * The solid caret-down icon.See <a href='https://fontawesome.com/v6.0/icons/caret-down'>example</a>
         */
        CARET_DOWN,
        /**
         * The solid caret-left icon.See <a href='https://fontawesome.com/v6.0/icons/caret-left'>example</a>
         */
        CARET_LEFT,
        /**
         * The solid caret-right icon.See <a href='https://fontawesome.com/v6.0/icons/caret-right'>example</a>
         */
        CARET_RIGHT,
        /**
         * The solid caret-up icon.See <a href='https://fontawesome.com/v6.0/icons/caret-up'>example</a>
         */
        CARET_UP,
        /**
         * The solid carrot icon.See <a href='https://fontawesome.com/v6.0/icons/carrot'>example</a>
         */
        CARROT,
        /**
         * The solid cart-arrow-down icon.See <a href='https://fontawesome.com/v6.0/icons/cart-arrow-down'>example</a>
         */
        CART_ARROW_DOWN,
        /**
         * The solid cart-flatbed icon.See <a href='https://fontawesome.com/v6.0/icons/cart-flatbed'>example</a>
         */
        CART_FLATBED,
        /**
         * The solid cart-flatbed-suitcase icon.See <a href='https://fontawesome.com/v6.0/icons/cart-flatbed-suitcase'>example</a>
         */
        CART_FLATBED_SUITCASE,
        /**
         * The solid cart-plus icon.See <a href='https://fontawesome.com/v6.0/icons/cart-plus'>example</a>
         */
        CART_PLUS,
        /**
         * The solid cart-shopping icon.See <a href='https://fontawesome.com/v6.0/icons/cart-shopping'>example</a>
         */
        CART_SHOPPING,
        /**
         * The solid cash-register icon.See <a href='https://fontawesome.com/v6.0/icons/cash-register'>example</a>
         */
        CASH_REGISTER,
        /**
         * The solid cat icon.See <a href='https://fontawesome.com/v6.0/icons/cat'>example</a>
         */
        CAT,
        /**
         * The solid cedi-sign icon.See <a href='https://fontawesome.com/v6.0/icons/cedi-sign'>example</a>
         */
        CEDI_SIGN,
        /**
         * The solid cent-sign icon.See <a href='https://fontawesome.com/v6.0/icons/cent-sign'>example</a>
         */
        CENT_SIGN,
        /**
         * The solid certificate icon.See <a href='https://fontawesome.com/v6.0/icons/certificate'>example</a>
         */
        CERTIFICATE,
        /**
         * The solid chair icon.See <a href='https://fontawesome.com/v6.0/icons/chair'>example</a>
         */
        CHAIR,
        /**
         * The solid chalkboard icon.See <a href='https://fontawesome.com/v6.0/icons/chalkboard'>example</a>
         */
        CHALKBOARD,
        /**
         * The solid chalkboard-user icon.See <a href='https://fontawesome.com/v6.0/icons/chalkboard-user'>example</a>
         */
        CHALKBOARD_USER,
        /**
         * The solid champagne-glasses icon.See <a href='https://fontawesome.com/v6.0/icons/champagne-glasses'>example</a>
         */
        CHAMPAGNE_GLASSES,
        /**
         * The solid charging-station icon.See <a href='https://fontawesome.com/v6.0/icons/charging-station'>example</a>
         */
        CHARGING_STATION,
        /**
         * The solid chart-area icon.See <a href='https://fontawesome.com/v6.0/icons/chart-area'>example</a>
         */
        CHART_AREA,
        /**
         * The solid chart-bar icon.See <a href='https://fontawesome.com/v6.0/icons/chart-bar'>example</a>
         */
        CHART_BAR,
        /**
         * The solid chart-column icon.See <a href='https://fontawesome.com/v6.0/icons/chart-column'>example</a>
         */
        CHART_COLUMN,
        /**
         * The solid chart-gantt icon.See <a href='https://fontawesome.com/v6.0/icons/chart-gantt'>example</a>
         */
        CHART_GANTT,
        /**
         * The solid chart-line icon.See <a href='https://fontawesome.com/v6.0/icons/chart-line'>example</a>
         */
        CHART_LINE,
        /**
         * The solid chart-pie icon.See <a href='https://fontawesome.com/v6.0/icons/chart-pie'>example</a>
         */
        CHART_PIE,
        /**
         * The solid check icon.See <a href='https://fontawesome.com/v6.0/icons/check'>example</a>
         */
        CHECK,
        /**
         * The solid check-double icon.See <a href='https://fontawesome.com/v6.0/icons/check-double'>example</a>
         */
        CHECK_DOUBLE,
        /**
         * The solid check-to-slot icon.See <a href='https://fontawesome.com/v6.0/icons/check-to-slot'>example</a>
         */
        CHECK_TO_SLOT,
        /**
         * The solid cheese icon.See <a href='https://fontawesome.com/v6.0/icons/cheese'>example</a>
         */
        CHEESE,
        /**
         * The solid chess icon.See <a href='https://fontawesome.com/v6.0/icons/chess'>example</a>
         */
        CHESS,
        /**
         * The solid chess-bishop icon.See <a href='https://fontawesome.com/v6.0/icons/chess-bishop'>example</a>
         */
        CHESS_BISHOP,
        /**
         * The solid chess-board icon.See <a href='https://fontawesome.com/v6.0/icons/chess-board'>example</a>
         */
        CHESS_BOARD,
        /**
         * The solid chess-king icon.See <a href='https://fontawesome.com/v6.0/icons/chess-king'>example</a>
         */
        CHESS_KING,
        /**
         * The solid chess-knight icon.See <a href='https://fontawesome.com/v6.0/icons/chess-knight'>example</a>
         */
        CHESS_KNIGHT,
        /**
         * The solid chess-pawn icon.See <a href='https://fontawesome.com/v6.0/icons/chess-pawn'>example</a>
         */
        CHESS_PAWN,
        /**
         * The solid chess-queen icon.See <a href='https://fontawesome.com/v6.0/icons/chess-queen'>example</a>
         */
        CHESS_QUEEN,
        /**
         * The solid chess-rook icon.See <a href='https://fontawesome.com/v6.0/icons/chess-rook'>example</a>
         */
        CHESS_ROOK,
        /**
         * The solid chevron-down icon.See <a href='https://fontawesome.com/v6.0/icons/chevron-down'>example</a>
         */
        CHEVRON_DOWN,
        /**
         * The solid chevron-left icon.See <a href='https://fontawesome.com/v6.0/icons/chevron-left'>example</a>
         */
        CHEVRON_LEFT,
        /**
         * The solid chevron-right icon.See <a href='https://fontawesome.com/v6.0/icons/chevron-right'>example</a>
         */
        CHEVRON_RIGHT,
        /**
         * The solid chevron-up icon.See <a href='https://fontawesome.com/v6.0/icons/chevron-up'>example</a>
         */
        CHEVRON_UP,
        /**
         * The solid child icon.See <a href='https://fontawesome.com/v6.0/icons/child'>example</a>
         */
        CHILD,
        /**
         * The solid church icon.See <a href='https://fontawesome.com/v6.0/icons/church'>example</a>
         */
        CHURCH,
        /**
         * The solid circle icon.See <a href='https://fontawesome.com/v6.0/icons/circle'>example</a>
         */
        CIRCLE,
        /**
         * The solid circle-arrow-down icon.See <a href='https://fontawesome.com/v6.0/icons/circle-arrow-down'>example</a>
         */
        CIRCLE_ARROW_DOWN,
        /**
         * The solid circle-arrow-left icon.See <a href='https://fontawesome.com/v6.0/icons/circle-arrow-left'>example</a>
         */
        CIRCLE_ARROW_LEFT,
        /**
         * The solid circle-arrow-right icon.See <a href='https://fontawesome.com/v6.0/icons/circle-arrow-right'>example</a>
         */
        CIRCLE_ARROW_RIGHT,
        /**
         * The solid circle-arrow-up icon.See <a href='https://fontawesome.com/v6.0/icons/circle-arrow-up'>example</a>
         */
        CIRCLE_ARROW_UP,
        /**
         * The solid circle-check icon.See <a href='https://fontawesome.com/v6.0/icons/circle-check'>example</a>
         */
        CIRCLE_CHECK,
        /**
         * The solid circle-chevron-down icon.See <a href='https://fontawesome.com/v6.0/icons/circle-chevron-down'>example</a>
         */
        CIRCLE_CHEVRON_DOWN,
        /**
         * The solid circle-chevron-left icon.See <a href='https://fontawesome.com/v6.0/icons/circle-chevron-left'>example</a>
         */
        CIRCLE_CHEVRON_LEFT,
        /**
         * The solid circle-chevron-right icon.See <a href='https://fontawesome.com/v6.0/icons/circle-chevron-right'>example</a>
         */
        CIRCLE_CHEVRON_RIGHT,
        /**
         * The solid circle-chevron-up icon.See <a href='https://fontawesome.com/v6.0/icons/circle-chevron-up'>example</a>
         */
        CIRCLE_CHEVRON_UP,
        /**
         * The solid circle-dollar-to-slot icon.See <a href='https://fontawesome.com/v6.0/icons/circle-dollar-to-slot'>example</a>
         */
        CIRCLE_DOLLAR_TO_SLOT,
        /**
         * The solid circle-dot icon.See <a href='https://fontawesome.com/v6.0/icons/circle-dot'>example</a>
         */
        CIRCLE_DOT,
        /**
         * The solid circle-down icon.See <a href='https://fontawesome.com/v6.0/icons/circle-down'>example</a>
         */
        CIRCLE_DOWN,
        /**
         * The solid circle-exclamation icon.See <a href='https://fontawesome.com/v6.0/icons/circle-exclamation'>example</a>
         */
        CIRCLE_EXCLAMATION,
        /**
         * The solid circle-h icon.See <a href='https://fontawesome.com/v6.0/icons/circle-h'>example</a>
         */
        CIRCLE_H,
        /**
         * The solid circle-half-stroke icon.See <a href='https://fontawesome.com/v6.0/icons/circle-half-stroke'>example</a>
         */
        CIRCLE_HALF_STROKE,
        /**
         * The solid circle-info icon.See <a href='https://fontawesome.com/v6.0/icons/circle-info'>example</a>
         */
        CIRCLE_INFO,
        /**
         * The solid circle-left icon.See <a href='https://fontawesome.com/v6.0/icons/circle-left'>example</a>
         */
        CIRCLE_LEFT,
        /**
         * The solid circle-minus icon.See <a href='https://fontawesome.com/v6.0/icons/circle-minus'>example</a>
         */
        CIRCLE_MINUS,
        /**
         * The solid circle-notch icon.See <a href='https://fontawesome.com/v6.0/icons/circle-notch'>example</a>
         */
        CIRCLE_NOTCH,
        /**
         * The solid circle-pause icon.See <a href='https://fontawesome.com/v6.0/icons/circle-pause'>example</a>
         */
        CIRCLE_PAUSE,
        /**
         * The solid circle-play icon.See <a href='https://fontawesome.com/v6.0/icons/circle-play'>example</a>
         */
        CIRCLE_PLAY,
        /**
         * The solid circle-plus icon.See <a href='https://fontawesome.com/v6.0/icons/circle-plus'>example</a>
         */
        CIRCLE_PLUS,
        /**
         * The solid circle-question icon.See <a href='https://fontawesome.com/v6.0/icons/circle-question'>example</a>
         */
        CIRCLE_QUESTION,
        /**
         * The solid circle-radiation icon.See <a href='https://fontawesome.com/v6.0/icons/circle-radiation'>example</a>
         */
        CIRCLE_RADIATION,
        /**
         * The solid circle-right icon.See <a href='https://fontawesome.com/v6.0/icons/circle-right'>example</a>
         */
        CIRCLE_RIGHT,
        /**
         * The solid circle-stop icon.See <a href='https://fontawesome.com/v6.0/icons/circle-stop'>example</a>
         */
        CIRCLE_STOP,
        /**
         * The solid circle-up icon.See <a href='https://fontawesome.com/v6.0/icons/circle-up'>example</a>
         */
        CIRCLE_UP,
        /**
         * The solid circle-user icon.See <a href='https://fontawesome.com/v6.0/icons/circle-user'>example</a>
         */
        CIRCLE_USER,
        /**
         * The solid circle-xmark icon.See <a href='https://fontawesome.com/v6.0/icons/circle-xmark'>example</a>
         */
        CIRCLE_XMARK,
        /**
         * The solid city icon.See <a href='https://fontawesome.com/v6.0/icons/city'>example</a>
         */
        CITY,
        /**
         * The solid clapperboard icon.See <a href='https://fontawesome.com/v6.0/icons/clapperboard'>example</a>
         */
        CLAPPERBOARD,
        /**
         * The solid clipboard icon.See <a href='https://fontawesome.com/v6.0/icons/clipboard'>example</a>
         */
        CLIPBOARD,
        /**
         * The solid clipboard-check icon.See <a href='https://fontawesome.com/v6.0/icons/clipboard-check'>example</a>
         */
        CLIPBOARD_CHECK,
        /**
         * The solid clipboard-list icon.See <a href='https://fontawesome.com/v6.0/icons/clipboard-list'>example</a>
         */
        CLIPBOARD_LIST,
        /**
         * The solid clock icon.See <a href='https://fontawesome.com/v6.0/icons/clock'>example</a>
         */
        CLOCK,
        /**
         * The solid clock-rotate-left icon.See <a href='https://fontawesome.com/v6.0/icons/clock-rotate-left'>example</a>
         */
        CLOCK_ROTATE_LEFT,
        /**
         * The solid clone icon.See <a href='https://fontawesome.com/v6.0/icons/clone'>example</a>
         */
        CLONE,
        /**
         * The solid closed-captioning icon.See <a href='https://fontawesome.com/v6.0/icons/closed-captioning'>example</a>
         */
        CLOSED_CAPTIONING,
        /**
         * The solid cloud icon.See <a href='https://fontawesome.com/v6.0/icons/cloud'>example</a>
         */
        CLOUD,
        /**
         * The solid cloud-arrow-down icon.See <a href='https://fontawesome.com/v6.0/icons/cloud-arrow-down'>example</a>
         */
        CLOUD_ARROW_DOWN,
        /**
         * The solid cloud-arrow-up icon.See <a href='https://fontawesome.com/v6.0/icons/cloud-arrow-up'>example</a>
         */
        CLOUD_ARROW_UP,
        /**
         * The solid cloud-meatball icon.See <a href='https://fontawesome.com/v6.0/icons/cloud-meatball'>example</a>
         */
        CLOUD_MEATBALL,
        /**
         * The solid cloud-moon icon.See <a href='https://fontawesome.com/v6.0/icons/cloud-moon'>example</a>
         */
        CLOUD_MOON,
        /**
         * The solid cloud-moon-rain icon.See <a href='https://fontawesome.com/v6.0/icons/cloud-moon-rain'>example</a>
         */
        CLOUD_MOON_RAIN,
        /**
         * The solid cloud-rain icon.See <a href='https://fontawesome.com/v6.0/icons/cloud-rain'>example</a>
         */
        CLOUD_RAIN,
        /**
         * The solid cloud-showers-heavy icon.See <a href='https://fontawesome.com/v6.0/icons/cloud-showers-heavy'>example</a>
         */
        CLOUD_SHOWERS_HEAVY,
        /**
         * The solid cloud-sun icon.See <a href='https://fontawesome.com/v6.0/icons/cloud-sun'>example</a>
         */
        CLOUD_SUN,
        /**
         * The solid cloud-sun-rain icon.See <a href='https://fontawesome.com/v6.0/icons/cloud-sun-rain'>example</a>
         */
        CLOUD_SUN_RAIN,
        /**
         * The solid clover icon.See <a href='https://fontawesome.com/v6.0/icons/clover'>example</a>
         */
        CLOVER,
        /**
         * The solid code icon.See <a href='https://fontawesome.com/v6.0/icons/code'>example</a>
         */
        CODE,
        /**
         * The solid code-branch icon.See <a href='https://fontawesome.com/v6.0/icons/code-branch'>example</a>
         */
        CODE_BRANCH,
        /**
         * The solid code-commit icon.See <a href='https://fontawesome.com/v6.0/icons/code-commit'>example</a>
         */
        CODE_COMMIT,
        /**
         * The solid code-compare icon.See <a href='https://fontawesome.com/v6.0/icons/code-compare'>example</a>
         */
        CODE_COMPARE,
        /**
         * The solid code-fork icon.See <a href='https://fontawesome.com/v6.0/icons/code-fork'>example</a>
         */
        CODE_FORK,
        /**
         * The solid code-merge icon.See <a href='https://fontawesome.com/v6.0/icons/code-merge'>example</a>
         */
        CODE_MERGE,
        /**
         * The solid code-pull-request icon.See <a href='https://fontawesome.com/v6.0/icons/code-pull-request'>example</a>
         */
        CODE_PULL_REQUEST,
        /**
         * The solid coins icon.See <a href='https://fontawesome.com/v6.0/icons/coins'>example</a>
         */
        COINS,
        /**
         * The solid colon-sign icon.See <a href='https://fontawesome.com/v6.0/icons/colon-sign'>example</a>
         */
        COLON_SIGN,
        /**
         * The solid comment icon.See <a href='https://fontawesome.com/v6.0/icons/comment'>example</a>
         */
        COMMENT,
        /**
         * The solid comment-dollar icon.See <a href='https://fontawesome.com/v6.0/icons/comment-dollar'>example</a>
         */
        COMMENT_DOLLAR,
        /**
         * The solid comment-dots icon.See <a href='https://fontawesome.com/v6.0/icons/comment-dots'>example</a>
         */
        COMMENT_DOTS,
        /**
         * The solid comment-medical icon.See <a href='https://fontawesome.com/v6.0/icons/comment-medical'>example</a>
         */
        COMMENT_MEDICAL,
        /**
         * The solid comment-slash icon.See <a href='https://fontawesome.com/v6.0/icons/comment-slash'>example</a>
         */
        COMMENT_SLASH,
        /**
         * The solid comment-sms icon.See <a href='https://fontawesome.com/v6.0/icons/comment-sms'>example</a>
         */
        COMMENT_SMS,
        /**
         * The solid comments icon.See <a href='https://fontawesome.com/v6.0/icons/comments'>example</a>
         */
        COMMENTS,
        /**
         * The solid comments-dollar icon.See <a href='https://fontawesome.com/v6.0/icons/comments-dollar'>example</a>
         */
        COMMENTS_DOLLAR,
        /**
         * The solid compact-disc icon.See <a href='https://fontawesome.com/v6.0/icons/compact-disc'>example</a>
         */
        COMPACT_DISC,
        /**
         * The solid compass icon.See <a href='https://fontawesome.com/v6.0/icons/compass'>example</a>
         */
        COMPASS,
        /**
         * The solid compass-drafting icon.See <a href='https://fontawesome.com/v6.0/icons/compass-drafting'>example</a>
         */
        COMPASS_DRAFTING,
        /**
         * The solid compress icon.See <a href='https://fontawesome.com/v6.0/icons/compress'>example</a>
         */
        COMPRESS,
        /**
         * The solid computer-mouse icon.See <a href='https://fontawesome.com/v6.0/icons/computer-mouse'>example</a>
         */
        COMPUTER_MOUSE,
        /**
         * The solid cookie icon.See <a href='https://fontawesome.com/v6.0/icons/cookie'>example</a>
         */
        COOKIE,
        /**
         * The solid cookie-bite icon.See <a href='https://fontawesome.com/v6.0/icons/cookie-bite'>example</a>
         */
        COOKIE_BITE,
        /**
         * The solid copy icon.See <a href='https://fontawesome.com/v6.0/icons/copy'>example</a>
         */
        COPY,
        /**
         * The solid copyright icon.See <a href='https://fontawesome.com/v6.0/icons/copyright'>example</a>
         */
        COPYRIGHT,
        /**
         * The solid couch icon.See <a href='https://fontawesome.com/v6.0/icons/couch'>example</a>
         */
        COUCH,
        /**
         * The solid credit-card icon.See <a href='https://fontawesome.com/v6.0/icons/credit-card'>example</a>
         */
        CREDIT_CARD,
        /**
         * The solid crop icon.See <a href='https://fontawesome.com/v6.0/icons/crop'>example</a>
         */
        CROP,
        /**
         * The solid crop-simple icon.See <a href='https://fontawesome.com/v6.0/icons/crop-simple'>example</a>
         */
        CROP_SIMPLE,
        /**
         * The solid cross icon.See <a href='https://fontawesome.com/v6.0/icons/cross'>example</a>
         */
        CROSS,
        /**
         * The solid crosshairs icon.See <a href='https://fontawesome.com/v6.0/icons/crosshairs'>example</a>
         */
        CROSSHAIRS,
        /**
         * The solid crow icon.See <a href='https://fontawesome.com/v6.0/icons/crow'>example</a>
         */
        CROW,
        /**
         * The solid crown icon.See <a href='https://fontawesome.com/v6.0/icons/crown'>example</a>
         */
        CROWN,
        /**
         * The solid crutch icon.See <a href='https://fontawesome.com/v6.0/icons/crutch'>example</a>
         */
        CRUTCH,
        /**
         * The solid cruzeiro-sign icon.See <a href='https://fontawesome.com/v6.0/icons/cruzeiro-sign'>example</a>
         */
        CRUZEIRO_SIGN,
        /**
         * The solid cube icon.See <a href='https://fontawesome.com/v6.0/icons/cube'>example</a>
         */
        CUBE,
        /**
         * The solid cubes icon.See <a href='https://fontawesome.com/v6.0/icons/cubes'>example</a>
         */
        CUBES,
        /**
         * The solid d icon.See <a href='https://fontawesome.com/v6.0/icons/d'>example</a>
         */
        D,
        /**
         * The solid database icon.See <a href='https://fontawesome.com/v6.0/icons/database'>example</a>
         */
        DATABASE,
        /**
         * The solid delete-left icon.See <a href='https://fontawesome.com/v6.0/icons/delete-left'>example</a>
         */
        DELETE_LEFT,
        /**
         * The solid democrat icon.See <a href='https://fontawesome.com/v6.0/icons/democrat'>example</a>
         */
        DEMOCRAT,
        /**
         * The solid desktop icon.See <a href='https://fontawesome.com/v6.0/icons/desktop'>example</a>
         */
        DESKTOP,
        /**
         * The solid dharmachakra icon.See <a href='https://fontawesome.com/v6.0/icons/dharmachakra'>example</a>
         */
        DHARMACHAKRA,
        /**
         * The solid diagram-next icon.See <a href='https://fontawesome.com/v6.0/icons/diagram-next'>example</a>
         */
        DIAGRAM_NEXT,
        /**
         * The solid diagram-predecessor icon.See <a href='https://fontawesome.com/v6.0/icons/diagram-predecessor'>example</a>
         */
        DIAGRAM_PREDECESSOR,
        /**
         * The solid diagram-project icon.See <a href='https://fontawesome.com/v6.0/icons/diagram-project'>example</a>
         */
        DIAGRAM_PROJECT,
        /**
         * The solid diagram-successor icon.See <a href='https://fontawesome.com/v6.0/icons/diagram-successor'>example</a>
         */
        DIAGRAM_SUCCESSOR,
        /**
         * The solid diamond icon.See <a href='https://fontawesome.com/v6.0/icons/diamond'>example</a>
         */
        DIAMOND,
        /**
         * The solid diamond-turn-right icon.See <a href='https://fontawesome.com/v6.0/icons/diamond-turn-right'>example</a>
         */
        DIAMOND_TURN_RIGHT,
        /**
         * The solid dice icon.See <a href='https://fontawesome.com/v6.0/icons/dice'>example</a>
         */
        DICE,
        /**
         * The solid dice-d20 icon.See <a href='https://fontawesome.com/v6.0/icons/dice-d20'>example</a>
         */
        DICE_D20,
        /**
         * The solid dice-d6 icon.See <a href='https://fontawesome.com/v6.0/icons/dice-d6'>example</a>
         */
        DICE_D6,
        /**
         * The solid dice-five icon.See <a href='https://fontawesome.com/v6.0/icons/dice-five'>example</a>
         */
        DICE_FIVE,
        /**
         * The solid dice-four icon.See <a href='https://fontawesome.com/v6.0/icons/dice-four'>example</a>
         */
        DICE_FOUR,
        /**
         * The solid dice-one icon.See <a href='https://fontawesome.com/v6.0/icons/dice-one'>example</a>
         */
        DICE_ONE,
        /**
         * The solid dice-six icon.See <a href='https://fontawesome.com/v6.0/icons/dice-six'>example</a>
         */
        DICE_SIX,
        /**
         * The solid dice-three icon.See <a href='https://fontawesome.com/v6.0/icons/dice-three'>example</a>
         */
        DICE_THREE,
        /**
         * The solid dice-two icon.See <a href='https://fontawesome.com/v6.0/icons/dice-two'>example</a>
         */
        DICE_TWO,
        /**
         * The solid disease icon.See <a href='https://fontawesome.com/v6.0/icons/disease'>example</a>
         */
        DISEASE,
        /**
         * The solid divide icon.See <a href='https://fontawesome.com/v6.0/icons/divide'>example</a>
         */
        DIVIDE,
        /**
         * The solid dna icon.See <a href='https://fontawesome.com/v6.0/icons/dna'>example</a>
         */
        DNA,
        /**
         * The solid dog icon.See <a href='https://fontawesome.com/v6.0/icons/dog'>example</a>
         */
        DOG,
        /**
         * The solid dollar-sign icon.See <a href='https://fontawesome.com/v6.0/icons/dollar-sign'>example</a>
         */
        DOLLAR_SIGN,
        /**
         * The solid dolly icon.See <a href='https://fontawesome.com/v6.0/icons/dolly'>example</a>
         */
        DOLLY,
        /**
         * The solid dong-sign icon.See <a href='https://fontawesome.com/v6.0/icons/dong-sign'>example</a>
         */
        DONG_SIGN,
        /**
         * The solid door-closed icon.See <a href='https://fontawesome.com/v6.0/icons/door-closed'>example</a>
         */
        DOOR_CLOSED,
        /**
         * The solid door-open icon.See <a href='https://fontawesome.com/v6.0/icons/door-open'>example</a>
         */
        DOOR_OPEN,
        /**
         * The solid dove icon.See <a href='https://fontawesome.com/v6.0/icons/dove'>example</a>
         */
        DOVE,
        /**
         * The solid down-left-and-up-right-to-center icon.See <a href='https://fontawesome.com/v6.0/icons/down-left-and-up-right-to-center'>example</a>
         */
        DOWN_LEFT_AND_UP_RIGHT_TO_CENTER,
        /**
         * The solid down-long icon.See <a href='https://fontawesome.com/v6.0/icons/down-long'>example</a>
         */
        DOWN_LONG,
        /**
         * The solid download icon.See <a href='https://fontawesome.com/v6.0/icons/download'>example</a>
         */
        DOWNLOAD,
        /**
         * The solid dragon icon.See <a href='https://fontawesome.com/v6.0/icons/dragon'>example</a>
         */
        DRAGON,
        /**
         * The solid draw-polygon icon.See <a href='https://fontawesome.com/v6.0/icons/draw-polygon'>example</a>
         */
        DRAW_POLYGON,
        /**
         * The solid droplet icon.See <a href='https://fontawesome.com/v6.0/icons/droplet'>example</a>
         */
        DROPLET,
        /**
         * The solid droplet-slash icon.See <a href='https://fontawesome.com/v6.0/icons/droplet-slash'>example</a>
         */
        DROPLET_SLASH,
        /**
         * The solid drum icon.See <a href='https://fontawesome.com/v6.0/icons/drum'>example</a>
         */
        DRUM,
        /**
         * The solid drum-steelpan icon.See <a href='https://fontawesome.com/v6.0/icons/drum-steelpan'>example</a>
         */
        DRUM_STEELPAN,
        /**
         * The solid drumstick-bite icon.See <a href='https://fontawesome.com/v6.0/icons/drumstick-bite'>example</a>
         */
        DRUMSTICK_BITE,
        /**
         * The solid dumbbell icon.See <a href='https://fontawesome.com/v6.0/icons/dumbbell'>example</a>
         */
        DUMBBELL,
        /**
         * The solid dumpster icon.See <a href='https://fontawesome.com/v6.0/icons/dumpster'>example</a>
         */
        DUMPSTER,
        /**
         * The solid dumpster-fire icon.See <a href='https://fontawesome.com/v6.0/icons/dumpster-fire'>example</a>
         */
        DUMPSTER_FIRE,
        /**
         * The solid dungeon icon.See <a href='https://fontawesome.com/v6.0/icons/dungeon'>example</a>
         */
        DUNGEON,
        /**
         * The solid e icon.See <a href='https://fontawesome.com/v6.0/icons/e'>example</a>
         */
        E,
        /**
         * The solid ear-deaf icon.See <a href='https://fontawesome.com/v6.0/icons/ear-deaf'>example</a>
         */
        EAR_DEAF,
        /**
         * The solid ear-listen icon.See <a href='https://fontawesome.com/v6.0/icons/ear-listen'>example</a>
         */
        EAR_LISTEN,
        /**
         * The solid earth-africa icon.See <a href='https://fontawesome.com/v6.0/icons/earth-africa'>example</a>
         */
        EARTH_AFRICA,
        /**
         * The solid earth-americas icon.See <a href='https://fontawesome.com/v6.0/icons/earth-americas'>example</a>
         */
        EARTH_AMERICAS,
        /**
         * The solid earth-asia icon.See <a href='https://fontawesome.com/v6.0/icons/earth-asia'>example</a>
         */
        EARTH_ASIA,
        /**
         * The solid earth-europe icon.See <a href='https://fontawesome.com/v6.0/icons/earth-europe'>example</a>
         */
        EARTH_EUROPE,
        /**
         * The solid earth-oceania icon.See <a href='https://fontawesome.com/v6.0/icons/earth-oceania'>example</a>
         */
        EARTH_OCEANIA,
        /**
         * The solid egg icon.See <a href='https://fontawesome.com/v6.0/icons/egg'>example</a>
         */
        EGG,
        /**
         * The solid eject icon.See <a href='https://fontawesome.com/v6.0/icons/eject'>example</a>
         */
        EJECT,
        /**
         * The solid elevator icon.See <a href='https://fontawesome.com/v6.0/icons/elevator'>example</a>
         */
        ELEVATOR,
        /**
         * The solid ellipsis icon.See <a href='https://fontawesome.com/v6.0/icons/ellipsis'>example</a>
         */
        ELLIPSIS,
        /**
         * The solid ellipsis-vertical icon.See <a href='https://fontawesome.com/v6.0/icons/ellipsis-vertical'>example</a>
         */
        ELLIPSIS_VERTICAL,
        /**
         * The solid envelope icon.See <a href='https://fontawesome.com/v6.0/icons/envelope'>example</a>
         */
        ENVELOPE,
        /**
         * The solid envelope-open icon.See <a href='https://fontawesome.com/v6.0/icons/envelope-open'>example</a>
         */
        ENVELOPE_OPEN,
        /**
         * The solid envelope-open-text icon.See <a href='https://fontawesome.com/v6.0/icons/envelope-open-text'>example</a>
         */
        ENVELOPE_OPEN_TEXT,
        /**
         * The solid envelopes-bulk icon.See <a href='https://fontawesome.com/v6.0/icons/envelopes-bulk'>example</a>
         */
        ENVELOPES_BULK,
        /**
         * The solid equals icon.See <a href='https://fontawesome.com/v6.0/icons/equals'>example</a>
         */
        EQUALS,
        /**
         * The solid eraser icon.See <a href='https://fontawesome.com/v6.0/icons/eraser'>example</a>
         */
        ERASER,
        /**
         * The solid ethernet icon.See <a href='https://fontawesome.com/v6.0/icons/ethernet'>example</a>
         */
        ETHERNET,
        /**
         * The solid euro-sign icon.See <a href='https://fontawesome.com/v6.0/icons/euro-sign'>example</a>
         */
        EURO_SIGN,
        /**
         * The solid exclamation icon.See <a href='https://fontawesome.com/v6.0/icons/exclamation'>example</a>
         */
        EXCLAMATION,
        /**
         * The solid expand icon.See <a href='https://fontawesome.com/v6.0/icons/expand'>example</a>
         */
        EXPAND,
        /**
         * The solid eye icon.See <a href='https://fontawesome.com/v6.0/icons/eye'>example</a>
         */
        EYE,
        /**
         * The solid eye-dropper icon.See <a href='https://fontawesome.com/v6.0/icons/eye-dropper'>example</a>
         */
        EYE_DROPPER,
        /**
         * The solid eye-low-vision icon.See <a href='https://fontawesome.com/v6.0/icons/eye-low-vision'>example</a>
         */
        EYE_LOW_VISION,
        /**
         * The solid eye-slash icon.See <a href='https://fontawesome.com/v6.0/icons/eye-slash'>example</a>
         */
        EYE_SLASH,
        /**
         * The solid f icon.See <a href='https://fontawesome.com/v6.0/icons/f'>example</a>
         */
        F,
        /**
         * The solid face-angry icon.See <a href='https://fontawesome.com/v6.0/icons/face-angry'>example</a>
         */
        FACE_ANGRY,
        /**
         * The solid face-dizzy icon.See <a href='https://fontawesome.com/v6.0/icons/face-dizzy'>example</a>
         */
        FACE_DIZZY,
        /**
         * The solid face-flushed icon.See <a href='https://fontawesome.com/v6.0/icons/face-flushed'>example</a>
         */
        FACE_FLUSHED,
        /**
         * The solid face-frown icon.See <a href='https://fontawesome.com/v6.0/icons/face-frown'>example</a>
         */
        FACE_FROWN,
        /**
         * The solid face-frown-open icon.See <a href='https://fontawesome.com/v6.0/icons/face-frown-open'>example</a>
         */
        FACE_FROWN_OPEN,
        /**
         * The solid face-grimace icon.See <a href='https://fontawesome.com/v6.0/icons/face-grimace'>example</a>
         */
        FACE_GRIMACE,
        /**
         * The solid face-grin icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin'>example</a>
         */
        FACE_GRIN,
        /**
         * The solid face-grin-beam icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-beam'>example</a>
         */
        FACE_GRIN_BEAM,
        /**
         * The solid face-grin-beam-sweat icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-beam-sweat'>example</a>
         */
        FACE_GRIN_BEAM_SWEAT,
        /**
         * The solid face-grin-hearts icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-hearts'>example</a>
         */
        FACE_GRIN_HEARTS,
        /**
         * The solid face-grin-squint icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-squint'>example</a>
         */
        FACE_GRIN_SQUINT,
        /**
         * The solid face-grin-squint-tears icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-squint-tears'>example</a>
         */
        FACE_GRIN_SQUINT_TEARS,
        /**
         * The solid face-grin-stars icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-stars'>example</a>
         */
        FACE_GRIN_STARS,
        /**
         * The solid face-grin-tears icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-tears'>example</a>
         */
        FACE_GRIN_TEARS,
        /**
         * The solid face-grin-tongue icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-tongue'>example</a>
         */
        FACE_GRIN_TONGUE,
        /**
         * The solid face-grin-tongue-squint icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-tongue-squint'>example</a>
         */
        FACE_GRIN_TONGUE_SQUINT,
        /**
         * The solid face-grin-tongue-wink icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-tongue-wink'>example</a>
         */
        FACE_GRIN_TONGUE_WINK,
        /**
         * The solid face-grin-wide icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-wide'>example</a>
         */
        FACE_GRIN_WIDE,
        /**
         * The solid face-grin-wink icon.See <a href='https://fontawesome.com/v6.0/icons/face-grin-wink'>example</a>
         */
        FACE_GRIN_WINK,
        /**
         * The solid face-kiss icon.See <a href='https://fontawesome.com/v6.0/icons/face-kiss'>example</a>
         */
        FACE_KISS,
        /**
         * The solid face-kiss-beam icon.See <a href='https://fontawesome.com/v6.0/icons/face-kiss-beam'>example</a>
         */
        FACE_KISS_BEAM,
        /**
         * The solid face-kiss-wink-heart icon.See <a href='https://fontawesome.com/v6.0/icons/face-kiss-wink-heart'>example</a>
         */
        FACE_KISS_WINK_HEART,
        /**
         * The solid face-laugh icon.See <a href='https://fontawesome.com/v6.0/icons/face-laugh'>example</a>
         */
        FACE_LAUGH,
        /**
         * The solid face-laugh-beam icon.See <a href='https://fontawesome.com/v6.0/icons/face-laugh-beam'>example</a>
         */
        FACE_LAUGH_BEAM,
        /**
         * The solid face-laugh-squint icon.See <a href='https://fontawesome.com/v6.0/icons/face-laugh-squint'>example</a>
         */
        FACE_LAUGH_SQUINT,
        /**
         * The solid face-laugh-wink icon.See <a href='https://fontawesome.com/v6.0/icons/face-laugh-wink'>example</a>
         */
        FACE_LAUGH_WINK,
        /**
         * The solid face-meh icon.See <a href='https://fontawesome.com/v6.0/icons/face-meh'>example</a>
         */
        FACE_MEH,
        /**
         * The solid face-meh-blank icon.See <a href='https://fontawesome.com/v6.0/icons/face-meh-blank'>example</a>
         */
        FACE_MEH_BLANK,
        /**
         * The solid face-rolling-eyes icon.See <a href='https://fontawesome.com/v6.0/icons/face-rolling-eyes'>example</a>
         */
        FACE_ROLLING_EYES,
        /**
         * The solid face-sad-cry icon.See <a href='https://fontawesome.com/v6.0/icons/face-sad-cry'>example</a>
         */
        FACE_SAD_CRY,
        /**
         * The solid face-sad-tear icon.See <a href='https://fontawesome.com/v6.0/icons/face-sad-tear'>example</a>
         */
        FACE_SAD_TEAR,
        /**
         * The solid face-smile icon.See <a href='https://fontawesome.com/v6.0/icons/face-smile'>example</a>
         */
        FACE_SMILE,
        /**
         * The solid face-smile-beam icon.See <a href='https://fontawesome.com/v6.0/icons/face-smile-beam'>example</a>
         */
        FACE_SMILE_BEAM,
        /**
         * The solid face-smile-wink icon.See <a href='https://fontawesome.com/v6.0/icons/face-smile-wink'>example</a>
         */
        FACE_SMILE_WINK,
        /**
         * The solid face-surprise icon.See <a href='https://fontawesome.com/v6.0/icons/face-surprise'>example</a>
         */
        FACE_SURPRISE,
        /**
         * The solid face-tired icon.See <a href='https://fontawesome.com/v6.0/icons/face-tired'>example</a>
         */
        FACE_TIRED,
        /**
         * The solid fan icon.See <a href='https://fontawesome.com/v6.0/icons/fan'>example</a>
         */
        FAN,
        /**
         * The solid faucet icon.See <a href='https://fontawesome.com/v6.0/icons/faucet'>example</a>
         */
        FAUCET,
        /**
         * The solid fax icon.See <a href='https://fontawesome.com/v6.0/icons/fax'>example</a>
         */
        FAX,
        /**
         * The solid feather icon.See <a href='https://fontawesome.com/v6.0/icons/feather'>example</a>
         */
        FEATHER,
        /**
         * The solid feather-pointed icon.See <a href='https://fontawesome.com/v6.0/icons/feather-pointed'>example</a>
         */
        FEATHER_POINTED,
        /**
         * The solid file icon.See <a href='https://fontawesome.com/v6.0/icons/file'>example</a>
         */
        FILE,
        /**
         * The solid file-arrow-down icon.See <a href='https://fontawesome.com/v6.0/icons/file-arrow-down'>example</a>
         */
        FILE_ARROW_DOWN,
        /**
         * The solid file-arrow-up icon.See <a href='https://fontawesome.com/v6.0/icons/file-arrow-up'>example</a>
         */
        FILE_ARROW_UP,
        /**
         * The solid file-audio icon.See <a href='https://fontawesome.com/v6.0/icons/file-audio'>example</a>
         */
        FILE_AUDIO,
        /**
         * The solid file-code icon.See <a href='https://fontawesome.com/v6.0/icons/file-code'>example</a>
         */
        FILE_CODE,
        /**
         * The solid file-contract icon.See <a href='https://fontawesome.com/v6.0/icons/file-contract'>example</a>
         */
        FILE_CONTRACT,
        /**
         * The solid file-csv icon.See <a href='https://fontawesome.com/v6.0/icons/file-csv'>example</a>
         */
        FILE_CSV,
        /**
         * The solid file-excel icon.See <a href='https://fontawesome.com/v6.0/icons/file-excel'>example</a>
         */
        FILE_EXCEL,
        /**
         * The solid file-export icon.See <a href='https://fontawesome.com/v6.0/icons/file-export'>example</a>
         */
        FILE_EXPORT,
        /**
         * The solid file-image icon.See <a href='https://fontawesome.com/v6.0/icons/file-image'>example</a>
         */
        FILE_IMAGE,
        /**
         * The solid file-import icon.See <a href='https://fontawesome.com/v6.0/icons/file-import'>example</a>
         */
        FILE_IMPORT,
        /**
         * The solid file-invoice icon.See <a href='https://fontawesome.com/v6.0/icons/file-invoice'>example</a>
         */
        FILE_INVOICE,
        /**
         * The solid file-invoice-dollar icon.See <a href='https://fontawesome.com/v6.0/icons/file-invoice-dollar'>example</a>
         */
        FILE_INVOICE_DOLLAR,
        /**
         * The solid file-lines icon.See <a href='https://fontawesome.com/v6.0/icons/file-lines'>example</a>
         */
        FILE_LINES,
        /**
         * The solid file-medical icon.See <a href='https://fontawesome.com/v6.0/icons/file-medical'>example</a>
         */
        FILE_MEDICAL,
        /**
         * The solid file-pdf icon.See <a href='https://fontawesome.com/v6.0/icons/file-pdf'>example</a>
         */
        FILE_PDF,
        /**
         * The solid file-powerpoint icon.See <a href='https://fontawesome.com/v6.0/icons/file-powerpoint'>example</a>
         */
        FILE_POWERPOINT,
        /**
         * The solid file-prescription icon.See <a href='https://fontawesome.com/v6.0/icons/file-prescription'>example</a>
         */
        FILE_PRESCRIPTION,
        /**
         * The solid file-signature icon.See <a href='https://fontawesome.com/v6.0/icons/file-signature'>example</a>
         */
        FILE_SIGNATURE,
        /**
         * The solid file-video icon.See <a href='https://fontawesome.com/v6.0/icons/file-video'>example</a>
         */
        FILE_VIDEO,
        /**
         * The solid file-waveform icon.See <a href='https://fontawesome.com/v6.0/icons/file-waveform'>example</a>
         */
        FILE_WAVEFORM,
        /**
         * The solid file-word icon.See <a href='https://fontawesome.com/v6.0/icons/file-word'>example</a>
         */
        FILE_WORD,
        /**
         * The solid file-zipper icon.See <a href='https://fontawesome.com/v6.0/icons/file-zipper'>example</a>
         */
        FILE_ZIPPER,
        /**
         * The solid fill icon.See <a href='https://fontawesome.com/v6.0/icons/fill'>example</a>
         */
        FILL,
        /**
         * The solid fill-drip icon.See <a href='https://fontawesome.com/v6.0/icons/fill-drip'>example</a>
         */
        FILL_DRIP,
        /**
         * The solid film icon.See <a href='https://fontawesome.com/v6.0/icons/film'>example</a>
         */
        FILM,
        /**
         * The solid filter icon.See <a href='https://fontawesome.com/v6.0/icons/filter'>example</a>
         */
        FILTER,
        /**
         * The solid filter-circle-dollar icon.See <a href='https://fontawesome.com/v6.0/icons/filter-circle-dollar'>example</a>
         */
        FILTER_CIRCLE_DOLLAR,
        /**
         * The solid filter-circle-xmark icon.See <a href='https://fontawesome.com/v6.0/icons/filter-circle-xmark'>example</a>
         */
        FILTER_CIRCLE_XMARK,
        /**
         * The solid fingerprint icon.See <a href='https://fontawesome.com/v6.0/icons/fingerprint'>example</a>
         */
        FINGERPRINT,
        /**
         * The solid fire icon.See <a href='https://fontawesome.com/v6.0/icons/fire'>example</a>
         */
        FIRE,
        /**
         * The solid fire-extinguisher icon.See <a href='https://fontawesome.com/v6.0/icons/fire-extinguisher'>example</a>
         */
        FIRE_EXTINGUISHER,
        /**
         * The solid fire-flame-curved icon.See <a href='https://fontawesome.com/v6.0/icons/fire-flame-curved'>example</a>
         */
        FIRE_FLAME_CURVED,
        /**
         * The solid fire-flame-simple icon.See <a href='https://fontawesome.com/v6.0/icons/fire-flame-simple'>example</a>
         */
        FIRE_FLAME_SIMPLE,
        /**
         * The solid fish icon.See <a href='https://fontawesome.com/v6.0/icons/fish'>example</a>
         */
        FISH,
        /**
         * The solid flag icon.See <a href='https://fontawesome.com/v6.0/icons/flag'>example</a>
         */
        FLAG,
        /**
         * The solid flag-checkered icon.See <a href='https://fontawesome.com/v6.0/icons/flag-checkered'>example</a>
         */
        FLAG_CHECKERED,
        /**
         * The solid flag-usa icon.See <a href='https://fontawesome.com/v6.0/icons/flag-usa'>example</a>
         */
        FLAG_USA,
        /**
         * The solid flask icon.See <a href='https://fontawesome.com/v6.0/icons/flask'>example</a>
         */
        FLASK,
        /**
         * The solid floppy-disk icon.See <a href='https://fontawesome.com/v6.0/icons/floppy-disk'>example</a>
         */
        FLOPPY_DISK,
        /**
         * The solid florin-sign icon.See <a href='https://fontawesome.com/v6.0/icons/florin-sign'>example</a>
         */
        FLORIN_SIGN,
        /**
         * The solid folder icon.See <a href='https://fontawesome.com/v6.0/icons/folder'>example</a>
         */
        FOLDER,
        /**
         * The solid folder-minus icon.See <a href='https://fontawesome.com/v6.0/icons/folder-minus'>example</a>
         */
        FOLDER_MINUS,
        /**
         * The solid folder-open icon.See <a href='https://fontawesome.com/v6.0/icons/folder-open'>example</a>
         */
        FOLDER_OPEN,
        /**
         * The solid folder-plus icon.See <a href='https://fontawesome.com/v6.0/icons/folder-plus'>example</a>
         */
        FOLDER_PLUS,
        /**
         * The solid folder-tree icon.See <a href='https://fontawesome.com/v6.0/icons/folder-tree'>example</a>
         */
        FOLDER_TREE,
        /**
         * The solid font icon.See <a href='https://fontawesome.com/v6.0/icons/font'>example</a>
         */
        FONT,
        /**
         * The solid font-awesome icon.See <a href='https://fontawesome.com/v6.0/icons/font-awesome'>example</a>
         */
        FONT_AWESOME,
        /**
         * The solid football icon.See <a href='https://fontawesome.com/v6.0/icons/football'>example</a>
         */
        FOOTBALL,
        /**
         * The solid forward icon.See <a href='https://fontawesome.com/v6.0/icons/forward'>example</a>
         */
        FORWARD,
        /**
         * The solid forward-fast icon.See <a href='https://fontawesome.com/v6.0/icons/forward-fast'>example</a>
         */
        FORWARD_FAST,
        /**
         * The solid forward-step icon.See <a href='https://fontawesome.com/v6.0/icons/forward-step'>example</a>
         */
        FORWARD_STEP,
        /**
         * The solid franc-sign icon.See <a href='https://fontawesome.com/v6.0/icons/franc-sign'>example</a>
         */
        FRANC_SIGN,
        /**
         * The solid frog icon.See <a href='https://fontawesome.com/v6.0/icons/frog'>example</a>
         */
        FROG,
        /**
         * The solid futbol icon.See <a href='https://fontawesome.com/v6.0/icons/futbol'>example</a>
         */
        FUTBOL,
        /**
         * The solid g icon.See <a href='https://fontawesome.com/v6.0/icons/g'>example</a>
         */
        G,
        /**
         * The solid gamepad icon.See <a href='https://fontawesome.com/v6.0/icons/gamepad'>example</a>
         */
        GAMEPAD,
        /**
         * The solid gas-pump icon.See <a href='https://fontawesome.com/v6.0/icons/gas-pump'>example</a>
         */
        GAS_PUMP,
        /**
         * The solid gauge icon.See <a href='https://fontawesome.com/v6.0/icons/gauge'>example</a>
         */
        GAUGE,
        /**
         * The solid gauge-high icon.See <a href='https://fontawesome.com/v6.0/icons/gauge-high'>example</a>
         */
        GAUGE_HIGH,
        /**
         * The solid gauge-simple icon.See <a href='https://fontawesome.com/v6.0/icons/gauge-simple'>example</a>
         */
        GAUGE_SIMPLE,
        /**
         * The solid gauge-simple-high icon.See <a href='https://fontawesome.com/v6.0/icons/gauge-simple-high'>example</a>
         */
        GAUGE_SIMPLE_HIGH,
        /**
         * The solid gavel icon.See <a href='https://fontawesome.com/v6.0/icons/gavel'>example</a>
         */
        GAVEL,
        /**
         * The solid gear icon.See <a href='https://fontawesome.com/v6.0/icons/gear'>example</a>
         */
        GEAR,
        /**
         * The solid gears icon.See <a href='https://fontawesome.com/v6.0/icons/gears'>example</a>
         */
        GEARS,
        /**
         * The solid gem icon.See <a href='https://fontawesome.com/v6.0/icons/gem'>example</a>
         */
        GEM,
        /**
         * The solid genderless icon.See <a href='https://fontawesome.com/v6.0/icons/genderless'>example</a>
         */
        GENDERLESS,
        /**
         * The solid ghost icon.See <a href='https://fontawesome.com/v6.0/icons/ghost'>example</a>
         */
        GHOST,
        /**
         * The solid gift icon.See <a href='https://fontawesome.com/v6.0/icons/gift'>example</a>
         */
        GIFT,
        /**
         * The solid gifts icon.See <a href='https://fontawesome.com/v6.0/icons/gifts'>example</a>
         */
        GIFTS,
        /**
         * The solid glasses icon.See <a href='https://fontawesome.com/v6.0/icons/glasses'>example</a>
         */
        GLASSES,
        /**
         * The solid globe icon.See <a href='https://fontawesome.com/v6.0/icons/globe'>example</a>
         */
        GLOBE,
        /**
         * The solid golf-ball-tee icon.See <a href='https://fontawesome.com/v6.0/icons/golf-ball-tee'>example</a>
         */
        GOLF_BALL_TEE,
        /**
         * The solid gopuram icon.See <a href='https://fontawesome.com/v6.0/icons/gopuram'>example</a>
         */
        GOPURAM,
        /**
         * The solid graduation-cap icon.See <a href='https://fontawesome.com/v6.0/icons/graduation-cap'>example</a>
         */
        GRADUATION_CAP,
        /**
         * The solid greater-than icon.See <a href='https://fontawesome.com/v6.0/icons/greater-than'>example</a>
         */
        GREATER_THAN,
        /**
         * The solid greater-than-equal icon.See <a href='https://fontawesome.com/v6.0/icons/greater-than-equal'>example</a>
         */
        GREATER_THAN_EQUAL,
        /**
         * The solid grip icon.See <a href='https://fontawesome.com/v6.0/icons/grip'>example</a>
         */
        GRIP,
        /**
         * The solid grip-lines icon.See <a href='https://fontawesome.com/v6.0/icons/grip-lines'>example</a>
         */
        GRIP_LINES,
        /**
         * The solid grip-lines-vertical icon.See <a href='https://fontawesome.com/v6.0/icons/grip-lines-vertical'>example</a>
         */
        GRIP_LINES_VERTICAL,
        /**
         * The solid grip-vertical icon.See <a href='https://fontawesome.com/v6.0/icons/grip-vertical'>example</a>
         */
        GRIP_VERTICAL,
        /**
         * The solid guarani-sign icon.See <a href='https://fontawesome.com/v6.0/icons/guarani-sign'>example</a>
         */
        GUARANI_SIGN,
        /**
         * The solid guitar icon.See <a href='https://fontawesome.com/v6.0/icons/guitar'>example</a>
         */
        GUITAR,
        /**
         * The solid gun icon.See <a href='https://fontawesome.com/v6.0/icons/gun'>example</a>
         */
        GUN,
        /**
         * The solid h icon.See <a href='https://fontawesome.com/v6.0/icons/h'>example</a>
         */
        H,
        /**
         * The solid hammer icon.See <a href='https://fontawesome.com/v6.0/icons/hammer'>example</a>
         */
        HAMMER,
        /**
         * The solid hamsa icon.See <a href='https://fontawesome.com/v6.0/icons/hamsa'>example</a>
         */
        HAMSA,
        /**
         * The solid hand icon.See <a href='https://fontawesome.com/v6.0/icons/hand'>example</a>
         */
        HAND,
        /**
         * The solid hand-back-fist icon.See <a href='https://fontawesome.com/v6.0/icons/hand-back-fist'>example</a>
         */
        HAND_BACK_FIST,
        /**
         * The solid hand-dots icon.See <a href='https://fontawesome.com/v6.0/icons/hand-dots'>example</a>
         */
        HAND_DOTS,
        /**
         * The solid hand-fist icon.See <a href='https://fontawesome.com/v6.0/icons/hand-fist'>example</a>
         */
        HAND_FIST,
        /**
         * The solid hand-holding icon.See <a href='https://fontawesome.com/v6.0/icons/hand-holding'>example</a>
         */
        HAND_HOLDING,
        /**
         * The solid hand-holding-dollar icon.See <a href='https://fontawesome.com/v6.0/icons/hand-holding-dollar'>example</a>
         */
        HAND_HOLDING_DOLLAR,
        /**
         * The solid hand-holding-droplet icon.See <a href='https://fontawesome.com/v6.0/icons/hand-holding-droplet'>example</a>
         */
        HAND_HOLDING_DROPLET,
        /**
         * The solid hand-holding-heart icon.See <a href='https://fontawesome.com/v6.0/icons/hand-holding-heart'>example</a>
         */
        HAND_HOLDING_HEART,
        /**
         * The solid hand-holding-medical icon.See <a href='https://fontawesome.com/v6.0/icons/hand-holding-medical'>example</a>
         */
        HAND_HOLDING_MEDICAL,
        /**
         * The solid hand-lizard icon.See <a href='https://fontawesome.com/v6.0/icons/hand-lizard'>example</a>
         */
        HAND_LIZARD,
        /**
         * The solid hand-middle-finger icon.See <a href='https://fontawesome.com/v6.0/icons/hand-middle-finger'>example</a>
         */
        HAND_MIDDLE_FINGER,
        /**
         * The solid hand-peace icon.See <a href='https://fontawesome.com/v6.0/icons/hand-peace'>example</a>
         */
        HAND_PEACE,
        /**
         * The solid hand-point-down icon.See <a href='https://fontawesome.com/v6.0/icons/hand-point-down'>example</a>
         */
        HAND_POINT_DOWN,
        /**
         * The solid hand-point-left icon.See <a href='https://fontawesome.com/v6.0/icons/hand-point-left'>example</a>
         */
        HAND_POINT_LEFT,
        /**
         * The solid hand-point-right icon.See <a href='https://fontawesome.com/v6.0/icons/hand-point-right'>example</a>
         */
        HAND_POINT_RIGHT,
        /**
         * The solid hand-point-up icon.See <a href='https://fontawesome.com/v6.0/icons/hand-point-up'>example</a>
         */
        HAND_POINT_UP,
        /**
         * The solid hand-pointer icon.See <a href='https://fontawesome.com/v6.0/icons/hand-pointer'>example</a>
         */
        HAND_POINTER,
        /**
         * The solid hand-scissors icon.See <a href='https://fontawesome.com/v6.0/icons/hand-scissors'>example</a>
         */
        HAND_SCISSORS,
        /**
         * The solid hand-sparkles icon.See <a href='https://fontawesome.com/v6.0/icons/hand-sparkles'>example</a>
         */
        HAND_SPARKLES,
        /**
         * The solid hand-spock icon.See <a href='https://fontawesome.com/v6.0/icons/hand-spock'>example</a>
         */
        HAND_SPOCK,
        /**
         * The solid hands icon.See <a href='https://fontawesome.com/v6.0/icons/hands'>example</a>
         */
        HANDS,
        /**
         * The solid hands-asl-interpreting icon.See <a href='https://fontawesome.com/v6.0/icons/hands-asl-interpreting'>example</a>
         */
        HANDS_ASL_INTERPRETING,
        /**
         * The solid hands-bubbles icon.See <a href='https://fontawesome.com/v6.0/icons/hands-bubbles'>example</a>
         */
        HANDS_BUBBLES,
        /**
         * The solid hands-clapping icon.See <a href='https://fontawesome.com/v6.0/icons/hands-clapping'>example</a>
         */
        HANDS_CLAPPING,
        /**
         * The solid hands-holding icon.See <a href='https://fontawesome.com/v6.0/icons/hands-holding'>example</a>
         */
        HANDS_HOLDING,
        /**
         * The solid hands-praying icon.See <a href='https://fontawesome.com/v6.0/icons/hands-praying'>example</a>
         */
        HANDS_PRAYING,
        /**
         * The solid handshake icon.See <a href='https://fontawesome.com/v6.0/icons/handshake'>example</a>
         */
        HANDSHAKE,
        /**
         * The solid handshake-angle icon.See <a href='https://fontawesome.com/v6.0/icons/handshake-angle'>example</a>
         */
        HANDSHAKE_ANGLE,
        /**
         * The solid handshake-simple-slash icon.See <a href='https://fontawesome.com/v6.0/icons/handshake-simple-slash'>example</a>
         */
        HANDSHAKE_SIMPLE_SLASH,
        /**
         * The solid handshake-slash icon.See <a href='https://fontawesome.com/v6.0/icons/handshake-slash'>example</a>
         */
        HANDSHAKE_SLASH,
        /**
         * The solid hanukiah icon.See <a href='https://fontawesome.com/v6.0/icons/hanukiah'>example</a>
         */
        HANUKIAH,
        /**
         * The solid hard-drive icon.See <a href='https://fontawesome.com/v6.0/icons/hard-drive'>example</a>
         */
        HARD_DRIVE,
        /**
         * The solid hashtag icon.See <a href='https://fontawesome.com/v6.0/icons/hashtag'>example</a>
         */
        HASHTAG,
        /**
         * The solid hat-cowboy icon.See <a href='https://fontawesome.com/v6.0/icons/hat-cowboy'>example</a>
         */
        HAT_COWBOY,
        /**
         * The solid hat-cowboy-side icon.See <a href='https://fontawesome.com/v6.0/icons/hat-cowboy-side'>example</a>
         */
        HAT_COWBOY_SIDE,
        /**
         * The solid hat-wizard icon.See <a href='https://fontawesome.com/v6.0/icons/hat-wizard'>example</a>
         */
        HAT_WIZARD,
        /**
         * The solid head-side-cough icon.See <a href='https://fontawesome.com/v6.0/icons/head-side-cough'>example</a>
         */
        HEAD_SIDE_COUGH,
        /**
         * The solid head-side-cough-slash icon.See <a href='https://fontawesome.com/v6.0/icons/head-side-cough-slash'>example</a>
         */
        HEAD_SIDE_COUGH_SLASH,
        /**
         * The solid head-side-mask icon.See <a href='https://fontawesome.com/v6.0/icons/head-side-mask'>example</a>
         */
        HEAD_SIDE_MASK,
        /**
         * The solid head-side-virus icon.See <a href='https://fontawesome.com/v6.0/icons/head-side-virus'>example</a>
         */
        HEAD_SIDE_VIRUS,
        /**
         * The solid heading icon.See <a href='https://fontawesome.com/v6.0/icons/heading'>example</a>
         */
        HEADING,
        /**
         * The solid headphones icon.See <a href='https://fontawesome.com/v6.0/icons/headphones'>example</a>
         */
        HEADPHONES,
        /**
         * The solid headphones-simple icon.See <a href='https://fontawesome.com/v6.0/icons/headphones-simple'>example</a>
         */
        HEADPHONES_SIMPLE,
        /**
         * The solid headset icon.See <a href='https://fontawesome.com/v6.0/icons/headset'>example</a>
         */
        HEADSET,
        /**
         * The solid heart icon.See <a href='https://fontawesome.com/v6.0/icons/heart'>example</a>
         */
        HEART,
        /**
         * The solid heart-crack icon.See <a href='https://fontawesome.com/v6.0/icons/heart-crack'>example</a>
         */
        HEART_CRACK,
        /**
         * The solid heart-pulse icon.See <a href='https://fontawesome.com/v6.0/icons/heart-pulse'>example</a>
         */
        HEART_PULSE,
        /**
         * The solid helicopter icon.See <a href='https://fontawesome.com/v6.0/icons/helicopter'>example</a>
         */
        HELICOPTER,
        /**
         * The solid helmet-safety icon.See <a href='https://fontawesome.com/v6.0/icons/helmet-safety'>example</a>
         */
        HELMET_SAFETY,
        /**
         * The solid highlighter icon.See <a href='https://fontawesome.com/v6.0/icons/highlighter'>example</a>
         */
        HIGHLIGHTER,
        /**
         * The solid hippo icon.See <a href='https://fontawesome.com/v6.0/icons/hippo'>example</a>
         */
        HIPPO,
        /**
         * The solid hockey-puck icon.See <a href='https://fontawesome.com/v6.0/icons/hockey-puck'>example</a>
         */
        HOCKEY_PUCK,
        /**
         * The solid holly-berry icon.See <a href='https://fontawesome.com/v6.0/icons/holly-berry'>example</a>
         */
        HOLLY_BERRY,
        /**
         * The solid horse icon.See <a href='https://fontawesome.com/v6.0/icons/horse'>example</a>
         */
        HORSE,
        /**
         * The solid horse-head icon.See <a href='https://fontawesome.com/v6.0/icons/horse-head'>example</a>
         */
        HORSE_HEAD,
        /**
         * The solid hospital icon.See <a href='https://fontawesome.com/v6.0/icons/hospital'>example</a>
         */
        HOSPITAL,
        /**
         * The solid hospital-user icon.See <a href='https://fontawesome.com/v6.0/icons/hospital-user'>example</a>
         */
        HOSPITAL_USER,
        /**
         * The solid hot-tub-person icon.See <a href='https://fontawesome.com/v6.0/icons/hot-tub-person'>example</a>
         */
        HOT_TUB_PERSON,
        /**
         * The solid hotdog icon.See <a href='https://fontawesome.com/v6.0/icons/hotdog'>example</a>
         */
        HOTDOG,
        /**
         * The solid hotel icon.See <a href='https://fontawesome.com/v6.0/icons/hotel'>example</a>
         */
        HOTEL,
        /**
         * The solid hourglass icon.See <a href='https://fontawesome.com/v6.0/icons/hourglass'>example</a>
         */
        HOURGLASS,
        /**
         * The solid hourglass-empty icon.See <a href='https://fontawesome.com/v6.0/icons/hourglass-empty'>example</a>
         */
        HOURGLASS_EMPTY,
        /**
         * The solid hourglass-end icon.See <a href='https://fontawesome.com/v6.0/icons/hourglass-end'>example</a>
         */
        HOURGLASS_END,
        /**
         * The solid hourglass-start icon.See <a href='https://fontawesome.com/v6.0/icons/hourglass-start'>example</a>
         */
        HOURGLASS_START,
        /**
         * The solid house icon.See <a href='https://fontawesome.com/v6.0/icons/house'>example</a>
         */
        HOUSE,
        /**
         * The solid house-chimney icon.See <a href='https://fontawesome.com/v6.0/icons/house-chimney'>example</a>
         */
        HOUSE_CHIMNEY,
        /**
         * The solid house-chimney-crack icon.See <a href='https://fontawesome.com/v6.0/icons/house-chimney-crack'>example</a>
         */
        HOUSE_CHIMNEY_CRACK,
        /**
         * The solid house-chimney-medical icon.See <a href='https://fontawesome.com/v6.0/icons/house-chimney-medical'>example</a>
         */
        HOUSE_CHIMNEY_MEDICAL,
        /**
         * The solid house-chimney-user icon.See <a href='https://fontawesome.com/v6.0/icons/house-chimney-user'>example</a>
         */
        HOUSE_CHIMNEY_USER,
        /**
         * The solid house-chimney-window icon.See <a href='https://fontawesome.com/v6.0/icons/house-chimney-window'>example</a>
         */
        HOUSE_CHIMNEY_WINDOW,
        /**
         * The solid house-crack icon.See <a href='https://fontawesome.com/v6.0/icons/house-crack'>example</a>
         */
        HOUSE_CRACK,
        /**
         * The solid house-laptop icon.See <a href='https://fontawesome.com/v6.0/icons/house-laptop'>example</a>
         */
        HOUSE_LAPTOP,
        /**
         * The solid house-medical icon.See <a href='https://fontawesome.com/v6.0/icons/house-medical'>example</a>
         */
        HOUSE_MEDICAL,
        /**
         * The solid house-user icon.See <a href='https://fontawesome.com/v6.0/icons/house-user'>example</a>
         */
        HOUSE_USER,
        /**
         * The solid hryvnia-sign icon.See <a href='https://fontawesome.com/v6.0/icons/hryvnia-sign'>example</a>
         */
        HRYVNIA_SIGN,
        /**
         * The solid i icon.See <a href='https://fontawesome.com/v6.0/icons/i'>example</a>
         */
        I,
        /**
         * The solid i-cursor icon.See <a href='https://fontawesome.com/v6.0/icons/i-cursor'>example</a>
         */
        I_CURSOR,
        /**
         * The solid ice-cream icon.See <a href='https://fontawesome.com/v6.0/icons/ice-cream'>example</a>
         */
        ICE_CREAM,
        /**
         * The solid icicles icon.See <a href='https://fontawesome.com/v6.0/icons/icicles'>example</a>
         */
        ICICLES,
        /**
         * The solid icons icon.See <a href='https://fontawesome.com/v6.0/icons/icons'>example</a>
         */
        ICONS,
        /**
         * The solid id-badge icon.See <a href='https://fontawesome.com/v6.0/icons/id-badge'>example</a>
         */
        ID_BADGE,
        /**
         * The solid id-card icon.See <a href='https://fontawesome.com/v6.0/icons/id-card'>example</a>
         */
        ID_CARD,
        /**
         * The solid id-card-clip icon.See <a href='https://fontawesome.com/v6.0/icons/id-card-clip'>example</a>
         */
        ID_CARD_CLIP,
        /**
         * The solid igloo icon.See <a href='https://fontawesome.com/v6.0/icons/igloo'>example</a>
         */
        IGLOO,
        /**
         * The solid image icon.See <a href='https://fontawesome.com/v6.0/icons/image'>example</a>
         */
        IMAGE,
        /**
         * The solid image-portrait icon.See <a href='https://fontawesome.com/v6.0/icons/image-portrait'>example</a>
         */
        IMAGE_PORTRAIT,
        /**
         * The solid images icon.See <a href='https://fontawesome.com/v6.0/icons/images'>example</a>
         */
        IMAGES,
        /**
         * The solid inbox icon.See <a href='https://fontawesome.com/v6.0/icons/inbox'>example</a>
         */
        INBOX,
        /**
         * The solid indent icon.See <a href='https://fontawesome.com/v6.0/icons/indent'>example</a>
         */
        INDENT,
        /**
         * The solid indian-rupee-sign icon.See <a href='https://fontawesome.com/v6.0/icons/indian-rupee-sign'>example</a>
         */
        INDIAN_RUPEE_SIGN,
        /**
         * The solid industry icon.See <a href='https://fontawesome.com/v6.0/icons/industry'>example</a>
         */
        INDUSTRY,
        /**
         * The solid infinity icon.See <a href='https://fontawesome.com/v6.0/icons/infinity'>example</a>
         */
        INFINITY,
        /**
         * The solid info icon.See <a href='https://fontawesome.com/v6.0/icons/info'>example</a>
         */
        INFO,
        /**
         * The solid italic icon.See <a href='https://fontawesome.com/v6.0/icons/italic'>example</a>
         */
        ITALIC,
        /**
         * The solid j icon.See <a href='https://fontawesome.com/v6.0/icons/j'>example</a>
         */
        J,
        /**
         * The solid jedi icon.See <a href='https://fontawesome.com/v6.0/icons/jedi'>example</a>
         */
        JEDI,
        /**
         * The solid jet-fighter icon.See <a href='https://fontawesome.com/v6.0/icons/jet-fighter'>example</a>
         */
        JET_FIGHTER,
        /**
         * The solid joint icon.See <a href='https://fontawesome.com/v6.0/icons/joint'>example</a>
         */
        JOINT,
        /**
         * The solid k icon.See <a href='https://fontawesome.com/v6.0/icons/k'>example</a>
         */
        K,
        /**
         * The solid kaaba icon.See <a href='https://fontawesome.com/v6.0/icons/kaaba'>example</a>
         */
        KAABA,
        /**
         * The solid key icon.See <a href='https://fontawesome.com/v6.0/icons/key'>example</a>
         */
        KEY,
        /**
         * The solid keyboard icon.See <a href='https://fontawesome.com/v6.0/icons/keyboard'>example</a>
         */
        KEYBOARD,
        /**
         * The solid khanda icon.See <a href='https://fontawesome.com/v6.0/icons/khanda'>example</a>
         */
        KHANDA,
        /**
         * The solid kip-sign icon.See <a href='https://fontawesome.com/v6.0/icons/kip-sign'>example</a>
         */
        KIP_SIGN,
        /**
         * The solid kit-medical icon.See <a href='https://fontawesome.com/v6.0/icons/kit-medical'>example</a>
         */
        KIT_MEDICAL,
        /**
         * The solid kiwi-bird icon.See <a href='https://fontawesome.com/v6.0/icons/kiwi-bird'>example</a>
         */
        KIWI_BIRD,
        /**
         * The solid l icon.See <a href='https://fontawesome.com/v6.0/icons/l'>example</a>
         */
        L,
        /**
         * The solid landmark icon.See <a href='https://fontawesome.com/v6.0/icons/landmark'>example</a>
         */
        LANDMARK,
        /**
         * The solid language icon.See <a href='https://fontawesome.com/v6.0/icons/language'>example</a>
         */
        LANGUAGE,
        /**
         * The solid laptop icon.See <a href='https://fontawesome.com/v6.0/icons/laptop'>example</a>
         */
        LAPTOP,
        /**
         * The solid laptop-code icon.See <a href='https://fontawesome.com/v6.0/icons/laptop-code'>example</a>
         */
        LAPTOP_CODE,
        /**
         * The solid laptop-medical icon.See <a href='https://fontawesome.com/v6.0/icons/laptop-medical'>example</a>
         */
        LAPTOP_MEDICAL,
        /**
         * The solid lari-sign icon.See <a href='https://fontawesome.com/v6.0/icons/lari-sign'>example</a>
         */
        LARI_SIGN,
        /**
         * The solid layer-group icon.See <a href='https://fontawesome.com/v6.0/icons/layer-group'>example</a>
         */
        LAYER_GROUP,
        /**
         * The solid leaf icon.See <a href='https://fontawesome.com/v6.0/icons/leaf'>example</a>
         */
        LEAF,
        /**
         * The solid left-long icon.See <a href='https://fontawesome.com/v6.0/icons/left-long'>example</a>
         */
        LEFT_LONG,
        /**
         * The solid left-right icon.See <a href='https://fontawesome.com/v6.0/icons/left-right'>example</a>
         */
        LEFT_RIGHT,
        /**
         * The solid lemon icon.See <a href='https://fontawesome.com/v6.0/icons/lemon'>example</a>
         */
        LEMON,
        /**
         * The solid less-than icon.See <a href='https://fontawesome.com/v6.0/icons/less-than'>example</a>
         */
        LESS_THAN,
        /**
         * The solid less-than-equal icon.See <a href='https://fontawesome.com/v6.0/icons/less-than-equal'>example</a>
         */
        LESS_THAN_EQUAL,
        /**
         * The solid life-ring icon.See <a href='https://fontawesome.com/v6.0/icons/life-ring'>example</a>
         */
        LIFE_RING,
        /**
         * The solid lightbulb icon.See <a href='https://fontawesome.com/v6.0/icons/lightbulb'>example</a>
         */
        LIGHTBULB,
        /**
         * The solid link icon.See <a href='https://fontawesome.com/v6.0/icons/link'>example</a>
         */
        LINK,
        /**
         * The solid link-slash icon.See <a href='https://fontawesome.com/v6.0/icons/link-slash'>example</a>
         */
        LINK_SLASH,
        /**
         * The solid lira-sign icon.See <a href='https://fontawesome.com/v6.0/icons/lira-sign'>example</a>
         */
        LIRA_SIGN,
        /**
         * The solid list icon.See <a href='https://fontawesome.com/v6.0/icons/list'>example</a>
         */
        LIST,
        /**
         * The solid list-check icon.See <a href='https://fontawesome.com/v6.0/icons/list-check'>example</a>
         */
        LIST_CHECK,
        /**
         * The solid list-ol icon.See <a href='https://fontawesome.com/v6.0/icons/list-ol'>example</a>
         */
        LIST_OL,
        /**
         * The solid list-ul icon.See <a href='https://fontawesome.com/v6.0/icons/list-ul'>example</a>
         */
        LIST_UL,
        /**
         * The solid litecoin-sign icon.See <a href='https://fontawesome.com/v6.0/icons/litecoin-sign'>example</a>
         */
        LITECOIN_SIGN,
        /**
         * The solid location-arrow icon.See <a href='https://fontawesome.com/v6.0/icons/location-arrow'>example</a>
         */
        LOCATION_ARROW,
        /**
         * The solid location-crosshairs icon.See <a href='https://fontawesome.com/v6.0/icons/location-crosshairs'>example</a>
         */
        LOCATION_CROSSHAIRS,
        /**
         * The solid location-dot icon.See <a href='https://fontawesome.com/v6.0/icons/location-dot'>example</a>
         */
        LOCATION_DOT,
        /**
         * The solid location-pin icon.See <a href='https://fontawesome.com/v6.0/icons/location-pin'>example</a>
         */
        LOCATION_PIN,
        /**
         * The solid lock icon.See <a href='https://fontawesome.com/v6.0/icons/lock'>example</a>
         */
        LOCK,
        /**
         * The solid lock-open icon.See <a href='https://fontawesome.com/v6.0/icons/lock-open'>example</a>
         */
        LOCK_OPEN,
        /**
         * The solid lungs icon.See <a href='https://fontawesome.com/v6.0/icons/lungs'>example</a>
         */
        LUNGS,
        /**
         * The solid lungs-virus icon.See <a href='https://fontawesome.com/v6.0/icons/lungs-virus'>example</a>
         */
        LUNGS_VIRUS,
        /**
         * The solid m icon.See <a href='https://fontawesome.com/v6.0/icons/m'>example</a>
         */
        M,
        /**
         * The solid magnet icon.See <a href='https://fontawesome.com/v6.0/icons/magnet'>example</a>
         */
        MAGNET,
        /**
         * The solid magnifying-glass icon.See <a href='https://fontawesome.com/v6.0/icons/magnifying-glass'>example</a>
         */
        MAGNIFYING_GLASS,
        /**
         * The solid magnifying-glass-dollar icon.See <a href='https://fontawesome.com/v6.0/icons/magnifying-glass-dollar'>example</a>
         */
        MAGNIFYING_GLASS_DOLLAR,
        /**
         * The solid magnifying-glass-location icon.See <a href='https://fontawesome.com/v6.0/icons/magnifying-glass-location'>example</a>
         */
        MAGNIFYING_GLASS_LOCATION,
        /**
         * The solid magnifying-glass-minus icon.See <a href='https://fontawesome.com/v6.0/icons/magnifying-glass-minus'>example</a>
         */
        MAGNIFYING_GLASS_MINUS,
        /**
         * The solid magnifying-glass-plus icon.See <a href='https://fontawesome.com/v6.0/icons/magnifying-glass-plus'>example</a>
         */
        MAGNIFYING_GLASS_PLUS,
        /**
         * The solid manat-sign icon.See <a href='https://fontawesome.com/v6.0/icons/manat-sign'>example</a>
         */
        MANAT_SIGN,
        /**
         * The solid map icon.See <a href='https://fontawesome.com/v6.0/icons/map'>example</a>
         */
        MAP,
        /**
         * The solid map-location icon.See <a href='https://fontawesome.com/v6.0/icons/map-location'>example</a>
         */
        MAP_LOCATION,
        /**
         * The solid map-location-dot icon.See <a href='https://fontawesome.com/v6.0/icons/map-location-dot'>example</a>
         */
        MAP_LOCATION_DOT,
        /**
         * The solid map-pin icon.See <a href='https://fontawesome.com/v6.0/icons/map-pin'>example</a>
         */
        MAP_PIN,
        /**
         * The solid marker icon.See <a href='https://fontawesome.com/v6.0/icons/marker'>example</a>
         */
        MARKER,
        /**
         * The solid mars icon.See <a href='https://fontawesome.com/v6.0/icons/mars'>example</a>
         */
        MARS,
        /**
         * The solid mars-and-venus icon.See <a href='https://fontawesome.com/v6.0/icons/mars-and-venus'>example</a>
         */
        MARS_AND_VENUS,
        /**
         * The solid mars-double icon.See <a href='https://fontawesome.com/v6.0/icons/mars-double'>example</a>
         */
        MARS_DOUBLE,
        /**
         * The solid mars-stroke icon.See <a href='https://fontawesome.com/v6.0/icons/mars-stroke'>example</a>
         */
        MARS_STROKE,
        /**
         * The solid mars-stroke-right icon.See <a href='https://fontawesome.com/v6.0/icons/mars-stroke-right'>example</a>
         */
        MARS_STROKE_RIGHT,
        /**
         * The solid mars-stroke-up icon.See <a href='https://fontawesome.com/v6.0/icons/mars-stroke-up'>example</a>
         */
        MARS_STROKE_UP,
        /**
         * The solid martini-glass icon.See <a href='https://fontawesome.com/v6.0/icons/martini-glass'>example</a>
         */
        MARTINI_GLASS,
        /**
         * The solid martini-glass-citrus icon.See <a href='https://fontawesome.com/v6.0/icons/martini-glass-citrus'>example</a>
         */
        MARTINI_GLASS_CITRUS,
        /**
         * The solid martini-glass-empty icon.See <a href='https://fontawesome.com/v6.0/icons/martini-glass-empty'>example</a>
         */
        MARTINI_GLASS_EMPTY,
        /**
         * The solid mask icon.See <a href='https://fontawesome.com/v6.0/icons/mask'>example</a>
         */
        MASK,
        /**
         * The solid mask-face icon.See <a href='https://fontawesome.com/v6.0/icons/mask-face'>example</a>
         */
        MASK_FACE,
        /**
         * The solid masks-theater icon.See <a href='https://fontawesome.com/v6.0/icons/masks-theater'>example</a>
         */
        MASKS_THEATER,
        /**
         * The solid maximize icon.See <a href='https://fontawesome.com/v6.0/icons/maximize'>example</a>
         */
        MAXIMIZE,
        /**
         * The solid medal icon.See <a href='https://fontawesome.com/v6.0/icons/medal'>example</a>
         */
        MEDAL,
        /**
         * The solid memory icon.See <a href='https://fontawesome.com/v6.0/icons/memory'>example</a>
         */
        MEMORY,
        /**
         * The solid menorah icon.See <a href='https://fontawesome.com/v6.0/icons/menorah'>example</a>
         */
        MENORAH,
        /**
         * The solid mercury icon.See <a href='https://fontawesome.com/v6.0/icons/mercury'>example</a>
         */
        MERCURY,
        /**
         * The solid message icon.See <a href='https://fontawesome.com/v6.0/icons/message'>example</a>
         */
        MESSAGE,
        /**
         * The solid meteor icon.See <a href='https://fontawesome.com/v6.0/icons/meteor'>example</a>
         */
        METEOR,
        /**
         * The solid microchip icon.See <a href='https://fontawesome.com/v6.0/icons/microchip'>example</a>
         */
        MICROCHIP,
        /**
         * The solid microphone icon.See <a href='https://fontawesome.com/v6.0/icons/microphone'>example</a>
         */
        MICROPHONE,
        /**
         * The solid microphone-lines icon.See <a href='https://fontawesome.com/v6.0/icons/microphone-lines'>example</a>
         */
        MICROPHONE_LINES,
        /**
         * The solid microphone-lines-slash icon.See <a href='https://fontawesome.com/v6.0/icons/microphone-lines-slash'>example</a>
         */
        MICROPHONE_LINES_SLASH,
        /**
         * The solid microphone-slash icon.See <a href='https://fontawesome.com/v6.0/icons/microphone-slash'>example</a>
         */
        MICROPHONE_SLASH,
        /**
         * The solid microscope icon.See <a href='https://fontawesome.com/v6.0/icons/microscope'>example</a>
         */
        MICROSCOPE,
        /**
         * The solid mill-sign icon.See <a href='https://fontawesome.com/v6.0/icons/mill-sign'>example</a>
         */
        MILL_SIGN,
        /**
         * The solid minimize icon.See <a href='https://fontawesome.com/v6.0/icons/minimize'>example</a>
         */
        MINIMIZE,
        /**
         * The solid minus icon.See <a href='https://fontawesome.com/v6.0/icons/minus'>example</a>
         */
        MINUS,
        /**
         * The solid mitten icon.See <a href='https://fontawesome.com/v6.0/icons/mitten'>example</a>
         */
        MITTEN,
        /**
         * The solid mobile icon.See <a href='https://fontawesome.com/v6.0/icons/mobile'>example</a>
         */
        MOBILE,
        /**
         * The solid mobile-button icon.See <a href='https://fontawesome.com/v6.0/icons/mobile-button'>example</a>
         */
        MOBILE_BUTTON,
        /**
         * The solid mobile-screen-button icon.See <a href='https://fontawesome.com/v6.0/icons/mobile-screen-button'>example</a>
         */
        MOBILE_SCREEN_BUTTON,
        /**
         * The solid money-bill icon.See <a href='https://fontawesome.com/v6.0/icons/money-bill'>example</a>
         */
        MONEY_BILL,
        /**
         * The solid money-bill-1 icon.See <a href='https://fontawesome.com/v6.0/icons/money-bill-1'>example</a>
         */
        MONEY_BILL_1,
        /**
         * The solid money-bill-1-wave icon.See <a href='https://fontawesome.com/v6.0/icons/money-bill-1-wave'>example</a>
         */
        MONEY_BILL_1_WAVE,
        /**
         * The solid money-bill-wave icon.See <a href='https://fontawesome.com/v6.0/icons/money-bill-wave'>example</a>
         */
        MONEY_BILL_WAVE,
        /**
         * The solid money-check icon.See <a href='https://fontawesome.com/v6.0/icons/money-check'>example</a>
         */
        MONEY_CHECK,
        /**
         * The solid money-check-dollar icon.See <a href='https://fontawesome.com/v6.0/icons/money-check-dollar'>example</a>
         */
        MONEY_CHECK_DOLLAR,
        /**
         * The solid monument icon.See <a href='https://fontawesome.com/v6.0/icons/monument'>example</a>
         */
        MONUMENT,
        /**
         * The solid moon icon.See <a href='https://fontawesome.com/v6.0/icons/moon'>example</a>
         */
        MOON,
        /**
         * The solid mortar-pestle icon.See <a href='https://fontawesome.com/v6.0/icons/mortar-pestle'>example</a>
         */
        MORTAR_PESTLE,
        /**
         * The solid mosque icon.See <a href='https://fontawesome.com/v6.0/icons/mosque'>example</a>
         */
        MOSQUE,
        /**
         * The solid motorcycle icon.See <a href='https://fontawesome.com/v6.0/icons/motorcycle'>example</a>
         */
        MOTORCYCLE,
        /**
         * The solid mountain icon.See <a href='https://fontawesome.com/v6.0/icons/mountain'>example</a>
         */
        MOUNTAIN,
        /**
         * The solid mug-hot icon.See <a href='https://fontawesome.com/v6.0/icons/mug-hot'>example</a>
         */
        MUG_HOT,
        /**
         * The solid mug-saucer icon.See <a href='https://fontawesome.com/v6.0/icons/mug-saucer'>example</a>
         */
        MUG_SAUCER,
        /**
         * The solid music icon.See <a href='https://fontawesome.com/v6.0/icons/music'>example</a>
         */
        MUSIC,
        /**
         * The solid n icon.See <a href='https://fontawesome.com/v6.0/icons/n'>example</a>
         */
        N,
        /**
         * The solid naira-sign icon.See <a href='https://fontawesome.com/v6.0/icons/naira-sign'>example</a>
         */
        NAIRA_SIGN,
        /**
         * The solid network-wired icon.See <a href='https://fontawesome.com/v6.0/icons/network-wired'>example</a>
         */
        NETWORK_WIRED,
        /**
         * The solid neuter icon.See <a href='https://fontawesome.com/v6.0/icons/neuter'>example</a>
         */
        NEUTER,
        /**
         * The solid newspaper icon.See <a href='https://fontawesome.com/v6.0/icons/newspaper'>example</a>
         */
        NEWSPAPER,
        /**
         * The solid not-equal icon.See <a href='https://fontawesome.com/v6.0/icons/not-equal'>example</a>
         */
        NOT_EQUAL,
        /**
         * The solid note-sticky icon.See <a href='https://fontawesome.com/v6.0/icons/note-sticky'>example</a>
         */
        NOTE_STICKY,
        /**
         * The solid notes-medical icon.See <a href='https://fontawesome.com/v6.0/icons/notes-medical'>example</a>
         */
        NOTES_MEDICAL,
        /**
         * The solid o icon.See <a href='https://fontawesome.com/v6.0/icons/o'>example</a>
         */
        O,
        /**
         * The solid object-group icon.See <a href='https://fontawesome.com/v6.0/icons/object-group'>example</a>
         */
        OBJECT_GROUP,
        /**
         * The solid object-ungroup icon.See <a href='https://fontawesome.com/v6.0/icons/object-ungroup'>example</a>
         */
        OBJECT_UNGROUP,
        /**
         * The solid oil-can icon.See <a href='https://fontawesome.com/v6.0/icons/oil-can'>example</a>
         */
        OIL_CAN,
        /**
         * The solid om icon.See <a href='https://fontawesome.com/v6.0/icons/om'>example</a>
         */
        OM,
        /**
         * The solid otter icon.See <a href='https://fontawesome.com/v6.0/icons/otter'>example</a>
         */
        OTTER,
        /**
         * The solid outdent icon.See <a href='https://fontawesome.com/v6.0/icons/outdent'>example</a>
         */
        OUTDENT,
        /**
         * The solid p icon.See <a href='https://fontawesome.com/v6.0/icons/p'>example</a>
         */
        P,
        /**
         * The solid pager icon.See <a href='https://fontawesome.com/v6.0/icons/pager'>example</a>
         */
        PAGER,
        /**
         * The solid paint-roller icon.See <a href='https://fontawesome.com/v6.0/icons/paint-roller'>example</a>
         */
        PAINT_ROLLER,
        /**
         * The solid paintbrush icon.See <a href='https://fontawesome.com/v6.0/icons/paintbrush'>example</a>
         */
        PAINTBRUSH,
        /**
         * The solid palette icon.See <a href='https://fontawesome.com/v6.0/icons/palette'>example</a>
         */
        PALETTE,
        /**
         * The solid pallet icon.See <a href='https://fontawesome.com/v6.0/icons/pallet'>example</a>
         */
        PALLET,
        /**
         * The solid panorama icon.See <a href='https://fontawesome.com/v6.0/icons/panorama'>example</a>
         */
        PANORAMA,
        /**
         * The solid paper-plane icon.See <a href='https://fontawesome.com/v6.0/icons/paper-plane'>example</a>
         */
        PAPER_PLANE,
        /**
         * The solid paperclip icon.See <a href='https://fontawesome.com/v6.0/icons/paperclip'>example</a>
         */
        PAPERCLIP,
        /**
         * The solid parachute-box icon.See <a href='https://fontawesome.com/v6.0/icons/parachute-box'>example</a>
         */
        PARACHUTE_BOX,
        /**
         * The solid paragraph icon.See <a href='https://fontawesome.com/v6.0/icons/paragraph'>example</a>
         */
        PARAGRAPH,
        /**
         * The solid passport icon.See <a href='https://fontawesome.com/v6.0/icons/passport'>example</a>
         */
        PASSPORT,
        /**
         * The solid paste icon.See <a href='https://fontawesome.com/v6.0/icons/paste'>example</a>
         */
        PASTE,
        /**
         * The solid pause icon.See <a href='https://fontawesome.com/v6.0/icons/pause'>example</a>
         */
        PAUSE,
        /**
         * The solid paw icon.See <a href='https://fontawesome.com/v6.0/icons/paw'>example</a>
         */
        PAW,
        /**
         * The solid peace icon.See <a href='https://fontawesome.com/v6.0/icons/peace'>example</a>
         */
        PEACE,
        /**
         * The solid pen icon.See <a href='https://fontawesome.com/v6.0/icons/pen'>example</a>
         */
        PEN,
        /**
         * The solid pen-clip icon.See <a href='https://fontawesome.com/v6.0/icons/pen-clip'>example</a>
         */
        PEN_CLIP,
        /**
         * The solid pen-fancy icon.See <a href='https://fontawesome.com/v6.0/icons/pen-fancy'>example</a>
         */
        PEN_FANCY,
        /**
         * The solid pen-nib icon.See <a href='https://fontawesome.com/v6.0/icons/pen-nib'>example</a>
         */
        PEN_NIB,
        /**
         * The solid pen-ruler icon.See <a href='https://fontawesome.com/v6.0/icons/pen-ruler'>example</a>
         */
        PEN_RULER,
        /**
         * The solid pen-to-square icon.See <a href='https://fontawesome.com/v6.0/icons/pen-to-square'>example</a>
         */
        PEN_TO_SQUARE,
        /**
         * The solid pencil icon.See <a href='https://fontawesome.com/v6.0/icons/pencil'>example</a>
         */
        PENCIL,
        /**
         * The solid people-arrows-left-right icon.See <a href='https://fontawesome.com/v6.0/icons/people-arrows-left-right'>example</a>
         */
        PEOPLE_ARROWS_LEFT_RIGHT,
        /**
         * The solid people-carry-box icon.See <a href='https://fontawesome.com/v6.0/icons/people-carry-box'>example</a>
         */
        PEOPLE_CARRY_BOX,
        /**
         * The solid pepper-hot icon.See <a href='https://fontawesome.com/v6.0/icons/pepper-hot'>example</a>
         */
        PEPPER_HOT,
        /**
         * The solid percent icon.See <a href='https://fontawesome.com/v6.0/icons/percent'>example</a>
         */
        PERCENT,
        /**
         * The solid person icon.See <a href='https://fontawesome.com/v6.0/icons/person'>example</a>
         */
        PERSON,
        /**
         * The solid person-biking icon.See <a href='https://fontawesome.com/v6.0/icons/person-biking'>example</a>
         */
        PERSON_BIKING,
        /**
         * The solid person-booth icon.See <a href='https://fontawesome.com/v6.0/icons/person-booth'>example</a>
         */
        PERSON_BOOTH,
        /**
         * The solid person-dots-from-line icon.See <a href='https://fontawesome.com/v6.0/icons/person-dots-from-line'>example</a>
         */
        PERSON_DOTS_FROM_LINE,
        /**
         * The solid person-dress icon.See <a href='https://fontawesome.com/v6.0/icons/person-dress'>example</a>
         */
        PERSON_DRESS,
        /**
         * The solid person-hiking icon.See <a href='https://fontawesome.com/v6.0/icons/person-hiking'>example</a>
         */
        PERSON_HIKING,
        /**
         * The solid person-praying icon.See <a href='https://fontawesome.com/v6.0/icons/person-praying'>example</a>
         */
        PERSON_PRAYING,
        /**
         * The solid person-running icon.See <a href='https://fontawesome.com/v6.0/icons/person-running'>example</a>
         */
        PERSON_RUNNING,
        /**
         * The solid person-skating icon.See <a href='https://fontawesome.com/v6.0/icons/person-skating'>example</a>
         */
        PERSON_SKATING,
        /**
         * The solid person-skiing icon.See <a href='https://fontawesome.com/v6.0/icons/person-skiing'>example</a>
         */
        PERSON_SKIING,
        /**
         * The solid person-skiing-nordic icon.See <a href='https://fontawesome.com/v6.0/icons/person-skiing-nordic'>example</a>
         */
        PERSON_SKIING_NORDIC,
        /**
         * The solid person-snowboarding icon.See <a href='https://fontawesome.com/v6.0/icons/person-snowboarding'>example</a>
         */
        PERSON_SNOWBOARDING,
        /**
         * The solid person-swimming icon.See <a href='https://fontawesome.com/v6.0/icons/person-swimming'>example</a>
         */
        PERSON_SWIMMING,
        /**
         * The solid person-walking icon.See <a href='https://fontawesome.com/v6.0/icons/person-walking'>example</a>
         */
        PERSON_WALKING,
        /**
         * The solid person-walking-with-cane icon.See <a href='https://fontawesome.com/v6.0/icons/person-walking-with-cane'>example</a>
         */
        PERSON_WALKING_WITH_CANE,
        /**
         * The solid peseta-sign icon.See <a href='https://fontawesome.com/v6.0/icons/peseta-sign'>example</a>
         */
        PESETA_SIGN,
        /**
         * The solid peso-sign icon.See <a href='https://fontawesome.com/v6.0/icons/peso-sign'>example</a>
         */
        PESO_SIGN,
        /**
         * The solid phone icon.See <a href='https://fontawesome.com/v6.0/icons/phone'>example</a>
         */
        PHONE,
        /**
         * The solid phone-flip icon.See <a href='https://fontawesome.com/v6.0/icons/phone-flip'>example</a>
         */
        PHONE_FLIP,
        /**
         * The solid phone-slash icon.See <a href='https://fontawesome.com/v6.0/icons/phone-slash'>example</a>
         */
        PHONE_SLASH,
        /**
         * The solid phone-volume icon.See <a href='https://fontawesome.com/v6.0/icons/phone-volume'>example</a>
         */
        PHONE_VOLUME,
        /**
         * The solid photo-film icon.See <a href='https://fontawesome.com/v6.0/icons/photo-film'>example</a>
         */
        PHOTO_FILM,
        /**
         * The solid piggy-bank icon.See <a href='https://fontawesome.com/v6.0/icons/piggy-bank'>example</a>
         */
        PIGGY_BANK,
        /**
         * The solid pills icon.See <a href='https://fontawesome.com/v6.0/icons/pills'>example</a>
         */
        PILLS,
        /**
         * The solid pizza-slice icon.See <a href='https://fontawesome.com/v6.0/icons/pizza-slice'>example</a>
         */
        PIZZA_SLICE,
        /**
         * The solid place-of-worship icon.See <a href='https://fontawesome.com/v6.0/icons/place-of-worship'>example</a>
         */
        PLACE_OF_WORSHIP,
        /**
         * The solid plane icon.See <a href='https://fontawesome.com/v6.0/icons/plane'>example</a>
         */
        PLANE,
        /**
         * The solid plane-arrival icon.See <a href='https://fontawesome.com/v6.0/icons/plane-arrival'>example</a>
         */
        PLANE_ARRIVAL,
        /**
         * The solid plane-departure icon.See <a href='https://fontawesome.com/v6.0/icons/plane-departure'>example</a>
         */
        PLANE_DEPARTURE,
        /**
         * The solid plane-slash icon.See <a href='https://fontawesome.com/v6.0/icons/plane-slash'>example</a>
         */
        PLANE_SLASH,
        /**
         * The solid play icon.See <a href='https://fontawesome.com/v6.0/icons/play'>example</a>
         */
        PLAY,
        /**
         * The solid plug icon.See <a href='https://fontawesome.com/v6.0/icons/plug'>example</a>
         */
        PLUG,
        /**
         * The solid plus icon.See <a href='https://fontawesome.com/v6.0/icons/plus'>example</a>
         */
        PLUS,
        /**
         * The solid plus-minus icon.See <a href='https://fontawesome.com/v6.0/icons/plus-minus'>example</a>
         */
        PLUS_MINUS,
        /**
         * The solid podcast icon.See <a href='https://fontawesome.com/v6.0/icons/podcast'>example</a>
         */
        PODCAST,
        /**
         * The solid poo icon.See <a href='https://fontawesome.com/v6.0/icons/poo'>example</a>
         */
        POO,
        /**
         * The solid poo-storm icon.See <a href='https://fontawesome.com/v6.0/icons/poo-storm'>example</a>
         */
        POO_STORM,
        /**
         * The solid poop icon.See <a href='https://fontawesome.com/v6.0/icons/poop'>example</a>
         */
        POOP,
        /**
         * The solid power-off icon.See <a href='https://fontawesome.com/v6.0/icons/power-off'>example</a>
         */
        POWER_OFF,
        /**
         * The solid prescription icon.See <a href='https://fontawesome.com/v6.0/icons/prescription'>example</a>
         */
        PRESCRIPTION,
        /**
         * The solid prescription-bottle icon.See <a href='https://fontawesome.com/v6.0/icons/prescription-bottle'>example</a>
         */
        PRESCRIPTION_BOTTLE,
        /**
         * The solid prescription-bottle-medical icon.See <a href='https://fontawesome.com/v6.0/icons/prescription-bottle-medical'>example</a>
         */
        PRESCRIPTION_BOTTLE_MEDICAL,
        /**
         * The solid print icon.See <a href='https://fontawesome.com/v6.0/icons/print'>example</a>
         */
        PRINT,
        /**
         * The solid pump-medical icon.See <a href='https://fontawesome.com/v6.0/icons/pump-medical'>example</a>
         */
        PUMP_MEDICAL,
        /**
         * The solid pump-soap icon.See <a href='https://fontawesome.com/v6.0/icons/pump-soap'>example</a>
         */
        PUMP_SOAP,
        /**
         * The solid puzzle-piece icon.See <a href='https://fontawesome.com/v6.0/icons/puzzle-piece'>example</a>
         */
        PUZZLE_PIECE,
        /**
         * The solid q icon.See <a href='https://fontawesome.com/v6.0/icons/q'>example</a>
         */
        Q,
        /**
         * The solid qrcode icon.See <a href='https://fontawesome.com/v6.0/icons/qrcode'>example</a>
         */
        QRCODE,
        /**
         * The solid question icon.See <a href='https://fontawesome.com/v6.0/icons/question'>example</a>
         */
        QUESTION,
        /**
         * The solid quote-left icon.See <a href='https://fontawesome.com/v6.0/icons/quote-left'>example</a>
         */
        QUOTE_LEFT,
        /**
         * The solid quote-right icon.See <a href='https://fontawesome.com/v6.0/icons/quote-right'>example</a>
         */
        QUOTE_RIGHT,
        /**
         * The solid r icon.See <a href='https://fontawesome.com/v6.0/icons/r'>example</a>
         */
        R,
        /**
         * The solid radiation icon.See <a href='https://fontawesome.com/v6.0/icons/radiation'>example</a>
         */
        RADIATION,
        /**
         * The solid rainbow icon.See <a href='https://fontawesome.com/v6.0/icons/rainbow'>example</a>
         */
        RAINBOW,
        /**
         * The solid receipt icon.See <a href='https://fontawesome.com/v6.0/icons/receipt'>example</a>
         */
        RECEIPT,
        /**
         * The solid record-vinyl icon.See <a href='https://fontawesome.com/v6.0/icons/record-vinyl'>example</a>
         */
        RECORD_VINYL,
        /**
         * The solid rectangle-ad icon.See <a href='https://fontawesome.com/v6.0/icons/rectangle-ad'>example</a>
         */
        RECTANGLE_AD,
        /**
         * The solid rectangle-list icon.See <a href='https://fontawesome.com/v6.0/icons/rectangle-list'>example</a>
         */
        RECTANGLE_LIST,
        /**
         * The solid rectangle-xmark icon.See <a href='https://fontawesome.com/v6.0/icons/rectangle-xmark'>example</a>
         */
        RECTANGLE_XMARK,
        /**
         * The solid recycle icon.See <a href='https://fontawesome.com/v6.0/icons/recycle'>example</a>
         */
        RECYCLE,
        /**
         * The solid registered icon.See <a href='https://fontawesome.com/v6.0/icons/registered'>example</a>
         */
        REGISTERED,
        /**
         * The solid repeat icon.See <a href='https://fontawesome.com/v6.0/icons/repeat'>example</a>
         */
        REPEAT,
        /**
         * The solid reply icon.See <a href='https://fontawesome.com/v6.0/icons/reply'>example</a>
         */
        REPLY,
        /**
         * The solid reply-all icon.See <a href='https://fontawesome.com/v6.0/icons/reply-all'>example</a>
         */
        REPLY_ALL,
        /**
         * The solid republican icon.See <a href='https://fontawesome.com/v6.0/icons/republican'>example</a>
         */
        REPUBLICAN,
        /**
         * The solid restroom icon.See <a href='https://fontawesome.com/v6.0/icons/restroom'>example</a>
         */
        RESTROOM,
        /**
         * The solid retweet icon.See <a href='https://fontawesome.com/v6.0/icons/retweet'>example</a>
         */
        RETWEET,
        /**
         * The solid ribbon icon.See <a href='https://fontawesome.com/v6.0/icons/ribbon'>example</a>
         */
        RIBBON,
        /**
         * The solid right-from-bracket icon.See <a href='https://fontawesome.com/v6.0/icons/right-from-bracket'>example</a>
         */
        RIGHT_FROM_BRACKET,
        /**
         * The solid right-left icon.See <a href='https://fontawesome.com/v6.0/icons/right-left'>example</a>
         */
        RIGHT_LEFT,
        /**
         * The solid right-long icon.See <a href='https://fontawesome.com/v6.0/icons/right-long'>example</a>
         */
        RIGHT_LONG,
        /**
         * The solid right-to-bracket icon.See <a href='https://fontawesome.com/v6.0/icons/right-to-bracket'>example</a>
         */
        RIGHT_TO_BRACKET,
        /**
         * The solid ring icon.See <a href='https://fontawesome.com/v6.0/icons/ring'>example</a>
         */
        RING,
        /**
         * The solid road icon.See <a href='https://fontawesome.com/v6.0/icons/road'>example</a>
         */
        ROAD,
        /**
         * The solid robot icon.See <a href='https://fontawesome.com/v6.0/icons/robot'>example</a>
         */
        ROBOT,
        /**
         * The solid rocket icon.See <a href='https://fontawesome.com/v6.0/icons/rocket'>example</a>
         */
        ROCKET,
        /**
         * The solid rotate icon.See <a href='https://fontawesome.com/v6.0/icons/rotate'>example</a>
         */
        ROTATE,
        /**
         * The solid rotate-left icon.See <a href='https://fontawesome.com/v6.0/icons/rotate-left'>example</a>
         */
        ROTATE_LEFT,
        /**
         * The solid rotate-right icon.See <a href='https://fontawesome.com/v6.0/icons/rotate-right'>example</a>
         */
        ROTATE_RIGHT,
        /**
         * The solid route icon.See <a href='https://fontawesome.com/v6.0/icons/route'>example</a>
         */
        ROUTE,
        /**
         * The solid rss icon.See <a href='https://fontawesome.com/v6.0/icons/rss'>example</a>
         */
        RSS,
        /**
         * The solid ruble-sign icon.See <a href='https://fontawesome.com/v6.0/icons/ruble-sign'>example</a>
         */
        RUBLE_SIGN,
        /**
         * The solid ruler icon.See <a href='https://fontawesome.com/v6.0/icons/ruler'>example</a>
         */
        RULER,
        /**
         * The solid ruler-combined icon.See <a href='https://fontawesome.com/v6.0/icons/ruler-combined'>example</a>
         */
        RULER_COMBINED,
        /**
         * The solid ruler-horizontal icon.See <a href='https://fontawesome.com/v6.0/icons/ruler-horizontal'>example</a>
         */
        RULER_HORIZONTAL,
        /**
         * The solid ruler-vertical icon.See <a href='https://fontawesome.com/v6.0/icons/ruler-vertical'>example</a>
         */
        RULER_VERTICAL,
        /**
         * The solid rupee-sign icon.See <a href='https://fontawesome.com/v6.0/icons/rupee-sign'>example</a>
         */
        RUPEE_SIGN,
        /**
         * The solid rupiah-sign icon.See <a href='https://fontawesome.com/v6.0/icons/rupiah-sign'>example</a>
         */
        RUPIAH_SIGN,
        /**
         * The solid s icon.See <a href='https://fontawesome.com/v6.0/icons/s'>example</a>
         */
        S,
        /**
         * The solid sailboat icon.See <a href='https://fontawesome.com/v6.0/icons/sailboat'>example</a>
         */
        SAILBOAT,
        /**
         * The solid satellite icon.See <a href='https://fontawesome.com/v6.0/icons/satellite'>example</a>
         */
        SATELLITE,
        /**
         * The solid satellite-dish icon.See <a href='https://fontawesome.com/v6.0/icons/satellite-dish'>example</a>
         */
        SATELLITE_DISH,
        /**
         * The solid scale-balanced icon.See <a href='https://fontawesome.com/v6.0/icons/scale-balanced'>example</a>
         */
        SCALE_BALANCED,
        /**
         * The solid scale-unbalanced icon.See <a href='https://fontawesome.com/v6.0/icons/scale-unbalanced'>example</a>
         */
        SCALE_UNBALANCED,
        /**
         * The solid scale-unbalanced-flip icon.See <a href='https://fontawesome.com/v6.0/icons/scale-unbalanced-flip'>example</a>
         */
        SCALE_UNBALANCED_FLIP,
        /**
         * The solid school icon.See <a href='https://fontawesome.com/v6.0/icons/school'>example</a>
         */
        SCHOOL,
        /**
         * The solid scissors icon.See <a href='https://fontawesome.com/v6.0/icons/scissors'>example</a>
         */
        SCISSORS,
        /**
         * The solid screwdriver icon.See <a href='https://fontawesome.com/v6.0/icons/screwdriver'>example</a>
         */
        SCREWDRIVER,
        /**
         * The solid screwdriver-wrench icon.See <a href='https://fontawesome.com/v6.0/icons/screwdriver-wrench'>example</a>
         */
        SCREWDRIVER_WRENCH,
        /**
         * The solid scroll icon.See <a href='https://fontawesome.com/v6.0/icons/scroll'>example</a>
         */
        SCROLL,
        /**
         * The solid scroll-torah icon.See <a href='https://fontawesome.com/v6.0/icons/scroll-torah'>example</a>
         */
        SCROLL_TORAH,
        /**
         * The solid sd-card icon.See <a href='https://fontawesome.com/v6.0/icons/sd-card'>example</a>
         */
        SD_CARD,
        /**
         * The solid section icon.See <a href='https://fontawesome.com/v6.0/icons/section'>example</a>
         */
        SECTION,
        /**
         * The solid seedling icon.See <a href='https://fontawesome.com/v6.0/icons/seedling'>example</a>
         */
        SEEDLING,
        /**
         * The solid server icon.See <a href='https://fontawesome.com/v6.0/icons/server'>example</a>
         */
        SERVER,
        /**
         * The solid shapes icon.See <a href='https://fontawesome.com/v6.0/icons/shapes'>example</a>
         */
        SHAPES,
        /**
         * The solid share icon.See <a href='https://fontawesome.com/v6.0/icons/share'>example</a>
         */
        SHARE,
        /**
         * The solid share-from-square icon.See <a href='https://fontawesome.com/v6.0/icons/share-from-square'>example</a>
         */
        SHARE_FROM_SQUARE,
        /**
         * The solid share-nodes icon.See <a href='https://fontawesome.com/v6.0/icons/share-nodes'>example</a>
         */
        SHARE_NODES,
        /**
         * The solid shekel-sign icon.See <a href='https://fontawesome.com/v6.0/icons/shekel-sign'>example</a>
         */
        SHEKEL_SIGN,
        /**
         * The solid shield icon.See <a href='https://fontawesome.com/v6.0/icons/shield'>example</a>
         */
        SHIELD,
        /**
         * The solid shield-blank icon.See <a href='https://fontawesome.com/v6.0/icons/shield-blank'>example</a>
         */
        SHIELD_BLANK,
        /**
         * The solid shield-virus icon.See <a href='https://fontawesome.com/v6.0/icons/shield-virus'>example</a>
         */
        SHIELD_VIRUS,
        /**
         * The solid ship icon.See <a href='https://fontawesome.com/v6.0/icons/ship'>example</a>
         */
        SHIP,
        /**
         * The solid shirt icon.See <a href='https://fontawesome.com/v6.0/icons/shirt'>example</a>
         */
        SHIRT,
        /**
         * The solid shoe-prints icon.See <a href='https://fontawesome.com/v6.0/icons/shoe-prints'>example</a>
         */
        SHOE_PRINTS,
        /**
         * The solid shop icon.See <a href='https://fontawesome.com/v6.0/icons/shop'>example</a>
         */
        SHOP,
        /**
         * The solid shop-slash icon.See <a href='https://fontawesome.com/v6.0/icons/shop-slash'>example</a>
         */
        SHOP_SLASH,
        /**
         * The solid shower icon.See <a href='https://fontawesome.com/v6.0/icons/shower'>example</a>
         */
        SHOWER,
        /**
         * The solid shrimp icon.See <a href='https://fontawesome.com/v6.0/icons/shrimp'>example</a>
         */
        SHRIMP,
        /**
         * The solid shuffle icon.See <a href='https://fontawesome.com/v6.0/icons/shuffle'>example</a>
         */
        SHUFFLE,
        /**
         * The solid shuttle-space icon.See <a href='https://fontawesome.com/v6.0/icons/shuttle-space'>example</a>
         */
        SHUTTLE_SPACE,
        /**
         * The solid sign-hanging icon.See <a href='https://fontawesome.com/v6.0/icons/sign-hanging'>example</a>
         */
        SIGN_HANGING,
        /**
         * The solid signal icon.See <a href='https://fontawesome.com/v6.0/icons/signal'>example</a>
         */
        SIGNAL,
        /**
         * The solid signature icon.See <a href='https://fontawesome.com/v6.0/icons/signature'>example</a>
         */
        SIGNATURE,
        /**
         * The solid signs-post icon.See <a href='https://fontawesome.com/v6.0/icons/signs-post'>example</a>
         */
        SIGNS_POST,
        /**
         * The solid sim-card icon.See <a href='https://fontawesome.com/v6.0/icons/sim-card'>example</a>
         */
        SIM_CARD,
        /**
         * The solid sink icon.See <a href='https://fontawesome.com/v6.0/icons/sink'>example</a>
         */
        SINK,
        /**
         * The solid sitemap icon.See <a href='https://fontawesome.com/v6.0/icons/sitemap'>example</a>
         */
        SITEMAP,
        /**
         * The solid skull icon.See <a href='https://fontawesome.com/v6.0/icons/skull'>example</a>
         */
        SKULL,
        /**
         * The solid skull-crossbones icon.See <a href='https://fontawesome.com/v6.0/icons/skull-crossbones'>example</a>
         */
        SKULL_CROSSBONES,
        /**
         * The solid slash icon.See <a href='https://fontawesome.com/v6.0/icons/slash'>example</a>
         */
        SLASH,
        /**
         * The solid sleigh icon.See <a href='https://fontawesome.com/v6.0/icons/sleigh'>example</a>
         */
        SLEIGH,
        /**
         * The solid sliders icon.See <a href='https://fontawesome.com/v6.0/icons/sliders'>example</a>
         */
        SLIDERS,
        /**
         * The solid smog icon.See <a href='https://fontawesome.com/v6.0/icons/smog'>example</a>
         */
        SMOG,
        /**
         * The solid smoking icon.See <a href='https://fontawesome.com/v6.0/icons/smoking'>example</a>
         */
        SMOKING,
        /**
         * The solid snowflake icon.See <a href='https://fontawesome.com/v6.0/icons/snowflake'>example</a>
         */
        SNOWFLAKE,
        /**
         * The solid snowman icon.See <a href='https://fontawesome.com/v6.0/icons/snowman'>example</a>
         */
        SNOWMAN,
        /**
         * The solid snowplow icon.See <a href='https://fontawesome.com/v6.0/icons/snowplow'>example</a>
         */
        SNOWPLOW,
        /**
         * The solid soap icon.See <a href='https://fontawesome.com/v6.0/icons/soap'>example</a>
         */
        SOAP,
        /**
         * The solid socks icon.See <a href='https://fontawesome.com/v6.0/icons/socks'>example</a>
         */
        SOCKS,
        /**
         * The solid solar-panel icon.See <a href='https://fontawesome.com/v6.0/icons/solar-panel'>example</a>
         */
        SOLAR_PANEL,
        /**
         * The solid sort icon.See <a href='https://fontawesome.com/v6.0/icons/sort'>example</a>
         */
        SORT,
        /**
         * The solid sort-down icon.See <a href='https://fontawesome.com/v6.0/icons/sort-down'>example</a>
         */
        SORT_DOWN,
        /**
         * The solid sort-up icon.See <a href='https://fontawesome.com/v6.0/icons/sort-up'>example</a>
         */
        SORT_UP,
        /**
         * The solid spa icon.See <a href='https://fontawesome.com/v6.0/icons/spa'>example</a>
         */
        SPA,
        /**
         * The solid spaghetti-monster-flying icon.See <a href='https://fontawesome.com/v6.0/icons/spaghetti-monster-flying'>example</a>
         */
        SPAGHETTI_MONSTER_FLYING,
        /**
         * The solid spell-check icon.See <a href='https://fontawesome.com/v6.0/icons/spell-check'>example</a>
         */
        SPELL_CHECK,
        /**
         * The solid spider icon.See <a href='https://fontawesome.com/v6.0/icons/spider'>example</a>
         */
        SPIDER,
        /**
         * The solid spinner icon.See <a href='https://fontawesome.com/v6.0/icons/spinner'>example</a>
         */
        SPINNER,
        /**
         * The solid splotch icon.See <a href='https://fontawesome.com/v6.0/icons/splotch'>example</a>
         */
        SPLOTCH,
        /**
         * The solid spoon icon.See <a href='https://fontawesome.com/v6.0/icons/spoon'>example</a>
         */
        SPOON,
        /**
         * The solid spray-can icon.See <a href='https://fontawesome.com/v6.0/icons/spray-can'>example</a>
         */
        SPRAY_CAN,
        /**
         * The solid spray-can-sparkles icon.See <a href='https://fontawesome.com/v6.0/icons/spray-can-sparkles'>example</a>
         */
        SPRAY_CAN_SPARKLES,
        /**
         * The solid square icon.See <a href='https://fontawesome.com/v6.0/icons/square'>example</a>
         */
        SQUARE,
        /**
         * The solid square-arrow-up-right icon.See <a href='https://fontawesome.com/v6.0/icons/square-arrow-up-right'>example</a>
         */
        SQUARE_ARROW_UP_RIGHT,
        /**
         * The solid square-caret-down icon.See <a href='https://fontawesome.com/v6.0/icons/square-caret-down'>example</a>
         */
        SQUARE_CARET_DOWN,
        /**
         * The solid square-caret-left icon.See <a href='https://fontawesome.com/v6.0/icons/square-caret-left'>example</a>
         */
        SQUARE_CARET_LEFT,
        /**
         * The solid square-caret-right icon.See <a href='https://fontawesome.com/v6.0/icons/square-caret-right'>example</a>
         */
        SQUARE_CARET_RIGHT,
        /**
         * The solid square-caret-up icon.See <a href='https://fontawesome.com/v6.0/icons/square-caret-up'>example</a>
         */
        SQUARE_CARET_UP,
        /**
         * The solid square-check icon.See <a href='https://fontawesome.com/v6.0/icons/square-check'>example</a>
         */
        SQUARE_CHECK,
        /**
         * The solid square-envelope icon.See <a href='https://fontawesome.com/v6.0/icons/square-envelope'>example</a>
         */
        SQUARE_ENVELOPE,
        /**
         * The solid square-full icon.See <a href='https://fontawesome.com/v6.0/icons/square-full'>example</a>
         */
        SQUARE_FULL,
        /**
         * The solid square-h icon.See <a href='https://fontawesome.com/v6.0/icons/square-h'>example</a>
         */
        SQUARE_H,
        /**
         * The solid square-minus icon.See <a href='https://fontawesome.com/v6.0/icons/square-minus'>example</a>
         */
        SQUARE_MINUS,
        /**
         * The solid square-parking icon.See <a href='https://fontawesome.com/v6.0/icons/square-parking'>example</a>
         */
        SQUARE_PARKING,
        /**
         * The solid square-pen icon.See <a href='https://fontawesome.com/v6.0/icons/square-pen'>example</a>
         */
        SQUARE_PEN,
        /**
         * The solid square-phone icon.See <a href='https://fontawesome.com/v6.0/icons/square-phone'>example</a>
         */
        SQUARE_PHONE,
        /**
         * The solid square-phone-flip icon.See <a href='https://fontawesome.com/v6.0/icons/square-phone-flip'>example</a>
         */
        SQUARE_PHONE_FLIP,
        /**
         * The solid square-plus icon.See <a href='https://fontawesome.com/v6.0/icons/square-plus'>example</a>
         */
        SQUARE_PLUS,
        /**
         * The solid square-poll-horizontal icon.See <a href='https://fontawesome.com/v6.0/icons/square-poll-horizontal'>example</a>
         */
        SQUARE_POLL_HORIZONTAL,
        /**
         * The solid square-poll-vertical icon.See <a href='https://fontawesome.com/v6.0/icons/square-poll-vertical'>example</a>
         */
        SQUARE_POLL_VERTICAL,
        /**
         * The solid square-root-variable icon.See <a href='https://fontawesome.com/v6.0/icons/square-root-variable'>example</a>
         */
        SQUARE_ROOT_VARIABLE,
        /**
         * The solid square-rss icon.See <a href='https://fontawesome.com/v6.0/icons/square-rss'>example</a>
         */
        SQUARE_RSS,
        /**
         * The solid square-share-nodes icon.See <a href='https://fontawesome.com/v6.0/icons/square-share-nodes'>example</a>
         */
        SQUARE_SHARE_NODES,
        /**
         * The solid square-up-right icon.See <a href='https://fontawesome.com/v6.0/icons/square-up-right'>example</a>
         */
        SQUARE_UP_RIGHT,
        /**
         * The solid square-xmark icon.See <a href='https://fontawesome.com/v6.0/icons/square-xmark'>example</a>
         */
        SQUARE_XMARK,
        /**
         * The solid stairs icon.See <a href='https://fontawesome.com/v6.0/icons/stairs'>example</a>
         */
        STAIRS,
        /**
         * The solid stamp icon.See <a href='https://fontawesome.com/v6.0/icons/stamp'>example</a>
         */
        STAMP,
        /**
         * The solid star icon.See <a href='https://fontawesome.com/v6.0/icons/star'>example</a>
         */
        STAR,
        /**
         * The solid star-and-crescent icon.See <a href='https://fontawesome.com/v6.0/icons/star-and-crescent'>example</a>
         */
        STAR_AND_CRESCENT,
        /**
         * The solid star-half icon.See <a href='https://fontawesome.com/v6.0/icons/star-half'>example</a>
         */
        STAR_HALF,
        /**
         * The solid star-half-stroke icon.See <a href='https://fontawesome.com/v6.0/icons/star-half-stroke'>example</a>
         */
        STAR_HALF_STROKE,
        /**
         * The solid star-of-david icon.See <a href='https://fontawesome.com/v6.0/icons/star-of-david'>example</a>
         */
        STAR_OF_DAVID,
        /**
         * The solid star-of-life icon.See <a href='https://fontawesome.com/v6.0/icons/star-of-life'>example</a>
         */
        STAR_OF_LIFE,
        /**
         * The solid sterling-sign icon.See <a href='https://fontawesome.com/v6.0/icons/sterling-sign'>example</a>
         */
        STERLING_SIGN,
        /**
         * The solid stethoscope icon.See <a href='https://fontawesome.com/v6.0/icons/stethoscope'>example</a>
         */
        STETHOSCOPE,
        /**
         * The solid stop icon.See <a href='https://fontawesome.com/v6.0/icons/stop'>example</a>
         */
        STOP,
        /**
         * The solid stopwatch icon.See <a href='https://fontawesome.com/v6.0/icons/stopwatch'>example</a>
         */
        STOPWATCH,
        /**
         * The solid stopwatch-20 icon.See <a href='https://fontawesome.com/v6.0/icons/stopwatch-20'>example</a>
         */
        STOPWATCH_20,
        /**
         * The solid store icon.See <a href='https://fontawesome.com/v6.0/icons/store'>example</a>
         */
        STORE,
        /**
         * The solid store-slash icon.See <a href='https://fontawesome.com/v6.0/icons/store-slash'>example</a>
         */
        STORE_SLASH,
        /**
         * The solid street-view icon.See <a href='https://fontawesome.com/v6.0/icons/street-view'>example</a>
         */
        STREET_VIEW,
        /**
         * The solid strikethrough icon.See <a href='https://fontawesome.com/v6.0/icons/strikethrough'>example</a>
         */
        STRIKETHROUGH,
        /**
         * The solid stroopwafel icon.See <a href='https://fontawesome.com/v6.0/icons/stroopwafel'>example</a>
         */
        STROOPWAFEL,
        /**
         * The solid subscript icon.See <a href='https://fontawesome.com/v6.0/icons/subscript'>example</a>
         */
        SUBSCRIPT,
        /**
         * The solid suitcase icon.See <a href='https://fontawesome.com/v6.0/icons/suitcase'>example</a>
         */
        SUITCASE,
        /**
         * The solid suitcase-medical icon.See <a href='https://fontawesome.com/v6.0/icons/suitcase-medical'>example</a>
         */
        SUITCASE_MEDICAL,
        /**
         * The solid suitcase-rolling icon.See <a href='https://fontawesome.com/v6.0/icons/suitcase-rolling'>example</a>
         */
        SUITCASE_ROLLING,
        /**
         * The solid sun icon.See <a href='https://fontawesome.com/v6.0/icons/sun'>example</a>
         */
        SUN,
        /**
         * The solid superscript icon.See <a href='https://fontawesome.com/v6.0/icons/superscript'>example</a>
         */
        SUPERSCRIPT,
        /**
         * The solid swatchbook icon.See <a href='https://fontawesome.com/v6.0/icons/swatchbook'>example</a>
         */
        SWATCHBOOK,
        /**
         * The solid synagogue icon.See <a href='https://fontawesome.com/v6.0/icons/synagogue'>example</a>
         */
        SYNAGOGUE,
        /**
         * The solid syringe icon.See <a href='https://fontawesome.com/v6.0/icons/syringe'>example</a>
         */
        SYRINGE,
        /**
         * The solid t icon.See <a href='https://fontawesome.com/v6.0/icons/t'>example</a>
         */
        T,
        /**
         * The solid table icon.See <a href='https://fontawesome.com/v6.0/icons/table'>example</a>
         */
        TABLE,
        /**
         * The solid table-cells icon.See <a href='https://fontawesome.com/v6.0/icons/table-cells'>example</a>
         */
        TABLE_CELLS,
        /**
         * The solid table-cells-large icon.See <a href='https://fontawesome.com/v6.0/icons/table-cells-large'>example</a>
         */
        TABLE_CELLS_LARGE,
        /**
         * The solid table-columns icon.See <a href='https://fontawesome.com/v6.0/icons/table-columns'>example</a>
         */
        TABLE_COLUMNS,
        /**
         * The solid table-list icon.See <a href='https://fontawesome.com/v6.0/icons/table-list'>example</a>
         */
        TABLE_LIST,
        /**
         * The solid table-tennis-paddle-ball icon.See <a href='https://fontawesome.com/v6.0/icons/table-tennis-paddle-ball'>example</a>
         */
        TABLE_TENNIS_PADDLE_BALL,
        /**
         * The solid tablet icon.See <a href='https://fontawesome.com/v6.0/icons/tablet'>example</a>
         */
        TABLET,
        /**
         * The solid tablet-button icon.See <a href='https://fontawesome.com/v6.0/icons/tablet-button'>example</a>
         */
        TABLET_BUTTON,
        /**
         * The solid tablet-screen-button icon.See <a href='https://fontawesome.com/v6.0/icons/tablet-screen-button'>example</a>
         */
        TABLET_SCREEN_BUTTON,
        /**
         * The solid tablets icon.See <a href='https://fontawesome.com/v6.0/icons/tablets'>example</a>
         */
        TABLETS,
        /**
         * The solid tachograph-digital icon.See <a href='https://fontawesome.com/v6.0/icons/tachograph-digital'>example</a>
         */
        TACHOGRAPH_DIGITAL,
        /**
         * The solid tag icon.See <a href='https://fontawesome.com/v6.0/icons/tag'>example</a>
         */
        TAG,
        /**
         * The solid tags icon.See <a href='https://fontawesome.com/v6.0/icons/tags'>example</a>
         */
        TAGS,
        /**
         * The solid tape icon.See <a href='https://fontawesome.com/v6.0/icons/tape'>example</a>
         */
        TAPE,
        /**
         * The solid taxi icon.See <a href='https://fontawesome.com/v6.0/icons/taxi'>example</a>
         */
        TAXI,
        /**
         * The solid teeth icon.See <a href='https://fontawesome.com/v6.0/icons/teeth'>example</a>
         */
        TEETH,
        /**
         * The solid teeth-open icon.See <a href='https://fontawesome.com/v6.0/icons/teeth-open'>example</a>
         */
        TEETH_OPEN,
        /**
         * The solid temperature-empty icon.See <a href='https://fontawesome.com/v6.0/icons/temperature-empty'>example</a>
         */
        TEMPERATURE_EMPTY,
        /**
         * The solid temperature-full icon.See <a href='https://fontawesome.com/v6.0/icons/temperature-full'>example</a>
         */
        TEMPERATURE_FULL,
        /**
         * The solid temperature-half icon.See <a href='https://fontawesome.com/v6.0/icons/temperature-half'>example</a>
         */
        TEMPERATURE_HALF,
        /**
         * The solid temperature-high icon.See <a href='https://fontawesome.com/v6.0/icons/temperature-high'>example</a>
         */
        TEMPERATURE_HIGH,
        /**
         * The solid temperature-low icon.See <a href='https://fontawesome.com/v6.0/icons/temperature-low'>example</a>
         */
        TEMPERATURE_LOW,
        /**
         * The solid temperature-quarter icon.See <a href='https://fontawesome.com/v6.0/icons/temperature-quarter'>example</a>
         */
        TEMPERATURE_QUARTER,
        /**
         * The solid temperature-three-quarters icon.See <a href='https://fontawesome.com/v6.0/icons/temperature-three-quarters'>example</a>
         */
        TEMPERATURE_THREE_QUARTERS,
        /**
         * The solid tenge-sign icon.See <a href='https://fontawesome.com/v6.0/icons/tenge-sign'>example</a>
         */
        TENGE_SIGN,
        /**
         * The solid terminal icon.See <a href='https://fontawesome.com/v6.0/icons/terminal'>example</a>
         */
        TERMINAL,
        /**
         * The solid text-height icon.See <a href='https://fontawesome.com/v6.0/icons/text-height'>example</a>
         */
        TEXT_HEIGHT,
        /**
         * The solid text-slash icon.See <a href='https://fontawesome.com/v6.0/icons/text-slash'>example</a>
         */
        TEXT_SLASH,
        /**
         * The solid text-width icon.See <a href='https://fontawesome.com/v6.0/icons/text-width'>example</a>
         */
        TEXT_WIDTH,
        /**
         * The solid thermometer icon.See <a href='https://fontawesome.com/v6.0/icons/thermometer'>example</a>
         */
        THERMOMETER,
        /**
         * The solid thumbs-down icon.See <a href='https://fontawesome.com/v6.0/icons/thumbs-down'>example</a>
         */
        THUMBS_DOWN,
        /**
         * The solid thumbs-up icon.See <a href='https://fontawesome.com/v6.0/icons/thumbs-up'>example</a>
         */
        THUMBS_UP,
        /**
         * The solid thumbtack icon.See <a href='https://fontawesome.com/v6.0/icons/thumbtack'>example</a>
         */
        THUMBTACK,
        /**
         * The solid ticket icon.See <a href='https://fontawesome.com/v6.0/icons/ticket'>example</a>
         */
        TICKET,
        /**
         * The solid ticket-simple icon.See <a href='https://fontawesome.com/v6.0/icons/ticket-simple'>example</a>
         */
        TICKET_SIMPLE,
        /**
         * The solid timeline icon.See <a href='https://fontawesome.com/v6.0/icons/timeline'>example</a>
         */
        TIMELINE,
        /**
         * The solid toggle-off icon.See <a href='https://fontawesome.com/v6.0/icons/toggle-off'>example</a>
         */
        TOGGLE_OFF,
        /**
         * The solid toggle-on icon.See <a href='https://fontawesome.com/v6.0/icons/toggle-on'>example</a>
         */
        TOGGLE_ON,
        /**
         * The solid toilet icon.See <a href='https://fontawesome.com/v6.0/icons/toilet'>example</a>
         */
        TOILET,
        /**
         * The solid toilet-paper icon.See <a href='https://fontawesome.com/v6.0/icons/toilet-paper'>example</a>
         */
        TOILET_PAPER,
        /**
         * The solid toilet-paper-slash icon.See <a href='https://fontawesome.com/v6.0/icons/toilet-paper-slash'>example</a>
         */
        TOILET_PAPER_SLASH,
        /**
         * The solid toolbox icon.See <a href='https://fontawesome.com/v6.0/icons/toolbox'>example</a>
         */
        TOOLBOX,
        /**
         * The solid tooth icon.See <a href='https://fontawesome.com/v6.0/icons/tooth'>example</a>
         */
        TOOTH,
        /**
         * The solid torii-gate icon.See <a href='https://fontawesome.com/v6.0/icons/torii-gate'>example</a>
         */
        TORII_GATE,
        /**
         * The solid tower-broadcast icon.See <a href='https://fontawesome.com/v6.0/icons/tower-broadcast'>example</a>
         */
        TOWER_BROADCAST,
        /**
         * The solid tractor icon.See <a href='https://fontawesome.com/v6.0/icons/tractor'>example</a>
         */
        TRACTOR,
        /**
         * The solid trademark icon.See <a href='https://fontawesome.com/v6.0/icons/trademark'>example</a>
         */
        TRADEMARK,
        /**
         * The solid traffic-light icon.See <a href='https://fontawesome.com/v6.0/icons/traffic-light'>example</a>
         */
        TRAFFIC_LIGHT,
        /**
         * The solid trailer icon.See <a href='https://fontawesome.com/v6.0/icons/trailer'>example</a>
         */
        TRAILER,
        /**
         * The solid train icon.See <a href='https://fontawesome.com/v6.0/icons/train'>example</a>
         */
        TRAIN,
        /**
         * The solid train-subway icon.See <a href='https://fontawesome.com/v6.0/icons/train-subway'>example</a>
         */
        TRAIN_SUBWAY,
        /**
         * The solid train-tram icon.See <a href='https://fontawesome.com/v6.0/icons/train-tram'>example</a>
         */
        TRAIN_TRAM,
        /**
         * The solid transgender icon.See <a href='https://fontawesome.com/v6.0/icons/transgender'>example</a>
         */
        TRANSGENDER,
        /**
         * The solid trash icon.See <a href='https://fontawesome.com/v6.0/icons/trash'>example</a>
         */
        TRASH,
        /**
         * The solid trash-arrow-up icon.See <a href='https://fontawesome.com/v6.0/icons/trash-arrow-up'>example</a>
         */
        TRASH_ARROW_UP,
        /**
         * The solid trash-can icon.See <a href='https://fontawesome.com/v6.0/icons/trash-can'>example</a>
         */
        TRASH_CAN,
        /**
         * The solid trash-can-arrow-up icon.See <a href='https://fontawesome.com/v6.0/icons/trash-can-arrow-up'>example</a>
         */
        TRASH_CAN_ARROW_UP,
        /**
         * The solid tree icon.See <a href='https://fontawesome.com/v6.0/icons/tree'>example</a>
         */
        TREE,
        /**
         * The solid triangle-exclamation icon.See <a href='https://fontawesome.com/v6.0/icons/triangle-exclamation'>example</a>
         */
        TRIANGLE_EXCLAMATION,
        /**
         * The solid trophy icon.See <a href='https://fontawesome.com/v6.0/icons/trophy'>example</a>
         */
        TROPHY,
        /**
         * The solid truck icon.See <a href='https://fontawesome.com/v6.0/icons/truck'>example</a>
         */
        TRUCK,
        /**
         * The solid truck-fast icon.See <a href='https://fontawesome.com/v6.0/icons/truck-fast'>example</a>
         */
        TRUCK_FAST,
        /**
         * The solid truck-medical icon.See <a href='https://fontawesome.com/v6.0/icons/truck-medical'>example</a>
         */
        TRUCK_MEDICAL,
        /**
         * The solid truck-monster icon.See <a href='https://fontawesome.com/v6.0/icons/truck-monster'>example</a>
         */
        TRUCK_MONSTER,
        /**
         * The solid truck-moving icon.See <a href='https://fontawesome.com/v6.0/icons/truck-moving'>example</a>
         */
        TRUCK_MOVING,
        /**
         * The solid truck-pickup icon.See <a href='https://fontawesome.com/v6.0/icons/truck-pickup'>example</a>
         */
        TRUCK_PICKUP,
        /**
         * The solid truck-ramp-box icon.See <a href='https://fontawesome.com/v6.0/icons/truck-ramp-box'>example</a>
         */
        TRUCK_RAMP_BOX,
        /**
         * The solid tty icon.See <a href='https://fontawesome.com/v6.0/icons/tty'>example</a>
         */
        TTY,
        /**
         * The solid turkish-lira-sign icon.See <a href='https://fontawesome.com/v6.0/icons/turkish-lira-sign'>example</a>
         */
        TURKISH_LIRA_SIGN,
        /**
         * The solid turn-down icon.See <a href='https://fontawesome.com/v6.0/icons/turn-down'>example</a>
         */
        TURN_DOWN,
        /**
         * The solid turn-up icon.See <a href='https://fontawesome.com/v6.0/icons/turn-up'>example</a>
         */
        TURN_UP,
        /**
         * The solid tv icon.See <a href='https://fontawesome.com/v6.0/icons/tv'>example</a>
         */
        TV,
        /**
         * The solid u icon.See <a href='https://fontawesome.com/v6.0/icons/u'>example</a>
         */
        U,
        /**
         * The solid umbrella icon.See <a href='https://fontawesome.com/v6.0/icons/umbrella'>example</a>
         */
        UMBRELLA,
        /**
         * The solid umbrella-beach icon.See <a href='https://fontawesome.com/v6.0/icons/umbrella-beach'>example</a>
         */
        UMBRELLA_BEACH,
        /**
         * The solid underline icon.See <a href='https://fontawesome.com/v6.0/icons/underline'>example</a>
         */
        UNDERLINE,
        /**
         * The solid universal-access icon.See <a href='https://fontawesome.com/v6.0/icons/universal-access'>example</a>
         */
        UNIVERSAL_ACCESS,
        /**
         * The solid unlock icon.See <a href='https://fontawesome.com/v6.0/icons/unlock'>example</a>
         */
        UNLOCK,
        /**
         * The solid unlock-keyhole icon.See <a href='https://fontawesome.com/v6.0/icons/unlock-keyhole'>example</a>
         */
        UNLOCK_KEYHOLE,
        /**
         * The solid up-down icon.See <a href='https://fontawesome.com/v6.0/icons/up-down'>example</a>
         */
        UP_DOWN,
        /**
         * The solid up-down-left-right icon.See <a href='https://fontawesome.com/v6.0/icons/up-down-left-right'>example</a>
         */
        UP_DOWN_LEFT_RIGHT,
        /**
         * The solid up-long icon.See <a href='https://fontawesome.com/v6.0/icons/up-long'>example</a>
         */
        UP_LONG,
        /**
         * The solid up-right-and-down-left-from-center icon.See <a href='https://fontawesome.com/v6.0/icons/up-right-and-down-left-from-center'>example</a>
         */
        UP_RIGHT_AND_DOWN_LEFT_FROM_CENTER,
        /**
         * The solid up-right-from-square icon.See <a href='https://fontawesome.com/v6.0/icons/up-right-from-square'>example</a>
         */
        UP_RIGHT_FROM_SQUARE,
        /**
         * The solid upload icon.See <a href='https://fontawesome.com/v6.0/icons/upload'>example</a>
         */
        UPLOAD,
        /**
         * The solid user icon.See <a href='https://fontawesome.com/v6.0/icons/user'>example</a>
         */
        USER,
        /**
         * The solid user-astronaut icon.See <a href='https://fontawesome.com/v6.0/icons/user-astronaut'>example</a>
         */
        USER_ASTRONAUT,
        /**
         * The solid user-check icon.See <a href='https://fontawesome.com/v6.0/icons/user-check'>example</a>
         */
        USER_CHECK,
        /**
         * The solid user-clock icon.See <a href='https://fontawesome.com/v6.0/icons/user-clock'>example</a>
         */
        USER_CLOCK,
        /**
         * The solid user-doctor icon.See <a href='https://fontawesome.com/v6.0/icons/user-doctor'>example</a>
         */
        USER_DOCTOR,
        /**
         * The solid user-gear icon.See <a href='https://fontawesome.com/v6.0/icons/user-gear'>example</a>
         */
        USER_GEAR,
        /**
         * The solid user-graduate icon.See <a href='https://fontawesome.com/v6.0/icons/user-graduate'>example</a>
         */
        USER_GRADUATE,
        /**
         * The solid user-group icon.See <a href='https://fontawesome.com/v6.0/icons/user-group'>example</a>
         */
        USER_GROUP,
        /**
         * The solid user-injured icon.See <a href='https://fontawesome.com/v6.0/icons/user-injured'>example</a>
         */
        USER_INJURED,
        /**
         * The solid user-large icon.See <a href='https://fontawesome.com/v6.0/icons/user-large'>example</a>
         */
        USER_LARGE,
        /**
         * The solid user-large-slash icon.See <a href='https://fontawesome.com/v6.0/icons/user-large-slash'>example</a>
         */
        USER_LARGE_SLASH,
        /**
         * The solid user-lock icon.See <a href='https://fontawesome.com/v6.0/icons/user-lock'>example</a>
         */
        USER_LOCK,
        /**
         * The solid user-minus icon.See <a href='https://fontawesome.com/v6.0/icons/user-minus'>example</a>
         */
        USER_MINUS,
        /**
         * The solid user-ninja icon.See <a href='https://fontawesome.com/v6.0/icons/user-ninja'>example</a>
         */
        USER_NINJA,
        /**
         * The solid user-nurse icon.See <a href='https://fontawesome.com/v6.0/icons/user-nurse'>example</a>
         */
        USER_NURSE,
        /**
         * The solid user-pen icon.See <a href='https://fontawesome.com/v6.0/icons/user-pen'>example</a>
         */
        USER_PEN,
        /**
         * The solid user-plus icon.See <a href='https://fontawesome.com/v6.0/icons/user-plus'>example</a>
         */
        USER_PLUS,
        /**
         * The solid user-secret icon.See <a href='https://fontawesome.com/v6.0/icons/user-secret'>example</a>
         */
        USER_SECRET,
        /**
         * The solid user-shield icon.See <a href='https://fontawesome.com/v6.0/icons/user-shield'>example</a>
         */
        USER_SHIELD,
        /**
         * The solid user-slash icon.See <a href='https://fontawesome.com/v6.0/icons/user-slash'>example</a>
         */
        USER_SLASH,
        /**
         * The solid user-tag icon.See <a href='https://fontawesome.com/v6.0/icons/user-tag'>example</a>
         */
        USER_TAG,
        /**
         * The solid user-tie icon.See <a href='https://fontawesome.com/v6.0/icons/user-tie'>example</a>
         */
        USER_TIE,
        /**
         * The solid user-xmark icon.See <a href='https://fontawesome.com/v6.0/icons/user-xmark'>example</a>
         */
        USER_XMARK,
        /**
         * The solid users icon.See <a href='https://fontawesome.com/v6.0/icons/users'>example</a>
         */
        USERS,
        /**
         * The solid users-gear icon.See <a href='https://fontawesome.com/v6.0/icons/users-gear'>example</a>
         */
        USERS_GEAR,
        /**
         * The solid users-slash icon.See <a href='https://fontawesome.com/v6.0/icons/users-slash'>example</a>
         */
        USERS_SLASH,
        /**
         * The solid utensils icon.See <a href='https://fontawesome.com/v6.0/icons/utensils'>example</a>
         */
        UTENSILS,
        /**
         * The solid v icon.See <a href='https://fontawesome.com/v6.0/icons/v'>example</a>
         */
        V,
        /**
         * The solid van-shuttle icon.See <a href='https://fontawesome.com/v6.0/icons/van-shuttle'>example</a>
         */
        VAN_SHUTTLE,
        /**
         * The solid vault icon.See <a href='https://fontawesome.com/v6.0/icons/vault'>example</a>
         */
        VAULT,
        /**
         * The solid vector-square icon.See <a href='https://fontawesome.com/v6.0/icons/vector-square'>example</a>
         */
        VECTOR_SQUARE,
        /**
         * The solid venus icon.See <a href='https://fontawesome.com/v6.0/icons/venus'>example</a>
         */
        VENUS,
        /**
         * The solid venus-double icon.See <a href='https://fontawesome.com/v6.0/icons/venus-double'>example</a>
         */
        VENUS_DOUBLE,
        /**
         * The solid venus-mars icon.See <a href='https://fontawesome.com/v6.0/icons/venus-mars'>example</a>
         */
        VENUS_MARS,
        /**
         * The solid vest icon.See <a href='https://fontawesome.com/v6.0/icons/vest'>example</a>
         */
        VEST,
        /**
         * The solid vest-patches icon.See <a href='https://fontawesome.com/v6.0/icons/vest-patches'>example</a>
         */
        VEST_PATCHES,
        /**
         * The solid vial icon.See <a href='https://fontawesome.com/v6.0/icons/vial'>example</a>
         */
        VIAL,
        /**
         * The solid vials icon.See <a href='https://fontawesome.com/v6.0/icons/vials'>example</a>
         */
        VIALS,
        /**
         * The solid video icon.See <a href='https://fontawesome.com/v6.0/icons/video'>example</a>
         */
        VIDEO,
        /**
         * The solid video-slash icon.See <a href='https://fontawesome.com/v6.0/icons/video-slash'>example</a>
         */
        VIDEO_SLASH,
        /**
         * The solid vihara icon.See <a href='https://fontawesome.com/v6.0/icons/vihara'>example</a>
         */
        VIHARA,
        /**
         * The solid virus icon.See <a href='https://fontawesome.com/v6.0/icons/virus'>example</a>
         */
        VIRUS,
        /**
         * The solid virus-covid icon.See <a href='https://fontawesome.com/v6.0/icons/virus-covid'>example</a>
         */
        VIRUS_COVID,
        /**
         * The solid virus-covid-slash icon.See <a href='https://fontawesome.com/v6.0/icons/virus-covid-slash'>example</a>
         */
        VIRUS_COVID_SLASH,
        /**
         * The solid virus-slash icon.See <a href='https://fontawesome.com/v6.0/icons/virus-slash'>example</a>
         */
        VIRUS_SLASH,
        /**
         * The solid viruses icon.See <a href='https://fontawesome.com/v6.0/icons/viruses'>example</a>
         */
        VIRUSES,
        /**
         * The solid voicemail icon.See <a href='https://fontawesome.com/v6.0/icons/voicemail'>example</a>
         */
        VOICEMAIL,
        /**
         * The solid volleyball icon.See <a href='https://fontawesome.com/v6.0/icons/volleyball'>example</a>
         */
        VOLLEYBALL,
        /**
         * The solid volume-high icon.See <a href='https://fontawesome.com/v6.0/icons/volume-high'>example</a>
         */
        VOLUME_HIGH,
        /**
         * The solid volume-low icon.See <a href='https://fontawesome.com/v6.0/icons/volume-low'>example</a>
         */
        VOLUME_LOW,
        /**
         * The solid volume-off icon.See <a href='https://fontawesome.com/v6.0/icons/volume-off'>example</a>
         */
        VOLUME_OFF,
        /**
         * The solid volume-xmark icon.See <a href='https://fontawesome.com/v6.0/icons/volume-xmark'>example</a>
         */
        VOLUME_XMARK,
        /**
         * The solid vr-cardboard icon.See <a href='https://fontawesome.com/v6.0/icons/vr-cardboard'>example</a>
         */
        VR_CARDBOARD,
        /**
         * The solid w icon.See <a href='https://fontawesome.com/v6.0/icons/w'>example</a>
         */
        W,
        /**
         * The solid wallet icon.See <a href='https://fontawesome.com/v6.0/icons/wallet'>example</a>
         */
        WALLET,
        /**
         * The solid wand-magic icon.See <a href='https://fontawesome.com/v6.0/icons/wand-magic'>example</a>
         */
        WAND_MAGIC,
        /**
         * The solid wand-magic-sparkles icon.See <a href='https://fontawesome.com/v6.0/icons/wand-magic-sparkles'>example</a>
         */
        WAND_MAGIC_SPARKLES,
        /**
         * The solid wand-sparkles icon.See <a href='https://fontawesome.com/v6.0/icons/wand-sparkles'>example</a>
         */
        WAND_SPARKLES,
        /**
         * The solid warehouse icon.See <a href='https://fontawesome.com/v6.0/icons/warehouse'>example</a>
         */
        WAREHOUSE,
        /**
         * The solid water icon.See <a href='https://fontawesome.com/v6.0/icons/water'>example</a>
         */
        WATER,
        /**
         * The solid water-ladder icon.See <a href='https://fontawesome.com/v6.0/icons/water-ladder'>example</a>
         */
        WATER_LADDER,
        /**
         * The solid wave-square icon.See <a href='https://fontawesome.com/v6.0/icons/wave-square'>example</a>
         */
        WAVE_SQUARE,
        /**
         * The solid weight-hanging icon.See <a href='https://fontawesome.com/v6.0/icons/weight-hanging'>example</a>
         */
        WEIGHT_HANGING,
        /**
         * The solid weight-scale icon.See <a href='https://fontawesome.com/v6.0/icons/weight-scale'>example</a>
         */
        WEIGHT_SCALE,
        /**
         * The solid wheelchair icon.See <a href='https://fontawesome.com/v6.0/icons/wheelchair'>example</a>
         */
        WHEELCHAIR,
        /**
         * The solid whiskey-glass icon.See <a href='https://fontawesome.com/v6.0/icons/whiskey-glass'>example</a>
         */
        WHISKEY_GLASS,
        /**
         * The solid wifi icon.See <a href='https://fontawesome.com/v6.0/icons/wifi'>example</a>
         */
        WIFI,
        /**
         * The solid wind icon.See <a href='https://fontawesome.com/v6.0/icons/wind'>example</a>
         */
        WIND,
        /**
         * The solid window-maximize icon.See <a href='https://fontawesome.com/v6.0/icons/window-maximize'>example</a>
         */
        WINDOW_MAXIMIZE,
        /**
         * The solid window-minimize icon.See <a href='https://fontawesome.com/v6.0/icons/window-minimize'>example</a>
         */
        WINDOW_MINIMIZE,
        /**
         * The solid window-restore icon.See <a href='https://fontawesome.com/v6.0/icons/window-restore'>example</a>
         */
        WINDOW_RESTORE,
        /**
         * The solid wine-bottle icon.See <a href='https://fontawesome.com/v6.0/icons/wine-bottle'>example</a>
         */
        WINE_BOTTLE,
        /**
         * The solid wine-glass icon.See <a href='https://fontawesome.com/v6.0/icons/wine-glass'>example</a>
         */
        WINE_GLASS,
        /**
         * The solid wine-glass-empty icon.See <a href='https://fontawesome.com/v6.0/icons/wine-glass-empty'>example</a>
         */
        WINE_GLASS_EMPTY,
        /**
         * The solid won-sign icon.See <a href='https://fontawesome.com/v6.0/icons/won-sign'>example</a>
         */
        WON_SIGN,
        /**
         * The solid wrench icon.See <a href='https://fontawesome.com/v6.0/icons/wrench'>example</a>
         */
        WRENCH,
        /**
         * The solid x icon.See <a href='https://fontawesome.com/v6.0/icons/x'>example</a>
         */
        X,
        /**
         * The solid x-ray icon.See <a href='https://fontawesome.com/v6.0/icons/x-ray'>example</a>
         */
        X_RAY,
        /**
         * The solid xmark icon.See <a href='https://fontawesome.com/v6.0/icons/xmark'>example</a>
         */
        XMARK,
        /**
         * The solid y icon.See <a href='https://fontawesome.com/v6.0/icons/y'>example</a>
         */
        Y,
        /**
         * The solid yen-sign icon.See <a href='https://fontawesome.com/v6.0/icons/yen-sign'>example</a>
         */
        YEN_SIGN,
        /**
         * The solid yin-yang icon.See <a href='https://fontawesome.com/v6.0/icons/yin-yang'>example</a>
         */
        YIN_YANG,
        /**
         * The solid z icon.See <a href='https://fontawesome.com/v6.0/icons/z'>example</a>
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
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "4.0.0")
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
    public enum Brands {

        /**
         * The brands 42-group icon.See <a href='https://fontawesome.com/v6.0/icons/42-group'>example</a>
         */
        _42_GROUP,
        /**
         * The brands 500px icon.See <a href='https://fontawesome.com/v6.0/icons/500px'>example</a>
         */
        _500PX,
        /**
         * The brands accessible-icon icon.See <a href='https://fontawesome.com/v6.0/icons/accessible-icon'>example</a>
         */
        ACCESSIBLE_ICON,
        /**
         * The brands accusoft icon.See <a href='https://fontawesome.com/v6.0/icons/accusoft'>example</a>
         */
        ACCUSOFT,
        /**
         * The brands adn icon.See <a href='https://fontawesome.com/v6.0/icons/adn'>example</a>
         */
        ADN,
        /**
         * The brands adversal icon.See <a href='https://fontawesome.com/v6.0/icons/adversal'>example</a>
         */
        ADVERSAL,
        /**
         * The brands affiliatetheme icon.See <a href='https://fontawesome.com/v6.0/icons/affiliatetheme'>example</a>
         */
        AFFILIATETHEME,
        /**
         * The brands airbnb icon.See <a href='https://fontawesome.com/v6.0/icons/airbnb'>example</a>
         */
        AIRBNB,
        /**
         * The brands algolia icon.See <a href='https://fontawesome.com/v6.0/icons/algolia'>example</a>
         */
        ALGOLIA,
        /**
         * The brands alipay icon.See <a href='https://fontawesome.com/v6.0/icons/alipay'>example</a>
         */
        ALIPAY,
        /**
         * The brands amazon icon.See <a href='https://fontawesome.com/v6.0/icons/amazon'>example</a>
         */
        AMAZON,
        /**
         * The brands amazon-pay icon.See <a href='https://fontawesome.com/v6.0/icons/amazon-pay'>example</a>
         */
        AMAZON_PAY,
        /**
         * The brands amilia icon.See <a href='https://fontawesome.com/v6.0/icons/amilia'>example</a>
         */
        AMILIA,
        /**
         * The brands android icon.See <a href='https://fontawesome.com/v6.0/icons/android'>example</a>
         */
        ANDROID,
        /**
         * The brands angellist icon.See <a href='https://fontawesome.com/v6.0/icons/angellist'>example</a>
         */
        ANGELLIST,
        /**
         * The brands angrycreative icon.See <a href='https://fontawesome.com/v6.0/icons/angrycreative'>example</a>
         */
        ANGRYCREATIVE,
        /**
         * The brands angular icon.See <a href='https://fontawesome.com/v6.0/icons/angular'>example</a>
         */
        ANGULAR,
        /**
         * The brands app-store icon.See <a href='https://fontawesome.com/v6.0/icons/app-store'>example</a>
         */
        APP_STORE,
        /**
         * The brands app-store-ios icon.See <a href='https://fontawesome.com/v6.0/icons/app-store-ios'>example</a>
         */
        APP_STORE_IOS,
        /**
         * The brands apper icon.See <a href='https://fontawesome.com/v6.0/icons/apper'>example</a>
         */
        APPER,
        /**
         * The brands apple icon.See <a href='https://fontawesome.com/v6.0/icons/apple'>example</a>
         */
        APPLE,
        /**
         * The brands apple-pay icon.See <a href='https://fontawesome.com/v6.0/icons/apple-pay'>example</a>
         */
        APPLE_PAY,
        /**
         * The brands artstation icon.See <a href='https://fontawesome.com/v6.0/icons/artstation'>example</a>
         */
        ARTSTATION,
        /**
         * The brands asymmetrik icon.See <a href='https://fontawesome.com/v6.0/icons/asymmetrik'>example</a>
         */
        ASYMMETRIK,
        /**
         * The brands atlassian icon.See <a href='https://fontawesome.com/v6.0/icons/atlassian'>example</a>
         */
        ATLASSIAN,
        /**
         * The brands audible icon.See <a href='https://fontawesome.com/v6.0/icons/audible'>example</a>
         */
        AUDIBLE,
        /**
         * The brands autoprefixer icon.See <a href='https://fontawesome.com/v6.0/icons/autoprefixer'>example</a>
         */
        AUTOPREFIXER,
        /**
         * The brands avianex icon.See <a href='https://fontawesome.com/v6.0/icons/avianex'>example</a>
         */
        AVIANEX,
        /**
         * The brands aviato icon.See <a href='https://fontawesome.com/v6.0/icons/aviato'>example</a>
         */
        AVIATO,
        /**
         * The brands aws icon.See <a href='https://fontawesome.com/v6.0/icons/aws'>example</a>
         */
        AWS,
        /**
         * The brands bandcamp icon.See <a href='https://fontawesome.com/v6.0/icons/bandcamp'>example</a>
         */
        BANDCAMP,
        /**
         * The brands battle-net icon.See <a href='https://fontawesome.com/v6.0/icons/battle-net'>example</a>
         */
        BATTLE_NET,
        /**
         * The brands behance icon.See <a href='https://fontawesome.com/v6.0/icons/behance'>example</a>
         */
        BEHANCE,
        /**
         * The brands behance-square icon.See <a href='https://fontawesome.com/v6.0/icons/behance-square'>example</a>
         */
        BEHANCE_SQUARE,
        /**
         * The brands bilibili icon.See <a href='https://fontawesome.com/v6.0/icons/bilibili'>example</a>
         */
        BILIBILI,
        /**
         * The brands bimobject icon.See <a href='https://fontawesome.com/v6.0/icons/bimobject'>example</a>
         */
        BIMOBJECT,
        /**
         * The brands bitbucket icon.See <a href='https://fontawesome.com/v6.0/icons/bitbucket'>example</a>
         */
        BITBUCKET,
        /**
         * The brands bitcoin icon.See <a href='https://fontawesome.com/v6.0/icons/bitcoin'>example</a>
         */
        BITCOIN,
        /**
         * The brands bity icon.See <a href='https://fontawesome.com/v6.0/icons/bity'>example</a>
         */
        BITY,
        /**
         * The brands black-tie icon.See <a href='https://fontawesome.com/v6.0/icons/black-tie'>example</a>
         */
        BLACK_TIE,
        /**
         * The brands blackberry icon.See <a href='https://fontawesome.com/v6.0/icons/blackberry'>example</a>
         */
        BLACKBERRY,
        /**
         * The brands blogger icon.See <a href='https://fontawesome.com/v6.0/icons/blogger'>example</a>
         */
        BLOGGER,
        /**
         * The brands blogger-b icon.See <a href='https://fontawesome.com/v6.0/icons/blogger-b'>example</a>
         */
        BLOGGER_B,
        /**
         * The brands bluetooth icon.See <a href='https://fontawesome.com/v6.0/icons/bluetooth'>example</a>
         */
        BLUETOOTH,
        /**
         * The brands bluetooth-b icon.See <a href='https://fontawesome.com/v6.0/icons/bluetooth-b'>example</a>
         */
        BLUETOOTH_B,
        /**
         * The brands bootstrap icon.See <a href='https://fontawesome.com/v6.0/icons/bootstrap'>example</a>
         */
        BOOTSTRAP,
        /**
         * The brands bots icon.See <a href='https://fontawesome.com/v6.0/icons/bots'>example</a>
         */
        BOTS,
        /**
         * The brands btc icon.See <a href='https://fontawesome.com/v6.0/icons/btc'>example</a>
         */
        BTC,
        /**
         * The brands buffer icon.See <a href='https://fontawesome.com/v6.0/icons/buffer'>example</a>
         */
        BUFFER,
        /**
         * The brands buromobelexperte icon.See <a href='https://fontawesome.com/v6.0/icons/buromobelexperte'>example</a>
         */
        BUROMOBELEXPERTE,
        /**
         * The brands buy-n-large icon.See <a href='https://fontawesome.com/v6.0/icons/buy-n-large'>example</a>
         */
        BUY_N_LARGE,
        /**
         * The brands buysellads icon.See <a href='https://fontawesome.com/v6.0/icons/buysellads'>example</a>
         */
        BUYSELLADS,
        /**
         * The brands canadian-maple-leaf icon.See <a href='https://fontawesome.com/v6.0/icons/canadian-maple-leaf'>example</a>
         */
        CANADIAN_MAPLE_LEAF,
        /**
         * The brands cc-amazon-pay icon.See <a href='https://fontawesome.com/v6.0/icons/cc-amazon-pay'>example</a>
         */
        CC_AMAZON_PAY,
        /**
         * The brands cc-amex icon.See <a href='https://fontawesome.com/v6.0/icons/cc-amex'>example</a>
         */
        CC_AMEX,
        /**
         * The brands cc-apple-pay icon.See <a href='https://fontawesome.com/v6.0/icons/cc-apple-pay'>example</a>
         */
        CC_APPLE_PAY,
        /**
         * The brands cc-diners-club icon.See <a href='https://fontawesome.com/v6.0/icons/cc-diners-club'>example</a>
         */
        CC_DINERS_CLUB,
        /**
         * The brands cc-discover icon.See <a href='https://fontawesome.com/v6.0/icons/cc-discover'>example</a>
         */
        CC_DISCOVER,
        /**
         * The brands cc-jcb icon.See <a href='https://fontawesome.com/v6.0/icons/cc-jcb'>example</a>
         */
        CC_JCB,
        /**
         * The brands cc-mastercard icon.See <a href='https://fontawesome.com/v6.0/icons/cc-mastercard'>example</a>
         */
        CC_MASTERCARD,
        /**
         * The brands cc-paypal icon.See <a href='https://fontawesome.com/v6.0/icons/cc-paypal'>example</a>
         */
        CC_PAYPAL,
        /**
         * The brands cc-stripe icon.See <a href='https://fontawesome.com/v6.0/icons/cc-stripe'>example</a>
         */
        CC_STRIPE,
        /**
         * The brands cc-visa icon.See <a href='https://fontawesome.com/v6.0/icons/cc-visa'>example</a>
         */
        CC_VISA,
        /**
         * The brands centercode icon.See <a href='https://fontawesome.com/v6.0/icons/centercode'>example</a>
         */
        CENTERCODE,
        /**
         * The brands centos icon.See <a href='https://fontawesome.com/v6.0/icons/centos'>example</a>
         */
        CENTOS,
        /**
         * The brands chrome icon.See <a href='https://fontawesome.com/v6.0/icons/chrome'>example</a>
         */
        CHROME,
        /**
         * The brands chromecast icon.See <a href='https://fontawesome.com/v6.0/icons/chromecast'>example</a>
         */
        CHROMECAST,
        /**
         * The brands cloudflare icon.See <a href='https://fontawesome.com/v6.0/icons/cloudflare'>example</a>
         */
        CLOUDFLARE,
        /**
         * The brands cloudscale icon.See <a href='https://fontawesome.com/v6.0/icons/cloudscale'>example</a>
         */
        CLOUDSCALE,
        /**
         * The brands cloudsmith icon.See <a href='https://fontawesome.com/v6.0/icons/cloudsmith'>example</a>
         */
        CLOUDSMITH,
        /**
         * The brands cloudversify icon.See <a href='https://fontawesome.com/v6.0/icons/cloudversify'>example</a>
         */
        CLOUDVERSIFY,
        /**
         * The brands cmplid icon.See <a href='https://fontawesome.com/v6.0/icons/cmplid'>example</a>
         */
        CMPLID,
        /**
         * The brands codepen icon.See <a href='https://fontawesome.com/v6.0/icons/codepen'>example</a>
         */
        CODEPEN,
        /**
         * The brands codiepie icon.See <a href='https://fontawesome.com/v6.0/icons/codiepie'>example</a>
         */
        CODIEPIE,
        /**
         * The brands confluence icon.See <a href='https://fontawesome.com/v6.0/icons/confluence'>example</a>
         */
        CONFLUENCE,
        /**
         * The brands connectdevelop icon.See <a href='https://fontawesome.com/v6.0/icons/connectdevelop'>example</a>
         */
        CONNECTDEVELOP,
        /**
         * The brands contao icon.See <a href='https://fontawesome.com/v6.0/icons/contao'>example</a>
         */
        CONTAO,
        /**
         * The brands cotton-bureau icon.See <a href='https://fontawesome.com/v6.0/icons/cotton-bureau'>example</a>
         */
        COTTON_BUREAU,
        /**
         * The brands cpanel icon.See <a href='https://fontawesome.com/v6.0/icons/cpanel'>example</a>
         */
        CPANEL,
        /**
         * The brands creative-commons icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons'>example</a>
         */
        CREATIVE_COMMONS,
        /**
         * The brands creative-commons-by icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-by'>example</a>
         */
        CREATIVE_COMMONS_BY,
        /**
         * The brands creative-commons-nc icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-nc'>example</a>
         */
        CREATIVE_COMMONS_NC,
        /**
         * The brands creative-commons-nc-eu icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-nc-eu'>example</a>
         */
        CREATIVE_COMMONS_NC_EU,
        /**
         * The brands creative-commons-nc-jp icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-nc-jp'>example</a>
         */
        CREATIVE_COMMONS_NC_JP,
        /**
         * The brands creative-commons-nd icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-nd'>example</a>
         */
        CREATIVE_COMMONS_ND,
        /**
         * The brands creative-commons-pd icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-pd'>example</a>
         */
        CREATIVE_COMMONS_PD,
        /**
         * The brands creative-commons-pd-alt icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-pd-alt'>example</a>
         */
        CREATIVE_COMMONS_PD_ALT,
        /**
         * The brands creative-commons-remix icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-remix'>example</a>
         */
        CREATIVE_COMMONS_REMIX,
        /**
         * The brands creative-commons-sa icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-sa'>example</a>
         */
        CREATIVE_COMMONS_SA,
        /**
         * The brands creative-commons-sampling icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-sampling'>example</a>
         */
        CREATIVE_COMMONS_SAMPLING,
        /**
         * The brands creative-commons-sampling-plus icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-sampling-plus'>example</a>
         */
        CREATIVE_COMMONS_SAMPLING_PLUS,
        /**
         * The brands creative-commons-share icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-share'>example</a>
         */
        CREATIVE_COMMONS_SHARE,
        /**
         * The brands creative-commons-zero icon.See <a href='https://fontawesome.com/v6.0/icons/creative-commons-zero'>example</a>
         */
        CREATIVE_COMMONS_ZERO,
        /**
         * The brands critical-role icon.See <a href='https://fontawesome.com/v6.0/icons/critical-role'>example</a>
         */
        CRITICAL_ROLE,
        /**
         * The brands css3 icon.See <a href='https://fontawesome.com/v6.0/icons/css3'>example</a>
         */
        CSS3,
        /**
         * The brands css3-alt icon.See <a href='https://fontawesome.com/v6.0/icons/css3-alt'>example</a>
         */
        CSS3_ALT,
        /**
         * The brands cuttlefish icon.See <a href='https://fontawesome.com/v6.0/icons/cuttlefish'>example</a>
         */
        CUTTLEFISH,
        /**
         * The brands d-and-d icon.See <a href='https://fontawesome.com/v6.0/icons/d-and-d'>example</a>
         */
        D_AND_D,
        /**
         * The brands d-and-d-beyond icon.See <a href='https://fontawesome.com/v6.0/icons/d-and-d-beyond'>example</a>
         */
        D_AND_D_BEYOND,
        /**
         * The brands dailymotion icon.See <a href='https://fontawesome.com/v6.0/icons/dailymotion'>example</a>
         */
        DAILYMOTION,
        /**
         * The brands dashcube icon.See <a href='https://fontawesome.com/v6.0/icons/dashcube'>example</a>
         */
        DASHCUBE,
        /**
         * The brands deezer icon.See <a href='https://fontawesome.com/v6.0/icons/deezer'>example</a>
         */
        DEEZER,
        /**
         * The brands delicious icon.See <a href='https://fontawesome.com/v6.0/icons/delicious'>example</a>
         */
        DELICIOUS,
        /**
         * The brands deploydog icon.See <a href='https://fontawesome.com/v6.0/icons/deploydog'>example</a>
         */
        DEPLOYDOG,
        /**
         * The brands deskpro icon.See <a href='https://fontawesome.com/v6.0/icons/deskpro'>example</a>
         */
        DESKPRO,
        /**
         * The brands dev icon.See <a href='https://fontawesome.com/v6.0/icons/dev'>example</a>
         */
        DEV,
        /**
         * The brands deviantart icon.See <a href='https://fontawesome.com/v6.0/icons/deviantart'>example</a>
         */
        DEVIANTART,
        /**
         * The brands dhl icon.See <a href='https://fontawesome.com/v6.0/icons/dhl'>example</a>
         */
        DHL,
        /**
         * The brands diaspora icon.See <a href='https://fontawesome.com/v6.0/icons/diaspora'>example</a>
         */
        DIASPORA,
        /**
         * The brands digg icon.See <a href='https://fontawesome.com/v6.0/icons/digg'>example</a>
         */
        DIGG,
        /**
         * The brands digital-ocean icon.See <a href='https://fontawesome.com/v6.0/icons/digital-ocean'>example</a>
         */
        DIGITAL_OCEAN,
        /**
         * The brands discord icon.See <a href='https://fontawesome.com/v6.0/icons/discord'>example</a>
         */
        DISCORD,
        /**
         * The brands discourse icon.See <a href='https://fontawesome.com/v6.0/icons/discourse'>example</a>
         */
        DISCOURSE,
        /**
         * The brands dochub icon.See <a href='https://fontawesome.com/v6.0/icons/dochub'>example</a>
         */
        DOCHUB,
        /**
         * The brands docker icon.See <a href='https://fontawesome.com/v6.0/icons/docker'>example</a>
         */
        DOCKER,
        /**
         * The brands draft2digital icon.See <a href='https://fontawesome.com/v6.0/icons/draft2digital'>example</a>
         */
        DRAFT2DIGITAL,
        /**
         * The brands dribbble icon.See <a href='https://fontawesome.com/v6.0/icons/dribbble'>example</a>
         */
        DRIBBBLE,
        /**
         * The brands dribbble-square icon.See <a href='https://fontawesome.com/v6.0/icons/dribbble-square'>example</a>
         */
        DRIBBBLE_SQUARE,
        /**
         * The brands dropbox icon.See <a href='https://fontawesome.com/v6.0/icons/dropbox'>example</a>
         */
        DROPBOX,
        /**
         * The brands drupal icon.See <a href='https://fontawesome.com/v6.0/icons/drupal'>example</a>
         */
        DRUPAL,
        /**
         * The brands dyalog icon.See <a href='https://fontawesome.com/v6.0/icons/dyalog'>example</a>
         */
        DYALOG,
        /**
         * The brands earlybirds icon.See <a href='https://fontawesome.com/v6.0/icons/earlybirds'>example</a>
         */
        EARLYBIRDS,
        /**
         * The brands ebay icon.See <a href='https://fontawesome.com/v6.0/icons/ebay'>example</a>
         */
        EBAY,
        /**
         * The brands edge icon.See <a href='https://fontawesome.com/v6.0/icons/edge'>example</a>
         */
        EDGE,
        /**
         * The brands edge-legacy icon.See <a href='https://fontawesome.com/v6.0/icons/edge-legacy'>example</a>
         */
        EDGE_LEGACY,
        /**
         * The brands elementor icon.See <a href='https://fontawesome.com/v6.0/icons/elementor'>example</a>
         */
        ELEMENTOR,
        /**
         * The brands ello icon.See <a href='https://fontawesome.com/v6.0/icons/ello'>example</a>
         */
        ELLO,
        /**
         * The brands ember icon.See <a href='https://fontawesome.com/v6.0/icons/ember'>example</a>
         */
        EMBER,
        /**
         * The brands empire icon.See <a href='https://fontawesome.com/v6.0/icons/empire'>example</a>
         */
        EMPIRE,
        /**
         * The brands envira icon.See <a href='https://fontawesome.com/v6.0/icons/envira'>example</a>
         */
        ENVIRA,
        /**
         * The brands erlang icon.See <a href='https://fontawesome.com/v6.0/icons/erlang'>example</a>
         */
        ERLANG,
        /**
         * The brands ethereum icon.See <a href='https://fontawesome.com/v6.0/icons/ethereum'>example</a>
         */
        ETHEREUM,
        /**
         * The brands etsy icon.See <a href='https://fontawesome.com/v6.0/icons/etsy'>example</a>
         */
        ETSY,
        /**
         * The brands evernote icon.See <a href='https://fontawesome.com/v6.0/icons/evernote'>example</a>
         */
        EVERNOTE,
        /**
         * The brands expeditedssl icon.See <a href='https://fontawesome.com/v6.0/icons/expeditedssl'>example</a>
         */
        EXPEDITEDSSL,
        /**
         * The brands facebook icon.See <a href='https://fontawesome.com/v6.0/icons/facebook'>example</a>
         */
        FACEBOOK,
        /**
         * The brands facebook-f icon.See <a href='https://fontawesome.com/v6.0/icons/facebook-f'>example</a>
         */
        FACEBOOK_F,
        /**
         * The brands facebook-messenger icon.See <a href='https://fontawesome.com/v6.0/icons/facebook-messenger'>example</a>
         */
        FACEBOOK_MESSENGER,
        /**
         * The brands facebook-square icon.See <a href='https://fontawesome.com/v6.0/icons/facebook-square'>example</a>
         */
        FACEBOOK_SQUARE,
        /**
         * The brands fantasy-flight-games icon.See <a href='https://fontawesome.com/v6.0/icons/fantasy-flight-games'>example</a>
         */
        FANTASY_FLIGHT_GAMES,
        /**
         * The brands fedex icon.See <a href='https://fontawesome.com/v6.0/icons/fedex'>example</a>
         */
        FEDEX,
        /**
         * The brands fedora icon.See <a href='https://fontawesome.com/v6.0/icons/fedora'>example</a>
         */
        FEDORA,
        /**
         * The brands figma icon.See <a href='https://fontawesome.com/v6.0/icons/figma'>example</a>
         */
        FIGMA,
        /**
         * The brands firefox icon.See <a href='https://fontawesome.com/v6.0/icons/firefox'>example</a>
         */
        FIREFOX,
        /**
         * The brands firefox-browser icon.See <a href='https://fontawesome.com/v6.0/icons/firefox-browser'>example</a>
         */
        FIREFOX_BROWSER,
        /**
         * The brands first-order icon.See <a href='https://fontawesome.com/v6.0/icons/first-order'>example</a>
         */
        FIRST_ORDER,
        /**
         * The brands first-order-alt icon.See <a href='https://fontawesome.com/v6.0/icons/first-order-alt'>example</a>
         */
        FIRST_ORDER_ALT,
        /**
         * The brands firstdraft icon.See <a href='https://fontawesome.com/v6.0/icons/firstdraft'>example</a>
         */
        FIRSTDRAFT,
        /**
         * The brands flickr icon.See <a href='https://fontawesome.com/v6.0/icons/flickr'>example</a>
         */
        FLICKR,
        /**
         * The brands flipboard icon.See <a href='https://fontawesome.com/v6.0/icons/flipboard'>example</a>
         */
        FLIPBOARD,
        /**
         * The brands fly icon.See <a href='https://fontawesome.com/v6.0/icons/fly'>example</a>
         */
        FLY,
        /**
         * The brands font-awesome icon.See <a href='https://fontawesome.com/v6.0/icons/font-awesome'>example</a>
         */
        FONT_AWESOME,
        /**
         * The brands fonticons icon.See <a href='https://fontawesome.com/v6.0/icons/fonticons'>example</a>
         */
        FONTICONS,
        /**
         * The brands fonticons-fi icon.See <a href='https://fontawesome.com/v6.0/icons/fonticons-fi'>example</a>
         */
        FONTICONS_FI,
        /**
         * The brands fort-awesome icon.See <a href='https://fontawesome.com/v6.0/icons/fort-awesome'>example</a>
         */
        FORT_AWESOME,
        /**
         * The brands fort-awesome-alt icon.See <a href='https://fontawesome.com/v6.0/icons/fort-awesome-alt'>example</a>
         */
        FORT_AWESOME_ALT,
        /**
         * The brands forumbee icon.See <a href='https://fontawesome.com/v6.0/icons/forumbee'>example</a>
         */
        FORUMBEE,
        /**
         * The brands foursquare icon.See <a href='https://fontawesome.com/v6.0/icons/foursquare'>example</a>
         */
        FOURSQUARE,
        /**
         * The brands free-code-camp icon.See <a href='https://fontawesome.com/v6.0/icons/free-code-camp'>example</a>
         */
        FREE_CODE_CAMP,
        /**
         * The brands freebsd icon.See <a href='https://fontawesome.com/v6.0/icons/freebsd'>example</a>
         */
        FREEBSD,
        /**
         * The brands fulcrum icon.See <a href='https://fontawesome.com/v6.0/icons/fulcrum'>example</a>
         */
        FULCRUM,
        /**
         * The brands galactic-republic icon.See <a href='https://fontawesome.com/v6.0/icons/galactic-republic'>example</a>
         */
        GALACTIC_REPUBLIC,
        /**
         * The brands galactic-senate icon.See <a href='https://fontawesome.com/v6.0/icons/galactic-senate'>example</a>
         */
        GALACTIC_SENATE,
        /**
         * The brands get-pocket icon.See <a href='https://fontawesome.com/v6.0/icons/get-pocket'>example</a>
         */
        GET_POCKET,
        /**
         * The brands gg icon.See <a href='https://fontawesome.com/v6.0/icons/gg'>example</a>
         */
        GG,
        /**
         * The brands gg-circle icon.See <a href='https://fontawesome.com/v6.0/icons/gg-circle'>example</a>
         */
        GG_CIRCLE,
        /**
         * The brands git icon.See <a href='https://fontawesome.com/v6.0/icons/git'>example</a>
         */
        GIT,
        /**
         * The brands git-alt icon.See <a href='https://fontawesome.com/v6.0/icons/git-alt'>example</a>
         */
        GIT_ALT,
        /**
         * The brands git-square icon.See <a href='https://fontawesome.com/v6.0/icons/git-square'>example</a>
         */
        GIT_SQUARE,
        /**
         * The brands github icon.See <a href='https://fontawesome.com/v6.0/icons/github'>example</a>
         */
        GITHUB,
        /**
         * The brands github-alt icon.See <a href='https://fontawesome.com/v6.0/icons/github-alt'>example</a>
         */
        GITHUB_ALT,
        /**
         * The brands github-square icon.See <a href='https://fontawesome.com/v6.0/icons/github-square'>example</a>
         */
        GITHUB_SQUARE,
        /**
         * The brands gitkraken icon.See <a href='https://fontawesome.com/v6.0/icons/gitkraken'>example</a>
         */
        GITKRAKEN,
        /**
         * The brands gitlab icon.See <a href='https://fontawesome.com/v6.0/icons/gitlab'>example</a>
         */
        GITLAB,
        /**
         * The brands gitter icon.See <a href='https://fontawesome.com/v6.0/icons/gitter'>example</a>
         */
        GITTER,
        /**
         * The brands glide icon.See <a href='https://fontawesome.com/v6.0/icons/glide'>example</a>
         */
        GLIDE,
        /**
         * The brands glide-g icon.See <a href='https://fontawesome.com/v6.0/icons/glide-g'>example</a>
         */
        GLIDE_G,
        /**
         * The brands gofore icon.See <a href='https://fontawesome.com/v6.0/icons/gofore'>example</a>
         */
        GOFORE,
        /**
         * The brands golang icon.See <a href='https://fontawesome.com/v6.0/icons/golang'>example</a>
         */
        GOLANG,
        /**
         * The brands goodreads icon.See <a href='https://fontawesome.com/v6.0/icons/goodreads'>example</a>
         */
        GOODREADS,
        /**
         * The brands goodreads-g icon.See <a href='https://fontawesome.com/v6.0/icons/goodreads-g'>example</a>
         */
        GOODREADS_G,
        /**
         * The brands google icon.See <a href='https://fontawesome.com/v6.0/icons/google'>example</a>
         */
        GOOGLE,
        /**
         * The brands google-drive icon.See <a href='https://fontawesome.com/v6.0/icons/google-drive'>example</a>
         */
        GOOGLE_DRIVE,
        /**
         * The brands google-pay icon.See <a href='https://fontawesome.com/v6.0/icons/google-pay'>example</a>
         */
        GOOGLE_PAY,
        /**
         * The brands google-play icon.See <a href='https://fontawesome.com/v6.0/icons/google-play'>example</a>
         */
        GOOGLE_PLAY,
        /**
         * The brands google-plus icon.See <a href='https://fontawesome.com/v6.0/icons/google-plus'>example</a>
         */
        GOOGLE_PLUS,
        /**
         * The brands google-plus-g icon.See <a href='https://fontawesome.com/v6.0/icons/google-plus-g'>example</a>
         */
        GOOGLE_PLUS_G,
        /**
         * The brands google-plus-square icon.See <a href='https://fontawesome.com/v6.0/icons/google-plus-square'>example</a>
         */
        GOOGLE_PLUS_SQUARE,
        /**
         * The brands google-wallet icon.See <a href='https://fontawesome.com/v6.0/icons/google-wallet'>example</a>
         */
        GOOGLE_WALLET,
        /**
         * The brands gratipay icon.See <a href='https://fontawesome.com/v6.0/icons/gratipay'>example</a>
         */
        GRATIPAY,
        /**
         * The brands grav icon.See <a href='https://fontawesome.com/v6.0/icons/grav'>example</a>
         */
        GRAV,
        /**
         * The brands gripfire icon.See <a href='https://fontawesome.com/v6.0/icons/gripfire'>example</a>
         */
        GRIPFIRE,
        /**
         * The brands grunt icon.See <a href='https://fontawesome.com/v6.0/icons/grunt'>example</a>
         */
        GRUNT,
        /**
         * The brands guilded icon.See <a href='https://fontawesome.com/v6.0/icons/guilded'>example</a>
         */
        GUILDED,
        /**
         * The brands gulp icon.See <a href='https://fontawesome.com/v6.0/icons/gulp'>example</a>
         */
        GULP,
        /**
         * The brands hacker-news icon.See <a href='https://fontawesome.com/v6.0/icons/hacker-news'>example</a>
         */
        HACKER_NEWS,
        /**
         * The brands hacker-news-square icon.See <a href='https://fontawesome.com/v6.0/icons/hacker-news-square'>example</a>
         */
        HACKER_NEWS_SQUARE,
        /**
         * The brands hackerrank icon.See <a href='https://fontawesome.com/v6.0/icons/hackerrank'>example</a>
         */
        HACKERRANK,
        /**
         * The brands hashnode icon.See <a href='https://fontawesome.com/v6.0/icons/hashnode'>example</a>
         */
        HASHNODE,
        /**
         * The brands hips icon.See <a href='https://fontawesome.com/v6.0/icons/hips'>example</a>
         */
        HIPS,
        /**
         * The brands hire-a-helper icon.See <a href='https://fontawesome.com/v6.0/icons/hire-a-helper'>example</a>
         */
        HIRE_A_HELPER,
        /**
         * The brands hive icon.See <a href='https://fontawesome.com/v6.0/icons/hive'>example</a>
         */
        HIVE,
        /**
         * The brands hooli icon.See <a href='https://fontawesome.com/v6.0/icons/hooli'>example</a>
         */
        HOOLI,
        /**
         * The brands hornbill icon.See <a href='https://fontawesome.com/v6.0/icons/hornbill'>example</a>
         */
        HORNBILL,
        /**
         * The brands hotjar icon.See <a href='https://fontawesome.com/v6.0/icons/hotjar'>example</a>
         */
        HOTJAR,
        /**
         * The brands houzz icon.See <a href='https://fontawesome.com/v6.0/icons/houzz'>example</a>
         */
        HOUZZ,
        /**
         * The brands html5 icon.See <a href='https://fontawesome.com/v6.0/icons/html5'>example</a>
         */
        HTML5,
        /**
         * The brands hubspot icon.See <a href='https://fontawesome.com/v6.0/icons/hubspot'>example</a>
         */
        HUBSPOT,
        /**
         * The brands ideal icon.See <a href='https://fontawesome.com/v6.0/icons/ideal'>example</a>
         */
        IDEAL,
        /**
         * The brands imdb icon.See <a href='https://fontawesome.com/v6.0/icons/imdb'>example</a>
         */
        IMDB,
        /**
         * The brands instagram icon.See <a href='https://fontawesome.com/v6.0/icons/instagram'>example</a>
         */
        INSTAGRAM,
        /**
         * The brands instagram-square icon.See <a href='https://fontawesome.com/v6.0/icons/instagram-square'>example</a>
         */
        INSTAGRAM_SQUARE,
        /**
         * The brands instalod icon.See <a href='https://fontawesome.com/v6.0/icons/instalod'>example</a>
         */
        INSTALOD,
        /**
         * The brands intercom icon.See <a href='https://fontawesome.com/v6.0/icons/intercom'>example</a>
         */
        INTERCOM,
        /**
         * The brands internet-explorer icon.See <a href='https://fontawesome.com/v6.0/icons/internet-explorer'>example</a>
         */
        INTERNET_EXPLORER,
        /**
         * The brands invision icon.See <a href='https://fontawesome.com/v6.0/icons/invision'>example</a>
         */
        INVISION,
        /**
         * The brands ioxhost icon.See <a href='https://fontawesome.com/v6.0/icons/ioxhost'>example</a>
         */
        IOXHOST,
        /**
         * The brands itch-io icon.See <a href='https://fontawesome.com/v6.0/icons/itch-io'>example</a>
         */
        ITCH_IO,
        /**
         * The brands itunes icon.See <a href='https://fontawesome.com/v6.0/icons/itunes'>example</a>
         */
        ITUNES,
        /**
         * The brands itunes-note icon.See <a href='https://fontawesome.com/v6.0/icons/itunes-note'>example</a>
         */
        ITUNES_NOTE,
        /**
         * The brands java icon.See <a href='https://fontawesome.com/v6.0/icons/java'>example</a>
         */
        JAVA,
        /**
         * The brands jedi-order icon.See <a href='https://fontawesome.com/v6.0/icons/jedi-order'>example</a>
         */
        JEDI_ORDER,
        /**
         * The brands jenkins icon.See <a href='https://fontawesome.com/v6.0/icons/jenkins'>example</a>
         */
        JENKINS,
        /**
         * The brands jira icon.See <a href='https://fontawesome.com/v6.0/icons/jira'>example</a>
         */
        JIRA,
        /**
         * The brands joget icon.See <a href='https://fontawesome.com/v6.0/icons/joget'>example</a>
         */
        JOGET,
        /**
         * The brands joomla icon.See <a href='https://fontawesome.com/v6.0/icons/joomla'>example</a>
         */
        JOOMLA,
        /**
         * The brands js icon.See <a href='https://fontawesome.com/v6.0/icons/js'>example</a>
         */
        JS,
        /**
         * The brands js-square icon.See <a href='https://fontawesome.com/v6.0/icons/js-square'>example</a>
         */
        JS_SQUARE,
        /**
         * The brands jsfiddle icon.See <a href='https://fontawesome.com/v6.0/icons/jsfiddle'>example</a>
         */
        JSFIDDLE,
        /**
         * The brands kaggle icon.See <a href='https://fontawesome.com/v6.0/icons/kaggle'>example</a>
         */
        KAGGLE,
        /**
         * The brands keybase icon.See <a href='https://fontawesome.com/v6.0/icons/keybase'>example</a>
         */
        KEYBASE,
        /**
         * The brands keycdn icon.See <a href='https://fontawesome.com/v6.0/icons/keycdn'>example</a>
         */
        KEYCDN,
        /**
         * The brands kickstarter icon.See <a href='https://fontawesome.com/v6.0/icons/kickstarter'>example</a>
         */
        KICKSTARTER,
        /**
         * The brands kickstarter-k icon.See <a href='https://fontawesome.com/v6.0/icons/kickstarter-k'>example</a>
         */
        KICKSTARTER_K,
        /**
         * The brands korvue icon.See <a href='https://fontawesome.com/v6.0/icons/korvue'>example</a>
         */
        KORVUE,
        /**
         * The brands laravel icon.See <a href='https://fontawesome.com/v6.0/icons/laravel'>example</a>
         */
        LARAVEL,
        /**
         * The brands lastfm icon.See <a href='https://fontawesome.com/v6.0/icons/lastfm'>example</a>
         */
        LASTFM,
        /**
         * The brands lastfm-square icon.See <a href='https://fontawesome.com/v6.0/icons/lastfm-square'>example</a>
         */
        LASTFM_SQUARE,
        /**
         * The brands leanpub icon.See <a href='https://fontawesome.com/v6.0/icons/leanpub'>example</a>
         */
        LEANPUB,
        /**
         * The brands less icon.See <a href='https://fontawesome.com/v6.0/icons/less'>example</a>
         */
        LESS,
        /**
         * The brands line icon.See <a href='https://fontawesome.com/v6.0/icons/line'>example</a>
         */
        LINE,
        /**
         * The brands linkedin icon.See <a href='https://fontawesome.com/v6.0/icons/linkedin'>example</a>
         */
        LINKEDIN,
        /**
         * The brands linkedin-in icon.See <a href='https://fontawesome.com/v6.0/icons/linkedin-in'>example</a>
         */
        LINKEDIN_IN,
        /**
         * The brands linode icon.See <a href='https://fontawesome.com/v6.0/icons/linode'>example</a>
         */
        LINODE,
        /**
         * The brands linux icon.See <a href='https://fontawesome.com/v6.0/icons/linux'>example</a>
         */
        LINUX,
        /**
         * The brands lyft icon.See <a href='https://fontawesome.com/v6.0/icons/lyft'>example</a>
         */
        LYFT,
        /**
         * The brands magento icon.See <a href='https://fontawesome.com/v6.0/icons/magento'>example</a>
         */
        MAGENTO,
        /**
         * The brands mailchimp icon.See <a href='https://fontawesome.com/v6.0/icons/mailchimp'>example</a>
         */
        MAILCHIMP,
        /**
         * The brands mandalorian icon.See <a href='https://fontawesome.com/v6.0/icons/mandalorian'>example</a>
         */
        MANDALORIAN,
        /**
         * The brands markdown icon.See <a href='https://fontawesome.com/v6.0/icons/markdown'>example</a>
         */
        MARKDOWN,
        /**
         * The brands mastodon icon.See <a href='https://fontawesome.com/v6.0/icons/mastodon'>example</a>
         */
        MASTODON,
        /**
         * The brands maxcdn icon.See <a href='https://fontawesome.com/v6.0/icons/maxcdn'>example</a>
         */
        MAXCDN,
        /**
         * The brands mdb icon.See <a href='https://fontawesome.com/v6.0/icons/mdb'>example</a>
         */
        MDB,
        /**
         * The brands medapps icon.See <a href='https://fontawesome.com/v6.0/icons/medapps'>example</a>
         */
        MEDAPPS,
        /**
         * The brands medium icon.See <a href='https://fontawesome.com/v6.0/icons/medium'>example</a>
         */
        MEDIUM,
        /**
         * The brands medrt icon.See <a href='https://fontawesome.com/v6.0/icons/medrt'>example</a>
         */
        MEDRT,
        /**
         * The brands meetup icon.See <a href='https://fontawesome.com/v6.0/icons/meetup'>example</a>
         */
        MEETUP,
        /**
         * The brands megaport icon.See <a href='https://fontawesome.com/v6.0/icons/megaport'>example</a>
         */
        MEGAPORT,
        /**
         * The brands mendeley icon.See <a href='https://fontawesome.com/v6.0/icons/mendeley'>example</a>
         */
        MENDELEY,
        /**
         * The brands microblog icon.See <a href='https://fontawesome.com/v6.0/icons/microblog'>example</a>
         */
        MICROBLOG,
        /**
         * The brands microsoft icon.See <a href='https://fontawesome.com/v6.0/icons/microsoft'>example</a>
         */
        MICROSOFT,
        /**
         * The brands mix icon.See <a href='https://fontawesome.com/v6.0/icons/mix'>example</a>
         */
        MIX,
        /**
         * The brands mixcloud icon.See <a href='https://fontawesome.com/v6.0/icons/mixcloud'>example</a>
         */
        MIXCLOUD,
        /**
         * The brands mixer icon.See <a href='https://fontawesome.com/v6.0/icons/mixer'>example</a>
         */
        MIXER,
        /**
         * The brands mizuni icon.See <a href='https://fontawesome.com/v6.0/icons/mizuni'>example</a>
         */
        MIZUNI,
        /**
         * The brands modx icon.See <a href='https://fontawesome.com/v6.0/icons/modx'>example</a>
         */
        MODX,
        /**
         * The brands monero icon.See <a href='https://fontawesome.com/v6.0/icons/monero'>example</a>
         */
        MONERO,
        /**
         * The brands napster icon.See <a href='https://fontawesome.com/v6.0/icons/napster'>example</a>
         */
        NAPSTER,
        /**
         * The brands neos icon.See <a href='https://fontawesome.com/v6.0/icons/neos'>example</a>
         */
        NEOS,
        /**
         * The brands nimblr icon.See <a href='https://fontawesome.com/v6.0/icons/nimblr'>example</a>
         */
        NIMBLR,
        /**
         * The brands node icon.See <a href='https://fontawesome.com/v6.0/icons/node'>example</a>
         */
        NODE,
        /**
         * The brands node-js icon.See <a href='https://fontawesome.com/v6.0/icons/node-js'>example</a>
         */
        NODE_JS,
        /**
         * The brands npm icon.See <a href='https://fontawesome.com/v6.0/icons/npm'>example</a>
         */
        NPM,
        /**
         * The brands ns8 icon.See <a href='https://fontawesome.com/v6.0/icons/ns8'>example</a>
         */
        NS8,
        /**
         * The brands nutritionix icon.See <a href='https://fontawesome.com/v6.0/icons/nutritionix'>example</a>
         */
        NUTRITIONIX,
        /**
         * The brands octopus-deploy icon.See <a href='https://fontawesome.com/v6.0/icons/octopus-deploy'>example</a>
         */
        OCTOPUS_DEPLOY,
        /**
         * The brands odnoklassniki icon.See <a href='https://fontawesome.com/v6.0/icons/odnoklassniki'>example</a>
         */
        ODNOKLASSNIKI,
        /**
         * The brands odnoklassniki-square icon.See <a href='https://fontawesome.com/v6.0/icons/odnoklassniki-square'>example</a>
         */
        ODNOKLASSNIKI_SQUARE,
        /**
         * The brands old-republic icon.See <a href='https://fontawesome.com/v6.0/icons/old-republic'>example</a>
         */
        OLD_REPUBLIC,
        /**
         * The brands opencart icon.See <a href='https://fontawesome.com/v6.0/icons/opencart'>example</a>
         */
        OPENCART,
        /**
         * The brands openid icon.See <a href='https://fontawesome.com/v6.0/icons/openid'>example</a>
         */
        OPENID,
        /**
         * The brands opera icon.See <a href='https://fontawesome.com/v6.0/icons/opera'>example</a>
         */
        OPERA,
        /**
         * The brands optin-monster icon.See <a href='https://fontawesome.com/v6.0/icons/optin-monster'>example</a>
         */
        OPTIN_MONSTER,
        /**
         * The brands orcid icon.See <a href='https://fontawesome.com/v6.0/icons/orcid'>example</a>
         */
        ORCID,
        /**
         * The brands osi icon.See <a href='https://fontawesome.com/v6.0/icons/osi'>example</a>
         */
        OSI,
        /**
         * The brands padlet icon.See <a href='https://fontawesome.com/v6.0/icons/padlet'>example</a>
         */
        PADLET,
        /**
         * The brands page4 icon.See <a href='https://fontawesome.com/v6.0/icons/page4'>example</a>
         */
        PAGE4,
        /**
         * The brands pagelines icon.See <a href='https://fontawesome.com/v6.0/icons/pagelines'>example</a>
         */
        PAGELINES,
        /**
         * The brands palfed icon.See <a href='https://fontawesome.com/v6.0/icons/palfed'>example</a>
         */
        PALFED,
        /**
         * The brands patreon icon.See <a href='https://fontawesome.com/v6.0/icons/patreon'>example</a>
         */
        PATREON,
        /**
         * The brands paypal icon.See <a href='https://fontawesome.com/v6.0/icons/paypal'>example</a>
         */
        PAYPAL,
        /**
         * The brands perbyte icon.See <a href='https://fontawesome.com/v6.0/icons/perbyte'>example</a>
         */
        PERBYTE,
        /**
         * The brands periscope icon.See <a href='https://fontawesome.com/v6.0/icons/periscope'>example</a>
         */
        PERISCOPE,
        /**
         * The brands phabricator icon.See <a href='https://fontawesome.com/v6.0/icons/phabricator'>example</a>
         */
        PHABRICATOR,
        /**
         * The brands phoenix-framework icon.See <a href='https://fontawesome.com/v6.0/icons/phoenix-framework'>example</a>
         */
        PHOENIX_FRAMEWORK,
        /**
         * The brands phoenix-squadron icon.See <a href='https://fontawesome.com/v6.0/icons/phoenix-squadron'>example</a>
         */
        PHOENIX_SQUADRON,
        /**
         * The brands php icon.See <a href='https://fontawesome.com/v6.0/icons/php'>example</a>
         */
        PHP,
        /**
         * The brands pied-piper icon.See <a href='https://fontawesome.com/v6.0/icons/pied-piper'>example</a>
         */
        PIED_PIPER,
        /**
         * The brands pied-piper-alt icon.See <a href='https://fontawesome.com/v6.0/icons/pied-piper-alt'>example</a>
         */
        PIED_PIPER_ALT,
        /**
         * The brands pied-piper-hat icon.See <a href='https://fontawesome.com/v6.0/icons/pied-piper-hat'>example</a>
         */
        PIED_PIPER_HAT,
        /**
         * The brands pied-piper-pp icon.See <a href='https://fontawesome.com/v6.0/icons/pied-piper-pp'>example</a>
         */
        PIED_PIPER_PP,
        /**
         * The brands pied-piper-square icon.See <a href='https://fontawesome.com/v6.0/icons/pied-piper-square'>example</a>
         */
        PIED_PIPER_SQUARE,
        /**
         * The brands pinterest icon.See <a href='https://fontawesome.com/v6.0/icons/pinterest'>example</a>
         */
        PINTEREST,
        /**
         * The brands pinterest-p icon.See <a href='https://fontawesome.com/v6.0/icons/pinterest-p'>example</a>
         */
        PINTEREST_P,
        /**
         * The brands pinterest-square icon.See <a href='https://fontawesome.com/v6.0/icons/pinterest-square'>example</a>
         */
        PINTEREST_SQUARE,
        /**
         * The brands pix icon.See <a href='https://fontawesome.com/v6.0/icons/pix'>example</a>
         */
        PIX,
        /**
         * The brands playstation icon.See <a href='https://fontawesome.com/v6.0/icons/playstation'>example</a>
         */
        PLAYSTATION,
        /**
         * The brands product-hunt icon.See <a href='https://fontawesome.com/v6.0/icons/product-hunt'>example</a>
         */
        PRODUCT_HUNT,
        /**
         * The brands pushed icon.See <a href='https://fontawesome.com/v6.0/icons/pushed'>example</a>
         */
        PUSHED,
        /**
         * The brands python icon.See <a href='https://fontawesome.com/v6.0/icons/python'>example</a>
         */
        PYTHON,
        /**
         * The brands qq icon.See <a href='https://fontawesome.com/v6.0/icons/qq'>example</a>
         */
        QQ,
        /**
         * The brands quinscape icon.See <a href='https://fontawesome.com/v6.0/icons/quinscape'>example</a>
         */
        QUINSCAPE,
        /**
         * The brands quora icon.See <a href='https://fontawesome.com/v6.0/icons/quora'>example</a>
         */
        QUORA,
        /**
         * The brands r-project icon.See <a href='https://fontawesome.com/v6.0/icons/r-project'>example</a>
         */
        R_PROJECT,
        /**
         * The brands raspberry-pi icon.See <a href='https://fontawesome.com/v6.0/icons/raspberry-pi'>example</a>
         */
        RASPBERRY_PI,
        /**
         * The brands ravelry icon.See <a href='https://fontawesome.com/v6.0/icons/ravelry'>example</a>
         */
        RAVELRY,
        /**
         * The brands react icon.See <a href='https://fontawesome.com/v6.0/icons/react'>example</a>
         */
        REACT,
        /**
         * The brands reacteurope icon.See <a href='https://fontawesome.com/v6.0/icons/reacteurope'>example</a>
         */
        REACTEUROPE,
        /**
         * The brands readme icon.See <a href='https://fontawesome.com/v6.0/icons/readme'>example</a>
         */
        README,
        /**
         * The brands rebel icon.See <a href='https://fontawesome.com/v6.0/icons/rebel'>example</a>
         */
        REBEL,
        /**
         * The brands red-river icon.See <a href='https://fontawesome.com/v6.0/icons/red-river'>example</a>
         */
        RED_RIVER,
        /**
         * The brands reddit icon.See <a href='https://fontawesome.com/v6.0/icons/reddit'>example</a>
         */
        REDDIT,
        /**
         * The brands reddit-alien icon.See <a href='https://fontawesome.com/v6.0/icons/reddit-alien'>example</a>
         */
        REDDIT_ALIEN,
        /**
         * The brands reddit-square icon.See <a href='https://fontawesome.com/v6.0/icons/reddit-square'>example</a>
         */
        REDDIT_SQUARE,
        /**
         * The brands redhat icon.See <a href='https://fontawesome.com/v6.0/icons/redhat'>example</a>
         */
        REDHAT,
        /**
         * The brands renren icon.See <a href='https://fontawesome.com/v6.0/icons/renren'>example</a>
         */
        RENREN,
        /**
         * The brands replyd icon.See <a href='https://fontawesome.com/v6.0/icons/replyd'>example</a>
         */
        REPLYD,
        /**
         * The brands researchgate icon.See <a href='https://fontawesome.com/v6.0/icons/researchgate'>example</a>
         */
        RESEARCHGATE,
        /**
         * The brands resolving icon.See <a href='https://fontawesome.com/v6.0/icons/resolving'>example</a>
         */
        RESOLVING,
        /**
         * The brands rev icon.See <a href='https://fontawesome.com/v6.0/icons/rev'>example</a>
         */
        REV,
        /**
         * The brands rocketchat icon.See <a href='https://fontawesome.com/v6.0/icons/rocketchat'>example</a>
         */
        ROCKETCHAT,
        /**
         * The brands rockrms icon.See <a href='https://fontawesome.com/v6.0/icons/rockrms'>example</a>
         */
        ROCKRMS,
        /**
         * The brands rust icon.See <a href='https://fontawesome.com/v6.0/icons/rust'>example</a>
         */
        RUST,
        /**
         * The brands safari icon.See <a href='https://fontawesome.com/v6.0/icons/safari'>example</a>
         */
        SAFARI,
        /**
         * The brands salesforce icon.See <a href='https://fontawesome.com/v6.0/icons/salesforce'>example</a>
         */
        SALESFORCE,
        /**
         * The brands sass icon.See <a href='https://fontawesome.com/v6.0/icons/sass'>example</a>
         */
        SASS,
        /**
         * The brands schlix icon.See <a href='https://fontawesome.com/v6.0/icons/schlix'>example</a>
         */
        SCHLIX,
        /**
         * The brands scribd icon.See <a href='https://fontawesome.com/v6.0/icons/scribd'>example</a>
         */
        SCRIBD,
        /**
         * The brands searchengin icon.See <a href='https://fontawesome.com/v6.0/icons/searchengin'>example</a>
         */
        SEARCHENGIN,
        /**
         * The brands sellcast icon.See <a href='https://fontawesome.com/v6.0/icons/sellcast'>example</a>
         */
        SELLCAST,
        /**
         * The brands sellsy icon.See <a href='https://fontawesome.com/v6.0/icons/sellsy'>example</a>
         */
        SELLSY,
        /**
         * The brands servicestack icon.See <a href='https://fontawesome.com/v6.0/icons/servicestack'>example</a>
         */
        SERVICESTACK,
        /**
         * The brands shirtsinbulk icon.See <a href='https://fontawesome.com/v6.0/icons/shirtsinbulk'>example</a>
         */
        SHIRTSINBULK,
        /**
         * The brands shopify icon.See <a href='https://fontawesome.com/v6.0/icons/shopify'>example</a>
         */
        SHOPIFY,
        /**
         * The brands shopware icon.See <a href='https://fontawesome.com/v6.0/icons/shopware'>example</a>
         */
        SHOPWARE,
        /**
         * The brands simplybuilt icon.See <a href='https://fontawesome.com/v6.0/icons/simplybuilt'>example</a>
         */
        SIMPLYBUILT,
        /**
         * The brands sistrix icon.See <a href='https://fontawesome.com/v6.0/icons/sistrix'>example</a>
         */
        SISTRIX,
        /**
         * The brands sith icon.See <a href='https://fontawesome.com/v6.0/icons/sith'>example</a>
         */
        SITH,
        /**
         * The brands sitrox icon.See <a href='https://fontawesome.com/v6.0/icons/sitrox'>example</a>
         */
        SITROX,
        /**
         * The brands sketch icon.See <a href='https://fontawesome.com/v6.0/icons/sketch'>example</a>
         */
        SKETCH,
        /**
         * The brands skyatlas icon.See <a href='https://fontawesome.com/v6.0/icons/skyatlas'>example</a>
         */
        SKYATLAS,
        /**
         * The brands skype icon.See <a href='https://fontawesome.com/v6.0/icons/skype'>example</a>
         */
        SKYPE,
        /**
         * The brands slack icon.See <a href='https://fontawesome.com/v6.0/icons/slack'>example</a>
         */
        SLACK,
        /**
         * The brands slideshare icon.See <a href='https://fontawesome.com/v6.0/icons/slideshare'>example</a>
         */
        SLIDESHARE,
        /**
         * The brands snapchat icon.See <a href='https://fontawesome.com/v6.0/icons/snapchat'>example</a>
         */
        SNAPCHAT,
        /**
         * The brands snapchat-square icon.See <a href='https://fontawesome.com/v6.0/icons/snapchat-square'>example</a>
         */
        SNAPCHAT_SQUARE,
        /**
         * The brands soundcloud icon.See <a href='https://fontawesome.com/v6.0/icons/soundcloud'>example</a>
         */
        SOUNDCLOUD,
        /**
         * The brands sourcetree icon.See <a href='https://fontawesome.com/v6.0/icons/sourcetree'>example</a>
         */
        SOURCETREE,
        /**
         * The brands speakap icon.See <a href='https://fontawesome.com/v6.0/icons/speakap'>example</a>
         */
        SPEAKAP,
        /**
         * The brands speaker-deck icon.See <a href='https://fontawesome.com/v6.0/icons/speaker-deck'>example</a>
         */
        SPEAKER_DECK,
        /**
         * The brands spotify icon.See <a href='https://fontawesome.com/v6.0/icons/spotify'>example</a>
         */
        SPOTIFY,
        /**
         * The brands square-font-awesome icon.See <a href='https://fontawesome.com/v6.0/icons/square-font-awesome'>example</a>
         */
        SQUARE_FONT_AWESOME,
        /**
         * The brands square-font-awesome-stroke icon.See <a href='https://fontawesome.com/v6.0/icons/square-font-awesome-stroke'>example</a>
         */
        SQUARE_FONT_AWESOME_STROKE,
        /**
         * The brands squarespace icon.See <a href='https://fontawesome.com/v6.0/icons/squarespace'>example</a>
         */
        SQUARESPACE,
        /**
         * The brands stack-exchange icon.See <a href='https://fontawesome.com/v6.0/icons/stack-exchange'>example</a>
         */
        STACK_EXCHANGE,
        /**
         * The brands stack-overflow icon.See <a href='https://fontawesome.com/v6.0/icons/stack-overflow'>example</a>
         */
        STACK_OVERFLOW,
        /**
         * The brands stackpath icon.See <a href='https://fontawesome.com/v6.0/icons/stackpath'>example</a>
         */
        STACKPATH,
        /**
         * The brands staylinked icon.See <a href='https://fontawesome.com/v6.0/icons/staylinked'>example</a>
         */
        STAYLINKED,
        /**
         * The brands steam icon.See <a href='https://fontawesome.com/v6.0/icons/steam'>example</a>
         */
        STEAM,
        /**
         * The brands steam-square icon.See <a href='https://fontawesome.com/v6.0/icons/steam-square'>example</a>
         */
        STEAM_SQUARE,
        /**
         * The brands steam-symbol icon.See <a href='https://fontawesome.com/v6.0/icons/steam-symbol'>example</a>
         */
        STEAM_SYMBOL,
        /**
         * The brands sticker-mule icon.See <a href='https://fontawesome.com/v6.0/icons/sticker-mule'>example</a>
         */
        STICKER_MULE,
        /**
         * The brands strava icon.See <a href='https://fontawesome.com/v6.0/icons/strava'>example</a>
         */
        STRAVA,
        /**
         * The brands stripe icon.See <a href='https://fontawesome.com/v6.0/icons/stripe'>example</a>
         */
        STRIPE,
        /**
         * The brands stripe-s icon.See <a href='https://fontawesome.com/v6.0/icons/stripe-s'>example</a>
         */
        STRIPE_S,
        /**
         * The brands studiovinari icon.See <a href='https://fontawesome.com/v6.0/icons/studiovinari'>example</a>
         */
        STUDIOVINARI,
        /**
         * The brands stumbleupon icon.See <a href='https://fontawesome.com/v6.0/icons/stumbleupon'>example</a>
         */
        STUMBLEUPON,
        /**
         * The brands stumbleupon-circle icon.See <a href='https://fontawesome.com/v6.0/icons/stumbleupon-circle'>example</a>
         */
        STUMBLEUPON_CIRCLE,
        /**
         * The brands superpowers icon.See <a href='https://fontawesome.com/v6.0/icons/superpowers'>example</a>
         */
        SUPERPOWERS,
        /**
         * The brands supple icon.See <a href='https://fontawesome.com/v6.0/icons/supple'>example</a>
         */
        SUPPLE,
        /**
         * The brands suse icon.See <a href='https://fontawesome.com/v6.0/icons/suse'>example</a>
         */
        SUSE,
        /**
         * The brands swift icon.See <a href='https://fontawesome.com/v6.0/icons/swift'>example</a>
         */
        SWIFT,
        /**
         * The brands symfony icon.See <a href='https://fontawesome.com/v6.0/icons/symfony'>example</a>
         */
        SYMFONY,
        /**
         * The brands teamspeak icon.See <a href='https://fontawesome.com/v6.0/icons/teamspeak'>example</a>
         */
        TEAMSPEAK,
        /**
         * The brands telegram icon.See <a href='https://fontawesome.com/v6.0/icons/telegram'>example</a>
         */
        TELEGRAM,
        /**
         * The brands tencent-weibo icon.See <a href='https://fontawesome.com/v6.0/icons/tencent-weibo'>example</a>
         */
        TENCENT_WEIBO,
        /**
         * The brands the-red-yeti icon.See <a href='https://fontawesome.com/v6.0/icons/the-red-yeti'>example</a>
         */
        THE_RED_YETI,
        /**
         * The brands themeco icon.See <a href='https://fontawesome.com/v6.0/icons/themeco'>example</a>
         */
        THEMECO,
        /**
         * The brands themeisle icon.See <a href='https://fontawesome.com/v6.0/icons/themeisle'>example</a>
         */
        THEMEISLE,
        /**
         * The brands think-peaks icon.See <a href='https://fontawesome.com/v6.0/icons/think-peaks'>example</a>
         */
        THINK_PEAKS,
        /**
         * The brands tiktok icon.See <a href='https://fontawesome.com/v6.0/icons/tiktok'>example</a>
         */
        TIKTOK,
        /**
         * The brands trade-federation icon.See <a href='https://fontawesome.com/v6.0/icons/trade-federation'>example</a>
         */
        TRADE_FEDERATION,
        /**
         * The brands trello icon.See <a href='https://fontawesome.com/v6.0/icons/trello'>example</a>
         */
        TRELLO,
        /**
         * The brands tumblr icon.See <a href='https://fontawesome.com/v6.0/icons/tumblr'>example</a>
         */
        TUMBLR,
        /**
         * The brands tumblr-square icon.See <a href='https://fontawesome.com/v6.0/icons/tumblr-square'>example</a>
         */
        TUMBLR_SQUARE,
        /**
         * The brands twitch icon.See <a href='https://fontawesome.com/v6.0/icons/twitch'>example</a>
         */
        TWITCH,
        /**
         * The brands twitter icon.See <a href='https://fontawesome.com/v6.0/icons/twitter'>example</a>
         */
        TWITTER,
        /**
         * The brands twitter-square icon.See <a href='https://fontawesome.com/v6.0/icons/twitter-square'>example</a>
         */
        TWITTER_SQUARE,
        /**
         * The brands typo3 icon.See <a href='https://fontawesome.com/v6.0/icons/typo3'>example</a>
         */
        TYPO3,
        /**
         * The brands uber icon.See <a href='https://fontawesome.com/v6.0/icons/uber'>example</a>
         */
        UBER,
        /**
         * The brands ubuntu icon.See <a href='https://fontawesome.com/v6.0/icons/ubuntu'>example</a>
         */
        UBUNTU,
        /**
         * The brands uikit icon.See <a href='https://fontawesome.com/v6.0/icons/uikit'>example</a>
         */
        UIKIT,
        /**
         * The brands umbraco icon.See <a href='https://fontawesome.com/v6.0/icons/umbraco'>example</a>
         */
        UMBRACO,
        /**
         * The brands uncharted icon.See <a href='https://fontawesome.com/v6.0/icons/uncharted'>example</a>
         */
        UNCHARTED,
        /**
         * The brands uniregistry icon.See <a href='https://fontawesome.com/v6.0/icons/uniregistry'>example</a>
         */
        UNIREGISTRY,
        /**
         * The brands unity icon.See <a href='https://fontawesome.com/v6.0/icons/unity'>example</a>
         */
        UNITY,
        /**
         * The brands unsplash icon.See <a href='https://fontawesome.com/v6.0/icons/unsplash'>example</a>
         */
        UNSPLASH,
        /**
         * The brands untappd icon.See <a href='https://fontawesome.com/v6.0/icons/untappd'>example</a>
         */
        UNTAPPD,
        /**
         * The brands ups icon.See <a href='https://fontawesome.com/v6.0/icons/ups'>example</a>
         */
        UPS,
        /**
         * The brands usb icon.See <a href='https://fontawesome.com/v6.0/icons/usb'>example</a>
         */
        USB,
        /**
         * The brands usps icon.See <a href='https://fontawesome.com/v6.0/icons/usps'>example</a>
         */
        USPS,
        /**
         * The brands ussunnah icon.See <a href='https://fontawesome.com/v6.0/icons/ussunnah'>example</a>
         */
        USSUNNAH,
        /**
         * The brands vaadin icon.See <a href='https://fontawesome.com/v6.0/icons/vaadin'>example</a>
         */
        VAADIN,
        /**
         * The brands viacoin icon.See <a href='https://fontawesome.com/v6.0/icons/viacoin'>example</a>
         */
        VIACOIN,
        /**
         * The brands viadeo icon.See <a href='https://fontawesome.com/v6.0/icons/viadeo'>example</a>
         */
        VIADEO,
        /**
         * The brands viadeo-square icon.See <a href='https://fontawesome.com/v6.0/icons/viadeo-square'>example</a>
         */
        VIADEO_SQUARE,
        /**
         * The brands viber icon.See <a href='https://fontawesome.com/v6.0/icons/viber'>example</a>
         */
        VIBER,
        /**
         * The brands vimeo icon.See <a href='https://fontawesome.com/v6.0/icons/vimeo'>example</a>
         */
        VIMEO,
        /**
         * The brands vimeo-square icon.See <a href='https://fontawesome.com/v6.0/icons/vimeo-square'>example</a>
         */
        VIMEO_SQUARE,
        /**
         * The brands vimeo-v icon.See <a href='https://fontawesome.com/v6.0/icons/vimeo-v'>example</a>
         */
        VIMEO_V,
        /**
         * The brands vine icon.See <a href='https://fontawesome.com/v6.0/icons/vine'>example</a>
         */
        VINE,
        /**
         * The brands vk icon.See <a href='https://fontawesome.com/v6.0/icons/vk'>example</a>
         */
        VK,
        /**
         * The brands vnv icon.See <a href='https://fontawesome.com/v6.0/icons/vnv'>example</a>
         */
        VNV,
        /**
         * The brands vuejs icon.See <a href='https://fontawesome.com/v6.0/icons/vuejs'>example</a>
         */
        VUEJS,
        /**
         * The brands watchman-monitoring icon.See <a href='https://fontawesome.com/v6.0/icons/watchman-monitoring'>example</a>
         */
        WATCHMAN_MONITORING,
        /**
         * The brands waze icon.See <a href='https://fontawesome.com/v6.0/icons/waze'>example</a>
         */
        WAZE,
        /**
         * The brands weebly icon.See <a href='https://fontawesome.com/v6.0/icons/weebly'>example</a>
         */
        WEEBLY,
        /**
         * The brands weibo icon.See <a href='https://fontawesome.com/v6.0/icons/weibo'>example</a>
         */
        WEIBO,
        /**
         * The brands weixin icon.See <a href='https://fontawesome.com/v6.0/icons/weixin'>example</a>
         */
        WEIXIN,
        /**
         * The brands whatsapp icon.See <a href='https://fontawesome.com/v6.0/icons/whatsapp'>example</a>
         */
        WHATSAPP,
        /**
         * The brands whatsapp-square icon.See <a href='https://fontawesome.com/v6.0/icons/whatsapp-square'>example</a>
         */
        WHATSAPP_SQUARE,
        /**
         * The brands whmcs icon.See <a href='https://fontawesome.com/v6.0/icons/whmcs'>example</a>
         */
        WHMCS,
        /**
         * The brands wikipedia-w icon.See <a href='https://fontawesome.com/v6.0/icons/wikipedia-w'>example</a>
         */
        WIKIPEDIA_W,
        /**
         * The brands windows icon.See <a href='https://fontawesome.com/v6.0/icons/windows'>example</a>
         */
        WINDOWS,
        /**
         * The brands wirsindhandwerk icon.See <a href='https://fontawesome.com/v6.0/icons/wirsindhandwerk'>example</a>
         */
        WIRSINDHANDWERK,
        /**
         * The brands wix icon.See <a href='https://fontawesome.com/v6.0/icons/wix'>example</a>
         */
        WIX,
        /**
         * The brands wizards-of-the-coast icon.See <a href='https://fontawesome.com/v6.0/icons/wizards-of-the-coast'>example</a>
         */
        WIZARDS_OF_THE_COAST,
        /**
         * The brands wodu icon.See <a href='https://fontawesome.com/v6.0/icons/wodu'>example</a>
         */
        WODU,
        /**
         * The brands wolf-pack-battalion icon.See <a href='https://fontawesome.com/v6.0/icons/wolf-pack-battalion'>example</a>
         */
        WOLF_PACK_BATTALION,
        /**
         * The brands wordpress icon.See <a href='https://fontawesome.com/v6.0/icons/wordpress'>example</a>
         */
        WORDPRESS,
        /**
         * The brands wordpress-simple icon.See <a href='https://fontawesome.com/v6.0/icons/wordpress-simple'>example</a>
         */
        WORDPRESS_SIMPLE,
        /**
         * The brands wpbeginner icon.See <a href='https://fontawesome.com/v6.0/icons/wpbeginner'>example</a>
         */
        WPBEGINNER,
        /**
         * The brands wpexplorer icon.See <a href='https://fontawesome.com/v6.0/icons/wpexplorer'>example</a>
         */
        WPEXPLORER,
        /**
         * The brands wpforms icon.See <a href='https://fontawesome.com/v6.0/icons/wpforms'>example</a>
         */
        WPFORMS,
        /**
         * The brands wpressr icon.See <a href='https://fontawesome.com/v6.0/icons/wpressr'>example</a>
         */
        WPRESSR,
        /**
         * The brands xbox icon.See <a href='https://fontawesome.com/v6.0/icons/xbox'>example</a>
         */
        XBOX,
        /**
         * The brands xing icon.See <a href='https://fontawesome.com/v6.0/icons/xing'>example</a>
         */
        XING,
        /**
         * The brands xing-square icon.See <a href='https://fontawesome.com/v6.0/icons/xing-square'>example</a>
         */
        XING_SQUARE,
        /**
         * The brands y-combinator icon.See <a href='https://fontawesome.com/v6.0/icons/y-combinator'>example</a>
         */
        Y_COMBINATOR,
        /**
         * The brands yahoo icon.See <a href='https://fontawesome.com/v6.0/icons/yahoo'>example</a>
         */
        YAHOO,
        /**
         * The brands yammer icon.See <a href='https://fontawesome.com/v6.0/icons/yammer'>example</a>
         */
        YAMMER,
        /**
         * The brands yandex icon.See <a href='https://fontawesome.com/v6.0/icons/yandex'>example</a>
         */
        YANDEX,
        /**
         * The brands yandex-international icon.See <a href='https://fontawesome.com/v6.0/icons/yandex-international'>example</a>
         */
        YANDEX_INTERNATIONAL,
        /**
         * The brands yarn icon.See <a href='https://fontawesome.com/v6.0/icons/yarn'>example</a>
         */
        YARN,
        /**
         * The brands yelp icon.See <a href='https://fontawesome.com/v6.0/icons/yelp'>example</a>
         */
        YELP,
        /**
         * The brands yoast icon.See <a href='https://fontawesome.com/v6.0/icons/yoast'>example</a>
         */
        YOAST,
        /**
         * The brands youtube icon.See <a href='https://fontawesome.com/v6.0/icons/youtube'>example</a>
         */
        YOUTUBE,
        /**
         * The brands youtube-square icon.See <a href='https://fontawesome.com/v6.0/icons/youtube-square'>example</a>
         */
        YOUTUBE_SQUARE,
        /**
         * The brands zhihu icon.See <a href='https://fontawesome.com/v6.0/icons/zhihu'>example</a>
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
        @NpmPackage(value = "@flowingcode/font-awesome-iron-iconset", version = "4.0.0")
        @SuppressWarnings("serial")
        public static final class Icon extends com.vaadin.flow.component.icon.Icon implements ClickNotifier<com.vaadin.flow.component.icon.Icon> {

             Icon(String icon) {
                super(ICONSET, icon);
            }
        }
    }
}
