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

object FA_ALTERNATE_CAR: Icon {
	
	override val name get() = "Alternate Car"
	
	override val unicode get() = "f5de"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 480 512"><path d="M438.66 212.33l-11.24-28.1-19.93-49.83C390.38 91.63 349.57 64 303.5 64h-127c-46.06 0-86.88 27.63-103.99 70.4l-19.93 49.83-11.24 28.1C17.22 221.5 0 244.66 0 272v48c0 16.12 6.16 30.67 16 41.93V416c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32v-32h256v32c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32v-54.07c9.84-11.25 16-25.8 16-41.93v-48c0-27.34-17.22-50.5-41.34-59.67zm-306.73-54.16c7.29-18.22 24.94-30.17 44.57-30.17h127c19.63 0 37.28 11.95 44.57 30.17L368 208H112l19.93-49.83zM80 319.8c-19.2 0-32-12.76-32-31.9S60.8 256 80 256s48 28.71 48 47.85-28.8 15.95-48 15.95zm320 0c-19.2 0-48 3.19-48-15.95S380.8 256 400 256s32 12.76 32 31.9-12.8 31.9-32 31.9z"/></svg>"""
		else -> null
	}
	
}
