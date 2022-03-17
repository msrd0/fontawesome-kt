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

object FA_OTTER: Icon {
	
	override val name get() = "Otter"
	
	override val unicode get() = "f700"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M224 160c8.836 0 16-7.164 16-16C240 135.2 232.8 128 224 128S208 135.2 208 144C208 152.8 215.2 160 224 160zM96 128C87.16 128 80 135.2 80 144C80 152.8 87.16 160 96 160s16-7.164 16-16C112 135.2 104.8 128 96 128zM474.4 64.12C466.8 63.07 460 69.07 460 76.73c0 5.959 4.188 10.1 9.991 12.36C514.2 99.46 544 160 544 192v112c0 8.844-7.156 16-16 16S512 312.8 512 304V212c0-14.87-15.65-24.54-28.94-17.89c-28.96 14.48-47.83 42.99-50.51 74.88C403.7 285.6 384 316.3 384 352v32H224c17.67 0 32-14.33 32-32c0-17.67-14.33-32-32-32H132.4c-14.46 0-27.37-9.598-31.08-23.57C97.86 283.5 96 269.1 96 256V254.4C101.1 255.3 106.3 256 111.7 256c10.78 0 21.45-2.189 31.36-6.436L160 242.3l16.98 7.271C186.9 253.8 197.6 256 208.3 256c7.176 0 14.11-.9277 20.83-2.426C241.7 292 277.4 320 320 320l36.56-.0366C363.1 294.7 377.1 272.7 396.2 256H320c0-25.73 17.56-31.61 32.31-32C369.8 223.8 384 209.6 384 192c0-17.67-14.31-32-32-32c-15.09 0-32.99 4.086-49.28 13.06C303.3 168.9 304 164.7 304 160.3v-16c0-1.684-.4238-3.248-.4961-4.912C313.2 133.9 320 123.9 320 112C320 103.2 312.8 96 304 96H292.7C274.6 58.26 236.3 32 191.7 32H128.3C83.68 32 45.44 58.26 27.33 96H16C7.164 96 0 103.2 0 112c0 11.93 6.816 21.93 16.5 27.43C16.42 141.1 16 142.7 16 144.3v16c0 19.56 5.926 37.71 16 52.86V256c0 123.7 100.3 224 224 224h160c123.9-1.166 224-101.1 224-226.2C639.9 156.9 567.8 76.96 474.4 64.12zM64 160.3v-16C64 108.9 92.86 80 128.3 80h63.32C227.1 80 256 108.9 256 144.3v16C256 186.6 234.6 208 208.3 208c-4.309 0-8.502-.8608-12.46-2.558L162.1 191.4c2.586-.3066 5.207-.543 7.598-1.631l8.314-3.777C186.9 182.3 192 174.9 192 166.7V160c0-6.723-5.996-12.17-13.39-12.17H141.4C133.1 147.8 128 153.3 128 160v6.701c0 8.15 5.068 15.6 13.09 19.25l8.314 3.777c2.391 1.088 5.012 1.324 7.598 1.631l-32.88 14.08C120.2 207.1 115.1 208 111.7 208C85.38 208 64 186.6 64 160.3z"/></svg>"""
		else -> null
	}
	
}
