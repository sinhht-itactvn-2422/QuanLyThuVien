/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.DAO;
import Model.Books;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author VietNguyen
 */
public class DAOBooks {
    //--------------Dao thêm Sách
    public boolean themSach(Books sach)
            throws Exception{
                String sql = "INSERT INTO [dbo].[SACH]([MaSach], [TenSach], [TheLoai])" + " VALUES(?, ?, ?)";
                try (
                        Connection con = DAO.getConnection();
                        PreparedStatement pstmt = con.prepareStatement(sql);    
                    ){
                    pstmt.setString(1, sach.getMaSach());
                    pstmt.setString(2, sach.getTenSach());
                    pstmt.setString(3, sach.getTheLoai());
                    return pstmt.executeUpdate()>0;
            }
        }
    //-----------------------------Sửa Sách
    public boolean suaSach(Books sach)
            throws Exception{
                String sql = "UPDATE dbo.SACH" + " SET TenSach = ?, TheLoai = ?" + " WHERE MaSach = ?";
                try (
                        Connection con = DAO.getConnection();
                        PreparedStatement pstmt = con.prepareStatement(sql);    
                    ){
                    pstmt.setString(3, sach.getMaSach());
                    pstmt.setString(1, sach.getTenSach());
                    pstmt.setString(2, sach.getTheLoai());
                    return pstmt.executeUpdate()>0;
            }
        }
    //-------------------------Xóa Sách
    public boolean xoaSach(String MaSach)
            throws Exception{
                String sql = "DELETE FROM dbo.SACH" + " WHERE MaSach = ?";
                try (
                        Connection con = DAO.getConnection();
                        PreparedStatement pstmt = con.prepareStatement(sql);    
                    ){
                    pstmt.setString(1, MaSach);
                    return pstmt.executeUpdate()>0;
            }
        }
    
    //-------------------------Tìm kiếm Sách
    public Books timSach(String tenSach)
            throws Exception{
                String sql = "SELECT * FROM dbo.SACH" + " WHERE TenSach = ?";
                try (
                        Connection con = DAO.getConnection();
                        PreparedStatement pstmt = con.prepareStatement(sql);    
                    ){
                    pstmt.setString(1, tenSach);
                    try(ResultSet rs = pstmt.executeQuery();){
                        if(rs.next()){
                            Books sach = new Books();
                            sach.setMaSach(rs.getString("MaSach"));
                            sach.setTenSach(rs.getString("TenSach"));
                            sach.setTheLoai(rs.getString("TheLoai"));
                            return sach;
                        }
                    }
                    return null;        
            }
        }
}

