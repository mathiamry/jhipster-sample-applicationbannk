package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class SmeRepresentativeTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(SmeRepresentative.class);
        SmeRepresentative smeRepresentative1 = new SmeRepresentative();
        smeRepresentative1.setId(1L);
        SmeRepresentative smeRepresentative2 = new SmeRepresentative();
        smeRepresentative2.setId(smeRepresentative1.getId());
        assertThat(smeRepresentative1).isEqualTo(smeRepresentative2);
        smeRepresentative2.setId(2L);
        assertThat(smeRepresentative1).isNotEqualTo(smeRepresentative2);
        smeRepresentative1.setId(null);
        assertThat(smeRepresentative1).isNotEqualTo(smeRepresentative2);
    }
}
