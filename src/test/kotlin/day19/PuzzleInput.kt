package day19

val puzzleInputPatterns = """bubgb, buburr, rrrbrr, wubgbb, gggbw, wrr, rrbu, wbw, gubr, bruu, bub, rww, gguubguu, wwb, ugbrrw, burur, rgwwb, ugu, bbu, rug, uwwb, ggw, bgb, wbru, uuwrrrg, uuug, gur, urguw, ugru, urbwggg, bru, rgug, guu, g, grwr, rbuwb, bbr, wgbr, gubrw, rwrgb, rbw, buw, gbg, wrw, wrbrwg, gbrg, urgubgb, uwg, wggubgr, rgrub, bwuugrwr, gurgu, bur, wwgwwbu, bbbrgu, wbggru, wbuur, rgubg, rwww, br, wbr, wgrrggb, wwuubgg, gbu, uuu, rwbwb, uwugrgu, bugrgwwu, wgwbb, bgwwggr, wgbb, rubbr, ugbrbgub, urg, uruuwu, ggb, rgwwg, guw, uruur, wbgbr, wrbrbw, rrrggr, rgw, rgbgwbu, uru, bwgbgr, wwgg, ggbrgwr, rwgurruu, uwbr, rwur, uu, uugr, wg, wbuwuwr, bwbu, bgw, gbr, uugb, bubw, wrg, ugw, rwb, ww, rrggrb, ugww, bbw, wbb, ubbrwr, wrwr, uwbb, uwr, ugrg, ruu, gbw, gwurr, wwu, bbg, wbbw, rgww, wwbb, wuu, wwbwr, uugbwb, bbrw, wguwr, rugr, rgb, ubb, wrgr, grrrw, rrb, burwr, www, uub, wgbbwbb, rw, rbww, uwu, ugb, ugrw, ruuuubb, uwbbw, rgg, wuw, grbbw, gbru, rb, gwrwr, bgg, gwuug, rgu, bugrbb, rrrr, rubwu, bgbbu, wbgubbg, wwwuw, wwrb, uwgbg, rur, rbbu, rbr, rrrbwb, rgggugu, bgwuu, rbwgrbg, gbwwuuru, gg, wgru, grrub, ruurb, urgw, wuurgw, bbbgwww, gwb, gwwb, rbuw, ruuwwg, uuw, brggrw, wubgwu, ubw, ubgb, wbu, bubrrgww, wbg, brw, bggrrr, uwubw, wbbugu, bgu, rrbbww, ru, wbgbw, ggrwrugg, bwbwg, gbb, urwrrb, uuwuggr, gugw, urb, wbwbwrrb, grbwb, wwwgg, gwu, buwg, ug, gruwgub, gbgr, bgbbuwwr, rbb, ubuw, gww, b, wggg, wuwgub, gbbbbu, wgr, gwwbw, wurrb, gurw, rbur, brbrbrb, rgbu, ggbrb, rgggr, wwbrr, rrw, wur, urwwbgu, wubuwu, wwbu, bg, bbru, bgrguuuu, uwbru, bruburb, ugwrb, rbrwbgg, ugwru, ubu, ggwb, buu, burrbw, wr, rrrw, uuru, uurbbbb, wubrgb, gb, wbwwrug, rbu, bwrrww, uuwggrbb, gw, brg, uwrr, rbwb, rub, gggwr, gbbg, gwgb, rubggu, gbgu, wgb, brwurg, rrru, burg, rrbb, ubugub, uuwg, uwgu, grr, guwwww, gwg, grggg, ggwggbgb, wru, uurwwu, gbbbr, bbbb, brgu, buwgrr, grwgwu, buwbw, rru, gubwg, gub, wwr, gubgwg, buub, wrbbuw, urr, wu, bbgb, bw, uubb, ggrwrguw, wbgrrb, rrbuurb, ubwug, ggwww, bgrr, rgrgb, ur, brwuwbg, bubb, grruwwub, wurr, buuwbw, r, bu, brb, bgrurwb, bggrwg, rwu, wrwwbb, wbbugr, gggb, brbb, bwbuw, rwgurb, bgbuurg, buwb, uugu, ubwbggb, rruw, bggg, ubbrbw, grrr, bbruug, wgg, rwubgrgb, uubrruwr, wgbrb, bwb, gubrb, gwuurg, ggbr, wwg, ruww, bb, ggg, rgr, bww, gwburgwr, urw, gbbgb, rwg, bgr, ub, gwwug, bug, rr, rg, wrb, rrg, gggw, wwbbg, uwb, wwrw, bgbwrbg, ggrr, wug, wwuwww, bgrubw, gru, bubbgw, gwuww, gbggbb, gwbu, bgbugrb, wwrbr, ubbgr, brub, ugbwubug, uww, rugrb, rgbuu, w, wrrbw, rbg, rururwb, grbrwbwu, brurwb, ubgwrrr, ruw, bbrrrwu, ruwgw, rbrwu, rrgurg, ururbww, bbb, ugbb, bwu, wugb, uwrurwg, bwg, bggw, gug, bbgubw, uug, uur, grwwu, rrug, brgbbru, ggu, brwbu, grw, rwr, ubwbu, wbbb, wubrwg, gbgg, ugg, bbggub, gwr, ggub, wwgur, bwrw, rwbuw, wb, rbbr, urbb, gbggg, grg, ggwu, uwurgg, wbugug, ugr, rrbwr, gwuur, uwbgr, brrb, ubg, uuugwu, gr, bgbb, wggr, ggr, bwguw, ugubwbu, wgw, grb, wub, wbuww"""

