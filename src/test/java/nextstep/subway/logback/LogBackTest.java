package nextstep.subway.logback;

import nextstep.subway.station.domain.Station;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("LogBack 테스트")
public class LogBackTest {
    @Test
    void name() {
        Station station = new Station("강남역");
    }
}
