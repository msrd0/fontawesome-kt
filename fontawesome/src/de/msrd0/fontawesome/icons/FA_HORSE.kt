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

object FA_HORSE: Icon {
	
	override val name get() = "Horse"
	
	override val unicode get() = "f6f0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M575.9 76.61c0-8.125-3.05-15.84-8.55-21.84c-3.875-4-8.595-9.125-13.72-14.5c11.12-6.75 19.47-17.51 22.22-30.63c.9999-5-2.849-9.641-7.974-9.641L447.9 0c-70.62 0-127.9 57.25-127.9 128L159.1 128c-28.87 0-54.38 12.1-72 33.12L87.1 160C39.5 160 .0001 199.5 .0001 248L0 304c0 8.875 7.125 15.1 15.1 15.1L31.1 320c8.874 0 15.1-7.125 15.1-16l.0005-56c0-13.25 6.884-24.4 16.76-31.65c-.125 2.5-.758 5.024-.758 7.649c0 27.62 11.87 52.37 30.5 69.87l-25.65 68.61c-4.586 12.28-5.312 25.68-2.128 38.4l21.73 86.89C92.02 502 104.8 512 119.5 512h32.98c20.81 0 36.08-19.55 31.05-39.74L162.2 386.9l23.78-63.61l133.1 22.34L319.1 480c0 17.67 14.33 32 31.1 32h31.1c17.67 0 31.1-14.33 31.1-32l.0166-161.8C435.7 297.1 447.1 270.5 447.1 240c0-.25-.1025-.3828-.1025-.6328V136.9L463.9 144l18.95 37.72c7.481 14.86 25.08 21.55 40.52 15.34l32.54-13.05c12.13-4.878 20.11-16.67 20.09-29.74L575.9 76.61zM511.9 96c-8.75 0-15.1-7.125-15.1-16S503.1 64 511.9 64c8.874 0 15.1 7.125 15.1 16S520.8 96 511.9 96z"/></svg>"""
		else -> null
	}
	
}
