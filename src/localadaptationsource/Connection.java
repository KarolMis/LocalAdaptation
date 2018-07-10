package localadaptationsource;

import java.beans.PropertyVetoException;
import java.io.IOException;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400FTP;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.CommandCall;
import com.ibm.as400.access.ErrorCompletingRequestException;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connection {

    public Connection(String machine, String login, String pass) throws AS400SecurityException {

        AS400 system = new AS400(machine, login, pass);
        AS400FTP ftp = new AS400FTP(system);
        Component frame = null;
        CommandCall command = new CommandCall(system);
        try {
            
            if (command.run("CHKOBJ OBJ(QSYS/LADPTTOOL) OBJTYPE(*LIB)")) {
                // BIBLIOTEKA ISTNIEJE
                // TRZEBA JA USUNAC
                try {
                    command.run("DLTLIB LIB(LADPTTOOL)");
                } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {

                    JOptionPane.showMessageDialog(frame, "Error with DLTLIB");
                    e.printStackTrace();
                }
                System.out.println("Skasowano bilbioteke");
                // NIE ISTNIEJE WIEC TWORZYMY
                try {
                    command.run("CRTLIB LIB(LADPTTOOL)");
                    System.out.println("utworzono bilbioteke");
                } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                    JOptionPane.showMessageDialog(frame, "Error with CRTLIB LADPTTOOL");
                    e.printStackTrace();
                }
                // DODAJEMY JA NA LIBLISTE
                try {
                    command.run("ADDLIBLE LADPTTOOL");
                } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {

                    e.printStackTrace();
                }
                //DODAJEMY SOURCE FILE 
                try {
                    command.run("CRTSRCPF FILE(LADPTTOOL/LADPTSRC)");
                } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                    e.printStackTrace();
                }

            } else {
                // NIE ISTNIEJE WIEC TWORZYMY
                try {
                    command.run("CRTLIB LIB(LADPTTOOL)");
                    System.out.println("utworzono bilbioteke");
                } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {
                    JOptionPane.showMessageDialog(frame, "Error with CRTLIB LADPTTOOL");
                    e.printStackTrace();
                }
                // DODAJEMY JA NA LIBLISTE
                try {
                    command.run("ADDLIBLE LADPTTOOL");
                } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {

                    e.printStackTrace();
                }
                //DODAJEMY SOURCE FILE 
                try {
                    command.run("CRTSRCPF FILE(LADPTTOOL/LADPTSRC)");
                } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {

                    e.printStackTrace();
                }
            }
            //TE KOMENDY JUZ IDA POZNIEJ SEKWENCYJNIE - Z INNA CZESTOTLIWOSCIA NIZ POPRZEDNIE
            //ZACIAGAMY SOURCY FTPEM NA MASZYNE
            //ftp.get("/QSYS.LIB/A232887.LIB/QCLSRC.FILE/LSRC.MBR", "QCLSRC.FILE");
            //ftp.put("QCLSRC.FILE", "/QSYS.LIB/LADPTTOOL.LIB/QCLSRC.FILE");
            ftp.put("INPUT/LPROJ.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/LPROJ.MBR");
            ftp.put("INPUT/LSRC.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/LSRC.MBR");
            ftp.put("INPUT/LOBJ.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/LOBJ.MBR");
            ftp.put("INPUT/LREF.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/LREF.MBR");
            ftp.put("INPUT/LREFSQL.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/LREFSQL.MBR");
            ftp.put("INPUT/LSRCSQL.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/LSRCSQL.MBR");
            ftp.put("INPUT/LOBJSQL.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/LOBJSQL.MBR");
            ftp.put("INPUT/CRTRESTAB.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/CRTRESTAB.MBR");
            ftp.put("INPUT/GETATRUDF.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/GETATRUDF.MBR");
            ftp.put("INPUT/GETDETUDF.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/GETDETUDF.MBR");
            ftp.put("INPUT/LSRCSETTYP.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/LSRCSETTYP.MBR");
            ftp.put("INPUT/LREFSQLTYP.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/LREFSQLTYP.MBR");
            ftp.put("INPUT/LCMP.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/LCMP.MBR");
            ftp.put("INPUT/GETDISCOBJ.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/GETDISCOBJ.MBR");
            ftp.put("INPUT/GETRESULTX.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/GETRESULTX.MBR");
            ftp.put("INPUT/GETRESULT3.CLLE", "/QSYS.LIB/LADPTTOOL.LIB/LADPTSRC.FILE/GETRESULT3.MBR");
            System.out.println(" Przeslanie plikow! ");
            //PO WRZUCENIU ZRODEL PRZEZ FTPA
            //NADANIE ATRYBUTOW MEMBROM
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(LPROJ) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(LSRC) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(LOBJ) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(LREF) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(LSRCSQL) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(LOBJSQL) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(LREFSQL) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(LCMP) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(LREFSQLTYP) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(CRTRESTAB) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(LSRCSETTYP) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(GETATRUDF) SRCTYPE(SQL)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(GETDETUDF) SRCTYPE(SQL)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(GETDISCOBJ) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(GETRESULTX) SRCTYPE(CLLE)");
            command.run("CHGPFM FILE(LADPTTOOL/LADPTSRC) MBR(GETRESULT3) SRCTYPE(CLLE)");
            System.out.println("Nadanie atrybutów! ");
//			//KOMPILACJA
//			
            command.run("CRTBNDCL   PGM(LADPTTOOL/LPROJ) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(LPROJ) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/LSRC) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(LSRC) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/LSRCSQL) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(LSRCSQL) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/LOBJ) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(LOBJ) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/LOBJSQL) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(LOBJSQL) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/LCMP) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(LCMP) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/LREF) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(LREF) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/LREFSQL) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(LREFSQL) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/LREFSQLTYP) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(LREFSQLTYP) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/CRTRESTAB) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(CRTRESTAB) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/LSRCSETTYP) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(LSRCSETTYP) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/GETDISCOBJ) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(GETDISCOBJ) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/GETRESULTX) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(GETRESULTX) TGTRLS(*CURRENT)");
            command.run("CRTBNDCL   PGM(LADPTTOOL/GETRESULT3) SRCFILE(LADPTTOOL/LADPTSRC) SRCMBR(GETRESULT3) TGTRLS(*CURRENT)");

            System.out.println("Kompilacja! ");

        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {

            JOptionPane.showMessageDialog(frame, "Error with FileInputStream ");
            e.printStackTrace();
        }

    }
     public Connection(String machine, String login, String pass, String a) throws AS400SecurityException {
          AS400 system = new AS400(machine, login, pass);
            AS400FTP ftp = new AS400FTP(system);
         try {
           ftp.put("Outfiles//LRES_VF03.TXT", "/QSYS.LIB/LADPTTOOL.LIB/LRES3.FILE/LRES3.MBR");
              } catch (IOException ex) {
                  Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
              }
}
       
}
