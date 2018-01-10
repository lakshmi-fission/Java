package hackerearth;

public class FeedbackItem {
        private String questionId;
    
        private String questionBody;

        public String getQuestionId() {
            return questionId;
        }

        public void setQuestionId(String questionId) {
            this.questionId = questionId;
        }

        public String getQuestionBody() {
            return questionBody;
        }

        public void setQuestionBody(String questionBody) {
            this.questionBody = questionBody;
        }

        public String getAnswerText() {
            return answerText;
        }

        public void setAnswerText(String answerText) {
            this.answerText = answerText;
        }
        private String answerText;

    }

