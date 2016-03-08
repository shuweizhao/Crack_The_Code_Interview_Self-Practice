/**
 * Created by shuweizhao on 2/29/16.
 */
public class CTCI_5_8_DrawSingleLine {
    public void drawSingleLine(byte[] screen, int width, int x1, int x2, int y) {
        int startOffSet = x1 % 8;
        int firstFullByte = x1 / 8;

        if (startOffSet != 0) {
            firstFullByte++;
        }

        int endOffSet = x2 % 8;
        int lastFullByte = x2 / 8;

        if (endOffSet != 7) {
            lastFullByte--;
        }

        for (int b = firstFullByte; b <= lastFullByte; b++) {
            screen[(width / 8) * y + b] = (byte)0xFF;
        }

        byte startMask = (byte)(0xFF >> startOffSet);
        byte endMask = (byte)~(0xFF >> (endOffSet + 1));

        if (x1 / 8 == x2 / 8) {
            byte mask = (byte)(startMask & endMask);
            screen[(width / 8) * y + x1 / 8] |= mask;
        }
        else {
            if (startOffSet != 0) {
                int byteNumber = (width / 8) * y + firstFullByte - 1;
                screen[byteNumber] |= startMask;
            }

            if (endOffSet != 7) {
                int byteNumber = (width / 8) * y + lastFullByte + 1;
                screen[byteNumber] |= endMask;
            }
        }
    }
}
