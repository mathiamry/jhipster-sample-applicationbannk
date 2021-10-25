package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class FrequentlyAskedQuestionTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(FrequentlyAskedQuestion.class);
        FrequentlyAskedQuestion frequentlyAskedQuestion1 = new FrequentlyAskedQuestion();
        frequentlyAskedQuestion1.setId(1L);
        FrequentlyAskedQuestion frequentlyAskedQuestion2 = new FrequentlyAskedQuestion();
        frequentlyAskedQuestion2.setId(frequentlyAskedQuestion1.getId());
        assertThat(frequentlyAskedQuestion1).isEqualTo(frequentlyAskedQuestion2);
        frequentlyAskedQuestion2.setId(2L);
        assertThat(frequentlyAskedQuestion1).isNotEqualTo(frequentlyAskedQuestion2);
        frequentlyAskedQuestion1.setId(null);
        assertThat(frequentlyAskedQuestion1).isNotEqualTo(frequentlyAskedQuestion2);
    }
}
