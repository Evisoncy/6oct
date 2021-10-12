/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar.arzapalo
 */
public class PDF_Generator {
    private static BaseColor verdeClaro = new BaseColor(197,255,99);
    private static BaseColor amarillo = new BaseColor(255,255,0);
    private static BaseColor rosadoClaro = new BaseColor(255,135,207);
    private static BaseColor rojo = new BaseColor(255,0,0);
    private static BaseColor guinda = new BaseColor(212,0,0);
    private static BaseColor hueso = new BaseColor(255,253,219);
    private static BaseColor blanco = new BaseColor(255,255,255);
    private static BaseColor negro = new BaseColor(0,0,0);
    
    private static final Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 26, Font.BOLDITALIC);
    private static final Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);          
    private static final Font categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font subcategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font texto = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL);    
    private static final Font titulo = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD);        
    private static final Font subtitulo = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLDITALIC); 
    private static final Font tittleBold = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD);
    private static final Font HeaderWhite = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD,blanco); 
    
    public static void GenerarActualizarApreciacionSituacion(String ruta, ActualizarApreciacion apreciacion) throws FileNotFoundException, DocumentException{
        if(true){
            FileOutputStream archivo = new FileOutputStream(ruta + ".pdf");
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            
            documento.open();

            //Titulo
            Paragraph parrafo = new Paragraph("Apreciación de situacion\n\n",tittleBold);
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            documento.add(new Paragraph("Unidad: "+apreciacion.encabezado.unidad+"\t"+"Lugar: "+apreciacion.encabezado.lugar+"\t"+"Fecha: "+apreciacion.encabezado.fecha+"\t"
                                    +"\n\n"+"Apreciacion de Situacion de "+ apreciacion.encabezado.refApreciacion,texto));
            
            //Area de interes
            documento.add(new Paragraph("a. Area de interés: \n\n",titulo));
            // Tabla de area de interes
            String[][] valores = new String[apreciacion.areaInteres.length][];
            for(int fila= 0; fila< apreciacion.areaInteres.length;fila++){
                valores[fila] = new String []{apreciacion.areaInteres[fila].factor,apreciacion.areaInteres[fila].descripcion};
            }
            documento.add(generarTabla(apreciacion.areaInteres,new int[]{100,200},new String[]{"Factor","Descrpcion"},valores));

            //Area de operaciones
            documento.add(new Paragraph("b. Caracteristicas del Area de Operaciones: \n\n",titulo));
            añadirSubTituloConContenido(documento,"Condiciones Meteorologicas",apreciacion.areaOperaciones.condicionesMetereologicas);
            añadirSubTituloConContenido(documento,"Terreno",apreciacion.areaOperaciones.terreno);
            añadirSubTituloConContenido(documento,"Otros hechos",apreciacion.areaOperaciones.otrosHechos);
            
            //Area de Fuerzas Enemigas
            documento.add(new Paragraph("c. Fuerzas enemigas: \n",titulo));
            documento.add(new Paragraph(apreciacion.fuerzasEnemigas,texto));
            
            
            //Area de Fuerzas Amigas
            documento.add(new Paragraph("d. Fuerzas amigas: \n\n",titulo));
            
            //Recursos Disponibles
            documento.add(new Paragraph("Recursos Disponibles"+": \n\n",subtitulo));
            valores = new String[apreciacion.fuerzasAmigas.recursosDisponibles.length][];
            for(int fila= 0; fila< apreciacion.fuerzasAmigas.recursosDisponibles.length;fila++){
                valores[fila] = new String []{apreciacion.fuerzasAmigas.recursosDisponibles[fila].recursos,apreciacion.fuerzasAmigas.recursosDisponibles[fila].condicionesActuales};
            }
            documento.add(generarTabla(apreciacion.fuerzasAmigas.recursosDisponibles,new int[]{75,225},new String[]{"Recursos","Codiciones Actuales"},valores));
            
            //Capcidad Disponible
            documento.add(new Paragraph("Capacidad DIsponible"+": \n\n",subtitulo));
            valores = new String[apreciacion.fuerzasAmigas.capacidadesDisponibles.length][];
            for(int fila= 0; fila< apreciacion.fuerzasAmigas.capacidadesDisponibles.length;fila++){
                valores[fila] = new String []{apreciacion.fuerzasAmigas.capacidadesDisponibles[fila]};
            }
            documento.add(generarTabla(apreciacion.fuerzasAmigas.capacidadesDisponibles,new int[]{300},new String[]{"Capacidad Disponible"},valores));
            
            
            //Recursos Adicionales
            documento.add(new Paragraph("Recursos Adicionales: \n\n",subtitulo));
            valores = new String[apreciacion.fuerzasAmigas.recursosAdiciones.length][];
            for(int fila= 0; fila< apreciacion.fuerzasAmigas.recursosAdiciones.length;fila++){
                valores[fila] = new String []{apreciacion.fuerzasAmigas.recursosAdiciones[fila].elonSup,apreciacion.fuerzasAmigas.recursosAdiciones[fila].unidadesVecinas,apreciacion.fuerzasAmigas.recursosAdiciones[fila].otros};
            }
            documento.add(generarTabla(apreciacion.fuerzasAmigas.recursosAdiciones,new int[]{100,100,100},new String[]{"Elon Superior","Unidades Vecinas", "Otros"},valores));
            
            //Necesidades vs Capacidades
            añadirSubTituloConContenido(documento,"Necesidades vs Capacidades",apreciacion.fuerzasAmigas.nececidadesCapacidades);
            
            //Consideraciones civiles
            documento.add(new Paragraph("e. Consideraciones civiles: \n\n",titulo));
            añadirSubTituloConContenido(documento,"Factores Públicos",apreciacion.consideracionesCiviles.factoresPublicos);
            añadirSubTituloConContenido(documento,"Factores Sociológicos",apreciacion.consideracionesCiviles.factoresSociologicos);
            añadirSubTituloConContenido(documento,"Infraestructura",apreciacion.consideracionesCiviles.factoresInfraestructura);
            añadirSubTituloConContenido(documento,"Factores Económicos",apreciacion.consideracionesCiviles.factoresEconomicos);
            añadirSubTituloConContenido(documento,"Factores Psicológicos",apreciacion.consideracionesCiviles.factoresPsicologicos);
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo pdf fue creado correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Llenar los campos");    
        }
    }
    
    public static void GenerarEvaluacionIncia(String ruta, ActualizarApreciacion apreciacion) throws FileNotFoundException, DocumentException{
        if(true){
            FileOutputStream archivo = new FileOutputStream(ruta + ".pdf");
            Document documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            
            documento.open();

            //Titulo
            Paragraph parrafo = new Paragraph("Apreción de situacion\n\n",tittleBold);
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            documento.add(new Paragraph("Unidad: "+apreciacion.encabezado.unidad+"\t"+"Lugar: "+apreciacion.encabezado.lugar+"\t"+"Fecha: "+apreciacion.encabezado.fecha+"\t"
                                    +"\n\n"+"Apreciacion de Situacion de "+ apreciacion.encabezado.refApreciacion,texto));
            
            //Area de interes
            documento.add(new Paragraph("a. Area de interés: \n\n",titulo));
            // Tabla de area de interes
            String[][] valores = new String[apreciacion.areaInteres.length][];
            for(int fila= 0; fila< apreciacion.areaInteres.length;fila++){
                valores[fila] = new String []{apreciacion.areaInteres[fila].factor,apreciacion.areaInteres[fila].descripcion};
            }
            documento.add(generarTabla(apreciacion.areaInteres,new int[]{100,200},new String[]{"Factor","Descrpcion"},valores));

            //Area de operaciones
            documento.add(new Paragraph("b. Caracteristicas del Area de Operaciones: \n\n",titulo));
            añadirSubTituloConContenido(documento,"Condiciones Meteorologicas",apreciacion.areaOperaciones.condicionesMetereologicas);
            añadirSubTituloConContenido(documento,"Terreno",apreciacion.areaOperaciones.terreno);
            añadirSubTituloConContenido(documento,"Otros hechos",apreciacion.areaOperaciones.otrosHechos);
            
            //Area de Fuerzas Enemigas
            documento.add(new Paragraph("c. Fuerzas enemigas: \n",titulo));
            documento.add(new Paragraph(apreciacion.fuerzasEnemigas,texto));
            
            
            //Area de Fuerzas Amigas
            documento.add(new Paragraph("d. Fuerzas amigas: \n\n",titulo));
            
            //Recursos Disponibles
            documento.add(new Paragraph("Recursos Disponibles"+": \n\n",subtitulo));
            valores = new String[apreciacion.fuerzasAmigas.recursosDisponibles.length][];
            for(int fila= 0; fila< apreciacion.fuerzasAmigas.recursosDisponibles.length;fila++){
                valores[fila] = new String []{apreciacion.fuerzasAmigas.recursosDisponibles[fila].recursos,apreciacion.fuerzasAmigas.recursosDisponibles[fila].condicionesActuales};
            }
            documento.add(generarTabla(apreciacion.fuerzasAmigas.recursosDisponibles,new int[]{75,225},new String[]{"Recursos","Codiciones Actuales"},valores));
            
            //Capcidad Disponible
            documento.add(new Paragraph("Capacidad DIsponible"+": \n\n",subtitulo));
            valores = new String[apreciacion.fuerzasAmigas.capacidadesDisponibles.length][];
            for(int fila= 0; fila< apreciacion.fuerzasAmigas.capacidadesDisponibles.length;fila++){
                valores[fila] = new String []{apreciacion.fuerzasAmigas.capacidadesDisponibles[fila]};
            }
            documento.add(generarTabla(apreciacion.fuerzasAmigas.capacidadesDisponibles,new int[]{300},new String[]{"Capacidad Disponible"},valores));
            
            
            //Recursos Adicionales
            documento.add(new Paragraph("Recursos Adicionales: \n\n",subtitulo));
            valores = new String[apreciacion.fuerzasAmigas.recursosAdiciones.length][];
            for(int fila= 0; fila< apreciacion.fuerzasAmigas.recursosAdiciones.length;fila++){
                valores[fila] = new String []{apreciacion.fuerzasAmigas.recursosAdiciones[fila].elonSup,apreciacion.fuerzasAmigas.recursosAdiciones[fila].unidadesVecinas,apreciacion.fuerzasAmigas.recursosAdiciones[fila].otros};
            }
            documento.add(generarTabla(apreciacion.fuerzasAmigas.recursosAdiciones,new int[]{100,100,100},new String[]{"Elon Superior","Unidades Vecinas", "Otros"},valores));
            
            //Necesidades vs Capacidades
            añadirSubTituloConContenido(documento,"Necesidades vs Capacidades",apreciacion.fuerzasAmigas.nececidadesCapacidades);
            
            //Concideraciones civiles
            documento.add(new Paragraph("e. Consideraciones civiles: \n\n",titulo));
            añadirSubTituloConContenido(documento,"Factores Públicos",apreciacion.consideracionesCiviles.factoresPublicos);
            añadirSubTituloConContenido(documento,"Factores Sociológicos",apreciacion.consideracionesCiviles.factoresSociologicos);
            añadirSubTituloConContenido(documento,"Infraestructura",apreciacion.consideracionesCiviles.factoresInfraestructura);
            añadirSubTituloConContenido(documento,"Factores Económicos",apreciacion.consideracionesCiviles.factoresEconomicos);
            añadirSubTituloConContenido(documento,"Factores Psicológicos",apreciacion.consideracionesCiviles.factoresPsicologicos);
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo pdf fue creado correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Llenar los campos");    
        }
    }
    public static void añadirSubTituloConContenido(Document documento, String Subtitulo, String Contenido) throws DocumentException{
            documento.add(new Paragraph(Subtitulo+": \n",subtitulo));
            documento.add(new Paragraph(Contenido+"\n\n",texto));
    }
    
    public static PdfPTable generarTabla(Object[] entidad,int[] anchoCeldas,String[] atributosName, String[]... fieldsInstances) throws DocumentException{
               
        //Obtenindo el numero de columnas y filas 
        Integer numCol = atributosName.length;
        System.out.println(numCol);
        Integer numRows = entidad.length;
        
        //Generando campos de la tabla
        PdfPTable tabla = new PdfPTable(numCol);
        
        //Lista de campos de la cabecera
        ArrayList<String> campos =  new ArrayList<>();
        for(String atributo: atributosName){
            campos.add(atributo);
        }
        PdfPCell columnHeader;              
        
        for (int column = 0; column < numCol; column++) {            
            columnHeader = new PdfPCell(new Phrase(campos.get(column),HeaderWhite));
            columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
            columnHeader.setVerticalAlignment(Element.ALIGN_MIDDLE);
            columnHeader.setBackgroundColor(negro);
            tabla.addCell(columnHeader);
        }tabla.setWidths(anchoCeldas);
        tabla.setHeaderRows(1);
        //
        PdfPCell cellContent;           
        for (int row = 0; row < numRows; row++) {
            for (int column = 0; column < numCol; column++) {
                cellContent = new PdfPCell(new Phrase(fieldsInstances[row][column],texto));
                cellContent.setVerticalAlignment(Element.ALIGN_LEFT);
                tabla.addCell(cellContent);
            }
        }
        return tabla;
         
        
    }
    
//    public static void GenerarDetTareas(String ruta, DetTareas tareas) throws FileNotFoundException, DocumentException{
//    //Area de interes
//        if(true){
//            FileOutputStream archivo = new FileOutputStream(ruta + ".pdf");
//            Document documento = new Document();
//            PdfWriter.getInstance(documento, archivo);
//            
//            documento.open();
//
//            //Titulo
//            Paragraph parrafo = new Paragraph("Determinacion de tareas\n\n",tittleBold);
//            parrafo.setAlignment(1);
//            documento.add(parrafo);
//            documento.add(new Paragraph("a. Tareas \n\n",titulo));
//            // Tabla de area de interes
//            String[][] valores = new String[tareas.areaInteres.length][];
//            for(int fila= 0; fila< apreciacion.areaInteres.length;fila++){
//                valores[fila] = new String []{apreciacion.areaInteres[fila].factor,apreciacion.areaInteres[fila].descripcion};
//            }
//            documento.add(generarTabla(apreciacion.areaInteres,new int[]{100,200},new String[]{"Factor","Descrpcion"},valores));
//        }
//        else{
//            
//        }
//    }    
}
    

