package day24

val puzzleVariablesInput = """
    x00: 1
    x01: 1
    x02: 1
    x03: 1
    x04: 0
    x05: 1
    x06: 0
    x07: 1
    x08: 0
    x09: 1
    x10: 1
    x11: 1
    x12: 1
    x13: 1
    x14: 1
    x15: 0
    x16: 1
    x17: 1
    x18: 1
    x19: 0
    x20: 0
    x21: 0
    x22: 1
    x23: 0
    x24: 1
    x25: 1
    x26: 0
    x27: 1
    x28: 1
    x29: 1
    x30: 0
    x31: 1
    x32: 1
    x33: 1
    x34: 1
    x35: 1
    x36: 1
    x37: 0
    x38: 0
    x39: 1
    x40: 1
    x41: 0
    x42: 1
    x43: 1
    x44: 1
    y00: 1
    y01: 1
    y02: 1
    y03: 1
    y04: 1
    y05: 0
    y06: 0
    y07: 0
    y08: 0
    y09: 0
    y10: 1
    y11: 0
    y12: 0
    y13: 1
    y14: 1
    y15: 0
    y16: 1
    y17: 0
    y18: 0
    y19: 0
    y20: 1
    y21: 0
    y22: 1
    y23: 0
    y24: 0
    y25: 0
    y26: 1
    y27: 1
    y28: 1
    y29: 1
    y30: 1
    y31: 1
    y32: 1
    y33: 0
    y34: 1
    y35: 0
    y36: 1
    y37: 1
    y38: 1
    y39: 0
    y40: 0
    y41: 1
    y42: 1
    y43: 1
    y44: 1
""".trimIndent().split("\n")
val puzzleGatesInput = """
    hrk OR rnb -> pwm
    x05 XOR y05 -> jbk
    hbc XOR hnr -> z31
    fcd AND mgc -> qck
    x23 AND y23 -> fhn
    dkb AND rvf -> rmv
    hhc AND knm -> stm
    vcd XOR vbv -> z43
    prd XOR ggg -> z22
    hbd OR cst -> cgh
    x21 AND y21 -> ncf
    y40 AND x40 -> nmp
    scf XOR ksv -> z29
    pmd XOR tqd -> z07
    tnp AND rft -> fpf
    y11 XOR x11 -> gkb
    y07 AND x07 -> dgf
    y15 AND x15 -> qdr
    nbj OR tqv -> pwv
    mtq AND tkj -> fgp
    tqd AND pmd -> bdf
    y30 XOR x30 -> fmg
    x34 AND y34 -> ccs
    bmh OR stm -> rfd
    rvf XOR dkb -> z27
    y44 XOR x44 -> wcj
    x24 XOR y24 -> rkg
    fmr XOR vtd -> z17
    chr OR nps -> svt
    x35 XOR y35 -> qrh
    rfd AND smf -> jgr
    qwr XOR pbf -> z26
    cdn OR qdr -> bnc
    x37 XOR y37 -> gvf
    pwm AND djk -> hwg
    nrf OR jkk -> chf
    rtc AND rhc -> vvd
    y12 XOR x12 -> tqw
    cmk OR fhn -> jbj
    ttv OR mbp -> hnr
    x18 XOR y18 -> mvn
    mtq XOR tkj -> z03
    krw AND vnk -> vcj
    y25 AND x25 -> trg
    tsc XOR pns -> fhp
    bnc AND vmr -> ndj
    x33 XOR y33 -> smf
    hmk OR ndj -> fmr
    y41 AND x41 -> njd
    mch XOR jbk -> z05
    cgh XOR tqw -> z12
    y16 AND x16 -> z16
    y14 AND x14 -> wbg
    jtv AND nsc -> cdn
    y23 XOR x23 -> hvv
    tqw AND cgh -> mpw
    dvq OR ssp -> rft
    nmp OR jjg -> jct
    tbw XOR dsq -> z08
    fmr AND vtd -> jkg
    y24 AND x24 -> pbd
    x06 AND y06 -> dsw
    x07 XOR y07 -> pmd
    shm XOR njv -> z13
    x38 XOR y38 -> tnp
    gvf XOR cqv -> z37
    gjj OR dsw -> tqd
    x32 XOR y32 -> hhc
    y18 AND x18 -> jkk
    tmq AND fmg -> mbp
    x11 AND y11 -> cst
    gdq XOR chf -> z19
    gkk OR njd -> hdc
    ntn AND dtn -> wsm
    krw XOR vnk -> z21
    vbv AND vcd -> tvw
    y08 XOR x08 -> tbw
    x04 XOR y04 -> wfr
    qvp OR dhq -> knm
    wgr XOR bwj -> z39
    scf AND ksv -> mfv
    sfs OR fpf -> wgr
    qrh XOR bjg -> z35
    y16 XOR x16 -> vmr
    vvd OR dqh -> cqv
    wbg OR hwg -> nsc
    x25 XOR y25 -> cfr
    rft XOR tnp -> z38
    wfr XOR fnv -> z04
    y14 XOR x14 -> djk
    ncf OR vcj -> ggg
    x34 XOR y34 -> mgc
    gkb AND pjh -> hbd
    x10 XOR y10 -> tck
    x17 AND y17 -> kgb
    ggg AND prd -> jcw
    mgm XOR cfr -> z25
    kvm OR svd -> z45
    ddg XOR tck -> z10
    y27 XOR x27 -> tpc
    wjq XOR thj -> z06
    y02 AND x02 -> cpf
    sjc OR jhb -> mch
    gms OR cpf -> tkj
    jtv XOR nsc -> z15
    fnw AND wcj -> kvm
    tcw OR gvh -> wjq
    smf XOR rfd -> fcd
    jbj AND rkg -> dnv
    y19 AND x19 -> qgq
    jnh OR qkj -> spt
    mvn AND wjt -> nrf
    y22 AND x22 -> wnk
    jct AND hmm -> gkk
    x20 XOR y20 -> pns
    grr AND svt -> jjg
    x29 AND y29 -> pgp
    tck AND ddg -> cdj
    mgm AND cfr -> kkp
    x32 AND y32 -> bmh
    svt XOR grr -> z40
    hbc AND hnr -> qvp
    bjg AND qrh -> qmw
    y03 XOR x03 -> mtq
    y03 AND x03 -> qkp
    y26 AND x26 -> ttw
    fdg OR mpw -> njv
    kqj OR bcs -> ddg
    fjg OR qmw -> rtc
    ccs OR qck -> bjg
    y01 XOR x01 -> rsq
    x01 AND y01 -> qkj
    wjq AND thj -> gjj
    x09 AND y09 -> bcs
    mvn XOR wjt -> z18
    qgq OR qpp -> tsc
    spt AND vjn -> gms
    x38 AND y38 -> sfs
    nmd OR wdk -> vcd
    y41 XOR x41 -> hmm
    y06 XOR x06 -> thj
    chf AND gdq -> qpp
    x31 AND y31 -> dhq
    y42 AND x42 -> nmd
    tpc OR rmv -> ntn
    dtn XOR ntn -> z28
    y29 XOR x29 -> scf
    ftg OR tvw -> fnw
    y37 AND x37 -> ssp
    pgp OR mfv -> tmq
    x09 XOR y09 -> sqm
    x08 AND y08 -> nbj
    x28 AND y28 -> fnj
    pbf AND qwr -> ggw
    pwv AND sqm -> kqj
    y00 XOR x00 -> z00
    y42 XOR x42 -> kbt
    x00 AND y00 -> bdk
    x36 XOR y36 -> rhc
    jkg OR kgb -> wjt
    wfr AND fnv -> sjc
    wkw OR jgr -> z33
    x20 AND y20 -> rwm
    y26 XOR x26 -> qwr
    y44 AND x44 -> svd
    sqm XOR pwv -> z09
    wcj XOR fnw -> z44
    y13 XOR x13 -> shm
    hdc AND kbt -> wdk
    y43 XOR x43 -> vbv
    tmq XOR fmg -> z30
    cqv AND gvf -> dvq
    y17 XOR x17 -> vtd
    x22 XOR y22 -> prd
    fgp OR qkp -> fnv
    y28 XOR x28 -> dtn
    x33 AND y33 -> wkw
    njv AND shm -> hrk
    x04 AND y04 -> jhb
    fcd XOR mgc -> z34
    dsq AND tbw -> tqv
    hhc XOR knm -> z32
    hvv AND rnq -> cmk
    jcw OR wnk -> rnq
    x39 AND y39 -> chr
    pns AND tsc -> z20
    x35 AND y35 -> fjg
    x21 XOR y21 -> krw
    djk XOR pwm -> z14
    y02 XOR x02 -> vjn
    x30 AND y30 -> ttv
    y12 AND x12 -> fdg
    y15 XOR x15 -> jtv
    bdf OR dgf -> dsq
    wgr AND bwj -> nps
    y36 AND x36 -> dqh
    y10 AND x10 -> bqd
    cdj OR bqd -> pjh
    fnj OR wsm -> ksv
    trg OR kkp -> pbf
    gkb XOR pjh -> z11
    rsq AND bdk -> jnh
    bdk XOR rsq -> z01
    y43 AND x43 -> ftg
    jbj XOR rkg -> z24
    jct XOR hmm -> z41
    dnv OR pbd -> mgm
    spt XOR vjn -> z02
    rtc XOR rhc -> z36
    y05 AND x05 -> gvh
    rnq XOR hvv -> z23
    x13 AND y13 -> rnb
    y39 XOR x39 -> bwj
    mch AND jbk -> tcw
    fhp OR rwm -> vnk
    vmr XOR bnc -> hmk
    ttw OR ggw -> dkb
    x27 AND y27 -> rvf
    x19 XOR y19 -> gdq
    x40 XOR y40 -> grr
    y31 XOR x31 -> hbc
    hdc XOR kbt -> z42
""".trimIndent().split("\n")