Requirements:
- Java Runtime 1.8.0 or higer version
- Account with access to all markets:
VIPS_DK, VIPS_NO, VIPS_SE, VIPS_FI, VIPS_AT, VIPS_CH, VIPS_DE 
VIPS_IT, VIPS_GB, VIPS_BE, VIPS_NL, VIPS_ES, VIPS_FR, VIPS_BG 
VIPS_CZ, VIPS_EE, VIPS_HR, VIPS_HU, VIPS_LT, VIPS_LV, VIPS_PL 
VIPS_RO, VIPS_SI, VIPS_SK, VIPS_PT, VIPS_UA, VIPS_BA, VIPS_RS
VIPS_MK, VIPS_RU, VIPS_MA, VIPS_ZA, VIPS_TR, VIPS_TR_ASC

Prefered one password for each market.
 


1. Run .jar which is located in program folder
2. Use the 'Load data' button to load configuration file with all markets and profiles for each of them.
3. In the left label should appear the list of available markets. 
	To choose one market select one and press button "Select Market".
	To choose all available markets press button "Select all markets".
   Selected Markets should be add to the label on the right side.
4. There is an option to correct selected markets. To do it select this market (on the right table)  which one should be removed, 
   then press button "Remove market"
   To remove all markets press button "Remove All"
5. There is option to correct and improve configuration files.
   Press button "Open configuration file". There should be opened file chooser window with path to folder with these files.
	"marketlist1" - it is file which contains markets, which machines(prod and test) and profiles for this.
	"library1" - it contains list of libraries which are use as parameters for programs. There are many kinds of programs:
	
 - LSRC - local source
 - LOBJ - local objects
 - LCMP - local compiled 
 - LREF - local referance
 

	

6. In the window with project you can specify from which project do you want to get result.

7. There is option to choose an environment TEST or PROD.
	The result of this aplication will be in folder "Outfiles".
	This files with prefix "prod..."  comes from production.
	
	
8. There is additional option to marge files with "type"

9. After selecting markets and choose all option, press button "Start program" 
	While the red text is presented "Wait a minute.. " the program is working and it shouldn't be stopped.

10. If this text disappear, result should be in folder "Outfiles". 
	LRES_VF00 / LRES_VF03 - local objects for selected project on machin vf00 or VF03
	VIPS_FR_RESULTX - all local objects for selected markets 

