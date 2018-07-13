alter table if
exists public.task
add column created timestamp;

alter table if
exists public.task
add column deadline timestamp;