# kotlin-minesweeper

## Step1 지뢰 찾기(그리기)
- [x] : 높이와 넓이를 입력받아 보드에 입력한다.
- [x] : 지뢰 개수를 받아 지뢰를 임의로 생성한다.
- [x] : 지뢰를 출력한다.

## Step2 지뢰 찾기(지뢰 개수)
- [x] : 각 셀에 표시할 숫자는 자신을 제외한 주변 8개 셀에 포함된 지뢰의 개수이다.

## Step3 지뢰 찾기(게임 실행)
- [x] : 게임을 실행하면 특정 좌표의 칸을 열 수 있도록 한다.
- [x] : 칸을 열었을 때 지뢰이면 게임에서 진다.
- [x] : 모든 칸을 여는데 성공하면 게임에서 이긴다.
- [x] : 처음에는 보드가 모두 닫힌 칸이다.
- [x] : 지뢰가 없는 인접한 칸이 모두 열린다.

## Step4 지뢰 찾기(리팩터링) - TDD로 다시 새로 구현
- [x] : 비어있거나 지뢰가 있는 셀을 만든다.
- [x] : 높이와 너비를 가진 보드에 좌표를 키로, 셀을 값으로 가지는 맵을 이용해서 보드를 만든다.
- [x] : 지뢰 개수를 받아서 보드에 랜덤으로 지뢰가 있는 셀을 담는다.
- [x] : 셀은 처음에 모두 닫혀있다.
- [x] : 좌표를 입력 받아 빈 셀을 열면 셀은 주변 8개 셀의 지뢰 개수의 합을 가진다.
- [x] : 이미 열려있거나 지뢰가 있는 셀은 열 수 없다.
- [x] : 셀을 열었을 때 주변 지뢰 개수의 합이 0이면, 주변 셀을 열고 이 과정을 반복한다.
- [x] : 셀을 열 때 마다 변경된 보드를 출력한다.
- [x] : 지뢰를 열면 게임에서 졌다는 문구를 출력한다.
- [x] : 지뢰를 제외 한 모든 셀을 열면 게임에서 이겼다는 문구를 출력한다.
