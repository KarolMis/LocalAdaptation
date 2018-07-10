package localadaptationsource;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.ObjectDoesNotExistException;
import com.ibm.as400.access.ProgramCall;
import com.ibm.as400.access.ProgramParameter;
import com.ibm.as400.access.AS400Text;
import com.ibm.as400.access.CommandCall;
import java.awt.Component;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProgCall {

    String machine = "";
    String library = "";
    String file = "";
    String login = "";
    String pass = "";
    String path = "";
    String cc = "";

    public ProgCall() {

    }

    public void ProgCallCrtResTab(String machine, String cc, String login, String pass, String path) {

        System.out.println("Selected Connection CRTRESTAB " + machine + " CC:  " + cc + " login " + login + "  plik " + path + " haslo " + pass);

        ProgramParameter[] pgmp = new ProgramParameter[1];
        AS400Text nametext = new AS400Text(4);
        pgmp[0] = new ProgramParameter(nametext.toBytes(cc));

        AS400 system = new AS400(machine, login, pass);

        ProgramCall program = new ProgramCall(system, path, pgmp);

        try {
            if (program.run() != true) {
                System.out.println("Program CRTRESTAB does not wotk");
            } else {
                System.out.println("Program CRTRESTAB is working");

            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | ObjectDoesNotExistException e) {

            e.printStackTrace();
        }
    }

    public void ProgCallLSrc(String machine, String library, String file, String cc, String login, String pass, String path) {

        System.out.println("Selected Connection LSRC.  CC:  " + cc + " library: " + library + " file :" + file);

        ProgramParameter[] pgmp = new ProgramParameter[3];
        AS400Text nametext = new AS400Text(10);

        pgmp[0] = new ProgramParameter(nametext.toBytes(library));

        nametext = new AS400Text(10);
        pgmp[1] = new ProgramParameter(nametext.toBytes(file));

        nametext = new AS400Text(4);
        pgmp[2] = new ProgramParameter(nametext.toBytes(cc));

        AS400 system = new AS400(machine, login, pass);

        ProgramCall program = new ProgramCall(system, path, pgmp);

        try {
            if (program.run() != true) {
                System.out.println("Program LSRC does not work");
            } else {
                System.out.println("Program LSRC is working");

            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | ObjectDoesNotExistException e) {

            e.printStackTrace();
        }
    }
    
     // caLL PROGRAM 45

    public void ProgCallLProj(String machine, String proj, String cc, String login, String pass, String path) {

        System.out.println("Selected Connection  LPROJ.  CC: " + cc + " Projekt : " + proj);

        ProgramParameter[] pgmp = new ProgramParameter[2];
        AS400Text nametext = new AS400Text(4);
        pgmp[0] = new ProgramParameter(nametext.toBytes(proj));

        nametext = new AS400Text(4);
        pgmp[1] = new ProgramParameter(nametext.toBytes(cc));
        AS400 system = new AS400(machine, login, pass);
        
        //to connect to vf00
         Component frame = null;
        CommandCall command = new CommandCall(system);
        try {
                    command.run("ADDSVRAUTE USRPRF(*CURRENT) SERVER(VF00) USRID("+login.substring(0,7)+") PASSWORD("+pass+")");
                } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {

                    JOptionPane.showMessageDialog(frame, "Error with ADDSVRAUTE");
                    e.printStackTrace();
                }
        
        
        ProgramCall program = new ProgramCall(system, path, pgmp);

        try {
            if (program.run() != true) {
                System.out.println("Program LProj does not wotk");
            } else {
                System.out.println("Program LProj is working");
            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | ObjectDoesNotExistException e) {

            e.printStackTrace();
        }
         try {
                    command.run("RMVSVRAUTE USRPRF(*CURRENT) SERVER(VF00)");
                } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | PropertyVetoException e) {

                    JOptionPane.showMessageDialog(frame, "Error with RMVSVRAUTE");
                    e.printStackTrace();
                }
    }

    // caLL PROGRAM 3

    public void ProgCallLObj(String machine, String library, String cc, String login, String pass, String path) {

        System.out.println("Selected Connection  LOBJ.  CC: " + cc + " LIBRARY : " + library);

        ProgramParameter[] pgmp = new ProgramParameter[2];
        AS400Text nametext = new AS400Text(10);
        pgmp[0] = new ProgramParameter(nametext.toBytes(library));

        nametext = new AS400Text(4);
        pgmp[1] = new ProgramParameter(nametext.toBytes(cc));
        AS400 system = new AS400(machine, login, pass);

        ProgramCall program = new ProgramCall(system, path, pgmp);

        try {
            if (program.run() != true) {
                System.out.println("Program LOBJ does not wotk");
            } else {
                System.out.println("Program LOBJ is working");
            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | ObjectDoesNotExistException e) {

            e.printStackTrace();
        }
    }

// call program 4
    //drugi parametr library do zmiany
    public void ProgCallLcmp(String machine, String library, String file, String cc, String login, String pass, String path) {

        System.out.println("Selected Connection  LCPM.  CC: " + cc + " LIBRARY : " + library + " file: " + file);

        ProgramParameter[] pgmp = new ProgramParameter[3];
        AS400Text nametext = new AS400Text(10);
        pgmp[0] = new ProgramParameter(nametext.toBytes(library));
        nametext = new AS400Text(10);
        pgmp[1] = new ProgramParameter(nametext.toBytes(file));
        nametext = new AS400Text(8);
        pgmp[2] = new ProgramParameter(nametext.toBytes(cc));
        AS400 system = new AS400(machine, login, pass);

        ProgramCall program = new ProgramCall(system, path, pgmp);

        try {
            if (program.run() != true) {
                System.out.println("Program LCMP does not wotk");
            } else {
                System.out.println("Program LCMP is working");
            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | ObjectDoesNotExistException e) {

            e.printStackTrace();
        }
    }

// caLL PROGRAM 5
    public void ProgCallLRef(String machine, String library, String cc, String login, String pass, String path) {

        System.out.println("Selected Connection  LREF.  CC: " + cc + " LIBRARY : " + library);

        ProgramParameter[] pgmp = new ProgramParameter[2];
        AS400Text nametext = new AS400Text(10);
        pgmp[0] = new ProgramParameter(nametext.toBytes(library));

        nametext = new AS400Text(4);
        pgmp[1] = new ProgramParameter(nametext.toBytes(cc));
        AS400 system = new AS400(machine, login, pass);

        ProgramCall program = new ProgramCall(system, path, pgmp);

        try {
            if (program.run() != true) {
                System.out.println("Program LREF does not work");
            } else {
                System.out.println("Program LREF is working");
            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | ObjectDoesNotExistException e) {

            e.printStackTrace();
        }
    }

// CALL PROGRAM 6    
    public void ProgCallLRefSql(String machine, String cc, String login, String pass, String path) {

        System.out.println("Selected Connection LREFSQL.    plik: " + path);

        ProgramParameter[] pgmp = new ProgramParameter[1];
        AS400Text nametext = new AS400Text(4);
        pgmp[0] = new ProgramParameter(nametext.toBytes(cc));
        AS400 system = new AS400(machine, login, pass);

        ProgramCall program = new ProgramCall(system, path, pgmp);

        try {
            if (program.run() != true) {
                System.out.println("Program LREFSQL does not wotk");
            } else {
                System.out.println("Program LREFSQL is working");

            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | ObjectDoesNotExistException e) {

            e.printStackTrace();
        }
    }

    public void ProgCallLRefSqlTyp(String machine, String cc, String login, String pass, String path) {

        System.out.println("Selected Connection LREFSQLTYP    plik: " + path);

        ProgramParameter[] pgmp = new ProgramParameter[1];
        AS400 system = new AS400(machine, login, pass);
        AS400Text nametext = new AS400Text(4);
        pgmp[0] = new ProgramParameter(nametext.toBytes(cc));
        ProgramCall program = new ProgramCall(system, path, pgmp);

        try {
            if (program.run() != true) {
                System.out.println("Program LREFSQLTYP does not wotk");
            } else {
                System.out.println("Program LREFSQLTYP is working");

            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | ObjectDoesNotExistException e) {

            e.printStackTrace();
        }
    }

    public void ProgCallGetDiscObj(String machine, String cc, String login, String pass, String path) {

        System.out.println("Selected Connection GETDISCOBJ.   plik:  " + path);

        ProgramParameter[] pgmp = new ProgramParameter[1];
        AS400Text nametext = new AS400Text(4);
        pgmp[0] = new ProgramParameter(nametext.toBytes(cc));
        AS400 system = new AS400(machine, login, pass);

        ProgramCall program = new ProgramCall(system, path, pgmp);

        try {
            if (program.run() != true) {
                System.out.println("Program GETDISCOBJ does not wotk");
            } else {
                System.out.println("Program GETDISCOBJ is working");

            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | ObjectDoesNotExistException e) {

            e.printStackTrace();
        }
    }

    public void ProgCallGetResultX(String machine, String cc, String login, String pass, String path) throws AS400SecurityException, IOException {

        System.out.println("Selected Connection GETRESULTX.   plik " + path + "country code " + cc);

        ProgramParameter[] pgmp = new ProgramParameter[1];

        AS400 system = new AS400(machine, login, pass);
        AS400Text nametext = new AS400Text(4);
        pgmp[0] = new ProgramParameter(nametext.toBytes(cc));

        ProgramCall program = new ProgramCall(system, path, pgmp);
        CommandCall command = new CommandCall(system);
        try {
            command.run("ADDLIBLE LADPTTOOL");
        } catch (ErrorCompletingRequestException | InterruptedException | PropertyVetoException ex) {
            Logger.getLogger(ProgCall.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            command.run("ADDLIBLE LADPT_" + cc);
        } catch (ErrorCompletingRequestException | InterruptedException | PropertyVetoException ex) {
            Logger.getLogger(ProgCall.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (program.run() != true) {
                System.out.println("Program GETRESULTX does not work");
            } else {
                System.out.println("Program GETRESULTX is working");

            }
        } catch (AS400SecurityException | ErrorCompletingRequestException | IOException | InterruptedException | ObjectDoesNotExistException e) {

            e.printStackTrace();
        }
    }

}
