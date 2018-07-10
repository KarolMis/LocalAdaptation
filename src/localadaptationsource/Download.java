package localadaptationsource;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400FTP;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.CommandCall;
import java.io.IOException;

public class Download {

    public Download(String machine, String cc, String name, String login, String pass) throws AS400SecurityException, IOException {
        AS400 system = new AS400(machine, login, pass);
        AS400FTP ftp = new AS400FTP(system);
        CommandCall command = new CommandCall(system);

        try {
         //   ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/COREOBJ.FILE/COREOBJ.MBR", "Outfiles/" + name + "_COREOBJ.TXT");
        //    ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/LCMPOUTF.FILE/LCMPOUTF.MBR", "Outfiles/" + name + "_LCMPOUTF.TXT");
      //      ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/LOBJOUTF.FILE/LOBJOUTF.MBR", "Outfiles/" + name + "_LOBJOUTF.TXT");
           /* try {
                if (command.run("CHKOBJ OBJ(/QSYS.LIB/LADPT_" + cc + ".LIB/LOBJOUTF.FILE/LOBJOUTF.MBR) OBJTYPE(*FILE) ")) {
                    ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/LOBJOUTF.FILE/LOBJOUTF.MBR", "Outfiles/" + name + "_LOBJOUTF.TXT");
                }
            } catch (ErrorCompletingRequestException | InterruptedException | PropertyVetoException ex) {
                Logger.getLogger(ProgCall.class.getName()).log(Level.SEVERE, null, ex);
            }*/
         //   ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/LREFOUTF.FILE/LREFOUTF.MBR", "Outfiles/" + name + "_LREFOUTF.TXT");
        /*    try {
                if (command.run("CHKOBJ OBJ(/QSYS.LIB/LADPT_" + cc + ".LIB/LSRCOUTF.FILE/LSRCOUTF.MBR) OBJTYPE(*FILE) ")) {
                    ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/LSRCOUTF.FILE/LSRCOUTF.MBR", "Outfiles/" + name + "_LSRCOUTF.TXT");
                }
            } catch (ErrorCompletingRequestException | InterruptedException | PropertyVetoException ex) {
                Logger.getLogger(ProgCall.class.getName()).log(Level.SEVERE, null, ex);
            }*/
         //   ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/LSRCOUTF.FILE/LSRCOUTF.MBR", "Outfiles/" + name + "_LSRCOUTF.TXT");
          //  ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/DISCOBJ.FILE/DISCOBJ.MBR", "Outfiles/" + name + "_DISCOBJ.TXT");
           // ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/MATCHPGM.FILE/MATCHPGM.MBR", "Outfiles/" + name + "_MATCHPGM.TXT");
           // ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/RESTABLE.FILE", "Outfiles/" + name + "_RESTABLE.TXT");
            ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/RESULTX.FILE/RESULTX.MBR", "Outfiles/" + name + "_RESULTX.TXT");
            ftp.get("/QSYS.LIB/LADPTTOOL.LIB/LRES.FILE/LRES.MBR", "Outfiles/LRES_VF00.TXT");
         //    ftp.get("/QSYS.LIB/A232887.LIB/QCLSRC.FILE/LPROJ.MBR", "INPUT/LPROJ.CLLE");
 /*            try {
                if (command.run("CHKOBJ OBJ(/QSYS.LIB/LADPTTOOL.LIB/LRES.FILE/LRES.MBR) OBJTYPE(*FILE) ")) {
                     ftp.get("/QSYS.LIB/LADPTTOOL.LIB/LRES.FILE/LRES.MBR", "Outfiles/LRES.TXT");
                }
            } catch (ErrorCompletingRequestException | InterruptedException | PropertyVetoException ex) {
                Logger.getLogger(ProgCall.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
            System.out.println(" Downloaded ");
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public Download(String machine, String cc, String name, String login, String pass, int a) throws AS400SecurityException {
        AS400 system = new AS400(machine, login, pass);
        AS400FTP ftp = new AS400FTP(system);

        try {
        /*    ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/DISCOBJ.FILE/DISCOBJ.MBR", "Outfiles/" + "PROD_" + name + "_DISCOBJ.TXT");
            ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/LOBJOUTF.FILE/LOBJOUTF.MBR", "Outfiles/" + "PROD_" + name + "_LOBJOUTF.TXT");
            ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/LREFOUTF.FILE/LREFOUTF.MBR", "Outfiles/" + "PROD_" + name + "_LREFOUTF.TXT");
            ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/LCMPOUTF.FILE/LCMPOUTF.MBR", "Outfiles/" + "PROD_" + name + "_LCMPOUTF.TXT");
            ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/MATCHPGM.FILE/MATCHPGM.MBR", "Outfiles/" + "PROD_" + name + "_MATCHPGM.TXT");
            ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/RESTABLE.FILE/RESTABLE.MBR", "Outfiles/" + "PROD_" + name + "_RESTABLE.TXT");*/
            ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/RESULTX.FILE/RESULTX.MBR", "Outfiles/" + "PROD_" + name + "_RESULTX.TXT");
            ftp.get("/QSYS.LIB/LADPTTOOL.LIB/LRES.FILE/LRES.MBR", "Outfiles/PROD_LRES.TXT");
            System.out.println(" Downloaded Production ");
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
    
        public Download(String machine, String cc, String name, String login, String pass, String a) throws AS400SecurityException {
        AS400 system = new AS400(machine, login, pass);
        AS400FTP ftp = new AS400FTP(system);

        try {
            ftp.get("/QSYS.LIB/LADPT_" + cc + ".LIB/RESULT3.FILE/RESULT3.MBR", "Outfiles/"+ name + "_RESULT3.TXT");
            ftp.get("/QSYS.LIB/LADPTTOOL.LIB/LRES3.FILE/LRES3.MBR", "Outfiles/LRES_VF03.TXT");
            System.out.println(" Downloaded LRES3 ");
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
