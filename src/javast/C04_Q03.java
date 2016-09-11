package javast;

import java.io.NotActiveException;

class NoThisSoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoThisSoundException() {
		super();
	}

	public NoThisSoundException(String id) {
		super(id);
	}
}

class Player {
	public Player() {
	}

	public void Play(int index) throws NotActiveException {
		if (index > 10) {
			throw new NotActiveException("错误！！！曲目数大于10");
		} else {
			System.out.println("当前播放第" + index + "首歌");
		}
	}
}

public class C04_Q03 {

	public static void main(String[] args) {
		try {
			Player P1 = new Player();
			System.out.println("准备就绪");
			P1.Play(3);
		} catch (NotActiveException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		try {
			Player P1 = new Player();
			System.out.println("准备就绪");
			P1.Play(14);
		} catch (NotActiveException e) {
			System.out.println(e.getMessage());
		}
	}

}
