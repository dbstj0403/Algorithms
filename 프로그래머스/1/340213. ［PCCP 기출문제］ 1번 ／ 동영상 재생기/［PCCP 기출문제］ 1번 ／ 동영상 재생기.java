class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int curTime = timeToSec(pos);
        int videoTime = timeToSec(video_len);
        int opStart = timeToSec(op_start);
        int opEnd = timeToSec(op_end);

        for (String command : commands) {
            if (curTime >= opStart && curTime <= opEnd) {
                curTime = opEnd;
            }

            if (command.equals("prev")) {
                curTime = Math.max(0, curTime - 10);
            } else if (command.equals("next")) {
                curTime = Math.min(videoTime, curTime + 10);
            }

            if (curTime >= opStart && curTime <= opEnd) {
                curTime = opEnd;
            }
        }

        return secToTime(curTime);
    }

    private int timeToSec(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    private String secToTime(int sec) {
        int minPart = sec / 60;
        int secPart = sec % 60;
        return String.format("%02d:%02d", minPart, secPart);
    }
}
