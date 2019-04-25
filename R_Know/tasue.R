head(tasue)

str(tasue)

names(tasue)=c("PickupStation", "PickupTime", 
"ReturnStation", "ReturnTime")

install.packages("lubridate")

library(lubridate)

names(tasue)=c("PickupStation","PickupTime","Ret
urnStation","ReturnTime")

tasue$PickupTime=date(tasue$PickupTime)

tasue$ReturnTime=date(tasue$ReturnTime)

str(tasue)

install.packages("dplyr")

library(dplyr)

Tase %>%
  group_by(PickupTime)
  %>%
  summarize(n = n())
