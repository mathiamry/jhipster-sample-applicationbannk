package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class ActivityAreaTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ActivityArea.class);
        ActivityArea activityArea1 = new ActivityArea();
        activityArea1.setId(1L);
        ActivityArea activityArea2 = new ActivityArea();
        activityArea2.setId(activityArea1.getId());
        assertThat(activityArea1).isEqualTo(activityArea2);
        activityArea2.setId(2L);
        assertThat(activityArea1).isNotEqualTo(activityArea2);
        activityArea1.setId(null);
        assertThat(activityArea1).isNotEqualTo(activityArea2);
    }
}
