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

object FA_HIPPO: Icon {
	
	override val name get() = "Hippo"
	
	override val unicode get() = "f6ed"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M581.12 96.2c-27.67-.15-52.5 17.58-76.6 26.62C489.98 88.27 455.83 64 416 64c-11.28 0-21.95 2.3-32 5.88V56c0-13.26-10.75-24-24-24h-16c-13.25 0-24 10.74-24 24v48.98C286.01 79.58 241.24 64 192 64 85.96 64 0 135.64 0 224v240c0 8.84 7.16 16 16 16h64c8.84 0 16-7.16 16-16v-70.79C128.35 407.57 166.72 416 208 416s79.65-8.43 112-22.79V464c0 8.84 7.16 16 16 16h64c8.84 0 16-7.16 16-16V288h128v32c0 8.84 7.16 16 16 16h32c8.84 0 16-7.16 16-16v-32c17.67 0 32-14.33 32-32v-92.02c0-34.09-24.79-67.59-58.88-67.78zM448 176c-8.84 0-16-7.16-16-16s7.16-16 16-16 16 7.16 16 16-7.16 16-16 16z"/></svg>"""
		else -> null
	}
	
}
