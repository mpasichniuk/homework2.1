
public class Race implements Hurdles {
    private int length;

        public Race(int length) {
            this.length = length;
        }

        public String check(Participant participant) {
            participant.runStr();
            participant.setSuccess(participant.getMaxLength() >= length);
            if (participant.getSuccess()) {
                return "Игрок " + participant.getName() + " проходит дистанцию длиной: " + length + " км";
            } else {
                return "Игрок " + participant.getName() + " не проходит дистанцию длиной: " + length + " км";
            }
        }
    }

