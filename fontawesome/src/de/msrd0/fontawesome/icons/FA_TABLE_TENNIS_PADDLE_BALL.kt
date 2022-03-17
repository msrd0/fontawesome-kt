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

/** Table tennis paddle ball */
object FA_TABLE_TENNIS_PADDLE_BALL: Icon {
	
	override val name get() = "Table tennis paddle ball"
	
	override val unicode get() = "f45d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M416 287.1c27.99 0 53.68 9.254 74.76 24.51c14.03-29.82 21.06-62.13 21.06-94.43c0-103.1-79.37-218.1-216.5-218.1c-59.94 0-120.4 23.71-165.5 68.95l-54.66 54.8C73.61 125.3 72.58 126.1 71.14 128.5l230.7 230.7C322.8 317.2 365.8 287.1 416 287.1zM290.3 392.1l-238.6-238.6C38.74 176.2 32.3 199.4 32.3 221.9c0 30.53 11.71 59.94 34.29 82.58l36.6 36.7l-92.38 81.32c-7.177 6.255-10.81 15.02-10.81 23.81c0 8.027 3.032 16.07 9.164 22.24l34.05 34.2c6.145 6.16 14.16 9.205 22.15 9.205c8.749 0 17.47-3.649 23.7-10.86l81.03-92.85l35.95 36.04c23.62 23.68 54.41 35.23 85.37 35.23c4.532 0 9.205-.2677 13.72-.7597c-10.56-18.61-17.12-39.89-17.12-62.81C288 408.1 288.1 400.5 290.3 392.1zM415.1 320c-52.99 0-95.99 42.1-95.99 95.1c0 52.1 42.99 95.99 95.99 95.99c52.1 0 95.99-42.1 95.99-95.99C511.1 363 468.1 320 415.1 320z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_TABLE_TENNIS_PADDLE_BALL]. */
val FA_PING_PONG_PADDLE_BALL = FA_TABLE_TENNIS_PADDLE_BALL

/** Alias for [FA_TABLE_TENNIS_PADDLE_BALL]. */
val FA_TABLE_TENNIS = FA_TABLE_TENNIS_PADDLE_BALL
