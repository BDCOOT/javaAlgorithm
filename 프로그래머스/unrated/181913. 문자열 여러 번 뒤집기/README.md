# [level unrated] 문자열 여러 번 뒤집기 - 181913 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181913) 

### 성능 요약

메모리: 85.7 MB, 시간: 3.62 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2023년 12월 4일 17:18:56

### 문제 설명

<p style="user-select: auto !important;">문자열 <code style="user-select: auto !important;">my_string</code>과 이차원 정수 배열 <code style="user-select: auto !important;">queries</code>가 매개변수로 주어집니다. <code style="user-select: auto !important;">queries</code>의 원소는 [s, e] 형태로, <code style="user-select: auto !important;">my_string</code>의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. <code style="user-select: auto !important;">my_string</code>에 <code style="user-select: auto !important;">queries</code>의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><code style="user-select: auto !important;">my_string</code>은 영소문자로만 이루어져 있습니다.</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">my_string</code>의 길이 ≤ 1,000</li>
<li style="user-select: auto !important;"><code style="user-select: auto !important;">queries</code>의 원소는 [s, e]의 형태로 0 ≤ s ≤ e &lt; <code style="user-select: auto !important;">my_string</code>의 길이를 만족합니다.</li>
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">queries</code>의 길이 ≤ 1,000</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">my_string</th>
<th style="user-select: auto !important;">queries</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">"rermgorpsam"</td>
<td style="user-select: auto !important;">[[2, 3], [0, 7], [5, 9], [6, 10]]</td>
<td style="user-select: auto !important;">"programmers"</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><p style="user-select: auto !important;">예제 1번의 <code style="user-select: auto !important;">my_string</code>은 "rermgorpsam"이고 주어진 <code style="user-select: auto !important;">queries</code>를 순서대로 처리하면 다음과 같습니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">queries</th>
<th style="user-select: auto !important;">my_string</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;"></td>
<td style="user-select: auto !important;">"rermgorpsam"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[2, 3]</td>
<td style="user-select: auto !important;">"remrgorpsam"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[0, 7]</td>
<td style="user-select: auto !important;">"progrmersam"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[5, 9]</td>
<td style="user-select: auto !important;">"prograsremm"</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">[6, 10]</td>
<td style="user-select: auto !important;">"programmers"</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">따라서 "programmers"를 return 합니다.</p></li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges