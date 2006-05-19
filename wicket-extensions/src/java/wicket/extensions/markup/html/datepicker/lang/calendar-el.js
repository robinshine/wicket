// ** I18N
Calendar._DN = new Array
("???????",
 "???????",
 "?????",
 "???????",
 "??????",
 "?????????",
 "???????",
 "???????");

Calendar._SDN = new Array
("??",
 "??",
 "T?",
 "??",
 "??",
 "??",
 "??",
 "??");

Calendar._MN = new Array
("??????????",
 "???????????",
 "???????",
 "????????",
 "?????",
 "???????",
 "???????",
 "?????????",
 "???????????",
 "?????????",
 "?????????",
 "??????????");

Calendar._SMN = new Array
("???",
 "???",
 "???",
 "???",
 "???",
 "????",
 "????",
 "???",
 "???",
 "???",
 "???",
 "???");

// First day of the week. "0" means display Sunday first, "1" means display
// Monday first, etc.
Calendar._FD = 1;

// tooltips
Calendar._TT = {};
Calendar._TT["INFO"] = "??? ?? ??????????";

Calendar._TT["ABOUT"] =
"????????? ???????????/???? ?? DHTML\n" +
"(c) dynarch.com 2002-2005 / Author: Mihai Bazon\n" + // don't translate this this ;-)
"??? ????????? ??????: http://www.dynarch.com/projects/calendar/\n" +
"Distributed under GNU LGPL.  See http://gnu.org/licenses/lgpl.html for details." +
"\n\n" +
"??????? ???????????:\n" +
"- ??????????????? ?? ??????? \xab, \xbb ??? ??????? ?????\n" +
"- ??????????????? ?? ??????? " + String.fromCharCode(0x2039) + ", " + String.fromCharCode(0x203a) + " ??? ??????? ????\n" +
"- ???????? ?????? ???????? ???????? ??? ???????? ??????? ??? ??? ??????? ???????.";
Calendar._TT["ABOUT_TIME"] = "\n\n" +
"??????? ????:\n" +
"- ????? ???? ?? ??? ??? ?? ???? ??? ???? ??? ??????\n" +
"- ? Shift-???? ??? ??????\n" +
"- ? ???? ??? ?????????? ??? ??? ??????? ???????.";
Calendar._TT["TOGGLE"] = "????? ?????? ?????? ??? ?????????";
Calendar._TT["PREV_YEAR"] = "?????. ???? (???????? ??? ?? ?????)";
Calendar._TT["PREV_MONTH"] = "?????. ????? (???????? ??? ?? ?????)";
Calendar._TT["GO_TODAY"] = "??????";
Calendar._TT["NEXT_MONTH"] = "???????? ????? (???????? ??? ?? ?????)";
Calendar._TT["NEXT_YEAR"] = "??????? ???? (???????? ??? ?? ?????)";
Calendar._TT["SEL_DATE"] = "???????? ??????????";
Calendar._TT["DRAG_TO_MOVE"] = "????? ??? ?? ????????????";
Calendar._TT["PART_TODAY"] = " (??????)";
Calendar._TT["MON_FIRST"] = "???????? ???????? ?????";
Calendar._TT["SUN_FIRST"] = "???????? ???????? ?????";
Calendar._TT["CLOSE"] = "????????";
Calendar._TT["TODAY"] = "??????";
Calendar._TT["TIME_PART"] = "(Shift-)???? ? ?????????? ??? ??????";

// the following is to inform that "%s" is to be the first day of week
// %s will be replaced with the day name.
Calendar._TT["DAY_FIRST"] = "Display %s first";

// This may be locale-dependent.  It specifies the week-end days, as an array
// of comma-separated numbers.  The numbers are from 0 to 6: 0 means Sunday, 1
// means Monday, etc.
Calendar._TT["WEEKEND"] = "0,6";

Calendar._TT["TIME_PART"] = "(Shift-)Click or drag to change value";

// date formats
Calendar._TT["DEF_DATE_FORMAT"] = "%Y-%m-%d";
Calendar._TT["TT_DATE_FORMAT"] = "%a, %b %e";

Calendar._TT["WK"] = "wk";
Calendar._TT["TIME"] = "Tijd:";
