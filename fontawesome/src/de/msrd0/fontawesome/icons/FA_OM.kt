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

object FA_OM: Icon {
	
	override val name get() = "Om"
	
	override val unicode get() = "f679"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M360.6 61C362.5 62.88 365.2 64 368 64s5.375-1.125 7.375-3l21.5-21.62C398.9 37.38 400 34.75 400 32s-1.125-5.375-3.125-7.375L375.4 3c-4.125-4-10.75-4-14.75 0L339 24.62C337 26.62 336 29.25 336 32s1 5.375 3 7.375L360.6 61zM412.1 191.1c-26.75 0-51.75 10.38-70.63 29.25l-24.25 24.25c-6.75 6.75-15.75 10.5-25.37 10.5H245c10.5-22.12 14.12-48.12 7.75-75.25C242.6 138.2 206.4 104.6 163.2 97.62c-36.25-6-71 5-96 28.75c-7.375 7-7 18.87 1.125 24.87L94.5 170.9c5.75 4.375 13.62 4.375 19.12-.125C122.1 163.8 132.8 159.1 144 159.1c26.38 0 48 21.5 48 48S170.4 255.9 143.1 255.9L112 255.1c-11.88 0-19.75 12.63-14.38 23.25L113.8 311.5C116.2 316.5 121.4 319.5 126.9 320H160c35.25 0 64 28.75 64 64s-28.75 64-64 64c-96.12 0-122.4-53.1-145.2-92C10.25 348.4 0 352.4 0 361.2C-.125 416 41.12 512 160 512c70.5 0 127.1-57.44 127.1-128.1c0-23.38-6.874-45.06-17.87-63.94h21.75c26.62 0 51.75-10.38 70.63-29.25l24.25-24.25c6.75-6.75 15.75-10.5 25.37-10.5C431.9 255.1 448 272.1 448 291.9V392c0 13.25-18.75 24-32 24c-39.38 0-66.75-24.25-81.88-42.88C329.4 367.2 320 370.6 320 378.1V416c0 0 0 64 96 64c48.5 0 96-39.5 96-88V291.9C512 236.8 467.3 191.1 412.1 191.1zM454.3 67.25c-85.5 65.13-169 2.751-172.5 .125c-6-4.625-14.5-4.375-20.13 .5C255.9 72.75 254.3 81 257.9 87.63C259.5 90.63 298.2 160 376.8 160c79.88 0 98.75-31.38 101.8-37.63C479.5 120.2 480 117.9 480 115.5V80C480 66.75 464.9 59.25 454.3 67.25z"/></svg>"""
		else -> null
	}
	
}
