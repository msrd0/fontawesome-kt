/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** Fire Burner */
object FA_FIRE_BURNER: Icon {
	
	override val name get() = "Fire Burner"
	
	override val unicode get() = "e4f1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M349 61.49C356.9 51.61 365.8 40.76 375.5 31.99C381.1 26.87 389.9 26.89 395.5 32.03C420.2 54.71 441.1 84.69 455.8 113.2C470.4 141.2 480 169.9 480 190.1C480 277.9 408.7 352 320 352C230.3 352 160 277.8 160 190.1C160 163.7 172.7 131.5 192.4 99.52C212.4 67.16 240.5 33.43 273.8 3.734C279.4-1.26 287.1-1.242 293.5 3.773C313.3 21.55 331.8 40.74 349 61.49V61.49zM390 176.1C388 172.1 386 168.1 383 164.1L347 206.1C347 206.1 289 132.1 285 127.1C255 164.1 240 185.1 240 209.1C240 258.1 276 287.1 320.1 287.1C339 287.1 355 282.1 370 272.1C400 251.1 408 209.1 390 176.1zM32 287.1C32 270.3 46.33 255.1 64 255.1H96C113.7 255.1 128 270.3 128 287.1C128 305.7 113.7 319.1 96 319.1V384H544V319.1C526.3 319.1 512 305.7 512 287.1C512 270.3 526.3 255.1 544 255.1H576C593.7 255.1 608 270.3 608 287.1V384C625.7 384 640 398.3 640 416V480C640 497.7 625.7 512 608 512H32C14.33 512 0 497.7 0 480V416C0 398.3 14.33 384 32 384V287.1zM320 480C337.7 480 352 465.7 352 448C352 430.3 337.7 416 320 416C302.3 416 288 430.3 288 448C288 465.7 302.3 480 320 480zM448 416C430.3 416 416 430.3 416 448C416 465.7 430.3 480 448 480C465.7 480 480 465.7 480 448C480 430.3 465.7 416 448 416zM192 480C209.7 480 224 465.7 224 448C224 430.3 209.7 416 192 416C174.3 416 160 430.3 160 448C160 465.7 174.3 480 192 480z"/></svg>"""
		else -> null
	}
	
}
