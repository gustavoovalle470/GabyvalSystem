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
 * Tabla: 		ad_user_personal_data
 * Descripcion: Tabla que contendra los usuarios registrados del sistema
 * *********************************************************************/ 
CREATE TABLE GABYVAL.ad_user_personal_data
(	gb_username			VARCHAR(20)  NOT NULL,
    gb_staff_name		VARCHAR(200) NOT NULL,
    gb_staff_surname	VARCHAR(200) NOT NULL,
    gb_id_type			INTEGER 	 NOT NULL,
    gb_id_number		VARCHAR(20)  NOT NULL,
	gb_photo			BLOB		 NULL,
    gb_phone_number		VARCHAR(20),
    gb_mobile_number	VARCHAR(20) ,
    gb_email			VARCHAR(200),
    gb_birthdate		DATE,
    gb_gender			INTEGER,
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
ALTER TABLE GABYVAL.ad_user_personal_data ADD CONSTRAINT PK_User_personal_data PRIMARY KEY (gb_username);

/* *****************************************************************
 * Esquema: 		 GABYVAL
 * Tabla: 			 gb_username
 * Cantidad inserts: 1
 * Descripcion: 	 Adicion del usuario administrador del sistema.
 * *****************************************************************/

COMMIT;