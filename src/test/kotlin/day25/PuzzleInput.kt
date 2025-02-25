package day25

val puzzleInput = """
    .....
    #....
    #.#.#
    #.#.#
    #.#.#
    ###.#
    #####

    .....
    ...#.
    ...#.
    ...#.
    #..#.
    #.##.
    #####

    #####
    #####
    #####
    .#.#.
    .....
    .....
    .....

    #####
    ##.##
    #..##
    #...#
    #....
    .....
    .....

    #####
    .####
    ..###
    ...##
    ...#.
    .....
    .....

    .....
    .....
    ..#..
    ..#.#
    #.#.#
    #.###
    #####

    #####
    ###.#
    #.#.#
    #...#
    #...#
    #....
    .....

    .....
    .#...
    .#..#
    ##..#
    ##.##
    ##.##
    #####

    .....
    .....
    .....
    #....
    ##.#.
    ##.#.
    #####

    #####
    #####
    #####
    #.##.
    ...#.
    .....
    .....

    #####
    .#.##
    .#..#
    .#..#
    .#..#
    .#..#
    .....

    #####
    #####
    ####.
    #.##.
    ...#.
    .....
    .....

    #####
    .###.
    .#.#.
    .#.#.
    .#...
    .#...
    .....

    .....
    .....
    ...#.
    #.##.
    #.##.
    ####.
    #####

    #####
    #####
    #####
    #####
    .#.##
    ....#
    .....

    #####
    ####.
    .###.
    .###.
    .#.#.
    ...#.
    .....

    #####
    #####
    .####
    ..###
    ..#.#
    ....#
    .....

    .....
    ...#.
    ...#.
    .#.##
    .####
    #####
    #####

    #####
    #####
    #.#.#
    #...#
    #...#
    #...#
    .....

    .....
    .....
    ..#.#
    #.###
    #.###
    #####
    #####

    .....
    ....#
    ....#
    ....#
    .#.##
    ##.##
    #####

    .....
    .....
    .....
    ..#..
    .###.
    ####.
    #####

    #####
    #.#.#
    #.#..
    ..#..
    .....
    .....
    .....

    .....
    .#...
    .#...
    .#...
    ##..#
    ##.##
    #####

    .....
    ....#
    ....#
    ...##
    .#.##
    ##.##
    #####

    .....
    .#..#
    ##..#
    ###.#
    ###.#
    #####
    #####

    .....
    ...#.
    ...##
    .#.##
    .#.##
    #####
    #####

    #####
    #.###
    ..###
    ..###
    ..###
    ...#.
    .....

    .....
    ..#..
    .###.
    .###.
    .####
    .####
    #####

    .....
    .....
    #...#
    #.#.#
    #.#.#
    ###.#
    #####

    #####
    ###.#
    ###.#
    #.#.#
    ..#.#
    .....
    .....

    #####
    #####
    ###.#
    ##..#
    #...#
    #....
    .....

    #####
    #.###
    #.#.#
    ..#.#
    ..#.#
    .....
    .....

    .....
    .....
    ....#
    #...#
    ##.##
    ##.##
    #####

    #####
    #####
    #####
    .####
    .#.#.
    ...#.
    .....

    .....
    #....
    #.#..
    #.#..
    #.#.#
    #.###
    #####

    .....
    ...#.
    ...##
    #..##
    #..##
    #.###
    #####

    #####
    #####
    #.#.#
    #.#..
    .....
    .....
    .....

    .....
    ..#.#
    #.#.#
    #####
    #####
    #####
    #####

    .....
    .#...
    ###.#
    ###.#
    ###.#
    #####
    #####

    .....
    .....
    .....
    ....#
    ...##
    #.###
    #####

    #####
    ###.#
    ##..#
    ##..#
    .#...
    .....
    .....

    .....
    .....
    ...#.
    .#.#.
    .#.#.
    ####.
    #####

    #####
    #####
    #.###
    #.###
    #..##
    #..#.
    .....

    .....
    ...#.
    ..##.
    #.##.
    #.##.
    #.###
    #####

    #####
    #####
    .#.##
    ...##
    ....#
    ....#
    .....

    .....
    .....
    .....
    .#.#.
    .#.#.
    .#.##
    #####

    .....
    .....
    ....#
    .#..#
    ##.##
    ##.##
    #####

    #####
    ##.##
    ##.##
    .#.#.
    .#.#.
    .....
    .....

    .....
    ..#..
    ..#..
    ..#..
    .##.#
    .####
    #####

    #####
    ##.##
    .#.##
    .#.#.
    .#...
    .....
    .....

    .....
    #...#
    #..##
    #..##
    ##.##
    #####
    #####

    .....
    ....#
    #...#
    #...#
    ##..#
    ##.##
    #####

    #####
    .##.#
    ..#.#
    ..#.#
    ..#..
    ..#..
    .....

    #####
    #.###
    #..##
    #...#
    ....#
    ....#
    .....

    #####
    #####
    .#.##
    .#.##
    ...#.
    ...#.
    .....

    #####
    .####
    ..###
    ..###
    ...##
    ....#
    .....

    #####
    #####
    #####
    #.###
    #..##
    ...#.
    .....

    .....
    ....#
    .#..#
    .#..#
    .#.##
    ##.##
    #####

    #####
    ###.#
    ###.#
    .##.#
    ..#..
    .....
    .....

    .....
    #...#
    #...#
    #.#.#
    #####
    #####
    #####

    .....
    ..#.#
    ..###
    .####
    .####
    .####
    #####

    #####
    #####
    ##.#.
    #..#.
    #..#.
    .....
    .....

    #####
    #.###
    #.##.
    #.#..
    ..#..
    ..#..
    .....

    #####
    #####
    #####
    #.#.#
    #.#.#
    #.#..
    .....

    #####
    #####
    ##.##
    .#.##
    ....#
    .....
    .....

    #####
    #####
    .###.
    .#.#.
    .#.#.
    .....
    .....

    #####
    .####
    .####
    .###.
    .##..
    .#...
    .....

    .....
    .....
    .....
    ..#.#
    .##.#
    #####
    #####

    #####
    .###.
    .###.
    .##..
    ..#..
    ..#..
    .....

    #####
    #####
    ##.##
    ##.##
    ##.#.
    #....
    .....

    #####
    #####
    #####
    #.#.#
    ....#
    .....
    .....

    #####
    #.###
    #.#.#
    #.#..
    #....
    .....
    .....

    .....
    .....
    .....
    #....
    #.#.#
    #.#.#
    #####

    #####
    .####
    .####
    .###.
    .###.
    .#.#.
    .....

    #####
    #####
    #####
    .###.
    ..#..
    ..#..
    .....

    .....
    .....
    ..#.#
    .##.#
    .##.#
    .##.#
    #####

    .....
    .....
    ...#.
    ...#.
    #.###
    #####
    #####

    #####
    #.##.
    ..#..
    ..#..
    .....
    .....
    .....

    .....
    .....
    #....
    #....
    #....
    ##.#.
    #####

    .....
    #....
    #....
    #.#.#
    ###.#
    ###.#
    #####

    .....
    .#...
    ##..#
    ##..#
    ###.#
    #####
    #####

    .....
    ..#..
    ..#..
    #.#.#
    #.#.#
    #####
    #####

    #####
    ####.
    .#.#.
    .#.#.
    .#.#.
    .#...
    .....

    #####
    ####.
    ####.
    ####.
    .##..
    .#...
    .....

    .....
    .....
    ...#.
    ..##.
    .###.
    .###.
    #####

    .....
    .....
    .....
    .#..#
    ###.#
    ###.#
    #####

    #####
    #####
    #####
    ##.#.
    #..#.
    #....
    .....

    .....
    ...#.
    .#.#.
    .#.#.
    ####.
    ####.
    #####

    #####
    ###.#
    ###.#
    .#...
    .#...
    .....
    .....

    .....
    ...#.
    ..##.
    #.##.
    #.###
    #####
    #####

    #####
    #####
    #####
    .#.#.
    .#.#.
    .#...
    .....

    #####
    ##.#.
    ##.#.
    .#.#.
    .#.#.
    .#...
    .....

    .....
    .#...
    .##..
    .##..
    ###.#
    ###.#
    #####

    #####
    #.###
    ..##.
    ..##.
    ...#.
    ...#.
    .....

    #####
    #####
    #####
    #.##.
    ..#..
    ..#..
    .....

    .....
    #....
    #...#
    #..##
    #.###
    #####
    #####

    .....
    ...#.
    #..#.
    ##.##
    #####
    #####
    #####

    #####
    ####.
    ####.
    #.#..
    #.#..
    .....
    .....

    .....
    .#..#
    .#.##
    ##.##
    ##.##
    #####
    #####

    #####
    #####
    ##.#.
    #..#.
    #..#.
    #..#.
    .....

    .....
    ....#
    .#..#
    .#..#
    ###.#
    #####
    #####

    #####
    ##.##
    #..##
    #..##
    #..#.
    .....
    .....

    .....
    ..#..
    .##..
    .###.
    .###.
    .###.
    #####

    #####
    #####
    #.##.
    #.##.
    #.#..
    #.#..
    .....

    #####
    ##.##
    #..##
    #...#
    #...#
    ....#
    .....

    #####
    ####.
    ##.#.
    #....
    .....
    .....
    .....

    #####
    #####
    #.###
    #.#.#
    ..#.#
    .....
    .....

    #####
    #.#.#
    #...#
    ....#
    ....#
    ....#
    .....

    .....
    .....
    ..#.#
    .####
    .####
    #####
    #####

    .....
    .....
    .....
    #..#.
    #..#.
    ##.##
    #####

    .....
    ..#..
    ..#.#
    #.#.#
    #.###
    #.###
    #####

    .....
    .....
    ...#.
    #..#.
    #..##
    ##.##
    #####

    #####
    #####
    .####
    .####
    .##.#
    ..#.#
    .....

    .....
    ..#.#
    ..#.#
    #.#.#
    #.#.#
    ###.#
    #####

    .....
    ..#..
    #.#..
    #.##.
    #.##.
    ####.
    #####

    #####
    #####
    #.###
    #.#.#
    ..#..
    ..#..
    .....

    .....
    .....
    .#.#.
    .####
    #####
    #####
    #####

    #####
    #####
    ##.##
    ##.##
    .#.##
    .#..#
    .....

    #####
    .###.
    .###.
    .##..
    ..#..
    .....
    .....

    .....
    .....
    ...#.
    #.###
    #.###
    #####
    #####

    #####
    ##.##
    ##.##
    ##..#
    .#..#
    .#..#
    .....

    .....
    .....
    .#...
    .#...
    .#...
    .##.#
    #####

    #####
    #####
    ###.#
    ##...
    #....
    #....
    .....

    #####
    .####
    .###.
    .###.
    .#.#.
    .....
    .....

    #####
    .####
    .#.##
    .#.#.
    ...#.
    ...#.
    .....

    .....
    .....
    ...#.
    #..#.
    ##.#.
    ##.##
    #####

    .....
    .....
    .....
    .#..#
    .#..#
    .##.#
    #####

    #####
    ##.##
    ##..#
    ##...
    .#...
    .....
    .....

    #####
    .####
    .####
    .###.
    .#.#.
    ...#.
    .....

    .....
    ...#.
    ..##.
    ..##.
    #.##.
    ####.
    #####

    #####
    #####
    #.#.#
    #.#.#
    #.#.#
    ..#..
    .....

    #####
    #####
    ###.#
    #.#.#
    #.#.#
    ..#.#
    .....

    .....
    .....
    .#..#
    .#..#
    ###.#
    ###.#
    #####

    .....
    ..#..
    #.#..
    #.#.#
    #####
    #####
    #####

    #####
    #####
    .##.#
    .##.#
    .##..
    ..#..
    .....

    .....
    ...#.
    ...#.
    ...#.
    ..##.
    #.##.
    #####

    .....
    ...#.
    .#.#.
    ##.#.
    ##.#.
    #####
    #####

    .....
    ...#.
    ...##
    ...##
    .#.##
    .#.##
    #####

    .....
    .....
    #....
    #.#.#
    #.#.#
    #.###
    #####

    #####
    #####
    #.###
    #..##
    ....#
    .....
    .....

    #####
    ####.
    ###..
    #.#..
    #.#..
    #.#..
    .....

    #####
    ##.##
    ##..#
    ##..#
    .#..#
    .#...
    .....

    #####
    #####
    .####
    ..#.#
    ..#.#
    ..#..
    .....

    .....
    .....
    ..#.#
    ..#.#
    #.###
    #.###
    #####

    .....
    ....#
    ...##
    .#.##
    .#.##
    .####
    #####

    .....
    #....
    #...#
    #..##
    ##.##
    ##.##
    #####

    .....
    .....
    #...#
    #...#
    ##.##
    #####
    #####

    #####
    .##.#
    .#..#
    .#..#
    .#...
    .....
    .....

    .....
    .....
    ...#.
    ...#.
    ..##.
    .###.
    #####

    #####
    .###.
    .###.
    .#.#.
    .#...
    .....
    .....

    #####
    ####.
    ####.
    ##.#.
    #..#.
    #..#.
    .....

    #####
    #.###
    #.###
    #..##
    ...##
    ....#
    .....

    .....
    #..#.
    #..#.
    ##.#.
    ##.#.
    ####.
    #####

    #####
    ##.##
    #..##
    #...#
    #....
    #....
    .....

    #####
    .##.#
    .##.#
    ..#.#
    ..#.#
    .....
    .....

    #####
    #####
    .####
    .###.
    .###.
    ..#..
    .....

    .....
    #....
    #...#
    #...#
    #..##
    #.###
    #####

    #####
    ####.
    ##.#.
    #..#.
    .....
    .....
    .....

    .....
    .....
    ..#..
    ..##.
    .###.
    #####
    #####

    .....
    .....
    .#...
    ##...
    ###..
    ####.
    #####

    .....
    .....
    ..#..
    ..##.
    .###.
    ####.
    #####

    .....
    .....
    #.#.#
    #.###
    #.###
    #####
    #####

    .....
    .#...
    .##..
    .##..
    .##.#
    .##.#
    #####

    .....
    ....#
    ....#
    #...#
    #.#.#
    ###.#
    #####

    .....
    #..#.
    #.##.
    #.##.
    #####
    #####
    #####

    .....
    ....#
    ....#
    ..#.#
    .##.#
    .####
    #####

    #####
    ##.##
    ##.##
    ##.##
    .#..#
    .#..#
    .....

    #####
    #####
    #.###
    #.###
    ..##.
    ..#..
    .....

    .....
    .....
    .#...
    .#.#.
    .#.#.
    .#.##
    #####

    .....
    ....#
    #...#
    #..##
    #..##
    #.###
    #####

    .....
    .....
    #.#..
    #.#..
    ####.
    ####.
    #####

    #####
    #####
    #####
    .####
    ..###
    ..#.#
    .....

    .....
    #....
    #.#..
    ####.
    #####
    #####
    #####

    #####
    ###.#
    ##..#
    ##..#
    .#..#
    .....
    .....

    .....
    ....#
    #.#.#
    #.#.#
    #.###
    #.###
    #####

    #####
    .###.
    .##..
    ..#..
    ..#..
    .....
    .....

    .....
    ...#.
    ..##.
    ..##.
    .####
    .####
    #####

    #####
    #####
    #.###
    #.##.
    #.#..
    #.#..
    .....

    #####
    #####
    ###.#
    ###.#
    ###.#
    .#..#
    .....

    #####
    ###.#
    ##..#
    ##..#
    #....
    .....
    .....

    .....
    .....
    ....#
    .#..#
    .#.##
    #####
    #####

    .....
    .#...
    ##.#.
    ##.#.
    ##.#.
    #####
    #####

    .....
    ..#..
    #.#.#
    #.#.#
    #.#.#
    #.#.#
    #####

    #####
    #####
    ##.#.
    #..#.
    #..#.
    #....
    .....

    #####
    ####.
    ####.
    #.##.
    ..##.
    ...#.
    .....

    .....
    #.#..
    #.##.
    #.##.
    ####.
    ####.
    #####

    .....
    .....
    #...#
    #...#
    #..##
    ##.##
    #####

    #####
    ###.#
    ###.#
    #.#.#
    ..#..
    .....
    .....

    #####
    ###.#
    ###.#
    ###.#
    ###.#
    .#..#
    .....

    .....
    .....
    #..#.
    ##.##
    ##.##
    #####
    #####

    #####
    ####.
    #.#..
    ..#..
    ..#..
    .....
    .....

    #####
    #####
    ###.#
    .##.#
    .#..#
    .#..#
    .....

    .....
    ..#..
    ..#..
    ..#..
    #.#..
    #.##.
    #####

    .....
    #....
    #...#
    #.#.#
    #.#.#
    ###.#
    #####

    .....
    ....#
    #...#
    #.#.#
    #.#.#
    ###.#
    #####

    #####
    ####.
    ####.
    ###..
    #.#..
    .....
    .....

    #####
    .#.##
    .#..#
    .#..#
    ....#
    .....
    .....

    .....
    ..#..
    ..#.#
    #.#.#
    #.#.#
    #####
    #####

    .....
    #....
    #....
    #...#
    #...#
    ##.##
    #####

    #####
    #####
    .####
    .####
    ..###
    ..#.#
    .....

    #####
    ##.##
    .#.##
    .#.#.
    .#.#.
    ...#.
    .....

    #####
    #####
    #.##.
    #.##.
    ...#.
    ...#.
    .....

    #####
    #####
    ####.
    ####.
    ###..
    .#...
    .....

    #####
    #####
    #####
    #.###
    #.##.
    #..#.
    .....

    #####
    .#.##
    .#.##
    .#.##
    .#.##
    ...#.
    .....

    #####
    ##.##
    #..##
    ....#
    .....
    .....
    .....

    .....
    ....#
    #.#.#
    #.#.#
    #.#.#
    #####
    #####

    #####
    ####.
    ###..
    ###..
    #.#..
    ..#..
    .....

    #####
    #####
    ###.#
    ###.#
    .#...
    .....
    .....

    .....
    .#..#
    ##..#
    ##..#
    ##.##
    ##.##
    #####

    .....
    ...#.
    ...#.
    ...#.
    .#.##
    ##.##
    #####

    .....
    .....
    .....
    .#...
    .##.#
    ###.#
    #####

    #####
    ##.##
    .#.##
    .#..#
    .#..#
    .....
    .....

    .....
    .....
    ..#..
    ..#.#
    ..#.#
    .####
    #####

    #####
    ###.#
    ###.#
    ###.#
    #.#..
    .....
    .....

    .....
    ..#..
    .###.
    ####.
    #####
    #####
    #####

    .....
    .....
    ..#..
    #.#..
    ####.
    #####
    #####

    .....
    .....
    .#...
    .#.#.
    ##.##
    #####
    #####

    #####
    ###.#
    ###.#
    #.#.#
    #...#
    #...#
    .....

    #####
    ##.#.
    ##.#.
    .#.#.
    .#.#.
    .....
    .....

    #####
    ##.##
    ##..#
    .#..#
    ....#
    .....
    .....

    #####
    #####
    ##.##
    ##.##
    .#.#.
    .#...
    .....

    .....
    .....
    ..#..
    #.#..
    ###.#
    ###.#
    #####

    #####
    ###.#
    ###..
    #.#..
    #.#..
    #....
    .....

    .....
    .....
    .#.#.
    .#.#.
    ####.
    #####
    #####

    #####
    .####
    .#.##
    .#.##
    ...##
    ...#.
    .....

    .....
    #....
    #..#.
    #..#.
    ##.#.
    #####
    #####

    .....
    ..#..
    ..##.
    ..##.
    #.###
    #####
    #####

    .....
    ...#.
    ...#.
    .#.##
    .#.##
    ##.##
    #####

    .....
    ..#..
    .###.
    .###.
    .###.
    ####.
    #####

    #####
    ###.#
    #.#.#
    #.#..
    #....
    #....
    .....

    .....
    .....
    #....
    ##...
    ##.#.
    #####
    #####

    .....
    #....
    ##...
    ##...
    ##..#
    ###.#
    #####

    .....
    .....
    .#.#.
    .#.#.
    .#.#.
    ##.##
    #####

    .....
    ..#.#
    ..#.#
    .##.#
    ###.#
    ###.#
    #####

    .....
    .#...
    .#...
    .#.#.
    .####
    .####
    #####

    .....
    .....
    .#...
    ##..#
    ##.##
    #####
    #####

    #####
    #.###
    #..##
    #..##
    #..##
    #..#.
    .....

    #####
    #####
    #####
    .#.#.
    .#.#.
    .#.#.
    .....

    .....
    ....#
    ..#.#
    .##.#
    .####
    #####
    #####

    #####
    #####
    .##.#
    .#..#
    .#..#
    ....#
    .....

    #####
    ##.#.
    ##.#.
    #..#.
    #..#.
    .....
    .....

    .....
    #....
    #...#
    #...#
    #.#.#
    #.###
    #####

    #####
    #####
    #.###
    #.#.#
    #.#.#
    ..#..
    .....

    #####
    #####
    ##.##
    ##..#
    #....
    .....
    .....

    #####
    ##.##
    ##..#
    #....
    .....
    .....
    .....

    #####
    ####.
    ####.
    #.#..
    ..#..
    ..#..
    .....

    #####
    ####.
    #.##.
    #..#.
    ...#.
    .....
    .....

    #####
    ###.#
    ###.#
    ###.#
    ##..#
    .#...
    .....

    #####
    #.##.
    #.##.
    #..#.
    #....
    .....
    .....

    #####
    #####
    ##.#.
    #..#.
    #....
    .....
    .....

    .....
    .....
    ..#.#
    .##.#
    ###.#
    ###.#
    #####

    #####
    #####
    ##.##
    .#.#.
    .#.#.
    ...#.
    .....

    .....
    .#...
    .#..#
    .##.#
    .##.#
    .####
    #####

    .....
    .....
    .....
    .#.#.
    ####.
    ####.
    #####

    .....
    ...#.
    ...##
    #..##
    #..##
    ##.##
    #####

    #####
    #####
    ##.#.
    ##...
    .#...
    .....
    .....

    #####
    ###.#
    .##..
    .##..
    .##..
    ..#..
    .....

    #####
    #.#.#
    ....#
    ....#
    ....#
    ....#
    .....

    #####
    #####
    #####
    .####
    ..#.#
    ..#.#
    .....

    .....
    .....
    #....
    #..#.
    #..#.
    ##.#.
    #####

    .....
    #....
    ##...
    ###..
    ###..
    ####.
    #####

    #####
    #.###
    #..##
    #..##
    #..#.
    ...#.
    .....

    .....
    .....
    .....
    #.#..
    #.#.#
    #.#.#
    #####

    #####
    ####.
    ####.
    ####.
    #.#..
    #.#..
    .....

    #####
    #####
    ###.#
    ###.#
    ##..#
    #....
    .....

    .....
    #...#
    #...#
    #..##
    ##.##
    ##.##
    #####

    #####
    #.###
    #.#.#
    #.#.#
    #....
    .....
    .....

    .....
    .#...
    .#...
    .#...
    ###..
    ###.#
    #####

    #####
    #.###
    ...#.
    ...#.
    .....
    .....
    .....

    #####
    #####
    #####
    #.##.
    #.##.
    ..#..
    .....

    #####
    #####
    #####
    #.#.#
    ..#..
    .....
    .....

    #####
    .###.
    .###.
    .##..
    .#...
    .....
    .....

    .....
    .....
    .#...
    .##.#
    .##.#
    .####
    #####

    #####
    #.###
    #.###
    ..###
    ...##
    ....#
    .....

    .....
    .....
    ...#.
    ...#.
    ..##.
    #.###
    #####

    .....
    .....
    .....
    ..#..
    #.##.
    #.##.
    #####

    .....
    ..#..
    .##..
    .###.
    ####.
    ####.
    #####

    #####
    #.###
    ..#.#
    ..#.#
    ..#..
    .....
    .....

    .....
    ...#.
    ..##.
    ..###
    #.###
    #.###
    #####

    .....
    #.#..
    #.#..
    #.#..
    #.#..
    #.#.#
    #####

    #####
    #####
    ####.
    #.##.
    #.#..
    ..#..
    .....

    #####
    ###.#
    ###.#
    #.#..
    #....
    #....
    .....

    .....
    .#...
    .#..#
    .#..#
    ###.#
    ###.#
    #####

    .....
    ...#.
    ...#.
    .#.#.
    #####
    #####
    #####

    .....
    ...#.
    .#.#.
    .###.
    .###.
    .###.
    #####

    #####
    .#.##
    ...##
    ....#
    ....#
    .....
    .....

    #####
    ####.
    .###.
    ..##.
    ..##.
    ..#..
    .....

    .....
    ..#..
    #.#..
    #.#.#
    #.#.#
    #.#.#
    #####

    #####
    #.##.
    ..##.
    ..##.
    ..##.
    ..#..
    .....

    #####
    #####
    ###.#
    ##..#
    ##..#
    .#...
    .....

    #####
    #.###
    ...##
    ...##
    ...##
    ....#
    .....

    #####
    ##.##
    ##.#.
    ##.#.
    .#...
    .#...
    .....

    #####
    ###.#
    ###..
    ###..
    ###..
    #.#..
    .....

    .....
    ...#.
    .#.#.
    .#.#.
    .###.
    .####
    #####

    .....
    .....
    #...#
    #..##
    #.###
    #####
    #####

    #####
    #.###
    #.###
    ..###
    ...##
    ...#.
    .....

    .....
    ....#
    #...#
    #..##
    ##.##
    ##.##
    #####

    .....
    .....
    #..#.
    ##.#.
    ##.#.
    ##.##
    #####

    .....
    .....
    ...#.
    ..###
    .####
    #####
    #####

    .....
    ..#..
    ..##.
    #.##.
    #.##.
    #.###
    #####

    #####
    ##.##
    ##.##
    ##.##
    #..#.
    #..#.
    .....

    .....
    #....
    ##.#.
    ####.
    #####
    #####
    #####

    #####
    ###.#
    ##...
    ##...
    .#...
    .#...
    .....

    .....
    .....
    .....
    #....
    #...#
    ##.##
    #####

    .....
    ..#.#
    #.#.#
    #.#.#
    #.#.#
    ###.#
    #####

    #####
    #####
    ###.#
    #.#.#
    #.#.#
    #...#
    .....

    #####
    #####
    #####
    #.#.#
    ..#.#
    ..#..
    .....

    .....
    #....
    #....
    #....
    #.#.#
    ###.#
    #####

    .....
    ....#
    ....#
    .#..#
    ##.##
    ##.##
    #####

    #####
    #####
    ####.
    .###.
    .#.#.
    ...#.
    .....

    #####
    #####
    ##.##
    .#.##
    .#..#
    .#..#
    .....

    #####
    #####
    #####
    #####
    .#.#.
    ...#.
    .....

    .....
    .....
    .#..#
    .#..#
    ###.#
    #####
    #####

    .....
    .#...
    .#.#.
    .#.##
    #####
    #####
    #####

    #####
    #####
    #####
    ##.##
    #..##
    ...#.
    .....

    .....
    .#...
    .#...
    .#..#
    .#.##
    .#.##
    #####

    .....
    ...#.
    ...#.
    #..#.
    ##.#.
    #####
    #####

    #####
    #.###
    #.###
    ..##.
    ..##.
    ...#.
    .....

    .....
    .....
    .....
    ..#.#
    #.#.#
    ###.#
    #####

    #####
    ##.##
    ##.#.
    .#.#.
    .#.#.
    .....
    .....

    .....
    .....
    ..#..
    .##.#
    .##.#
    #####
    #####

    #####
    ##.##
    #..##
    #...#
    ....#
    .....
    .....

    #####
    #####
    #.###
    #.###
    ..#.#
    .....
    .....

    .....
    ..#..
    #.#..
    #.##.
    #.##.
    #.###
    #####

    .....
    .....
    .....
    .#.#.
    .#.#.
    .####
    #####

    #####
    #.###
    #.##.
    #.##.
    ..#..
    ..#..
    .....

    #####
    ###.#
    #.#.#
    #...#
    ....#
    ....#
    .....

    #####
    #####
    #####
    ##.##
    #..##
    ....#
    .....

    .....
    .....
    ....#
    .#..#
    .#..#
    ###.#
    #####

    #####
    .####
    .###.
    .##..
    .#...
    .....
    .....

    .....
    ....#
    .#.##
    .#.##
    ##.##
    ##.##
    #####

    .....
    .....
    .#...
    .#.#.
    .#.#.
    ##.##
    #####

    #####
    #####
    .#.#.
    .#...
    .#...
    .#...
    .....

    .....
    .....
    .#.#.
    .#.#.
    .#.#.
    .###.
    #####

    #####
    #.###
    ...##
    ....#
    ....#
    .....
    .....

    .....
    .....
    .....
    ...#.
    ...#.
    #.##.
    #####

    .....
    .....
    #....
    #..#.
    #.##.
    #.###
    #####

    #####
    ##.##
    #..##
    ...#.
    ...#.
    .....
    .....

    #####
    ###.#
    .##.#
    .##.#
    .#..#
    .#...
    .....

    #####
    ##.#.
    ##...
    ##...
    #....
    #....
    .....

    .....
    .....
    ...#.
    .#.#.
    ##.##
    #####
    #####

    #####
    #####
    ##.##
    #..#.
    #..#.
    #..#.
    .....

    .....
    .#.#.
    .###.
    .###.
    ####.
    ####.
    #####

    .....
    .....
    ....#
    .#.##
    .#.##
    #####
    #####

    .....
    .#...
    .#...
    .#..#
    ##..#
    ###.#
    #####

    #####
    #####
    ##.#.
    .#.#.
    .#...
    .#...
    .....

    .....
    .....
    ...#.
    .#.#.
    ##.#.
    #####
    #####

    .....
    #.#..
    #.##.
    ####.
    ####.
    #####
    #####

    #####
    ####.
    .##..
    .##..
    ..#..
    ..#..
    .....

    #####
    ##.#.
    #..#.
    #..#.
    ...#.
    ...#.
    .....

    .....
    .....
    .#..#
    ##.##
    ##.##
    #####
    #####

    .....
    .#...
    ###..
    ####.
    #####
    #####
    #####

    .....
    ....#
    ..#.#
    .####
    .####
    #####
    #####

    #####
    .####
    .####
    .####
    .#.#.
    .....
    .....

    .....
    #..#.
    ##.#.
    ##.##
    ##.##
    ##.##
    #####

    .....
    .....
    .....
    .....
    #..#.
    ##.#.
    #####

    #####
    #####
    ##.##
    ##.##
    #...#
    ....#
    .....

    #####
    #.###
    ..###
    ..#.#
    ..#.#
    ..#.#
    .....

    #####
    #####
    ##.##
    .#..#
    ....#
    .....
    .....

    #####
    ##.##
    ##.##
    ##.#.
    .#.#.
    .#...
    .....

    .....
    .#...
    .#.#.
    ##.#.
    ##.##
    #####
    #####

    .....
    .....
    .#...
    .#...
    ##.#.
    ####.
    #####

    #####
    #####
    .####
    .####
    .###.
    ..#..
    .....

    #####
    ###.#
    .##.#
    .##.#
    .#...
    .....
    .....

    .....
    .#...
    .#...
    .##..
    ####.
    #####
    #####

    .....
    ..#..
    ..#..
    #.#..
    #.##.
    #.##.
    #####

    .....
    .....
    .....
    .#.#.
    .#.#.
    ##.##
    #####

    .....
    #....
    #.#..
    ####.
    ####.
    #####
    #####

    #####
    ##.##
    #..##
    #...#
    #...#
    #....
    .....

    #####
    ##.##
    ##.#.
    #..#.
    .....
    .....
    .....

    #####
    .####
    .#.##
    ....#
    ....#
    .....
    .....

    #####
    #####
    .####
    .##.#
    .##.#
    ..#..
    .....

    .....
    .....
    .#..#
    .#.##
    ##.##
    ##.##
    #####

    #####
    ####.
    .###.
    .##..
    .#...
    .#...
    .....

    #####
    .##.#
    ..#.#
    ....#
    .....
    .....
    .....

    .....
    #....
    ##...
    ###.#
    ###.#
    #####
    #####

    .....
    .....
    .....
    #..#.
    #.##.
    #.##.
    #####

    #####
    .####
    ..###
    ..##.
    ..##.
    ...#.
    .....

    .....
    .....
    ..#.#
    .##.#
    .####
    .####
    #####

    .....
    ....#
    ....#
    #...#
    #..##
    #.###
    #####

    .....
    ..#.#
    ..#.#
    #.#.#
    #.#.#
    #.#.#
    #####

    .....
    .....
    ..#..
    ..#..
    #.#.#
    #####
    #####

    #####
    .####
    .###.
    .#.#.
    .#.#.
    ...#.
    .....

    #####
    ###.#
    ###.#
    .##.#
    ..#.#
    ..#..
    .....

    .....
    .#...
    ###..
    ####.
    ####.
    #####
    #####

    .....
    .#.#.
    ##.##
    ##.##
    #####
    #####
    #####

    .....
    ...#.
    #..##
    #.###
    #.###
    #####
    #####

    #####
    #.###
    #.###
    ..#.#
    ..#.#
    .....
    .....

    .....
    ..#..
    .##..
    .##..
    .###.
    ####.
    #####

    #####
    #.##.
    ...#.
    ...#.
    ...#.
    .....
    .....

    #####
    ###.#
    ###.#
    #.#.#
    #.#..
    ..#..
    .....

    #####
    #####
    #####
    .#.##
    .#..#
    .#..#
    .....

    #####
    ##.#.
    ##.#.
    .#.#.
    .#.#.
    ...#.
    .....

    #####
    #####
    #####
    ###.#
    .##.#
    ..#.#
    .....

    .....
    #..#.
    #..#.
    #..##
    #..##
    ##.##
    #####

    #####
    .####
    .#.##
    .#.##
    .#.#.
    .#.#.
    .....

    #####
    ####.
    ####.
    #.##.
    #.#..
    #.#..
    .....

    .....
    .....
    ..#.#
    .##.#
    .##.#
    .####
    #####

    .....
    .#...
    ##...
    ##...
    ##..#
    ###.#
    #####

    #####
    #####
    #####
    ##.#.
    .#.#.
    .....
    .....

    .....
    ..#..
    ..##.
    .###.
    #####
    #####
    #####

    .....
    ..#..
    ..#..
    #.##.
    ####.
    #####
    #####

    .....
    .....
    .....
    ..#.#
    .####
    #####
    #####

    #####
    ####.
    ##.#.
    #..#.
    ...#.
    ...#.
    .....

    .....
    .....
    .#..#
    .#..#
    .#.##
    .####
    #####

    #####
    #####
    .####
    .#.#.
    .#...
    .#...
    .....

    #####
    .####
    ..###
    ..##.
    ...#.
    .....
    .....

    .....
    #.#..
    #.#..
    ###..
    ###..
    ####.
    #####

    #####
    .####
    .##.#
    .##..
    .##..
    ..#..
    .....

    .....
    .#...
    .#...
    .#.#.
    .####
    #####
    #####

    #####
    #####
    #.#.#
    ..#.#
    ....#
    .....
    .....

    #####
    ##.#.
    .#...
    .....
    .....
    .....
    .....

    .....
    ...#.
    .#.##
    .#.##
    .####
    .####
    #####

    .....
    .#..#
    .##.#
    .##.#
    .##.#
    #####
    #####

    .....
    ..#..
    .###.
    .###.
    .####
    #####
    #####

    .....
    .....
    .....
    .#..#
    .#.##
    ##.##
    #####

    .....
    .#...
    .#...
    ###..
    ###..
    ####.
    #####

    .....
    .#...
    .#...
    ##.#.
    ####.
    #####
    #####

    #####
    #####
    #.##.
    ..##.
    ..#..
    .....
    .....

    .....
    #...#
    #.#.#
    #.#.#
    #.###
    #####
    #####

    .....
    ..#..
    ..#..
    ..#..
    #.##.
    #.##.
    #####

    .....
    #....
    ##...
    ###..
    ###.#
    ###.#
    #####

    #####
    .###.
    .###.
    .#.#.
    .#.#.
    ...#.
    .....

    .....
    ....#
    ..#.#
    #.#.#
    #.###
    #.###
    #####

    .....
    ....#
    ...##
    ...##
    .#.##
    #####
    #####

    .....
    ....#
    ..#.#
    .##.#
    .##.#
    #####
    #####

    #####
    ####.
    #.##.
    #.##.
    ..#..
    ..#..
    .....

    .....
    .....
    ..#.#
    .##.#
    #####
    #####
    #####

    #####
    ##.##
    .#.##
    .#..#
    .#..#
    .#..#
    .....

    .....
    ...#.
    ...#.
    .#.#.
    .#.#.
    .###.
    #####

    .....
    .#...
    ##...
    ##...
    ##.#.
    ##.#.
    #####

    #####
    #.##.
    #..#.
    #..#.
    #..#.
    ...#.
    .....

    #####
    ###.#
    .##.#
    .#...
    .#...
    .....
    .....

    .....
    ...#.
    #..#.
    #.##.
    #.##.
    #.###
    #####

    #####
    #####
    ####.
    ####.
    #.##.
    ...#.
    .....

    #####
    .#.##
    .#..#
    .#..#
    .#..#
    ....#
    .....

    #####
    ##.##
    #...#
    #...#
    #...#
    #...#
    .....

    #####
    .####
    .###.
    .###.
    ..#..
    .....
    .....

    #####
    #####
    ##.##
    #..##
    ...#.
    .....
    .....

    .....
    .....
    ...#.
    #..#.
    #.###
    #####
    #####

    #####
    #####
    .##.#
    .##..
    ..#..
    .....
    .....

    .....
    #....
    #....
    #.#.#
    #.#.#
    ###.#
    #####

    #####
    ###.#
    .##.#
    .##.#
    .#..#
    .....
    .....

    .....
    ...#.
    ...#.
    #..#.
    #.##.
    #####
    #####

    .....
    .....
    ..#..
    ..#..
    .##..
    ###.#
    #####

    #####
    #####
    .#.##
    ....#
    ....#
    .....
    .....

    .....
    .....
    .....
    #.#.#
    #.#.#
    ###.#
    #####

    #####
    #####
    #####
    #.###
    #.###
    #..#.
    .....

    #####
    ##.##
    .#.##
    .#.#.
    .#.#.
    .#.#.
    .....

    #####
    #####
    #.###
    ..##.
    ..#..
    ..#..
    .....

    #####
    #####
    #####
    ##.#.
    #..#.
    .....
    .....

    .....
    .....
    ..#..
    #.#..
    #.#..
    #.##.
    #####

    .....
    ..#..
    .##..
    .##..
    ###.#
    #####
    #####

    #####
    #####
    #.###
    #.#.#
    #....
    #....
    .....

    .....
    #.#..
    #.#..
    #.#..
    ###..
    ###.#
    #####

    .....
    .#...
    ##...
    ###..
    ###..
    ####.
    #####

    #####
    #####
    #.#.#
    #.#.#
    #.#.#
    #.#..
    .....

    .....
    .....
    .....
    .....
    #.#..
    #.##.
    #####

    #####
    #.##.
    #.##.
    #.##.
    #.#..
    #....
    .....

    #####
    #####
    .###.
    .##..
    .##..
    ..#..
    .....

    .....
    .#..#
    .#..#
    .##.#
    #####
    #####
    #####

    .....
    ....#
    .#..#
    .#..#
    ##..#
    ###.#
    #####

    #####
    ###.#
    #.#.#
    ..#.#
    ..#.#
    ..#..
    .....

    .....
    .....
    .....
    #....
    #.#.#
    ###.#
    #####

    #####
    .##.#
    .##.#
    ..#..
    .....
    .....
    .....

    .....
    .....
    #....
    #.#.#
    #####
    #####
    #####

    #####
    ####.
    ###..
    #.#..
    ..#..
    ..#..
    .....

    #####
    #####
    #.##.
    #.##.
    ..##.
    ...#.
    .....

    .....
    .....
    .#...
    .##..
    .##..
    .##.#
    #####

    .....
    .#.#.
    ####.
    ####.
    ####.
    #####
    #####

    .....
    #.#..
    #.#..
    #.##.
    #.##.
    #.##.
    #####

    .....
    .....
    .....
    #.#..
    #.#.#
    #.###
    #####

    #####
    #####
    #.###
    #.#.#
    #.#.#
    #.#..
    .....

    .....
    .#...
    .##..
    .###.
    ####.
    #####
    #####

    .....
    #.#..
    #.#..
    ####.
    ####.
    #####
    #####

    .....
    .....
    .....
    #..#.
    ##.#.
    ##.#.
    #####

    #####
    #####
    #####
    ###.#
    .#...
    .....
    .....

    #####
    #####
    .##.#
    .##.#
    ..#.#
    .....
    .....

    .....
    .....
    ..#..
    #.#..
    #.##.
    #####
    #####

    .....
    ...#.
    #..#.
    #..#.
    #.##.
    #####
    #####

    #####
    #####
    #.##.
    #..#.
    #..#.
    #....
    .....

    .....
    ....#
    ....#
    .#.##
    .#.##
    .#.##
    #####

    #####
    ##.##
    ##.#.
    .#...
    .#...
    .#...
    .....

    #####
    .###.
    .#.#.
    .#.#.
    .#.#.
    .....
    .....

    #####
    #.###
    ...##
    ....#
    .....
    .....
    .....

    .....
    .....
    .#...
    .#.#.
    ##.#.
    ####.
    #####

    .....
    .#..#
    ##..#
    ##.##
    #####
    #####
    #####

    #####
    ###.#
    ##..#
    .#..#
    .#..#
    .#..#
    .....

    .....
    #....
    #....
    #...#
    #.#.#
    #.#.#
    #####

    .....
    .....
    .....
    ..#..
    #.#..
    #.##.
    #####

    #####
    #####
    #.###
    #..#.
    #....
    #....
    .....

    #####
    #####
    .####
    .##.#
    .##.#
    .#...
    .....

    .....
    ..#..
    .##..
    ###.#
    #####
    #####
    #####

    .....
    .#..#
    .#..#
    .#..#
    .#.##
    #####
    #####

    .....
    .....
    ..#..
    .##..
    ###.#
    ###.#
    #####

    #####
    .#.##
    .#.##
    .#.##
    ...##
    ....#
    .....

    #####
    ###.#
    .##..
    .##..
    .##..
    .#...
    .....

    #####
    ##.##
    ##.##
    .#.##
    .#.##
    .#..#
    .....
""".trimIndent().split("\n\n").map{it.split("\n")}