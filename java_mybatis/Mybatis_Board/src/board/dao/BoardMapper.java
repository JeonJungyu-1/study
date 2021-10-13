package board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import board.vo.BoardVO;
import board.vo.MemberVO;
import board.vo.ReplyVO;

public interface BoardMapper {
	//ȸ������
	public int join(MemberVO vo);
	//id�� ȸ������ �˻�
	public MemberVO getId(String id);
	//��й�ȣ Ȯ��
	public MemberVO getPassword(HashMap<String, String> map);
	//�۾���
	public int write(BoardVO bvo);
	//�۸��
	public ArrayList<BoardVO> list();
	//���б��Ҷ� ��ȸ�� 1 ����
	public void readupdate(int num);
	//���б�
	public BoardVO read(int num);
	//�˻�
	public ArrayList<BoardVO> search(HashMap<String, Object> map);
	//����
	public int update(BoardVO vo);
	//����
	public int delete(BoardVO vo);
	//��� �б�
	public ArrayList<ReplyVO> replyRead(int num);

}
