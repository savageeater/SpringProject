package com.lhs.pension.dao;

import java.sql.SQLException;
import java.util.List;

import com.lhs.dto.RentPension;

public interface RentPensionIDao {
	// �ش�Ǵ� Ű�� �ڷ� ���翩��(�μ�Ʈ�ϰų� ����Ʈ, ������Ʈ�Ҷ� ��������) 
	public boolean isExist(K key) throws SQLException;//��
	// ���ο� �ڷḦ ��� �ִ� �۾��� �ϰ� �Է¿��� ���� 
	public boolean insert(T dto) throws SQLException;//��
	// �ش�Ű�� �ڷḦ �����ϰ� ����� ������ ���� 
	public int delete(K key) throws SQLException;//��
	// �ʿ� ����ִ� ������Ʈ ��ҵ��� ������Ʈ �ϰ� �װ���� ������ ���� 
	public int update(RentPension dto) 
			throws SQLException;//��
	// ��� �ڷḦ ��ü�� ����� List�� ��� ���� 
	public List<T> queryForList() throws SQLException;//��
	// key�� �ش��ϴ� �ڷ���� ��� List�� ��� ���� 
	public List<T> queryForList(K key) throws SQLException;
	// key�� �ش��ϴ� �ϳ��� �ڷḦ vo�� ���� 
	public T queryForObject(K key) throws SQLException;//��
	// ���� �ڷ�� �ľ� 
	public int getAllCount() throws SQLException;//��
	// �ø����ȣ �ڵ����� ���� ���� ��ϵ� �ִ밪�� �˾Ƴ��� 
	public int getMaxNo()  throws SQLException;//��
	// �������� �� �������� �з��� �ڷḸ �������� 
	public List<T> selectPart(int start,int end)  
			throws SQLException;//��
	// �ݹ� ������ ���������� ������ 
	public int getCurrval() throws SQLException;//��
	
	
	
	public List<RentPension> selectAll() throws SQLException;
	
	public int allcount() throws SQLException;
	
	public RentPension selectVo(int no) throws SQLException;
	
	public List<RentPension> selectKey(int key) throws SQLException;
}
