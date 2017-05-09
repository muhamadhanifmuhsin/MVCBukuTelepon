/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukutelepon.dao;

import bukutelepon.model.ModelBukuTelepon;
import java.util.List;

/**
 *
 * @author bpptk
 */
public interface ImplementModelBukuTelepon {
    
    public void insert(ModelBukuTelepon b);
    public void update(ModelBukuTelepon b);
    public void delete (int id);
    public List<ModelBukuTelepon>getALL();
    public List<ModelBukuTelepon>getCariNama(String nama);

   
    
}
