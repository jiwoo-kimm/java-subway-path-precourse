package subway.constant;

import subway.domain.Line;
import subway.domain.Station;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitialData {

    public static final List<Station> stations = new ArrayList<>(Arrays.asList(
            new Station("교대역"),
            new Station("강남역"),
            new Station("역삼역"),
            new Station("남부터미널역"),
            new Station("양재역"),
            new Station("양재시민의숲역"),
            new Station("매봉역")
    ));

    public static final List<Line> lines = new ArrayList<>(Arrays.asList(
            new Line("2호선"),
            new Line("3호선"),
            new Line("신분당선")
    ));
}