val puzzleInputDesigns = """
    wwwuwbugbggrwuwgwgbwwwgguggguguwbgguurbbbwgrubrgb
    wbbwbrbrwwugbruubgurgwbbwwgugbbbbrbbbrwwwgrrrbgubwubwru
    gwwgwbgbgbuugwurgggwrubrruuwgbwgwrgwrbwrugwwrrugrwgu
    gbubwbrgugwrurggguruugbrwugrgwggrubgruuwubruuwwguggu
    wwgrrgwguwugbgrbbguwguwubwuwwwuggguubuwgrwrrwwwuwbr
    bbuwgwgwwwgrrgrbrwrwrbwwwbgrbrgwwwgbrgrubgwuguggwrburu
    wuwbgbbrurwwwrbbubuwgwgwubbugrrurguurgguburbuugrw
    gggwguwbbuwubgurrgwugwbubwbwguuwwbrwgwrgrbrggugu
    gbbgggwgbbgwgguuurbbwggrrbugrggruwgrwgbgrbbruwwwrrwwgrww
    grbrwggrurrwwrbuggugurburrrbrrrwwugrugrrugwruwrrgbg
    urgbruwwurugbbbwgbruwgrubrrugrbwwruwuwrrubuggrwrgugbgbg
    wgrbugrbbgrugrrbubgbubuwbrbuuuwuubrgwrwwrgwwburbrgwrbw
    rururrurwwuurrrrgwgbugwubwwbubuuuwwbwbruuwugrbwuwbugw
    uwwwwuurbwbguwruwwgggbggubbwwggbrbgrwgubrubguwwu
    wgrwbgubgurbwrwwwrurwrbuggggurbrwwbrwubwrwgugurgururwu
    gwwrbwwgwurgrwwguggubwwuuggrwbbggbuguwgrubbwbrwub
    ubbrwwwbgbuuubggguwwbrggruwbrrwgrbggwuuuuggwu
    wwwbrggrrgubwgrrbwwrrurrrugrubgrrgggbrwbrbuuwgrrrruwr
    rgwbrbrugugwrbbrrbwrwrrgwggwurugurwwgugbrrbbbww
    grwgggbrwurrrgbrwrrrubuwbwuwguuwbuuguuguwwbggwbguwrbb
    wbgbgrbburgubbgbwubrwgrgruggwbrrguugurgrgugubgurrwgrugbwbb
    rurgrbrrwrrgrgbrrubrgbwbbgwrrrbbgbgwwubgrrrugru
    gwbrbguwgrgwwgurrgwggbbgrurguggbwwbbrugrww
    wubgrbwuwuugbrubbgbwurbuubbwwuuuwwgrruuuuwb
    buubbgggrrbrrrrwgrggbwgwgwubgggbgwbgrgbwgwwwrwrgrgbubgrbw
    buuggwugrggbbubrbrubbrgbgbrwrgwwbruguugrwwbrwrggwggbgbuub
    ugrbrbrururrruuwrwgwgrwgbrwbrgwwururgrgwurbbgbrubrubww
    buwwgubrugubbbwugggwbwbgubuuruubrwgbgrbwwrbwgu
    bbbuuuwrwrbgrugwgwggrwgbwgrgburbgbgggbbggur
    bggwwwubbrbrrubggrbgbwruwgggwrwuuguwwrwwrrrurgguuruu
    gguwwbbrwrwgbruggrwrbbuwruwuuugurrbgbrruwburwgbrwg
    gwurruwbbggwbrgbubwwwrwgrbrbwubugbbruuwwgr
    gwrrgrwbgbugbgrruwuuuugwbbuwgggwbgbuwgurgrwwuwg
    rrgwwgguubguurwbrbwrwggbbrbgrrbwgwwbbgwgu
    bwrwugrwwguwrwugrbuwrbgwbubggbgrbubgwwgu
    wrrrurruurbbuwugrwwrwggbgwubwwuurrbbuuuuuwwrwgu
    rbguuwwbgbbwgrurwwwwuwrbgurwgbwgrbbubugrbguru
    gwuwwruugwggwgbbuwrgbgbwwrbwrwwwubuwggwggwwgu
    ubrrbggrbwburbuubwrrurrggrwuwuwrubbggrubgwwburgbb
    rruwrurbwgurwbbgruruuubrrrrgbrrbgwurgwbrrgwwur
    bwwgrwwwbgbbrbbuugrwbrggugrrruggwwwwwgbrbrwwrru
    rrgwgwwwrgurwuwrwburwbrwurrgwrggbgrrrwbwwrurwburgwu
    bugbrbrrwbwbgbwugggrurubbwrwgwgbguugrwuwbguwruwrrruubwurbw
    rurrwggubbrbrubgrgrrgrrwrruuggwwuurwuurwrbrgguuwbgw
    uruwbgrwrurbwbgrubgubbruwguugwrbbgggbbbbwgu
    wwubugrgwwugrwwbwruuubrgggwguwwgrwubwgrugwubrwwurruuubbw
    uubgbrgubrwwbubbuguwwurrbgurbbgwbuwuwubuubwubwugw
    gugbwbwgggwbbbuurrgwurugwrrgubrrubbbguurgrbgbuwgrwrbbbugwgu
    rurbrwbruurrgrwbuwuguwurwubgrgbbgugubbuburgguwugugbug
    gbgwrwgrbuugrgruuwrrrrbguggubgbrbwwrugbbrwuggrwwguug
    rbrbrgugbwwgggurrrwrbwwwggguguubwuugrwwgubbbuwbbgbbrbuwu
    rwwgrubuugwrwbgbuwuwububwrrrrrbgubbrrwggrwggu
    bbugwuurgbubgwwrgbugwbgugrburrwrbgwurgrgwgu
    grwgbbwugwbrwwgrwwrwwwbbggrbuugwuuurwwurgbbuwrrw
    bgwrbrbrwrwugrrububwbuubwwrbrbgggrrubgwbggu
    gwwuuwbgugwugguwrrgrrwwwbrwbwbrrbuwwrbugbubwurb
    ubrggrrwbguuwrburwbgbrggwrbbrbwuubbbwgurggwwbgrrggrwgbrg
    uwrwwwbuugbwugrgbrggbgbwruwguurwbbwbbwbbrubrwbwgwuwg
    urggubbgrrbgwrrurwgurgrubuubwburgggrgbgwrbbrgbgwrrubr
    uugrrrbwbruwugbbruuubrwggurwwgrgrrrbuguwwwbwwubwburuugg
    buwgbbbrugrbgbuwrbbrgugbwuuwruwgurbggbbwgwgwwgbwuuwgr
    uuurgwgrguuuubwubbrbbubgggbrgugwururwuuurbwwwububgru
    rgugrbwuwguwgugbwgrwuubrwubbrwubwbwubugwbgubguruwuwuuuu
    buwgwgbbbrubuugbwurwuububwgbuwgrugbrrwrbuwrg
    uwurwrwuubbwrgwuwbruruwuwwgbgbuuurrwgwbwbgwgu
    gwrbubruwwbwbwwgwbuwwggwwwbbrrgbwuwrgubbbgrrrbgur
    urggwbrggguwrrguurggwrrurrugrgububgwwgwrwbuuuwwgwgrb
    uugubwwrwgrgwbwrurgurrubuwgrbgrguurwbrwggugggwbrwurwrwrbwg
    wbwwurwgrbbwgubwuubwugugbbgbugwugbgbwgwugrwbgr
    rurwrwrwbwgrwbrugwbbugbbwwguwgbwwrwggbwubbbwggwwgbuurr
    ubwgwgwwuuwggrbbrgbrbrgwwbgbrwugguwuwgwrrguuu
    wwwrrwburwggbwbgrruurbrugburwbrbgurrwgggbw
    bwubgwgubbwwgwwuwwugrrwgrbubbggwwburbuuurg
    rrurrgrbbbbrurbuuwwrbbrwuwwurrgwbgrwwgbuwrwgu
    wbbrwgugburrugbgugrrbwugwbbrwgrbguwrgrgwwrggr
    rbwubrburgwrrrbgguurbrugbgrbruguwrwubwwbwwgu
    wgubbwuburwuwrurgrguurwwrwrwwgrbwrrrrbbugr
    wggubbubwbrrrwwuubgwwuwrgrgwuwbwbbwuguguuwurbbwugwb
    rubuwuwwugrbwgrggrwguwgbwgbrrwwrgurrwrwguuuwuggwrbgrubgwrg
    urwruguwgbrggrbbbwgbrgwggwbguburggrwbgrbwwrbgrbwggguwgu
    rwbgbubrugubwwrwwgwwurwwgrurrbwbbwgbbugrurw
    ggrwbuuwbrurbgrrwbububruwurrruwwwbugbrgwbrwgbgbbgrgub
    gurububrrbwbwruwrbbguwuuurugwwrgrbrgguwbwrbggugwwuwwbwru
    rrbrwrubwgwuurugguwubrgrrwbgwugburrurgwrgbuurubug
    bbrwgwggrbwgrrwrrwggububwurrrggrubggrgurbbuwrwrgrgubwgrgu
    ubwbuwgrwrrguwbwuubbubgwwuuwgguuggbuwrrubrrrw
    bubuwugurwrwuurbbgrggrurwwbrugrbwrgrbwgggruwgrbb
    gbwgrbrwggbwgwrgrwwubrugubwugwbrrwbrurrbbbwuuubgur
    bwrbgbrguuwruuwurwwbuwwggrbbrgrwuwuruwrurgguubwggr
    rwbubgubwuguwbbrugggrrubbuwgrguurwgrggbrggrrgrbbbbrwgubbu
    rwwwgrgubbrruugwurwbgbubbbgurbwwwrurruwwrrrw
    rugrbwbbruuggubwwbwbrurrwgbwwggbbrgubgubrwbrurwbwg
    gbuwrbrwbwgggrbbgbwrubwbggrugubbubbgggubrbb
    bbwrwbwbrurrrrrgbgwwgwbgrrruwgbbuwuugubgugguurrb
    bggbuurbgwwgubrwgbgrgrrwbgbgurwrguwrwwbbwgwr
    grbrgwububguggbbuwbgbrubuwwrwwwgwbbrurbrrgwgu
    bwgwwgrurbbggrgwuwwwgrbbrgburgrguuuwgwuwwubbggwwuggguurwr
    ubwrwgbuuwrwuurgrbbubuggrbrggwwuwurrbwrwwgrbwgu
    gguwubrwwwrgrwrguwrrggubwuwwuubwbgguubbbwuurwub
    grrugubwgrbbuuubuububgbwugurbwrrubgbubrbrrbbguurgbu
    gwgrrrruwgwwwwwrrgurggubwuububggrrgggbugwg
    rbrbguwuggwwgrgrgrwuubrbbbbugbwguuggbrggguururuu
    wburrubgrrrrrwwrrwgurugwwurwwrrwugggwgrggwwubbuwugu
    rrwgwwgubbrgruubuggwwuburuwuwubbbrugbrubggrr
    bgbbbrrwrrgbuwbgrwubrgwwwbrugrrrwbwwrbrgrrrurubuggr
    brwugwrbubuuuggggrwwwwrbwgwrggbburuwbugrwrgbrubrggrwb
    wburuwwbgubggbbbrbugwbubrwwrwwwbbgguwwuurgrwuwwgu
    rbubugrgwwugwgrurggwugbrurgwuwwubugwwwgbguuwrwgu
    rbgbwgwbuubbbwbbuwuuwuwuwuwrbrgwuuggwrruwrbgbrgguwuurbbwr
    buuwurwggwrgwwbwbugubgbrwubrrubbwbuwgrwbwbg
    brwuwwrwrgbrgruuuubwwbwbwrgrrwrugwwguwwrwgwwgrgwrrrgrwwgu
    rbgrwbggbwwruugrbgbububgbwbbuwbugugwrrwbgwbwguwgrrwr
    uuurwurrbuwrububbrgruwrbwbwbwrrbrrbrguggburwgu
    wuwwuuburrgrbbbwuguwuwgwbbbgwrurubwrruggwbwbrugbrgubgwgwgu
    brbbwuguwgggrgwwrrububrbbwuburbgbbugwwwrbuwbuggu
    wugwuwwrruwbgwrbwruwrrgrbggbgrbwgggurggbrubruwugwuubur
    rwrwwurbguwbbbwburuuruwrgbbguwbgwgggwggbwwgrbg
    uggrggwugubuuwbwwwrbgrbrbrgbbrruggbuuuwrbrwwbuggwgrw
    rubwwrbwggbubuwwrrgwurruwggbbubggbgrgwwrwrwgbgggbwbbu
    bgwrguwwwrrwrgurrrrbbwggguwugbbbubbguwrrurbbrrrrb
    bwuuwgrbbugbwgwuwgbgguwuububgbrbubrwgrubgbbwb
    ubbruwrwguurwwwgwgugwgguubrurruwrubbgrurwwugbbrrgbwwrbw
    wgwwgrggrbwgruwuwgwgbubwgguwbbggrgbgrgruwgwu
    gbrruwwwwbgurubrwgwggbrrwrrwrbbrwwgburwwrrb
    ubugrrruwgwuwubgbuurgguwwwgubrbbrruurrrbuwwg
    wwwgrbrgbguwbwurwurgrwuurwrrggrggrbwuugrwrurbruuwwwggrrgg
    wgrrgggbbuubrubrrgwrurwrwbggbuwwbgbrwbwgbbruwbugur
    uwugwrrrwruubruwguuugwugwugurrbgurguuwwgbwrwguwggwbgwrw
    grgbugubwwgwggbrwwwwuggwwbrgbrururggurwubr
    ggrggburuuuwruburbwrgggurguggbbbbwguubgugwrwggrggwugwbrw
    rrrrruwgwwrruwgrgwuuuwuwrwbrbbrgrgggwgrurrruurugbrbgub
    uguguggwgwrbbbgrwuuwuubgbgrbwuggbbgguwwrwwguruwbbug
    gbwgbwbrugugwgbwrubururrrggrgburugwrwwwguuggug
    gbrrrgrgrgwrwbgrwrbrwwwgrgwgwuwbwrbrguruburbwru
    bwuuururrwgwbwwwruwrurbbgbwgubwwurubgwbubbbwbb
    wgrbgubuwbrwugrggbwbruuubgburbbwbrggwrggbbgbuwwurugbbgwbbu
    bgrbgwwbbuwrgrubugbbbrbugrwuwuuugwugbrruwuurbbgg
    rgrwgbgrguuwbbuwwbrguwrwgrbwgbrbbbwruwgrguwrgwrwrwuuruur
    bbwruuwuuwrrbbubgburbwrwwrgwuugbwgbrurrbuguuugwbrubgbwbb
    gburbbrggburubugwgbgbgbrwgbrgbggwbugugbrwbwbwrwwgu
    wrwgwrrrrrubgwuburgbubrrgwwuuwrrrwbbwrwbrwwgurbwuurguubb
    rubwwbugwrwgrwrggwrbrwbbubwgwbbwgbgbrbrrrbubbgguuwggw
    ugugbbbbwbuubgwgwgwurwwrwubgrgbubwrrbugrbgrubwgu
    ggwggbuwbgrgbgrrrbrggrwruggbwbwrrwrurwrrgg
    rrwurgrbrwrrrburwuwuwrrwggwbrwggrwbgggrurggwwrrbguru
    wuwurbrbwwbrggbubwuggbbrrbwwbgwbgbbrrbgurwu
    bbgwwbgrgurgwwbgggrrgwgwwrbugwgbrguwgrgrurgwurguwbur
    wrbuwgubugwgubrggubrgggbbubbggrwggbrgrurgubburwgu
    grgwubgrgwbrgurrbgbbbgbrbubwbuwgwubwwwrgrrgrur
    bwruwgubgwwgwuubgugugrugbubrgbrguuggbrbbbwwrggwrbbwwb
    bgrgbwrurbwwgbwwwgbgwrrrbgwrgbwburubwugwrwgu
    ugbrruwgwggrbrrrbuwgwurguggrgurrugggbwburgwrrgr
    bwwrgurrbubbguwgrwgwuwrbbwugrrwgbwubgbgrbguwwrburr
    wgrbbbubggbuggrgubrbbwbugwgwrwrgrguuwbbrwbrrgrurubwwuw
    rwrwrggugruwgrruwbrruurbgguruwwubguggbbbwugrgugbwrgbuuwr
    rurwruuwubwrrrbuurwgrubbuwgugwwwggwwrbbbrwruruggbwgrggwugwgu
    wuuwrrggrgwwwwgrgrguuuwubgwwwwgrguggwwrubuggggguububuggbu
    gbrwgggrburrrbuubbwgwbwuwgrbwbggwgugbwwubuuubrwwgrgbbgwgu
    wwgurguggguruuwwuuugurggrugruwrbugwwubwbbrggruwrwuurrgrb
    rrbwrwgwbugubgurrrwugbgrbbwgbgrgbbwbgbbruugugubw
    rwgugbbbrbrrgubwrrruwubuwbugubwugrubwbgubrbbbwurbrgrw
    gbwrggwwbuurgburuurrgwbgwwrubgubwbrwrbguuurbggggrguwbb
    rwbbwgwwubugwwbwrubbbrgbrwrbuugrrrubgruwbugrbrrbgwgu
    brgwwwuwbubrrbwgrggbrugubuguubbuubbwugbbbrburugwgrw
    ugbwurrrburrbrurgrbbgbrrggbbruwwrgbgugburrbuuubbbwgbbrug
    ggrguuggurgrrrbrurguggugbwbwwuwrbrbgbwrbubuggg
    bggruuruurrwgrwwrrggurguugrwgurgburrwwwrgugg
    wwrruugrgbbgrbugbwrbbrrgubwbbuwwgrrgggrggugruubrbubgrg
    ggbuuubwgrrubgwgbrrruwrbrrgrwubgguuwbrbggbrwgu
    gggbuuruubrrbrwwbwgbuuuwggwrubguggbwbgruuugwgruubbbbgubu
    guugwwurwruburruwuugrgruwgwugguggubgurruwggrrgwgbuwrrrub
    uurwrbrugrbwugbgggugrrwguuuguguurggrrbbwgu
    uburbrgwbgubggwbrrrwruwbgbbuwwrwggbwgrubwrbwgwuuwwgu
    ugugrgwgrwrbuwbbbrrwguwwrbwgrwrugugwuubrwwrbwrrugwwbub
    rbgbwrwurrruwbuuwrugbbwuwububrrrgbrgwbwrgwruwbuwrg
    wbrruwrbubrwbwgrugbrbggwgbwubwruwrgurubrbrrrwrrgbrrr
    urwguwrwbrbbggubgbbbuwwrgrbrwgrbguruwgbuwbgbugwbwurrrgw
    ggwrgrgbuurbbuwwgurrrwbrwubugwrurbgwuwububburgbggbwwbwwbbwgu
    urrbrwuuwurgrgbrgbruwrrwrbbruwwbbbrwwugwbrbwbwbrgugrbbwg
    wrwwwuugwbwubugbugrwgubgrrgwguwgwguuuwbbbrrbu
    gbgwwgugrwrwrbbbbgbgbburugurggugugwgbrbwwggrrgwrbwbggbgwb
    wgburbuuwrbgruugwwwuuuugugbgrgwrbbwuwuggwuuguwubwrwrg
    guwubrbbbuwrurbgwrwgwwwbgwwgwwruwuuguuwwbbgrrb
    brwrwgurbuubuwrgbrbuurwbwwbgrbruwrrrrgwuwggbrwurr
    uwwuuwrbggrrbbrgwrbbbgggbrrwgbgbgwbwbgubwbrggbbrw
    rgbguugwwggrbrgwbbburbubwgruubwwubwbrwgrwwuuwrbu
    gbgbubgugguruwbwrwbrrbwgbbugggbbwrruwbgurrguwwubwgrbwwggur
    rrubgwwrugrrbwbuurbrwgbbrrbbbrrggurwuuuwrggb
    rwrwwugbgugrgrggurbugwugbwgburrrgrgbbwwgwuuruggbgwwrbuurbwgu
    ubwrgwubuwwbuuggbwwuurubburbuwrrbwgwwgrggrwwrr
    uwgbrgburuwrwrgbgrrbuwgrbuguuwggrbbrugwgrbgggbubgbggwbwgu
    uuwbbbwuruwguwrbrgguwuurbwgrgrwrbwurwuburgrrgb
    wurruuubrruwrubwbwwuurubwwgrwurgwrurwrbwgu
    rgggubgrwgwgubwwwuwuwurrruruwbwgrrugguwgwrguwwr
    uubbruwuwubbbbrbgwwggwburgwrbubgugwgwbwbbuuuruuwgurb
    rwgbuwugrwwurbuggwugruurugbguubwugbrrwbbwgbgrwrbggwbbgrbwgu
    wrubwruuwgrguuubgbbugrrbgwrrrruuggwrwgwgrrww
    bguggrrwwburrrwuburbgurggbbwgrwwruugbwbuwwrbwrbbbgbwgb
    urwgbwbuggrwgbgguwgubugrgwbbwwgwwgrrrguwrr
    ugwrrrwrwugrugbbgruwguurbggurbrbubguuubbwrbb
    ubuggwrbgwggggrwwwrugbrwbrbrwrwwrrrwgburbbugbggrwwbrgrru
    grbgugurggurwuggugwwrwubbgrurburbwbwuugrwrwggrruugbuwwgu
    rbgurwrguwbgwbgbbrggwwrugbwugrbwugggbubburbr
    ububbuggggwwgwubrwuugbgggrwgbguwurgburgwwrguwuwugb
    rgrwrruuruuggrwrrrgbwbububbruuwbrgrgggwugbwrbrur
    rbuwuwwrggwgwggbgbuurwbgwgbbrggguwrurwwgggwwwugbuwgwwugug
    rbbbuuwbugbruugggwugrgruwbbuwubwgrbgrwrbgwwwbgrwwu
    uwwwgruurbbrwbggrrbrugrwrubgwuburuubgurubub
    bbgugbgruuubwrbrrwrwgbrwuwurgurggwrbgwwbgruubruw
    bgwrgwwrwbubrrbrbrbwbbbruwuwwbuwwuruggbgbrbrgr
    ugrgwbbrgubbbbrubrggubbwuugggugbuwbgbwguuugggrwbwbubwbuw
    wrgwuwubwrgrgurrwrwbrgurbbbbwbgbubuubuugubgrbbwbggugrrwgu
    uwbgrubgbggbbbgbbbwgguubguuwgrrrgwgguuubru
    gwwrbuurrugwwbbgugburrggrgbggrwuwgrgububrrbgwbrugwuggrug
    bbgrwbrguubggwgbrugwwubwburbbbrgrbgrruguwrrbwurur
    bgwbbgrrubwbgwgbwbbggwbwuuwrurwuburgububugbuwrwbgr
    uwuuurbrbbrurggwgbguuuwuwbbbuwrrgurwgbwruwwrg
    wgwuwugubbubgrgubwubwwurwurbrurrrwwgwrgrbwwruuubbug
    gwbwbwrrbrgrgbggubbggugrbrwbwgugbubggrbrgrwwu
    wrbuurrbbuwgrbugwrrrgguwwbguwgugrrgbrgwwuuwrbwgu
    gwbbwurwrgbbgwwguggbggruwgurubgrrwbrwwwwrwbwbrwuwrwguu
    wugburugrgugurrrbgwwwgubuuggubbgbgrgbwbuurbrugggwur
    bbwwwrrwrgrwwgggbggrrubbgggrwbrrrwwwwrbrwwr
    burbgggrbwrbgbrwrwbubgwrgbwgwwbrrugrruwrgbbggrwgwgu
    rbuwgggrggbrwbrgwwwgwgbbggwggbgbubrbugburwwrgwgu
    wgbrbbuugguuwuwgurrggwburrugwwugugwuuuurrbwwrrrbrwg
    grbbgbbuwwruwggwbbgubwuuuruugbbrwgbrrbbbwrurubwgbrbbburu
    wrwgrurgbwwgrwwrwurugbrbgubgwbwbggurrurubuwuguubwbrwgu
    brrurgwrbwuwbbrbgggbwwwbuuwbwrrbrwbguwuwbrugbrrggwgu
    uwuuubuguuuurbuuugwbwurrrubuwguubrruwrrgugwrrwgwbrgbub
    wbrwrrrrbggbubrrgwwrguguurrrwbwuugwwggrwgwgu
    rgrrwugwgrgugubugrrrwburgrurguwbgrwrwgbbwwgu
    wgrwbrugbwwbbubwwrgwugubrurguuwggruuuggbbgggbur
    rwbwbwgruuubwbgwurrruguugurgguuuururgrurgg
    gurruuwbbrrgbuuwbwwgwwwggrurwbgbwurrwwuwbugbggbrg
    bbugwbuwbuwbbbwgruwggbwgggurrurwuuwgguuwbgwwuguwurruggww
    brbwrbwubbuwgbwwgbbruurgwrwguguwubuwrbrguwguuguugbbwwub
    rugwwuwrrbwbrrgbuuurwwgwruuubrbwbggwurwuubbuuuuguu
    uggwurwbwggwwubgwbwuuburgwrubwgwubwrbwgu
    bgggbwrgbugrbrbgbwbwbbwguubruugwbguuurgubuwbbrubwwgu
    ubgggrbbubruurbgurubrgguwruurrbrgbgbbwgwgbgrwgg
    rrbbgwbgggugbuwgrwwwuugruwwgwbwrwgwuwbbgbubuwbbwrb
    uwggbrrgbrwbbbwrrwbwuugrwrrwrbwgurggburbwgu
    grbbwrggrbgbwwrwugbwubuguugbburuguubbwuuwbg
    brugwrwuggrwwrwbwrbbbguurbgwgwguwwuurrrugwrrgurwgu
    wurruruwrguuwbrubbuwgwurrggrrwwuuuggwgbrrugb
    rrbrrurguggrwruggrrwrwwrbbwwwuruwbbgrrgwgu
    guugggbgwwurwwgbwbgwgggbbgrguggbuuwbwurrgbwbgrgrr
    gurwurbgrrgrbguwwbwbuwrwrrurbwgrubbwgwwwrurwbrrwrr
    rgrwrrggbrgwwwuwbrruggubgrguuuuburgugrurbrgwrbwurbuguww
    buugwrwrrgurgrgbuwurwwbwrwrbrrrgwwbruwgwwgggrgrrruurubuu
    ubgbugrrwwbwrurwuwugwurggbwbbuwrggbwrbrurrbb
    bwwbwuwbwubgrbwuwwuwrbbwbubwruwwbrgwuuurwugbruwuggwbub
    rggwbgubwbbbbgwggrgbubbbbuwugrrgugwbrbruwrg
    gruuwbgrgrgwggwwwwrrwgbwgrguwrwbguurwrbggwgu
    rwgrbbwgbrgbggrubrbwwugrwgubbubbuugbbrggrrwrurburbr
    buggugrwwrwwuuubguruwbubgrwwwbubggrgbbrrwr
    burbrrubrrwgurguwuuurbrrrrugrbrbwbbwbguuwubgwru
    ggrubgugurgbbbbubgbugruurbwrgbuubrbbrbwguugw
    rggwubbbbubuubbgwwwgbrwrwggbgrgwgwgrbrwbwuuwguwwwbbrrrb
    rrwgguwbgwrrubuuggbbrwgwurubwubbuugwbgbrbbbwwurruwgbubu
    rrruuuuwuubwubwrrbguwgbrurwrrgwrrbuwuwwbgwgwwgu
    gwuuwrubururgbgruuwwuwwwrrrwubuwwbbuwrgugwrbwgwgrugrrrrw
    rwugbruurbbwgugbrugwwbgbwuwwwwbrrbuggurwbwbggbwubbur
    bgggbrurwrwgurruugrgwgwbwbwuwurwuwgrbuwbubwbbb
    gbbbuwrbgguwgrguububrbubggrbgbrwggbrwuwwgugugbb
    wbwbguggrrbuwrggrwugguubbbbrbbuguuurugbrrrrbbggrruubgbbrub
    bggbwwurguwguwbugbururrrrbwrwburrrgubbbwwrrubuwg
    rbuwrbwubrrrrwwggrwwuburuwrrbgruwwguwuuguggrwrbgbrbugu
    bwbrurgugwbbgrwrrbwrrrrwbgwbbwguwubwuuwgrrwr
    rwuwwbgwbwbrugbbbgrwbrgbuwuguwrwgrgbgbggbggbbwwuwbbgwgwb
    bwrurugbrurgbrguuwbubururuugwuuuwugbuuwwruwuurg
    wgbrurwguwrbrbbrbrbggbgbbuugwgwuwrrrrgubggrruuwuuugu
    gggrgbuwbbgbgurgwbbgrbwwwwgbbwrgugbgwwwgu
    bbrwguwuubguuubbwwrugubgwrbuggbrgbguwurruruwruwwgr
    bbbgrgbbrbbgruwrwwrgugwuwbubrwuwrwurbwbgubwwur
    gwrbruwbbbbrbwgubwwrruuuuggwrrgwrbbrgrubgubwrbggbwgu
    wwwwubgrrurggwrgwbrburwbwwbbbgrggbubugbrbbbuwbwbwbbg
    wbwburwgwrwwwgrbuuwwrgrbuuuwwurwruuwgrwbwgruwrruruw
    gwuurrwgrbwwggwgggwwuwgurbuuugrwgrbrwbwurwwbgwgu
    ubgwuggwgrbwubgurggrbrbrgrwurrrbrgwrggbrwugurbwubrwg
    brbgbbgguwgbugbrrurwwugurwbbwgwgbwruwwgwbuwwgugbwgrubrbg
    uwgbwgwugbrwuwggbrrgbgbrbuwrwubwwgubruwgrbggbuwwbgggrwg
    uuwuuuubwburgbwrwguwbwgubuwuwbbugruwwugwuubgrruw
    bbgwgwbbruwbbwggrgwgwbwubrugrrgwbgbwguwwbrgrbgwgu
    wbbgbwggwruguggbbgruuuuwuuugbbbwwgbwrruwrbgrgwggubrwgb
    urrrrwbgwubgubbgrrbwbruugwurwuwggwgrrgrrgugrwwrggbuurgb
    rwbrggrwgwugrrbuwbrrurggwgrugbrurrrbbwwrgbwgubrguwrugrgu
    urwrrgrwugbuggbbgwurgbugbrbbgrguuuuugurrurbwrbrwgwgu
    wbwrwbwubgbbgugrrrwurgurgrwrugugbbrbrbbgrwgwbwgrrbbgbguwg
    rwbwuwrurubwuwwgbrwugrwuurrbbubgguwbugwwrgbrrb
    buguurggwrubgwurrbugugbgubrgwbggwgrgwggruur
    grruwwububurbgubgbwubrurbrbwguuwgwgbbrbguwbguu
    brgugwwbgggrgwbbbrugugbwgrbwuwgbbruuwuwgburwbugwwguruuuwb
    wburbwruwugurugrrwrbwgbwubuubrbuugrgrwgrgrbrbru
    rgwrgwwuruwguuwwbgubwgwruwuguuwggubgubugurru
    rwwrrbwbuuuuwwgwuwguubbruuurgbrbrrgwgwgrbuwrwwbbubr
    wrbrrgrbgggubrwwrrubbrrrbbrburrgugbwurwrggwruwubgwwug
    ubwwwrgwbwburwrgwrwwwuuugwruwwwbwwuwguwgrrurb
    gugwbwrgugggbbuggwwwrwuurrrwruwwrbguwrrwwrrrgwgurgrubbuw
    wwubrurwwrrbwwwurrwruwwwrwruwwgrrrrbuwbgbggwwgu
    gurgguwggggruububggwwbgbgggwuggbrwbrbuguwgwgwurrrugw
    rrrguruggugwbwrwgbuwwurugggwwgwguwggwrrwrgwwuguwbrgrwb
    bbwguuuwbugbrbuwrururbuwubwguuwrrgwwruugguurbbrwgruuurbwwb
    bwrrwbubguuwggwwuwrbwwgugrbrgwrbguuuggubwurggwwg
    rggwrbgrrugrbgrbwbrwbruuwbrugurrwgbwggbwrr
    bwggbrbrguwurwwubuwuggwgwggrbbggurgbbbwwbgwbwg
    bruwbwwuuuwrwrbwwgwbubwwuwbgrgggugbbrbbruubwrggguubwwr
    uwugbgrbgburbrrubburbggbbguruwururbbwguwbururbugbugwg
    gbwurgrrbbrrrbggwgbugwurbgbrbbwugrwbgwgbubw
    uggrrbubburgbrgbuwbrrgggrwgbuubgrwgrruuwrggrrwuuggww
    uwgrgurgbggwguuurbuuuruuwruwrwrubburruguubbwwrwgubugbbwg
    brwgurruuguguururruurwuwwbgrbbbwgrgrrggbwbbwgu
    wguugwurrgugwbwgwbrbgrbgubwwgbwurburubuugbubbbgwrbwgu
    wbggrwwbbbgubrguwugrgbwbgbrwugwgbgwwwwuuwugubrbrbrrb
    rgrgrwwbgggggwurugrrubbbuggrgbgrwrwwruguwrrurgggwguwwgbwbw
    gurgrurrwbuwuwbrugrbwwrgbwruurugwwuwrrgggurrrwwwuurwggug
    rwgwubgbuwuggurrugburwwgbwbwrbugrbrgbrgwgrugbgrubwgrwruu
    uubrwbwgwrrruurrwbuwbgrbuuuwwwubrrubrwgwbwbuwbgbrwrw
    rgwggggwruubuwurgrgbwgubgbwururugwwbbgbruuuwgrruubwbwbwr
    gguwbggwwbwwubrgurwgbwurggwwuuubgrbbbrwrbububrbwrbr
    ugubguwwuwuburbruubrbubwbrburrrubrruwbuwbuuwwbwggwubwwwrwgu
    ururbbgbwwbwrrggwwubrurbwugwbgugugbuwbrgbbggrb
    rbburwgrbugwuuuwrrggbbbwbrgbwwuuruurrwgbrrwrbburwbugwgu
    gwggbrwbwguwbwuuuuguwgbbggbubwbbgugbwuuuwwbwrbwbbuwu
    brbrwguwbruwwgugrurwugrgrgrwrguwugbrggurgrbuw
    wubbbwuwuwwubbwbuwbubugggrbbgguubuuwwbrruuuwbbwgu
    gwuubwuurwruugbgruuwrgwgrubgbbbrwuuwruubgbbbgrww
    wwbbwbrbguburwbuugwrwbubgwgrgugrwwbbgwuwuwrgrgwwbggbubuwbu
    gubbwugwgubbrbruuwubggwrbrbwwrguuwwuwugwuuurrrwgrbwrubwgr
    grubbburrwbgrbgbwgbruwuwwwgwrwbwrggubbbwgrggbwuurwwgu
    bugbbgurwwbggwrwgbgbbgbugrgugrbwrgurggwbrwgu
    gwruugubwugrrbbwbgwburgwrbbgrugrrbbuugrwwugbuburggbwgu
    wugruwwbwbburrgrgwubruwwbbwrgubwbrrwwgbrbgbbwgurwbrg
    guggrbwubbbbgguuwrrrurbbuwgrwugbubbrurguugrgbubwubwgub
    guwurburbgwbbrgbwuggwbuguwwggrururwbwwguwgwwwwwwrggbr
    bwbbwrrwwubwgbwgggwbgrrbwgbbggrrwwubbwwggugurw
    rgrbwuwruwbuwrwgrwwrbbgugbbbburbuguuuuuuwugurwbwgu
    uwbguwrbuggwwuwbwgbgugugurguwbrubgrwrrrggguwbgwrgggbgugb
    brwuuggbgrwuggbwbggggguwwguuwwrbgrrwggbrwbgbburguuwrrwuru
    bgrrgugrbrrwgggbbugurugubgbrrbggbrurubuwguggbwwwwggrrugugu
    wgwbubruuwrrrruwwggugburbrurbbggubbwuurrwwuwwruub
    gggbwrwrbbubuuwgurwgwbrugwbwbwuurrbwuggbbgbbbbb
    bubugbwubugugwrwbuurwwwgwwuugbuuwurrgbugggwuwrrubwgu
    uuubbwwwbuggbbwbbugubuggggruwrguuwrruwrwwggb
    rubbrwwrbwbgggburrwwwrggggubrwbgguwwrrwrrrwruwggb
    gwrrwuwugrubgwwugrwrrbwwubwwrruuwwgbguugwrwugwgbb
    ggwbguburwgbbgggbgbgrbwwbgubgugubbrguuwggrwwrgrurubgwrwug
    bgwbruwuwuwurwbuwrrwbrwwwwbguggbugbbrbbuurugrugr
    wgbbrrgrruugggggggbrrrwwgwuurrbwwbuuugrwrggbrwugrgbwb
    rrrugbrurrwbwrgggwuugrurruwgrrwgugrbbbbrwgg
    gbbrbwbwrgggubbrrurbggbwrrbuwwuugbwrwurwbwrbgggwruruguurrr
    urgwurbrbubbgubrrrbwgbgbgggrruuggwguggubbwrrw
    rwgrubbwbugrwrugugurrrbrubwbwurggrubggugrbu
    brggrgrbguuguuwwwrrrrwwgwbwbwrguugubbuuuwurrr
    buwbwuuuguurrwbbgbgbrgbwwburwrggwurwwrbbgbbbburgbuwgrgbwb
    rrwuuruwubrgbubwrggwrguuuugwwrburgwwwwguuuurbggwbgwbw
    grgggbruuwgurrbubbwrbwbugbwrbgbbguubuubwggrrgwu
    rrwuurgubbuwwuuuwwrwgwrrwbbggugbugrruwbuurbbrrbgrgbruuruwb
    brgwgwwguggwwuruguurwgbgrwbbuwbbwbrwwuwbgubruubbugwrguur
    bbugugwrrgruwguwwrgwrggwwwwubrguwwbwguuwrbwrb
    wguwwwbgbggrrrrwwwgugugrrbwrwurruurbgwuwuwwrgur
    ubrbruwwbrwrurbrwgubrbggwuurbgburgurguwwrwbrgugrr
    brwrwwgggubbbbbrwwwwbruwrrbbgwwbugbgwrbrgruugrrguruuuu
    bbbguwbubrbwwwwgwbgguurgwrggrgguubgwwwrwrbwggrw
    rgguwuruwgrwuubwwggrrrgbgbuwwrbrwwrrrgrgwwuwurbburbw
    wuwuwwgwwgbwrwbbruwuurrugubwrgrwgbuwrwgubgbwbbw
    bwrugbwwwggrwrguwurrbwgugrgurbrubuggugburg
    rrruugguwuuwruuuwwubrrgwbgwububbbbbbwuruggu
    ugrbwugbwwuuuwwurubwrbrrrgburuwrurrwuburwr
    wrgrwwbwbwuwbggrwwbwwbrrrbrbbrwwgwwgggbrguubguwwrg
    bbrubbrwruwggurrubrbwbgbwbbbrruwurgggrwwbbwuwuguburbb
    ubgbuuburwrwbgbwrwwguwbbrrbwrrwrbggrruubrgbugrwrrrrrb
    brbwuwuugwubrwrguwgbuuwgguwgubrbuwgugbbbgbwrrbgr
    uuwwrruwwbuwbbbuwwwburugububwgggbbggbrgwuuugrrgr
    bbbugguwubbbuubwwwurbwwgrggwgggwruuurbrrwubbbuwwu
    gubrubwwwbwwggggurbbguuwwwgwbwwrgrwuwubwrwbggwbbug
    rwgubgbrgbbrbruggrwrguwuuruwwgugwuuuugubrruwgbgwgu
    bruuubrgugbgrgbwwuuwwgwrgrgguuwgbbgwwbuubgbbrbguburgrww
    rwgbgubbwwrwwbbrwuguugrrgbburrubrbgwrrgrrrwgwubbwg
    wrggbwrbuurwrgwwgrwugwubbbubrrgrgbubrbruwwgrrrrbbrgwrbw
    bbuuurugrwrgubrrubgwgwuwbgwuguwgwwrgwbwgbwbg
    wbbugbuuububuuruubwuwbuubugrgwugruurgubgruwburug
    bgurrbgrruwwubrgrrwbwuubbwwgburwwrguwgrrwgu
    gbbugwrbuwrbrrwurbwwgubuwwwbrwbbrwguggrbwrwgbgwwgbugr
    bgrgwbwuugrrwgbbgruwgbwurgbbgurrgwbgurgbbruwuubrrrbuurbbrwgu
    rwbwbrrbbruwbwwgggrrruubgwwrrbwrugwwrurrgurggwuwbuugbugb
    uuuwuwbrgbuwgggwrrbwbubgbrruurbwububbubbrwrwuu
    wbburrrwurbuubbwbugrguwurrgurrbuuwrwuwuburwugugwwwgg
    rwgbrbwurggwrgguwrbrrrgbrgbgwuwrwbwwwbbwgbrbguwrurubwgwwur
    wggggrbwrrwwwurbbuggubrrgbuburrbwwgrbrgwbgbw
    ggbgbbrbbgubuwuuwggrubrwbwrbrwbbrggwgwbbwgbrrbwgu
    ubrwgurrruuugubrbwbrwuruwruwrrwrgrwgwguuwub
    uwrwwbububwgggwgwgggrrguwwuuurbgbwwbbwgbrwwuw
    bwrwwurrwbbrbwbubuuwwgrbbwuurbuwrwgbuurwbgwwuruubwgb
    wwggguwbbwwbbwrggwbgwbwugguugggbburbbrruwbbuguggw
    bgwwuuguururgurgbrggruwrwbbbrrububuwurrwuwbgwgugubub
    uwrbgbwubwrbrgwwuwgrbubggwrbbgwruwgrwubgrbbwgw
    wgubruwgbgwrguggwwuwguwrurwgubbugwurwbbgrrwgrwbwgu
    rbwuurguwwrgurrwwbrbwururwuwrwwggugwbwrrbggrwuurrgbrubbwgu
""".trimIndent().split("\n")