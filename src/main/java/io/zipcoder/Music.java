package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection)
    {
        int i =checkforwards(startIndex,selection);
        int f = checkbackwards(startIndex,selection);

        if(i<f)
        {
        return i;
        }
        else
        {
            return f;
        }

    }

    public int checkforwards(int startIndex, String selection)
    {
        int i =startIndex;
        int jumps =0;
        boolean found = false;
        while(found == false) {

            if (playList[i].equals(selection))
            {
                found = true;
            }
            else if (i == playList.length - 1)
            {
                jumps++;
                i = 0;
            } else
            {
                jumps++;
                i++;
            }

        }
          return jumps;
        }



    public int checkbackwards(int startIndex, String selection)
    {
        int i =startIndex;
        int jumps =0;
        boolean found = false;
        while(found == false) {

            if (playList[i].equals(selection))
            {
                found = true;
            }
            else if (i == 0)
            {
                jumps++;
                i = playList.length-1;
            } else
            {
                jumps++;
                i--;
            }

        }
        return jumps;
    }
    }















