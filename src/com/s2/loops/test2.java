package com.s2.loops;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력받음 1.로그인 2.종료

		System.out.println("1.로그인 2.종료");

		int exeInput = sc.nextInt();

		if (exeInput == 1) {
			// 1.로그인
			// id, pw 입력받음

			int id = 123;
			int pw = 456;

			int success = 0;

			while (success == 0) {
				System.out.println("아이디를 쳐주세요");

				int yid = sc.nextInt();

				System.out.println("비밀번호를 쳐주세요");

				int ypw = sc.nextInt();

				if (id == yid) {
					// id 동일

					if (pw == ypw) {

						success = 1;
						break;
					} else {
						// pw 오류 출력
						System.out.println("패스워드를 확인하세요");
					}
				} else {
					// id 오류 출력
					System.out.println("아이디를 확인하세요");
				}
			} // while 종료

			// ------------- 게임 진행 파트------------
			// 1.로그인 성골 했을 때 진행
			// 레벨은 1로 시작
			// 초기 GOLDㄴㄴ 0
			// 5렙 달성시 1000GOLD 지급
			// 10렙 달성시 2000GOLD 지급
			// 15렙 달성시 3000GOLD 지급
			// 모든 몬스터의 경험치는 동일
			// 레벨 1 -> 2로 갈때 3마리 레벨업마다 축 레벨업
			// 레벨 2 -> 3로 갈때 6마리
			// 레벨 3 -> 4갈때는 12마리
			// 레벨 14-> 15갈때는 42마리
			// 만렙달성 축하 , 현재 GOLD 출력

			int level = 1;
			int gold = 0;
			int MonsterKill = 0;

			int fullLevelFlag = 0;

			System.out.print("현재 레벨 : ");
			System.out.println(level);

			while (fullLevelFlag == 0) {

				MonsterKill++;

				System.out.print("잡은 몬스터수 : ");
				System.out.println(MonsterKill);

				if (MonsterKill == (3 * level)) {
					
					MonsterKill = 0; // 몬스터 잡은수 초기화처리

					// 레벨업
					level++;

			System.out.println("레벨업 현재 레벨 : " + level + "레벨업을 축하합니다");

					// Gold처리
					// 1->5 1000원
					// 9->10 3000원
					if (level == 5) {
						gold += 1000;
					} else if (level == 10) {
						gold += 2000;
					} else if (level == 15) {
						gold += 3000;
					}
				}

				// 만랩
				if (level == 15) {
					fullLevelFlag = 1;
					break;
				}
			} // while 종료
				// 만렙달성 축하 , 현재 GOLD 출력

			System.out.print("만렙달성 축하, 현재 GOLD : ");
			System.out.println(gold);

		} else if (exeInput == 2) {
			// 2.종료
			System.out.print("프로그램을 종료합니다.");

		}
	}
}
