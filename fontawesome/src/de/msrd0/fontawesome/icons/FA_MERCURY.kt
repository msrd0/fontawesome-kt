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

/** Mercury */
object FA_MERCURY: Icon {
	
	override val name get() = "Mercury"
	
	override val unicode get() = "f223"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M368 223.1c0-55.32-25.57-104.6-65.49-136.9c20.49-17.32 37.2-39.11 48.1-64.21c4.656-10.72-2.9-22.89-14.45-22.89h-54.31c-5.256 0-9.93 2.828-12.96 7.188C251.8 31.77 223.8 47.1 192 47.1c-31.85 0-59.78-16.23-76.88-40.81C112.1 2.828 107.4 0 102.2 0H47.84c-11.55 0-19.11 12.17-14.45 22.89C44.29 47.1 60.1 69.79 81.49 87.11C41.57 119.4 16 168.7 16 223.1c0 86.26 62.1 157.9 144 172.1V416H128c-8.836 0-16 7.164-16 16v32C112 472.8 119.2 480 128 480h32v16C160 504.8 167.2 512 176 512h32c8.838 0 16-7.164 16-16V480h32c8.838 0 16-7.164 16-16v-32c0-8.836-7.162-16-16-16h-32v-19.05C305.9 381.9 368 310.3 368 223.1zM192 320c-52.93 0-96-43.07-96-96c0-52.94 43.07-95.1 96-95.1c52.94 0 96 43.06 96 95.1C288 276.9 244.9 320 192 320z"/></svg>"""
		else -> null
	}
	
}
