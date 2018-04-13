/* *****************************************************************************************************************************************************
 * *****************************************************************************************************************************************************
 * *****************************************************************************************************************************************************
 * *******************************                                                                              ****************************************
 * *******************************  ********** ********** ******    **      ** **      ** ********** **         ****************************************
 * *******************************  ********** **********  ******   **      ** **      ** ********** **         ****************************************
 * *******************************  **         **      **  **  **   **      ** **      ** **      ** **         ****************************************
 * *******************************  **         **      **  **  **   **      ** **      ** **      ** **         ****************************************
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
 * |---------------------------------------------------------------------------------------------------------------------------------------------------|
 * |                                                        Control de versiones                                                                       |
 * |---------|--------------|----------------|---------------------------------------------------------------------------------------------------------|
 * | Version |    Fecha     |  Responsable   |                                                  Comentarios                                            |
 * |---------|--------------|----------------|---------------------------------------------------------------------------------------------------------|
 * |   2.0   |  23/06/2016  |      GAOQ      | Creacion de la fabrica de logger.                                                                       |
 * |---------|--------------|----------------|---------------------------------------------------------------------------------------------------------|
 */



package com.gabyval.core.logger;

import com.gabyval.core.constants.GB_CommonStrConstants;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.LoggerFactory;

/**
 * This class create a new factory of GB_Logger, create a new instance of Log4j
 whit basic configuration.
 * This log work whit the pattern define in 
 com.ps.commons.constants.GB_CommonStrConstants.PATTERN_EXIT_LOG,
 the configuration for exit file in 
 com.ps.commons.constants.GB_CommonStrConstants.PAHT_EXIT_LOG_LOG4J and
 level ERROR by default.
 * @version 2.0
 * @since June 23th, 2016
 * @author Gustavo Ovalle
 */
public class GB_LoggerFactory implements LoggerFactory {
    
    /**
     * Create a new factory, whit the initial configuration.
     */
    public  GB_LoggerFactory() {
        //Logger.getRootLogger().addAppender(getAppender());
        //Logger.getRootLogger().setLevel(Level.DEBUG);
    }

    /**
     * Create a new instance of this logger.
     * @param name String name of a class that this logger it belogns.
     * @return Logger the new instance of Logger.
     */
    @Override
    public Logger makeNewLoggerInstance(String name) {
        return new GB_Logger(name);
    }
  
    /**
     * Put the header for file log.
     * @param f the file for write.
     */
    private void putHeaderLog(File f) {
        String header = "* *****************************************************************************************************************************************************\n"+
                        "* *******************************                                                                              ****************************************\n"+
                        "* *******************************  ********** ********** ******    **      ** **      ** ********** **         ****************************************\n"+
                        "* *******************************  ********** **********  ******   **      ** **      ** ********** **         ****************************************\n"+
                        "* *******************************  **         **      **  **  **   **      ** **      ** **      ** **         ****************************************\n"+
                        "* *******************************  **         **      **  ******    **    **  **      ** **      ** **         ****************************************\n"+
                        "* *******************************  **    **** **********  *******    **  **   **      ** ********** **         ****************************************\n"+
                        "* *******************************  **    **** **********  ********    ****    **      ** ********** **         ****************************************\n"+
                        "* *******************************  **      ** **      **  **   **      **       **  **   **      ** **         ****************************************\n"+
                        "* *******************************  ********** **      **  **  **       **        ****    **      ** ********** ****************************************\n"+
                        "* *******************************  ********** **      ** ******        **         **     **      ** ********** ****************************************\n"+
                        "* *****************************************************************************************************************************************************\n"+

                        "*******************************************************************************************************************************************************\n" +
                        "\tEnviroment execution properties for "+GB_CommonStrConstants.APP_NAME+"\n" +
                        "\tServer: "+System.getProperty("os.name")+" Version: "+System.getProperty("os.version")+"\n" +
                        "\tArch: "+System.getProperty("os.arch")+"\n" +
                        "\tJava version: "+System.getProperty("java.version")+"\n" +
                        "\tJava home: "+System.getProperty("java.home")+"\n" +
                        "\tInstalation path: "+System.getProperty("user.dir")+"\n" +
                        "*******************************************************************************************************************************************************\n" +
                        "\tStart the log event register, the start date: "+new Date().toString()+"\n" +
                        "*******************************************************************************************************************************************************\n";
        GB_IOLoggerController.wirtelog(f, header);
    }
}