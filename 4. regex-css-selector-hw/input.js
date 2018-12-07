regExps = {
"exercise_1": /[A-Z]+[a-z]+/,
"exercise_2": /088[1-7]{7}/,
"exercise_3": /[^0-1]+/, //or /l|2|OO/
"exercise_4": /^[a-zA-Z][\w.]{2,15}$/,
"exercise_5": /1[0-4][0-9]{2}|^[\d]{0,3}$|1500/,
"exercise_6": /class=.[\w\s]+./
};

//exercise_2: Having phone numbers from out of the state which require an area code, or international numbers which require a prefix will add complexity to the regular expression, as does the
// individual preferences that people have for entering phone numbers (some put dashes or whitespace while others do not for example).

//exercise_3:  We use a similar expression that excludes specific characters using the square brackets and the ^ (hat).

//"exercise_1": [["this iS not the last homework of Internet Programming", "Internet"], ["WHAT if there 1s all CAPS Words.", "Words"], ["what if the wOrD is mixed in Another?", "Or"]],
//"exercise_2": [["574398798745398745398475398489287593847593845983749570934857938453940881234567748379289342983477382739488473", "0881234567"], ["8217364827634827346730881234-2389476276340887777777882348727634726773-088088088088088088", "0887777777"], ["01923981238172630880123456732984572389782374928340887654321823467234", "0887654321"]],
//"exercise_3": [["011101000111010101100101011100110010000001101001011100110012000000111010001101000011001010010000001100010011001010111001101110100", "2"], ["01110100011101010110010101110011001000000110l00101110011001000000111010001101000011001010010000001100010011001010111001101110100", "l"], ["01110100011101010110010101110011OO1000000110100101110011001000000111010001101000011001010010000001100010011001010111001101110100", "OO"]],
//"exercise_4": [["validusername", "validusername"], ["valid.username", "valid.username"], ["valid_username", "valid_username"], ["notvalidu$ername", null], ["notv@lidusername", null], [".notvalidusername", null], ["0notvalidusername", null], ["_notvalidusername", null], ["val1dusername", "val1dusername"], ["no", null], ["notvalidnotvalidnotvalidnotvalid", null], ["isV", "isV"]],
//"exercise_5": [["1000", "1000"], ["1500", "1500"], ["1501", null], ["999", "999"], ["2000", null], ["1399", "1399"], ["1499", "1499"]],
//"exercise_6": [["<div class='first second third' />", "class='first second third'"], ["Mercedess S class", null], ["class=12", null], ["<table class=\"someClass\" >", "class=\"someClass\""]],


cssSelectors = {
"exercise_1": "item > java.class1",
"exercise_2": "different > different > .diffClass",
"exercise_3": "item > java> tag.class1.class2",
"exercise_4": "css > item:nth-child(3)",
"exercise_5": "tag > java:nth-child(2)",
"exercise_6": "item.class1 > item, item.class2 > item",
"exercise_7": "different#diffId2 > java:nth-child(2)",
"exercise_8": "css > item#someId"
};

//"exercise_1": ["3-2"],
//"exercise_2": ["4-1-1","4-1-2","4-2-1","4-2-2"],
//"exercise_3": ["3-2-3"],
//"exercise_4": ["3"],
//"exercise_5": ["1-1-2"],
//"exercise_6": ["2-1-1-2-1", "2-1-2-1-1"],
//"exercise_7": ["4-2-2"],
//"exercise_8": ["2"]
