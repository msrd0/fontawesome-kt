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

object FA_USERS_GEAR: Icon {
	
	override val name get() = "Users gear"
	
	override val unicode get() = "f509"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M512 160c44.18 0 80-35.82 80-80S556.2 0 512 0c-44.18 0-80 35.82-80 80S467.8 160 512 160zM128 160c44.18 0 80-35.82 80-80S172.2 0 128 0C83.82 0 48 35.82 48 80S83.82 160 128 160zM319.9 320c57.41 0 103.1-46.56 103.1-104c0-57.44-46.54-104-103.1-104c-57.41 0-103.1 46.56-103.1 104C215.9 273.4 262.5 320 319.9 320zM368 400c0-16.69 3.398-32.46 8.619-47.36C374.3 352.5 372.2 352 369.9 352H270.1C191.6 352 128 411.7 128 485.3C128 500.1 140.7 512 156.4 512h266.1C389.5 485.6 368 445.5 368 400zM183.9 216c0-5.449 .9824-10.63 1.609-15.91C174.6 194.1 162.6 192 149.9 192H88.08C39.44 192 0 233.8 0 285.3C0 295.6 7.887 304 17.62 304h199.5C196.7 280.2 183.9 249.7 183.9 216zM551.9 192h-61.84c-12.8 0-24.88 3.037-35.86 8.24C454.8 205.5 455.8 210.6 455.8 216c0 21.47-5.625 41.38-14.65 59.34C462.2 263.4 486.1 256 512 256c42.48 0 80.27 18.74 106.6 48h3.756C632.1 304 640 295.6 640 285.3C640 233.8 600.6 192 551.9 192zM618.1 366.7c-5.025-16.01-13.59-30.62-24.75-42.71c-1.674-1.861-4.467-2.326-6.699-1.023l-19.17 11.07c-8.096-6.887-17.4-12.28-27.45-15.82V295.1c0-2.514-1.861-4.746-4.281-5.213c-16.56-3.723-33.5-3.629-49.32 0C484.9 291.2 483.1 293.5 483.1 295.1v22.24c-10.05 3.537-19.36 8.932-27.45 15.82l-19.26-11.07c-2.139-1.303-4.932-.8379-6.697 1.023c-11.17 12.1-19.73 26.71-24.66 42.71c-.7441 2.512 .2793 5.117 2.42 6.326l19.17 11.17c-1.859 10.42-1.859 21.21 0 31.64l-19.17 11.17c-2.234 1.209-3.164 3.816-2.42 6.328c4.932 16.01 13.49 30.52 24.66 42.71c1.766 1.863 4.467 2.328 6.697 1.025l19.26-11.07c8.094 6.887 17.4 12.28 27.45 15.82v22.24c0 2.514 1.77 4.746 4.188 5.211c16.66 3.723 33.5 3.629 49.32 0c2.42-.4648 4.281-2.697 4.281-5.211v-22.24c10.05-3.535 19.36-8.932 27.45-15.82l19.17 11.07c2.141 1.303 5.025 .8379 6.699-1.025c11.17-12.1 19.73-26.7 24.75-42.71c.7441-2.512-.2773-5.119-2.512-6.328l-19.17-11.17c1.953-10.42 1.953-21.22 0-31.64l19.17-11.17C618.7 371.8 619.7 369.2 618.1 366.7zM512 432c-17.67 0-32-14.33-32-32c0-17.67 14.33-32 32-32s32 14.33 32 32C544 417.7 529.7 432 512 432z"/></svg>"""
		else -> null
	}
	
}

val FA_USERS_COG = FA_USERS_GEAR
