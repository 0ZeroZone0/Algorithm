current_time = list(map(int, input().split(":")))
start_time = list(map(int, input().split(":")))

current_sec = current_time[0]*3600 + current_time[1]*60 + current_time[2]

start_sec = start_time[0]*3600 + start_time[1]*60 + start_time[2]

sub_time = start_sec - current_sec

if sub_time < 0:
  sub_time += 24 * 3600

print(f"{sub_time//3600:02d}:{(sub_time%3600)//60:02d}:{sub_time%60:02d}")