# [level unrated] 배열 조각하기 - 181893 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181893) 

### 성능 요약

메모리: 75.1 MB, 시간: 0.06 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 1월 3일 18:27:19

### 문제 설명

<p style="user-select: auto !important;">정수 배열 <code style="user-select: auto !important;">arr</code>와 <code style="user-select: auto !important;">query</code>가 주어집니다.</p>

<p style="user-select: auto !important;"><code style="user-select: auto !important;">query</code>를 순회하면서 다음 작업을 반복합니다.</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">짝수 인덱스에서는 <code style="user-select: auto !important;">arr</code>에서 <code style="user-select: auto !important;">query[i]</code>번 인덱스를 제외하고 배열의 <code style="user-select: auto !important;">query[i]</code>번 인덱스 뒷부분을 잘라서 버립니다.</li>
<li style="user-select: auto !important;">홀수 인덱스에서는 <code style="user-select: auto !important;">arr</code>에서 <code style="user-select: auto !important;">query[i]</code>번 인덱스는 제외하고 배열의 <code style="user-select: auto !important;">query[i]</code>번 인덱스 앞부분을 잘라서 버립니다.</li>
</ul>

<p style="user-select: auto !important;">위 작업을 마친 후 남은 <code style="user-select: auto !important;">arr</code>의 부분 배열을 return 하는 solution 함수를 완성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">5 ≤ <code style="user-select: auto !important;">arr</code>의 길이 ≤ 100,000

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">0 ≤ <code style="user-select: auto !important;">arr</code>의 원소 ≤ 100</li>
</ul></li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">query</code>의 길이 &lt; min(50, <code style="user-select: auto !important;">arr</code>의 길이 / 2)

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">query</code>의 각 원소는 0보다 크거나 같고 남아있는 <code style="user-select: auto !important;">arr</code>의 길이 보다 작습니다.</li>
</ul></li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">arr</th>
<th style="user-select: auto !important;">query</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[0, 1, 2, 3, 4, 5]</td>
<td style="user-select: auto !important;">[4, 1, 2]</td>
<td style="user-select: auto !important;">[1, 2, 3]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">이번에 매번 처리할 <code style="user-select: auto !important;">query</code>의 값과 처리 전후의 <code style="user-select: auto !important;">arr</code>의 상태를 표로 나타내면 다음과 같습니다.</li>
</ul>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">query의 값</th>
<th style="user-select: auto !important;">query 처리 전</th>
<th style="user-select: auto !important;">query 처리 후</th>
<th style="user-select: auto !important;">비고</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">[0, 1, 2, 3, 4, 5]</td>
<td style="user-select: auto !important;">[0, 1, 2, 3, 4]</td>
<td style="user-select: auto !important;">0번 인덱스의 쿼리이므로 뒷부분을 자른다.</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">[0, 1, 2, 3, 4]</td>
<td style="user-select: auto !important;">[1, 2, 3, 4]</td>
<td style="user-select: auto !important;">1번 인덱스의 쿼리이므로 앞부분을 자른다.</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">[1, 2, 3, 4]</td>
<td style="user-select: auto !important;">[1, 2, 3]</td>
<td style="user-select: auto !important;">2번 인덱스의 쿼리이므로 뒷부분을 자른다.</td>
</tr>
</tbody>
      </table>
<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">따라서 [1, 2, 3]을 return 합니다.</li>
</ul>

<hr style="user-select: auto !important;">

<p style="user-select: auto !important;">※2023년 04월 24일 지문과 테스트 케이스가 수정되었습니다. 기존에 제출한 코드가 통과하지 못할 수 있습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges