/**
 ****************************************************************************************************
 * @file        main.c
 * @author      ����ԭ���Ŷ�(ALIENTEK)
 * @version     V1.0
 * @date        2022-4-20
 * @brief       �ڴ���� ʵ��
 * @license     Copyright (c) 2020-2032, ������������ӿƼ����޹�˾
 ****************************************************************************************************
 * @attention
 *
 * ʵ��ƽ̨:����ԭ�� ������ F429������
 * ������Ƶ:www.yuanzige.com
 * ������̳:www.openedv.com
 * ��˾��ַ:www.alientek.com
 * �����ַ:openedv.taobao.com
 *
 ****************************************************************************************************
 */

#include "./SYSTEM/sys/sys.h"
#include "./SYSTEM/usart/usart.h"
#include "./SYSTEM/delay/delay.h"
#include "./BSP/LED/led.h"
#include "./BSP/LCD/lcd.h"
#include "./BSP/KEY/key.h"
#include "./BSP/SDRAM/sdram.h"
#include "./MALLOC/malloc.h"
#include "freertos_demo.h"

const char *SRAM_NAME_BUF[SRAMBANK] = {" SRAMIN  ", " SRAMCCM ", " SRAMEX  "};

int main(void)
{
    HAL_Init();                                 /* ��ʼ��HAL�� */
    sys_stm32_clock_init(360, 25, 2, 8);        /* ����ʱ��,180Mhz */
    delay_init(180);                            /* ��ʱ��ʼ�� */
    usart_init(115200);                         /* ���ڳ�ʼ��Ϊ115200 */
    led_init();                                 /* ��ʼ��LED */
    key_init();                                 /* ��ʼ������ */
    sdram_init();                               /* SRAM��ʼ�� */
    lcd_init();                                 /* ��ʼ��LCD */

    my_mem_init(SRAMIN);                        /* ��ʼ���ڲ��ڴ�� */
    my_mem_init(SRAMEX);                        /* ��ʼ���ⲿ�ڴ�� */
    my_mem_init(SRAMCCM);                       /* ��ʼ��CCM�ڴ�� */
    
    lcd_show_string(30,  50, 200, 16, 16, "STM32", RED);
    lcd_show_string(30,  70, 200, 16, 16, "MALLOC TEST", RED);
    lcd_show_string(30,  90, 200, 16, 16, "ATOM@ALIENTEK", RED);
    lcd_show_string(30, 110, 200, 16, 16, "KEY0:Malloc & WR & Show", RED);
    lcd_show_string(30, 130, 200, 16, 16, "KEY_UP:SRAMx KEY1:Free", RED);
    lcd_show_string(60, 160, 200, 16, 16, " SRAMIN ", BLUE);
    lcd_show_string(30, 176, 200, 16, 16, "SRAMIN   USED:", BLUE);
    lcd_show_string(30, 192, 200, 16, 16, "SRAMCCM  USED:", BLUE);
    lcd_show_string(30, 208, 200, 16, 16, "SRAMEX   USED:", BLUE);
    
    freertos_demo();
}
