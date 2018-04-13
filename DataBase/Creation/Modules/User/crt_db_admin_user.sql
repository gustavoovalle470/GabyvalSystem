/* *****************************************************************************************************************************************************
 * *****************************************************************************************************************************************************
 * *****************************************************************************************************************************************************
 * *******************************                                                                              ****************************************
 * *******************************	********** ********** ******    **      ** **      ** ********** **         ****************************************
 * *******************************	********** **********  ******   **      ** **      ** ********** **         ****************************************
 * *******************************	**         **      **  **  **   **      ** **      ** **      ** **         ****************************************
 * *******************************	**         **      **  **  **   **      ** **      ** **      ** **         ****************************************
 * *******************************  **         **      **  ******    **    **  **      ** **      ** **         ****************************************
 * *******************************  **    **** **********  *******    **  **   **      ** ********** **         ****************************************
 * *******************************  **    **** **********  ********    ****    **      ** ********** **         ****************************************
 * *******************************  **      ** **      **  **    **     **     **      ** **      ** **         ****************************************
 * *******************************  **      ** **      **  **    **     **      **    **  **      ** **         ****************************************
 * *******************************  **      ** **      **  **   **      **       **  **   **      ** **         ****************************************
 * *******************************  ********** **      **  **  **       **        ****    **      ** ********** ****************************************
 * *******************************  ********** **      ** ******        **         **     **      ** ********** ****************************************
 * *****************************************************************************************************************************************************
 * *****************************************************************************************************************************************************
 * *****************************************************************************************************************************************************
 *_____Nombre del Archivo___________|_____VERSION_______|_________________AUTOR_________________|____________Fecha de creacion/modificacion____________|
 *	   ins_db_admin_user			|		1.0			|     GUSTAVO ADOLFO OVALLE QUINTERO	|		                 26/03/2017                    |
 *******************************************************************************************************************************************************/

/* *********************************************************************
 * Esquema: 	GABYVAL
 * Tabla: 		ad_users
 * Descripcion: Tabla que contendra los usuarios registrados del sistema
 * *********************************************************************/ 
CREATE TABLE GABYVAL.ad_users
(	gb_username			VARCHAR(20) NOT NULL,
	gb_password			VARCHAR(60) NOT NULL,
	gb_login_status		INTEGER		NOT NULL,
	gb_oprative_status	INTEGER		NOT NULL,
	gb_last_pwd_xge_dt	TIMESTAMP   NOT NULL,
	gb_last_loggin_dt	TIMESTAMP   NOT NULL,
	gb_last_xge_dt		TIMESTAMP   NOT NULL,
	gb_last_user_xge	VARCHAR(20)	NOT NULL,
	gb_user_system		INTEGER		NOT NULL,
	create_dt			DATE		NOT NULL,
	rowversion			INTEGER		NOT NULL
);

/* ***********************************************************************************************
 * Esquema: 			 GABYVAL
 * Tabla: 				 ad_users
 * Columna: 			 gb_username
 * Adicion/Modificacion: Modificacion
 * Descripcion: 		 Se modifica la columna para establecerla como clave primaria de la tabla.
 * ***********************************************************************************************/
ALTER TABLE GABYVAL.ad_users ADD CONSTRAINT PK_User PRIMARY KEY (gb_username);

/* *****************************************************************
 * Esquema: 		 GABYVAL
 * Tabla: 			 gb_username
 * Cantidad inserts: 1
 * Descripcion: 	 Adicion del usuario administrador del sistema.
 * *****************************************************************/
INSERT INTO GABYVAL.ad_users VALUES('ADMINISTRATOR', 'ADMINISTRATOR', 0, 5, TO_TIMESTAMP(SYSDATE,'DD/MM/YYYY HH:MI:SS'), TO_TIMESTAMP(SYSDATE,'DD/MM/YYYY HH:MI:SS'), TO_TIMESTAMP(SYSDATE,'DD/MM/YYYY HH:MI:SS'),'SYSTEM', 0, TO_TIMESTAMP(SYSDATE,'DD/MM/YYYY HH:MI:SS'), 0);

COMMIT;