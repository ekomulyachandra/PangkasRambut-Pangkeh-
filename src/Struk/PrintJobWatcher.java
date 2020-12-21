/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Struk;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocPrintJob;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

/**
 *
 * @author acer
 */
public class PrintJobWatcher {
    private boolean done=false;
    public PrintJobWatcher(DocPrintJob job){
        job.addPrintJobListener(new PrintJobAdapter() {
            public void printJobCanceled(PrintJobEvent pje){
                allDone();
            }
            public void printJobComplete(PrintJobEvent pje){
                allDone();
            }
            public void printJobFailed(PrintJobEvent pje){
                allDone();
            }
            public void printJobNoMoreEvent(PrintJobEvent pje){
                allDone();
            }
            private void allDone(){
                synchronized (PrintJobWatcher.this){
                    done=true;
                }
            }
});
        
    }
     public synchronized void waitForDone(){
           
                try {
                    System.out.println("Cek Status ");
                    while(!done){
                    wait();
                    }
                    System.out.println("Print Selesai");
                } catch (InterruptedException ex) {
                    Logger.getLogger(PrintJobWatcher.class.getName()).log(Level.SEVERE, null, ex);
                }
            
     }
}
