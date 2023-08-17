def convert_hour(hour, minute, period):
  if period == 'pm' and int(hour) != 12:
    hour = int(hour) + 12
  elif period == 'am' and hour == 12:
    hour = 0
  return str(hour).zfill(2) + str(minute).zfill(2)

print(convert_hour('12', '0', 'am')) 