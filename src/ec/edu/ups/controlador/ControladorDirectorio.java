/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juanc
 */
public class ControladorDirectorio {
    private File archivo;
    private File[] archivos;

    public ControladorDirectorio() {
    }
    public void crear(String ruta, String nombre) {
        archivo = new File(ruta + File.separator + nombre);
        archivo.mkdir();

    }

    public void renombrar(String ruta, String nomActual, String nuevoNom) {
        archivo = new File(ruta + File.separator + nomActual);
        File nuevo = new File(ruta + File.separator + nuevoNom);
        archivo.renameTo(nuevo);

    }

    public void eliminar(String ruta, String eliminar) throws IOException {
        archivo = new File(ruta + File.separator + eliminar);
        if (archivo.isDirectory()) {
            archivos = archivo.listFiles();

            for (File a : archivos) {
                if (a.isDirectory()) {
                    eliminarDirectorios(a);
                } else {
                    a.delete();
                }
            }
            archivo.delete();

        } else {
            archivo.delete();
        }

    }

    public void eliminarDirectorios(File ruta) {
        File[] files = ruta.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                eliminarDirectorios(file);
            } else {
                file.delete();
            }
        }
        ruta.delete();
    }
    public boolean validaRuta(String ruta) {
        archivo = new File(ruta);
        return archivo.exists();
    }

    public boolean validarArchivo(String ruta, String nombre) {
        archivo = new File(ruta + File.separator + nombre);
        return archivo.exists();

    }

    public List<String> listarDirectorios(String ruta) {
        List<String> lista = new ArrayList<>();
        lista.clear();
        archivo = new File(ruta);
        archivos = archivo.listFiles();

        for (File elemento : archivos) {
            if (!elemento.isHidden()) {
                lista.add(elemento.getName());
            }

        }
        return lista;
    }

    public List<String> listarArchivosOcultos(String ruta) {
        List<String> lista = new ArrayList<>();
        lista.clear();
        archivo = new File(ruta);
        archivos = archivo.listFiles();

        for (File elemento : archivos) {
            if (elemento.isFile()&& elemento.isHidden()) {
                lista.add(elemento.getName());
            }

        }
        for (File elemento : archivos) {
            if (elemento.isDirectory()) {
                File[] dOcultos = elemento.listFiles();
                for (File subElemento : dOcultos) {
                    if (subElemento.isFile() && subElemento.isHidden()  ) {
                        lista.add(subElemento.getName());

                    }
                }

            }
        }
        return lista;
    }
   public List<String> Listar(String ruta, String nombre) {
        archivo = new File(ruta + File.separator + nombre);
        archivos = archivo.listFiles();
        List<String> lista = new ArrayList<>();
        for (File a : archivos) {
            lista.add(a.getName());

        }
        return lista;
    }

    public String retornaRuta(String ruta, String nombre) {
        archivo = new File(ruta + File.separator + nombre);
        return archivo.getAbsolutePath();
    }
    public List<String> listarDirectoriosOcultos(String ruta) {
        List<String> lista = new ArrayList<>();
        lista.clear();
        archivo = new File(ruta);
        archivos = archivo.listFiles();

        for (File elemento : archivos) {
            if (elemento.isHidden() && elemento.isDirectory()) {
                lista.add(elemento.getName());
            }

        }
        return lista;
    }

    public String mostrarInformacion(String nombre, String ruta) {
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        String informacion = "Informacion "+"\n";

        for (File elemento : archivos) {
            if (elemento.getName().equals(nombre)) {
                String path = "Path: ";
                path = path + " "+elemento.getAbsolutePath();
                informacion = informacion+("\n");
                informacion = informacion+" "+ ruta+"\n";
                informacion = informacion+" "+path;

                String tamaño = "Tamaño";
                long bytes = elemento.length();
                bytes = (bytes) / (1024);
                String cad = String.valueOf(bytes);
                cad = cad+""+("Kb");
                tamaño = tamaño+""+cad;
                informacion = informacion+"\n";
                informacion = informacion+tamaño;

               
                String lectura = "Permisos de lectura: ";
                if (elemento.canRead()) {
                    lectura = lectura+" "+"Abierto";

                } else {
                    lectura = lectura+" "+("Cerrado");

                }
                informacion = informacion+""+("\n");
                informacion = informacion+""+lectura;

                String escritura = "Permisos de escritura";
                if (elemento.canWrite()) {
                    escritura = escritura+""+"Abierto";

                } else {
                    escritura = escritura+""+"Cerrado";

                }
                informacion = informacion+""+"\n";
                informacion = informacion+""+escritura;

                long lastModified = elemento.lastModified();

                String patter = "yyy-MM-dd hh:mm ss";
                SimpleDateFormat formato = new SimpleDateFormat(patter);

                String lastModifiedDate = formato.format(lastModified);
                 
                String fecha = "Ultima modificacion: ";
                fecha = fecha+" "+lastModifiedDate;
                informacion = informacion+""+"\n";
                informacion = informacion+""+fecha;

            }

        }
        return informacion;
    }

    

    

}
