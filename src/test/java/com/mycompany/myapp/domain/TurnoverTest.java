package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class TurnoverTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Turnover.class);
        Turnover turnover1 = new Turnover();
        turnover1.setId(1L);
        Turnover turnover2 = new Turnover();
        turnover2.setId(turnover1.getId());
        assertThat(turnover1).isEqualTo(turnover2);
        turnover2.setId(2L);
        assertThat(turnover1).isNotEqualTo(turnover2);
        turnover1.setId(null);
        assertThat(turnover1).isNotEqualTo(turnover2);
    }
}
