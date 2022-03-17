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

object FA_TOWER_BROADCAST: Icon {
	
	override val name get() = "Tower broadcast"
	
	override val unicode get() = "f519"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M160.9 59.01C149.3 52.6 134.7 56.76 128.3 68.39C117.6 87.6 112 109.4 112 131.4c0 19.03 4.031 37.44 11.98 54.62c4.047 8.777 12.73 13.93 21.8 13.93c3.375 0 6.797-.7187 10.05-2.219C167.9 192.2 173.1 177.1 167.5 165.9C162.5 155.1 160 143.5 160 131.4c0-13.93 3.547-27.69 10.25-39.81C176.7 80.04 172.5 65.42 160.9 59.01zM62.61 2.363C46.17-4.32 27.58 3.676 20.95 20.02C7.047 54.36 0 90.69 0 127.1C0 165.3 7.047 201.7 20.95 236C25.98 248.5 37.97 256 50.63 256C54.61 256 58.69 255.3 62.61 253.7C79 247 86.91 228.4 80.27 212C69.47 185.3 64 157.1 64 128c0-29.06 5.469-57.3 16.27-83.99C86.91 27.64 79 8.988 62.61 2.363zM555 20.02c-6.609-16.41-25.23-24.31-41.66-17.66c-16.39 6.625-24.3 25.28-17.66 41.65C506.5 70.7 512 98.95 512 128c0 29.06-5.469 57.31-16.27 83.1C489.1 228.4 497 247 513.4 253.7C517.3 255.3 521.4 256 525.4 256c12.66 0 24.64-7.562 29.67-20C568.1 201.7 576 165.3 576 127.1C576 90.69 568.1 54.36 555 20.02zM420.2 58.23c-12.03 5.562-17.28 19.81-11.72 31.84C413.5 100.9 416 112.5 416 124.6c0 13.94-3.547 27.69-10.25 39.81c-6.422 11.59-2.219 26.22 9.375 32.62c3.688 2.031 7.672 3 11.61 3c8.438 0 16.64-4.47 21.02-12.37C458.4 168.4 464 146.6 464 124.6c0-19.03-4.031-37.43-11.98-54.62C446.5 57.89 432.1 52.7 420.2 58.23zM301.8 65.45C260.5 56.78 224 88.13 224 128c0 23.63 12.95 44.04 32 55.12v296.9c0 17.67 14.33 32 32 32s32-14.33 32-32V183.1c23.25-13.54 37.42-40.96 30.03-71.18C344.4 88.91 325 70.31 301.8 65.45z"/></svg>"""
		else -> null
	}
	
}

val FA_BROADCAST_TOWER = FA_TOWER_BROADCAST
