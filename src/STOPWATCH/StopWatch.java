package STOPWATCH;

import java.util.Date;
public class StopWatch {
    private long startTime;
    private long endTime;
//    private Date date1;
//    private Date date2;

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    StopWatch(){
        this.startTime=0;
        this.endTime=0;
    }

    private long currentTime(){
        Date date = new Date();
        return date.getTime();
    }

    public void start(){ startTime=currentTime(); }

    public void stop(){
        endTime=currentTime();
    }

    public long getElapsedTime(){
        return endTime-startTime;
    }
}
